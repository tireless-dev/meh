package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthEuropeAfricaFilled: ImageVector
    get() {
        val current = _earthEuropeAfricaFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EarthEuropeAfricaFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M4 16 a12 12 0 0 1 5 -9.73 V9 a1 1 0 0 0 1 1 h3.38 a1 1 0 0 0 .9 -.55 L15 8 h4 v6 h-5.76 a1 1 0 0 0 -.45 .1 l-3.24 1.62 A1 1 0 0 0 9 16.62 v3.7 a1 1 0 0 0 .63 .93 L14 23 l.82 4.94 A12 12 0 0 1 4 16 m18 10.38 V23 l1.75 -2.63 a1 1 0 0 0 .14 -.8 L23 16 v-3 h4.6 A11.9 11.9 0 0 1 22 26.38
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // a 12 12 0 0 1 5 -9.73
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -9.73f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 3.38
                horizontalLineToRelative(dx = 3.38f)
                // a 1 1 0 0 0 0.9 -0.55
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = -0.55f,
                )
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -5.76
                horizontalLineToRelative(dx = -5.76f)
                // a 1 1 0 0 0 -0.45 0.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.45f,
                    dy1 = 0.1f,
                )
                // l -3.24 1.62
                lineToRelative(dx = -3.24f, dy = 1.62f)
                // A 1 1 0 0 0 9 16.62
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 16.62f,
                )
                // v 3.7
                verticalLineToRelative(dy = 3.7f)
                // a 1 1 0 0 0 0.63 0.93
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.63f,
                    dy1 = 0.93f,
                )
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // l 0.82 4.94
                lineToRelative(dx = 0.82f, dy = 4.94f)
                // A 12 12 0 0 1 4 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // m 18 10.38
                moveToRelative(dx = 18.0f, dy = 10.38f)
                // V 23
                verticalLineTo(y = 23.0f)
                // l 1.75 -2.63
                lineToRelative(dx = 1.75f, dy = -2.63f)
                // a 1 1 0 0 0 0.14 -0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.14f,
                    dy1 = -0.8f,
                )
                // L 23 16
                lineTo(x = 23.0f, y = 16.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 4.6
                horizontalLineToRelative(dx = 4.6f)
                // A 11.9 11.9 0 0 1 22 26.38
                arcTo(
                    horizontalEllipseRadius = 11.9f,
                    verticalEllipseRadius = 11.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 26.38f,
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
        }.build().also { _earthEuropeAfricaFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _earthEuropeAfricaFilled: ImageVector? = null
