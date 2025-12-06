package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoInvision: ImageVector
    get() {
        val current = _logoInvision
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoInvision",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 4 v24 h24 V4z m8.1 5 c.8 0 1.4 .6 1.4 1.4 s-.6 1.4 -1.4 1.4 -1.4 -.6 -1.4 -1.4 C10.8 9.6 11.4 9 12.1 9 m9.4 13.2 c-1.4 0 -2.1 -.8 -2.1 -2 0 -.3 0 -.7 .1 -1 l.7 -2.4 c.1 -.2 .1 -.5 .1 -.7 0 -.8 -.5 -1.3 -1.2 -1.3 -1 0 -1.6 .7 -1.9 2 L15.9 22 h-2.3 l.4 -1.7 c-.7 1.1 -1.6 1.8 -2.8 1.8 -1.4 0 -2.1 -.8 -2.1 -2 0 -.3 0 -.7 .1 -1 l1.1 -4.3 H8.7 L9.2 13 h3.9 l-1.5 6.1 c-.1 .3 -.1 .6 -.1 .9 0 .4 .2 .5 .5 .6 .2 0 1.6 0 2.4 -1.8 l1 -4.1 h-1.6 l.5 -1.8 h3.5 L17.3 15 c.6 -1.2 1.9 -2.2 3.1 -2.2 1.3 0 2.4 .9 2.4 2.7 0 .5 -.1 1 -.2 1.5 l-.7 2.4 c-.1 .2 -.1 .4 -.1 .6 0 .4 .2 .6 .5 .6 s.7 -.2 1.2 -1.5 l.9 .4 c-.7 1.9 -1.7 2.7 -2.9 2.7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // m 8.1 5
                moveToRelative(dx = 8.1f, dy = 5.0f)
                // c 0.8 0 1.4 0.6 1.4 1.4
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                    dx2 = 1.4f,
                    dy2 = 0.6f,
                    dx3 = 1.4f,
                    dy3 = 1.4f,
                )
                // s -0.6 1.4 -1.4 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.6f,
                    dy1 = 1.4f,
                    dx2 = -1.4f,
                    dy2 = 1.4f,
                )
                // s -1.4 -0.6 -1.4 -1.4
                reflectiveCurveToRelative(
                    dx1 = -1.4f,
                    dy1 = -0.6f,
                    dx2 = -1.4f,
                    dy2 = -1.4f,
                )
                // C 10.8 9.6 11.4 9 12.1 9
                curveTo(
                    x1 = 10.8f,
                    y1 = 9.6f,
                    x2 = 11.4f,
                    y2 = 9.0f,
                    x3 = 12.1f,
                    y3 = 9.0f,
                )
                // m 9.4 13.2
                moveToRelative(dx = 9.4f, dy = 13.2f)
                // c -1.4 0 -2.1 -0.8 -2.1 -2
                curveToRelative(
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                    dx2 = -2.1f,
                    dy2 = -0.8f,
                    dx3 = -2.1f,
                    dy3 = -2.0f,
                )
                // c 0 -0.3 0 -0.7 0.1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = 0.0f,
                    dy2 = -0.7f,
                    dx3 = 0.1f,
                    dy3 = -1.0f,
                )
                // l 0.7 -2.4
                lineToRelative(dx = 0.7f, dy = -2.4f)
                // c 0.1 -0.2 0.1 -0.5 0.1 -0.7
                curveToRelative(
                    dx1 = 0.1f,
                    dy1 = -0.2f,
                    dx2 = 0.1f,
                    dy2 = -0.5f,
                    dx3 = 0.1f,
                    dy3 = -0.7f,
                )
                // c 0 -0.8 -0.5 -1.3 -1.2 -1.3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.8f,
                    dx2 = -0.5f,
                    dy2 = -1.3f,
                    dx3 = -1.2f,
                    dy3 = -1.3f,
                )
                // c -1 0 -1.6 0.7 -1.9 2
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                    dx2 = -1.6f,
                    dy2 = 0.7f,
                    dx3 = -1.9f,
                    dy3 = 2.0f,
                )
                // L 15.9 22
                lineTo(x = 15.9f, y = 22.0f)
                // h -2.3
                horizontalLineToRelative(dx = -2.3f)
                // l 0.4 -1.7
                lineToRelative(dx = 0.4f, dy = -1.7f)
                // c -0.7 1.1 -1.6 1.8 -2.8 1.8
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 1.1f,
                    dx2 = -1.6f,
                    dy2 = 1.8f,
                    dx3 = -2.8f,
                    dy3 = 1.8f,
                )
                // c -1.4 0 -2.1 -0.8 -2.1 -2
                curveToRelative(
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                    dx2 = -2.1f,
                    dy2 = -0.8f,
                    dx3 = -2.1f,
                    dy3 = -2.0f,
                )
                // c 0 -0.3 0 -0.7 0.1 -1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.3f,
                    dx2 = 0.0f,
                    dy2 = -0.7f,
                    dx3 = 0.1f,
                    dy3 = -1.0f,
                )
                // l 1.1 -4.3
                lineToRelative(dx = 1.1f, dy = -4.3f)
                // H 8.7
                horizontalLineTo(x = 8.7f)
                // L 9.2 13
                lineTo(x = 9.2f, y = 13.0f)
                // h 3.9
                horizontalLineToRelative(dx = 3.9f)
                // l -1.5 6.1
                lineToRelative(dx = -1.5f, dy = 6.1f)
                // c -0.1 0.3 -0.1 0.6 -0.1 0.9
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.3f,
                    dx2 = -0.1f,
                    dy2 = 0.6f,
                    dx3 = -0.1f,
                    dy3 = 0.9f,
                )
                // c 0 0.4 0.2 0.5 0.5 0.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.4f,
                    dx2 = 0.2f,
                    dy2 = 0.5f,
                    dx3 = 0.5f,
                    dy3 = 0.6f,
                )
                // c 0.2 0 1.6 0 2.4 -1.8
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.0f,
                    dx2 = 1.6f,
                    dy2 = 0.0f,
                    dx3 = 2.4f,
                    dy3 = -1.8f,
                )
                // l 1 -4.1
                lineToRelative(dx = 1.0f, dy = -4.1f)
                // h -1.6
                horizontalLineToRelative(dx = -1.6f)
                // l 0.5 -1.8
                lineToRelative(dx = 0.5f, dy = -1.8f)
                // h 3.5
                horizontalLineToRelative(dx = 3.5f)
                // L 17.3 15
                lineTo(x = 17.3f, y = 15.0f)
                // c 0.6 -1.2 1.9 -2.2 3.1 -2.2
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = -1.2f,
                    dx2 = 1.9f,
                    dy2 = -2.2f,
                    dx3 = 3.1f,
                    dy3 = -2.2f,
                )
                // c 1.3 0 2.4 0.9 2.4 2.7
                curveToRelative(
                    dx1 = 1.3f,
                    dy1 = 0.0f,
                    dx2 = 2.4f,
                    dy2 = 0.9f,
                    dx3 = 2.4f,
                    dy3 = 2.7f,
                )
                // c 0 0.5 -0.1 1 -0.2 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.1f,
                    dy2 = 1.0f,
                    dx3 = -0.2f,
                    dy3 = 1.5f,
                )
                // l -0.7 2.4
                lineToRelative(dx = -0.7f, dy = 2.4f)
                // c -0.1 0.2 -0.1 0.4 -0.1 0.6
                curveToRelative(
                    dx1 = -0.1f,
                    dy1 = 0.2f,
                    dx2 = -0.1f,
                    dy2 = 0.4f,
                    dx3 = -0.1f,
                    dy3 = 0.6f,
                )
                // c 0 0.4 0.2 0.6 0.5 0.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.4f,
                    dx2 = 0.2f,
                    dy2 = 0.6f,
                    dx3 = 0.5f,
                    dy3 = 0.6f,
                )
                // s 0.7 -0.2 1.2 -1.5
                reflectiveCurveToRelative(
                    dx1 = 0.7f,
                    dy1 = -0.2f,
                    dx2 = 1.2f,
                    dy2 = -1.5f,
                )
                // l 0.9 0.4
                lineToRelative(dx = 0.9f, dy = 0.4f)
                // c -0.7 1.9 -1.7 2.7 -2.9 2.7
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 1.9f,
                    dx2 = -1.7f,
                    dy2 = 2.7f,
                    dx3 = -2.9f,
                    dy3 = 2.7f,
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
        }.build().also { _logoInvision = it }
    }

@Suppress("ObjectPropertyName")
private var _logoInvision: ImageVector? = null
