package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Taxi: ImageVector
    get() {
        val current = _taxi
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Taxi",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.39 16.08 -6.69 -2.87 -2.54 -4.34 -.08 -.12 A2 2 0 0 0 18.52 8 h-8 a2 2 0 0 0 -1.67 .89 L5.46 14 H3 a1 1 0 0 0 -1 1 v9 a1 1 0 0 0 1 1 h2.14 a4 4 0 0 0 7.72 0 h6.28 a4 4 0 0 0 7.72 0 H29 a1 1 0 0 0 1 -1 v-7 a1 1 0 0 0 -.61 -.92 M9 26 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m14 0 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m5 -3 h-1.14 a4 4 0 0 0 -7.72 0 h-6.28 a4 4 0 0 0 -7.72 0 H4 v-7 h2 a1 1 0 0 0 .83 -.45 L10.54 10 h8 l2.63 4.5 a1 1 0 0 0 .47 .42 L28 17.66Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.39 16.08
                moveTo(x = 29.39f, y = 16.08f)
                // l -6.69 -2.87
                lineToRelative(dx = -6.69f, dy = -2.87f)
                // l -2.54 -4.34
                lineToRelative(dx = -2.54f, dy = -4.34f)
                // l -0.08 -0.12
                lineToRelative(dx = -0.08f, dy = -0.12f)
                // A 2 2 0 0 0 18.52 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.52f,
                    y1 = 8.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 0 -1.67 0.89
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.67f,
                    dy1 = 0.89f,
                )
                // L 5.46 14
                lineTo(x = 5.46f, y = 14.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2.14
                horizontalLineToRelative(dx = 2.14f)
                // a 4 4 0 0 0 7.72 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.72f,
                    dy1 = 0.0f,
                )
                // h 6.28
                horizontalLineToRelative(dx = 6.28f)
                // a 4 4 0 0 0 7.72 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.72f,
                    dy1 = 0.0f,
                )
                // H 29
                horizontalLineTo(x = 29.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 1 1 0 0 0 -0.61 -0.92
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.61f,
                    dy1 = -0.92f,
                )
                // M 9 26
                moveTo(x = 9.0f, y = 26.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 14 0
                moveToRelative(dx = 14.0f, dy = 0.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 5 -3
                moveToRelative(dx = 5.0f, dy = -3.0f)
                // h -1.14
                horizontalLineToRelative(dx = -1.14f)
                // a 4 4 0 0 0 -7.72 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.72f,
                    dy1 = 0.0f,
                )
                // h -6.28
                horizontalLineToRelative(dx = -6.28f)
                // a 4 4 0 0 0 -7.72 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.72f,
                    dy1 = 0.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 0 0.83 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.83f,
                    dy1 = -0.45f,
                )
                // L 10.54 10
                lineTo(x = 10.54f, y = 10.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // l 2.63 4.5
                lineToRelative(dx = 2.63f, dy = 4.5f)
                // a 1 1 0 0 0 0.47 0.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.47f,
                    dy1 = 0.42f,
                )
                // L 28 17.66z
                lineTo(x = 28.0f, y = 17.66f)
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
        }.build().also { _taxi = it }
    }

@Suppress("ObjectPropertyName")
private var _taxi: ImageVector? = null
