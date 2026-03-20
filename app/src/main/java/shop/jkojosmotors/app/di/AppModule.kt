package shop.jkojosmotors.app.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import shop.jkojosmotors.app.data.dao.CartItemDao
import shop.jkojosmotors.app.data.dao.OrderDao
import shop.jkojosmotors.app.data.database.JOJSADatabase
import shop.jkojosmotors.app.data.datastore.OnboardingDataStoreManager
import shop.jkojosmotors.app.data.repository.CartRepository
import shop.jkojosmotors.app.data.repository.OnboardingRepository
import shop.jkojosmotors.app.data.repository.OrderRepository
import shop.jkojosmotors.app.data.repository.ProductRepository
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IoDispatcher

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): JOJSADatabase {
        return Room.databaseBuilder(
            context,
            JOJSADatabase::class.java,
            "jojsa_db"
        ).build()
    }

    @Provides
    fun provideCartItemDao(database: JOJSADatabase): CartItemDao {
        return database.cartItemDao()
    }

    @Provides
    fun provideOrderDao(database: JOJSADatabase): OrderDao {
        return database.orderDao()
    }

    @Provides
    @IoDispatcher
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Singleton
    fun provideOnboardingDataStoreManager(@ApplicationContext context: Context): OnboardingDataStoreManager {
        return OnboardingDataStoreManager(context)
    }

    @Provides
    @Singleton
    fun provideProductRepository(): ProductRepository {
        return ProductRepository()
    }

    @Provides
    @Singleton
    fun provideCartRepository(
        cartItemDao: CartItemDao,
        @IoDispatcher dispatcher: CoroutineDispatcher,
    ): CartRepository {
        return CartRepository(cartItemDao, dispatcher)
    }

    @Provides
    @Singleton
    fun provideOrderRepository(
        orderDao: OrderDao,
        @IoDispatcher dispatcher: CoroutineDispatcher,
    ): OrderRepository {
        return OrderRepository(orderDao, dispatcher)
    }

    @Provides
    @Singleton
    fun provideOnboardingRepository(
        onboardingDataStoreManager: OnboardingDataStoreManager,
        @IoDispatcher dispatcher: CoroutineDispatcher,
    ): OnboardingRepository {
        return OnboardingRepository(onboardingDataStoreManager, dispatcher)
    }
}
