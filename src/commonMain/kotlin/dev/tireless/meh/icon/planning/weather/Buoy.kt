package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Buoy: ImageVector
    get() {
        val current = _buoy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Buoy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 22 a3.4 3.4 0 0 1 -3.05 -2.32 1 1 0 0 0 -1.9 0 A3.4 3.4 0 0 1 20 22 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 16 19 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 12 22 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 8 19 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 4 22 H2 v2 h2 a5 5 0 0 0 4 -1.99 6 6 0 0 0 1 1 7 7 0 0 0 14 0 6 6 0 0 0 1 -1 A5 5 0 0 0 28 24 h2 v-2Z m-12 6 a5 5 0 0 1 -4.9 -4.09 A5 5 0 0 0 12 24 a5 5 0 0 0 4 -1.99 A5 5 0 0 0 20 24 a5 5 0 0 0 .9 -.09 A5 5 0 0 1 16 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 22
                moveTo(x = 28.0f, y = 22.0f)
                // a 3.4 3.4 0 0 1 -3.05 -2.32
                arcToRelative(
                    a = 3.4f,
                    b = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.05f,
                    dy1 = -2.32f,
                )
                // a 1 1 0 0 0 -1.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.9f,
                    dy1 = 0.0f,
                )
                // A 3.4 3.4 0 0 1 20 22
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 22.0f,
                )
                // a 3.4 3.4 0 0 1 -3.05 -2.32
                arcToRelative(
                    a = 3.4f,
                    b = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.05f,
                    dy1 = -2.32f,
                )
                // A 1 1 0 0 0 16 19
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 19.0f,
                )
                // a 1 1 0 0 0 -0.95 0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.95f,
                    dy1 = 0.68f,
                )
                // A 3.4 3.4 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // a 3.4 3.4 0 0 1 -3.05 -2.32
                arcToRelative(
                    a = 3.4f,
                    b = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.05f,
                    dy1 = -2.32f,
                )
                // A 1 1 0 0 0 8 19
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 19.0f,
                )
                // a 1 1 0 0 0 -0.95 0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.95f,
                    dy1 = 0.68f,
                )
                // A 3.4 3.4 0 0 1 4 22
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 22.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5 5 0 0 0 4 -1.99
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -1.99f,
                )
                // a 6 6 0 0 0 1 1
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // a 7 7 0 0 0 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 0 0 1 -1
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // A 5 5 0 0 0 28 24
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 24.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -12 6
                moveToRelative(dx = -12.0f, dy = 6.0f)
                // a 5 5 0 0 1 -4.9 -4.09
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.9f,
                    dy1 = -4.09f,
                )
                // A 5 5 0 0 0 12 24
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 24.0f,
                )
                // a 5 5 0 0 0 4 -1.99
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -1.99f,
                )
                // A 5 5 0 0 0 20 24
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 24.0f,
                )
                // a 5 5 0 0 0 0.9 -0.09
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = -0.09f,
                )
                // A 5 5 0 0 1 16 28
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.0f,
                )
            }
            // M20.07 7.83 a2 2 0 0 0 -2 -1.83 H17 V2 h-2 v4 h-1.08 a2 2 0 0 0 -1.99 1.77 L10.28 19 h2.02 l.74 -5 h5.92 l.73 5 h2.02Z M13.33 12 l.59 -4 4.16 .06 .58 3.94Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.07 7.83
                moveTo(x = 20.07f, y = 7.83f)
                // a 2 2 0 0 0 -2 -1.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -1.83f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -1.08
                horizontalLineToRelative(dx = -1.08f)
                // a 2 2 0 0 0 -1.99 1.77
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.99f,
                    dy1 = 1.77f,
                )
                // L 10.28 19
                lineTo(x = 10.28f, y = 19.0f)
                // h 2.02
                horizontalLineToRelative(dx = 2.02f)
                // l 0.74 -5
                lineToRelative(dx = 0.74f, dy = -5.0f)
                // h 5.92
                horizontalLineToRelative(dx = 5.92f)
                // l 0.73 5
                lineToRelative(dx = 0.73f, dy = 5.0f)
                // h 2.02z
                horizontalLineToRelative(dx = 2.02f)
                close()
                // M 13.33 12
                moveTo(x = 13.33f, y = 12.0f)
                // l 0.59 -4
                lineToRelative(dx = 0.59f, dy = -4.0f)
                // l 4.16 0.06
                lineToRelative(dx = 4.16f, dy = 0.06f)
                // l 0.58 3.94z
                lineToRelative(dx = 0.58f, dy = 3.94f)
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
        }.build().also { _buoy = it }
    }

@Suppress("ObjectPropertyName")
private var _buoy: ImageVector? = null
