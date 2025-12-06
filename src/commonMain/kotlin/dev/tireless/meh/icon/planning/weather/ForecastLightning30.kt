package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForecastLightning30: ImageVector
    get() {
        val current = _forecastLightning30
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ForecastLightning30",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M14 28 a10 10 0 0 1 0 -20 h4 v5 l6 -6 -6 -6 v5 h-4 a12 12 0 0 0 0 24Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 28
                moveTo(x = 14.0f, y = 28.0f)
                // a 10 10 0 0 1 0 -20
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -20.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 12 12 0 0 0 0 24z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 24.0f,
                )
                close()
            }
            // <polygon points="11.67 24.0 9.934 23.0 12.221 19.0 8.332 19.0 12.325 12.0 14.062 13.0 11.778 17.0 15.668 17.0 11.67 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.67 24
                moveTo(x = 11.67f, y = 24.0f)
                // L 9.934 23
                lineTo(x = 9.934f, y = 23.0f)
                // L 12.221 19
                lineTo(x = 12.221f, y = 19.0f)
                // L 8.332 19
                lineTo(x = 8.332f, y = 19.0f)
                // L 12.325 12
                lineTo(x = 12.325f, y = 12.0f)
                // L 14.062 13
                lineTo(x = 14.062f, y = 13.0f)
                // L 11.778 17
                lineTo(x = 11.778f, y = 17.0f)
                // L 15.668 17
                lineTo(x = 15.668f, y = 17.0f)
                // L 11.67 24z
                lineTo(x = 11.67f, y = 24.0f)
                close()
            }
            // M20 20 h-4 v2 h4 v2 h-3 v2 h3 v2 h-4 v2 h4 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m8 10 h-2 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h2 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-2 -8 v6 h2 v-6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 8 10
                moveToRelative(dx = 8.0f, dy = 10.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m -2 -8
                moveToRelative(dx = -2.0f, dy = -8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
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
        }.build().also { _forecastLightning30 = it }
    }

@Suppress("ObjectPropertyName")
private var _forecastLightning30: ImageVector? = null
