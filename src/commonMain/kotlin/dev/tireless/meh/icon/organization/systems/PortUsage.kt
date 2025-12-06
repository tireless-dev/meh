package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PortUsage: ImageVector
    get() {
        val current = _portUsage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PortUsage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 7 h-2 V3.6 C19 2.7 18.3 2 17.4 2 H4 v2 h13 v3 h-2 c-3.3 0 -6 2.7 -6 6 v6 c0 3.3 2.7 6 6 6 h2 v3 H4 v2 h13.4 c.9 0 1.6 -.7 1.6 -1.6 V25 h2 c3.3 0 6 -2.7 6 -6 v-6 c0 -3.3 -2.7 -6 -6 -6 m4 12 c0 2.2 -1.8 4 -4 4 h-6 c-2.2 0 -4 -1.8 -4 -4 v-6 c0 -2.2 1.8 -4 4 -4 h6 c2.2 0 4 1.8 4 4z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 7
                moveTo(x = 21.0f, y = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 3.6
                verticalLineTo(y = 3.6f)
                // C 19 2.7 18.3 2 17.4 2
                curveTo(
                    x1 = 19.0f,
                    y1 = 2.7f,
                    x2 = 18.3f,
                    y2 = 2.0f,
                    x3 = 17.4f,
                    y3 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // c -3.3 0 -6 2.7 -6 6
                curveToRelative(
                    dx1 = -3.3f,
                    dy1 = 0.0f,
                    dx2 = -6.0f,
                    dy2 = 2.7f,
                    dx3 = -6.0f,
                    dy3 = 6.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 3.3 2.7 6 6 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.3f,
                    dx2 = 2.7f,
                    dy2 = 6.0f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 13.4
                horizontalLineToRelative(dx = 13.4f)
                // c 0.9 0 1.6 -0.7 1.6 -1.6
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = 0.0f,
                    dx2 = 1.6f,
                    dy2 = -0.7f,
                    dx3 = 1.6f,
                    dy3 = -1.6f,
                )
                // V 25
                verticalLineTo(y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // c 3.3 0 6 -2.7 6 -6
                curveToRelative(
                    dx1 = 3.3f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = -2.7f,
                    dx3 = 6.0f,
                    dy3 = -6.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -3.3 -2.7 -6 -6 -6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.3f,
                    dx2 = -2.7f,
                    dy2 = -6.0f,
                    dx3 = -6.0f,
                    dy3 = -6.0f,
                )
                // m 4 12
                moveToRelative(dx = 4.0f, dy = 12.0f)
                // c 0 2.2 -1.8 4 -4 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.2f,
                    dx2 = -1.8f,
                    dy2 = 4.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // c -2.2 0 -4 -1.8 -4 -4
                curveToRelative(
                    dx1 = -2.2f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = -1.8f,
                    dx3 = -4.0f,
                    dy3 = -4.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // c 0 -2.2 1.8 -4 4 -4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.2f,
                    dx2 = 1.8f,
                    dy2 = -4.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // c 2.2 0 4 1.8 4 4z
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = 1.8f,
                    dx3 = 4.0f,
                    dy3 = 4.0f,
                )
                close()
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
        }.build().also { _portUsage = it }
    }

@Suppress("ObjectPropertyName")
private var _portUsage: ImageVector? = null
