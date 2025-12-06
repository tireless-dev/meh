package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoFigma: ImageVector
    get() {
        val current = _logoFigma
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoFigma",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23.6 11.6 c1 -.6 1.7 -1.5 2.1 -2.6 s.4 -2.2 .1 -3.3 A5.2 5.2 0 0 0 20.7 2 h-9.2 c-1.2 0 -2.3 .4 -3.2 1 a5.4 5.4 0 0 0 -2.1 2.7 A5.3 5.3 0 0 0 6.3 9 c.4 1.1 1.1 2 2.1 2.6 a5.5 5.5 0 0 0 -1.8 1.9 5.4 5.4 0 0 0 0 5 c.4 .8 1 1.4 1.8 1.9 -1 .6 -1.7 1.5 -2.1 2.6 a5.3 5.3 0 0 0 -.1 3.3 c.3 1.1 1 2 2 2.7 .9 .7 2.1 1 3.2 1 1.4 0 2.8 -.6 3.9 -1.5 1 -1 1.6 -2.3 1.6 -3.7 V20 c1 .9 2.3 1.4 3.6 1.4 h.1 c1.2 0 2.3 -.4 3.2 -1 a5.2 5.2 0 0 0 1.8 -6 4.6 4.6 0 0 0 -2 -2.8 m-6.7 -7.9 h3.7 c.5 0 1 0 1.4 .2 .5 .2 .9 .4 1.2 .8 .4 .3 .6 .7 .8 1.2 s.3 .9 .3 1.4 -.1 1 -.3 1.4 a8 8 0 0 1 -.8 1.2 c-.4 .3 -.8 .6 -1.2 .8 -.5 .2 -1 .2 -1.4 .2 h-3.7z m-5.5 0 h3.7 v7 h-3.7 A3.2 3.2 0 0 1 9 9.6 C8.3 9 8 8.1 8 7.2 s.4 -1.8 1 -2.4 1.5 -1 2.4 -1.1 M7.8 16 a3.6 3.6 0 0 1 3.7 -3.5 h3.7 v7 h-3.7 a4 4 0 0 1 -2.6 -1 A3.6 3.6 0 0 1 7.8 16 m7.3 8.7 c0 1 -.4 1.9 -1.1 2.5 -.7 .7 -1.6 1 -2.6 1 -.5 0 -1 0 -1.4 -.2 a4 4 0 0 1 -1.2 -.7 A2.6 2.6 0 0 1 8 26.1 a3 3 0 0 1 -.3 -1.4 c0 -.5 .1 -1 .3 -1.4 s.5 -.8 .8 -1.2 c.4 -.3 .8 -.6 1.2 -.8 .5 -.2 1 -.2 1.4 -.2 h3.7z m5.5 -5.2 h-.1 a3.2 3.2 0 0 1 -2.4 -1.1 c-.6 -.7 -1 -1.5 -1 -2.4 s.4 -1.8 1 -2.4 c.6 -.7 1.5 -1 2.4 -1.1 h.1 c.5 0 1 0 1.4 .2 .5 .2 .9 .4 1.2 .8 .4 .3 .6 .7 .8 1.2 a3 3 0 0 1 .3 1.4 c0 .5 -.1 1 -.3 1.4 a8 8 0 0 1 -.8 1.2 c-.4 .3 -.8 .6 -1.2 .8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.6 11.6
                moveTo(x = 23.6f, y = 11.6f)
                // c 1 -0.6 1.7 -1.5 2.1 -2.6
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.6f,
                    dx2 = 1.7f,
                    dy2 = -1.5f,
                    dx3 = 2.1f,
                    dy3 = -2.6f,
                )
                // s 0.4 -2.2 0.1 -3.3
                reflectiveCurveToRelative(
                    dx1 = 0.4f,
                    dy1 = -2.2f,
                    dx2 = 0.1f,
                    dy2 = -3.3f,
                )
                // A 5.2 5.2 0 0 0 20.7 2
                arcTo(
                    horizontalEllipseRadius = 5.2f,
                    verticalEllipseRadius = 5.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.7f,
                    y1 = 2.0f,
                )
                // h -9.2
                horizontalLineToRelative(dx = -9.2f)
                // c -1.2 0 -2.3 0.4 -3.2 1
                curveToRelative(
                    dx1 = -1.2f,
                    dy1 = 0.0f,
                    dx2 = -2.3f,
                    dy2 = 0.4f,
                    dx3 = -3.2f,
                    dy3 = 1.0f,
                )
                // a 5.4 5.4 0 0 0 -2.1 2.7
                arcToRelative(
                    a = 5.4f,
                    b = 5.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.1f,
                    dy1 = 2.7f,
                )
                // A 5.3 5.3 0 0 0 6.3 9
                arcTo(
                    horizontalEllipseRadius = 5.3f,
                    verticalEllipseRadius = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.3f,
                    y1 = 9.0f,
                )
                // c 0.4 1.1 1.1 2 2.1 2.6
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 1.1f,
                    dx2 = 1.1f,
                    dy2 = 2.0f,
                    dx3 = 2.1f,
                    dy3 = 2.6f,
                )
                // a 5.5 5.5 0 0 0 -1.8 1.9
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 1.9f,
                )
                // a 5.4 5.4 0 0 0 0 5
                arcToRelative(
                    a = 5.4f,
                    b = 5.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // c 0.4 0.8 1 1.4 1.8 1.9
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.8f,
                    dx2 = 1.0f,
                    dy2 = 1.4f,
                    dx3 = 1.8f,
                    dy3 = 1.9f,
                )
                // c -1 0.6 -1.7 1.5 -2.1 2.6
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.6f,
                    dx2 = -1.7f,
                    dy2 = 1.5f,
                    dx3 = -2.1f,
                    dy3 = 2.6f,
                )
                // a 5.3 5.3 0 0 0 -0.1 3.3
                arcToRelative(
                    a = 5.3f,
                    b = 5.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = 3.3f,
                )
                // c 0.3 1.1 1 2 2 2.7
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = 1.1f,
                    dx2 = 1.0f,
                    dy2 = 2.0f,
                    dx3 = 2.0f,
                    dy3 = 2.7f,
                )
                // c 0.9 0.7 2.1 1 3.2 1
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = 0.7f,
                    dx2 = 2.1f,
                    dy2 = 1.0f,
                    dx3 = 3.2f,
                    dy3 = 1.0f,
                )
                // c 1.4 0 2.8 -0.6 3.9 -1.5
                curveToRelative(
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                    dx2 = 2.8f,
                    dy2 = -0.6f,
                    dx3 = 3.9f,
                    dy3 = -1.5f,
                )
                // c 1 -1 1.6 -2.3 1.6 -3.7
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                    dx2 = 1.6f,
                    dy2 = -2.3f,
                    dx3 = 1.6f,
                    dy3 = -3.7f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
                // c 1 0.9 2.3 1.4 3.6 1.4
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.9f,
                    dx2 = 2.3f,
                    dy2 = 1.4f,
                    dx3 = 3.6f,
                    dy3 = 1.4f,
                )
                // h 0.1
                horizontalLineToRelative(dx = 0.1f)
                // c 1.2 0 2.3 -0.4 3.2 -1
                curveToRelative(
                    dx1 = 1.2f,
                    dy1 = 0.0f,
                    dx2 = 2.3f,
                    dy2 = -0.4f,
                    dx3 = 3.2f,
                    dy3 = -1.0f,
                )
                // a 5.2 5.2 0 0 0 1.8 -6
                arcToRelative(
                    a = 5.2f,
                    b = 5.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = -6.0f,
                )
                // a 4.6 4.6 0 0 0 -2 -2.8
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.8f,
                )
                // m -6.7 -7.9
                moveToRelative(dx = -6.7f, dy = -7.9f)
                // h 3.7
                horizontalLineToRelative(dx = 3.7f)
                // c 0.5 0 1 0 1.4 0.2
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.0f,
                    dx3 = 1.4f,
                    dy3 = 0.2f,
                )
                // c 0.5 0.2 0.9 0.4 1.2 0.8
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.2f,
                    dx2 = 0.9f,
                    dy2 = 0.4f,
                    dx3 = 1.2f,
                    dy3 = 0.8f,
                )
                // c 0.4 0.3 0.6 0.7 0.8 1.2
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.3f,
                    dx2 = 0.6f,
                    dy2 = 0.7f,
                    dx3 = 0.8f,
                    dy3 = 1.2f,
                )
                // s 0.3 0.9 0.3 1.4
                reflectiveCurveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.9f,
                    dx2 = 0.3f,
                    dy2 = 1.4f,
                )
                // s -0.1 1 -0.3 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.1f,
                    dy1 = 1.0f,
                    dx2 = -0.3f,
                    dy2 = 1.4f,
                )
                // a 8 8 0 0 1 -0.8 1.2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = 1.2f,
                )
                // c -0.4 0.3 -0.8 0.6 -1.2 0.8
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 0.3f,
                    dx2 = -0.8f,
                    dy2 = 0.6f,
                    dx3 = -1.2f,
                    dy3 = 0.8f,
                )
                // c -0.5 0.2 -1 0.2 -1.4 0.2
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.2f,
                    dx2 = -1.0f,
                    dy2 = 0.2f,
                    dx3 = -1.4f,
                    dy3 = 0.2f,
                )
                // h -3.7z
                horizontalLineToRelative(dx = -3.7f)
                close()
                // m -5.5 0
                moveToRelative(dx = -5.5f, dy = 0.0f)
                // h 3.7
                horizontalLineToRelative(dx = 3.7f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -3.7
                horizontalLineToRelative(dx = -3.7f)
                // A 3.2 3.2 0 0 1 9 9.6
                arcTo(
                    horizontalEllipseRadius = 3.2f,
                    verticalEllipseRadius = 3.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 9.6f,
                )
                // C 8.3 9 8 8.1 8 7.2
                curveTo(
                    x1 = 8.3f,
                    y1 = 9.0f,
                    x2 = 8.0f,
                    y2 = 8.1f,
                    x3 = 8.0f,
                    y3 = 7.2f,
                )
                // s 0.4 -1.8 1 -2.4
                reflectiveCurveToRelative(
                    dx1 = 0.4f,
                    dy1 = -1.8f,
                    dx2 = 1.0f,
                    dy2 = -2.4f,
                )
                // s 1.5 -1 2.4 -1.1
                reflectiveCurveToRelative(
                    dx1 = 1.5f,
                    dy1 = -1.0f,
                    dx2 = 2.4f,
                    dy2 = -1.1f,
                )
                // M 7.8 16
                moveTo(x = 7.8f, y = 16.0f)
                // a 3.6 3.6 0 0 1 3.7 -3.5
                arcToRelative(
                    a = 3.6f,
                    b = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.7f,
                    dy1 = -3.5f,
                )
                // h 3.7
                horizontalLineToRelative(dx = 3.7f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -3.7
                horizontalLineToRelative(dx = -3.7f)
                // a 4 4 0 0 1 -2.6 -1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.6f,
                    dy1 = -1.0f,
                )
                // A 3.6 3.6 0 0 1 7.8 16
                arcTo(
                    horizontalEllipseRadius = 3.6f,
                    verticalEllipseRadius = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.8f,
                    y1 = 16.0f,
                )
                // m 7.3 8.7
                moveToRelative(dx = 7.3f, dy = 8.7f)
                // c 0 1 -0.4 1.9 -1.1 2.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = -0.4f,
                    dy2 = 1.9f,
                    dx3 = -1.1f,
                    dy3 = 2.5f,
                )
                // c -0.7 0.7 -1.6 1 -2.6 1
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 0.7f,
                    dx2 = -1.6f,
                    dy2 = 1.0f,
                    dx3 = -2.6f,
                    dy3 = 1.0f,
                )
                // c -0.5 0 -1 0 -1.4 -0.2
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = 0.0f,
                    dx3 = -1.4f,
                    dy3 = -0.2f,
                )
                // a 4 4 0 0 1 -1.2 -0.7
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.2f,
                    dy1 = -0.7f,
                )
                // A 2.6 2.6 0 0 1 8 26.1
                arcTo(
                    horizontalEllipseRadius = 2.6f,
                    verticalEllipseRadius = 2.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 26.1f,
                )
                // a 3 3 0 0 1 -0.3 -1.4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.3f,
                    dy1 = -1.4f,
                )
                // c 0 -0.5 0.1 -1 0.3 -1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.5f,
                    dx2 = 0.1f,
                    dy2 = -1.0f,
                    dx3 = 0.3f,
                    dy3 = -1.4f,
                )
                // s 0.5 -0.8 0.8 -1.2
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.8f,
                    dx2 = 0.8f,
                    dy2 = -1.2f,
                )
                // c 0.4 -0.3 0.8 -0.6 1.2 -0.8
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.3f,
                    dx2 = 0.8f,
                    dy2 = -0.6f,
                    dx3 = 1.2f,
                    dy3 = -0.8f,
                )
                // c 0.5 -0.2 1 -0.2 1.4 -0.2
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -0.2f,
                    dx2 = 1.0f,
                    dy2 = -0.2f,
                    dx3 = 1.4f,
                    dy3 = -0.2f,
                )
                // h 3.7z
                horizontalLineToRelative(dx = 3.7f)
                close()
                // m 5.5 -5.2
                moveToRelative(dx = 5.5f, dy = -5.2f)
                // h -0.1
                horizontalLineToRelative(dx = -0.1f)
                // a 3.2 3.2 0 0 1 -2.4 -1.1
                arcToRelative(
                    a = 3.2f,
                    b = 3.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.4f,
                    dy1 = -1.1f,
                )
                // c -0.6 -0.7 -1 -1.5 -1 -2.4
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = -0.7f,
                    dx2 = -1.0f,
                    dy2 = -1.5f,
                    dx3 = -1.0f,
                    dy3 = -2.4f,
                )
                // s 0.4 -1.8 1 -2.4
                reflectiveCurveToRelative(
                    dx1 = 0.4f,
                    dy1 = -1.8f,
                    dx2 = 1.0f,
                    dy2 = -2.4f,
                )
                // c 0.6 -0.7 1.5 -1 2.4 -1.1
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = -0.7f,
                    dx2 = 1.5f,
                    dy2 = -1.0f,
                    dx3 = 2.4f,
                    dy3 = -1.1f,
                )
                // h 0.1
                horizontalLineToRelative(dx = 0.1f)
                // c 0.5 0 1 0 1.4 0.2
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = 0.0f,
                    dx3 = 1.4f,
                    dy3 = 0.2f,
                )
                // c 0.5 0.2 0.9 0.4 1.2 0.8
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.2f,
                    dx2 = 0.9f,
                    dy2 = 0.4f,
                    dx3 = 1.2f,
                    dy3 = 0.8f,
                )
                // c 0.4 0.3 0.6 0.7 0.8 1.2
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = 0.3f,
                    dx2 = 0.6f,
                    dy2 = 0.7f,
                    dx3 = 0.8f,
                    dy3 = 1.2f,
                )
                // a 3 3 0 0 1 0.3 1.4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = 1.4f,
                )
                // c 0 0.5 -0.1 1 -0.3 1.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.1f,
                    dy2 = 1.0f,
                    dx3 = -0.3f,
                    dy3 = 1.4f,
                )
                // a 8 8 0 0 1 -0.8 1.2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = 1.2f,
                )
                // c -0.4 0.3 -0.8 0.6 -1.2 0.8z
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 0.3f,
                    dx2 = -0.8f,
                    dy2 = 0.6f,
                    dx3 = -1.2f,
                    dy3 = 0.8f,
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
        }.build().also { _logoFigma = it }
    }

@Suppress("ObjectPropertyName")
private var _logoFigma: ImageVector? = null
