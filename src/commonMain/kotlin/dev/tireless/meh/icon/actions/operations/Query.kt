package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Query: ImageVector
    get() {
        val current = _query
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Query",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="11.0" cy="15.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 15.5
                moveTo(x = 11.0f, y = 15.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 12 h-2 V8 h2 a2 2 0 0 0 0 -4 h-2 a2 2 0 0 0 -2 2 v.5 H6 V6 a4 4 0 0 1 4 -4 h2 a4 4 0 0 1 0 8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
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
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 4 4 0 0 1 0 8z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                close()
            }
            // M22.45 21.03 a10.97 10.97 0 0 0 -2.53 -16.29 l-1 1.73 A9 9 0 1 1 5 14 H3 a11 11 0 0 0 18.03 8.45 L28.6 30 30 28.59Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.45 21.03
                moveTo(x = 22.45f, y = 21.03f)
                // a 10.97 10.97 0 0 0 -2.53 -16.29
                arcToRelative(
                    a = 10.97f,
                    b = 10.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.53f,
                    dy1 = -16.29f,
                )
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // A 9 9 0 1 1 5 14
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 14.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 11 11 0 0 0 18.03 8.45
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 18.03f,
                    dy1 = 8.45f,
                )
                // L 28.6 30
                lineTo(x = 28.6f, y = 30.0f)
                // L 30 28.59z
                lineTo(x = 30.0f, y = 28.59f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _query = it }
    }

@Suppress("ObjectPropertyName")
private var _query: ImageVector? = null
