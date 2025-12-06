package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoKeybase: ImageVector
    get() {
        val current = _logoKeybase
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoKeybase",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M14.12 26.93 a1.11 1.11 0 1 1 -1.1 -1.1 1.1 1.1 0 0 1 1.1 1.1
            path(
                fill = SolidColor(Color(0xFF2C2C2B)),
            ) {
                // M 14.12 26.93
                moveTo(x = 14.12f, y = 26.93f)
                // a 1.11 1.11 0 1 1 -1.1 -1.1
                arcToRelative(
                    a = 1.11f,
                    b = 1.11f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.1f,
                    dy1 = -1.1f,
                )
                // a 1.1 1.1 0 0 1 1.1 1.1
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 1.1f,
                )
            }
            // M21.03 26.93 a1.11 1.11 0 1 1 -1.12 -1.1 1.1 1.1 0 0 1 1.12 1.1
            path(
                fill = SolidColor(Color(0xFF2C2C2B)),
            ) {
                // M 21.03 26.93
                moveTo(x = 21.03f, y = 26.93f)
                // a 1.11 1.11 0 1 1 -1.12 -1.1
                arcToRelative(
                    a = 1.11f,
                    b = 1.11f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.12f,
                    dy1 = -1.1f,
                )
                // a 1.1 1.1 0 0 1 1.12 1.1
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.12f,
                    dy1 = 1.1f,
                )
            }
            // <rect width="1" height="1" x="9.999" y="5.797" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9.969875 6.74002
                moveTo(x = 9.969875f, y = 6.74002f)
                // l 0.061710536 -0.9980941
                lineToRelative(dx = 0.061710536f, dy = -0.9980941f)
                // l 0.9980941 0.061710536
                lineToRelative(dx = 0.9980941f, dy = 0.061710536f)
                // l -0.061710536 0.9980941z
                lineToRelative(dx = -0.061710536f, dy = 0.9980941f)
                close()
            }
            // M26.43 16.38 a13 13 0 0 0 -5.15 -4.18 14 14 0 0 0 -1.13 -.44 l.04 -.1 a4.83 4.83 0 0 0 -2.99 -6.32 6 6 0 0 0 -2 -.35 C15.18 4.86 15.1 4.3 15.8 2.83 L14.37 2 l-.33 .47 -1.1 1.55 a2.2 2.2 0 0 0 -1.45 -.68 l-1.64 -.1 H9.72 a2.2 2.2 0 0 0 -2.18 2.04 l-.1 1.64 a2.2 2.2 0 0 0 2.05 2.31 l1.16 .07 A5 5 0 0 0 11.12 12 a13 13 0 0 0 -4.26 2.9 C3 18.79 3 23.06 3 26.49 v2.07 l1.52 -1.61 A12 12 0 0 0 5.85 30 h1.99 a11 11 0 0 1 -1.96 -4.49 l2.23 -2.37 -1.15 3.6 L9 25.28 c3.59 -2.61 7.87 -3.21 12.73 -1.78 a4.6 4.6 0 0 0 5.22 -1.47 l.12 -.2 a10 10 0 0 1 .16 1.75 12.4 12.4 0 0 1 -1.6 6.43 h1.87 a14.4 14.4 0 0 0 1.38 -6.43 12.3 12.3 0 0 0 -2.44 -7.19 M13.85 5.93 a1.6 1.6 0 0 0 1.4 .7 4 4 0 0 1 1.43 .27 3.17 3.17 0 0 1 1.03 5.47 l-.47 -.59 a1.7 1.7 0 0 0 -3.03 .99 3.2 3.2 0 0 1 -1.9 -3.55 8.5 8.5 0 0 1 1.44 -3.46z m3.49 9.25 -.61 .5 a.27 .27 0 0 1 -.38 -.04 l-.12 -.15 a.3 .3 0 0 1 .04 -.4 l.6 -.48 -1.24 -1.52 a.36 .36 0 1 1 .56 -.46 l3.46 4.25 a.36 .36 0 0 1 -.2 .59 h-.08 a.4 .4 0 0 1 -.29 -.13 l-.34 -.42 -1.22 1 a.3 .3 0 0 1 -.4 -.05 l-.55 -.67 a.3 .3 0 0 1 .04 -.4 l1.23 -1Z M9.08 7.02 l.1 -1.64 a.54 .54 0 0 1 .54 -.5 h.03 l1.64 .1 a.54 .54 0 0 1 .5 .57 v.12 a11 11 0 0 0 -.9 2 L9.58 7.6 a.54 .54 0 0 1 -.51 -.57 m16.51 14.05 a3 3 0 0 1 -3.4 .84 c-4.54 -1.33 -8.64 -1.06 -12.22 .82 l1.9 -5.98 -7.2 7.64 a11.7 11.7 0 0 1 3.36 -8.34 11.5 11.5 0 0 1 4.1 -2.7 5.4 5.4 0 0 0 2.25 1.23 l.56 .12 a1.6 1.6 0 0 0 .24 1.64 l.09 .1 a1.6 1.6 0 0 0 .26 1.6 l.55 .69 a1.63 1.63 0 0 0 2.3 .23 l.32 -.27 a1.7 1.7 0 0 0 1.99 -2.66 l-1.94 -2.39 a5 5 0 0 0 .48 -.45 13 13 0 0 1 1.39 .51 11.4 11.4 0 0 1 4.5 3.69 c.98 1.34 1.15 2.71 .47 3.68
            path(
                fill = SolidColor(Color(0xFF2C2C2B)),
            ) {
                // M 26.43 16.38
                moveTo(x = 26.43f, y = 16.38f)
                // a 13 13 0 0 0 -5.15 -4.18
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.15f,
                    dy1 = -4.18f,
                )
                // a 14 14 0 0 0 -1.13 -0.44
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.13f,
                    dy1 = -0.44f,
                )
                // l 0.04 -0.1
                lineToRelative(dx = 0.04f, dy = -0.1f)
                // a 4.83 4.83 0 0 0 -2.99 -6.32
                arcToRelative(
                    a = 4.83f,
                    b = 4.83f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.99f,
                    dy1 = -6.32f,
                )
                // a 6 6 0 0 0 -2 -0.35
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -0.35f,
                )
                // C 15.18 4.86 15.1 4.3 15.8 2.83
                curveTo(
                    x1 = 15.18f,
                    y1 = 4.86f,
                    x2 = 15.1f,
                    y2 = 4.3f,
                    x3 = 15.8f,
                    y3 = 2.83f,
                )
                // L 14.37 2
                lineTo(x = 14.37f, y = 2.0f)
                // l -0.33 0.47
                lineToRelative(dx = -0.33f, dy = 0.47f)
                // l -1.1 1.55
                lineToRelative(dx = -1.1f, dy = 1.55f)
                // a 2.2 2.2 0 0 0 -1.45 -0.68
                arcToRelative(
                    a = 2.2f,
                    b = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.45f,
                    dy1 = -0.68f,
                )
                // l -1.64 -0.1
                lineToRelative(dx = -1.64f, dy = -0.1f)
                // H 9.72
                horizontalLineTo(x = 9.72f)
                // a 2.2 2.2 0 0 0 -2.18 2.04
                arcToRelative(
                    a = 2.2f,
                    b = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.18f,
                    dy1 = 2.04f,
                )
                // l -0.1 1.64
                lineToRelative(dx = -0.1f, dy = 1.64f)
                // a 2.2 2.2 0 0 0 2.05 2.31
                arcToRelative(
                    a = 2.2f,
                    b = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.05f,
                    dy1 = 2.31f,
                )
                // l 1.16 0.07
                lineToRelative(dx = 1.16f, dy = 0.07f)
                // A 5 5 0 0 0 11.12 12
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.12f,
                    y1 = 12.0f,
                )
                // a 13 13 0 0 0 -4.26 2.9
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.26f,
                    dy1 = 2.9f,
                )
                // C 3 18.79 3 23.06 3 26.49
                curveTo(
                    x1 = 3.0f,
                    y1 = 18.79f,
                    x2 = 3.0f,
                    y2 = 23.06f,
                    x3 = 3.0f,
                    y3 = 26.49f,
                )
                // v 2.07
                verticalLineToRelative(dy = 2.07f)
                // l 1.52 -1.61
                lineToRelative(dx = 1.52f, dy = -1.61f)
                // A 12 12 0 0 0 5.85 30
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.85f,
                    y1 = 30.0f,
                )
                // h 1.99
                horizontalLineToRelative(dx = 1.99f)
                // a 11 11 0 0 1 -1.96 -4.49
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.96f,
                    dy1 = -4.49f,
                )
                // l 2.23 -2.37
                lineToRelative(dx = 2.23f, dy = -2.37f)
                // l -1.15 3.6
                lineToRelative(dx = -1.15f, dy = 3.6f)
                // L 9 25.28
                lineTo(x = 9.0f, y = 25.28f)
                // c 3.59 -2.61 7.87 -3.21 12.73 -1.78
                curveToRelative(
                    dx1 = 3.59f,
                    dy1 = -2.61f,
                    dx2 = 7.87f,
                    dy2 = -3.21f,
                    dx3 = 12.73f,
                    dy3 = -1.78f,
                )
                // a 4.6 4.6 0 0 0 5.22 -1.47
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.22f,
                    dy1 = -1.47f,
                )
                // l 0.12 -0.2
                lineToRelative(dx = 0.12f, dy = -0.2f)
                // a 10 10 0 0 1 0.16 1.75
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.16f,
                    dy1 = 1.75f,
                )
                // a 12.4 12.4 0 0 1 -1.6 6.43
                arcToRelative(
                    a = 12.4f,
                    b = 12.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = 6.43f,
                )
                // h 1.87
                horizontalLineToRelative(dx = 1.87f)
                // a 14.4 14.4 0 0 0 1.38 -6.43
                arcToRelative(
                    a = 14.4f,
                    b = 14.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.38f,
                    dy1 = -6.43f,
                )
                // a 12.3 12.3 0 0 0 -2.44 -7.19
                arcToRelative(
                    a = 12.3f,
                    b = 12.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.44f,
                    dy1 = -7.19f,
                )
                // M 13.85 5.93
                moveTo(x = 13.85f, y = 5.93f)
                // a 1.6 1.6 0 0 0 1.4 0.7
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.7f,
                )
                // a 4 4 0 0 1 1.43 0.27
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.43f,
                    dy1 = 0.27f,
                )
                // a 3.17 3.17 0 0 1 1.03 5.47
                arcToRelative(
                    a = 3.17f,
                    b = 3.17f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.03f,
                    dy1 = 5.47f,
                )
                // l -0.47 -0.59
                lineToRelative(dx = -0.47f, dy = -0.59f)
                // a 1.7 1.7 0 0 0 -3.03 0.99
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.03f,
                    dy1 = 0.99f,
                )
                // a 3.2 3.2 0 0 1 -1.9 -3.55
                arcToRelative(
                    a = 3.2f,
                    b = 3.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.9f,
                    dy1 = -3.55f,
                )
                // a 8.5 8.5 0 0 1 1.44 -3.46z
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.44f,
                    dy1 = -3.46f,
                )
                close()
                // m 3.49 9.25
                moveToRelative(dx = 3.49f, dy = 9.25f)
                // l -0.61 0.5
                lineToRelative(dx = -0.61f, dy = 0.5f)
                // a 0.27 0.27 0 0 1 -0.38 -0.04
                arcToRelative(
                    a = 0.27f,
                    b = 0.27f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.38f,
                    dy1 = -0.04f,
                )
                // l -0.12 -0.15
                lineToRelative(dx = -0.12f, dy = -0.15f)
                // a 0.3 0.3 0 0 1 0.04 -0.4
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.04f,
                    dy1 = -0.4f,
                )
                // l 0.6 -0.48
                lineToRelative(dx = 0.6f, dy = -0.48f)
                // l -1.24 -1.52
                lineToRelative(dx = -1.24f, dy = -1.52f)
                // a 0.36 0.36 0 1 1 0.56 -0.46
                arcToRelative(
                    a = 0.36f,
                    b = 0.36f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.56f,
                    dy1 = -0.46f,
                )
                // l 3.46 4.25
                lineToRelative(dx = 3.46f, dy = 4.25f)
                // a 0.36 0.36 0 0 1 -0.2 0.59
                arcToRelative(
                    a = 0.36f,
                    b = 0.36f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.2f,
                    dy1 = 0.59f,
                )
                // h -0.08
                horizontalLineToRelative(dx = -0.08f)
                // a 0.4 0.4 0 0 1 -0.29 -0.13
                arcToRelative(
                    a = 0.4f,
                    b = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.29f,
                    dy1 = -0.13f,
                )
                // l -0.34 -0.42
                lineToRelative(dx = -0.34f, dy = -0.42f)
                // l -1.22 1
                lineToRelative(dx = -1.22f, dy = 1.0f)
                // a 0.3 0.3 0 0 1 -0.4 -0.05
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.4f,
                    dy1 = -0.05f,
                )
                // l -0.55 -0.67
                lineToRelative(dx = -0.55f, dy = -0.67f)
                // a 0.3 0.3 0 0 1 0.04 -0.4
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.04f,
                    dy1 = -0.4f,
                )
                // l 1.23 -1z
                lineToRelative(dx = 1.23f, dy = -1.0f)
                close()
                // M 9.08 7.02
                moveTo(x = 9.08f, y = 7.02f)
                // l 0.1 -1.64
                lineToRelative(dx = 0.1f, dy = -1.64f)
                // a 0.54 0.54 0 0 1 0.54 -0.5
                arcToRelative(
                    a = 0.54f,
                    b = 0.54f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.54f,
                    dy1 = -0.5f,
                )
                // h 0.03
                horizontalLineToRelative(dx = 0.03f)
                // l 1.64 0.1
                lineToRelative(dx = 1.64f, dy = 0.1f)
                // a 0.54 0.54 0 0 1 0.5 0.57
                arcToRelative(
                    a = 0.54f,
                    b = 0.54f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 0.57f,
                )
                // v 0.12
                verticalLineToRelative(dy = 0.12f)
                // a 11 11 0 0 0 -0.9 2
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 2.0f,
                )
                // L 9.58 7.6
                lineTo(x = 9.58f, y = 7.6f)
                // a 0.54 0.54 0 0 1 -0.51 -0.57
                arcToRelative(
                    a = 0.54f,
                    b = 0.54f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.51f,
                    dy1 = -0.57f,
                )
                // m 16.51 14.05
                moveToRelative(dx = 16.51f, dy = 14.05f)
                // a 3 3 0 0 1 -3.4 0.84
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.4f,
                    dy1 = 0.84f,
                )
                // c -4.54 -1.33 -8.64 -1.06 -12.22 0.82
                curveToRelative(
                    dx1 = -4.54f,
                    dy1 = -1.33f,
                    dx2 = -8.64f,
                    dy2 = -1.06f,
                    dx3 = -12.22f,
                    dy3 = 0.82f,
                )
                // l 1.9 -5.98
                lineToRelative(dx = 1.9f, dy = -5.98f)
                // l -7.2 7.64
                lineToRelative(dx = -7.2f, dy = 7.64f)
                // a 11.7 11.7 0 0 1 3.36 -8.34
                arcToRelative(
                    a = 11.7f,
                    b = 11.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.36f,
                    dy1 = -8.34f,
                )
                // a 11.5 11.5 0 0 1 4.1 -2.7
                arcToRelative(
                    a = 11.5f,
                    b = 11.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.1f,
                    dy1 = -2.7f,
                )
                // a 5.4 5.4 0 0 0 2.25 1.23
                arcToRelative(
                    a = 5.4f,
                    b = 5.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.25f,
                    dy1 = 1.23f,
                )
                // l 0.56 0.12
                lineToRelative(dx = 0.56f, dy = 0.12f)
                // a 1.6 1.6 0 0 0 0.24 1.64
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.24f,
                    dy1 = 1.64f,
                )
                // l 0.09 0.1
                lineToRelative(dx = 0.09f, dy = 0.1f)
                // a 1.6 1.6 0 0 0 0.26 1.6
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.26f,
                    dy1 = 1.6f,
                )
                // l 0.55 0.69
                lineToRelative(dx = 0.55f, dy = 0.69f)
                // a 1.63 1.63 0 0 0 2.3 0.23
                arcToRelative(
                    a = 1.63f,
                    b = 1.63f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.3f,
                    dy1 = 0.23f,
                )
                // l 0.32 -0.27
                lineToRelative(dx = 0.32f, dy = -0.27f)
                // a 1.7 1.7 0 0 0 1.99 -2.66
                arcToRelative(
                    a = 1.7f,
                    b = 1.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.99f,
                    dy1 = -2.66f,
                )
                // l -1.94 -2.39
                lineToRelative(dx = -1.94f, dy = -2.39f)
                // a 5 5 0 0 0 0.48 -0.45
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.48f,
                    dy1 = -0.45f,
                )
                // a 13 13 0 0 1 1.39 0.51
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.39f,
                    dy1 = 0.51f,
                )
                // a 11.4 11.4 0 0 1 4.5 3.69
                arcToRelative(
                    a = 11.4f,
                    b = 11.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.5f,
                    dy1 = 3.69f,
                )
                // c 0.98 1.34 1.15 2.71 0.47 3.68
                curveToRelative(
                    dx1 = 0.98f,
                    dy1 = 1.34f,
                    dx2 = 1.15f,
                    dy2 = 2.71f,
                    dx3 = 0.47f,
                    dy3 = 3.68f,
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
        }.build().also { _logoKeybase = it }
    }

@Suppress("ObjectPropertyName")
private var _logoKeybase: ImageVector? = null
