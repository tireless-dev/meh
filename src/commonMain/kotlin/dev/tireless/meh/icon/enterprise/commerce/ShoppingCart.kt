package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingCart: ImageVector
    get() {
        val current = _shoppingCart
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ShoppingCart",
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
            // M28 7 H5.82 L5 2.8 A1 1 0 0 0 4 2 H0 v2 h3.18 L7 23.2 A1 1 0 0 0 8 24 h18 v-2 H8.82 L8 18 h18 a1 1 0 0 0 1 -.78 l2 -9 A1 1 0 0 0 28 7 m-2.8 9 H7.62 l-1.4 -7 h20.53Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 7
                moveTo(x = 28.0f, y = 7.0f)
                // H 5.82
                horizontalLineTo(x = 5.82f)
                // L 5 2.8
                lineTo(x = 5.0f, y = 2.8f)
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
                // L 7 23.2
                lineTo(x = 7.0f, y = 23.2f)
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
                // L 8 18
                lineTo(x = 8.0f, y = 18.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // a 1 1 0 0 0 1 -0.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -0.78f,
                )
                // l 2 -9
                lineToRelative(dx = 2.0f, dy = -9.0f)
                // A 1 1 0 0 0 28 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 7.0f,
                )
                // m -2.8 9
                moveToRelative(dx = -2.8f, dy = 9.0f)
                // H 7.62
                horizontalLineTo(x = 7.62f)
                // l -1.4 -7
                lineToRelative(dx = -1.4f, dy = -7.0f)
                // h 20.53z
                horizontalLineToRelative(dx = 20.53f)
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
        }.build().also { _shoppingCart = it }
    }

@Suppress("ObjectPropertyName")
private var _shoppingCart: ImageVector? = null
