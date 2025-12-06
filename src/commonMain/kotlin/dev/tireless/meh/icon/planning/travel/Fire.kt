package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fire: ImageVector
    get() {
        val current = _fire
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Fire",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24.83 16.97 c-.27 -.65 -.58 -1.38 -.88 -2.29 -.8 -2.36 1.73 -4.95 1.76 -4.97 l-1.42 -1.42 c-.14 .14 -3.42 3.48 -2.24 7.03 .33 .97 .65 1.75 .94 2.43 A9.4 9.4 0 0 1 24 22 a6.2 6.2 0 0 1 -4.19 5.3 8.5 8.5 0 0 0 -2.1 -8 l-1.05 -1.05 -.58 1.36 c-1.84 4.28 -4.02 6.15 -5.3 6.93 A5.8 5.8 0 0 1 8 22 a10 10 0 0 1 .93 -3.63 A11 11 0 0 0 10 14 v-1.78 c.87 .36 2 1.3 2 3.78 v2.6 l1.74 -1.93 c3.12 -3.46 2.47 -7.57 1.2 -10.3 A4.5 4.5 0 0 1 18 11 h2 c0 -5.54 -4.58 -7 -7 -7 h-2 l1.2 1.6 c.14 .18 2.86 3.93 1.35 7.69 A4.9 4.9 0 0 0 9 10 H8 v4 a10 10 0 0 1 -.93 3.63 A11 11 0 0 0 6 22 c0 3.85 3.82 8 10 8 s10 -4.15 10 -8 a11.4 11.4 0 0 0 -1.17 -5.03 m-12 10.56 a16.5 16.5 0 0 0 4.37 -5.6 6.1 6.1 0 0 1 .26 5.97 A11 11 0 0 1 16 28 a10 10 0 0 1 -3.16 -.47
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.83 16.97
                moveTo(x = 24.83f, y = 16.97f)
                // c -0.27 -0.65 -0.58 -1.38 -0.88 -2.29
                curveToRelative(
                    dx1 = -0.27f,
                    dy1 = -0.65f,
                    dx2 = -0.58f,
                    dy2 = -1.38f,
                    dx3 = -0.88f,
                    dy3 = -2.29f,
                )
                // c -0.8 -2.36 1.73 -4.95 1.76 -4.97
                curveToRelative(
                    dx1 = -0.8f,
                    dy1 = -2.36f,
                    dx2 = 1.73f,
                    dy2 = -4.95f,
                    dx3 = 1.76f,
                    dy3 = -4.97f,
                )
                // l -1.42 -1.42
                lineToRelative(dx = -1.42f, dy = -1.42f)
                // c -0.14 0.14 -3.42 3.48 -2.24 7.03
                curveToRelative(
                    dx1 = -0.14f,
                    dy1 = 0.14f,
                    dx2 = -3.42f,
                    dy2 = 3.48f,
                    dx3 = -2.24f,
                    dy3 = 7.03f,
                )
                // c 0.33 0.97 0.65 1.75 0.94 2.43
                curveToRelative(
                    dx1 = 0.33f,
                    dy1 = 0.97f,
                    dx2 = 0.65f,
                    dy2 = 1.75f,
                    dx3 = 0.94f,
                    dy3 = 2.43f,
                )
                // A 9.4 9.4 0 0 1 24 22
                arcTo(
                    horizontalEllipseRadius = 9.4f,
                    verticalEllipseRadius = 9.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 22.0f,
                )
                // a 6.2 6.2 0 0 1 -4.19 5.3
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.19f,
                    dy1 = 5.3f,
                )
                // a 8.5 8.5 0 0 0 -2.1 -8
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.1f,
                    dy1 = -8.0f,
                )
                // l -1.05 -1.05
                lineToRelative(dx = -1.05f, dy = -1.05f)
                // l -0.58 1.36
                lineToRelative(dx = -0.58f, dy = 1.36f)
                // c -1.84 4.28 -4.02 6.15 -5.3 6.93
                curveToRelative(
                    dx1 = -1.84f,
                    dy1 = 4.28f,
                    dx2 = -4.02f,
                    dy2 = 6.15f,
                    dx3 = -5.3f,
                    dy3 = 6.93f,
                )
                // A 5.8 5.8 0 0 1 8 22
                arcTo(
                    horizontalEllipseRadius = 5.8f,
                    verticalEllipseRadius = 5.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 22.0f,
                )
                // a 10 10 0 0 1 0.93 -3.63
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.93f,
                    dy1 = -3.63f,
                )
                // A 11 11 0 0 0 10 14
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 14.0f,
                )
                // v -1.78
                verticalLineToRelative(dy = -1.78f)
                // c 0.87 0.36 2 1.3 2 3.78
                curveToRelative(
                    dx1 = 0.87f,
                    dy1 = 0.36f,
                    dx2 = 2.0f,
                    dy2 = 1.3f,
                    dx3 = 2.0f,
                    dy3 = 3.78f,
                )
                // v 2.6
                verticalLineToRelative(dy = 2.6f)
                // l 1.74 -1.93
                lineToRelative(dx = 1.74f, dy = -1.93f)
                // c 3.12 -3.46 2.47 -7.57 1.2 -10.3
                curveToRelative(
                    dx1 = 3.12f,
                    dy1 = -3.46f,
                    dx2 = 2.47f,
                    dy2 = -7.57f,
                    dx3 = 1.2f,
                    dy3 = -10.3f,
                )
                // A 4.5 4.5 0 0 1 18 11
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 11.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 0 -5.54 -4.58 -7 -7 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.54f,
                    dx2 = -4.58f,
                    dy2 = -7.0f,
                    dx3 = -7.0f,
                    dy3 = -7.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // l 1.2 1.6
                lineToRelative(dx = 1.2f, dy = 1.6f)
                // c 0.14 0.18 2.86 3.93 1.35 7.69
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = 0.18f,
                    dx2 = 2.86f,
                    dy2 = 3.93f,
                    dx3 = 1.35f,
                    dy3 = 7.69f,
                )
                // A 4.9 4.9 0 0 0 9 10
                arcTo(
                    horizontalEllipseRadius = 4.9f,
                    verticalEllipseRadius = 4.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 10.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 10 10 0 0 1 -0.93 3.63
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.93f,
                    dy1 = 3.63f,
                )
                // A 11 11 0 0 0 6 22
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 22.0f,
                )
                // c 0 3.85 3.82 8 10 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.85f,
                    dx2 = 3.82f,
                    dy2 = 8.0f,
                    dx3 = 10.0f,
                    dy3 = 8.0f,
                )
                // s 10 -4.15 10 -8
                reflectiveCurveToRelative(
                    dx1 = 10.0f,
                    dy1 = -4.15f,
                    dx2 = 10.0f,
                    dy2 = -8.0f,
                )
                // a 11.4 11.4 0 0 0 -1.17 -5.03
                arcToRelative(
                    a = 11.4f,
                    b = 11.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.17f,
                    dy1 = -5.03f,
                )
                // m -12 10.56
                moveToRelative(dx = -12.0f, dy = 10.56f)
                // a 16.5 16.5 0 0 0 4.37 -5.6
                arcToRelative(
                    a = 16.5f,
                    b = 16.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.37f,
                    dy1 = -5.6f,
                )
                // a 6.1 6.1 0 0 1 0.26 5.97
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.26f,
                    dy1 = 5.97f,
                )
                // A 11 11 0 0 1 16 28
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.0f,
                )
                // a 10 10 0 0 1 -3.16 -0.47
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.16f,
                    dy1 = -0.47f,
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
        }.build().also { _fire = it }
    }

@Suppress("ObjectPropertyName")
private var _fire: ImageVector? = null
