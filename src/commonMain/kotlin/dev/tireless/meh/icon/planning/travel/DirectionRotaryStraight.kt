package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryStraight: ImageVector
    get() {
        val current = _directionRotaryStraight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionRotaryStraight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 12.09 V5.83 l4.59 4.58 L23 9 l-7 -7 -7 7 1.41 1.41 L15 5.83 v6.26 a6 6 0 0 0 0 11.82 V28 h2 v-4.09 a6 6 0 0 0 0 -11.82 M16 22 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 12.09
                moveTo(x = 17.0f, y = 12.09f)
                // V 5.83
                verticalLineTo(y = 5.83f)
                // l 4.59 4.58
                lineToRelative(dx = 4.59f, dy = 4.58f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 15 5.83
                lineTo(x = 15.0f, y = 5.83f)
                // v 6.26
                verticalLineToRelative(dy = 6.26f)
                // a 6 6 0 0 0 0 11.82
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 11.82f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4.09
                verticalLineToRelative(dy = -4.09f)
                // a 6 6 0 0 0 0 -11.82
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -11.82f,
                )
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
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
        }.build().also { _directionRotaryStraight = it }
    }

@Suppress("ObjectPropertyName")
private var _directionRotaryStraight: ImageVector? = null
