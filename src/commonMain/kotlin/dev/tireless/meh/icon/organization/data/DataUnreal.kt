package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataUnreal: ImageVector
    get() {
        val current = _dataUnreal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataUnreal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m16.5 18.13 -7 -4 a1 1 0 0 0 -1 0 l-7 4 A1 1 0 0 0 1 19 v8 a1 1 0 0 0 .5 .87 l7 4 a1 1 0 0 0 1 0 l7 -4 A1 1 0 0 0 17 27 v-8 a1 1 0 0 0 -.5 -.87 M9 16.15 13.98 19 9 21.85 4.02 19z m-6 4.57 5 2.86 v5.7 l-5 -2.86z m7 8.56 v-5.7 l5 -2.86 v5.7z M28 19 v5 a2 2 0 0 1 -2 2 h-3.17 l1.58 -1.59 L23 23 l-4 4 4 4 1.41 -1.41 L22.83 28 H26 a4 4 0 0 0 4 -4 v-5z m-10.5 -3.99 -2 -1.14 A1 1 0 0 1 15 13 v-2 h2 v1.42 l1.5 .85z m8 -.6 L24 15.29 V13 h-2 v2.28 l-1.5 -.86 -1 1.73 3 1.72 a1 1 0 0 0 1 0 l3 -1.72z m3 .6 -1 -1.74 1.5 -.85 V11 h2 v2 a1 1 0 0 1 -.5 .87z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.5 18.13
                moveTo(x = 16.5f, y = 18.13f)
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // a 1 1 0 0 0 -1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                // l -7 4
                lineToRelative(dx = -7.0f, dy = 4.0f)
                // A 1 1 0 0 0 1 19
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 1.0f,
                    y1 = 19.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 1 1 0 0 0 0.5 0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.87f,
                )
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
                // a 1 1 0 0 0 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
                // A 1 1 0 0 0 17 27
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 27.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 1 1 0 0 0 -0.5 -0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -0.87f,
                )
                // M 9 16.15
                moveTo(x = 9.0f, y = 16.15f)
                // L 13.98 19
                lineTo(x = 13.98f, y = 19.0f)
                // L 9 21.85
                lineTo(x = 9.0f, y = 21.85f)
                // L 4.02 19z
                lineTo(x = 4.02f, y = 19.0f)
                close()
                // m -6 4.57
                moveToRelative(dx = -6.0f, dy = 4.57f)
                // l 5 2.86
                lineToRelative(dx = 5.0f, dy = 2.86f)
                // v 5.7
                verticalLineToRelative(dy = 5.7f)
                // l -5 -2.86z
                lineToRelative(dx = -5.0f, dy = -2.86f)
                close()
                // m 7 8.56
                moveToRelative(dx = 7.0f, dy = 8.56f)
                // v -5.7
                verticalLineToRelative(dy = -5.7f)
                // l 5 -2.86
                lineToRelative(dx = 5.0f, dy = -2.86f)
                // v 5.7z
                verticalLineToRelative(dy = 5.7f)
                close()
                // M 28 19
                moveTo(x = 28.0f, y = 19.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -3.17
                horizontalLineToRelative(dx = -3.17f)
                // l 1.58 -1.59
                lineToRelative(dx = 1.58f, dy = -1.59f)
                // L 23 23
                lineTo(x = 23.0f, y = 23.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 22.83 28
                lineTo(x = 22.83f, y = 28.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // v -5z
                verticalLineToRelative(dy = -5.0f)
                close()
                // m -10.5 -3.99
                moveToRelative(dx = -10.5f, dy = -3.99f)
                // l -2 -1.14
                lineToRelative(dx = -2.0f, dy = -1.14f)
                // A 1 1 0 0 1 15 13
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 13.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 1.42
                verticalLineToRelative(dy = 1.42f)
                // l 1.5 0.85z
                lineToRelative(dx = 1.5f, dy = 0.85f)
                close()
                // m 8 -0.6
                moveToRelative(dx = 8.0f, dy = -0.6f)
                // L 24 15.29
                lineTo(x = 24.0f, y = 15.29f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.28
                verticalLineToRelative(dy = 2.28f)
                // l -1.5 -0.86
                lineToRelative(dx = -1.5f, dy = -0.86f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // l 3 1.72
                lineToRelative(dx = 3.0f, dy = 1.72f)
                // a 1 1 0 0 0 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 3 -1.72z
                lineToRelative(dx = 3.0f, dy = -1.72f)
                close()
                // m 3 0.6
                moveToRelative(dx = 3.0f, dy = 0.6f)
                // l -1 -1.74
                lineToRelative(dx = -1.0f, dy = -1.74f)
                // l 1.5 -0.85
                lineToRelative(dx = 1.5f, dy = -0.85f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -0.5 0.87z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = 0.87f,
                )
                close()
            }
            // <polygon points="25.4961 8.7256 24.5039 6.9888 23.0 7.8481 21.4961 6.9888 20.5039 8.7256 22.0 9.5801 22.0 11.0 24.0 11.0 24.0 9.5801 25.4961 8.7256" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.4961 8.7256
                moveTo(x = 25.4961f, y = 8.7256f)
                // L 24.5039 6.9888
                lineTo(x = 24.5039f, y = 6.9888f)
                // L 23 7.8481
                lineTo(x = 23.0f, y = 7.8481f)
                // L 21.4961 6.9888
                lineTo(x = 21.4961f, y = 6.9888f)
                // L 20.5039 8.7256
                lineTo(x = 20.5039f, y = 8.7256f)
                // L 22 9.5801
                lineTo(x = 22.0f, y = 9.5801f)
                // L 22 11
                lineTo(x = 22.0f, y = 11.0f)
                // L 24 11
                lineTo(x = 24.0f, y = 11.0f)
                // L 24 9.5801
                lineTo(x = 24.0f, y = 9.5801f)
                // L 25.4961 8.7256z
                lineTo(x = 25.4961f, y = 8.7256f)
                close()
            }
            // m30.5 4.13 -3 -1.71 -1 1.73 L27.98 5 26.5 5.85 l1 1.73 L29 6.72 V9 h2 V5 a1 1 0 0 0 -.5 -.87 m-6 -1.12 L23 2.15 l-1.5 .86 -1 -1.74 2 -1.14 a1 1 0 0 1 1 0 l2 1.14z m-5 1.14 -1 -1.73 -3 1.71 A1 1 0 0 0 15 5 v4 h2 V6.72 l1.5 .86 1 -1.73 L18.02 5z M9 1 7.59 2.41 9.17 4 H6 a4 4 0 0 0 -4 4 v5 h2 V8 a2 2 0 0 1 2 -2 h3.17 L7.6 7.59 9 9 l4 -4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30.5 4.13
                moveTo(x = 30.5f, y = 4.13f)
                // l -3 -1.71
                lineToRelative(dx = -3.0f, dy = -1.71f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // L 27.98 5
                lineTo(x = 27.98f, y = 5.0f)
                // L 26.5 5.85
                lineTo(x = 26.5f, y = 5.85f)
                // l 1 1.73
                lineToRelative(dx = 1.0f, dy = 1.73f)
                // L 29 6.72
                lineTo(x = 29.0f, y = 6.72f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 0 -0.5 -0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -0.87f,
                )
                // m -6 -1.12
                moveToRelative(dx = -6.0f, dy = -1.12f)
                // L 23 2.15
                lineTo(x = 23.0f, y = 2.15f)
                // l -1.5 0.86
                lineToRelative(dx = -1.5f, dy = 0.86f)
                // l -1 -1.74
                lineToRelative(dx = -1.0f, dy = -1.74f)
                // l 2 -1.14
                lineToRelative(dx = 2.0f, dy = -1.14f)
                // a 1 1 0 0 1 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 2 1.14z
                lineToRelative(dx = 2.0f, dy = 1.14f)
                close()
                // m -5 1.14
                moveToRelative(dx = -5.0f, dy = 1.14f)
                // l -1 -1.73
                lineToRelative(dx = -1.0f, dy = -1.73f)
                // l -3 1.71
                lineToRelative(dx = -3.0f, dy = 1.71f)
                // A 1 1 0 0 0 15 5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 5.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6.72
                verticalLineTo(y = 6.72f)
                // l 1.5 0.86
                lineToRelative(dx = 1.5f, dy = 0.86f)
                // l 1 -1.73
                lineToRelative(dx = 1.0f, dy = -1.73f)
                // L 18.02 5z
                lineTo(x = 18.02f, y = 5.0f)
                close()
                // M 9 1
                moveTo(x = 9.0f, y = 1.0f)
                // L 7.59 2.41
                lineTo(x = 7.59f, y = 2.41f)
                // L 9.17 4
                lineTo(x = 9.17f, y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 3.17
                horizontalLineToRelative(dx = 3.17f)
                // L 7.6 7.59
                lineTo(x = 7.6f, y = 7.59f)
                // L 9 9
                lineTo(x = 9.0f, y = 9.0f)
                // l 4 -4z
                lineToRelative(dx = 4.0f, dy = -4.0f)
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
        }.build().also { _dataUnreal = it }
    }

@Suppress("ObjectPropertyName")
private var _dataUnreal: ImageVector? = null
