package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoWechat: ImageVector
    get() {
        val current = _logoWechat
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoWechat",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27.09 24.78 A6.6 6.6 0 0 0 30 19.47 c0 -3.88 -3.78 -7.03 -8.43 -7.03 s-8.44 3.15 -8.44 7.03 3.78 7.02 8.44 7.02 a10 10 0 0 0 2.75 -.38 l.25 -.04 A1 1 0 0 1 25 26.2 l1.85 1.07 .16 .05 a.3 .3 0 0 0 .29 -.28 l-.05 -.2 -.38 -1.42 -.03 -.18 a.6 .6 0 0 1 .24 -.46 M12.12 4.68 C6.53 4.68 2 8.46 2 13.11 a8 8 0 0 0 3.5 6.38 .7 .7 0 0 1 .28 .55 l-.04 .21 -.45 1.7 -.06 .25 a.34 .34 0 0 0 .34 .34 l.2 -.06 2.21 -1.28 a1 1 0 0 1 .54 -.16 l.3 .04 a12 12 0 0 0 3.3 .47 l.56 -.02 a7 7 0 0 1 -.34 -2.06 c0 -4.25 4.13 -7.7 9.23 -7.7 l.55 .02 c-.77 -4.03 -4.95 -7.11 -10 -7.11 m6.63 13.66 a1.12 1.12 0 1 1 1.13 -1.12 1.1 1.1 0 0 1 -1.13 1.12 m5.63 0 a1.12 1.12 0 1 1 1.12 -1.12 1.1 1.1 0 0 1 -1.12 1.12 M8.75 11.76 a1.35 1.35 0 1 1 1.35 -1.34 1.35 1.35 0 0 1 -1.35 1.34 m6.74 0 a1.35 1.35 0 1 1 1.35 -1.34 1.35 1.35 0 0 1 -1.35 1.34
            path(
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.09 24.78
                moveTo(x = 27.09f, y = 24.78f)
                // A 6.6 6.6 0 0 0 30 19.47
                arcTo(
                    horizontalEllipseRadius = 6.6f,
                    verticalEllipseRadius = 6.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 19.47f,
                )
                // c 0 -3.88 -3.78 -7.03 -8.43 -7.03
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.88f,
                    dx2 = -3.78f,
                    dy2 = -7.03f,
                    dx3 = -8.43f,
                    dy3 = -7.03f,
                )
                // s -8.44 3.15 -8.44 7.03
                reflectiveCurveToRelative(
                    dx1 = -8.44f,
                    dy1 = 3.15f,
                    dx2 = -8.44f,
                    dy2 = 7.03f,
                )
                // s 3.78 7.02 8.44 7.02
                reflectiveCurveToRelative(
                    dx1 = 3.78f,
                    dy1 = 7.02f,
                    dx2 = 8.44f,
                    dy2 = 7.02f,
                )
                // a 10 10 0 0 0 2.75 -0.38
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.75f,
                    dy1 = -0.38f,
                )
                // l 0.25 -0.04
                lineToRelative(dx = 0.25f, dy = -0.04f)
                // A 1 1 0 0 1 25 26.2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 26.2f,
                )
                // l 1.85 1.07
                lineToRelative(dx = 1.85f, dy = 1.07f)
                // l 0.16 0.05
                lineToRelative(dx = 0.16f, dy = 0.05f)
                // a 0.3 0.3 0 0 0 0.29 -0.28
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.29f,
                    dy1 = -0.28f,
                )
                // l -0.05 -0.2
                lineToRelative(dx = -0.05f, dy = -0.2f)
                // l -0.38 -1.42
                lineToRelative(dx = -0.38f, dy = -1.42f)
                // l -0.03 -0.18
                lineToRelative(dx = -0.03f, dy = -0.18f)
                // a 0.6 0.6 0 0 1 0.24 -0.46
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.24f,
                    dy1 = -0.46f,
                )
                // M 12.12 4.68
                moveTo(x = 12.12f, y = 4.68f)
                // C 6.53 4.68 2 8.46 2 13.11
                curveTo(
                    x1 = 6.53f,
                    y1 = 4.68f,
                    x2 = 2.0f,
                    y2 = 8.46f,
                    x3 = 2.0f,
                    y3 = 13.11f,
                )
                // a 8 8 0 0 0 3.5 6.38
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.5f,
                    dy1 = 6.38f,
                )
                // a 0.7 0.7 0 0 1 0.28 0.55
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.28f,
                    dy1 = 0.55f,
                )
                // l -0.04 0.21
                lineToRelative(dx = -0.04f, dy = 0.21f)
                // l -0.45 1.7
                lineToRelative(dx = -0.45f, dy = 1.7f)
                // l -0.06 0.25
                lineToRelative(dx = -0.06f, dy = 0.25f)
                // a 0.34 0.34 0 0 0 0.34 0.34
                arcToRelative(
                    a = 0.34f,
                    b = 0.34f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.34f,
                    dy1 = 0.34f,
                )
                // l 0.2 -0.06
                lineToRelative(dx = 0.2f, dy = -0.06f)
                // l 2.21 -1.28
                lineToRelative(dx = 2.21f, dy = -1.28f)
                // a 1 1 0 0 1 0.54 -0.16
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.54f,
                    dy1 = -0.16f,
                )
                // l 0.3 0.04
                lineToRelative(dx = 0.3f, dy = 0.04f)
                // a 12 12 0 0 0 3.3 0.47
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.3f,
                    dy1 = 0.47f,
                )
                // l 0.56 -0.02
                lineToRelative(dx = 0.56f, dy = -0.02f)
                // a 7 7 0 0 1 -0.34 -2.06
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.34f,
                    dy1 = -2.06f,
                )
                // c 0 -4.25 4.13 -7.7 9.23 -7.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.25f,
                    dx2 = 4.13f,
                    dy2 = -7.7f,
                    dx3 = 9.23f,
                    dy3 = -7.7f,
                )
                // l 0.55 0.02
                lineToRelative(dx = 0.55f, dy = 0.02f)
                // c -0.77 -4.03 -4.95 -7.11 -10 -7.11
                curveToRelative(
                    dx1 = -0.77f,
                    dy1 = -4.03f,
                    dx2 = -4.95f,
                    dy2 = -7.11f,
                    dx3 = -10.0f,
                    dy3 = -7.11f,
                )
                // m 6.63 13.66
                moveToRelative(dx = 6.63f, dy = 13.66f)
                // a 1.12 1.12 0 1 1 1.13 -1.12
                arcToRelative(
                    a = 1.12f,
                    b = 1.12f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.13f,
                    dy1 = -1.12f,
                )
                // a 1.1 1.1 0 0 1 -1.13 1.12
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.13f,
                    dy1 = 1.12f,
                )
                // m 5.63 0
                moveToRelative(dx = 5.63f, dy = 0.0f)
                // a 1.12 1.12 0 1 1 1.12 -1.12
                arcToRelative(
                    a = 1.12f,
                    b = 1.12f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.12f,
                    dy1 = -1.12f,
                )
                // a 1.1 1.1 0 0 1 -1.12 1.12
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.12f,
                    dy1 = 1.12f,
                )
                // M 8.75 11.76
                moveTo(x = 8.75f, y = 11.76f)
                // a 1.35 1.35 0 1 1 1.35 -1.34
                arcToRelative(
                    a = 1.35f,
                    b = 1.35f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.35f,
                    dy1 = -1.34f,
                )
                // a 1.35 1.35 0 0 1 -1.35 1.34
                arcToRelative(
                    a = 1.35f,
                    b = 1.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.35f,
                    dy1 = 1.34f,
                )
                // m 6.74 0
                moveToRelative(dx = 6.74f, dy = 0.0f)
                // a 1.35 1.35 0 1 1 1.35 -1.34
                arcToRelative(
                    a = 1.35f,
                    b = 1.35f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.35f,
                    dy1 = -1.34f,
                )
                // a 1.35 1.35 0 0 1 -1.35 1.34
                arcToRelative(
                    a = 1.35f,
                    b = 1.35f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.35f,
                    dy1 = 1.34f,
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
        }.build().also { _logoWechat = it }
    }

@Suppress("ObjectPropertyName")
private var _logoWechat: ImageVector? = null
