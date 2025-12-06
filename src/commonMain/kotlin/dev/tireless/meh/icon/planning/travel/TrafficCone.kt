package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrafficCone: ImageVector
    get() {
        val current = _trafficCone
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TrafficCone",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24.8 28 18.97 2.78 A1 1 0 0 0 18 2 h-4 a1 1 0 0 0 -.97 .78 L7.2 28 H4 v2 h24 v-2Z m-4.83 -12 h-7.94 l.92 -4 h6.1Z m.47 2 .92 4 H10.64 l.92 -4Z M14.8 4 h2.4 l1.39 6 H13.4Z m-4.62 20 h11.64 l.92 4 H9.26Z
            path(
                fill = SolidColor(Color(0xFF241F20)),
            ) {
                // M 24.8 28
                moveTo(x = 24.8f, y = 28.0f)
                // L 18.97 2.78
                lineTo(x = 18.97f, y = 2.78f)
                // A 1 1 0 0 0 18 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -0.97 0.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = 0.78f,
                )
                // L 7.2 28
                lineTo(x = 7.2f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -4.83 -12
                moveToRelative(dx = -4.83f, dy = -12.0f)
                // h -7.94
                horizontalLineToRelative(dx = -7.94f)
                // l 0.92 -4
                lineToRelative(dx = 0.92f, dy = -4.0f)
                // h 6.1z
                horizontalLineToRelative(dx = 6.1f)
                close()
                // m 0.47 2
                moveToRelative(dx = 0.47f, dy = 2.0f)
                // l 0.92 4
                lineToRelative(dx = 0.92f, dy = 4.0f)
                // H 10.64
                horizontalLineTo(x = 10.64f)
                // l 0.92 -4z
                lineToRelative(dx = 0.92f, dy = -4.0f)
                close()
                // M 14.8 4
                moveTo(x = 14.8f, y = 4.0f)
                // h 2.4
                horizontalLineToRelative(dx = 2.4f)
                // l 1.39 6
                lineToRelative(dx = 1.39f, dy = 6.0f)
                // H 13.4z
                horizontalLineTo(x = 13.4f)
                close()
                // m -4.62 20
                moveToRelative(dx = -4.62f, dy = 20.0f)
                // h 11.64
                horizontalLineToRelative(dx = 11.64f)
                // l 0.92 4
                lineToRelative(dx = 0.92f, dy = 4.0f)
                // H 9.26z
                horizontalLineTo(x = 9.26f)
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
        }.build().also { _trafficCone = it }
    }

@Suppress("ObjectPropertyName")
private var _trafficCone: ImageVector? = null
