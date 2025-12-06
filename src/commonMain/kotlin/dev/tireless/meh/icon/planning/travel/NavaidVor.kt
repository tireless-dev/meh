package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidVor: ImageVector
    get() {
        val current = _navaidVor
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NavaidVor",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="16.0" cy="16.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
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
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m30.86 15.5 -7 -12 A1 1 0 0 0 23 3 H9 a1 1 0 0 0 -.86 .5 l-7 12 a1 1 0 0 0 0 1 l7 12 A1 1 0 0 0 9 29 h14 a1 1 0 0 0 .86 -.5 l7 -12 a1 1 0 0 0 0 -1 M22.43 27 H9.57 L3.16 16 9.57 5 h12.86 l6.41 11Z
            path(
                fill = SolidColor(Color(0xFF171717)),
            ) {
                // M 30.86 15.5
                moveTo(x = 30.86f, y = 15.5f)
                // l -7 -12
                lineToRelative(dx = -7.0f, dy = -12.0f)
                // A 1 1 0 0 0 23 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.0f,
                    y1 = 3.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 0 -0.86 0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.86f,
                    dy1 = 0.5f,
                )
                // l -7 12
                lineToRelative(dx = -7.0f, dy = 12.0f)
                // a 1 1 0 0 0 0 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                )
                // l 7 12
                lineToRelative(dx = 7.0f, dy = 12.0f)
                // A 1 1 0 0 0 9 29
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 29.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 0 0.86 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.86f,
                    dy1 = -0.5f,
                )
                // l 7 -12
                lineToRelative(dx = 7.0f, dy = -12.0f)
                // a 1 1 0 0 0 0 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
                // M 22.43 27
                moveTo(x = 22.43f, y = 27.0f)
                // H 9.57
                horizontalLineTo(x = 9.57f)
                // L 3.16 16
                lineTo(x = 3.16f, y = 16.0f)
                // L 9.57 5
                lineTo(x = 9.57f, y = 5.0f)
                // h 12.86
                horizontalLineToRelative(dx = 12.86f)
                // l 6.41 11z
                lineToRelative(dx = 6.41f, dy = 11.0f)
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
        }.build().also { _navaidVor = it }
    }

@Suppress("ObjectPropertyName")
private var _navaidVor: ImageVector? = null
