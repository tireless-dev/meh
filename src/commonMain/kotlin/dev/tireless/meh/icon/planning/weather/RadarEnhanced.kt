package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RadarEnhanced: ImageVector
    get() {
        val current = _radarEnhanced
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RadarEnhanced",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 3.41 28.59 2 l-11.3 11.3 a1 1 0 1 0 1.42 1.4 l3.45 -3.45 A4.98 4.98 0 0 1 18 19 l-.6 -.05 a8 8 0 0 0 -4.35 -4.34 A4.9 4.9 0 0 1 18 9 V7 a7 7 0 0 0 -7 7 v.07 A8 8 0 0 0 10 14 a8 8 0 0 0 -1.99 .26 L8 14 A10 10 0 0 1 18 4 V2 A12 12 0 0 0 6 14 q0 .53 .05 1.05 a8 8 0 1 0 10.9 10.9 A12 12 0 0 0 18 26 a11.99 11.99 0 0 0 9.15 -19.74Z M15.91 21 h-1.95 a12 12 0 0 0 -1.22 -4.33 A6 6 0 0 1 15.9 21 M4.09 23 h1.95 a12 12 0 0 0 1.22 4.33 A6 6 0 0 1 4.1 23 m1.95 -2 H4.1 a6 6 0 0 1 3.17 -4.33 A12 12 0 0 0 6.04 21 M10 27.99 A10 10 0 0 1 8.06 23 h3.89 A10 10 0 0 1 10 27.99 M8.06 21 A10 10 0 0 1 10 16.02 10 10 0 0 1 11.94 21Z m4.68 6.33 A12 12 0 0 0 13.96 23 h1.95 a6 6 0 0 1 -3.17 4.33 M28 14 a10 10 0 0 1 -10 10 l-.26 -.01 a8 8 0 0 0 .19 -3 L18 21 a7 7 0 0 0 5.6 -11.2 l2.14 -2.12 A10 10 0 0 1 28 14
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 3.41
                moveTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // l -11.3 11.3
                lineToRelative(dx = -11.3f, dy = 11.3f)
                // a 1 1 0 1 0 1.42 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 1.4f,
                )
                // l 3.45 -3.45
                lineToRelative(dx = 3.45f, dy = -3.45f)
                // A 4.98 4.98 0 0 1 18 19
                arcTo(
                    horizontalEllipseRadius = 4.98f,
                    verticalEllipseRadius = 4.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 19.0f,
                )
                // l -0.6 -0.05
                lineToRelative(dx = -0.6f, dy = -0.05f)
                // a 8 8 0 0 0 -4.35 -4.34
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.35f,
                    dy1 = -4.34f,
                )
                // A 4.9 4.9 0 0 1 18 9
                arcTo(
                    horizontalEllipseRadius = 4.9f,
                    verticalEllipseRadius = 4.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 9.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 0.07
                verticalLineToRelative(dy = 0.07f)
                // A 8 8 0 0 0 10 14
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 14.0f,
                )
                // a 8 8 0 0 0 -1.99 0.26
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.99f,
                    dy1 = 0.26f,
                )
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
                // A 10 10 0 0 1 18 4
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 4.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // A 12 12 0 0 0 6 14
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 14.0f,
                )
                // q 0 0.53 0.05 1.05
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.53f,
                    dx2 = 0.05f,
                    dy2 = 1.05f,
                )
                // a 8 8 0 1 0 10.9 10.9
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 10.9f,
                    dy1 = 10.9f,
                )
                // A 12 12 0 0 0 18 26
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 26.0f,
                )
                // a 11.99 11.99 0 0 0 9.15 -19.74z
                arcToRelative(
                    a = 11.99f,
                    b = 11.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.15f,
                    dy1 = -19.74f,
                )
                close()
                // M 15.91 21
                moveTo(x = 15.91f, y = 21.0f)
                // h -1.95
                horizontalLineToRelative(dx = -1.95f)
                // a 12 12 0 0 0 -1.22 -4.33
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.22f,
                    dy1 = -4.33f,
                )
                // A 6 6 0 0 1 15.9 21
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.9f,
                    y1 = 21.0f,
                )
                // M 4.09 23
                moveTo(x = 4.09f, y = 23.0f)
                // h 1.95
                horizontalLineToRelative(dx = 1.95f)
                // a 12 12 0 0 0 1.22 4.33
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.22f,
                    dy1 = 4.33f,
                )
                // A 6 6 0 0 1 4.1 23
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.1f,
                    y1 = 23.0f,
                )
                // m 1.95 -2
                moveToRelative(dx = 1.95f, dy = -2.0f)
                // H 4.1
                horizontalLineTo(x = 4.1f)
                // a 6 6 0 0 1 3.17 -4.33
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.17f,
                    dy1 = -4.33f,
                )
                // A 12 12 0 0 0 6.04 21
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.04f,
                    y1 = 21.0f,
                )
                // M 10 27.99
                moveTo(x = 10.0f, y = 27.99f)
                // A 10 10 0 0 1 8.06 23
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.06f,
                    y1 = 23.0f,
                )
                // h 3.89
                horizontalLineToRelative(dx = 3.89f)
                // A 10 10 0 0 1 10 27.99
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 27.99f,
                )
                // M 8.06 21
                moveTo(x = 8.06f, y = 21.0f)
                // A 10 10 0 0 1 10 16.02
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 16.02f,
                )
                // A 10 10 0 0 1 11.94 21z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.94f,
                    y1 = 21.0f,
                )
                close()
                // m 4.68 6.33
                moveToRelative(dx = 4.68f, dy = 6.33f)
                // A 12 12 0 0 0 13.96 23
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.96f,
                    y1 = 23.0f,
                )
                // h 1.95
                horizontalLineToRelative(dx = 1.95f)
                // a 6 6 0 0 1 -3.17 4.33
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.17f,
                    dy1 = 4.33f,
                )
                // M 28 14
                moveTo(x = 28.0f, y = 14.0f)
                // a 10 10 0 0 1 -10 10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 10.0f,
                )
                // l -0.26 -0.01
                lineToRelative(dx = -0.26f, dy = -0.01f)
                // a 8 8 0 0 0 0.19 -3
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.19f,
                    dy1 = -3.0f,
                )
                // L 18 21
                lineTo(x = 18.0f, y = 21.0f)
                // a 7 7 0 0 0 5.6 -11.2
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.6f,
                    dy1 = -11.2f,
                )
                // l 2.14 -2.12
                lineToRelative(dx = 2.14f, dy = -2.12f)
                // A 10 10 0 0 1 28 14
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 14.0f,
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
        }.build().also { _radarEnhanced = it }
    }

@Suppress("ObjectPropertyName")
private var _radarEnhanced: ImageVector? = null
