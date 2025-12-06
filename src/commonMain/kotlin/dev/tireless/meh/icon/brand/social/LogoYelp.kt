package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoYelp: ImageVector
    get() {
        val current = _logoYelp
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoYelp",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m8.5 15.18 5.07 2.47 a1.16 1.16 0 0 1 -.23 2.17 l-5.46 1.36 a1.16 1.16 0 0 1 -1.44 -1 10 10 0 0 1 .46 -4.33 1.16 1.16 0 0 1 1.6 -.67 m2.03 10.42 3.77 -4.18 a1.16 1.16 0 0 1 2.02 .81 l-.2 5.63 a1.16 1.16 0 0 1 -1.35 1.1 10 10 0 0 1 -4.03 -1.63 1.16 1.16 0 0 1 -.2 -1.73 m8.93 -5.57 5.36 1.74 a1.16 1.16 0 0 1 .69 1.6 10 10 0 0 1 -2.68 3.44 1.16 1.16 0 0 1 -1.72 -.28 l-2.99 -4.78 a1.16 1.16 0 0 1 1.34 -1.72 m5.45 -3.41 -5.41 1.55 a1.16 1.16 0 0 1 -1.28 -1.76 l3.14 -4.67 a1.16 1.16 0 0 1 1.73 -.22 10 10 0 0 1 2.56 3.52 1.16 1.16 0 0 1 -.74 1.58 M12.26 3.49 A16 16 0 0 0 9.48 4.5 a1.16 1.16 0 0 0 -.5 1.63 l5.29 9.16 c.6 1.03 2.16 .6 2.16 -.58 V4.14 A1.16 1.16 0 0 0 15.18 3 a16 16 0 0 0 -2.92 .5
            path(
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.5 15.18
                moveTo(x = 8.5f, y = 15.18f)
                // l 5.07 2.47
                lineToRelative(dx = 5.07f, dy = 2.47f)
                // a 1.16 1.16 0 0 1 -0.23 2.17
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.23f,
                    dy1 = 2.17f,
                )
                // l -5.46 1.36
                lineToRelative(dx = -5.46f, dy = 1.36f)
                // a 1.16 1.16 0 0 1 -1.44 -1
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.44f,
                    dy1 = -1.0f,
                )
                // a 10 10 0 0 1 0.46 -4.33
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.46f,
                    dy1 = -4.33f,
                )
                // a 1.16 1.16 0 0 1 1.6 -0.67
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.6f,
                    dy1 = -0.67f,
                )
                // m 2.03 10.42
                moveToRelative(dx = 2.03f, dy = 10.42f)
                // l 3.77 -4.18
                lineToRelative(dx = 3.77f, dy = -4.18f)
                // a 1.16 1.16 0 0 1 2.02 0.81
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.02f,
                    dy1 = 0.81f,
                )
                // l -0.2 5.63
                lineToRelative(dx = -0.2f, dy = 5.63f)
                // a 1.16 1.16 0 0 1 -1.35 1.1
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.35f,
                    dy1 = 1.1f,
                )
                // a 10 10 0 0 1 -4.03 -1.63
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.03f,
                    dy1 = -1.63f,
                )
                // a 1.16 1.16 0 0 1 -0.2 -1.73
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.2f,
                    dy1 = -1.73f,
                )
                // m 8.93 -5.57
                moveToRelative(dx = 8.93f, dy = -5.57f)
                // l 5.36 1.74
                lineToRelative(dx = 5.36f, dy = 1.74f)
                // a 1.16 1.16 0 0 1 0.69 1.6
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.69f,
                    dy1 = 1.6f,
                )
                // a 10 10 0 0 1 -2.68 3.44
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.68f,
                    dy1 = 3.44f,
                )
                // a 1.16 1.16 0 0 1 -1.72 -0.28
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.72f,
                    dy1 = -0.28f,
                )
                // l -2.99 -4.78
                lineToRelative(dx = -2.99f, dy = -4.78f)
                // a 1.16 1.16 0 0 1 1.34 -1.72
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.34f,
                    dy1 = -1.72f,
                )
                // m 5.45 -3.41
                moveToRelative(dx = 5.45f, dy = -3.41f)
                // l -5.41 1.55
                lineToRelative(dx = -5.41f, dy = 1.55f)
                // a 1.16 1.16 0 0 1 -1.28 -1.76
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.28f,
                    dy1 = -1.76f,
                )
                // l 3.14 -4.67
                lineToRelative(dx = 3.14f, dy = -4.67f)
                // a 1.16 1.16 0 0 1 1.73 -0.22
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.73f,
                    dy1 = -0.22f,
                )
                // a 10 10 0 0 1 2.56 3.52
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.56f,
                    dy1 = 3.52f,
                )
                // a 1.16 1.16 0 0 1 -0.74 1.58
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.74f,
                    dy1 = 1.58f,
                )
                // M 12.26 3.49
                moveTo(x = 12.26f, y = 3.49f)
                // A 16 16 0 0 0 9.48 4.5
                arcTo(
                    horizontalEllipseRadius = 16.0f,
                    verticalEllipseRadius = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.48f,
                    y1 = 4.5f,
                )
                // a 1.16 1.16 0 0 0 -0.5 1.63
                arcToRelative(
                    a = 1.16f,
                    b = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 1.63f,
                )
                // l 5.29 9.16
                lineToRelative(dx = 5.29f, dy = 9.16f)
                // c 0.6 1.03 2.16 0.6 2.16 -0.58
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 1.03f,
                    dx2 = 2.16f,
                    dy2 = 0.6f,
                    dx3 = 2.16f,
                    dy3 = -0.58f,
                )
                // V 4.14
                verticalLineTo(y = 4.14f)
                // A 1.16 1.16 0 0 0 15.18 3
                arcTo(
                    horizontalEllipseRadius = 1.16f,
                    verticalEllipseRadius = 1.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.18f,
                    y1 = 3.0f,
                )
                // a 16 16 0 0 0 -2.92 0.5
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.92f,
                    dy1 = 0.5f,
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
        }.build().also { _logoYelp = it }
    }

@Suppress("ObjectPropertyName")
private var _logoYelp: ImageVector? = null
