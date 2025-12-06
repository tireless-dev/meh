package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextSubscript: ImageVector
    get() {
        val current = _textSubscript
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextSubscript",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="26.0 25.0 20.0 25.0 20.0 19.0 24.0 19.0 24.0 17.0 20.0 17.0 20.0 15.0 26.0 15.0 26.0 21.0 22.0 21.0 22.0 23.0 26.0 23.0 26.0 25.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 25
                moveTo(x = 26.0f, y = 25.0f)
                // L 20 25
                lineTo(x = 20.0f, y = 25.0f)
                // L 20 19
                lineTo(x = 20.0f, y = 19.0f)
                // L 24 19
                lineTo(x = 24.0f, y = 19.0f)
                // L 24 17
                lineTo(x = 24.0f, y = 17.0f)
                // L 20 17
                lineTo(x = 20.0f, y = 17.0f)
                // L 20 15
                lineTo(x = 20.0f, y = 15.0f)
                // L 26 15
                lineTo(x = 26.0f, y = 15.0f)
                // L 26 21
                lineTo(x = 26.0f, y = 21.0f)
                // L 22 21
                lineTo(x = 22.0f, y = 21.0f)
                // L 22 23
                lineTo(x = 22.0f, y = 23.0f)
                // L 26 23
                lineTo(x = 26.0f, y = 23.0f)
                // L 26 25z
                lineTo(x = 26.0f, y = 25.0f)
                close()
            }
            // <polygon points="5.0 7.0 5.0 9.0 12.0 9.0 12.0 25.0 14.0 25.0 14.0 9.0 21.0 9.0 21.0 7.0 5.0 7.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 7
                moveTo(x = 5.0f, y = 7.0f)
                // L 5 9
                lineTo(x = 5.0f, y = 9.0f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 12 25
                lineTo(x = 12.0f, y = 25.0f)
                // L 14 25
                lineTo(x = 14.0f, y = 25.0f)
                // L 14 9
                lineTo(x = 14.0f, y = 9.0f)
                // L 21 9
                lineTo(x = 21.0f, y = 9.0f)
                // L 21 7
                lineTo(x = 21.0f, y = 7.0f)
                // L 5 7z
                lineTo(x = 5.0f, y = 7.0f)
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
        }.build().also { _textSubscript = it }
    }

@Suppress("ObjectPropertyName")
private var _textSubscript: ImageVector? = null
