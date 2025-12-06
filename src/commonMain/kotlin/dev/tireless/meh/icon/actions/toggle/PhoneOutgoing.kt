package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneOutgoing: ImageVector
    get() {
        val current = _phoneOutgoing
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PhoneOutgoing",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 29 h-.2 C6.2 27.9 3.4 11.3 3 6.2 A3 3 0 0 1 5.8 3 h5.5 c.8 0 1.6 .5 1.9 1.3 L14.6 8 c.3 .7 .1 1.6 -.4 2.2 l-2.1 2.1 c.7 3.9 3.7 6.9 7.6 7.6 l2.2 -2.1 c.6 -.6 1.4 -.7 2.2 -.4 l3.8 1.5 c.7 .3 1.2 1 1.2 1.9 V26 a3.1 3.1 0 0 1 -3.1 3 M6 5 C5.4 5 5 5.4 5 6 v.1 C5.5 12 8.4 26 25.9 27 c.6 0 1 -.4 1.1 -.9 v-5.4 l-3.8 -1.5 -2.9 2.9 -.4 -.1 c-8.7 -1.1 -9.9 -9.8 -9.9 -9.9 l-.1 -.5 2.8 -2.9 L11.3 5z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 29
                moveTo(x = 26.0f, y = 29.0f)
                // h -0.2
                horizontalLineToRelative(dx = -0.2f)
                // C 6.2 27.9 3.4 11.3 3 6.2
                curveTo(
                    x1 = 6.2f,
                    y1 = 27.9f,
                    x2 = 3.4f,
                    y2 = 11.3f,
                    x3 = 3.0f,
                    y3 = 6.2f,
                )
                // A 3 3 0 0 1 5.8 3
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.8f,
                    y1 = 3.0f,
                )
                // h 5.5
                horizontalLineToRelative(dx = 5.5f)
                // c 0.8 0 1.6 0.5 1.9 1.3
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                    dx2 = 1.6f,
                    dy2 = 0.5f,
                    dx3 = 1.9f,
                    dy3 = 1.3f,
                )
                // L 14.6 8
                lineTo(x = 14.6f, y = 8.0f)
                // c 0.3 0.7 0.1 1.6 -0.4 2.2
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.7f,
                    dx2 = 0.1f,
                    dy2 = 1.6f,
                    dx3 = -0.4f,
                    dy3 = 2.2f,
                )
                // l -2.1 2.1
                lineToRelative(dx = -2.1f, dy = 2.1f)
                // c 0.7 3.9 3.7 6.9 7.6 7.6
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 3.9f,
                    dx2 = 3.7f,
                    dy2 = 6.9f,
                    dx3 = 7.6f,
                    dy3 = 7.6f,
                )
                // l 2.2 -2.1
                lineToRelative(dx = 2.2f, dy = -2.1f)
                // c 0.6 -0.6 1.4 -0.7 2.2 -0.4
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = -0.6f,
                    dx2 = 1.4f,
                    dy2 = -0.7f,
                    dx3 = 2.2f,
                    dy3 = -0.4f,
                )
                // l 3.8 1.5
                lineToRelative(dx = 3.8f, dy = 1.5f)
                // c 0.7 0.3 1.2 1 1.2 1.9
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = 0.3f,
                    dx2 = 1.2f,
                    dy2 = 1.0f,
                    dx3 = 1.2f,
                    dy3 = 1.9f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // a 3.1 3.1 0 0 1 -3.1 3
                arcToRelative(
                    a = 3.1f,
                    b = 3.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.1f,
                    dy1 = 3.0f,
                )
                // M 6 5
                moveTo(x = 6.0f, y = 5.0f)
                // C 5.4 5 5 5.4 5 6
                curveTo(
                    x1 = 5.4f,
                    y1 = 5.0f,
                    x2 = 5.0f,
                    y2 = 5.4f,
                    x3 = 5.0f,
                    y3 = 6.0f,
                )
                // v 0.1
                verticalLineToRelative(dy = 0.1f)
                // C 5.5 12 8.4 26 25.9 27
                curveTo(
                    x1 = 5.5f,
                    y1 = 12.0f,
                    x2 = 8.4f,
                    y2 = 26.0f,
                    x3 = 25.9f,
                    y3 = 27.0f,
                )
                // c 0.6 0 1 -0.4 1.1 -0.9
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.1f,
                    dy3 = -0.9f,
                )
                // v -5.4
                verticalLineToRelative(dy = -5.4f)
                // l -3.8 -1.5
                lineToRelative(dx = -3.8f, dy = -1.5f)
                // l -2.9 2.9
                lineToRelative(dx = -2.9f, dy = 2.9f)
                // l -0.4 -0.1
                lineToRelative(dx = -0.4f, dy = -0.1f)
                // c -8.7 -1.1 -9.9 -9.8 -9.9 -9.9
                curveToRelative(
                    dx1 = -8.7f,
                    dy1 = -1.1f,
                    dx2 = -9.9f,
                    dy2 = -9.8f,
                    dx3 = -9.9f,
                    dy3 = -9.9f,
                )
                // l -0.1 -0.5
                lineToRelative(dx = -0.1f, dy = -0.5f)
                // l 2.8 -2.9
                lineToRelative(dx = 2.8f, dy = -2.9f)
                // L 11.3 5z
                lineTo(x = 11.3f, y = 5.0f)
                close()
            }
            // <polygon points="20.0 4.0 20.0 6.0 24.6 6.0 18.0 12.6 19.4 14.0 26.0 7.4 26.0 12.0 28.0 12.0 28.0 4.0" fill="#000" style="fill:#231f20" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 4
                moveTo(x = 20.0f, y = 4.0f)
                // L 20 6
                lineTo(x = 20.0f, y = 6.0f)
                // L 24.6 6
                lineTo(x = 24.6f, y = 6.0f)
                // L 18 12.6
                lineTo(x = 18.0f, y = 12.6f)
                // L 19.4 14
                lineTo(x = 19.4f, y = 14.0f)
                // L 26 7.4
                lineTo(x = 26.0f, y = 7.4f)
                // L 26 12
                lineTo(x = 26.0f, y = 12.0f)
                // L 28 12
                lineTo(x = 28.0f, y = 12.0f)
                // L 28 4z
                lineTo(x = 28.0f, y = 4.0f)
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
        }.build().also { _phoneOutgoing = it }
    }

@Suppress("ObjectPropertyName")
private var _phoneOutgoing: ImageVector? = null
