package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualDesktop: ImageVector
    get() {
        val current = _virtualDesktop
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VirtualDesktop",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 16 H11 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h4 v2 h-3 v2 h8 v-2 h-3 v-2 h4 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-10 8 v-6 h10 v6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 16
                moveTo(x = 21.0f, y = 16.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // m -10 8
                moveToRelative(dx = -10.0f, dy = 8.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
            }
            // M25.82 10.12 a10 10 0 0 0 -19.64 0 A7.5 7.5 0 0 0 7 24.97 v-2 a5.5 5.5 0 0 1 .12 -10.95 l.84 -.06 .09 -.83 a8 8 0 0 1 15.9 0 l.1 .83 .83 .06 A5.5 5.5 0 0 1 25 22.97 v2 a7.5 7.5 0 0 0 .82 -14.85
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.82 10.12
                moveTo(x = 25.82f, y = 10.12f)
                // a 10 10 0 0 0 -19.64 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -19.64f,
                    dy1 = 0.0f,
                )
                // A 7.5 7.5 0 0 0 7 24.97
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 24.97f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 5.5 5.5 0 0 1 0.12 -10.95
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.12f,
                    dy1 = -10.95f,
                )
                // l 0.84 -0.06
                lineToRelative(dx = 0.84f, dy = -0.06f)
                // l 0.09 -0.83
                lineToRelative(dx = 0.09f, dy = -0.83f)
                // a 8 8 0 0 1 15.9 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 15.9f,
                    dy1 = 0.0f,
                )
                // l 0.1 0.83
                lineToRelative(dx = 0.1f, dy = 0.83f)
                // l 0.83 0.06
                lineToRelative(dx = 0.83f, dy = 0.06f)
                // A 5.5 5.5 0 0 1 25 22.97
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 22.97f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 7.5 7.5 0 0 0 0.82 -14.85
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.82f,
                    dy1 = -14.85f,
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
        }.build().also { _virtualDesktop = it }
    }

@Suppress("ObjectPropertyName")
private var _virtualDesktop: ImageVector? = null
