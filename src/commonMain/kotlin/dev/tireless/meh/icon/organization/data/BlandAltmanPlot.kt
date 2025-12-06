package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BlandAltmanPlot: ImageVector
    get() {
        val current = _blandAltmanPlot
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BlandAltmanPlot",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M10 22 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2 m7 -4 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2 m7 4 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2 m6 -6 v-2 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4 V16z M10 8 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2 m7 0 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2 m11 -6 c1.1 0 2 .9 2 2 s-.9 2 -2 2 -2 -.9 -2 -2 .9 -2 2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 22
                moveTo(x = 10.0f, y = 22.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // m 7 -4
                moveToRelative(dx = 7.0f, dy = -4.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // m 7 4
                moveToRelative(dx = 7.0f, dy = 4.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // m 6 -6
                moveToRelative(dx = 6.0f, dy = -6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 16z
                verticalLineTo(y = 16.0f)
                close()
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // m 7 0
                moveToRelative(dx = 7.0f, dy = 0.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // m 11 -6
                moveToRelative(dx = 11.0f, dy = -6.0f)
                // c 1.1 0 2 0.9 2 2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 0.9f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
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
                // s 0.9 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.9f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
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
        }.build().also { _blandAltmanPlot = it }
    }

@Suppress("ObjectPropertyName")
private var _blandAltmanPlot: ImageVector? = null
