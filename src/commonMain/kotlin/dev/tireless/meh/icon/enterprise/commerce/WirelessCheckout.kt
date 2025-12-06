package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WirelessCheckout: ImageVector
    get() {
        val current = _wirelessCheckout
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WirelessCheckout",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M18 28 v-2 a10 10 0 0 0 10 -10 h2 a12 12 0 0 1 -12 12
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 10 10 0 0 0 10 -10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = -10.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 12 12 0 0 1 -12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 12.0f,
                )
            }
            // M18 23 v-2 a5 5 0 0 0 5 -5 h2 a7 7 0 0 1 -7 7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 7 7 0 0 1 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
            }
            // M27 11 h-6 V7 a3 3 0 0 0 -3 -3 h-6 a3 3 0 0 0 -3 3 v4 H3 a1 1 0 0 0 -1 1.15 L3.88 24.3 a2 2 0 0 0 2 1.7 H15 v-2 H5.86 L4.17 13 H27Z M11 7 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 1 1 v4 h-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -1 1.15
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.15f,
                )
                // L 3.88 24.3
                lineTo(x = 3.88f, y = 24.3f)
                // a 2 2 0 0 0 2 1.7
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 1.7f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5.86
                horizontalLineTo(x = 5.86f)
                // L 4.17 13
                lineTo(x = 4.17f, y = 13.0f)
                // H 27z
                horizontalLineTo(x = 27.0f)
                close()
                // M 11 7
                moveTo(x = 11.0f, y = 7.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _wirelessCheckout = it }
    }

@Suppress("ObjectPropertyName")
private var _wirelessCheckout: ImageVector? = null
