package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthFilled: ImageVector
    get() {
        val current = _earthFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EarthFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M4.02 16.4 l1.34 .44 L7 19.3 v1.29 a1 1 0 0 0 .3 .7 L10 24 v2.38 a12 12 0 0 1 -5.98 -9.99 M16 28 a12 12 0 0 1 -2.57 -.28 L14 26 l1.8 -4.51 a1 1 0 0 0 -.1 -.93 l-1.4 -2.11 A1 1 0 0 0 13.46 18 H8.53 L7.3 16.13 9.4 14 H11 v2 h2 v-2.73 l3.87 -6.77 -1.74 -1 L14.28 7 h-2.74 l-1.1 -1.63 A11.9 11.9 0 0 1 20 4.7 V8 a1 1 0 0 0 1 1 h1.46 a1 1 0 0 0 .84 -.45 l.87 -1.31 A12 12 0 0 1 26.9 11 h-4.07 a1 1 0 0 0 -.98 .8 l-.72 4.47 a1 1 0 0 0 .54 1.06 L25 19 l.69 4.06 A12 12 0 0 1 16 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // M 4.02 16.4
                moveTo(x = 4.02f, y = 16.4f)
                // l 1.34 0.44
                lineToRelative(dx = 1.34f, dy = 0.44f)
                // L 7 19.3
                lineTo(x = 7.0f, y = 19.3f)
                // v 1.29
                verticalLineToRelative(dy = 1.29f)
                // a 1 1 0 0 0 0.3 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.3f,
                    dy1 = 0.7f,
                )
                // L 10 24
                lineTo(x = 10.0f, y = 24.0f)
                // v 2.38
                verticalLineToRelative(dy = 2.38f)
                // a 12 12 0 0 1 -5.98 -9.99
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.98f,
                    dy1 = -9.99f,
                )
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // a 12 12 0 0 1 -2.57 -0.28
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.57f,
                    dy1 = -0.28f,
                )
                // L 14 26
                lineTo(x = 14.0f, y = 26.0f)
                // l 1.8 -4.51
                lineToRelative(dx = 1.8f, dy = -4.51f)
                // a 1 1 0 0 0 -0.1 -0.93
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = -0.93f,
                )
                // l -1.4 -2.11
                lineToRelative(dx = -1.4f, dy = -2.11f)
                // A 1 1 0 0 0 13.46 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.46f,
                    y1 = 18.0f,
                )
                // H 8.53
                horizontalLineTo(x = 8.53f)
                // L 7.3 16.13
                lineTo(x = 7.3f, y = 16.13f)
                // L 9.4 14
                lineTo(x = 9.4f, y = 14.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.73
                verticalLineToRelative(dy = -2.73f)
                // l 3.87 -6.77
                lineToRelative(dx = 3.87f, dy = -6.77f)
                // l -1.74 -1
                lineToRelative(dx = -1.74f, dy = -1.0f)
                // L 14.28 7
                lineTo(x = 14.28f, y = 7.0f)
                // h -2.74
                horizontalLineToRelative(dx = -2.74f)
                // l -1.1 -1.63
                lineToRelative(dx = -1.1f, dy = -1.63f)
                // A 11.9 11.9 0 0 1 20 4.7
                arcTo(
                    horizontalEllipseRadius = 11.9f,
                    verticalEllipseRadius = 11.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 4.7f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 1.46
                horizontalLineToRelative(dx = 1.46f)
                // a 1 1 0 0 0 0.84 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.84f,
                    dy1 = -0.45f,
                )
                // l 0.87 -1.31
                lineToRelative(dx = 0.87f, dy = -1.31f)
                // A 12 12 0 0 1 26.9 11
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.9f,
                    y1 = 11.0f,
                )
                // h -4.07
                horizontalLineToRelative(dx = -4.07f)
                // a 1 1 0 0 0 -0.98 0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.98f,
                    dy1 = 0.8f,
                )
                // l -0.72 4.47
                lineToRelative(dx = -0.72f, dy = 4.47f)
                // a 1 1 0 0 0 0.54 1.06
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.54f,
                    dy1 = 1.06f,
                )
                // L 25 19
                lineTo(x = 25.0f, y = 19.0f)
                // l 0.69 4.06
                lineToRelative(dx = 0.69f, dy = 4.06f)
                // A 12 12 0 0 1 16 28
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.0f,
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
        }.build().also { _earthFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _earthFilled: ImageVector? = null
