package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Departure: ImageVector
    get() {
        val current = _departure
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Departure",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // m13.48 5.15 5.69 8.14 .8 1.15 1.35 -.36 4.52 -1.21 a2 2 0 0 1 1.12 0 A1.8 1.8 0 0 1 28.23 14 1.87 1.87 0 0 1 27 16.45 l-18.71 5 a2 2 0 0 1 -1 0 A1.9 1.9 0 0 1 6 20.12 l-.25 -.93 L5 16.38 l-.74 -2.74 1.44 -.39 2.3 3.1 .81 1.08 1.31 -.35 2.8 -.75 1.94 -.52 -.52 -1.93 -2.26 -8.36z M14.16 3 a1 1 0 0 0 -.5 0 l-3.09 .83 A1 1 0 0 0 9.89 5 l2.5 9.36 -2.81 .75 -2.73 -3.61 a1 1 0 0 0 -.52 -.36 1 1 0 0 0 -.5 0 L2.72 12 A1 1 0 0 0 2 13.16 l1 3.74 .75 2.8 L4 20.64 a3.9 3.9 0 0 0 2.74 2.74 4 4 0 0 0 2 0 l18.7 -5 a3.84 3.84 0 0 0 0 -7.44 4 4 0 0 0 -2.16 0 l-4.51 1.21 -6.07 -8.74 A1 1 0 0 0 14.16 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13.48 5.15
                moveTo(x = 13.48f, y = 5.15f)
                // l 5.69 8.14
                lineToRelative(dx = 5.69f, dy = 8.14f)
                // l 0.8 1.15
                lineToRelative(dx = 0.8f, dy = 1.15f)
                // l 1.35 -0.36
                lineToRelative(dx = 1.35f, dy = -0.36f)
                // l 4.52 -1.21
                lineToRelative(dx = 4.52f, dy = -1.21f)
                // a 2 2 0 0 1 1.12 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.12f,
                    dy1 = 0.0f,
                )
                // A 1.8 1.8 0 0 1 28.23 14
                arcTo(
                    horizontalEllipseRadius = 1.8f,
                    verticalEllipseRadius = 1.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.23f,
                    y1 = 14.0f,
                )
                // A 1.87 1.87 0 0 1 27 16.45
                arcTo(
                    horizontalEllipseRadius = 1.87f,
                    verticalEllipseRadius = 1.87f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.0f,
                    y1 = 16.45f,
                )
                // l -18.71 5
                lineToRelative(dx = -18.71f, dy = 5.0f)
                // a 2 2 0 0 1 -1 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                // A 1.9 1.9 0 0 1 6 20.12
                arcTo(
                    horizontalEllipseRadius = 1.9f,
                    verticalEllipseRadius = 1.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 20.12f,
                )
                // l -0.25 -0.93
                lineToRelative(dx = -0.25f, dy = -0.93f)
                // L 5 16.38
                lineTo(x = 5.0f, y = 16.38f)
                // l -0.74 -2.74
                lineToRelative(dx = -0.74f, dy = -2.74f)
                // l 1.44 -0.39
                lineToRelative(dx = 1.44f, dy = -0.39f)
                // l 2.3 3.1
                lineToRelative(dx = 2.3f, dy = 3.1f)
                // l 0.81 1.08
                lineToRelative(dx = 0.81f, dy = 1.08f)
                // l 1.31 -0.35
                lineToRelative(dx = 1.31f, dy = -0.35f)
                // l 2.8 -0.75
                lineToRelative(dx = 2.8f, dy = -0.75f)
                // l 1.94 -0.52
                lineToRelative(dx = 1.94f, dy = -0.52f)
                // l -0.52 -1.93
                lineToRelative(dx = -0.52f, dy = -1.93f)
                // l -2.26 -8.36z
                lineToRelative(dx = -2.26f, dy = -8.36f)
                close()
                // M 14.16 3
                moveTo(x = 14.16f, y = 3.0f)
                // a 1 1 0 0 0 -0.5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                )
                // l -3.09 0.83
                lineToRelative(dx = -3.09f, dy = 0.83f)
                // A 1 1 0 0 0 9.89 5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.89f,
                    y1 = 5.0f,
                )
                // l 2.5 9.36
                lineToRelative(dx = 2.5f, dy = 9.36f)
                // l -2.81 0.75
                lineToRelative(dx = -2.81f, dy = 0.75f)
                // l -2.73 -3.61
                lineToRelative(dx = -2.73f, dy = -3.61f)
                // a 1 1 0 0 0 -0.52 -0.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.52f,
                    dy1 = -0.36f,
                )
                // a 1 1 0 0 0 -0.5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                )
                // L 2.72 12
                lineTo(x = 2.72f, y = 12.0f)
                // A 1 1 0 0 0 2 13.16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 13.16f,
                )
                // l 1 3.74
                lineToRelative(dx = 1.0f, dy = 3.74f)
                // l 0.75 2.8
                lineToRelative(dx = 0.75f, dy = 2.8f)
                // L 4 20.64
                lineTo(x = 4.0f, y = 20.64f)
                // a 3.9 3.9 0 0 0 2.74 2.74
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.74f,
                    dy1 = 2.74f,
                )
                // a 4 4 0 0 0 2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 18.7 -5
                lineToRelative(dx = 18.7f, dy = -5.0f)
                // a 3.84 3.84 0 0 0 0 -7.44
                arcToRelative(
                    a = 3.84f,
                    b = 3.84f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -7.44f,
                )
                // a 4 4 0 0 0 -2.16 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.16f,
                    dy1 = 0.0f,
                )
                // l -4.51 1.21
                lineToRelative(dx = -4.51f, dy = 1.21f)
                // l -6.07 -8.74
                lineToRelative(dx = -6.07f, dy = -8.74f)
                // A 1 1 0 0 0 14.16 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.16f,
                    y1 = 3.0f,
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
        }.build().also { _departure = it }
    }

@Suppress("ObjectPropertyName")
private var _departure: ImageVector? = null
