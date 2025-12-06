package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WorshipMuslim: ImageVector
    get() {
        val current = _worshipMuslim
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WorshipMuslim",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 18 a1 1 0 0 1 -.54 -.16 L22 14.97 l-4.46 2.87 a1 1 0 0 1 -1.5 -1.1 l1.34 -5.13 -3.07 -2.92 a1 1 0 0 1 .55 -1.71 l4.38 -.62 1.86 -3.8 A1 1 0 0 1 22 2 a1 1 0 0 1 .9 .54 l1.99 3.82 4.26 .62 a1 1 0 0 1 .55 1.71 l-3.07 2.92 1.35 5.14 A1 1 0 0 1 27 18 m-5 -5.22 a1 1 0 0 1 .54 .16 l2.84 1.83 -.85 -3.22 a1 1 0 0 1 .28 -.98 l2 -1.9 -2.72 -.4 a1 1 0 0 1 -.75 -.53 l-1.31 -2.52 -1.23 2.5 a1 1 0 0 1 -.76 .55 l-2.85 .4 2 1.9 a1 1 0 0 1 .28 .98 l-.85 3.22 2.84 -1.83 A1 1 0 0 1 22 12.78
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 18
                moveTo(x = 27.0f, y = 18.0f)
                // a 1 1 0 0 1 -0.54 -0.16
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.54f,
                    dy1 = -0.16f,
                )
                // L 22 14.97
                lineTo(x = 22.0f, y = 14.97f)
                // l -4.46 2.87
                lineToRelative(dx = -4.46f, dy = 2.87f)
                // a 1 1 0 0 1 -1.5 -1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = -1.1f,
                )
                // l 1.34 -5.13
                lineToRelative(dx = 1.34f, dy = -5.13f)
                // l -3.07 -2.92
                lineToRelative(dx = -3.07f, dy = -2.92f)
                // a 1 1 0 0 1 0.55 -1.71
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = -1.71f,
                )
                // l 4.38 -0.62
                lineToRelative(dx = 4.38f, dy = -0.62f)
                // l 1.86 -3.8
                lineToRelative(dx = 1.86f, dy = -3.8f)
                // A 1 1 0 0 1 22 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 2.0f,
                )
                // a 1 1 0 0 1 0.9 0.54
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = 0.54f,
                )
                // l 1.99 3.82
                lineToRelative(dx = 1.99f, dy = 3.82f)
                // l 4.26 0.62
                lineToRelative(dx = 4.26f, dy = 0.62f)
                // a 1 1 0 0 1 0.55 1.71
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = 1.71f,
                )
                // l -3.07 2.92
                lineToRelative(dx = -3.07f, dy = 2.92f)
                // l 1.35 5.14
                lineToRelative(dx = 1.35f, dy = 5.14f)
                // A 1 1 0 0 1 27 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.0f,
                    y1 = 18.0f,
                )
                // m -5 -5.22
                moveToRelative(dx = -5.0f, dy = -5.22f)
                // a 1 1 0 0 1 0.54 0.16
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.54f,
                    dy1 = 0.16f,
                )
                // l 2.84 1.83
                lineToRelative(dx = 2.84f, dy = 1.83f)
                // l -0.85 -3.22
                lineToRelative(dx = -0.85f, dy = -3.22f)
                // a 1 1 0 0 1 0.28 -0.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.28f,
                    dy1 = -0.98f,
                )
                // l 2 -1.9
                lineToRelative(dx = 2.0f, dy = -1.9f)
                // l -2.72 -0.4
                lineToRelative(dx = -2.72f, dy = -0.4f)
                // a 1 1 0 0 1 -0.75 -0.53
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.75f,
                    dy1 = -0.53f,
                )
                // l -1.31 -2.52
                lineToRelative(dx = -1.31f, dy = -2.52f)
                // l -1.23 2.5
                lineToRelative(dx = -1.23f, dy = 2.5f)
                // a 1 1 0 0 1 -0.76 0.55
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.76f,
                    dy1 = 0.55f,
                )
                // l -2.85 0.4
                lineToRelative(dx = -2.85f, dy = 0.4f)
                // l 2 1.9
                lineToRelative(dx = 2.0f, dy = 1.9f)
                // a 1 1 0 0 1 0.28 0.98
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.28f,
                    dy1 = 0.98f,
                )
                // l -0.85 3.22
                lineToRelative(dx = -0.85f, dy = 3.22f)
                // l 2.84 -1.83
                lineToRelative(dx = 2.84f, dy = -1.83f)
                // A 1 1 0 0 1 22 12.78
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 12.78f,
                )
            }
            // M15.82 30 A13.81 13.81 0 0 1 9.08 4.13 a1 1 0 0 1 1.36 1.36 A11.8 11.8 0 0 0 26.5 21.56 a1 1 0 0 1 1.36 1.36 A13.8 13.8 0 0 1 15.82 30 M7.32 7.97 a11.81 11.81 0 0 0 16.7 16.7 13.8 13.8 0 0 1 -16.7 -16.7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15.82 30
                moveTo(x = 15.82f, y = 30.0f)
                // A 13.81 13.81 0 0 1 9.08 4.13
                arcTo(
                    horizontalEllipseRadius = 13.81f,
                    verticalEllipseRadius = 13.81f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.08f,
                    y1 = 4.13f,
                )
                // a 1 1 0 0 1 1.36 1.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.36f,
                    dy1 = 1.36f,
                )
                // A 11.8 11.8 0 0 0 26.5 21.56
                arcTo(
                    horizontalEllipseRadius = 11.8f,
                    verticalEllipseRadius = 11.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.5f,
                    y1 = 21.56f,
                )
                // a 1 1 0 0 1 1.36 1.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.36f,
                    dy1 = 1.36f,
                )
                // A 13.8 13.8 0 0 1 15.82 30
                arcTo(
                    horizontalEllipseRadius = 13.8f,
                    verticalEllipseRadius = 13.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.82f,
                    y1 = 30.0f,
                )
                // M 7.32 7.97
                moveTo(x = 7.32f, y = 7.97f)
                // a 11.81 11.81 0 0 0 16.7 16.7
                arcToRelative(
                    a = 11.81f,
                    b = 11.81f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 16.7f,
                    dy1 = 16.7f,
                )
                // a 13.8 13.8 0 0 1 -16.7 -16.7
                arcToRelative(
                    a = 13.8f,
                    b = 13.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -16.7f,
                    dy1 = -16.7f,
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
        }.build().also { _worshipMuslim = it }
    }

@Suppress("ObjectPropertyName")
private var _worshipMuslim: ImageVector? = null
