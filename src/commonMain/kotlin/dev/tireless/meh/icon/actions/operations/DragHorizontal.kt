package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DragHorizontal: ImageVector
    get() {
        val current = _dragHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DragHorizontal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="12.0 4.0 12.0 15.0 5.83 15.0 8.41 12.41 7.0 11.0 2.0 16.0 7.0 21.0 8.41 19.59 5.83 17.0 12.0 17.0 12.0 28.0 14.0 28.0 14.0 4.0 12.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // L 12 15
                lineTo(x = 12.0f, y = 15.0f)
                // L 5.83 15
                lineTo(x = 5.83f, y = 15.0f)
                // L 8.41 12.41
                lineTo(x = 8.41f, y = 12.41f)
                // L 7 11
                lineTo(x = 7.0f, y = 11.0f)
                // L 2 16
                lineTo(x = 2.0f, y = 16.0f)
                // L 7 21
                lineTo(x = 7.0f, y = 21.0f)
                // L 8.41 19.59
                lineTo(x = 8.41f, y = 19.59f)
                // L 5.83 17
                lineTo(x = 5.83f, y = 17.0f)
                // L 12 17
                lineTo(x = 12.0f, y = 17.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 14 28
                lineTo(x = 14.0f, y = 28.0f)
                // L 14 4
                lineTo(x = 14.0f, y = 4.0f)
                // L 12 4z
                lineTo(x = 12.0f, y = 4.0f)
                close()
            }
            // <polygon points="25.0 11.0 23.59 12.41 26.17 15.0 20.0 15.0 20.0 4.0 18.0 4.0 18.0 28.0 20.0 28.0 20.0 17.0 26.17 17.0 23.59 19.59 25.0 21.0 30.0 16.0 25.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 11
                moveTo(x = 25.0f, y = 11.0f)
                // L 23.59 12.41
                lineTo(x = 23.59f, y = 12.41f)
                // L 26.17 15
                lineTo(x = 26.17f, y = 15.0f)
                // L 20 15
                lineTo(x = 20.0f, y = 15.0f)
                // L 20 4
                lineTo(x = 20.0f, y = 4.0f)
                // L 18 4
                lineTo(x = 18.0f, y = 4.0f)
                // L 18 28
                lineTo(x = 18.0f, y = 28.0f)
                // L 20 28
                lineTo(x = 20.0f, y = 28.0f)
                // L 20 17
                lineTo(x = 20.0f, y = 17.0f)
                // L 26.17 17
                lineTo(x = 26.17f, y = 17.0f)
                // L 23.59 19.59
                lineTo(x = 23.59f, y = 19.59f)
                // L 25 21
                lineTo(x = 25.0f, y = 21.0f)
                // L 30 16
                lineTo(x = 30.0f, y = 16.0f)
                // L 25 11z
                lineTo(x = 25.0f, y = 11.0f)
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
        }.build().also { _dragHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _dragHorizontal: ImageVector? = null
