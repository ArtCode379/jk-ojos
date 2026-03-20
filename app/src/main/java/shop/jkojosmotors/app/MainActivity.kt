package shop.jkojosmotors.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import shop.jkojosmotors.app.ui.composable.approot.AppRoot
import shop.jkojosmotors.app.ui.theme.ProductAppJOJSATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductAppJOJSATheme {
                AppRoot()
            }
        }
    }
}