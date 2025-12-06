package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InfinitySymbol: ImageVector
    get() {
        val current = _infinitySymbol
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InfinitySymbol",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 23 c-5.66 0 -7.86 -6.41 -7.95 -6.68 C15.03 16.26 13.21 11 9 11 a5 5 0 0 0 0 10 q2.39 0 4.24 -2.18 l1.52 1.3 A7.5 7.5 0 0 1 9 23 7 7 0 0 1 9 9 c5.66 0 7.86 6.41 7.95 6.68 C16.97 15.74 18.79 21 23 21 a5 5 0 0 0 0 -10 q-2.39 0 -4.24 2.18 l-1.52 -1.3 A7.5 7.5 0 0 1 23 9 a7 7 0 0 1 0 14
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 23
                moveTo(x = 23.0f, y = 23.0f)
                // c -5.66 0 -7.86 -6.41 -7.95 -6.68
                curveToRelative(
                    dx1 = -5.66f,
                    dy1 = 0.0f,
                    dx2 = -7.86f,
                    dy2 = -6.41f,
                    dx3 = -7.95f,
                    dy3 = -6.68f,
                )
                // C 15.03 16.26 13.21 11 9 11
                curveTo(
                    x1 = 15.03f,
                    y1 = 16.26f,
                    x2 = 13.21f,
                    y2 = 11.0f,
                    x3 = 9.0f,
                    y3 = 11.0f,
                )
                // a 5 5 0 0 0 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                // q 2.39 0 4.24 -2.18
                quadToRelative(
                    dx1 = 2.39f,
                    dy1 = 0.0f,
                    dx2 = 4.24f,
                    dy2 = -2.18f,
                )
                // l 1.52 1.3
                lineToRelative(dx = 1.52f, dy = 1.3f)
                // A 7.5 7.5 0 0 1 9 23
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 23.0f,
                )
                // A 7 7 0 0 1 9 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 9.0f,
                )
                // c 5.66 0 7.86 6.41 7.95 6.68
                curveToRelative(
                    dx1 = 5.66f,
                    dy1 = 0.0f,
                    dx2 = 7.86f,
                    dy2 = 6.41f,
                    dx3 = 7.95f,
                    dy3 = 6.68f,
                )
                // C 16.97 15.74 18.79 21 23 21
                curveTo(
                    x1 = 16.97f,
                    y1 = 15.74f,
                    x2 = 18.79f,
                    y2 = 21.0f,
                    x3 = 23.0f,
                    y3 = 21.0f,
                )
                // a 5 5 0 0 0 0 -10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
                )
                // q -2.39 0 -4.24 2.18
                quadToRelative(
                    dx1 = -2.39f,
                    dy1 = 0.0f,
                    dx2 = -4.24f,
                    dy2 = 2.18f,
                )
                // l -1.52 -1.3
                lineToRelative(dx = -1.52f, dy = -1.3f)
                // A 7.5 7.5 0 0 1 23 9
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 9.0f,
                )
                // a 7 7 0 0 1 0 14
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 14.0f,
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
        }.build().also { _infinitySymbol = it }
    }

@Suppress("ObjectPropertyName")
private var _infinitySymbol: ImageVector? = null
