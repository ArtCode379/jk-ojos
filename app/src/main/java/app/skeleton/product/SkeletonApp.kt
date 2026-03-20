package shop.jkojosmotors.app

import android.app.Application
import shop.jkojosmotors.app.di.dataModule
import shop.jkojosmotors.app.di.dispatcherModule
import shop.jkojosmotors.app.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class JOJSAApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@JOJSAApp)
            modules(appModules)
        }
    }
}