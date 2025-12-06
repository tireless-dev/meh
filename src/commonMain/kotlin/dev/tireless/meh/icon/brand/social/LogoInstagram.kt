package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoInstagram: ImageVector
    get() {
        val current = _logoInstagram
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoInstagram",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="22.406" cy="9.594" radius="1.44" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.406 9.594
                moveTo(x = 22.406f, y = 9.594f)
                // m -1.44 0
                moveToRelative(dx = -1.44f, dy = 0.0f)
                // a 1.44 1.44 0 1 1 2.88 0
                arcToRelative(
                    a = 1.44f,
                    b = 1.44f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.88f,
                    dy1 = 0.0f,
                )
                // a 1.44 1.44 0 1 1 -2.88 0z
                arcToRelative(
                    a = 1.44f,
                    b = 1.44f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.88f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 9.84 A6.16 6.16 0 1 0 22.16 16 6.16 6.16 0 0 0 16 9.84 M16 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 9.84
                moveTo(x = 16.0f, y = 9.84f)
                // A 6.16 6.16 0 1 0 22.16 16
                arcTo(
                    horizontalEllipseRadius = 6.16f,
                    verticalEllipseRadius = 6.16f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 22.16f,
                    y1 = 16.0f,
                )
                // A 6.16 6.16 0 0 0 16 9.84
                arcTo(
                    horizontalEllipseRadius = 6.16f,
                    verticalEllipseRadius = 6.16f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 9.84f,
                )
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
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
            // M16 6.16 c3.2 0 3.58 .01 4.85 .07 a7 7 0 0 1 2.23 .42 4 4 0 0 1 2.27 2.27 7 7 0 0 1 .42 2.23 c.06 1.27 .07 1.65 .07 4.85 s-.01 3.58 -.07 4.85 a7 7 0 0 1 -.42 2.23 4 4 0 0 1 -2.27 2.27 7 7 0 0 1 -2.23 .42 c-1.27 .06 -1.65 .07 -4.85 .07 s-3.58 -.01 -4.85 -.07 a7 7 0 0 1 -2.23 -.42 4 4 0 0 1 -2.27 -2.27 7 7 0 0 1 -.42 -2.23 C6.17 19.58 6.16 19.2 6.16 16 s.01 -3.58 .07 -4.85 a7 7 0 0 1 .42 -2.23 4 4 0 0 1 2.27 -2.27 7 7 0 0 1 2.23 -.42 A83 83 0 0 1 16 6.16 M16 4 c-3.26 0 -3.67 .01 -4.95 .07 a9 9 0 0 0 -2.91 .56 6.1 6.1 0 0 0 -3.51 3.51 9 9 0 0 0 -.56 2.91 C4.01 12.33 4 12.75 4 16 s.01 3.67 .07 4.95 a9 9 0 0 0 .56 2.91 6.1 6.1 0 0 0 3.51 3.51 9 9 0 0 0 2.91 .56 C12.33 27.99 12.75 28 16 28 s3.67 -.01 4.95 -.07 a9 9 0 0 0 2.91 -.56 6.1 6.1 0 0 0 3.51 -3.51 9 9 0 0 0 .56 -2.91 C27.99 19.67 28 19.25 28 16 s-.01 -3.67 -.07 -4.95 a9 9 0 0 0 -.56 -2.91 6.1 6.1 0 0 0 -3.51 -3.51 9 9 0 0 0 -2.91 -.56 A84 84 0 0 0 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 6.16
                moveTo(x = 16.0f, y = 6.16f)
                // c 3.2 0 3.58 0.01 4.85 0.07
                curveToRelative(
                    dx1 = 3.2f,
                    dy1 = 0.0f,
                    dx2 = 3.58f,
                    dy2 = 0.01f,
                    dx3 = 4.85f,
                    dy3 = 0.07f,
                )
                // a 7 7 0 0 1 2.23 0.42
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.23f,
                    dy1 = 0.42f,
                )
                // a 4 4 0 0 1 2.27 2.27
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.27f,
                    dy1 = 2.27f,
                )
                // a 7 7 0 0 1 0.42 2.23
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.42f,
                    dy1 = 2.23f,
                )
                // c 0.06 1.27 0.07 1.65 0.07 4.85
                curveToRelative(
                    dx1 = 0.06f,
                    dy1 = 1.27f,
                    dx2 = 0.07f,
                    dy2 = 1.65f,
                    dx3 = 0.07f,
                    dy3 = 4.85f,
                )
                // s -0.01 3.58 -0.07 4.85
                reflectiveCurveToRelative(
                    dx1 = -0.01f,
                    dy1 = 3.58f,
                    dx2 = -0.07f,
                    dy2 = 4.85f,
                )
                // a 7 7 0 0 1 -0.42 2.23
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.42f,
                    dy1 = 2.23f,
                )
                // a 4 4 0 0 1 -2.27 2.27
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.27f,
                    dy1 = 2.27f,
                )
                // a 7 7 0 0 1 -2.23 0.42
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.23f,
                    dy1 = 0.42f,
                )
                // c -1.27 0.06 -1.65 0.07 -4.85 0.07
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.06f,
                    dx2 = -1.65f,
                    dy2 = 0.07f,
                    dx3 = -4.85f,
                    dy3 = 0.07f,
                )
                // s -3.58 -0.01 -4.85 -0.07
                reflectiveCurveToRelative(
                    dx1 = -3.58f,
                    dy1 = -0.01f,
                    dx2 = -4.85f,
                    dy2 = -0.07f,
                )
                // a 7 7 0 0 1 -2.23 -0.42
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.23f,
                    dy1 = -0.42f,
                )
                // a 4 4 0 0 1 -2.27 -2.27
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.27f,
                    dy1 = -2.27f,
                )
                // a 7 7 0 0 1 -0.42 -2.23
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.42f,
                    dy1 = -2.23f,
                )
                // C 6.17 19.58 6.16 19.2 6.16 16
                curveTo(
                    x1 = 6.17f,
                    y1 = 19.58f,
                    x2 = 6.16f,
                    y2 = 19.2f,
                    x3 = 6.16f,
                    y3 = 16.0f,
                )
                // s 0.01 -3.58 0.07 -4.85
                reflectiveCurveToRelative(
                    dx1 = 0.01f,
                    dy1 = -3.58f,
                    dx2 = 0.07f,
                    dy2 = -4.85f,
                )
                // a 7 7 0 0 1 0.42 -2.23
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.42f,
                    dy1 = -2.23f,
                )
                // a 4 4 0 0 1 2.27 -2.27
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.27f,
                    dy1 = -2.27f,
                )
                // a 7 7 0 0 1 2.23 -0.42
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.23f,
                    dy1 = -0.42f,
                )
                // A 83 83 0 0 1 16 6.16
                arcTo(
                    horizontalEllipseRadius = 83.0f,
                    verticalEllipseRadius = 83.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 6.16f,
                )
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // c -3.26 0 -3.67 0.01 -4.95 0.07
                curveToRelative(
                    dx1 = -3.26f,
                    dy1 = 0.0f,
                    dx2 = -3.67f,
                    dy2 = 0.01f,
                    dx3 = -4.95f,
                    dy3 = 0.07f,
                )
                // a 9 9 0 0 0 -2.91 0.56
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.91f,
                    dy1 = 0.56f,
                )
                // a 6.1 6.1 0 0 0 -3.51 3.51
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.51f,
                    dy1 = 3.51f,
                )
                // a 9 9 0 0 0 -0.56 2.91
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.56f,
                    dy1 = 2.91f,
                )
                // C 4.01 12.33 4 12.75 4 16
                curveTo(
                    x1 = 4.01f,
                    y1 = 12.33f,
                    x2 = 4.0f,
                    y2 = 12.75f,
                    x3 = 4.0f,
                    y3 = 16.0f,
                )
                // s 0.01 3.67 0.07 4.95
                reflectiveCurveToRelative(
                    dx1 = 0.01f,
                    dy1 = 3.67f,
                    dx2 = 0.07f,
                    dy2 = 4.95f,
                )
                // a 9 9 0 0 0 0.56 2.91
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.56f,
                    dy1 = 2.91f,
                )
                // a 6.1 6.1 0 0 0 3.51 3.51
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.51f,
                    dy1 = 3.51f,
                )
                // a 9 9 0 0 0 2.91 0.56
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.91f,
                    dy1 = 0.56f,
                )
                // C 12.33 27.99 12.75 28 16 28
                curveTo(
                    x1 = 12.33f,
                    y1 = 27.99f,
                    x2 = 12.75f,
                    y2 = 28.0f,
                    x3 = 16.0f,
                    y3 = 28.0f,
                )
                // s 3.67 -0.01 4.95 -0.07
                reflectiveCurveToRelative(
                    dx1 = 3.67f,
                    dy1 = -0.01f,
                    dx2 = 4.95f,
                    dy2 = -0.07f,
                )
                // a 9 9 0 0 0 2.91 -0.56
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.91f,
                    dy1 = -0.56f,
                )
                // a 6.1 6.1 0 0 0 3.51 -3.51
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.51f,
                    dy1 = -3.51f,
                )
                // a 9 9 0 0 0 0.56 -2.91
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.56f,
                    dy1 = -2.91f,
                )
                // C 27.99 19.67 28 19.25 28 16
                curveTo(
                    x1 = 27.99f,
                    y1 = 19.67f,
                    x2 = 28.0f,
                    y2 = 19.25f,
                    x3 = 28.0f,
                    y3 = 16.0f,
                )
                // s -0.01 -3.67 -0.07 -4.95
                reflectiveCurveToRelative(
                    dx1 = -0.01f,
                    dy1 = -3.67f,
                    dx2 = -0.07f,
                    dy2 = -4.95f,
                )
                // a 9 9 0 0 0 -0.56 -2.91
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.56f,
                    dy1 = -2.91f,
                )
                // a 6.1 6.1 0 0 0 -3.51 -3.51
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.51f,
                    dy1 = -3.51f,
                )
                // a 9 9 0 0 0 -2.91 -0.56
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.91f,
                    dy1 = -0.56f,
                )
                // A 84 84 0 0 0 16 4
                arcTo(
                    horizontalEllipseRadius = 84.0f,
                    verticalEllipseRadius = 84.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
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
        }.build().also { _logoInstagram = it }
    }

@Suppress("ObjectPropertyName")
private var _logoInstagram: ImageVector? = null
