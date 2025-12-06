package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cyclist: ImageVector
    get() {
        val current = _cyclist
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cyclist",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 30 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4 M7 30 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 30
                moveTo(x = 25.0f, y = 30.0f)
                // a 6 6 0 1 1 6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -6.0f,
                )
                // a 6 6 0 0 1 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // a 4 4 0 1 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // M 7 30
                moveTo(x = 7.0f, y = 30.0f)
                // a 6 6 0 1 1 6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -6.0f,
                )
                // a 6 6 0 0 1 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // a 4 4 0 1 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
            }
            // M17 27 h-2 v-6.59 L9.58 15 a2 2 0 0 1 0 -2.83 l4.6 -4.59 a2 2 0 0 1 2.82 0 L21.4 12 H27 v2 h-6.41 l-5 -5 L11 13.58 l6 6Z m4.5 -19 A3.5 3.5 0 1 1 25 4.5 3.5 3.5 0 0 1 21.5 8 m0 -5 A1.5 1.5 0 1 0 23 4.5 1.5 1.5 0 0 0 21.5 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 27
                moveTo(x = 17.0f, y = 27.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -6.59
                verticalLineToRelative(dy = -6.59f)
                // L 9.58 15
                lineTo(x = 9.58f, y = 15.0f)
                // a 2 2 0 0 1 0 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.83f,
                )
                // l 4.6 -4.59
                lineToRelative(dx = 4.6f, dy = -4.59f)
                // a 2 2 0 0 1 2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.82f,
                    dy1 = 0.0f,
                )
                // L 21.4 12
                lineTo(x = 21.4f, y = 12.0f)
                // H 27
                horizontalLineTo(x = 27.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6.41
                horizontalLineToRelative(dx = -6.41f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // L 11 13.58
                lineTo(x = 11.0f, y = 13.58f)
                // l 6 6z
                lineToRelative(dx = 6.0f, dy = 6.0f)
                close()
                // m 4.5 -19
                moveToRelative(dx = 4.5f, dy = -19.0f)
                // A 3.5 3.5 0 1 1 25 4.5
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 4.5f,
                )
                // A 3.5 3.5 0 0 1 21.5 8
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.5f,
                    y1 = 8.0f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // A 1.5 1.5 0 1 0 23 4.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 23.0f,
                    y1 = 4.5f,
                )
                // A 1.5 1.5 0 0 0 21.5 3
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.5f,
                    y1 = 3.0f,
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
        }.build().also { _cyclist = it }
    }

@Suppress("ObjectPropertyName")
private var _cyclist: ImageVector? = null
