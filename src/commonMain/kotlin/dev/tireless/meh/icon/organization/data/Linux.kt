package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Linux: ImageVector
    get() {
        val current = _linux
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Linux",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.9 23.54 -1.73 -3.45 a2 2 0 0 0 -1.79 -1.1 h-.47 a15 15 0 0 0 -1.82 -4.6 C23.06 12.44 22 10.43 22 8 a6 6 0 0 0 -12 0 13 13 0 0 1 -2.05 6.22 15 15 0 0 0 -1.87 4.77 H5.62 a2 2 0 0 0 -1.8 1.1 l-1.71 3.45 a1 1 0 0 0 .1 1.05 l4.02 5.33 a3 3 0 0 0 3.85 .65 l1.87 -1.12 A14 14 0 0 0 16 30 a14 14 0 0 0 4.05 -.55 l1.87 1.12 A3 3 0 0 0 23.46 31 a3 3 0 0 0 2.34 -1.12 l4 -5.29 a1 1 0 0 0 .1 -1.05 m-7.57 -8.21 a15 15 0 0 1 1.56 3.66 h-2.15 a17 17 0 0 0 -.98 -2.65 13 13 0 0 1 -.88 -2.44 9 9 0 0 0 1 -1.43 l.04 -.07 a31 31 0 0 0 1.4 2.93 M12 21 a9 9 0 0 1 1.07 -3.85 22 22 0 0 0 .73 -1.8 4 4 0 0 0 4.4 0 22 22 0 0 0 .73 1.8 A9 9 0 0 1 20 21 c0 1.29 -.41 3 -4 3 s-4 -1.71 -4 -3 m6.51 -8.58 A3.6 3.6 0 0 1 16 14 a3.6 3.6 0 0 1 -2.51 -1.58 7.6 7.6 0 0 1 5.02 0 M12 8 a4 4 0 0 1 8 0 11 11 0 0 0 .47 3.12 A8 8 0 0 0 19 10.48 V8 h-2 v2.05 a9 9 0 0 0 -2 0 V8 h-2 v2.48 a8 8 0 0 0 -1.48 .64 A11 11 0 0 0 12 8 m-2.29 7.16 a30 30 0 0 0 1.36 -2.78 l.05 .09 a9 9 0 0 0 1 1.43 13 13 0 0 1 -.88 2.44 A17 17 0 0 0 10.26 19 H8.1 a14 14 0 0 1 1.61 -3.83 m1.38 12.48 -2.04 1.22 a1 1 0 0 1 -1.25 -.18 l-3.63 -4.8 L5.62 21 h3.7 l2.17 5.4 a1 1 0 0 1 -.4 1.25 m2.31 .11 a3 3 0 0 0 -.05 -2.1 A9 9 0 0 0 16 26 a9 9 0 0 0 2.66 -.36 3 3 0 0 0 -.06 2.11 14 14 0 0 1 -5.2 0 m10.83 .89 a1 1 0 0 1 -1.28 .22 l-2.04 -1.23 a1 1 0 0 1 -.4 -1.27 L22.69 21 h3.7 l1.45 2.9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.9 23.54
                moveTo(x = 29.9f, y = 23.54f)
                // l -1.73 -3.45
                lineToRelative(dx = -1.73f, dy = -3.45f)
                // a 2 2 0 0 0 -1.79 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.79f,
                    dy1 = -1.1f,
                )
                // h -0.47
                horizontalLineToRelative(dx = -0.47f)
                // a 15 15 0 0 0 -1.82 -4.6
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.82f,
                    dy1 = -4.6f,
                )
                // C 23.06 12.44 22 10.43 22 8
                curveTo(
                    x1 = 23.06f,
                    y1 = 12.44f,
                    x2 = 22.0f,
                    y2 = 10.43f,
                    x3 = 22.0f,
                    y3 = 8.0f,
                )
                // a 6 6 0 0 0 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                // a 13 13 0 0 1 -2.05 6.22
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.05f,
                    dy1 = 6.22f,
                )
                // a 15 15 0 0 0 -1.87 4.77
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.87f,
                    dy1 = 4.77f,
                )
                // H 5.62
                horizontalLineTo(x = 5.62f)
                // a 2 2 0 0 0 -1.8 1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 1.1f,
                )
                // l -1.71 3.45
                lineToRelative(dx = -1.71f, dy = 3.45f)
                // a 1 1 0 0 0 0.1 1.05
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.1f,
                    dy1 = 1.05f,
                )
                // l 4.02 5.33
                lineToRelative(dx = 4.02f, dy = 5.33f)
                // a 3 3 0 0 0 3.85 0.65
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.85f,
                    dy1 = 0.65f,
                )
                // l 1.87 -1.12
                lineToRelative(dx = 1.87f, dy = -1.12f)
                // A 14 14 0 0 0 16 30
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
                // a 14 14 0 0 0 4.05 -0.55
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.05f,
                    dy1 = -0.55f,
                )
                // l 1.87 1.12
                lineToRelative(dx = 1.87f, dy = 1.12f)
                // A 3 3 0 0 0 23.46 31
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.46f,
                    y1 = 31.0f,
                )
                // a 3 3 0 0 0 2.34 -1.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.34f,
                    dy1 = -1.12f,
                )
                // l 4 -5.29
                lineToRelative(dx = 4.0f, dy = -5.29f)
                // a 1 1 0 0 0 0.1 -1.05
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.1f,
                    dy1 = -1.05f,
                )
                // m -7.57 -8.21
                moveToRelative(dx = -7.57f, dy = -8.21f)
                // a 15 15 0 0 1 1.56 3.66
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.56f,
                    dy1 = 3.66f,
                )
                // h -2.15
                horizontalLineToRelative(dx = -2.15f)
                // a 17 17 0 0 0 -0.98 -2.65
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.98f,
                    dy1 = -2.65f,
                )
                // a 13 13 0 0 1 -0.88 -2.44
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.88f,
                    dy1 = -2.44f,
                )
                // a 9 9 0 0 0 1 -1.43
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.43f,
                )
                // l 0.04 -0.07
                lineToRelative(dx = 0.04f, dy = -0.07f)
                // a 31 31 0 0 0 1.4 2.93
                arcToRelative(
                    a = 31.0f,
                    b = 31.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 2.93f,
                )
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // a 9 9 0 0 1 1.07 -3.85
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.07f,
                    dy1 = -3.85f,
                )
                // a 22 22 0 0 0 0.73 -1.8
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = -1.8f,
                )
                // a 4 4 0 0 0 4.4 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.4f,
                    dy1 = 0.0f,
                )
                // a 22 22 0 0 0 0.73 1.8
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = 1.8f,
                )
                // A 9 9 0 0 1 20 21
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 21.0f,
                )
                // c 0 1.29 -0.41 3 -4 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.29f,
                    dx2 = -0.41f,
                    dy2 = 3.0f,
                    dx3 = -4.0f,
                    dy3 = 3.0f,
                )
                // s -4 -1.71 -4 -3
                reflectiveCurveToRelative(
                    dx1 = -4.0f,
                    dy1 = -1.71f,
                    dx2 = -4.0f,
                    dy2 = -3.0f,
                )
                // m 6.51 -8.58
                moveToRelative(dx = 6.51f, dy = -8.58f)
                // A 3.6 3.6 0 0 1 16 14
                arcTo(
                    horizontalEllipseRadius = 3.6f,
                    verticalEllipseRadius = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 14.0f,
                )
                // a 3.6 3.6 0 0 1 -2.51 -1.58
                arcToRelative(
                    a = 3.6f,
                    b = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.51f,
                    dy1 = -1.58f,
                )
                // a 7.6 7.6 0 0 1 5.02 0
                arcToRelative(
                    a = 7.6f,
                    b = 7.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.02f,
                    dy1 = 0.0f,
                )
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // a 4 4 0 0 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 11 11 0 0 0 0.47 3.12
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.47f,
                    dy1 = 3.12f,
                )
                // A 8 8 0 0 0 19 10.48
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 10.48f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.05
                verticalLineToRelative(dy = 2.05f)
                // a 9 9 0 0 0 -2 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.48
                verticalLineToRelative(dy = 2.48f)
                // a 8 8 0 0 0 -1.48 0.64
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.48f,
                    dy1 = 0.64f,
                )
                // A 11 11 0 0 0 12 8
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 8.0f,
                )
                // m -2.29 7.16
                moveToRelative(dx = -2.29f, dy = 7.16f)
                // a 30 30 0 0 0 1.36 -2.78
                arcToRelative(
                    a = 30.0f,
                    b = 30.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.36f,
                    dy1 = -2.78f,
                )
                // l 0.05 0.09
                lineToRelative(dx = 0.05f, dy = 0.09f)
                // a 9 9 0 0 0 1 1.43
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.43f,
                )
                // a 13 13 0 0 1 -0.88 2.44
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.88f,
                    dy1 = 2.44f,
                )
                // A 17 17 0 0 0 10.26 19
                arcTo(
                    horizontalEllipseRadius = 17.0f,
                    verticalEllipseRadius = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.26f,
                    y1 = 19.0f,
                )
                // H 8.1
                horizontalLineTo(x = 8.1f)
                // a 14 14 0 0 1 1.61 -3.83
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.61f,
                    dy1 = -3.83f,
                )
                // m 1.38 12.48
                moveToRelative(dx = 1.38f, dy = 12.48f)
                // l -2.04 1.22
                lineToRelative(dx = -2.04f, dy = 1.22f)
                // a 1 1 0 0 1 -1.25 -0.18
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.25f,
                    dy1 = -0.18f,
                )
                // l -3.63 -4.8
                lineToRelative(dx = -3.63f, dy = -4.8f)
                // L 5.62 21
                lineTo(x = 5.62f, y = 21.0f)
                // h 3.7
                horizontalLineToRelative(dx = 3.7f)
                // l 2.17 5.4
                lineToRelative(dx = 2.17f, dy = 5.4f)
                // a 1 1 0 0 1 -0.4 1.25
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = 1.25f,
                )
                // m 2.31 0.11
                moveToRelative(dx = 2.31f, dy = 0.11f)
                // a 3 3 0 0 0 -0.05 -2.1
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.05f,
                    dy1 = -2.1f,
                )
                // A 9 9 0 0 0 16 26
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 26.0f,
                )
                // a 9 9 0 0 0 2.66 -0.36
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.66f,
                    dy1 = -0.36f,
                )
                // a 3 3 0 0 0 -0.06 2.11
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = 2.11f,
                )
                // a 14 14 0 0 1 -5.2 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.2f,
                    dy1 = 0.0f,
                )
                // m 10.83 0.89
                moveToRelative(dx = 10.83f, dy = 0.89f)
                // a 1 1 0 0 1 -1.28 0.22
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.28f,
                    dy1 = 0.22f,
                )
                // l -2.04 -1.23
                lineToRelative(dx = -2.04f, dy = -1.23f)
                // a 1 1 0 0 1 -0.4 -1.27
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = -1.27f,
                )
                // L 22.69 21
                lineTo(x = 22.69f, y = 21.0f)
                // h 3.7
                horizontalLineToRelative(dx = 3.7f)
                // l 1.45 2.9z
                lineToRelative(dx = 1.45f, dy = 2.9f)
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
        }.build().also { _linux = it }
    }

@Suppress("ObjectPropertyName")
private var _linux: ImageVector? = null
