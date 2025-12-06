package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MarineWarning: ImageVector
    get() {
        val current = _marineWarning
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MarineWarning",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 20 H7 a1 1 0 0 0 -.97 1.24 L6.97 25 h2.06 l-.75 -3 h15.44 l-.75 3 h2.06 l.94 -3.76 A1 1 0 0 0 25 20 H14 V3 a1 1 0 0 0 -1.8 -.6 l-10 13 A1 1 0 0 0 3 17 h9Z m-6.97 -5 L12 5.94 V15Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 -0.97 1.24
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = 1.24f,
                )
                // L 6.97 25
                lineTo(x = 6.97f, y = 25.0f)
                // h 2.06
                horizontalLineToRelative(dx = 2.06f)
                // l -0.75 -3
                lineToRelative(dx = -0.75f, dy = -3.0f)
                // h 15.44
                horizontalLineToRelative(dx = 15.44f)
                // l -0.75 3
                lineToRelative(dx = -0.75f, dy = 3.0f)
                // h 2.06
                horizontalLineToRelative(dx = 2.06f)
                // l 0.94 -3.76
                lineToRelative(dx = 0.94f, dy = -3.76f)
                // A 1 1 0 0 0 25 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 20.0f,
                )
                // H 14
                horizontalLineTo(x = 14.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 0 -1.8 -0.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = -0.6f,
                )
                // l -10 13
                lineToRelative(dx = -10.0f, dy = 13.0f)
                // A 1 1 0 0 0 3 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 17.0f,
                )
                // h 9z
                horizontalLineToRelative(dx = 9.0f)
                close()
                // m -6.97 -5
                moveToRelative(dx = -6.97f, dy = -5.0f)
                // L 12 5.94
                lineTo(x = 12.0f, y = 5.94f)
                // V 15z
                verticalLineTo(y = 15.0f)
                close()
            }
            // M26.9 25.75 A3 3 0 0 1 24 28 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 20 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 16 28 a3.4 3.4 0 0 1 -3.05 -2.32 A1 1 0 0 0 12 25 a1 1 0 0 0 -.95 .68 A3.4 3.4 0 0 1 8 28 a3 3 0 0 1 -2.9 -2.25 l-1.94 .5 A5 5 0 0 0 8 30 a5 5 0 0 0 4 -1.99 5.02 5.02 0 0 0 8 0 A5 5 0 0 0 24 30 a5 5 0 0 0 4.84 -3.75Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.9 25.75
                moveTo(x = 26.9f, y = 25.75f)
                // A 3 3 0 0 1 24 28
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 28.0f,
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
                // A 1 1 0 0 0 20 25
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 25.0f,
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
                // A 3.4 3.4 0 0 1 16 28
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.0f,
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
                // A 1 1 0 0 0 12 25
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 25.0f,
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
                // A 3.4 3.4 0 0 1 8 28
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 28.0f,
                )
                // a 3 3 0 0 1 -2.9 -2.25
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.9f,
                    dy1 = -2.25f,
                )
                // l -1.94 0.5
                lineToRelative(dx = -1.94f, dy = 0.5f)
                // A 5 5 0 0 0 8 30
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 30.0f,
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
                // a 5.02 5.02 0 0 0 8 0
                arcToRelative(
                    a = 5.02f,
                    b = 5.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // A 5 5 0 0 0 24 30
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 30.0f,
                )
                // a 5 5 0 0 0 4.84 -3.75z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.84f,
                    dy1 = -3.75f,
                )
                close()
            }
            // M23.75 10 h-1.5 V6 h1.5Z M23 11 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
            path {
                // M 23.75 10
                moveTo(x = 23.75f, y = 10.0f)
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 1.5z
                horizontalLineToRelative(dx = 1.5f)
                close()
                // M 23 11
                moveTo(x = 23.0f, y = 11.0f)
                // a 1 1 0 1 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M29.91 13.94 23.63 2.37 a.72 .72 0 0 0 -1.26 0 L16.1 13.94 A.72 .72 0 0 0 16.72 15 h12.56 a.72 .72 0 0 0 .63 -1.06 M22.25 6 h1.5 v4 h-1.5Z M23 13 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.91 13.94
                moveTo(x = 29.91f, y = 13.94f)
                // L 23.63 2.37
                lineTo(x = 23.63f, y = 2.37f)
                // a 0.72 0.72 0 0 0 -1.26 0
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.26f,
                    dy1 = 0.0f,
                )
                // L 16.1 13.94
                lineTo(x = 16.1f, y = 13.94f)
                // A 0.72 0.72 0 0 0 16.72 15
                arcTo(
                    horizontalEllipseRadius = 0.72f,
                    verticalEllipseRadius = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.72f,
                    y1 = 15.0f,
                )
                // h 12.56
                horizontalLineToRelative(dx = 12.56f)
                // a 0.72 0.72 0 0 0 0.63 -1.06
                arcToRelative(
                    a = 0.72f,
                    b = 0.72f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.63f,
                    dy1 = -1.06f,
                )
                // M 22.25 6
                moveTo(x = 22.25f, y = 6.0f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -1.5z
                horizontalLineToRelative(dx = -1.5f)
                close()
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _marineWarning = it }
    }

@Suppress("ObjectPropertyName")
private var _marineWarning: ImageVector? = null
