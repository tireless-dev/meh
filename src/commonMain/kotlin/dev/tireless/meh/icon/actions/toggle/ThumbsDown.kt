package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsDown: ImageVector
    get() {
        val current = _thumbsDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ThumbsDown",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 16 V9 a7 7 0 0 0 -7 -7 H2 v14 h6.46 l3.58 5.37 .85 5.91 A2 2 0 0 0 14.87 29 H17 a3 3 0 0 0 3 -3 v-6 h6 a4 4 0 0 0 4 -4 M8 14 H4 V4 h4Z m20 2 a2 2 0 0 1 -2 2 h-8 v8 a1 1 0 0 1 -1 1 h-2.13 l-.91 -6.37 L10 14.7 V4 h13 a5 5 0 0 1 5 5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 6.46
                horizontalLineToRelative(dx = 6.46f)
                // l 3.58 5.37
                lineToRelative(dx = 3.58f, dy = 5.37f)
                // l 0.85 5.91
                lineToRelative(dx = 0.85f, dy = 5.91f)
                // A 2 2 0 0 0 14.87 29
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.87f,
                    y1 = 29.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 20 2
                moveToRelative(dx = 20.0f, dy = 2.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -2.13
                horizontalLineToRelative(dx = -2.13f)
                // l -0.91 -6.37
                lineToRelative(dx = -0.91f, dy = -6.37f)
                // L 10 14.7
                lineTo(x = 10.0f, y = 14.7f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
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
        }.build().also { _thumbsDown = it }
    }

@Suppress("ObjectPropertyName")
private var _thumbsDown: ImageVector? = null
