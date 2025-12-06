package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidHelipad: ImageVector
    get() {
        val current = _navaidHelipad
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NavaidHelipad",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="18.0 9.0 18.0 15.0 14.0 15.0 14.0 9.0 12.0 9.0 12.0 23.0 14.0 23.0 14.0 17.0 18.0 17.0 18.0 23.0 20.0 23.0 20.0 9.0 18.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // L 18 15
                lineTo(x = 18.0f, y = 15.0f)
                // L 14 15
                lineTo(x = 14.0f, y = 15.0f)
                // L 14 9
                lineTo(x = 14.0f, y = 9.0f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // L 14 17
                lineTo(x = 14.0f, y = 17.0f)
                // L 18 17
                lineTo(x = 18.0f, y = 17.0f)
                // L 18 23
                lineTo(x = 18.0f, y = 23.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // L 18 9z
                lineTo(x = 18.0f, y = 9.0f)
                close()
            }
            // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 14 14 0 1 1 14 -14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = -14.0f,
                )
                // a 14 14 0 0 1 -14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 14.0f,
                )
                // m 0 -26
                moveToRelative(dx = 0.0f, dy = -26.0f)
                // a 12 12 0 1 0 12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
                // A 12 12 0 0 0 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _navaidHelipad = it }
    }

@Suppress("ObjectPropertyName")
private var _navaidHelipad: ImageVector? = null
