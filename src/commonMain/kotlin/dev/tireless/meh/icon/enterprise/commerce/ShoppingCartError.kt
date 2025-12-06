package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingCartError: ImageVector
    get() {
        val current = _shoppingCartError
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ShoppingCartError",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="10.0" cy="28.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="24.0" cy="28.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 28
                moveTo(x = 24.0f, y = 28.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M4.98 2.8 A1 1 0 0 0 4 2 H0 v2 h3.18 l3.84 19.2 A1 1 0 0 0 8 24 h18 v-2 H8.82 l-.8 -4 H26 a1 1 0 0 0 .98 -.78 L29.24 7 H27.2 l-2 9 H7.62Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4.98 2.8
                moveTo(x = 4.98f, y = 2.8f)
                // A 1 1 0 0 0 4 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 2.0f,
                )
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.18
                horizontalLineToRelative(dx = 3.18f)
                // l 3.84 19.2
                lineToRelative(dx = 3.84f, dy = 19.2f)
                // A 1 1 0 0 0 8 24
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 24.0f,
                )
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8.82
                horizontalLineTo(x = 8.82f)
                // l -0.8 -4
                lineToRelative(dx = -0.8f, dy = -4.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // a 1 1 0 0 0 0.98 -0.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.98f,
                    dy1 = -0.78f,
                )
                // L 29.24 7
                lineTo(x = 29.24f, y = 7.0f)
                // H 27.2
                horizontalLineTo(x = 27.2f)
                // l -2 9
                lineToRelative(dx = -2.0f, dy = 9.0f)
                // H 7.62z
                horizontalLineTo(x = 7.62f)
                close()
            }
            // M17 2 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6 m0 2 a4 4 0 0 1 2.02 .57 l-5.45 5.45 A4 4 0 0 1 13 8 a4 4 0 0 1 4 -4 m0 8 a4 4 0 0 1 -2.02 -.57 l5.45 -5.45 A4 4 0 0 1 21 8 a4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 2
                moveTo(x = 17.0f, y = 2.0f)
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
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // a 4 4 0 0 1 2.02 0.57
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.02f,
                    dy1 = 0.57f,
                )
                // l -5.45 5.45
                lineToRelative(dx = -5.45f, dy = 5.45f)
                // A 4 4 0 0 1 13 8
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 8.0f,
                )
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // a 4 4 0 0 1 -2.02 -0.57
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.02f,
                    dy1 = -0.57f,
                )
                // l 5.45 -5.45
                lineToRelative(dx = 5.45f, dy = -5.45f)
                // A 4 4 0 0 1 21 8
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 8.0f,
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
        }.build().also { _shoppingCartError = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCartError: ImageVector? = null
