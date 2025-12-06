package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Currency: ImageVector
    get() {
        val current = _currency
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Currency",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 12 v-2 h-4 V7 h-2 v3 h-2 a2 2 0 0 0 -2 2 v3 a2 2 0 0 0 2 2 h6 v3 h-8 v2 h4 v3 h2 v-3 h2 a2 2 0 0 0 2 -2 v-3 a2 2 0 0 0 -2 -2 h-6 v-3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
            }
            // M16 4 A12 12 0 1 1 4 16 12.04 12.04 0 0 1 16 4 m0 -2 a14 14 0 1 0 14 14 A14.04 14.04 0 0 0 16 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // A 12 12 0 1 1 4 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // A 12.04 12.04 0 0 1 16 4
                arcTo(
                    horizontalEllipseRadius = 12.04f,
                    verticalEllipseRadius = 12.04f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
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
                // A 14.04 14.04 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.04f,
                    verticalEllipseRadius = 14.04f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
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
        }.build().also { _currency = it }
    }

@Suppress("ObjectPropertyName")
private var _currency: ImageVector? = null
