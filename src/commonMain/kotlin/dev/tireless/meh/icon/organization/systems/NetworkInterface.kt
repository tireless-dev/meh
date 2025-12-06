package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NetworkInterface: ImageVector
    get() {
        val current = _networkInterface
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NetworkInterface",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 18 h-2 V6 H13 V4 h13 a2 2 0 0 1 2 2z M18 28 H6 a2 2 0 0 1 -2 -2 V13 h2 v13 h12z m8 -7 -1.8 1.8 -5.5 -5.51 a3 3 0 0 0 -3.98 -3.98 L9.42 8 A4 4 0 0 0 10 6 a4 4 0 1 0 -4 4 4 4 0 0 0 2.02 -.57 l5.28 5.28 a3 3 0 0 0 3.98 3.98 l5.51 5.52 L21 26 l5 5 5 -5z M4 6 a2 2 0 1 1 4 0 2 2 0 0 1 -4 0 m11 10 a1 1 0 1 1 2 0 1 1 0 0 1 -2 0 m8.83 10 L26 23.83 28.17 26 26 28.17z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 18
                moveTo(x = 28.0f, y = 18.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 13
                verticalLineTo(y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m 8 -7
                moveToRelative(dx = 8.0f, dy = -7.0f)
                // l -1.8 1.8
                lineToRelative(dx = -1.8f, dy = 1.8f)
                // l -5.5 -5.51
                lineToRelative(dx = -5.5f, dy = -5.51f)
                // a 3 3 0 0 0 -3.98 -3.98
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.98f,
                    dy1 = -3.98f,
                )
                // L 9.42 8
                lineTo(x = 9.42f, y = 8.0f)
                // A 4 4 0 0 0 10 6
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 6.0f,
                )
                // a 4 4 0 1 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 2.02 -0.57
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.02f,
                    dy1 = -0.57f,
                )
                // l 5.28 5.28
                lineToRelative(dx = 5.28f, dy = 5.28f)
                // a 3 3 0 0 0 3.98 3.98
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.98f,
                    dy1 = 3.98f,
                )
                // l 5.51 5.52
                lineToRelative(dx = 5.51f, dy = 5.52f)
                // L 21 26
                lineTo(x = 21.0f, y = 26.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
                close()
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
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
                // a 2 2 0 0 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // m 11 10
                moveToRelative(dx = 11.0f, dy = 10.0f)
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
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // m 8.83 10
                moveToRelative(dx = 8.83f, dy = 10.0f)
                // L 26 23.83
                lineTo(x = 26.0f, y = 23.83f)
                // L 28.17 26
                lineTo(x = 28.17f, y = 26.0f)
                // L 26 28.17z
                lineTo(x = 26.0f, y = 28.17f)
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
        }.build().also { _networkInterface = it }
    }

@Suppress("ObjectPropertyName")
private var _networkInterface: ImageVector? = null
