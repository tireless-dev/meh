package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fog: ImageVector
    get() {
        val current = _fog
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Fog",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24.8 11.14 a9 9 0 0 0 -17.6 0 A6.5 6.5 0 0 0 2 17.5 V19 a1 1 0 0 0 1 1 h12 a1 1 0 0 0 0 -2 H4 v-.5 a4.5 4.5 0 0 1 4.14 -4.48 l.82 -.06 .1 -.81 a7 7 0 0 1 13.88 0 l.1 .8 .82 .07 A4.5 4.5 0 0 1 23.5 22 H7 a1 1 0 0 0 0 2 h16.5 a6.5 6.5 0 0 0 1.3 -12.86
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.8 11.14
                moveTo(x = 24.8f, y = 11.14f)
                // a 9 9 0 0 0 -17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -17.6f,
                    dy1 = 0.0f,
                )
                // A 6.5 6.5 0 0 0 2 17.5
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 17.5f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -0.5
                verticalLineToRelative(dy = -0.5f)
                // a 4.5 4.5 0 0 1 4.14 -4.48
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.14f,
                    dy1 = -4.48f,
                )
                // l 0.82 -0.06
                lineToRelative(dx = 0.82f, dy = -0.06f)
                // l 0.1 -0.81
                lineToRelative(dx = 0.1f, dy = -0.81f)
                // a 7 7 0 0 1 13.88 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.88f,
                    dy1 = 0.0f,
                )
                // l 0.1 0.8
                lineToRelative(dx = 0.1f, dy = 0.8f)
                // l 0.82 0.07
                lineToRelative(dx = 0.82f, dy = 0.07f)
                // A 4.5 4.5 0 0 1 23.5 22
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 22.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 16.5
                horizontalLineToRelative(dx = 16.5f)
                // a 6.5 6.5 0 0 0 1.3 -12.86
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.3f,
                    dy1 = -12.86f,
                )
            }
            // <rect width="18" height="2" rx="1.0" x="2.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 27
                moveTo(x = 2.0f, y = 27.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 0
                verticalLineToRelative(dy = 0.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
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
        }.build().also { _fog = it }
    }

@Suppress("ObjectPropertyName")
private var _fog: ImageVector? = null
