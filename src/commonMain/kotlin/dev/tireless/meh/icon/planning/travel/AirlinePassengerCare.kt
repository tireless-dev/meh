package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirlinePassengerCare: ImageVector
    get() {
        val current = _airlinePassengerCare
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AirlinePassengerCare",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M18 23 h-2 v-2 a3 3 0 0 0 -3 -3 H9 a3 3 0 0 0 -3 3 v2 H4 v-2 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M11 6 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                close()
                // M 11 6
                moveTo(x = 11.0f, y = 6.0f)
                // a 3 3 0 1 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 5 5 0 1 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
            }
            // <rect width="28" height="2" x="2.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 26
                moveTo(x = 2.0f, y = 26.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // M27.3 8 a2.7 2.7 0 0 0 -1.9 .8 L25 9.22 l-.4 -.4 a2.66 2.66 0 0 0 -3.81 0 2.8 2.8 0 0 0 0 3.9 L25 17 l4.21 -4.3 a2.8 2.8 0 0 0 0 -3.9 2.7 2.7 0 0 0 -1.9 -.8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.3 8
                moveTo(x = 27.3f, y = 8.0f)
                // a 2.7 2.7 0 0 0 -1.9 0.8
                arcToRelative(
                    a = 2.7f,
                    b = 2.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.9f,
                    dy1 = 0.8f,
                )
                // L 25 9.22
                lineTo(x = 25.0f, y = 9.22f)
                // l -0.4 -0.4
                lineToRelative(dx = -0.4f, dy = -0.4f)
                // a 2.66 2.66 0 0 0 -3.81 0
                arcToRelative(
                    a = 2.66f,
                    b = 2.66f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.81f,
                    dy1 = 0.0f,
                )
                // a 2.8 2.8 0 0 0 0 3.9
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.9f,
                )
                // L 25 17
                lineTo(x = 25.0f, y = 17.0f)
                // l 4.21 -4.3
                lineToRelative(dx = 4.21f, dy = -4.3f)
                // a 2.8 2.8 0 0 0 0 -3.9
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.9f,
                )
                // a 2.7 2.7 0 0 0 -1.9 -0.8
                arcToRelative(
                    a = 2.7f,
                    b = 2.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.9f,
                    dy1 = -0.8f,
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
        }.build().also { _airlinePassengerCare = it }
    }

@Suppress("ObjectPropertyName")
private var _airlinePassengerCare: ImageVector? = null
