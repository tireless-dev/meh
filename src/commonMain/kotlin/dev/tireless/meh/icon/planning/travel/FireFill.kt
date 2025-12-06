package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FireFill: ImageVector
    get() {
        val current = _fireFill
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FireFill",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m10.78 26.54 -.02 -.01z m14.06 -9.57 a27 27 0 0 1 -.89 -2.29 c-.56 -1.68 .57 -3.54 1.22 -4.34 .18 -.22 .31 -.4 .54 -.63 a3.7 3.7 0 0 0 -4.24 -.78 12 12 0 0 0 -1.55 .89 C19.31 5.25 15.24 4 13 4 h-2 l1.2 1.6 c.14 .18 2.87 3.92 1.36 7.68 A4.95 4.95 0 0 0 9 10 H8 v4 c0 1.31 -.45 2.43 -.93 3.63 C6.55 18.94 6 20.31 6 22 a7.4 7.4 0 0 0 2.73 5.48 10 10 0 0 0 3.81 -2.34 l.06 -.06 a20 20 0 0 0 .89 -1.01 20.46 20.46 0 0 0 2.59 -4.47 l.59 -1.35 1.04 1.04 a8 8 0 0 1 1.59 2.34 l.16 .39 .08 .2 a8 8 0 0 1 .54 3.47 l-.01 .05 -.03 .4 -.02 .15 -.07 .38 q0 .09 -.03 .16 l-.1 .41 -.01 .05 a6 6 0 0 1 -1.31 2.4 l-.08 .08 C23.16 28.85 26 25.31 26 22 c0 -2.26 -.54 -3.55 -1.16 -5.03
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.78 26.54
                moveTo(x = 10.78f, y = 26.54f)
                // l -0.02 -0.01z
                lineToRelative(dx = -0.02f, dy = -0.01f)
                close()
                // m 14.06 -9.57
                moveToRelative(dx = 14.06f, dy = -9.57f)
                // a 27 27 0 0 1 -0.89 -2.29
                arcToRelative(
                    a = 27.0f,
                    b = 27.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.89f,
                    dy1 = -2.29f,
                )
                // c -0.56 -1.68 0.57 -3.54 1.22 -4.34
                curveToRelative(
                    dx1 = -0.56f,
                    dy1 = -1.68f,
                    dx2 = 0.57f,
                    dy2 = -3.54f,
                    dx3 = 1.22f,
                    dy3 = -4.34f,
                )
                // c 0.18 -0.22 0.31 -0.4 0.54 -0.63
                curveToRelative(
                    dx1 = 0.18f,
                    dy1 = -0.22f,
                    dx2 = 0.31f,
                    dy2 = -0.4f,
                    dx3 = 0.54f,
                    dy3 = -0.63f,
                )
                // a 3.7 3.7 0 0 0 -4.24 -0.78
                arcToRelative(
                    a = 3.7f,
                    b = 3.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.24f,
                    dy1 = -0.78f,
                )
                // a 12 12 0 0 0 -1.55 0.89
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.55f,
                    dy1 = 0.89f,
                )
                // C 19.31 5.25 15.24 4 13 4
                curveTo(
                    x1 = 19.31f,
                    y1 = 5.25f,
                    x2 = 15.24f,
                    y2 = 4.0f,
                    x3 = 13.0f,
                    y3 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // l 1.2 1.6
                lineToRelative(dx = 1.2f, dy = 1.6f)
                // c 0.14 0.18 2.87 3.92 1.36 7.68
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = 0.18f,
                    dx2 = 2.87f,
                    dy2 = 3.92f,
                    dx3 = 1.36f,
                    dy3 = 7.68f,
                )
                // A 4.95 4.95 0 0 0 9 10
                arcTo(
                    horizontalEllipseRadius = 4.95f,
                    verticalEllipseRadius = 4.95f,
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
                // c 0 1.31 -0.45 2.43 -0.93 3.63
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.31f,
                    dx2 = -0.45f,
                    dy2 = 2.43f,
                    dx3 = -0.93f,
                    dy3 = 3.63f,
                )
                // C 6.55 18.94 6 20.31 6 22
                curveTo(
                    x1 = 6.55f,
                    y1 = 18.94f,
                    x2 = 6.0f,
                    y2 = 20.31f,
                    x3 = 6.0f,
                    y3 = 22.0f,
                )
                // a 7.4 7.4 0 0 0 2.73 5.48
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.73f,
                    dy1 = 5.48f,
                )
                // a 10 10 0 0 0 3.81 -2.34
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.81f,
                    dy1 = -2.34f,
                )
                // l 0.06 -0.06
                lineToRelative(dx = 0.06f, dy = -0.06f)
                // a 20 20 0 0 0 0.89 -1.01
                arcToRelative(
                    a = 20.0f,
                    b = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.89f,
                    dy1 = -1.01f,
                )
                // a 20.46 20.46 0 0 0 2.59 -4.47
                arcToRelative(
                    a = 20.46f,
                    b = 20.46f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.59f,
                    dy1 = -4.47f,
                )
                // l 0.59 -1.35
                lineToRelative(dx = 0.59f, dy = -1.35f)
                // l 1.04 1.04
                lineToRelative(dx = 1.04f, dy = 1.04f)
                // a 8 8 0 0 1 1.59 2.34
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.59f,
                    dy1 = 2.34f,
                )
                // l 0.16 0.39
                lineToRelative(dx = 0.16f, dy = 0.39f)
                // l 0.08 0.2
                lineToRelative(dx = 0.08f, dy = 0.2f)
                // a 8 8 0 0 1 0.54 3.47
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.54f,
                    dy1 = 3.47f,
                )
                // l -0.01 0.05
                lineToRelative(dx = -0.01f, dy = 0.05f)
                // l -0.03 0.4
                lineToRelative(dx = -0.03f, dy = 0.4f)
                // l -0.02 0.15
                lineToRelative(dx = -0.02f, dy = 0.15f)
                // l -0.07 0.38
                lineToRelative(dx = -0.07f, dy = 0.38f)
                // q 0 0.09 -0.03 0.16
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.09f,
                    dx2 = -0.03f,
                    dy2 = 0.16f,
                )
                // l -0.1 0.41
                lineToRelative(dx = -0.1f, dy = 0.41f)
                // l -0.01 0.05
                lineToRelative(dx = -0.01f, dy = 0.05f)
                // a 6 6 0 0 1 -1.31 2.4
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.31f,
                    dy1 = 2.4f,
                )
                // l -0.08 0.08
                lineToRelative(dx = -0.08f, dy = 0.08f)
                // C 23.16 28.85 26 25.31 26 22
                curveTo(
                    x1 = 23.16f,
                    y1 = 28.85f,
                    x2 = 26.0f,
                    y2 = 25.31f,
                    x3 = 26.0f,
                    y3 = 22.0f,
                )
                // c 0 -2.26 -0.54 -3.55 -1.16 -5.03
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.26f,
                    dx2 = -0.54f,
                    dy2 = -3.55f,
                    dx3 = -1.16f,
                    dy3 = -5.03f,
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
        }.build().also { _fireFill = it }
    }

@Suppress("ObjectPropertyName")
private var _fireFill: ImageVector? = null
