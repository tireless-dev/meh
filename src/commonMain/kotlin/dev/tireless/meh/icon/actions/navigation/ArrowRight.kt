package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRight: ImageVector
    get() {
        val current = _arrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArrowRight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="18.0 6.0 16.57 7.393 24.15 15.0 4.0 15.0 4.0 17.0 24.15 17.0 16.57 24.573 18.0 26.0 28.0 16.0 18.0 6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // L 16.57 7.393
                lineTo(x = 16.57f, y = 7.393f)
                // L 24.15 15
                lineTo(x = 24.15f, y = 15.0f)
                // L 4 15
                lineTo(x = 4.0f, y = 15.0f)
                // L 4 17
                lineTo(x = 4.0f, y = 17.0f)
                // L 24.15 17
                lineTo(x = 24.15f, y = 17.0f)
                // L 16.57 24.573
                lineTo(x = 16.57f, y = 24.573f)
                // L 18 26
                lineTo(x = 18.0f, y = 26.0f)
                // L 28 16
                lineTo(x = 28.0f, y = 16.0f)
                // L 18 6z
                lineTo(x = 18.0f, y = 6.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _arrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRight: ImageVector? = null
