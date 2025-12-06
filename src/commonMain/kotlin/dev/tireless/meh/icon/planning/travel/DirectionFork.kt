package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionFork: ImageVector
    get() {
        val current = _directionFork
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionFork",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="6.0 13.0 6.0 7.414 15.0 16.414 15.0 28.0 17.0 28.0 17.0 16.414 26.0 7.414 26.0 13.0 28.0 13.0 28.0 4.0 19.0 4.0 19.0 6.0 24.586 6.0 16.0 14.586 7.414 6.0 13.0 6.0 13.0 4.0 4.0 4.0 4.0 13.0 6.0 13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // L 6 7.414
                lineTo(x = 6.0f, y = 7.414f)
                // L 15 16.414
                lineTo(x = 15.0f, y = 16.414f)
                // L 15 28
                lineTo(x = 15.0f, y = 28.0f)
                // L 17 28
                lineTo(x = 17.0f, y = 28.0f)
                // L 17 16.414
                lineTo(x = 17.0f, y = 16.414f)
                // L 26 7.414
                lineTo(x = 26.0f, y = 7.414f)
                // L 26 13
                lineTo(x = 26.0f, y = 13.0f)
                // L 28 13
                lineTo(x = 28.0f, y = 13.0f)
                // L 28 4
                lineTo(x = 28.0f, y = 4.0f)
                // L 19 4
                lineTo(x = 19.0f, y = 4.0f)
                // L 19 6
                lineTo(x = 19.0f, y = 6.0f)
                // L 24.586 6
                lineTo(x = 24.586f, y = 6.0f)
                // L 16 14.586
                lineTo(x = 16.0f, y = 14.586f)
                // L 7.414 6
                lineTo(x = 7.414f, y = 6.0f)
                // L 13 6
                lineTo(x = 13.0f, y = 6.0f)
                // L 13 4
                lineTo(x = 13.0f, y = 4.0f)
                // L 4 4
                lineTo(x = 4.0f, y = 4.0f)
                // L 4 13
                lineTo(x = 4.0f, y = 13.0f)
                // L 6 13z
                lineTo(x = 6.0f, y = 13.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _directionFork = it }
    }

@Suppress("ObjectPropertyName")
private var _directionFork: ImageVector? = null
