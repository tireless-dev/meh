package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextSuperscript: ImageVector
    get() {
        val current = _textSuperscript
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextSuperscript",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="29.0 17.0 23.0 17.0 23.0 11.0 27.0 11.0 27.0 9.0 23.0 9.0 23.0 7.0 29.0 7.0 29.0 13.0 25.0 13.0 25.0 15.0 29.0 15.0 29.0 17.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 17
                moveTo(x = 29.0f, y = 17.0f)
                // L 23 17
                lineTo(x = 23.0f, y = 17.0f)
                // L 23 11
                lineTo(x = 23.0f, y = 11.0f)
                // L 27 11
                lineTo(x = 27.0f, y = 11.0f)
                // L 27 9
                lineTo(x = 27.0f, y = 9.0f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // L 23 7
                lineTo(x = 23.0f, y = 7.0f)
                // L 29 7
                lineTo(x = 29.0f, y = 7.0f)
                // L 29 13
                lineTo(x = 29.0f, y = 13.0f)
                // L 25 13
                lineTo(x = 25.0f, y = 13.0f)
                // L 25 15
                lineTo(x = 25.0f, y = 15.0f)
                // L 29 15
                lineTo(x = 29.0f, y = 15.0f)
                // L 29 17z
                lineTo(x = 29.0f, y = 17.0f)
                close()
            }
            // <polygon points="4.0 7.0 4.0 9.0 11.0 9.0 11.0 25.0 13.0 25.0 13.0 9.0 20.0 9.0 20.0 7.0 4.0 7.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 7
                moveTo(x = 4.0f, y = 7.0f)
                // L 4 9
                lineTo(x = 4.0f, y = 9.0f)
                // L 11 9
                lineTo(x = 11.0f, y = 9.0f)
                // L 11 25
                lineTo(x = 11.0f, y = 25.0f)
                // L 13 25
                lineTo(x = 13.0f, y = 25.0f)
                // L 13 9
                lineTo(x = 13.0f, y = 9.0f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // L 20 7
                lineTo(x = 20.0f, y = 7.0f)
                // L 4 7z
                lineTo(x = 4.0f, y = 7.0f)
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
        }.build().also { _textSuperscript = it }
    }

@Suppress("ObjectPropertyName")
private var _textSuperscript: ImageVector? = null
