package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoAnsibleCommunity: ImageVector
    get() {
        val current = _logoAnsibleCommunity
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoAnsibleCommunity",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27.8 27.7 17.5 3.1 a1.71 1.71 0 0 0 -3.2 0 L3 30 h3.9 l4.5 -11.1 13.3 10.7 c.5 .4 .9 .6 1.4 .6 1 0 1.9 -.7 1.9 -1.8 0 -.2 -.1 -.4 -.2 -.7 M15.9 7.5 l6.7 16.4 L12.5 16z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.8 27.7
                moveTo(x = 27.8f, y = 27.7f)
                // L 17.5 3.1
                lineTo(x = 17.5f, y = 3.1f)
                // a 1.71 1.71 0 0 0 -3.2 0
                arcToRelative(
                    a = 1.71f,
                    b = 1.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.2f,
                    dy1 = 0.0f,
                )
                // L 3 30
                lineTo(x = 3.0f, y = 30.0f)
                // h 3.9
                horizontalLineToRelative(dx = 3.9f)
                // l 4.5 -11.1
                lineToRelative(dx = 4.5f, dy = -11.1f)
                // l 13.3 10.7
                lineToRelative(dx = 13.3f, dy = 10.7f)
                // c 0.5 0.4 0.9 0.6 1.4 0.6
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.4f,
                    dx2 = 0.9f,
                    dy2 = 0.6f,
                    dx3 = 1.4f,
                    dy3 = 0.6f,
                )
                // c 1 0 1.9 -0.7 1.9 -1.8
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 1.9f,
                    dy2 = -0.7f,
                    dx3 = 1.9f,
                    dy3 = -1.8f,
                )
                // c 0 -0.2 -0.1 -0.4 -0.2 -0.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.2f,
                    dx2 = -0.1f,
                    dy2 = -0.4f,
                    dx3 = -0.2f,
                    dy3 = -0.7f,
                )
                // M 15.9 7.5
                moveTo(x = 15.9f, y = 7.5f)
                // l 6.7 16.4
                lineToRelative(dx = 6.7f, dy = 16.4f)
                // L 12.5 16z
                lineTo(x = 12.5f, y = 16.0f)
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
        }.build().also { _logoAnsibleCommunity = it }
    }

@Suppress("ObjectPropertyName")
private var _logoAnsibleCommunity: ImageVector? = null
