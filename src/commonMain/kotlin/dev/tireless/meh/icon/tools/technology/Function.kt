package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Function: ImageVector
    get() {
        val current = _function
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Function",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m19.63 29.53 -.52 -1.94 a12 12 0 0 0 6.12 -19.26 l1.54 -1.28 a14 14 0 0 1 -7.14 22.48
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.63 29.53
                moveTo(x = 19.63f, y = 29.53f)
                // l -0.52 -1.94
                lineToRelative(dx = -0.52f, dy = -1.94f)
                // a 12 12 0 0 0 6.12 -19.26
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.12f,
                    dy1 = -19.26f,
                )
                // l 1.54 -1.28
                lineToRelative(dx = 1.54f, dy = -1.28f)
                // a 14 14 0 0 1 -7.14 22.48
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.14f,
                    dy1 = 22.48f,
                )
            }
            // M10 29 H8 v-3.82 l.8 -.16 c1.46 -.3 3.2 -1.4 3.2 -5.02 v-1.38 l-4 -2 v-2.24 l4 -2 V12 c0 -5.47 3.93 -9 10 -9 h2 v3.82 l-.8 .16 C21.74 7.28 20 8.38 20 12 v.38 l4 2 v2.24 l-4 2 V20 c0 5.47 -3.93 9 -10 9 m0 -2 c4.93 0 8 -2.68 8 -7 v-2.62 l3.76 -1.88 L18 13.62 V12 c0 -4.58 2.39 -6.2 4 -6.76 V5 c-4.93 0 -8 2.68 -8 7 v1.62 l-3.76 1.88 L14 17.38 V20 c0 4.58 -2.39 6.2 -4 6.76Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 29
                moveTo(x = 10.0f, y = 29.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -3.82
                verticalLineToRelative(dy = -3.82f)
                // l 0.8 -0.16
                lineToRelative(dx = 0.8f, dy = -0.16f)
                // c 1.46 -0.3 3.2 -1.4 3.2 -5.02
                curveToRelative(
                    dx1 = 1.46f,
                    dy1 = -0.3f,
                    dx2 = 3.2f,
                    dy2 = -1.4f,
                    dx3 = 3.2f,
                    dy3 = -5.02f,
                )
                // v -1.38
                verticalLineToRelative(dy = -1.38f)
                // l -4 -2
                lineToRelative(dx = -4.0f, dy = -2.0f)
                // v -2.24
                verticalLineToRelative(dy = -2.24f)
                // l 4 -2
                lineToRelative(dx = 4.0f, dy = -2.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -5.47 3.93 -9 10 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -5.47f,
                    dx2 = 3.93f,
                    dy2 = -9.0f,
                    dx3 = 10.0f,
                    dy3 = -9.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3.82
                verticalLineToRelative(dy = 3.82f)
                // l -0.8 0.16
                lineToRelative(dx = -0.8f, dy = 0.16f)
                // C 21.74 7.28 20 8.38 20 12
                curveTo(
                    x1 = 21.74f,
                    y1 = 7.28f,
                    x2 = 20.0f,
                    y2 = 8.38f,
                    x3 = 20.0f,
                    y3 = 12.0f,
                )
                // v 0.38
                verticalLineToRelative(dy = 0.38f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
                // v 2.24
                verticalLineToRelative(dy = 2.24f)
                // l -4 2
                lineToRelative(dx = -4.0f, dy = 2.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // c 0 5.47 -3.93 9 -10 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 5.47f,
                    dx2 = -3.93f,
                    dy2 = 9.0f,
                    dx3 = -10.0f,
                    dy3 = 9.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // c 4.93 0 8 -2.68 8 -7
                curveToRelative(
                    dx1 = 4.93f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -2.68f,
                    dx3 = 8.0f,
                    dy3 = -7.0f,
                )
                // v -2.62
                verticalLineToRelative(dy = -2.62f)
                // l 3.76 -1.88
                lineToRelative(dx = 3.76f, dy = -1.88f)
                // L 18 13.62
                lineTo(x = 18.0f, y = 13.62f)
                // V 12
                verticalLineTo(y = 12.0f)
                // c 0 -4.58 2.39 -6.2 4 -6.76
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.58f,
                    dx2 = 2.39f,
                    dy2 = -6.2f,
                    dx3 = 4.0f,
                    dy3 = -6.76f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // c -4.93 0 -8 2.68 -8 7
                curveToRelative(
                    dx1 = -4.93f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 2.68f,
                    dx3 = -8.0f,
                    dy3 = 7.0f,
                )
                // v 1.62
                verticalLineToRelative(dy = 1.62f)
                // l -3.76 1.88
                lineToRelative(dx = -3.76f, dy = 1.88f)
                // L 14 17.38
                lineTo(x = 14.0f, y = 17.38f)
                // V 20
                verticalLineTo(y = 20.0f)
                // c 0 4.58 -2.39 6.2 -4 6.76z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.58f,
                    dx2 = -2.39f,
                    dy2 = 6.2f,
                    dx3 = -4.0f,
                    dy3 = 6.76f,
                )
                close()
            }
            // M5.23 24.95 a14 14 0 0 1 7.15 -22.48 l.51 1.94 a12 12 0 0 0 -6.12 19.26Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.23 24.95
                moveTo(x = 5.23f, y = 24.95f)
                // a 14 14 0 0 1 7.15 -22.48
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.15f,
                    dy1 = -22.48f,
                )
                // l 0.51 1.94
                lineToRelative(dx = 0.51f, dy = 1.94f)
                // a 12 12 0 0 0 -6.12 19.26z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.12f,
                    dy1 = 19.26f,
                )
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
        }.build().also { _function = it }
    }

@Suppress("ObjectPropertyName")
private var _function: ImageVector? = null
