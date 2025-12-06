package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneOff: ImageVector
    get() {
        val current = _phoneOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PhoneOff",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M9.19 18.56 A25.7 25.7 0 0 1 5 6.08 V6 a1 1 0 0 1 1 -1 h5.28 l1.5 3.77 -2.84 2.87 .06 .48 a13 13 0 0 0 1.46 4.17 l1.46 -1.46 a9 9 0 0 1 -.84 -2.52 l2.13 -2.15 A2 2 0 0 0 14.65 8 l-1.52 -3.74 A2 2 0 0 0 11.27 3 H5.76 A3 3 0 0 0 3 6.23 28 28 0 0 0 7.79 20Z m18.58 .3 L24 17.35 a2 2 0 0 0 -2.17 .41 l-2.17 2.15 A9 9 0 0 1 15.45 18 L30 3.41 28.59 2 2 28.59 3.41 30 l7 -7 c3.38 3.18 8.28 5.62 15.39 6 H26 a3 3 0 0 0 3 -3 v-5.28 a2 2 0 0 0 -1.23 -1.86 M27 26 v.06 A1 1 0 0 1 25.94 27 c-6.51 -.37 -11 -2.54 -14.11 -5.42 L14 19.44 A10.8 10.8 0 0 0 19.88 22 l.48 .06 2.87 -2.85 L27 20.72Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9.19 18.56
                moveTo(x = 9.19f, y = 18.56f)
                // A 25.7 25.7 0 0 1 5 6.08
                arcTo(
                    horizontalEllipseRadius = 25.7f,
                    verticalEllipseRadius = 25.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 6.08f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 5.28
                horizontalLineToRelative(dx = 5.28f)
                // l 1.5 3.77
                lineToRelative(dx = 1.5f, dy = 3.77f)
                // l -2.84 2.87
                lineToRelative(dx = -2.84f, dy = 2.87f)
                // l 0.06 0.48
                lineToRelative(dx = 0.06f, dy = 0.48f)
                // a 13 13 0 0 0 1.46 4.17
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.46f,
                    dy1 = 4.17f,
                )
                // l 1.46 -1.46
                lineToRelative(dx = 1.46f, dy = -1.46f)
                // a 9 9 0 0 1 -0.84 -2.52
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.84f,
                    dy1 = -2.52f,
                )
                // l 2.13 -2.15
                lineToRelative(dx = 2.13f, dy = -2.15f)
                // A 2 2 0 0 0 14.65 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.65f,
                    y1 = 8.0f,
                )
                // l -1.52 -3.74
                lineToRelative(dx = -1.52f, dy = -3.74f)
                // A 2 2 0 0 0 11.27 3
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.27f,
                    y1 = 3.0f,
                )
                // H 5.76
                horizontalLineTo(x = 5.76f)
                // A 3 3 0 0 0 3 6.23
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 6.23f,
                )
                // A 28 28 0 0 0 7.79 20z
                arcTo(
                    horizontalEllipseRadius = 28.0f,
                    verticalEllipseRadius = 28.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.79f,
                    y1 = 20.0f,
                )
                close()
                // m 18.58 0.3
                moveToRelative(dx = 18.58f, dy = 0.3f)
                // L 24 17.35
                lineTo(x = 24.0f, y = 17.35f)
                // a 2 2 0 0 0 -2.17 0.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.17f,
                    dy1 = 0.41f,
                )
                // l -2.17 2.15
                lineToRelative(dx = -2.17f, dy = 2.15f)
                // A 9 9 0 0 1 15.45 18
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.45f,
                    y1 = 18.0f,
                )
                // L 30 3.41
                lineTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // L 2 28.59
                lineTo(x = 2.0f, y = 28.59f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // c 3.38 3.18 8.28 5.62 15.39 6
                curveToRelative(
                    dx1 = 3.38f,
                    dy1 = 3.18f,
                    dx2 = 8.28f,
                    dy2 = 5.62f,
                    dx3 = 15.39f,
                    dy3 = 6.0f,
                )
                // H 26
                horizontalLineTo(x = 26.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // v -5.28
                verticalLineToRelative(dy = -5.28f)
                // a 2 2 0 0 0 -1.23 -1.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.23f,
                    dy1 = -1.86f,
                )
                // M 27 26
                moveTo(x = 27.0f, y = 26.0f)
                // v 0.06
                verticalLineToRelative(dy = 0.06f)
                // A 1 1 0 0 1 25.94 27
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.94f,
                    y1 = 27.0f,
                )
                // c -6.51 -0.37 -11 -2.54 -14.11 -5.42
                curveToRelative(
                    dx1 = -6.51f,
                    dy1 = -0.37f,
                    dx2 = -11.0f,
                    dy2 = -2.54f,
                    dx3 = -14.11f,
                    dy3 = -5.42f,
                )
                // L 14 19.44
                lineTo(x = 14.0f, y = 19.44f)
                // A 10.8 10.8 0 0 0 19.88 22
                arcTo(
                    horizontalEllipseRadius = 10.8f,
                    verticalEllipseRadius = 10.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.88f,
                    y1 = 22.0f,
                )
                // l 0.48 0.06
                lineToRelative(dx = 0.48f, dy = 0.06f)
                // l 2.87 -2.85
                lineToRelative(dx = 2.87f, dy = -2.85f)
                // L 27 20.72z
                lineTo(x = 27.0f, y = 20.72f)
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
        }.build().also { _phoneOff = it }
    }

@Suppress("ObjectPropertyName")
private var _phoneOff: ImageVector? = null
