package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RainHeavy: ImageVector
    get() {
        val current = _rainHeavy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RainHeavy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 30 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 17 30 m-9 0 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 8 30
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 30
                moveTo(x = 17.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // a 1 1 0 1 1 1.8 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.9f,
                )
                // l -2 4
                lineToRelative(dx = -2.0f, dy = 4.0f)
                // A 1 1 0 0 1 17 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 30.0f,
                )
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // a 1 1 0 1 1 1.8 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.9f,
                )
                // l -2 4
                lineToRelative(dx = -2.0f, dy = 4.0f)
                // A 1 1 0 0 1 8 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 30.0f,
                )
            }
            // M30 15.5 a6.5 6.5 0 0 0 -5.2 -6.36 9 9 0 0 0 -17.6 0 6.49 6.49 0 0 0 -1.5 12.22 l-1.6 3.2 a1 1 0 1 0 1.8 .89 L7.61 22 h6.76 l-1.27 2.55 a1 1 0 1 0 1.78 .9 L16.62 22 h6.76 l-1.27 2.55 a1 1 0 1 0 1.78 .9 l1.95 -3.9 A6.5 6.5 0 0 0 30 15.5 M23.5 20 h-15 a4.5 4.5 0 0 1 -.36 -8.98 l.82 -.06 .1 -.82 a7 7 0 0 1 13.88 0 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 20
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15.5
                moveTo(x = 30.0f, y = 15.5f)
                // a 6.5 6.5 0 0 0 -5.2 -6.36
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.2f,
                    dy1 = -6.36f,
                )
                // a 9 9 0 0 0 -17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -17.6f,
                    dy1 = 0.0f,
                )
                // a 6.49 6.49 0 0 0 -1.5 12.22
                arcToRelative(
                    a = 6.49f,
                    b = 6.49f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = 12.22f,
                )
                // l -1.6 3.2
                lineToRelative(dx = -1.6f, dy = 3.2f)
                // a 1 1 0 1 0 1.8 0.89
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = 0.89f,
                )
                // L 7.61 22
                lineTo(x = 7.61f, y = 22.0f)
                // h 6.76
                horizontalLineToRelative(dx = 6.76f)
                // l -1.27 2.55
                lineToRelative(dx = -1.27f, dy = 2.55f)
                // a 1 1 0 1 0 1.78 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.9f,
                )
                // L 16.62 22
                lineTo(x = 16.62f, y = 22.0f)
                // h 6.76
                horizontalLineToRelative(dx = 6.76f)
                // l -1.27 2.55
                lineToRelative(dx = -1.27f, dy = 2.55f)
                // a 1 1 0 1 0 1.78 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.9f,
                )
                // l 1.95 -3.9
                lineToRelative(dx = 1.95f, dy = -3.9f)
                // A 6.5 6.5 0 0 0 30 15.5
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 15.5f,
                )
                // M 23.5 20
                moveTo(x = 23.5f, y = 20.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // a 4.5 4.5 0 0 1 -0.36 -8.98
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.36f,
                    dy1 = -8.98f,
                )
                // l 0.82 -0.06
                lineToRelative(dx = 0.82f, dy = -0.06f)
                // l 0.1 -0.82
                lineToRelative(dx = 0.1f, dy = -0.82f)
                // a 7 7 0 0 1 13.88 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.88f,
                    dy1 = 0.0f,
                )
                // l 0.1 0.82
                lineToRelative(dx = 0.1f, dy = 0.82f)
                // l 0.82 0.06
                lineToRelative(dx = 0.82f, dy = 0.06f)
                // A 4.5 4.5 0 0 1 23.5 20
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 20.0f,
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
        }.build().also { _rainHeavy = it }
    }

@Suppress("ObjectPropertyName")
private var _rainHeavy: ImageVector? = null
