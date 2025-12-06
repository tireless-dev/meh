package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContinuousDeployment: ImageVector
    get() {
        val current = _continuousDeployment
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ContinuousDeployment",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m24 2 -6 6 1.4 1.4 L23 5.8 V19 c0 5 -4 9 -9 9 -1.6 0 -3.1 -.4 -4.3 -1.1 C10.1 27 10.5 27 11 27 c4.4 0 8 -3.6 8 -8 s-3.6 -8 -8 -8 -8 3.6 -8 8 c0 6.1 4.9 11 11 11 s11 -4.9 11 -11 V5.8 l3.6 3.6 L30 8z M5 19.6 V19 c0 -3.3 2.7 -6 6 -6 s6 2.7 6 6 a6.02 6.02 0 0 1 -12 .6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 2
                moveTo(x = 24.0f, y = 2.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // L 23 5.8
                lineTo(x = 23.0f, y = 5.8f)
                // V 19
                verticalLineTo(y = 19.0f)
                // c 0 5 -4 9 -9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                    dx2 = -4.0f,
                    dy2 = 9.0f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // c -1.6 0 -3.1 -0.4 -4.3 -1.1
                curveToRelative(
                    dx1 = -1.6f,
                    dy1 = 0.0f,
                    dx2 = -3.1f,
                    dy2 = -0.4f,
                    dx3 = -4.3f,
                    dy3 = -1.1f,
                )
                // C 10.1 27 10.5 27 11 27
                curveTo(
                    x1 = 10.1f,
                    y1 = 27.0f,
                    x2 = 10.5f,
                    y2 = 27.0f,
                    x3 = 11.0f,
                    y3 = 27.0f,
                )
                // c 4.4 0 8 -3.6 8 -8
                curveToRelative(
                    dx1 = 4.4f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -3.6f,
                    dx3 = 8.0f,
                    dy3 = -8.0f,
                )
                // s -3.6 -8 -8 -8
                reflectiveCurveToRelative(
                    dx1 = -3.6f,
                    dy1 = -8.0f,
                    dx2 = -8.0f,
                    dy2 = -8.0f,
                )
                // s -8 3.6 -8 8
                reflectiveCurveToRelative(
                    dx1 = -8.0f,
                    dy1 = 3.6f,
                    dx2 = -8.0f,
                    dy2 = 8.0f,
                )
                // c 0 6.1 4.9 11 11 11
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.1f,
                    dx2 = 4.9f,
                    dy2 = 11.0f,
                    dx3 = 11.0f,
                    dy3 = 11.0f,
                )
                // s 11 -4.9 11 -11
                reflectiveCurveToRelative(
                    dx1 = 11.0f,
                    dy1 = -4.9f,
                    dx2 = 11.0f,
                    dy2 = -11.0f,
                )
                // V 5.8
                verticalLineTo(y = 5.8f)
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // L 30 8z
                lineTo(x = 30.0f, y = 8.0f)
                close()
                // M 5 19.6
                moveTo(x = 5.0f, y = 19.6f)
                // V 19
                verticalLineTo(y = 19.0f)
                // c 0 -3.3 2.7 -6 6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.3f,
                    dx2 = 2.7f,
                    dy2 = -6.0f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // s 6 2.7 6 6
                reflectiveCurveToRelative(
                    dx1 = 6.0f,
                    dy1 = 2.7f,
                    dx2 = 6.0f,
                    dy2 = 6.0f,
                )
                // a 6.02 6.02 0 0 1 -12 0.6
                arcToRelative(
                    a = 6.02f,
                    b = 6.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.6f,
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
        }.build().also { _continuousDeployment = it }
    }

@Suppress("ObjectPropertyName")
private var _continuousDeployment: ImageVector? = null
