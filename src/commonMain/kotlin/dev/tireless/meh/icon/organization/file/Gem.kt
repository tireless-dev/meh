package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gem: ImageVector
    get() {
        val current = _gem
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Gem",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23.5 4 h-15 l-6.78 9.05 L16 29.53 l14.28 -16.48Z m3.5 8 h-5.45 L17.8 6 h4.7Z m-16.7 2 3.76 10.23 L5.19 14Z m2.13 0 h7.14 L16 23.72Z m.37 -2 L16 6.89 19.2 12Z m8.9 2 h5.11 l-8.87 10.23Z M9.5 6 h4.7 l-3.75 6 H5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.5 4
                moveTo(x = 23.5f, y = 4.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // l -6.78 9.05
                lineToRelative(dx = -6.78f, dy = 9.05f)
                // L 16 29.53
                lineTo(x = 16.0f, y = 29.53f)
                // l 14.28 -16.48z
                lineToRelative(dx = 14.28f, dy = -16.48f)
                close()
                // m 3.5 8
                moveToRelative(dx = 3.5f, dy = 8.0f)
                // h -5.45
                horizontalLineToRelative(dx = -5.45f)
                // L 17.8 6
                lineTo(x = 17.8f, y = 6.0f)
                // h 4.7z
                horizontalLineToRelative(dx = 4.7f)
                close()
                // m -16.7 2
                moveToRelative(dx = -16.7f, dy = 2.0f)
                // l 3.76 10.23
                lineToRelative(dx = 3.76f, dy = 10.23f)
                // L 5.19 14z
                lineTo(x = 5.19f, y = 14.0f)
                close()
                // m 2.13 0
                moveToRelative(dx = 2.13f, dy = 0.0f)
                // h 7.14
                horizontalLineToRelative(dx = 7.14f)
                // L 16 23.72z
                lineTo(x = 16.0f, y = 23.72f)
                close()
                // m 0.37 -2
                moveToRelative(dx = 0.37f, dy = -2.0f)
                // L 16 6.89
                lineTo(x = 16.0f, y = 6.89f)
                // L 19.2 12z
                lineTo(x = 19.2f, y = 12.0f)
                close()
                // m 8.9 2
                moveToRelative(dx = 8.9f, dy = 2.0f)
                // h 5.11
                horizontalLineToRelative(dx = 5.11f)
                // l -8.87 10.23z
                lineToRelative(dx = -8.87f, dy = 10.23f)
                close()
                // M 9.5 6
                moveTo(x = 9.5f, y = 6.0f)
                // h 4.7
                horizontalLineToRelative(dx = 4.7f)
                // l -3.75 6
                lineToRelative(dx = -3.75f, dy = 6.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
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
        }.build().also { _gem = it }
    }

@Suppress("ObjectPropertyName")
private var _gem: ImageVector? = null
