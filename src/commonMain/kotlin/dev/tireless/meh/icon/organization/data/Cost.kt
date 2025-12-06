package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cost: ImageVector
    get() {
        val current = _cost
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cost",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 23 a7 7 0 1 1 7 -7 7 7 0 0 1 -7 7 m0 -12 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 23
                moveTo(x = 16.0f, y = 23.0f)
                // a 7 7 0 1 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
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
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // a 5 5 0 1 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
            }
            // M30 6.41 28.59 5 l-3.35 3.35 a12 12 0 0 0 -1.59 -1.59 L27 3.41 25.59 2 l-3.61 3.6 A11.98 11.98 0 0 0 5.6 21.99 L2 25.58 3.41 27 l3.35 -3.35 a12 12 0 0 0 1.59 1.59 L5 28.59 6.41 30 l3.61 -3.6 A11.98 11.98 0 0 0 26.4 10.01Z M16 26 a10 10 0 1 1 10 -10 10 10 0 0 1 -10 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 6.41
                moveTo(x = 30.0f, y = 6.41f)
                // L 28.59 5
                lineTo(x = 28.59f, y = 5.0f)
                // l -3.35 3.35
                lineToRelative(dx = -3.35f, dy = 3.35f)
                // a 12 12 0 0 0 -1.59 -1.59
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.59f,
                    dy1 = -1.59f,
                )
                // L 27 3.41
                lineTo(x = 27.0f, y = 3.41f)
                // L 25.59 2
                lineTo(x = 25.59f, y = 2.0f)
                // l -3.61 3.6
                lineToRelative(dx = -3.61f, dy = 3.6f)
                // A 11.98 11.98 0 0 0 5.6 21.99
                arcTo(
                    horizontalEllipseRadius = 11.98f,
                    verticalEllipseRadius = 11.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.6f,
                    y1 = 21.99f,
                )
                // L 2 25.58
                lineTo(x = 2.0f, y = 25.58f)
                // L 3.41 27
                lineTo(x = 3.41f, y = 27.0f)
                // l 3.35 -3.35
                lineToRelative(dx = 3.35f, dy = -3.35f)
                // a 12 12 0 0 0 1.59 1.59
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.59f,
                    dy1 = 1.59f,
                )
                // L 5 28.59
                lineTo(x = 5.0f, y = 28.59f)
                // L 6.41 30
                lineTo(x = 6.41f, y = 30.0f)
                // l 3.61 -3.6
                lineToRelative(dx = 3.61f, dy = -3.6f)
                // A 11.98 11.98 0 0 0 26.4 10.01z
                arcTo(
                    horizontalEllipseRadius = 11.98f,
                    verticalEllipseRadius = 11.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.4f,
                    y1 = 10.01f,
                )
                close()
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // a 10 10 0 1 1 10 -10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = -10.0f,
                )
                // a 10 10 0 0 1 -10 10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 10.0f,
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
        }.build().also { _cost = it }
    }

@Suppress("ObjectPropertyName")
private var _cost: ImageVector? = null
