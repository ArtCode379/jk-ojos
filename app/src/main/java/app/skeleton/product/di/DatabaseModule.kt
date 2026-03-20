package shop.jkojosmotors.app.di

import androidx.room.Room
import shop.jkojosmotors.app.data.database.JOJSADatabase
import org.koin.dsl.module

private const val DB_NAME = "skeleton_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = JOJSADatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<JOJSADatabase>().cartItemDao() }

    single { get<JOJSADatabase>().orderDao() }
}