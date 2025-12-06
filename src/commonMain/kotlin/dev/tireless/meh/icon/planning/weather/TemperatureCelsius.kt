package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureCelsius: ImageVector
    get() {
        val current = _temperatureCelsius
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TemperatureCelsius",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 18 h-6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h6 v2 h-6 v10 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            // <circle cx="18.0" cy="4.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 20.18 V12 H8 v8.18 a3 3 0 1 0 2 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 20.18
                moveTo(x = 10.0f, y = 20.18f)
                // V 12
                verticalLineTo(y = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 8.18
                verticalLineToRelative(dy = 8.18f)
                // a 3 3 0 1 0 2 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
            }
            // M9 30 a7 7 0 0 1 -5 -11.89 V7 a5 5 0 0 1 10 0 v11.11 A7 7 0 0 1 9 30 M9 4 a3 3 0 0 0 -3 3 v11.98 l-.33 .3 a5 5 0 1 0 6.66 0 L12 18.98 V7 a3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 30
                moveTo(x = 9.0f, y = 30.0f)
                // a 7 7 0 0 1 -5 -11.89
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -11.89f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 5 5 0 0 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // v 11.11
                verticalLineToRelative(dy = 11.11f)
                // A 7 7 0 0 1 9 30
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 30.0f,
                )
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 11.98
                verticalLineToRelative(dy = 11.98f)
                // l -0.33 0.3
                lineToRelative(dx = -0.33f, dy = 0.3f)
                // a 5 5 0 1 0 6.66 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.66f,
                    dy1 = 0.0f,
                )
                // L 12 18.98
                lineTo(x = 12.0f, y = 18.98f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
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
        }.build().also { _temperatureCelsius = it }
    }

@Suppress("ObjectPropertyName")
private var _temperatureCelsius: ImageVector? = null
