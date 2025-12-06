package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextAllCaps: ImageVector
    get() {
        val current = _textAllCaps
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextAllCaps",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="1.0 8.0 1.0 10.0 7.0 10.0 7.0 24.0 9.0 24.0 9.0 10.0 15.0 10.0 15.0 8.0 1.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 1 8
                moveTo(x = 1.0f, y = 8.0f)
                // L 1 10
                lineTo(x = 1.0f, y = 10.0f)
                // L 7 10
                lineTo(x = 7.0f, y = 10.0f)
                // L 7 24
                lineTo(x = 7.0f, y = 24.0f)
                // L 9 24
                lineTo(x = 9.0f, y = 24.0f)
                // L 9 10
                lineTo(x = 9.0f, y = 10.0f)
                // L 15 10
                lineTo(x = 15.0f, y = 10.0f)
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // L 1 8z
                lineTo(x = 1.0f, y = 8.0f)
                close()
            }
            // <polygon points="17.0 8.0 17.0 10.0 23.0 10.0 23.0 24.0 25.0 24.0 25.0 10.0 31.0 10.0 31.0 8.0 17.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 8
                moveTo(x = 17.0f, y = 8.0f)
                // L 17 10
                lineTo(x = 17.0f, y = 10.0f)
                // L 23 10
                lineTo(x = 23.0f, y = 10.0f)
                // L 23 24
                lineTo(x = 23.0f, y = 24.0f)
                // L 25 24
                lineTo(x = 25.0f, y = 24.0f)
                // L 25 10
                lineTo(x = 25.0f, y = 10.0f)
                // L 31 10
                lineTo(x = 31.0f, y = 10.0f)
                // L 31 8
                lineTo(x = 31.0f, y = 8.0f)
                // L 17 8z
                lineTo(x = 17.0f, y = 8.0f)
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
        }.build().also { _textAllCaps = it }
    }

@Suppress("ObjectPropertyName")
private var _textAllCaps: ImageVector? = null
