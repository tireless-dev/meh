package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drone: ImageVector
    get() {
        val current = _drone
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Drone",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M7 12 a5 5 0 1 1 5 -5 h-2 a3 3 0 1 0 -3 3Z m18 0 v-2 a3 3 0 1 0 -3 -3 h-2 a5 5 0 1 1 5 5 M7 30 a5 5 0 0 1 0 -10 v2 a3 3 0 1 0 3 3 h2 a5 5 0 0 1 -5 5 m18 0 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 v-2 a5 5 0 0 1 0 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // a 5 5 0 1 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 3 3 0 1 0 -3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                close()
                // m 18 0
                moveToRelative(dx = 18.0f, dy = 0.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 3 3 0 1 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 5 5 0 1 1 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // M 7 30
                moveTo(x = 7.0f, y = 30.0f)
                // a 5 5 0 0 1 0 -10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // m 18 0
                moveToRelative(dx = 18.0f, dy = 0.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 3 3 0 1 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 5 5 0 0 1 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
            }
            // M20 18.59 V13.4 l5.7 -5.7 a1 1 0 1 0 -1.4 -1.42 l-4.5 4.5 a3.97 3.97 0 0 0 -7.6 0 L7.7 6.3 a1 1 0 0 0 -1.4 0 1 1 0 0 0 0 1.42 l5.7 5.7 v5.18 l-5.7 5.7 a1 1 0 0 0 0 1.42 1 1 0 0 0 1.4 0 l4.5 -4.5 a3.97 3.97 0 0 0 7.6 0 l4.5 4.5 a1 1 0 0 0 1.4 -1.42Z M18 20 a2 2 0 0 1 -4 0 v-8 a2 2 0 0 1 4 0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 18.59
                moveTo(x = 20.0f, y = 18.59f)
                // V 13.4
                verticalLineTo(y = 13.4f)
                // l 5.7 -5.7
                lineToRelative(dx = 5.7f, dy = -5.7f)
                // a 1 1 0 1 0 -1.4 -1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = -1.42f,
                )
                // l -4.5 4.5
                lineToRelative(dx = -4.5f, dy = 4.5f)
                // a 3.97 3.97 0 0 0 -7.6 0
                arcToRelative(
                    a = 3.97f,
                    b = 3.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.6f,
                    dy1 = 0.0f,
                )
                // L 7.7 6.3
                lineTo(x = 7.7f, y = 6.3f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // l 5.7 5.7
                lineToRelative(dx = 5.7f, dy = 5.7f)
                // v 5.18
                verticalLineToRelative(dy = 5.18f)
                // l -5.7 5.7
                lineToRelative(dx = -5.7f, dy = 5.7f)
                // a 1 1 0 0 0 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // l 4.5 -4.5
                lineToRelative(dx = 4.5f, dy = -4.5f)
                // a 3.97 3.97 0 0 0 7.6 0
                arcToRelative(
                    a = 3.97f,
                    b = 3.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.6f,
                    dy1 = 0.0f,
                )
                // l 4.5 4.5
                lineToRelative(dx = 4.5f, dy = 4.5f)
                // a 1 1 0 0 0 1.4 -1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = -1.42f,
                )
                close()
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // a 2 2 0 0 1 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 2 2 0 0 1 4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
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
        }.build().also { _drone = it }
    }

@Suppress("ObjectPropertyName")
private var _drone: ImageVector? = null
