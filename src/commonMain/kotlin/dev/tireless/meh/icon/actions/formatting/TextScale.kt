package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextScale: ImageVector
    get() {
        val current = _textScale
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextScale",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 5.0 30.0 8.0 22.0 8.0 22.0 26.0 19.0 26.0 19.0 8.0 11.0 8.0 11.0 5.0 30.0 5.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 5
                moveTo(x = 30.0f, y = 5.0f)
                // L 30 8
                lineTo(x = 30.0f, y = 8.0f)
                // L 22 8
                lineTo(x = 22.0f, y = 8.0f)
                // L 22 26
                lineTo(x = 22.0f, y = 26.0f)
                // L 19 26
                lineTo(x = 19.0f, y = 26.0f)
                // L 19 8
                lineTo(x = 19.0f, y = 8.0f)
                // L 11 8
                lineTo(x = 11.0f, y = 8.0f)
                // L 11 5
                lineTo(x = 11.0f, y = 5.0f)
                // L 30 5z
                lineTo(x = 30.0f, y = 5.0f)
                close()
            }
            // <polygon points="7.0 26.0 7.0 14.0 2.0 14.0 2.0 12.0 14.0 12.0 14.0 14.0 9.0 14.0 9.0 26.0 7.0 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 26
                moveTo(x = 7.0f, y = 26.0f)
                // L 7 14
                lineTo(x = 7.0f, y = 14.0f)
                // L 2 14
                lineTo(x = 2.0f, y = 14.0f)
                // L 2 12
                lineTo(x = 2.0f, y = 12.0f)
                // L 14 12
                lineTo(x = 14.0f, y = 12.0f)
                // L 14 14
                lineTo(x = 14.0f, y = 14.0f)
                // L 9 14
                lineTo(x = 9.0f, y = 14.0f)
                // L 9 26
                lineTo(x = 9.0f, y = 26.0f)
                // L 7 26z
                lineTo(x = 7.0f, y = 26.0f)
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
        }.build().also { _textScale = it }
    }

@Suppress("ObjectPropertyName")
private var _textScale: ImageVector? = null
