package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Worship: ImageVector
    get() {
        val current = _worship
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Worship",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26.59 17 22 21.59 l-5 -5 a2 2 0 0 0 -2.83 0 L9.6 21.17 a2 2 0 0 0 0 2.83 l4 4 H6 v2 h10 a1 1 0 0 0 .7 -1.7 L11 22.58 15.59 18 l5.7 5.7 a1 1 0 0 0 1.42 0 L28 18.42Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.59 17
                moveTo(x = 26.59f, y = 17.0f)
                // L 22 21.59
                lineTo(x = 22.0f, y = 21.59f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // a 2 2 0 0 0 -2.83 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 0.0f,
                )
                // L 9.6 21.17
                lineTo(x = 9.6f, y = 21.17f)
                // a 2 2 0 0 0 0 2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.83f,
                )
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 0 0.7 -1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.7f,
                )
                // L 11 22.58
                lineTo(x = 11.0f, y = 22.58f)
                // L 15.59 18
                lineTo(x = 15.59f, y = 18.0f)
                // l 5.7 5.7
                lineToRelative(dx = 5.7f, dy = 5.7f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // L 28 18.42z
                lineTo(x = 28.0f, y = 18.42f)
                close()
            }
            // M21.5 17 a3.5 3.5 0 1 1 3.5 -3.5 3.5 3.5 0 0 1 -3.5 3.5 m0 -5 a1.5 1.5 0 1 0 1.5 1.5 1.5 1.5 0 0 0 -1.5 -1.5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.5 17
                moveTo(x = 21.5f, y = 17.0f)
                // a 3.5 3.5 0 1 1 3.5 -3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.5f,
                    dy1 = -3.5f,
                )
                // a 3.5 3.5 0 0 1 -3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 3.5f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // a 1.5 1.5 0 0 0 -1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                )
            }
            // m4 10.6 12 -6.46 12.53 6.74 .94 -1.76 -13 -7 a1 1 0 0 0 -.94 0 l-13 7 A1 1 0 0 0 2 10 v20 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 10.6
                moveTo(x = 4.0f, y = 10.6f)
                // l 12 -6.46
                lineToRelative(dx = 12.0f, dy = -6.46f)
                // l 12.53 6.74
                lineToRelative(dx = 12.53f, dy = 6.74f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // a 1 1 0 0 0 -0.94 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.94f,
                    dy1 = 0.0f,
                )
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 0 2 10
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 10.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _worship = it }
    }

@Suppress("ObjectPropertyName")
private var _worship: ImageVector? = null
