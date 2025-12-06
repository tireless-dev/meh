package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bicycle: ImageVector
    get() {
        val current = _bicycle
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Bicycle",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m26 16 -.26 .01 L24.24 9 H28 V7 h-5 a1 1 0 0 0 -.98 1.21 l.6 2.79 H12.39 l-1 -3 H14 V6 H7 v2 h2.28 l1.04 3.12 -2.57 5.14 A6 6 0 1 0 11.91 23 h2.61 a2 2 0 0 0 1.56 -.75 l7.06 -8.82 .64 3 A5.99 5.99 0 1 0 26 16 M6 26 a4 4 0 1 1 .84 -7.9 L5.1 21.54 A1 1 0 0 0 5 22 a1 1 0 0 0 1.89 .44 L8.62 19 A3.98 3.98 0 0 1 6 26 m5.91 -5 a6 6 0 0 0 -2.37 -3.84 l1.68 -3.35 2.4 7.19Z m3.46 -1.06 L13.05 13 h7.87Z M26 26 a3.99 3.99 0 0 1 -1.79 -7.56 l.81 3.77 h.02 A1 1 0 0 0 26 23 a1 1 0 0 0 1 -1 l-.04 -.2 .02 -.01 -.81 -3.77 A4 4 0 0 1 26 26
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 16
                moveTo(x = 26.0f, y = 16.0f)
                // l -0.26 0.01
                lineToRelative(dx = -0.26f, dy = 0.01f)
                // L 24.24 9
                lineTo(x = 24.24f, y = 9.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // a 1 1 0 0 0 -0.98 1.21
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.98f,
                    dy1 = 1.21f,
                )
                // l 0.6 2.79
                lineToRelative(dx = 0.6f, dy = 2.79f)
                // H 12.39
                horizontalLineTo(x = 12.39f)
                // l -1 -3
                lineToRelative(dx = -1.0f, dy = -3.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.28
                horizontalLineToRelative(dx = 2.28f)
                // l 1.04 3.12
                lineToRelative(dx = 1.04f, dy = 3.12f)
                // l -2.57 5.14
                lineToRelative(dx = -2.57f, dy = 5.14f)
                // A 6 6 0 1 0 11.91 23
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 11.91f,
                    y1 = 23.0f,
                )
                // h 2.61
                horizontalLineToRelative(dx = 2.61f)
                // a 2 2 0 0 0 1.56 -0.75
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.56f,
                    dy1 = -0.75f,
                )
                // l 7.06 -8.82
                lineToRelative(dx = 7.06f, dy = -8.82f)
                // l 0.64 3
                lineToRelative(dx = 0.64f, dy = 3.0f)
                // A 5.99 5.99 0 1 0 26 16
                arcTo(
                    horizontalEllipseRadius = 5.99f,
                    verticalEllipseRadius = 5.99f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 16.0f,
                )
                // M 6 26
                moveTo(x = 6.0f, y = 26.0f)
                // a 4 4 0 1 1 0.84 -7.9
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.84f,
                    dy1 = -7.9f,
                )
                // L 5.1 21.54
                lineTo(x = 5.1f, y = 21.54f)
                // A 1 1 0 0 0 5 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 22.0f,
                )
                // a 1 1 0 0 0 1.89 0.44
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.89f,
                    dy1 = 0.44f,
                )
                // L 8.62 19
                lineTo(x = 8.62f, y = 19.0f)
                // A 3.98 3.98 0 0 1 6 26
                arcTo(
                    horizontalEllipseRadius = 3.98f,
                    verticalEllipseRadius = 3.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 26.0f,
                )
                // m 5.91 -5
                moveToRelative(dx = 5.91f, dy = -5.0f)
                // a 6 6 0 0 0 -2.37 -3.84
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.37f,
                    dy1 = -3.84f,
                )
                // l 1.68 -3.35
                lineToRelative(dx = 1.68f, dy = -3.35f)
                // l 2.4 7.19z
                lineToRelative(dx = 2.4f, dy = 7.19f)
                close()
                // m 3.46 -1.06
                moveToRelative(dx = 3.46f, dy = -1.06f)
                // L 13.05 13
                lineTo(x = 13.05f, y = 13.0f)
                // h 7.87z
                horizontalLineToRelative(dx = 7.87f)
                close()
                // M 26 26
                moveTo(x = 26.0f, y = 26.0f)
                // a 3.99 3.99 0 0 1 -1.79 -7.56
                arcToRelative(
                    a = 3.99f,
                    b = 3.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.79f,
                    dy1 = -7.56f,
                )
                // l 0.81 3.77
                lineToRelative(dx = 0.81f, dy = 3.77f)
                // h 0.02
                horizontalLineToRelative(dx = 0.02f)
                // A 1 1 0 0 0 26 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 23.0f,
                )
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // l -0.04 -0.2
                lineToRelative(dx = -0.04f, dy = -0.2f)
                // l 0.02 -0.01
                lineToRelative(dx = 0.02f, dy = -0.01f)
                // l -0.81 -3.77
                lineToRelative(dx = -0.81f, dy = -3.77f)
                // A 4 4 0 0 1 26 26
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.0f,
                    y1 = 26.0f,
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
        }.build().also { _bicycle = it }
    }

@Suppress("ObjectPropertyName")
private var _bicycle: ImageVector? = null
