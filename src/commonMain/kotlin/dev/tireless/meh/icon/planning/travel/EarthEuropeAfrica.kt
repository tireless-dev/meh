package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthEuropeAfrica: ImageVector
    get() {
        val current = _earthEuropeAfrica
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EarthEuropeAfrica",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M4 16 a12 12 0 0 1 4 -8.92 V9 a2 2 0 0 0 2 2 h3.38 a2 2 0 0 0 1.8 -1.1 L15.61 9 H18 v4 h-4.76 a2 2 0 0 0 -.9 .21 l-3.23 1.62 A2 2 0 0 0 8 16.62 v3.7 a2 2 0 0 0 1.26 1.86 l3.85 1.54 .67 4.07 A12 12 0 0 1 4 16 m11.85 12 -.96 -5.72 L10 20.32 v-3.7 L13.24 15 H20 V7 h-5.62 l-1 2 H10 V5.62 A11.96 11.96 0 0 1 27.3 12 H22 v4 l.92 3.81 L21 22.7 v4.2 a12 12 0 0 1 -5 1.1z M23 25.72 V23.3 l1.59 -2.38 a2 2 0 0 0 .27 -1.6 L24 15.89 V14 h3.82 A11.8 11.8 0 0 1 23 25.73
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
                // a 12 12 0 0 1 4 -8.92
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -8.92f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 3.38
                horizontalLineToRelative(dx = 3.38f)
                // a 2 2 0 0 0 1.8 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = -1.1f,
                )
                // L 15.61 9
                lineTo(x = 15.61f, y = 9.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4.76
                horizontalLineToRelative(dx = -4.76f)
                // a 2 2 0 0 0 -0.9 0.21
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.21f,
                )
                // l -3.23 1.62
                lineToRelative(dx = -3.23f, dy = 1.62f)
                // A 2 2 0 0 0 8 16.62
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 16.62f,
                )
                // v 3.7
                verticalLineToRelative(dy = 3.7f)
                // a 2 2 0 0 0 1.26 1.86
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.26f,
                    dy1 = 1.86f,
                )
                // l 3.85 1.54
                lineToRelative(dx = 3.85f, dy = 1.54f)
                // l 0.67 4.07
                lineToRelative(dx = 0.67f, dy = 4.07f)
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
                // m 11.85 12
                moveToRelative(dx = 11.85f, dy = 12.0f)
                // l -0.96 -5.72
                lineToRelative(dx = -0.96f, dy = -5.72f)
                // L 10 20.32
                lineTo(x = 10.0f, y = 20.32f)
                // v -3.7
                verticalLineToRelative(dy = -3.7f)
                // L 13.24 15
                lineTo(x = 13.24f, y = 15.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h -5.62
                horizontalLineToRelative(dx = -5.62f)
                // l -1 2
                lineToRelative(dx = -1.0f, dy = 2.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 5.62
                verticalLineTo(y = 5.62f)
                // A 11.96 11.96 0 0 1 27.3 12
                arcTo(
                    horizontalEllipseRadius = 11.96f,
                    verticalEllipseRadius = 11.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.3f,
                    y1 = 12.0f,
                )
                // H 22
                horizontalLineTo(x = 22.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // l 0.92 3.81
                lineToRelative(dx = 0.92f, dy = 3.81f)
                // L 21 22.7
                lineTo(x = 21.0f, y = 22.7f)
                // v 4.2
                verticalLineToRelative(dy = 4.2f)
                // a 12 12 0 0 1 -5 1.1z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 1.1f,
                )
                close()
                // M 23 25.72
                moveTo(x = 23.0f, y = 25.72f)
                // V 23.3
                verticalLineTo(y = 23.3f)
                // l 1.59 -2.38
                lineToRelative(dx = 1.59f, dy = -2.38f)
                // a 2 2 0 0 0 0.27 -1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.27f,
                    dy1 = -1.6f,
                )
                // L 24 15.89
                lineTo(x = 24.0f, y = 15.89f)
                // V 14
                verticalLineTo(y = 14.0f)
                // h 3.82
                horizontalLineToRelative(dx = 3.82f)
                // A 11.8 11.8 0 0 1 23 25.73
                arcTo(
                    horizontalEllipseRadius = 11.8f,
                    verticalEllipseRadius = 11.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 25.73f,
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
        }.build().also { _earthEuropeAfrica = it }
    }

@Suppress("ObjectPropertyName")
private var _earthEuropeAfrica: ImageVector? = null
