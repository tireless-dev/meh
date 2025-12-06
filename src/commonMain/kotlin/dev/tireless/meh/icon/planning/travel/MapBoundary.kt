package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapBoundary: ImageVector
    get() {
        val current = _mapBoundary
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MapBoundary",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="4" x="12.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="4" height="2" x="18.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="14.0 18.0 14.0 16.0 12.0 16.0 12.0 20.0 16.0 20.0 16.0 18.0 14.0 18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 18
                moveTo(x = 14.0f, y = 18.0f)
                // L 14 16
                lineTo(x = 14.0f, y = 16.0f)
                // L 12 16
                lineTo(x = 12.0f, y = 16.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 16 20
                lineTo(x = 16.0f, y = 20.0f)
                // L 16 18
                lineTo(x = 16.0f, y = 18.0f)
                // L 14 18z
                lineTo(x = 14.0f, y = 18.0f)
                close()
            }
            // <rect width="12" height="12" x="16.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <polygon points="17.885 29.997 11.819 26.142 4.0 27.989 4.0 4.0 14.0 4.0 14.0 8.0 12.0 8.0 12.0 6.0 6.0 6.0 6.0 25.461 12.181 24.001 18.115 27.773 22.818 26.0 26.0 26.0 26.0 20.0 24.0 20.0 24.0 18.0 28.0 18.0 28.0 28.0 23.182 28.0 17.885 29.997" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.885 29.997
                moveTo(x = 17.885f, y = 29.997f)
                // L 11.819 26.142
                lineTo(x = 11.819f, y = 26.142f)
                // L 4 27.989
                lineTo(x = 4.0f, y = 27.989f)
                // L 4 4
                lineTo(x = 4.0f, y = 4.0f)
                // L 14 4
                lineTo(x = 14.0f, y = 4.0f)
                // L 14 8
                lineTo(x = 14.0f, y = 8.0f)
                // L 12 8
                lineTo(x = 12.0f, y = 8.0f)
                // L 12 6
                lineTo(x = 12.0f, y = 6.0f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // L 6 25.461
                lineTo(x = 6.0f, y = 25.461f)
                // L 12.181 24.001
                lineTo(x = 12.181f, y = 24.001f)
                // L 18.115 27.773
                lineTo(x = 18.115f, y = 27.773f)
                // L 22.818 26
                lineTo(x = 22.818f, y = 26.0f)
                // L 26 26
                lineTo(x = 26.0f, y = 26.0f)
                // L 26 20
                lineTo(x = 26.0f, y = 20.0f)
                // L 24 20
                lineTo(x = 24.0f, y = 20.0f)
                // L 24 18
                lineTo(x = 24.0f, y = 18.0f)
                // L 28 18
                lineTo(x = 28.0f, y = 18.0f)
                // L 28 28
                lineTo(x = 28.0f, y = 28.0f)
                // L 23.182 28
                lineTo(x = 23.182f, y = 28.0f)
                // L 17.885 29.997z
                lineTo(x = 17.885f, y = 29.997f)
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
        }.build().also { _mapBoundary = it }
    }

@Suppress("ObjectPropertyName")
private var _mapBoundary: ImageVector? = null
