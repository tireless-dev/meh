package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rocket: ImageVector
    get() {
        val current = _rocket
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Rocket",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="11" height="2" x="6.34" y="19.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.2877913 23.292168
                moveTo(x = 7.2877913f, y = 23.292168f)
                // l 7.7781744 -7.7781744
                lineToRelative(dx = 7.7781744f, dy = -7.7781744f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -7.7781744 7.7781744z
                lineToRelative(dx = -7.7781744f, dy = 7.7781744f)
                close()
            }
            // M17 30 a1 1 0 0 1 -.37 -.07 1 1 0 0 1 -.62 -.79 l-1 -7 2 -.28 .75 5.27 L21 24.52 V17 a1 1 0 0 1 .29 -.71 l4.07 -4.07 A9 9 0 0 0 28 5.86 V4 h-1.86 a9 9 0 0 0 -6.36 2.64 l-4.07 4.07 A1 1 0 0 1 15 11 H7.48 l-2.61 3.26 5.27 .75 -.28 2 -7 -1 a1 1 0 0 1 -.79 -.62 1 1 0 0 1 .15 -1 l4 -5 A1 1 0 0 1 7 9 h7.59 l3.77 -3.78 A11 11 0 0 1 26.14 2 H28 a2 2 0 0 1 2 2 v1.86 a11 11 0 0 1 -3.22 7.78 L23 17.41 V25 a1 1 0 0 1 -.38 .78 l-5 4 A1 1 0 0 1 17 30
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 30
                moveTo(x = 17.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.37 -0.07
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.37f,
                    dy1 = -0.07f,
                )
                // a 1 1 0 0 1 -0.62 -0.79
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.62f,
                    dy1 = -0.79f,
                )
                // l -1 -7
                lineToRelative(dx = -1.0f, dy = -7.0f)
                // l 2 -0.28
                lineToRelative(dx = 2.0f, dy = -0.28f)
                // l 0.75 5.27
                lineToRelative(dx = 0.75f, dy = 5.27f)
                // L 21 24.52
                lineTo(x = 21.0f, y = 24.52f)
                // V 17
                verticalLineTo(y = 17.0f)
                // a 1 1 0 0 1 0.29 -0.71
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.29f,
                    dy1 = -0.71f,
                )
                // l 4.07 -4.07
                lineToRelative(dx = 4.07f, dy = -4.07f)
                // A 9 9 0 0 0 28 5.86
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 5.86f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h -1.86
                horizontalLineToRelative(dx = -1.86f)
                // a 9 9 0 0 0 -6.36 2.64
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.36f,
                    dy1 = 2.64f,
                )
                // l -4.07 4.07
                lineToRelative(dx = -4.07f, dy = 4.07f)
                // A 1 1 0 0 1 15 11
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 11.0f,
                )
                // H 7.48
                horizontalLineTo(x = 7.48f)
                // l -2.61 3.26
                lineToRelative(dx = -2.61f, dy = 3.26f)
                // l 5.27 0.75
                lineToRelative(dx = 5.27f, dy = 0.75f)
                // l -0.28 2
                lineToRelative(dx = -0.28f, dy = 2.0f)
                // l -7 -1
                lineToRelative(dx = -7.0f, dy = -1.0f)
                // a 1 1 0 0 1 -0.79 -0.62
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.79f,
                    dy1 = -0.62f,
                )
                // a 1 1 0 0 1 0.15 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.15f,
                    dy1 = -1.0f,
                )
                // l 4 -5
                lineToRelative(dx = 4.0f, dy = -5.0f)
                // A 1 1 0 0 1 7 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 9.0f,
                )
                // h 7.59
                horizontalLineToRelative(dx = 7.59f)
                // l 3.77 -3.78
                lineToRelative(dx = 3.77f, dy = -3.78f)
                // A 11 11 0 0 1 26.14 2
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.14f,
                    y1 = 2.0f,
                )
                // H 28
                horizontalLineTo(x = 28.0f)
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
                // v 1.86
                verticalLineToRelative(dy = 1.86f)
                // a 11 11 0 0 1 -3.22 7.78
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.22f,
                    dy1 = 7.78f,
                )
                // L 23 17.41
                lineTo(x = 23.0f, y = 17.41f)
                // V 25
                verticalLineTo(y = 25.0f)
                // a 1 1 0 0 1 -0.38 0.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.38f,
                    dy1 = 0.78f,
                )
                // l -5 4
                lineToRelative(dx = -5.0f, dy = 4.0f)
                // A 1 1 0 0 1 17 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 30.0f,
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
        }.build().also { _rocket = it }
    }

@Suppress("ObjectPropertyName")
private var _rocket: ImageVector? = null
