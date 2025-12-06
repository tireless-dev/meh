package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Promote: ImageVector
    get() {
        val current = _promote
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Promote",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 21.0 17.4 22.4 14.8 25.0 23.0 25.0 23.0 27.0 14.8 27.0 17.4 29.6 16.0 31.0 11.0 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // L 17.4 22.4
                lineTo(x = 17.4f, y = 22.4f)
                // L 14.8 25
                lineTo(x = 14.8f, y = 25.0f)
                // L 23 25
                lineTo(x = 23.0f, y = 25.0f)
                // L 23 27
                lineTo(x = 23.0f, y = 27.0f)
                // L 14.8 27
                lineTo(x = 14.8f, y = 27.0f)
                // L 17.4 29.6
                lineTo(x = 17.4f, y = 29.6f)
                // L 16 31
                lineTo(x = 16.0f, y = 31.0f)
                // L 11 26z
                lineTo(x = 11.0f, y = 26.0f)
                close()
            }
            // <rect width="11" height="2" x="6.3" y="19.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.2623844 23.323402
                moveTo(x = 7.2623844f, y = 23.323402f)
                // l 7.7781744 -7.7781744
                lineToRelative(dx = 7.7781744f, dy = -7.7781744f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -7.7781744 7.7781744z
                lineToRelative(dx = -7.7781744f, dy = 7.7781744f)
                close()
            }
            // M23 22 h-2 v-5 c0 -.3 .1 -.5 .3 -.7 l4.1 -4.1 A9 9 0 0 0 28 5.8 V4 h-1.9 a9 9 0 0 0 -6.4 2.6 l-4.1 4.1 Q15.45 11 15 11 H7.5 l-2.6 3.3 5.3 .8 -.3 2 -7 -1 c-.4 -.1 -.7 -.3 -.8 -.6 s-.1 -.7 .1 -1 l4 -5 C6.4 9.1 6.7 9 7 9 h7.6 l3.8 -3.8 c2 -2.1 4.8 -3.2 7.7 -3.2 H28 a2 2 0 0 1 2 2 v1.9 c0 2.9 -1.1 5.7 -3.2 7.8 L23 17.4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 22
                moveTo(x = 23.0f, y = 22.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // c 0 -0.3 0.1 -0.5 0.3 -0.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = 0.1f,
                    dy2 = -0.5f,
                    dx3 = 0.3f,
                    dy3 = -0.7f,
                )
                // l 4.1 -4.1
                lineToRelative(dx = 4.1f, dy = -4.1f)
                // A 9 9 0 0 0 28 5.8
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 5.8f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h -1.9
                horizontalLineToRelative(dx = -1.9f)
                // a 9 9 0 0 0 -6.4 2.6
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.4f,
                    dy1 = 2.6f,
                )
                // l -4.1 4.1
                lineToRelative(dx = -4.1f, dy = 4.1f)
                // Q 15.45 11 15 11
                quadTo(
                    x1 = 15.45f,
                    y1 = 11.0f,
                    x2 = 15.0f,
                    y2 = 11.0f,
                )
                // H 7.5
                horizontalLineTo(x = 7.5f)
                // l -2.6 3.3
                lineToRelative(dx = -2.6f, dy = 3.3f)
                // l 5.3 0.8
                lineToRelative(dx = 5.3f, dy = 0.8f)
                // l -0.3 2
                lineToRelative(dx = -0.3f, dy = 2.0f)
                // l -7 -1
                lineToRelative(dx = -7.0f, dy = -1.0f)
                // c -0.4 -0.1 -0.7 -0.3 -0.8 -0.6
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = -0.1f,
                    dx2 = -0.7f,
                    dy2 = -0.3f,
                    dx3 = -0.8f,
                    dy3 = -0.6f,
                )
                // s -0.1 -0.7 0.1 -1
                reflectiveCurveToRelative(
                    dx1 = -0.1f,
                    dy1 = -0.7f,
                    dx2 = 0.1f,
                    dy2 = -1.0f,
                )
                // l 4 -5
                lineToRelative(dx = 4.0f, dy = -5.0f)
                // C 6.4 9.1 6.7 9 7 9
                curveTo(
                    x1 = 6.4f,
                    y1 = 9.1f,
                    x2 = 6.7f,
                    y2 = 9.0f,
                    x3 = 7.0f,
                    y3 = 9.0f,
                )
                // h 7.6
                horizontalLineToRelative(dx = 7.6f)
                // l 3.8 -3.8
                lineToRelative(dx = 3.8f, dy = -3.8f)
                // c 2 -2.1 4.8 -3.2 7.7 -3.2
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.1f,
                    dx2 = 4.8f,
                    dy2 = -3.2f,
                    dx3 = 7.7f,
                    dy3 = -3.2f,
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
                // v 1.9
                verticalLineToRelative(dy = 1.9f)
                // c 0 2.9 -1.1 5.7 -3.2 7.8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.9f,
                    dx2 = -1.1f,
                    dy2 = 5.7f,
                    dx3 = -3.2f,
                    dy3 = 7.8f,
                )
                // L 23 17.4z
                lineTo(x = 23.0f, y = 17.4f)
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
        }.build().also { _promote = it }
    }

@Suppress("ObjectPropertyName")
private var _promote: ImageVector? = null
