package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRotaryFirstRight: ImageVector
    get() {
        val current = _directionRotaryFirstRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionRotaryFirstRight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 18 v6.59 L15.87 14.46 A6 6 0 0 0 17 11 a6 6 0 1 0 -7 5.91 V28 h2 V16.91 a6 6 0 0 0 2.46 -1.04 L24.59 26 H18 v2 h10 V18Z m-15 -3 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // v 6.59
                verticalLineToRelative(dy = 6.59f)
                // L 15.87 14.46
                lineTo(x = 15.87f, y = 14.46f)
                // A 6 6 0 0 0 17 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 11.0f,
                )
                // a 6 6 0 1 0 -7 5.91
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 5.91f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 16.91
                verticalLineTo(y = 16.91f)
                // a 6 6 0 0 0 2.46 -1.04
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.46f,
                    dy1 = -1.04f,
                )
                // L 24.59 26
                lineTo(x = 24.59f, y = 26.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // V 18z
                verticalLineTo(y = 18.0f)
                close()
                // m -15 -3
                moveToRelative(dx = -15.0f, dy = -3.0f)
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
        }.build().also { _directionRotaryFirstRight = it }
    }

@Suppress("ObjectPropertyName")
private var _directionRotaryFirstRight: ImageVector? = null
