package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gateway: ImageVector
    get() {
        val current = _gateway
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Gateway",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M31 16 a2 2 0 0 0 -.59 -1.41 l-5.79 -5.8 2.87 -2.86 a2 2 0 1 0 -1.41 -1.42 L23.2 7.38 l-5.8 -5.8 a2 2 0 0 0 -2.82 0 l-5.8 5.8 L5.93 4.5 A2 2 0 1 0 4.5 5.93 l2.87 2.86 -5.8 5.8 a2 2 0 0 0 0 2.82 l5.8 5.8 -2.87 2.86 a2 2 0 1 0 1.42 1.42 l2.86 -2.87 5.8 5.8 a2 2 0 0 0 2.82 0 l5.8 -5.8 2.86 2.87 a2 2 0 1 0 1.42 -1.42 l-2.87 -2.86 5.8 -5.8 A2 2 0 0 0 31 16 m-7.8 5.8 L20.42 19 19 20.41 l2.8 2.8 L16 29 l-5.8 -5.8 2.8 -2.79 L11.59 19 l-2.8 2.8 L3 16 l5.8 -5.8 2.79 2.8 L13 11.59 l-2.8 -2.8 L16 3 l5.8 5.8 -2.8 2.79 L20.41 13 l2.8 -2.8 L29 16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 16
                moveTo(x = 31.0f, y = 16.0f)
                // a 2 2 0 0 0 -0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -1.41f,
                )
                // l -5.79 -5.8
                lineToRelative(dx = -5.79f, dy = -5.8f)
                // l 2.87 -2.86
                lineToRelative(dx = 2.87f, dy = -2.86f)
                // a 2 2 0 1 0 -1.41 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.41f,
                    dy1 = -1.42f,
                )
                // L 23.2 7.38
                lineTo(x = 23.2f, y = 7.38f)
                // l -5.8 -5.8
                lineToRelative(dx = -5.8f, dy = -5.8f)
                // a 2 2 0 0 0 -2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 0.0f,
                )
                // l -5.8 5.8
                lineToRelative(dx = -5.8f, dy = 5.8f)
                // L 5.93 4.5
                lineTo(x = 5.93f, y = 4.5f)
                // A 2 2 0 1 0 4.5 5.93
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 4.5f,
                    y1 = 5.93f,
                )
                // l 2.87 2.86
                lineToRelative(dx = 2.87f, dy = 2.86f)
                // l -5.8 5.8
                lineToRelative(dx = -5.8f, dy = 5.8f)
                // a 2 2 0 0 0 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // l 5.8 5.8
                lineToRelative(dx = 5.8f, dy = 5.8f)
                // l -2.87 2.86
                lineToRelative(dx = -2.87f, dy = 2.86f)
                // a 2 2 0 1 0 1.42 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 1.42f,
                )
                // l 2.86 -2.87
                lineToRelative(dx = 2.86f, dy = -2.87f)
                // l 5.8 5.8
                lineToRelative(dx = 5.8f, dy = 5.8f)
                // a 2 2 0 0 0 2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = 0.0f,
                )
                // l 5.8 -5.8
                lineToRelative(dx = 5.8f, dy = -5.8f)
                // l 2.86 2.87
                lineToRelative(dx = 2.86f, dy = 2.87f)
                // a 2 2 0 1 0 1.42 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = -1.42f,
                )
                // l -2.87 -2.86
                lineToRelative(dx = -2.87f, dy = -2.86f)
                // l 5.8 -5.8
                lineToRelative(dx = 5.8f, dy = -5.8f)
                // A 2 2 0 0 0 31 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 31.0f,
                    y1 = 16.0f,
                )
                // m -7.8 5.8
                moveToRelative(dx = -7.8f, dy = 5.8f)
                // L 20.42 19
                lineTo(x = 20.42f, y = 19.0f)
                // L 19 20.41
                lineTo(x = 19.0f, y = 20.41f)
                // l 2.8 2.8
                lineToRelative(dx = 2.8f, dy = 2.8f)
                // L 16 29
                lineTo(x = 16.0f, y = 29.0f)
                // l -5.8 -5.8
                lineToRelative(dx = -5.8f, dy = -5.8f)
                // l 2.8 -2.79
                lineToRelative(dx = 2.8f, dy = -2.79f)
                // L 11.59 19
                lineTo(x = 11.59f, y = 19.0f)
                // l -2.8 2.8
                lineToRelative(dx = -2.8f, dy = 2.8f)
                // L 3 16
                lineTo(x = 3.0f, y = 16.0f)
                // l 5.8 -5.8
                lineToRelative(dx = 5.8f, dy = -5.8f)
                // l 2.79 2.8
                lineToRelative(dx = 2.79f, dy = 2.8f)
                // L 13 11.59
                lineTo(x = 13.0f, y = 11.59f)
                // l -2.8 -2.8
                lineToRelative(dx = -2.8f, dy = -2.8f)
                // L 16 3
                lineTo(x = 16.0f, y = 3.0f)
                // l 5.8 5.8
                lineToRelative(dx = 5.8f, dy = 5.8f)
                // l -2.8 2.79
                lineToRelative(dx = -2.8f, dy = 2.79f)
                // L 20.41 13
                lineTo(x = 20.41f, y = 13.0f)
                // l 2.8 -2.8
                lineToRelative(dx = 2.8f, dy = -2.8f)
                // L 29 16z
                lineTo(x = 29.0f, y = 16.0f)
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
        }.build().also { _gateway = it }
    }

@Suppress("ObjectPropertyName")
private var _gateway: ImageVector? = null
