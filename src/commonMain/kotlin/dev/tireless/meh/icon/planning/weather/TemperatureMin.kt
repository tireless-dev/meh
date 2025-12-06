package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TemperatureMin: ImageVector
    get() {
        val current = _temperatureMin
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TemperatureMin",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="7" height="2" x="20.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 4
                moveTo(x = 20.0f, y = 4.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="10" height="2" x="20.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="7" height="2" x="20.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 16
                moveTo(x = 20.0f, y = 16.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // M12 23 a3 3 0 0 1 -6 0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 23
                moveTo(x = 12.0f, y = 23.0f)
                // a 3 3 0 0 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M30 22 H15.92 A7 7 0 0 0 14 18.11 V7 A5 5 0 0 0 4 7 v11.11 A7 7 0 1 0 15.92 24 H30Z M9 28 a5 5 0 0 1 -3.33 -8.72 L6 18.98 V7 a3 3 0 0 1 6 0 v11.98 l.33 .3 A5 5 0 0 1 9 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // H 15.92
                horizontalLineTo(x = 15.92f)
                // A 7 7 0 0 0 14 18.11
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 18.11f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // A 5 5 0 0 0 4 7
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 7.0f,
                )
                // v 11.11
                verticalLineToRelative(dy = 11.11f)
                // A 7 7 0 1 0 15.92 24
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 15.92f,
                    y1 = 24.0f,
                )
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
                // M 9 28
                moveTo(x = 9.0f, y = 28.0f)
                // a 5 5 0 0 1 -3.33 -8.72
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.33f,
                    dy1 = -8.72f,
                )
                // L 6 18.98
                lineTo(x = 6.0f, y = 18.98f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 11.98
                verticalLineToRelative(dy = 11.98f)
                // l 0.33 0.3
                lineToRelative(dx = 0.33f, dy = 0.3f)
                // A 5 5 0 0 1 9 28
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 28.0f,
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
        }.build().also { _temperatureMin = it }
    }

@Suppress("ObjectPropertyName")
private var _temperatureMin: ImageVector? = null
