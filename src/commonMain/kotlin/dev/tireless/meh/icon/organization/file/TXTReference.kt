package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TXTReference: ImageVector
    get() {
        val current = _tXTReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TXTReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 8.586 22
                lineTo(x = 8.586f, y = 22.0f)
                // L 2 28.586
                lineTo(x = 2.0f, y = 28.586f)
                // L 3.414 30
                lineTo(x = 3.414f, y = 30.0f)
                // L 10 23.414
                lineTo(x = 10.0f, y = 23.414f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 4 20z
                lineTo(x = 4.0f, y = 20.0f)
                close()
            }
            // <polygon points="21.0 4.0 24.0 4.0 24.0 16.0 26.0 16.0 26.0 4.0 29.0 4.0 29.0 2.0 21.0 2.0 21.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 24 16
                lineTo(x = 24.0f, y = 16.0f)
                // L 26 16
                lineTo(x = 26.0f, y = 16.0f)
                // L 26 4
                lineTo(x = 26.0f, y = 4.0f)
                // L 29 4
                lineTo(x = 29.0f, y = 4.0f)
                // L 29 2
                lineTo(x = 29.0f, y = 2.0f)
                // L 21 2
                lineTo(x = 21.0f, y = 2.0f)
                // L 21 4z
                lineTo(x = 21.0f, y = 4.0f)
                close()
            }
            // <polygon points="20.0 2.0 18.0 2.0 16.0 8.0 14.0 2.0 12.0 2.0 14.752 9.0 12.0 16.0 14.0 16.0 16.0 10.0 18.0 16.0 20.0 16.0 17.245 9.0 20.0 2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 2
                moveTo(x = 20.0f, y = 2.0f)
                // L 18 2
                lineTo(x = 18.0f, y = 2.0f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // L 14 2
                lineTo(x = 14.0f, y = 2.0f)
                // L 12 2
                lineTo(x = 12.0f, y = 2.0f)
                // L 14.752 9
                lineTo(x = 14.752f, y = 9.0f)
                // L 12 16
                lineTo(x = 12.0f, y = 16.0f)
                // L 14 16
                lineTo(x = 14.0f, y = 16.0f)
                // L 16 10
                lineTo(x = 16.0f, y = 10.0f)
                // L 18 16
                lineTo(x = 18.0f, y = 16.0f)
                // L 20 16
                lineTo(x = 20.0f, y = 16.0f)
                // L 17.245 9
                lineTo(x = 17.245f, y = 9.0f)
                // L 20 2z
                lineTo(x = 20.0f, y = 2.0f)
                close()
            }
            // <polygon points="3.0 4.0 6.0 4.0 6.0 16.0 8.0 16.0 8.0 4.0 11.0 4.0 11.0 2.0 3.0 2.0 3.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 4
                moveTo(x = 3.0f, y = 4.0f)
                // L 6 4
                lineTo(x = 6.0f, y = 4.0f)
                // L 6 16
                lineTo(x = 6.0f, y = 16.0f)
                // L 8 16
                lineTo(x = 8.0f, y = 16.0f)
                // L 8 4
                lineTo(x = 8.0f, y = 4.0f)
                // L 11 4
                lineTo(x = 11.0f, y = 4.0f)
                // L 11 2
                lineTo(x = 11.0f, y = 2.0f)
                // L 3 2
                lineTo(x = 3.0f, y = 2.0f)
                // L 3 4z
                lineTo(x = 3.0f, y = 4.0f)
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
        }.build().also { _tXTReference = it }
    }

@Suppress("ObjectPropertyName")
private var _tXTReference: ImageVector? = null
