package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TropicalStormTracks: ImageVector
    get() {
        val current = _tropicalStormTracks
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TropicalStormTracks",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 21 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5 m0 -8 a3 3 0 1 0 3 3 3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // a 5 5 0 1 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
            }
            // M26.86 12.48 a13 13 0 0 0 -4.86 -5 l.44 -.46 c.82 -.85 1.93 -1.98 3.27 -3.31 A1 1 0 0 0 25 2 c-.35 0 -8.74 .05 -14.27 4.3 A12 12 0 0 0 7.48 10 L7.02 9.56 3.71 6.29 A1 1 0 0 0 2 7 c0 .36 .05 8.87 4.4 14.4 a12 12 0 0 0 3.6 3.12 L9.34 25.2 6.3 28.3 A1 1 0 0 0 7 30 c.29 0 7.06 -.04 12.46 -3.1 a13 13 0 0 0 5.06 -4.9 l.68 .66 3.1 3.05 A1 1 0 0 0 30 25 c0 -.29 -.04 -7.11 -3.14 -12.52 m-3.03 6.1 -.55 1.38 a10.5 10.5 0 0 1 -4.81 5.2 24 24 0 0 1 -8.89 2.65 l3.83 -3.98 -1.37 -.55 a10 10 0 0 1 -4.06 -3.12 c-2.54 -3.22 -3.46 -7.76 -3.8 -10.58 l3.99 3.83 .55 -1.37 a10 10 0 0 1 3.23 -4.15 c3.22 -2.47 7.68 -3.38 10.47 -3.7 -.54 .54 -3.83 3.98 -3.83 3.98 l1.37 .55 a10.5 10.5 0 0 1 5.17 4.76 24 24 0 0 1 2.68 8.94z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.86 12.48
                moveTo(x = 26.86f, y = 12.48f)
                // a 13 13 0 0 0 -4.86 -5
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.86f,
                    dy1 = -5.0f,
                )
                // l 0.44 -0.46
                lineToRelative(dx = 0.44f, dy = -0.46f)
                // c 0.82 -0.85 1.93 -1.98 3.27 -3.31
                curveToRelative(
                    dx1 = 0.82f,
                    dy1 = -0.85f,
                    dx2 = 1.93f,
                    dy2 = -1.98f,
                    dx3 = 3.27f,
                    dy3 = -3.31f,
                )
                // A 1 1 0 0 0 25 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 2.0f,
                )
                // c -0.35 0 -8.74 0.05 -14.27 4.3
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = 0.0f,
                    dx2 = -8.74f,
                    dy2 = 0.05f,
                    dx3 = -14.27f,
                    dy3 = 4.3f,
                )
                // A 12 12 0 0 0 7.48 10
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.48f,
                    y1 = 10.0f,
                )
                // L 7.02 9.56
                lineTo(x = 7.02f, y = 9.56f)
                // L 3.71 6.29
                lineTo(x = 3.71f, y = 6.29f)
                // A 1 1 0 0 0 2 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 7.0f,
                )
                // c 0 0.36 0.05 8.87 4.4 14.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.36f,
                    dx2 = 0.05f,
                    dy2 = 8.87f,
                    dx3 = 4.4f,
                    dy3 = 14.4f,
                )
                // a 12 12 0 0 0 3.6 3.12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.6f,
                    dy1 = 3.12f,
                )
                // L 9.34 25.2
                lineTo(x = 9.34f, y = 25.2f)
                // L 6.3 28.3
                lineTo(x = 6.3f, y = 28.3f)
                // A 1 1 0 0 0 7 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 30.0f,
                )
                // c 0.29 0 7.06 -0.04 12.46 -3.1
                curveToRelative(
                    dx1 = 0.29f,
                    dy1 = 0.0f,
                    dx2 = 7.06f,
                    dy2 = -0.04f,
                    dx3 = 12.46f,
                    dy3 = -3.1f,
                )
                // a 13 13 0 0 0 5.06 -4.9
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.06f,
                    dy1 = -4.9f,
                )
                // l 0.68 0.66
                lineToRelative(dx = 0.68f, dy = 0.66f)
                // l 3.1 3.05
                lineToRelative(dx = 3.1f, dy = 3.05f)
                // A 1 1 0 0 0 30 25
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 25.0f,
                )
                // c 0 -0.29 -0.04 -7.11 -3.14 -12.52
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.29f,
                    dx2 = -0.04f,
                    dy2 = -7.11f,
                    dx3 = -3.14f,
                    dy3 = -12.52f,
                )
                // m -3.03 6.1
                moveToRelative(dx = -3.03f, dy = 6.1f)
                // l -0.55 1.38
                lineToRelative(dx = -0.55f, dy = 1.38f)
                // a 10.5 10.5 0 0 1 -4.81 5.2
                arcToRelative(
                    a = 10.5f,
                    b = 10.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.81f,
                    dy1 = 5.2f,
                )
                // a 24 24 0 0 1 -8.89 2.65
                arcToRelative(
                    a = 24.0f,
                    b = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.89f,
                    dy1 = 2.65f,
                )
                // l 3.83 -3.98
                lineToRelative(dx = 3.83f, dy = -3.98f)
                // l -1.37 -0.55
                lineToRelative(dx = -1.37f, dy = -0.55f)
                // a 10 10 0 0 1 -4.06 -3.12
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.06f,
                    dy1 = -3.12f,
                )
                // c -2.54 -3.22 -3.46 -7.76 -3.8 -10.58
                curveToRelative(
                    dx1 = -2.54f,
                    dy1 = -3.22f,
                    dx2 = -3.46f,
                    dy2 = -7.76f,
                    dx3 = -3.8f,
                    dy3 = -10.58f,
                )
                // l 3.99 3.83
                lineToRelative(dx = 3.99f, dy = 3.83f)
                // l 0.55 -1.37
                lineToRelative(dx = 0.55f, dy = -1.37f)
                // a 10 10 0 0 1 3.23 -4.15
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.23f,
                    dy1 = -4.15f,
                )
                // c 3.22 -2.47 7.68 -3.38 10.47 -3.7
                curveToRelative(
                    dx1 = 3.22f,
                    dy1 = -2.47f,
                    dx2 = 7.68f,
                    dy2 = -3.38f,
                    dx3 = 10.47f,
                    dy3 = -3.7f,
                )
                // c -0.54 0.54 -3.83 3.98 -3.83 3.98
                curveToRelative(
                    dx1 = -0.54f,
                    dy1 = 0.54f,
                    dx2 = -3.83f,
                    dy2 = 3.98f,
                    dx3 = -3.83f,
                    dy3 = 3.98f,
                )
                // l 1.37 0.55
                lineToRelative(dx = 1.37f, dy = 0.55f)
                // a 10.5 10.5 0 0 1 5.17 4.76
                arcToRelative(
                    a = 10.5f,
                    b = 10.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.17f,
                    dy1 = 4.76f,
                )
                // a 24 24 0 0 1 2.68 8.94z
                arcToRelative(
                    a = 24.0f,
                    b = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.68f,
                    dy1 = 8.94f,
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
        }.build().also { _tropicalStormTracks = it }
    }

@Suppress("ObjectPropertyName")
private var _tropicalStormTracks: ImageVector? = null
