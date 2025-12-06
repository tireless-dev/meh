package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowLeft: ImageVector
    get() {
        val current = _arrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArrowLeft",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="14.0 26.0 15.41 24.59 7.83 17.0 28.0 17.0 28.0 15.0 7.83 15.0 15.41 7.41 14.0 6.0 4.0 16.0 14.0 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 26
                moveTo(x = 14.0f, y = 26.0f)
                // L 15.41 24.59
                lineTo(x = 15.41f, y = 24.59f)
                // L 7.83 17
                lineTo(x = 7.83f, y = 17.0f)
                // L 28 17
                lineTo(x = 28.0f, y = 17.0f)
                // L 28 15
                lineTo(x = 28.0f, y = 15.0f)
                // L 7.83 15
                lineTo(x = 7.83f, y = 15.0f)
                // L 15.41 7.41
                lineTo(x = 15.41f, y = 7.41f)
                // L 14 6
                lineTo(x = 14.0f, y = 6.0f)
                // L 4 16
                lineTo(x = 4.0f, y = 16.0f)
                // L 14 26z
                lineTo(x = 14.0f, y = 26.0f)
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
        }.build().also { _arrowLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowLeft: ImageVector? = null
