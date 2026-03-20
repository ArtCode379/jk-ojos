package shop.jkojosmotors.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

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
fun ProductAppJOJSATheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = JOJSAColorScheme,
        typography = Typography,
        content = content
    )
}
