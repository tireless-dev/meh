package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionMerge: ImageVector
    get() {
        val current = _directionMerge
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionMerge",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17.88 15.46 A3 3 0 0 1 17 13.34 V7.83 l4.59 4.58 L23 11 l-7 -7 -7 7 1.41 1.41 L15 7.83 v5.51 a3 3 0 0 1 -.88 2.12 l-2.66 2.66 A5 5 0 0 0 10 21.66 V28 h2 v-6.34 a3 3 0 0 1 .88 -2.12 l2.66 -2.66 A5 5 0 0 0 16 16.3 a5 5 0 0 0 .46 .57 l2.66 2.66 A3 3 0 0 1 20 21.66 V28 h2 v-6.34 a5 5 0 0 0 -1.46 -3.54Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.88 15.46
                moveTo(x = 17.88f, y = 15.46f)
                // A 3 3 0 0 1 17 13.34
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 13.34f,
                )
                // V 7.83
                verticalLineTo(y = 7.83f)
                // l 4.59 4.58
                lineToRelative(dx = 4.59f, dy = 4.58f)
                // L 23 11
                lineTo(x = 23.0f, y = 11.0f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // l -7 7
                lineToRelative(dx = -7.0f, dy = 7.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 15 7.83
                lineTo(x = 15.0f, y = 7.83f)
                // v 5.51
                verticalLineToRelative(dy = 5.51f)
                // a 3 3 0 0 1 -0.88 2.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.88f,
                    dy1 = 2.12f,
                )
                // l -2.66 2.66
                lineToRelative(dx = -2.66f, dy = 2.66f)
                // A 5 5 0 0 0 10 21.66
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 21.66f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6.34
                verticalLineToRelative(dy = -6.34f)
                // a 3 3 0 0 1 0.88 -2.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.88f,
                    dy1 = -2.12f,
                )
                // l 2.66 -2.66
                lineToRelative(dx = 2.66f, dy = -2.66f)
                // A 5 5 0 0 0 16 16.3
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 16.3f,
                )
                // a 5 5 0 0 0 0.46 0.57
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.46f,
                    dy1 = 0.57f,
                )
                // l 2.66 2.66
                lineToRelative(dx = 2.66f, dy = 2.66f)
                // A 3 3 0 0 1 20 21.66
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 21.66f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6.34
                verticalLineToRelative(dy = -6.34f)
                // a 5 5 0 0 0 -1.46 -3.54z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.46f,
                    dy1 = -3.54f,
                )
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
        }.build().also { _directionMerge = it }
    }

@Suppress("ObjectPropertyName")
private var _directionMerge: ImageVector? = null
