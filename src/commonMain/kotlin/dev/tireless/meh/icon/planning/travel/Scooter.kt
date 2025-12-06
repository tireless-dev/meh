package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scooter: ImageVector
    get() {
        val current = _scooter
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Scooter",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 28 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 M24 8 h-6 v2 h6 a1 1 0 0 1 0 2 h-3 a1 1 0 0 0 -.98 1.2 l.92 4.62 -2.5 4.18 h-2.7 l-2.57 -8.58 A2 2 0 0 0 11.26 12 H6 v2 h5.26 l.6 2 H7 a5 5 0 0 0 -5 5 v2 a1 1 0 0 0 1 1 h1 a4 4 0 0 0 8 0 h7 a1 1 0 0 0 .86 -.49 l3 -5 a1 1 0 0 0 .12 -.7 L22.22 14 H24 a3 3 0 0 0 0 -6 M8 26 a2 2 0 0 1 -2 -2 h4 a2 2 0 0 1 -2 2 m-4 -4 v-1 a3 3 0 0 1 3 -3 h5.46 l1.2 4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 28
                moveTo(x = 26.0f, y = 28.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
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
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // a 2 2 0 1 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
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
                // M 24 8
                moveTo(x = 24.0f, y = 8.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 1 1 0 0 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 1 1 0 0 0 -0.98 1.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.98f,
                    dy1 = 1.2f,
                )
                // l 0.92 4.62
                lineToRelative(dx = 0.92f, dy = 4.62f)
                // l -2.5 4.18
                lineToRelative(dx = -2.5f, dy = 4.18f)
                // h -2.7
                horizontalLineToRelative(dx = -2.7f)
                // l -2.57 -8.58
                lineToRelative(dx = -2.57f, dy = -8.58f)
                // A 2 2 0 0 0 11.26 12
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.26f,
                    y1 = 12.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5.26
                horizontalLineToRelative(dx = 5.26f)
                // l 0.6 2
                lineToRelative(dx = 0.6f, dy = 2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // a 1 1 0 0 0 0.86 -0.49
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.86f,
                    dy1 = -0.49f,
                )
                // l 3 -5
                lineToRelative(dx = 3.0f, dy = -5.0f)
                // a 1 1 0 0 0 0.12 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.12f,
                    dy1 = -0.7f,
                )
                // L 22.22 14
                lineTo(x = 22.22f, y = 14.0f)
                // H 24
                horizontalLineTo(x = 24.0f)
                // a 3 3 0 0 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m -4 -4
                moveToRelative(dx = -4.0f, dy = -4.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 5.46
                horizontalLineToRelative(dx = 5.46f)
                // l 1.2 4z
                lineToRelative(dx = 1.2f, dy = 4.0f)
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
        }.build().also { _scooter = it }
    }

@Suppress("ObjectPropertyName")
private var _scooter: ImageVector? = null
