package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateCounterclockwise: ImageVector
    get() {
        val current = _rotateCounterclockwise
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RotateCounterclockwise",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M2 28 V16 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 m2 -12 v12 h12 V16Z M17 2 l1.41 1.41 L15.83 6 H21 a7 7 0 0 1 7 7 v5 h-2 v-5 a5 5 0 0 0 -5 -5 h-5.17 l2.58 2.59 L17 12 l-5 -5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // V 16
                verticalLineTo(y = 16.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // m 2 -12
                moveToRelative(dx = 2.0f, dy = -12.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 16z
                verticalLineTo(y = 16.0f)
                close()
                // M 17 2
                moveTo(x = 17.0f, y = 2.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 15.83 6
                lineTo(x = 15.83f, y = 6.0f)
                // H 21
                horizontalLineTo(x = 21.0f)
                // a 7 7 0 0 1 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h -5.17
                horizontalLineToRelative(dx = -5.17f)
                // l 2.58 2.59
                lineToRelative(dx = 2.58f, dy = 2.59f)
                // L 17 12
                lineTo(x = 17.0f, y = 12.0f)
                // l -5 -5z
                lineToRelative(dx = -5.0f, dy = -5.0f)
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
        }.build().also { _rotateCounterclockwise = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateCounterclockwise: ImageVector? = null
