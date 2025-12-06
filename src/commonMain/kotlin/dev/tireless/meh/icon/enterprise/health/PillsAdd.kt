package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PillsAdd: ImageVector
    get() {
        val current = _pillsAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PillsAdd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 14 a8 8 0 0 0 -4 1.08 V9 A7 7 0 0 0 4 9 v14 a6.99 6.99 0 0 0 12.28 4.58 A8 8 0 1 0 22 14 M11 4 a5 5 0 0 1 5 5 v6 H6 V9 a5 5 0 0 1 5 -5 m0 24 a5 5 0 0 1 -5 -5 v-6 h9.77 a8 8 0 0 0 -.73 8.93 A5 5 0 0 1 11 28 m11 0 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 14
                moveTo(x = 22.0f, y = 14.0f)
                // a 8 8 0 0 0 -4 1.08
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 1.08f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // A 7 7 0 0 0 4 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 9.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 6.99 6.99 0 0 0 12.28 4.58
                arcToRelative(
                    a = 6.99f,
                    b = 6.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.28f,
                    dy1 = 4.58f,
                )
                // A 8 8 0 1 0 22 14
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 14.0f,
                )
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // a 5 5 0 0 1 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // m 0 24
                moveToRelative(dx = 0.0f, dy = 24.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 9.77
                horizontalLineToRelative(dx = 9.77f)
                // a 8 8 0 0 0 -0.73 8.93
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.73f,
                    dy1 = 8.93f,
                )
                // A 5 5 0 0 1 11 28
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 28.0f,
                )
                // m 11 0
                moveToRelative(dx = 11.0f, dy = 0.0f)
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
            }
            // <polygon points="25.0 21.0 23.0 21.0 23.0 19.0 21.0 19.0 21.0 21.0 19.0 21.0 19.0 23.0 21.0 23.0 21.0 25.0 23.0 25.0 23.0 23.0 25.0 23.0 25.0 21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 21
                moveTo(x = 25.0f, y = 21.0f)
                // L 23 21
                lineTo(x = 23.0f, y = 21.0f)
                // L 23 19
                lineTo(x = 23.0f, y = 19.0f)
                // L 21 19
                lineTo(x = 21.0f, y = 19.0f)
                // L 21 21
                lineTo(x = 21.0f, y = 21.0f)
                // L 19 21
                lineTo(x = 19.0f, y = 21.0f)
                // L 19 23
                lineTo(x = 19.0f, y = 23.0f)
                // L 21 23
                lineTo(x = 21.0f, y = 23.0f)
                // L 21 25
                lineTo(x = 21.0f, y = 25.0f)
                // L 23 25
                lineTo(x = 23.0f, y = 25.0f)
                // L 23 23
                lineTo(x = 23.0f, y = 23.0f)
                // L 25 23
                lineTo(x = 25.0f, y = 23.0f)
                // L 25 21z
                lineTo(x = 25.0f, y = 21.0f)
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
        }.build().also { _pillsAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _pillsAdd: ImageVector? = null
