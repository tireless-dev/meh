package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TXT: ImageVector
    get() {
        val current = _tXT
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TXT",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="21.0 11.0 24.0 11.0 24.0 23.0 26.0 23.0 26.0 11.0 29.0 11.0 29.0 9.0 21.0 9.0 21.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 11
                moveTo(x = 21.0f, y = 11.0f)
                // L 24 11
                lineTo(x = 24.0f, y = 11.0f)
                // L 24 23
                lineTo(x = 24.0f, y = 23.0f)
                // L 26 23
                lineTo(x = 26.0f, y = 23.0f)
                // L 26 11
                lineTo(x = 26.0f, y = 11.0f)
                // L 29 11
                lineTo(x = 29.0f, y = 11.0f)
                // L 29 9
                lineTo(x = 29.0f, y = 9.0f)
                // L 21 9
                lineTo(x = 21.0f, y = 9.0f)
                // L 21 11z
                lineTo(x = 21.0f, y = 11.0f)
                close()
            }
            // <polygon points="20.0 9.0 18.0 9.0 16.0 15.0 14.0 9.0 12.0 9.0 14.75 16.0 12.0 23.0 14.0 23.0 16.0 17.0 18.0 23.0 20.0 23.0 17.25 16.0 20.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // L 18 9
                lineTo(x = 18.0f, y = 9.0f)
                // L 16 15
                lineTo(x = 16.0f, y = 15.0f)
                // L 14 9
                lineTo(x = 14.0f, y = 9.0f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 14.75 16
                lineTo(x = 14.75f, y = 16.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // L 16 17
                lineTo(x = 16.0f, y = 17.0f)
                // L 18 23
                lineTo(x = 18.0f, y = 23.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 17.25 16
                lineTo(x = 17.25f, y = 16.0f)
                // L 20 9z
                lineTo(x = 20.0f, y = 9.0f)
                close()
            }
            // <polygon points="3.0 11.0 6.0 11.0 6.0 23.0 8.0 23.0 8.0 11.0 11.0 11.0 11.0 9.0 3.0 9.0 3.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // L 6 11
                lineTo(x = 6.0f, y = 11.0f)
                // L 6 23
                lineTo(x = 6.0f, y = 23.0f)
                // L 8 23
                lineTo(x = 8.0f, y = 23.0f)
                // L 8 11
                lineTo(x = 8.0f, y = 11.0f)
                // L 11 11
                lineTo(x = 11.0f, y = 11.0f)
                // L 11 9
                lineTo(x = 11.0f, y = 9.0f)
                // L 3 9
                lineTo(x = 3.0f, y = 9.0f)
                // L 3 11z
                lineTo(x = 3.0f, y = 11.0f)
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
        }.build().also { _tXT = it }
    }

@Suppress("ObjectPropertyName")
private var _tXT: ImageVector? = null
