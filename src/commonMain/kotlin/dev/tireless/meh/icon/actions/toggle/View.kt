package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val View: ImageVector
    get() {
        val current = _view
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.View",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30.94 15.66 A16.7 16.7 0 0 0 16 5 16.7 16.7 0 0 0 1.06 15.66 a1 1 0 0 0 0 .68 A16.7 16.7 0 0 0 16 27 a16.7 16.7 0 0 0 14.94 -10.66 1 1 0 0 0 0 -.68 M16 25 c-5.3 0 -10.9 -3.93 -12.93 -9 C5.1 10.93 10.7 7 16 7 s10.9 3.93 12.93 9 C26.9 21.07 21.3 25 16 25
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30.94 15.66
                moveTo(x = 30.94f, y = 15.66f)
                // A 16.7 16.7 0 0 0 16 5
                arcTo(
                    horizontalEllipseRadius = 16.7f,
                    verticalEllipseRadius = 16.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 5.0f,
                )
                // A 16.7 16.7 0 0 0 1.06 15.66
                arcTo(
                    horizontalEllipseRadius = 16.7f,
                    verticalEllipseRadius = 16.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 1.06f,
                    y1 = 15.66f,
                )
                // a 1 1 0 0 0 0 0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 0.68f,
                )
                // A 16.7 16.7 0 0 0 16 27
                arcTo(
                    horizontalEllipseRadius = 16.7f,
                    verticalEllipseRadius = 16.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 27.0f,
                )
                // a 16.7 16.7 0 0 0 14.94 -10.66
                arcToRelative(
                    a = 16.7f,
                    b = 16.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.94f,
                    dy1 = -10.66f,
                )
                // a 1 1 0 0 0 0 -0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -0.68f,
                )
                // M 16 25
                moveTo(x = 16.0f, y = 25.0f)
                // c -5.3 0 -10.9 -3.93 -12.93 -9
                curveToRelative(
                    dx1 = -5.3f,
                    dy1 = 0.0f,
                    dx2 = -10.9f,
                    dy2 = -3.93f,
                    dx3 = -12.93f,
                    dy3 = -9.0f,
                )
                // C 5.1 10.93 10.7 7 16 7
                curveTo(
                    x1 = 5.1f,
                    y1 = 10.93f,
                    x2 = 10.7f,
                    y2 = 7.0f,
                    x3 = 16.0f,
                    y3 = 7.0f,
                )
                // s 10.9 3.93 12.93 9
                reflectiveCurveToRelative(
                    dx1 = 10.9f,
                    dy1 = 3.93f,
                    dx2 = 12.93f,
                    dy2 = 9.0f,
                )
                // C 26.9 21.07 21.3 25 16 25
                curveTo(
                    x1 = 26.9f,
                    y1 = 21.07f,
                    x2 = 21.3f,
                    y2 = 25.0f,
                    x3 = 16.0f,
                    y3 = 25.0f,
                )
            }
            // M16 10 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6 m0 10 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
                // a 6 6 0 1 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // a 6 6 0 0 0 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
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
        }.build().also { _view = it }
    }

@Suppress("ObjectPropertyName")
private var _view: ImageVector? = null
