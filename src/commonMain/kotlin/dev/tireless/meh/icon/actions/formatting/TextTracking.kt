package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextTracking: ImageVector
    get() {
        val current = _textTracking
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextTracking",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="25.29 19.29 23.88 20.71 26.17 23.0 5.83 23.0 8.12 20.71 6.71 19.29 2.0 24.0 6.71 28.71 8.12 27.29 5.83 25.0 26.17 25.0 23.88 27.29 25.29 28.71 30.0 24.0 25.29 19.29" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.29 19.29
                moveTo(x = 25.29f, y = 19.29f)
                // L 23.88 20.71
                lineTo(x = 23.88f, y = 20.71f)
                // L 26.17 23
                lineTo(x = 26.17f, y = 23.0f)
                // L 5.83 23
                lineTo(x = 5.83f, y = 23.0f)
                // L 8.12 20.71
                lineTo(x = 8.12f, y = 20.71f)
                // L 6.71 19.29
                lineTo(x = 6.71f, y = 19.29f)
                // L 2 24
                lineTo(x = 2.0f, y = 24.0f)
                // L 6.71 28.71
                lineTo(x = 6.71f, y = 28.71f)
                // L 8.12 27.29
                lineTo(x = 8.12f, y = 27.29f)
                // L 5.83 25
                lineTo(x = 5.83f, y = 25.0f)
                // L 26.17 25
                lineTo(x = 26.17f, y = 25.0f)
                // L 23.88 27.29
                lineTo(x = 23.88f, y = 27.29f)
                // L 25.29 28.71
                lineTo(x = 25.29f, y = 28.71f)
                // L 30 24
                lineTo(x = 30.0f, y = 24.0f)
                // L 25.29 19.29z
                lineTo(x = 25.29f, y = 19.29f)
                close()
            }
            // M26 17 h2 L23 3 h-2 l-5 14 h2 l1 -3 h6Z m-6.33 -5 L22 5 l2.33 7Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 17
                moveTo(x = 26.0f, y = 17.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // L 23 3
                lineTo(x = 23.0f, y = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // l -5 14
                lineToRelative(dx = -5.0f, dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // l 1 -3
                lineToRelative(dx = 1.0f, dy = -3.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m -6.33 -5
                moveToRelative(dx = -6.33f, dy = -5.0f)
                // L 22 5
                lineTo(x = 22.0f, y = 5.0f)
                // l 2.33 7z
                lineToRelative(dx = 2.33f, dy = 7.0f)
                close()
            }
            // <polygon points="14.0 3.0 10.0 15.0 6.0 3.0 4.0 3.0 9.0 17.0 11.0 17.0 16.0 3.0 14.0 3.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
                // L 10 15
                lineTo(x = 10.0f, y = 15.0f)
                // L 6 3
                lineTo(x = 6.0f, y = 3.0f)
                // L 4 3
                lineTo(x = 4.0f, y = 3.0f)
                // L 9 17
                lineTo(x = 9.0f, y = 17.0f)
                // L 11 17
                lineTo(x = 11.0f, y = 17.0f)
                // L 16 3
                lineTo(x = 16.0f, y = 3.0f)
                // L 14 3z
                lineTo(x = 14.0f, y = 3.0f)
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
        }.build().also { _textTracking = it }
    }

@Suppress("ObjectPropertyName")
private var _textTracking: ImageVector? = null
