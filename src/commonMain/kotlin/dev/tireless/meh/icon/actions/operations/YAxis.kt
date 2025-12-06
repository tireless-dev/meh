package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val YAxis: ImageVector
    get() {
        val current = _yAxis
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.YAxis",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M8 26 V7.83 l2.59 2.58 L12 9 7 4 2 9 l1.41 1.41 L6 7.83 V26 a2 2 0 0 0 2 2 h20 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // V 7.83
                verticalLineTo(y = 7.83f)
                // l 2.59 2.58
                lineToRelative(dx = 2.59f, dy = 2.58f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 7 4
                lineTo(x = 7.0f, y = 4.0f)
                // L 2 9
                lineTo(x = 2.0f, y = 9.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 6 7.83
                lineTo(x = 6.0f, y = 7.83f)
                // V 26
                verticalLineTo(y = 26.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
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
        }.build().also { _yAxis = it }
    }

@Suppress("ObjectPropertyName")
private var _yAxis: ImageVector? = null
