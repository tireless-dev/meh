package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gears: ImageVector
    get() {
        val current = _gears
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Gears",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 21.98 q0 -.68 -.15 -1.33 L30 19.82 l-.72 -1.87 -2.2 .85 a6 6 0 0 0 -1.76 -1.8 l.97 -2.19 L24.46 14 l-.97 2.18 a6 6 0 0 0 -2.98 0 L19.54 14 l-1.83 .81 .97 2.18 a6 6 0 0 0 -1.76 1.81 l-2.2 -.85 L14 19.82 l2.15 .83 a6 6 0 0 0 0 2.61 L14 24.22 l.81 1.83 2.08 -.93 a6 6 0 0 0 1.72 1.81 l-.9 2.35 L19.58 30 l.85 -2.23 a6 6 0 0 0 3.14 0 L24.42 30 l1.87 -.72 -.9 -2.35 a6 6 0 0 0 1.72 -1.81 l2.08 .93 .81 -1.83 -2.14 -.96 A6 6 0 0 0 28 21.98 m-6 4 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8 m-8.53 -11.1 1.48 1.48 1.41 -1.41 -1.47 -1.48 A6 6 0 0 0 15.9 11 H18 V9 h-2.09 a6 6 0 0 0 -1.02 -2.47 l1.47 -1.48 -1.41 -1.41 -1.48 1.47 A6 6 0 0 0 11 4.1 V2 H9 v2.09 a6 6 0 0 0 -2.47 1.02 L5.05 3.64 3.64 5.05 5.1 6.53 A6 6 0 0 0 4.1 9 H2 v2 h2.09 a6 6 0 0 0 1.02 2.47 l-1.47 1.48 1.41 1.41 1.48 -1.47 A6 6 0 0 0 9 15.9 V18 h2 v-2.09 a6 6 0 0 0 2.47 -1.02 M6 10 a4 4 0 1 1 8 0 4 4 0 0 1 -8 0
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 21.98
                moveTo(x = 28.0f, y = 21.98f)
                // q 0 -0.68 -0.15 -1.33
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.68f,
                    dx2 = -0.15f,
                    dy2 = -1.33f,
                )
                // L 30 19.82
                lineTo(x = 30.0f, y = 19.82f)
                // l -0.72 -1.87
                lineToRelative(dx = -0.72f, dy = -1.87f)
                // l -2.2 0.85
                lineToRelative(dx = -2.2f, dy = 0.85f)
                // a 6 6 0 0 0 -1.76 -1.8
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.76f,
                    dy1 = -1.8f,
                )
                // l 0.97 -2.19
                lineToRelative(dx = 0.97f, dy = -2.19f)
                // L 24.46 14
                lineTo(x = 24.46f, y = 14.0f)
                // l -0.97 2.18
                lineToRelative(dx = -0.97f, dy = 2.18f)
                // a 6 6 0 0 0 -2.98 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.98f,
                    dy1 = 0.0f,
                )
                // L 19.54 14
                lineTo(x = 19.54f, y = 14.0f)
                // l -1.83 0.81
                lineToRelative(dx = -1.83f, dy = 0.81f)
                // l 0.97 2.18
                lineToRelative(dx = 0.97f, dy = 2.18f)
                // a 6 6 0 0 0 -1.76 1.81
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.76f,
                    dy1 = 1.81f,
                )
                // l -2.2 -0.85
                lineToRelative(dx = -2.2f, dy = -0.85f)
                // L 14 19.82
                lineTo(x = 14.0f, y = 19.82f)
                // l 2.15 0.83
                lineToRelative(dx = 2.15f, dy = 0.83f)
                // a 6 6 0 0 0 0 2.61
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.61f,
                )
                // L 14 24.22
                lineTo(x = 14.0f, y = 24.22f)
                // l 0.81 1.83
                lineToRelative(dx = 0.81f, dy = 1.83f)
                // l 2.08 -0.93
                lineToRelative(dx = 2.08f, dy = -0.93f)
                // a 6 6 0 0 0 1.72 1.81
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.72f,
                    dy1 = 1.81f,
                )
                // l -0.9 2.35
                lineToRelative(dx = -0.9f, dy = 2.35f)
                // L 19.58 30
                lineTo(x = 19.58f, y = 30.0f)
                // l 0.85 -2.23
                lineToRelative(dx = 0.85f, dy = -2.23f)
                // a 6 6 0 0 0 3.14 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.14f,
                    dy1 = 0.0f,
                )
                // L 24.42 30
                lineTo(x = 24.42f, y = 30.0f)
                // l 1.87 -0.72
                lineToRelative(dx = 1.87f, dy = -0.72f)
                // l -0.9 -2.35
                lineToRelative(dx = -0.9f, dy = -2.35f)
                // a 6 6 0 0 0 1.72 -1.81
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.72f,
                    dy1 = -1.81f,
                )
                // l 2.08 0.93
                lineToRelative(dx = 2.08f, dy = 0.93f)
                // l 0.81 -1.83
                lineToRelative(dx = 0.81f, dy = -1.83f)
                // l -2.14 -0.96
                lineToRelative(dx = -2.14f, dy = -0.96f)
                // A 6 6 0 0 0 28 21.98
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 21.98f,
                )
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // a 4 4 0 1 1 0 -8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -8.0f,
                )
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                // m -8.53 -11.1
                moveToRelative(dx = -8.53f, dy = -11.1f)
                // l 1.48 1.48
                lineToRelative(dx = 1.48f, dy = 1.48f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // l -1.47 -1.48
                lineToRelative(dx = -1.47f, dy = -1.48f)
                // A 6 6 0 0 0 15.9 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.9f,
                    y1 = 11.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h -2.09
                horizontalLineToRelative(dx = -2.09f)
                // a 6 6 0 0 0 -1.02 -2.47
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.02f,
                    dy1 = -2.47f,
                )
                // l 1.47 -1.48
                lineToRelative(dx = 1.47f, dy = -1.48f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // l -1.48 1.47
                lineToRelative(dx = -1.48f, dy = 1.47f)
                // A 6 6 0 0 0 11 4.1
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 4.1f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 2.09
                verticalLineToRelative(dy = 2.09f)
                // a 6 6 0 0 0 -2.47 1.02
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.47f,
                    dy1 = 1.02f,
                )
                // L 5.05 3.64
                lineTo(x = 5.05f, y = 3.64f)
                // L 3.64 5.05
                lineTo(x = 3.64f, y = 5.05f)
                // L 5.1 6.53
                lineTo(x = 5.1f, y = 6.53f)
                // A 6 6 0 0 0 4.1 9
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.1f,
                    y1 = 9.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.09
                horizontalLineToRelative(dx = 2.09f)
                // a 6 6 0 0 0 1.02 2.47
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.02f,
                    dy1 = 2.47f,
                )
                // l -1.47 1.48
                lineToRelative(dx = -1.47f, dy = 1.48f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // l 1.48 -1.47
                lineToRelative(dx = 1.48f, dy = -1.47f)
                // A 6 6 0 0 0 9 15.9
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 15.9f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.09
                verticalLineToRelative(dy = -2.09f)
                // a 6 6 0 0 0 2.47 -1.02
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.47f,
                    dy1 = -1.02f,
                )
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _gears = it }
    }

@Suppress("ObjectPropertyName")
private var _gears: ImageVector? = null
