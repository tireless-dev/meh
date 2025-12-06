package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureInversion: ImageVector
    get() {
        val current = _temperatureInversion
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TemperatureInversion",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 8 h-6 v6 h2 v-2.46 A6 6 0 0 1 28 16 a6 6 0 0 1 -5.1 5.92 7 7 0 0 0 -2.9 -4.66 V6 a4 4 0 0 0 -8 0 v11.26 a7 7 0 1 0 10.93 6.68 A7.98 7.98 0 0 0 27.27 10 H30Z M14 6 a2 2 0 0 1 4 0 v7 h-4Z m2 22 a5 5 0 0 1 -2.5 -9.33 L14 18.4 V15 h4 v3.39 l.5 .28 A5 5 0 0 1 16 28 M2 10 a8 8 0 0 0 2.73 6 H2 v2 h6 v-6 H6 v2.46 A6 6 0 0 1 4 10 a6 6 0 0 1 6 -6 V2 a8 8 0 0 0 -8 8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 8
                moveTo(x = 30.0f, y = 8.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.46
                verticalLineToRelative(dy = -2.46f)
                // A 6 6 0 0 1 28 16
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 16.0f,
                )
                // a 6 6 0 0 1 -5.1 5.92
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.1f,
                    dy1 = 5.92f,
                )
                // a 7 7 0 0 0 -2.9 -4.66
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.9f,
                    dy1 = -4.66f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // v 11.26
                verticalLineToRelative(dy = 11.26f)
                // a 7 7 0 1 0 10.93 6.68
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 10.93f,
                    dy1 = 6.68f,
                )
                // A 7.98 7.98 0 0 0 27.27 10
                arcTo(
                    horizontalEllipseRadius = 7.98f,
                    verticalEllipseRadius = 7.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.27f,
                    y1 = 10.0f,
                )
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
                // M 14 6
                moveTo(x = 14.0f, y = 6.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 2 22
                moveToRelative(dx = 2.0f, dy = 22.0f)
                // a 5 5 0 0 1 -2.5 -9.33
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = -9.33f,
                )
                // L 14 18.4
                lineTo(x = 14.0f, y = 18.4f)
                // V 15
                verticalLineTo(y = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3.39
                verticalLineToRelative(dy = 3.39f)
                // l 0.5 0.28
                lineToRelative(dx = 0.5f, dy = 0.28f)
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
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // a 8 8 0 0 0 2.73 6
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.73f,
                    dy1 = 6.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2.46
                verticalLineToRelative(dy = 2.46f)
                // A 6 6 0 0 1 4 10
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 10.0f,
                )
                // a 6 6 0 0 1 6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -6.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // a 8 8 0 0 0 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
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
        }.build().also { _temperatureInversion = it }
    }

@Suppress("ObjectPropertyName")
private var _temperatureInversion: ImageVector? = null
