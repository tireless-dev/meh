package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WeatherFrontCold: ImageVector
    get() {
        val current = _weatherFrontCold
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WeatherFrontCold",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28.17 2 a13 13 0 0 0 -12.55 9.58 l-1.17 4.31 A11 11 0 0 1 3.83 24 H2 v2 h1.83 l.89 -.04 7.93 2.98 A1 1 0 0 0 14 28 v-6.9 a13 13 0 0 0 .91 -1.32 l6.36 -1.82 a1 1 0 0 0 .51 -1.58 l-4 -5 a11 11 0 0 1 1.16 -2.35 l5.74 1.92 A1 1 0 0 0 26 10 V4.23 A11 11 0 0 1 28.17 4 H30 V2Z M8.34 25.18 A13 13 0 0 0 12 23.1 v3.47Z m7.74 -7.81 .3 -.95 .73 -2.68 2.17 2.71Z M24 8.6 l-3.74 -1.24 A11 11 0 0 1 24 4.83Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.17 2
                moveTo(x = 28.17f, y = 2.0f)
                // a 13 13 0 0 0 -12.55 9.58
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.55f,
                    dy1 = 9.58f,
                )
                // l -1.17 4.31
                lineToRelative(dx = -1.17f, dy = 4.31f)
                // A 11 11 0 0 1 3.83 24
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.83f,
                    y1 = 24.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 1.83
                horizontalLineToRelative(dx = 1.83f)
                // l 0.89 -0.04
                lineToRelative(dx = 0.89f, dy = -0.04f)
                // l 7.93 2.98
                lineToRelative(dx = 7.93f, dy = 2.98f)
                // A 1 1 0 0 0 14 28
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 28.0f,
                )
                // v -6.9
                verticalLineToRelative(dy = -6.9f)
                // a 13 13 0 0 0 0.91 -1.32
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.91f,
                    dy1 = -1.32f,
                )
                // l 6.36 -1.82
                lineToRelative(dx = 6.36f, dy = -1.82f)
                // a 1 1 0 0 0 0.51 -1.58
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.51f,
                    dy1 = -1.58f,
                )
                // l -4 -5
                lineToRelative(dx = -4.0f, dy = -5.0f)
                // a 11 11 0 0 1 1.16 -2.35
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.16f,
                    dy1 = -2.35f,
                )
                // l 5.74 1.92
                lineToRelative(dx = 5.74f, dy = 1.92f)
                // A 1 1 0 0 0 26 10
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 10.0f,
                )
                // V 4.23
                verticalLineTo(y = 4.23f)
                // A 11 11 0 0 1 28.17 4
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.17f,
                    y1 = 4.0f,
                )
                // H 30
                horizontalLineTo(x = 30.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // M 8.34 25.18
                moveTo(x = 8.34f, y = 25.18f)
                // A 13 13 0 0 0 12 23.1
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 23.1f,
                )
                // v 3.47z
                verticalLineToRelative(dy = 3.47f)
                close()
                // m 7.74 -7.81
                moveToRelative(dx = 7.74f, dy = -7.81f)
                // l 0.3 -0.95
                lineToRelative(dx = 0.3f, dy = -0.95f)
                // l 0.73 -2.68
                lineToRelative(dx = 0.73f, dy = -2.68f)
                // l 2.17 2.71z
                lineToRelative(dx = 2.17f, dy = 2.71f)
                close()
                // M 24 8.6
                moveTo(x = 24.0f, y = 8.6f)
                // l -3.74 -1.24
                lineToRelative(dx = -3.74f, dy = -1.24f)
                // A 11 11 0 0 1 24 4.83z
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 4.83f,
                )
                close()
            }
            // <polygon points="10.0 4.0 10.0 8.586 3.414 2.0 2.0 3.414 8.586 10.0 4.0 10.0 4.0 12.0 12.0 12.0 12.0 4.0 10.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 4
                moveTo(x = 10.0f, y = 4.0f)
                // L 10 8.586
                lineTo(x = 10.0f, y = 8.586f)
                // L 3.414 2
                lineTo(x = 3.414f, y = 2.0f)
                // L 2 3.414
                lineTo(x = 2.0f, y = 3.414f)
                // L 8.586 10
                lineTo(x = 8.586f, y = 10.0f)
                // L 4 10
                lineTo(x = 4.0f, y = 10.0f)
                // L 4 12
                lineTo(x = 4.0f, y = 12.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // L 12 4
                lineTo(x = 12.0f, y = 4.0f)
                // L 10 4z
                lineTo(x = 10.0f, y = 4.0f)
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
        }.build().also { _weatherFrontCold = it }
    }

@Suppress("ObjectPropertyName")
private var _weatherFrontCold: ImageVector? = null
