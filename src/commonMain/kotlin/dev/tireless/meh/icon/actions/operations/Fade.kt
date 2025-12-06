package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fade: ImageVector
    get() {
        val current = _fade
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Fade",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M8.24 25.14 7 26.67 a14 14 0 0 0 4.18 2.44 l.69 -1.87 a12 12 0 0 1 -3.63 -2.1 M4.19 18 l-2 .41 A14 14 0 0 0 3.86 23 l1.73 -1 a12 12 0 0 1 -1.4 -4 m7.63 -13.24 -.69 -1.87 A14 14 0 0 0 7 5.33 l1.24 1.53 a12 12 0 0 1 3.58 -2.1 M5.59 10 3.86 9 a14 14 0 0 0 -1.64 4.59 l2 .34 A12 12 0 0 1 5.59 10 M16 2 v2 a12 12 0 0 1 0 24 v2 a14 14 0 0 0 0 -28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.24 25.14
                moveTo(x = 8.24f, y = 25.14f)
                // L 7 26.67
                lineTo(x = 7.0f, y = 26.67f)
                // a 14 14 0 0 0 4.18 2.44
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.18f,
                    dy1 = 2.44f,
                )
                // l 0.69 -1.87
                lineToRelative(dx = 0.69f, dy = -1.87f)
                // a 12 12 0 0 1 -3.63 -2.1
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.63f,
                    dy1 = -2.1f,
                )
                // M 4.19 18
                moveTo(x = 4.19f, y = 18.0f)
                // l -2 0.41
                lineToRelative(dx = -2.0f, dy = 0.41f)
                // A 14 14 0 0 0 3.86 23
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.86f,
                    y1 = 23.0f,
                )
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // a 12 12 0 0 1 -1.4 -4
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = -4.0f,
                )
                // m 7.63 -13.24
                moveToRelative(dx = 7.63f, dy = -13.24f)
                // l -0.69 -1.87
                lineToRelative(dx = -0.69f, dy = -1.87f)
                // A 14 14 0 0 0 7 5.33
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 5.33f,
                )
                // l 1.24 1.53
                lineToRelative(dx = 1.24f, dy = 1.53f)
                // a 12 12 0 0 1 3.58 -2.1
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.58f,
                    dy1 = -2.1f,
                )
                // M 5.59 10
                moveTo(x = 5.59f, y = 10.0f)
                // L 3.86 9
                lineTo(x = 3.86f, y = 9.0f)
                // a 14 14 0 0 0 -1.64 4.59
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.64f,
                    dy1 = 4.59f,
                )
                // l 2 0.34
                lineToRelative(dx = 2.0f, dy = 0.34f)
                // A 12 12 0 0 1 5.59 10
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.59f,
                    y1 = 10.0f,
                )
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 12 12 0 0 1 0 24
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 24.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 14 14 0 0 0 0 -28
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -28.0f,
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
        }.build().also { _fade = it }
    }

@Suppress("ObjectPropertyName")
private var _fade: ImageVector? = null
