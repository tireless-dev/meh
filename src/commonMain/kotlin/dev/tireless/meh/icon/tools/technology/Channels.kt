package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Channels: ImageVector
    get() {
        val current = _channels
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Channels",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M10 15 V7.8 l3.6 3.6 L15 10 9 4 l-6 6 1.4 1.4 L8 7.8 v12.34 a4 4 0 1 0 2 0z m1 9 c0 1.1 -.9 2 -2 2 s-2 -.9 -2 -2 .9 -2 2 -2 2 .9 2 2 m16.6 -3.4 L24 24.2 V11.86 a4 4 0 1 0 -2 0 V24.2 l-3.6 -3.6 L17 22 l6 6 6 -6z M21 8 c0 -1.1 .9 -2 2 -2 s2 .9 2 2 -.9 2 -2 2 -2 -.9 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
                // V 7.8
                verticalLineTo(y = 7.8f)
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // L 15 10
                lineTo(x = 15.0f, y = 10.0f)
                // L 9 4
                lineTo(x = 9.0f, y = 4.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // L 8 7.8
                lineTo(x = 8.0f, y = 7.8f)
                // v 12.34
                verticalLineToRelative(dy = 12.34f)
                // a 4 4 0 1 0 2 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                close()
                // m 1 9
                moveToRelative(dx = 1.0f, dy = 9.0f)
                // c 0 1.1 -0.9 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.1f,
                    dx2 = -0.9f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // s -2 -0.9 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.9f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
                )
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 0.9 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.9f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // m 16.6 -3.4
                moveToRelative(dx = 16.6f, dy = -3.4f)
                // L 24 24.2
                lineTo(x = 24.0f, y = 24.2f)
                // V 11.86
                verticalLineTo(y = 11.86f)
                // a 4 4 0 1 0 -2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 24.2
                verticalLineTo(y = 24.2f)
                // l -3.6 -3.6
                lineToRelative(dx = -3.6f, dy = -3.6f)
                // L 17 22
                lineTo(x = 17.0f, y = 22.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 6 -6z
                lineToRelative(dx = 6.0f, dy = -6.0f)
                close()
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // c 0 -1.1 0.9 -2 2 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = 0.9f,
                    dy2 = -2.0f,
                    dx3 = 2.0f,
                    dy3 = -2.0f,
                )
                // s 2 0.9 2 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.9f,
                    dx2 = 2.0f,
                    dy2 = 2.0f,
                )
                // s -0.9 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -0.9f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                )
                // s -2 -0.9 -2 -2
                reflectiveCurveToRelative(
                    dx1 = -2.0f,
                    dy1 = -0.9f,
                    dx2 = -2.0f,
                    dy2 = -2.0f,
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
        }.build().also { _channels = it }
    }

@Suppress("ObjectPropertyName")
private var _channels: ImageVector? = null
