package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerProxy: ImageVector
    get() {
        val current = _serverProxy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ServerProxy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M6 30 h20 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 m0 -8 h20 v6 H6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 30
                moveTo(x = 6.0f, y = 30.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
            }
            // <circle cx="9.0" cy="25.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 25
                moveTo(x = 9.0f, y = 25.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
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
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m26 2 -1.41 1.41 L27.17 6 h-4.86 a6.98 6.98 0 0 0 -13.23 4 H4.83 l2.58 -2.59 L6 6 l-5 5 5 5 1.41 -1.41 L4.83 12 h4.86 a6.98 6.98 0 0 0 13.23 -4 h4.25 l-2.58 2.59 L26 12 l5 -5Z m-5 7 a4.98 4.98 0 0 1 -8.97 3 H16 v-2 h-4.9 a4.99 4.99 0 0 1 8.87 -4 H16 v2 h4.9 A5 5 0 0 1 21 9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 2
                moveTo(x = 26.0f, y = 2.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 27.17 6
                lineTo(x = 27.17f, y = 6.0f)
                // h -4.86
                horizontalLineToRelative(dx = -4.86f)
                // a 6.98 6.98 0 0 0 -13.23 4
                arcToRelative(
                    a = 6.98f,
                    b = 6.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -13.23f,
                    dy1 = 4.0f,
                )
                // H 4.83
                horizontalLineTo(x = 4.83f)
                // l 2.58 -2.59
                lineToRelative(dx = 2.58f, dy = -2.59f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 4.83 12
                lineTo(x = 4.83f, y = 12.0f)
                // h 4.86
                horizontalLineToRelative(dx = 4.86f)
                // a 6.98 6.98 0 0 0 13.23 -4
                arcToRelative(
                    a = 6.98f,
                    b = 6.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 13.23f,
                    dy1 = -4.0f,
                )
                // h 4.25
                horizontalLineToRelative(dx = 4.25f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 26 12
                lineTo(x = 26.0f, y = 12.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
                close()
                // m -5 7
                moveToRelative(dx = -5.0f, dy = 7.0f)
                // a 4.98 4.98 0 0 1 -8.97 3
                arcToRelative(
                    a = 4.98f,
                    b = 4.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.97f,
                    dy1 = 3.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4.9
                horizontalLineToRelative(dx = -4.9f)
                // a 4.99 4.99 0 0 1 8.87 -4
                arcToRelative(
                    a = 4.99f,
                    b = 4.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.87f,
                    dy1 = -4.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.9
                horizontalLineToRelative(dx = 4.9f)
                // A 5 5 0 0 1 21 9
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 9.0f,
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
        }.build().also { _serverProxy = it }
    }

@Suppress("ObjectPropertyName")
private var _serverProxy: ImageVector? = null
