package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoSvelte: ImageVector
    get() {
        val current = _logoSvelte
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoSvelte",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26.1 5.7 C23.5 2 18.4 .9 14.7 3.2 L8.2 7.4 a7.4 7.4 0 0 0 -3.4 5 c-.3 1.7 0 3.5 .8 5.1 a7 7 0 0 0 -1.1 2.8 7.6 7.6 0 0 0 1.4 6 c2.6 3.7 7.7 4.8 11.4 2.5 l6.5 -4.2 c1.8 -1.1 3 -2.9 3.4 -5 .3 -1.7 0 -3.5 -.8 -5.1 .6 -.8 .9 -1.8 1.1 -2.8 .4 -2.1 -.1 -4.3 -1.4 -6 M24.3 11 c0 .2 -.1 .4 -.2 .6 L24 12 l-.3 -.2 c-.8 -.6 -1.6 -1 -2.6 -1.3 l-.2 -.1 v-.2 c0 -.3 -.1 -.7 -.3 -1 -.4 -.5 -1 -.8 -1.7 -.6 -.1 0 -.3 .1 -.4 .2 L12 12.9 a1.5 1.5 0 0 0 -.6 .9 c-.1 .4 0 .8 .2 1.1 .4 .5 1 .8 1.7 .6 .1 0 .3 -.1 .4 -.2 l2.5 -1.6 c.4 -.3 .9 -.5 1.3 -.6 2.1 -.5 4.3 .3 5.6 2.1 .7 1 1 2.4 .8 3.6 s-1 2.3 -2 3 L15.4 26 a4 4 0 0 1 -1.3 .6 5.35 5.35 0 0 1 -5.6 -2.1 c-.7 -1 -1 -2.4 -.8 -3.6 0 -.2 .1 -.4 .2 -.6 L8 20 l.3 .2 c.8 .6 1.6 1 2.6 1.3 l.2 .1 v.2 c0 .3 .1 .7 .3 1 .4 .5 1 .8 1.7 .6 .1 0 .3 -.1 .4 -.2 L20 19 q.45 -.3 .6 -.9 c.1 -.4 0 -.8 -.2 -1.1 -.4 -.5 -1 -.8 -1.7 -.6 -.1 0 -.3 .1 -.4 .2 l-2.5 1.6 a4 4 0 0 1 -1.3 .6 5.35 5.35 0 0 1 -5.6 -2.1 4.64 4.64 0 0 1 1.2 -6.6 l6.5 -4.2 c.4 -.3 .9 -.5 1.3 -.6 2.1 -.5 4.3 .3 5.6 2.1 .7 1.1 1 2.4 .8 3.6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.1 5.7
                moveTo(x = 26.1f, y = 5.7f)
                // C 23.5 2 18.4 0.9 14.7 3.2
                curveTo(
                    x1 = 23.5f,
                    y1 = 2.0f,
                    x2 = 18.4f,
                    y2 = 0.9f,
                    x3 = 14.7f,
                    y3 = 3.2f,
                )
                // L 8.2 7.4
                lineTo(x = 8.2f, y = 7.4f)
                // a 7.4 7.4 0 0 0 -3.4 5
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.4f,
                    dy1 = 5.0f,
                )
                // c -0.3 1.7 0 3.5 0.8 5.1
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = 1.7f,
                    dx2 = 0.0f,
                    dy2 = 3.5f,
                    dx3 = 0.8f,
                    dy3 = 5.1f,
                )
                // a 7 7 0 0 0 -1.1 2.8
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.1f,
                    dy1 = 2.8f,
                )
                // a 7.6 7.6 0 0 0 1.4 6
                arcToRelative(
                    a = 7.6f,
                    b = 7.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 6.0f,
                )
                // c 2.6 3.7 7.7 4.8 11.4 2.5
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 3.7f,
                    dx2 = 7.7f,
                    dy2 = 4.8f,
                    dx3 = 11.4f,
                    dy3 = 2.5f,
                )
                // l 6.5 -4.2
                lineToRelative(dx = 6.5f, dy = -4.2f)
                // c 1.8 -1.1 3 -2.9 3.4 -5
                curveToRelative(
                    dx1 = 1.8f,
                    dy1 = -1.1f,
                    dx2 = 3.0f,
                    dy2 = -2.9f,
                    dx3 = 3.4f,
                    dy3 = -5.0f,
                )
                // c 0.3 -1.7 0 -3.5 -0.8 -5.1
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = -1.7f,
                    dx2 = 0.0f,
                    dy2 = -3.5f,
                    dx3 = -0.8f,
                    dy3 = -5.1f,
                )
                // c 0.6 -0.8 0.9 -1.8 1.1 -2.8
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = -0.8f,
                    dx2 = 0.9f,
                    dy2 = -1.8f,
                    dx3 = 1.1f,
                    dy3 = -2.8f,
                )
                // c 0.4 -2.1 -0.1 -4.3 -1.4 -6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -2.1f,
                    dx2 = -0.1f,
                    dy2 = -4.3f,
                    dx3 = -1.4f,
                    dy3 = -6.0f,
                )
                // M 24.3 11
                moveTo(x = 24.3f, y = 11.0f)
                // c 0 0.2 -0.1 0.4 -0.2 0.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.2f,
                    dx2 = -0.1f,
                    dy2 = 0.4f,
                    dx3 = -0.2f,
                    dy3 = 0.6f,
                )
                // L 24 12
                lineTo(x = 24.0f, y = 12.0f)
                // l -0.3 -0.2
                lineToRelative(dx = -0.3f, dy = -0.2f)
                // c -0.8 -0.6 -1.6 -1 -2.6 -1.3
                curveToRelative(
                    dx1 = -0.8f,
                    dy1 = -0.6f,
                    dx2 = -1.6f,
                    dy2 = -1.0f,
                    dx3 = -2.6f,
                    dy3 = -1.3f,
                )
                // l -0.2 -0.1
                lineToRelative(dx = -0.2f, dy = -0.1f)
                // v -0.2
                verticalLineToRelative(dy = -0.2f)
                // c 0 -0.3 -0.1 -0.7 -0.3 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = -0.1f,
                    dy2 = -0.7f,
                    dx3 = -0.3f,
                    dy3 = -1.0f,
                )
                // c -0.4 -0.5 -1 -0.8 -1.7 -0.6
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -0.5f,
                    dx2 = -1.0f,
                    dy2 = -0.8f,
                    dx3 = -1.7f,
                    dy3 = -0.6f,
                )
                // c -0.1 0 -0.3 0.1 -0.4 0.2
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.0f,
                    dx2 = -0.3f,
                    dy2 = 0.1f,
                    dx3 = -0.4f,
                    dy3 = 0.2f,
                )
                // L 12 12.9
                lineTo(x = 12.0f, y = 12.9f)
                // a 1.5 1.5 0 0 0 -0.6 0.9
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.6f,
                    dy1 = 0.9f,
                )
                // c -0.1 0.4 0 0.8 0.2 1.1
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.4f,
                    dx2 = 0.0f,
                    dy2 = 0.8f,
                    dx3 = 0.2f,
                    dy3 = 1.1f,
                )
                // c 0.4 0.5 1 0.8 1.7 0.6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.5f,
                    dx2 = 1.0f,
                    dy2 = 0.8f,
                    dx3 = 1.7f,
                    dy3 = 0.6f,
                )
                // c 0.1 0 0.3 -0.1 0.4 -0.2
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.0f,
                    dx2 = 0.3f,
                    dy2 = -0.1f,
                    dx3 = 0.4f,
                    dy3 = -0.2f,
                )
                // l 2.5 -1.6
                lineToRelative(dx = 2.5f, dy = -1.6f)
                // c 0.4 -0.3 0.9 -0.5 1.3 -0.6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.3f,
                    dx2 = 0.9f,
                    dy2 = -0.5f,
                    dx3 = 1.3f,
                    dy3 = -0.6f,
                )
                // c 2.1 -0.5 4.3 0.3 5.6 2.1
                curveToRelative(
                    dx1 = 2.1f,
                    dy1 = -0.5f,
                    dx2 = 4.3f,
                    dy2 = 0.3f,
                    dx3 = 5.6f,
                    dy3 = 2.1f,
                )
                // c 0.7 1 1 2.4 0.8 3.6
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 1.0f,
                    dx2 = 1.0f,
                    dy2 = 2.4f,
                    dx3 = 0.8f,
                    dy3 = 3.6f,
                )
                // s -1 2.3 -2 3
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = 2.3f,
                    dx2 = -2.0f,
                    dy2 = 3.0f,
                )
                // L 15.4 26
                lineTo(x = 15.4f, y = 26.0f)
                // a 4 4 0 0 1 -1.3 0.6
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = 0.6f,
                )
                // a 5.35 5.35 0 0 1 -5.6 -2.1
                arcToRelative(
                    a = 5.35f,
                    b = 5.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.6f,
                    dy1 = -2.1f,
                )
                // c -0.7 -1 -1 -2.4 -0.8 -3.6
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = -1.0f,
                    dx2 = -1.0f,
                    dy2 = -2.4f,
                    dx3 = -0.8f,
                    dy3 = -3.6f,
                )
                // c 0 -0.2 0.1 -0.4 0.2 -0.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.2f,
                    dx2 = 0.1f,
                    dy2 = -0.4f,
                    dx3 = 0.2f,
                    dy3 = -0.6f,
                )
                // L 8 20
                lineTo(x = 8.0f, y = 20.0f)
                // l 0.3 0.2
                lineToRelative(dx = 0.3f, dy = 0.2f)
                // c 0.8 0.6 1.6 1 2.6 1.3
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = 0.6f,
                    dx2 = 1.6f,
                    dy2 = 1.0f,
                    dx3 = 2.6f,
                    dy3 = 1.3f,
                )
                // l 0.2 0.1
                lineToRelative(dx = 0.2f, dy = 0.1f)
                // v 0.2
                verticalLineToRelative(dy = 0.2f)
                // c 0 0.3 0.1 0.7 0.3 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.3f,
                    dx2 = 0.1f,
                    dy2 = 0.7f,
                    dx3 = 0.3f,
                    dy3 = 1.0f,
                )
                // c 0.4 0.5 1 0.8 1.7 0.6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.5f,
                    dx2 = 1.0f,
                    dy2 = 0.8f,
                    dx3 = 1.7f,
                    dy3 = 0.6f,
                )
                // c 0.1 0 0.3 -0.1 0.4 -0.2
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = 0.0f,
                    dx2 = 0.3f,
                    dy2 = -0.1f,
                    dx3 = 0.4f,
                    dy3 = -0.2f,
                )
                // L 20 19
                lineTo(x = 20.0f, y = 19.0f)
                // q 0.45 -0.3 0.6 -0.9
                quadToRelative(
                    dx1 = 0.45f,
                    dy1 = -0.3f,
                    dx2 = 0.6f,
                    dy2 = -0.9f,
                )
                // c 0.1 -0.4 0 -0.8 -0.2 -1.1
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.4f,
                    dx2 = 0.0f,
                    dy2 = -0.8f,
                    dx3 = -0.2f,
                    dy3 = -1.1f,
                )
                // c -0.4 -0.5 -1 -0.8 -1.7 -0.6
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -0.5f,
                    dx2 = -1.0f,
                    dy2 = -0.8f,
                    dx3 = -1.7f,
                    dy3 = -0.6f,
                )
                // c -0.1 0 -0.3 0.1 -0.4 0.2
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.0f,
                    dx2 = -0.3f,
                    dy2 = 0.1f,
                    dx3 = -0.4f,
                    dy3 = 0.2f,
                )
                // l -2.5 1.6
                lineToRelative(dx = -2.5f, dy = 1.6f)
                // a 4 4 0 0 1 -1.3 0.6
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = 0.6f,
                )
                // a 5.35 5.35 0 0 1 -5.6 -2.1
                arcToRelative(
                    a = 5.35f,
                    b = 5.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.6f,
                    dy1 = -2.1f,
                )
                // a 4.64 4.64 0 0 1 1.2 -6.6
                arcToRelative(
                    a = 4.64f,
                    b = 4.64f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.2f,
                    dy1 = -6.6f,
                )
                // l 6.5 -4.2
                lineToRelative(dx = 6.5f, dy = -4.2f)
                // c 0.4 -0.3 0.9 -0.5 1.3 -0.6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.3f,
                    dx2 = 0.9f,
                    dy2 = -0.5f,
                    dx3 = 1.3f,
                    dy3 = -0.6f,
                )
                // c 2.1 -0.5 4.3 0.3 5.6 2.1
                curveToRelative(
                    dx1 = 2.1f,
                    dy1 = -0.5f,
                    dx2 = 4.3f,
                    dy2 = 0.3f,
                    dx3 = 5.6f,
                    dy3 = 2.1f,
                )
                // c 0.7 1.1 1 2.4 0.8 3.6
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 1.1f,
                    dx2 = 1.0f,
                    dy2 = 2.4f,
                    dx3 = 0.8f,
                    dy3 = 3.6f,
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
        }.build().also { _logoSvelte = it }
    }

@Suppress("ObjectPropertyName")
private var _logoSvelte: ImageVector? = null
