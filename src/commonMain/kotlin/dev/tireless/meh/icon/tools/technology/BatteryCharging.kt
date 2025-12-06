package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BatteryCharging: ImageVector
    get() {
        val current = _batteryCharging
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BatteryCharging",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 11 h-1 v-1 a2 2 0 0 0 -2 -2 h-4 v2 h4 v3 h3 v6 h-3 v3 h-5 v2 h5 a2 2 0 0 0 2 -2 v-1 h1 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 M11 22 H6 V10 h6 V8 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
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
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // M 11 22
                moveTo(x = 11.0f, y = 22.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
            }
            // <polygon points="14.81 23.58 13.19 22.42 17.06 17.0 9.37 17.0 16.22 8.38 17.78 9.62 13.51 15.0 20.94 15.0 14.81 23.58" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.81 23.58
                moveTo(x = 14.81f, y = 23.58f)
                // L 13.19 22.42
                lineTo(x = 13.19f, y = 22.42f)
                // L 17.06 17
                lineTo(x = 17.06f, y = 17.0f)
                // L 9.37 17
                lineTo(x = 9.37f, y = 17.0f)
                // L 16.22 8.38
                lineTo(x = 16.22f, y = 8.38f)
                // L 17.78 9.62
                lineTo(x = 17.78f, y = 9.62f)
                // L 13.51 15
                lineTo(x = 13.51f, y = 15.0f)
                // L 20.94 15
                lineTo(x = 20.94f, y = 15.0f)
                // L 14.81 23.58z
                lineTo(x = 14.81f, y = 23.58f)
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
        }.build().also { _batteryCharging = it }
    }

@Suppress("ObjectPropertyName")
private var _batteryCharging: ImageVector? = null
