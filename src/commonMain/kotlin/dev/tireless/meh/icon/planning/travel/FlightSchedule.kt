package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlightSchedule: ImageVector
    get() {
        val current = _flightSchedule
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlightSchedule",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m25 23 5 2 v-2 l-5 -2.5 V18 a1 1 0 0 0 -2 0 v2.5 L18 23 v2 l5 -2 v3.5 L21 28 v1 l3 -1 3 1 v-1 l-2 -1.5Z
            path(
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 23
                moveTo(x = 25.0f, y = 23.0f)
                // l 5 2
                lineToRelative(dx = 5.0f, dy = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // l -5 -2.5
                lineToRelative(dx = -5.0f, dy = -2.5f)
                // V 18
                verticalLineTo(y = 18.0f)
                // a 1 1 0 0 0 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v 2.5
                verticalLineToRelative(dy = 2.5f)
                // L 18 23
                lineTo(x = 18.0f, y = 23.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // l 5 -2
                lineToRelative(dx = 5.0f, dy = -2.0f)
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // L 21 28
                lineTo(x = 21.0f, y = 28.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // l 3 -1
                lineToRelative(dx = 3.0f, dy = -1.0f)
                // l 3 1
                lineToRelative(dx = 3.0f, dy = 1.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // l -2 -1.5z
                lineToRelative(dx = -2.0f, dy = -1.5f)
                close()
            }
            // M26 4 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10 v-2 H6 V6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v7 h2 V6 a2 2 0 0 0 -2 -2
            path(
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 4
                moveTo(x = 26.0f, y = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
        }.build().also { _flightSchedule = it }
    }

@Suppress("ObjectPropertyName")
private var _flightSchedule: ImageVector? = null
