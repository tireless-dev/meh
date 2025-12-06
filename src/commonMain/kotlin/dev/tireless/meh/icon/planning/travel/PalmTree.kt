package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PalmTree: ImageVector
    get() {
        val current = _palmTree
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PalmTree",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M18.57 28 C17.9 26.73 16 22.23 16 12 v-.13 l1.12 .74 A6.5 6.5 0 0 1 20 18 h2 a8.5 8.5 0 0 0 -3.77 -7.05 L16.8 10 h1.53 a7 7 0 0 1 4.2 1.4 l1.87 1.4 1.2 -1.6 -1.87 -1.4 a9 9 0 0 0 -5.4 -1.8 h-1.21 A7 7 0 0 1 22 6 h2 V4 h-2 a9 9 0 0 0 -7 3.36 A9 9 0 0 0 8 4 H6 v2 h2 a7 7 0 0 1 4.88 2 h-1.21 a9 9 0 0 0 -5.4 1.8 L4.4 11.2 l1.2 1.6 1.87 -1.4 a7 7 0 0 1 4.2 -1.4 h1.53 l-1.43 .95 A8.5 8.5 0 0 0 8 18 h2 a6.5 6.5 0 0 1 2.88 -5.39 L14 11.87 V12 c0 8.94 1.41 13.76 2.36 16 H2 v2 h28 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18.57 28
                moveTo(x = 18.57f, y = 28.0f)
                // C 17.9 26.73 16 22.23 16 12
                curveTo(
                    x1 = 17.9f,
                    y1 = 26.73f,
                    x2 = 16.0f,
                    y2 = 22.23f,
                    x3 = 16.0f,
                    y3 = 12.0f,
                )
                // v -0.13
                verticalLineToRelative(dy = -0.13f)
                // l 1.12 0.74
                lineToRelative(dx = 1.12f, dy = 0.74f)
                // A 6.5 6.5 0 0 1 20 18
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 18.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 8.5 8.5 0 0 0 -3.77 -7.05
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.77f,
                    dy1 = -7.05f,
                )
                // L 16.8 10
                lineTo(x = 16.8f, y = 10.0f)
                // h 1.53
                horizontalLineToRelative(dx = 1.53f)
                // a 7 7 0 0 1 4.2 1.4
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.2f,
                    dy1 = 1.4f,
                )
                // l 1.87 1.4
                lineToRelative(dx = 1.87f, dy = 1.4f)
                // l 1.2 -1.6
                lineToRelative(dx = 1.2f, dy = -1.6f)
                // l -1.87 -1.4
                lineToRelative(dx = -1.87f, dy = -1.4f)
                // a 9 9 0 0 0 -5.4 -1.8
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.4f,
                    dy1 = -1.8f,
                )
                // h -1.21
                horizontalLineToRelative(dx = -1.21f)
                // A 7 7 0 0 1 22 6
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 6.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 9 9 0 0 0 -7 3.36
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 3.36f,
                )
                // A 9 9 0 0 0 8 4
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 4.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 7 7 0 0 1 4.88 2
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.88f,
                    dy1 = 2.0f,
                )
                // h -1.21
                horizontalLineToRelative(dx = -1.21f)
                // a 9 9 0 0 0 -5.4 1.8
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.4f,
                    dy1 = 1.8f,
                )
                // L 4.4 11.2
                lineTo(x = 4.4f, y = 11.2f)
                // l 1.2 1.6
                lineToRelative(dx = 1.2f, dy = 1.6f)
                // l 1.87 -1.4
                lineToRelative(dx = 1.87f, dy = -1.4f)
                // a 7 7 0 0 1 4.2 -1.4
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.2f,
                    dy1 = -1.4f,
                )
                // h 1.53
                horizontalLineToRelative(dx = 1.53f)
                // l -1.43 0.95
                lineToRelative(dx = -1.43f, dy = 0.95f)
                // A 8.5 8.5 0 0 0 8 18
                arcTo(
                    horizontalEllipseRadius = 8.5f,
                    verticalEllipseRadius = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 18.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 6.5 6.5 0 0 1 2.88 -5.39
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.88f,
                    dy1 = -5.39f,
                )
                // L 14 11.87
                lineTo(x = 14.0f, y = 11.87f)
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 8.94 1.41 13.76 2.36 16
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 8.94f,
                    dx2 = 1.41f,
                    dy2 = 13.76f,
                    dx3 = 2.36f,
                    dy3 = 16.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
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
        }.build().also { _palmTree = it }
    }

@Suppress("ObjectPropertyName")
private var _palmTree: ImageVector? = null
