package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionStraight: ImageVector
    get() {
        val current = _directionStraight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionStraight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 4.0 9.0 11.0 10.414 12.414 15.0 7.828 15.0 28.0 17.0 28.0 17.0 7.828 21.586 12.414 23.0 11.0 16.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // L 9 11
                lineTo(x = 9.0f, y = 11.0f)
                // L 10.414 12.414
                lineTo(x = 10.414f, y = 12.414f)
                // L 15 7.828
                lineTo(x = 15.0f, y = 7.828f)
                // L 15 28
                lineTo(x = 15.0f, y = 28.0f)
                // L 17 28
                lineTo(x = 17.0f, y = 28.0f)
                // L 17 7.828
                lineTo(x = 17.0f, y = 7.828f)
                // L 21.586 12.414
                lineTo(x = 21.586f, y = 12.414f)
                // L 23 11
                lineTo(x = 23.0f, y = 11.0f)
                // L 16 4z
                lineTo(x = 16.0f, y = 4.0f)
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
        }.build().also { _directionStraight = it }
    }

@Suppress("ObjectPropertyName")
private var _directionStraight: ImageVector? = null
