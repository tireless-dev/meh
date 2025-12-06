package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoX: ImageVector
    get() {
        val current = _logoX
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoX",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M18.23 14.16 26.98 4 H24.9 l-7.59 8.82 L11.25 4 h-7 l9.18 13.34 L4.26 28 h2.07 l8.02 -9.32 6.4 9.32 h7z m-2.83 3.3 -.93 -1.33 -7.4 -10.57 h3.19 l5.96 8.53 .93 1.33 7.76 11.1 h-3.19z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18.23 14.16
                moveTo(x = 18.23f, y = 14.16f)
                // L 26.98 4
                lineTo(x = 26.98f, y = 4.0f)
                // H 24.9
                horizontalLineTo(x = 24.9f)
                // l -7.59 8.82
                lineToRelative(dx = -7.59f, dy = 8.82f)
                // L 11.25 4
                lineTo(x = 11.25f, y = 4.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // l 9.18 13.34
                lineToRelative(dx = 9.18f, dy = 13.34f)
                // L 4.26 28
                lineTo(x = 4.26f, y = 28.0f)
                // h 2.07
                horizontalLineToRelative(dx = 2.07f)
                // l 8.02 -9.32
                lineToRelative(dx = 8.02f, dy = -9.32f)
                // l 6.4 9.32
                lineToRelative(dx = 6.4f, dy = 9.32f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -2.83 3.3
                moveToRelative(dx = -2.83f, dy = 3.3f)
                // l -0.93 -1.33
                lineToRelative(dx = -0.93f, dy = -1.33f)
                // l -7.4 -10.57
                lineToRelative(dx = -7.4f, dy = -10.57f)
                // h 3.19
                horizontalLineToRelative(dx = 3.19f)
                // l 5.96 8.53
                lineToRelative(dx = 5.96f, dy = 8.53f)
                // l 0.93 1.33
                lineToRelative(dx = 0.93f, dy = 1.33f)
                // l 7.76 11.1
                lineToRelative(dx = 7.76f, dy = 11.1f)
                // h -3.19z
                horizontalLineToRelative(dx = -3.19f)
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
        }.build().also { _logoX = it }
    }

@Suppress("ObjectPropertyName")
private var _logoX: ImageVector? = null
