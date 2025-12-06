package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartLineSmooth: ImageVector
    get() {
        val current = _chartLineSmooth
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartLineSmooth",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M13 15 c1.49 0 2.55 1.5 3.69 3.08 C17.99 19.92 19.49 22 22 22 c5.67 0 7.78 -10.79 8 -12 l-1.97 -.36 C27.55 12.28 25.4 20 22 20 c-1.49 0 -2.55 -1.5 -3.69 -3.08 C17.01 15.08 15.51 13 13 13 c-4.19 0 -7.44 7.4 -9 11.76 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H5.04 C6.55 22.86 9.96 15 13 15
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 15
                moveTo(x = 13.0f, y = 15.0f)
                // c 1.49 0 2.55 1.5 3.69 3.08
                curveToRelative(
                    dx1 = 1.49f,
                    dy1 = 0.0f,
                    dx2 = 2.55f,
                    dy2 = 1.5f,
                    dx3 = 3.69f,
                    dy3 = 3.08f,
                )
                // C 17.99 19.92 19.49 22 22 22
                curveTo(
                    x1 = 17.99f,
                    y1 = 19.92f,
                    x2 = 19.49f,
                    y2 = 22.0f,
                    x3 = 22.0f,
                    y3 = 22.0f,
                )
                // c 5.67 0 7.78 -10.79 8 -12
                curveToRelative(
                    dx1 = 5.67f,
                    dy1 = 0.0f,
                    dx2 = 7.78f,
                    dy2 = -10.79f,
                    dx3 = 8.0f,
                    dy3 = -12.0f,
                )
                // l -1.97 -0.36
                lineToRelative(dx = -1.97f, dy = -0.36f)
                // C 27.55 12.28 25.4 20 22 20
                curveTo(
                    x1 = 27.55f,
                    y1 = 12.28f,
                    x2 = 25.4f,
                    y2 = 20.0f,
                    x3 = 22.0f,
                    y3 = 20.0f,
                )
                // c -1.49 0 -2.55 -1.5 -3.69 -3.08
                curveToRelative(
                    dx1 = -1.49f,
                    dy1 = 0.0f,
                    dx2 = -2.55f,
                    dy2 = -1.5f,
                    dx3 = -3.69f,
                    dy3 = -3.08f,
                )
                // C 17.01 15.08 15.51 13 13 13
                curveTo(
                    x1 = 17.01f,
                    y1 = 15.08f,
                    x2 = 15.51f,
                    y2 = 13.0f,
                    x3 = 13.0f,
                    y3 = 13.0f,
                )
                // c -4.19 0 -7.44 7.4 -9 11.76
                curveToRelative(
                    dx1 = -4.19f,
                    dy1 = 0.0f,
                    dx2 = -7.44f,
                    dy2 = 7.4f,
                    dx3 = -9.0f,
                    dy3 = 11.76f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5.04
                horizontalLineTo(x = 5.04f)
                // C 6.55 22.86 9.96 15 13 15
                curveTo(
                    x1 = 6.55f,
                    y1 = 22.86f,
                    x2 = 9.96f,
                    y2 = 15.0f,
                    x3 = 13.0f,
                    y3 = 15.0f,
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
        }.build().also { _chartLineSmooth = it }
    }

@Suppress("ObjectPropertyName")
private var _chartLineSmooth: ImageVector? = null
