package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pills: ImageVector
    get() {
        val current = _pills
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Pills",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 14 a8 8 0 0 0 -4 1.08 V9 A7 7 0 0 0 4 9 v14 a7 7 0 0 0 12.29 4.59 A8 8 0 1 0 22 14 m0 2 a6 6 0 0 1 5.91 5 H16.09 A6 6 0 0 1 22 16 M6 9 a5 5 0 0 1 10 0 v6 H6Z m5 19 a5 5 0 0 1 -5 -5 v-6 h9.77 a8 8 0 0 0 -.73 8.93 A5 5 0 0 1 11 28 m11 0 a6 6 0 0 1 -5.91 -5 h11.82 A6 6 0 0 1 22 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 14
                moveTo(x = 22.0f, y = 14.0f)
                // a 8 8 0 0 0 -4 1.08
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 1.08f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // A 7 7 0 0 0 4 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 9.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 7 7 0 0 0 12.29 4.59
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.29f,
                    dy1 = 4.59f,
                )
                // A 8 8 0 1 0 22 14
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // a 6 6 0 0 1 5.91 5
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.91f,
                    dy1 = 5.0f,
                )
                // H 16.09
                horizontalLineTo(x = 16.09f)
                // A 6 6 0 0 1 22 16
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 16.0f,
                )
                // M 6 9
                moveTo(x = 6.0f, y = 9.0f)
                // a 5 5 0 0 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
                // m 5 19
                moveToRelative(dx = 5.0f, dy = 19.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 9.77
                horizontalLineToRelative(dx = 9.77f)
                // a 8 8 0 0 0 -0.73 8.93
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.73f,
                    dy1 = 8.93f,
                )
                // A 5 5 0 0 1 11 28
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 28.0f,
                )
                // m 11 0
                moveToRelative(dx = 11.0f, dy = 0.0f)
                // a 6 6 0 0 1 -5.91 -5
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.91f,
                    dy1 = -5.0f,
                )
                // h 11.82
                horizontalLineToRelative(dx = 11.82f)
                // A 6 6 0 0 1 22 28
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 28.0f,
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
        }.build().also { _pills = it }
    }

@Suppress("ObjectPropertyName")
private var _pills: ImageVector? = null
