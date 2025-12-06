package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Point: ImageVector
    get() {
        val current = _point
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Point",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 13 a3 3 0 0 0 -1.47 .4 2.94 2.94 0 0 0 -4 -1 A3 3 0 0 0 16 11.18 V6 a3 3 0 1 0 -6 0 v11.1 l-2.22 -1.52 a3 3 0 0 0 -3.89 4.55 l8 7.3 A6.2 6.2 0 0 0 16 29 h5 a7 7 0 0 0 7 -7 v-6 a3 3 0 0 0 -3 -3 m1 9 a5 5 0 0 1 -5 5 h-5 a4.2 4.2 0 0 1 -2.76 -1 L5.3 18.7 a1 1 0 0 1 1.3 -1.5 l5.4 3.7 V6 a1 1 0 1 1 2 0 v11 h2 v-3 a1 1 0 1 1 2 0 v3 h2 v-2 a1 1 0 1 1 2 0 v2 h2 v-1 a1 1 0 1 1 2 0z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 13
                moveTo(x = 25.0f, y = 13.0f)
                // a 3 3 0 0 0 -1.47 0.4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.47f,
                    dy1 = 0.4f,
                )
                // a 2.94 2.94 0 0 0 -4 -1
                arcToRelative(
                    a = 2.94f,
                    b = 2.94f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -1.0f,
                )
                // A 3 3 0 0 0 16 11.18
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 11.18f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 1 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // v 11.1
                verticalLineToRelative(dy = 11.1f)
                // l -2.22 -1.52
                lineToRelative(dx = -2.22f, dy = -1.52f)
                // a 3 3 0 0 0 -3.89 4.55
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.89f,
                    dy1 = 4.55f,
                )
                // l 8 7.3
                lineToRelative(dx = 8.0f, dy = 7.3f)
                // A 6.2 6.2 0 0 0 16 29
                arcTo(
                    horizontalEllipseRadius = 6.2f,
                    verticalEllipseRadius = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 29.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // m 1 9
                moveToRelative(dx = 1.0f, dy = 9.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // a 4.2 4.2 0 0 1 -2.76 -1
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.76f,
                    dy1 = -1.0f,
                )
                // L 5.3 18.7
                lineTo(x = 5.3f, y = 18.7f)
                // a 1 1 0 0 1 1.3 -1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.3f,
                    dy1 = -1.5f,
                )
                // l 5.4 3.7
                lineToRelative(dx = 5.4f, dy = 3.7f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 1 1 2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
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
        }.build().also { _point = it }
    }

@Suppress("ObjectPropertyName")
private var _point: ImageVector? = null
