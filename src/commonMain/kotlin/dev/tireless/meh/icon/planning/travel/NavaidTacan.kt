package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidTacan: ImageVector
    get() {
        val current = _navaidTacan
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NavaidTacan",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="16.0" cy="14.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M20 28 h-8 a1 1 0 0 1 -1 -1 v-5.73 l-3.74 -6.55 -4.77 -2.86 a1 1 0 0 1 -.36 -1.36 l4 -7 a1 1 0 0 1 1.38 -.36 L12.28 6 h7.44 l4.77 -2.86 a1 1 0 0 1 1.38 .36 l4 7 a1 1 0 0 1 -.36 1.36 l-4.77 2.86 L21 21.27 V27 a1 1 0 0 1 -1 1 m-7 -2 h6 v-5.27 l4.26 -7.45 4.39 -2.63 -3.01 -5.27 L20.28 8 h-8.56 L7.36 5.38 l-3 5.27 4.38 2.63 L13 20.73Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 28
                moveTo(x = 20.0f, y = 28.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -5.73
                verticalLineToRelative(dy = -5.73f)
                // l -3.74 -6.55
                lineToRelative(dx = -3.74f, dy = -6.55f)
                // l -4.77 -2.86
                lineToRelative(dx = -4.77f, dy = -2.86f)
                // a 1 1 0 0 1 -0.36 -1.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.36f,
                    dy1 = -1.36f,
                )
                // l 4 -7
                lineToRelative(dx = 4.0f, dy = -7.0f)
                // a 1 1 0 0 1 1.38 -0.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.38f,
                    dy1 = -0.36f,
                )
                // L 12.28 6
                lineTo(x = 12.28f, y = 6.0f)
                // h 7.44
                horizontalLineToRelative(dx = 7.44f)
                // l 4.77 -2.86
                lineToRelative(dx = 4.77f, dy = -2.86f)
                // a 1 1 0 0 1 1.38 0.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.38f,
                    dy1 = 0.36f,
                )
                // l 4 7
                lineToRelative(dx = 4.0f, dy = 7.0f)
                // a 1 1 0 0 1 -0.36 1.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.36f,
                    dy1 = 1.36f,
                )
                // l -4.77 2.86
                lineToRelative(dx = -4.77f, dy = 2.86f)
                // L 21 21.27
                lineTo(x = 21.0f, y = 21.27f)
                // V 27
                verticalLineTo(y = 27.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // m -7 -2
                moveToRelative(dx = -7.0f, dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -5.27
                verticalLineToRelative(dy = -5.27f)
                // l 4.26 -7.45
                lineToRelative(dx = 4.26f, dy = -7.45f)
                // l 4.39 -2.63
                lineToRelative(dx = 4.39f, dy = -2.63f)
                // l -3.01 -5.27
                lineToRelative(dx = -3.01f, dy = -5.27f)
                // L 20.28 8
                lineTo(x = 20.28f, y = 8.0f)
                // h -8.56
                horizontalLineToRelative(dx = -8.56f)
                // L 7.36 5.38
                lineTo(x = 7.36f, y = 5.38f)
                // l -3 5.27
                lineToRelative(dx = -3.0f, dy = 5.27f)
                // l 4.38 2.63
                lineToRelative(dx = 4.38f, dy = 2.63f)
                // L 13 20.73z
                lineTo(x = 13.0f, y = 20.73f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _navaidTacan = it }
    }

@Suppress("ObjectPropertyName")
private var _navaidTacan: ImageVector? = null
