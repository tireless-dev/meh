package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindStream: ImageVector
    get() {
        val current = _windStream
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WindStream",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m25 2 -1.41 1.41 L26.17 6 h-5.09 a17 17 0 0 0 -6.31 1.22 l-4.28 1.7 A15 15 0 0 1 4.92 10 H2 v2 h2.92 a17 17 0 0 0 6.31 -1.22 l4.28 -1.7 A15 15 0 0 1 21.08 8 h5.1 l-2.6 2.59 L25 12 l5 -5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 26.17 6
                lineTo(x = 26.17f, y = 6.0f)
                // h -5.09
                horizontalLineToRelative(dx = -5.09f)
                // a 17 17 0 0 0 -6.31 1.22
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.31f,
                    dy1 = 1.22f,
                )
                // l -4.28 1.7
                lineToRelative(dx = -4.28f, dy = 1.7f)
                // A 15 15 0 0 1 4.92 10
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.92f,
                    y1 = 10.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.92
                horizontalLineToRelative(dx = 2.92f)
                // a 17 17 0 0 0 6.31 -1.22
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.31f,
                    dy1 = -1.22f,
                )
                // l 4.28 -1.7
                lineToRelative(dx = 4.28f, dy = -1.7f)
                // A 15 15 0 0 1 21.08 8
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.08f,
                    y1 = 8.0f,
                )
                // h 5.1
                horizontalLineToRelative(dx = 5.1f)
                // l -2.6 2.59
                lineToRelative(dx = -2.6f, dy = 2.59f)
                // L 25 12
                lineTo(x = 25.0f, y = 12.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
                close()
            }
            // m21 11 -1.41 1.41 L22.17 15 H18.9 a17 17 0 0 0 -5.97 1.08 l-2.56 .96 A15 15 0 0 1 5.1 18 H2 v2 h3.1 a17 17 0 0 0 5.97 -1.08 l2.56 -.96 A15 15 0 0 1 18.9 17 h3.27 l-2.58 2.59 L21 21 l5 -5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 11
                moveTo(x = 21.0f, y = 11.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 22.17 15
                lineTo(x = 22.17f, y = 15.0f)
                // H 18.9
                horizontalLineTo(x = 18.9f)
                // a 17 17 0 0 0 -5.97 1.08
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.97f,
                    dy1 = 1.08f,
                )
                // l -2.56 0.96
                lineToRelative(dx = -2.56f, dy = 0.96f)
                // A 15 15 0 0 1 5.1 18
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.1f,
                    y1 = 18.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.1
                horizontalLineToRelative(dx = 3.1f)
                // a 17 17 0 0 0 5.97 -1.08
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.97f,
                    dy1 = -1.08f,
                )
                // l 2.56 -0.96
                lineToRelative(dx = 2.56f, dy = -0.96f)
                // A 15 15 0 0 1 18.9 17
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.9f,
                    y1 = 17.0f,
                )
                // h 3.27
                horizontalLineToRelative(dx = 3.27f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 21 21
                lineTo(x = 21.0f, y = 21.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
                close()
            }
            // m17 20 -1.41 1.41 L18.17 24 H16.6 a17 17 0 0 0 -5.38 .87 l-1.07 .36 A15 15 0 0 1 5.4 26 H2 v2 h3.4 a17 17 0 0 0 5.38 -.87 l1.07 -.36 A15 15 0 0 1 16.6 26 h1.57 l-2.58 2.59 L17 30 l5 -5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 20
                moveTo(x = 17.0f, y = 20.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 18.17 24
                lineTo(x = 18.17f, y = 24.0f)
                // H 16.6
                horizontalLineTo(x = 16.6f)
                // a 17 17 0 0 0 -5.38 0.87
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.38f,
                    dy1 = 0.87f,
                )
                // l -1.07 0.36
                lineToRelative(dx = -1.07f, dy = 0.36f)
                // A 15 15 0 0 1 5.4 26
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.4f,
                    y1 = 26.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.4
                horizontalLineToRelative(dx = 3.4f)
                // a 17 17 0 0 0 5.38 -0.87
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.38f,
                    dy1 = -0.87f,
                )
                // l 1.07 -0.36
                lineToRelative(dx = 1.07f, dy = -0.36f)
                // A 15 15 0 0 1 16.6 26
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.6f,
                    y1 = 26.0f,
                )
                // h 1.57
                horizontalLineToRelative(dx = 1.57f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 17 30
                lineTo(x = 17.0f, y = 30.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
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
        }.build().also { _windStream = it }
    }

@Suppress("ObjectPropertyName")
private var _windStream: ImageVector? = null
