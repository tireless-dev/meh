package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentRequestHeal: ImageVector
    get() {
        val current = _intentRequestHeal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.IntentRequestHeal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 20 q-1.2 0 -2.1 .9 l-.4 .5 -.4 -.5 C23.5 20.3 22.7 20 22 20 a3.05 3.05 0 0 0 -2.1 5.2 l4.6 4.8 4.6 -4.8 c1.2 -1.2 1.2 -3.1 0 -4.3 A2.7 2.7 0 0 0 27 20
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 20
                moveTo(x = 27.0f, y = 20.0f)
                // q -1.2 0 -2.1 0.9
                quadToRelative(
                    dx1 = -1.2f,
                    dy1 = 0.0f,
                    dx2 = -2.1f,
                    dy2 = 0.9f,
                )
                // l -0.4 0.5
                lineToRelative(dx = -0.4f, dy = 0.5f)
                // l -0.4 -0.5
                lineToRelative(dx = -0.4f, dy = -0.5f)
                // C 23.5 20.3 22.7 20 22 20
                curveTo(
                    x1 = 23.5f,
                    y1 = 20.3f,
                    x2 = 22.7f,
                    y2 = 20.0f,
                    x3 = 22.0f,
                    y3 = 20.0f,
                )
                // a 3.05 3.05 0 0 0 -2.1 5.2
                arcToRelative(
                    a = 3.05f,
                    b = 3.05f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.1f,
                    dy1 = 5.2f,
                )
                // l 4.6 4.8
                lineToRelative(dx = 4.6f, dy = 4.8f)
                // l 4.6 -4.8
                lineToRelative(dx = 4.6f, dy = -4.8f)
                // c 1.2 -1.2 1.2 -3.1 0 -4.3
                curveToRelative(
                    dx1 = 1.2f,
                    dy1 = -1.2f,
                    dx2 = 1.2f,
                    dy2 = -3.1f,
                    dx3 = 0.0f,
                    dy3 = -4.3f,
                )
                // A 2.7 2.7 0 0 0 27 20
                arcTo(
                    horizontalEllipseRadius = 2.7f,
                    verticalEllipseRadius = 2.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 20.0f,
                )
            }
            // M16.6 28.6 4 16 16 4 l12.6 12.6 1.4 -1.4 L17.5 2.6 a2.05 2.05 0 0 0 -2.9 0 l-12 11.9 a2.05 2.05 0 0 0 0 2.9 L15.1 30z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.6 28.6
                moveTo(x = 16.6f, y = 28.6f)
                // L 4 16
                lineTo(x = 4.0f, y = 16.0f)
                // L 16 4
                lineTo(x = 16.0f, y = 4.0f)
                // l 12.6 12.6
                lineToRelative(dx = 12.6f, dy = 12.6f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // L 17.5 2.6
                lineTo(x = 17.5f, y = 2.6f)
                // a 2.05 2.05 0 0 0 -2.9 0
                arcToRelative(
                    a = 2.05f,
                    b = 2.05f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.9f,
                    dy1 = 0.0f,
                )
                // l -12 11.9
                lineToRelative(dx = -12.0f, dy = 11.9f)
                // a 2.05 2.05 0 0 0 0 2.9
                arcToRelative(
                    a = 2.05f,
                    b = 2.05f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.9f,
                )
                // L 15.1 30z
                lineTo(x = 15.1f, y = 30.0f)
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
        }.build().also { _intentRequestHeal = it }
    }

@Suppress("ObjectPropertyName")
private var _intentRequestHeal: ImageVector? = null
