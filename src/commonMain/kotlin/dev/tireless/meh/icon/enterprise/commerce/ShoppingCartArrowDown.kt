package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingCartArrowDown: ImageVector
    get() {
        val current = _shoppingCartArrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ShoppingCartArrowDown",
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
            // <polygon points="21.586 6.586 18.0 10.172 18.0 2.0 16.0 2.0 16.0 10.172 12.414 6.586 11.0 8.0 17.0 14.0 23.0 8.0 21.586 6.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.586 6.586
                moveTo(x = 21.586f, y = 6.586f)
                // L 18 10.172
                lineTo(x = 18.0f, y = 10.172f)
                // L 18 2
                lineTo(x = 18.0f, y = 2.0f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // L 16 10.172
                lineTo(x = 16.0f, y = 10.172f)
                // L 12.414 6.586
                lineTo(x = 12.414f, y = 6.586f)
                // L 11 8
                lineTo(x = 11.0f, y = 8.0f)
                // L 17 14
                lineTo(x = 17.0f, y = 14.0f)
                // L 23 8
                lineTo(x = 23.0f, y = 8.0f)
                // L 21.586 6.586z
                lineTo(x = 21.586f, y = 6.586f)
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
        }.build().also { _shoppingCartArrowDown = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCartArrowDown: ImageVector? = null
