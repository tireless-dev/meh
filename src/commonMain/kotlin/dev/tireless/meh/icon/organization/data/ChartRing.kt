package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRing: ImageVector
    get() {
        val current = _chartRing
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartRing",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m11.95 13 H21.9 a5.98 5.98 0 0 0 -9.38 -3.88 L8.26 6.85 A11.98 11.98 0 0 1 27.95 15 M16 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 M4 16 a12 12 0 0 1 2.85 -7.74 l4.27 4.27 A5.98 5.98 0 0 0 15 21.91 v6.04 A12 12 0 0 1 4 16 m13 11.95 v-6.04 A6 6 0 0 0 21.91 17 h6.04 A12 12 0 0 1 17 27.95
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 11.95 13
                moveToRelative(dx = 11.95f, dy = 13.0f)
                // H 21.9
                horizontalLineTo(x = 21.9f)
                // a 5.98 5.98 0 0 0 -9.38 -3.88
                arcToRelative(
                    a = 5.98f,
                    b = 5.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.38f,
                    dy1 = -3.88f,
                )
                // L 8.26 6.85
                lineTo(x = 8.26f, y = 6.85f)
                // A 11.98 11.98 0 0 1 27.95 15
                arcTo(
                    horizontalEllipseRadius = 11.98f,
                    verticalEllipseRadius = 11.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.95f,
                    y1 = 15.0f,
                )
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
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
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // a 12 12 0 0 1 2.85 -7.74
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.85f,
                    dy1 = -7.74f,
                )
                // l 4.27 4.27
                lineToRelative(dx = 4.27f, dy = 4.27f)
                // A 5.98 5.98 0 0 0 15 21.91
                arcTo(
                    horizontalEllipseRadius = 5.98f,
                    verticalEllipseRadius = 5.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 21.91f,
                )
                // v 6.04
                verticalLineToRelative(dy = 6.04f)
                // A 12 12 0 0 1 4 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // m 13 11.95
                moveToRelative(dx = 13.0f, dy = 11.95f)
                // v -6.04
                verticalLineToRelative(dy = -6.04f)
                // A 6 6 0 0 0 21.91 17
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.91f,
                    y1 = 17.0f,
                )
                // h 6.04
                horizontalLineToRelative(dx = 6.04f)
                // A 12 12 0 0 1 17 27.95
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 27.95f,
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
        }.build().also { _chartRing = it }
    }

@Suppress("ObjectPropertyName")
private var _chartRing: ImageVector? = null
