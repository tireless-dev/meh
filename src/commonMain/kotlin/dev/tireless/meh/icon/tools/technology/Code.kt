package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Code: ImageVector
    get() {
        val current = _code
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Code",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="31.0 16.0 24.0 23.0 22.59 21.59 28.17 16.0 22.59 10.41 24.0 9.0 31.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 16
                moveTo(x = 31.0f, y = 16.0f)
                // L 24 23
                lineTo(x = 24.0f, y = 23.0f)
                // L 22.59 21.59
                lineTo(x = 22.59f, y = 21.59f)
                // L 28.17 16
                lineTo(x = 28.17f, y = 16.0f)
                // L 22.59 10.41
                lineTo(x = 22.59f, y = 10.41f)
                // L 24 9
                lineTo(x = 24.0f, y = 9.0f)
                // L 31 16z
                lineTo(x = 31.0f, y = 16.0f)
                close()
            }
            // <polygon points="1.0 16.0 8.0 9.0 9.41 10.41 3.83 16.0 9.41 21.59 8.0 23.0 1.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 1 16
                moveTo(x = 1.0f, y = 16.0f)
                // L 8 9
                lineTo(x = 8.0f, y = 9.0f)
                // L 9.41 10.41
                lineTo(x = 9.41f, y = 10.41f)
                // L 3.83 16
                lineTo(x = 3.83f, y = 16.0f)
                // L 9.41 21.59
                lineTo(x = 9.41f, y = 21.59f)
                // L 8 23
                lineTo(x = 8.0f, y = 23.0f)
                // L 1 16z
                lineTo(x = 1.0f, y = 16.0f)
                close()
            }
            // <rect width="20" height="2" x="5.91" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.419624 25.48351
                moveTo(x = 12.419624f, y = 25.48351f)
                // l 5.176379 -19.318518
                lineToRelative(dx = 5.176379f, dy = -19.318518f)
                // l 1.9318517 0.5176379
                lineToRelative(dx = 1.9318517f, dy = 0.5176379f)
                // l -5.176379 19.318518z
                lineToRelative(dx = -5.176379f, dy = 19.318518f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // l -1.3987644E-6 -32
                lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
                // l 32 -1.3987644E-6
                lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 32z
                lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
                close()
            }
        }.build().also { _code = it }
    }

@Suppress("ObjectPropertyName")
private var _code: ImageVector? = null
