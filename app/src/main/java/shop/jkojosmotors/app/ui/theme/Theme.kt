package shop.jkojosmotors.app.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val JOJSAColorScheme = darkColorScheme(
    primary = DeepRed,
    onPrimary = Color.White,
    primaryContainer = DeepRed,
    onPrimaryContainer = Color.White,
    secondary = DarkSlate,
    onSecondary = Color.White,
    secondaryContainer = DarkSlate,
    onSecondaryContainer = OffWhite,
    tertiary = MutedGray,
    onTertiary = Color.White,
    background = DarkNavy,
    onBackground = OffWhite,
    surface = DarkSurface,
    onSurface = OffWhite,
    surfaceVariant = DarkSlate,
    onSurfaceVariant = MutedGray,
    outline = MutedGray,
    error = LightRed,
    onError = Color.White,
)

@Composable
fun JOJSATheme(
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = DarkNavy.toArgb()
            window.navigationBarColor = DarkNavy.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = JOJSAColorScheme,
        typography = Typography,
        content = content
    )
}
