package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindPower: ImageVector
    get() {
        val current = _windPower
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WindPower",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 28 V15.82 a3 3 0 0 0 1.47 -1.12 l8.6 2.3 .51 -1.93 -8.6 -2.3 a3 3 0 0 0 -2.63 -2.73 L14.19 2 l-1.93 .52 2.13 7.95 a2.96 2.96 0 0 0 -1.09 3.82 L7 20.59 8.41 22 l6.3 -6.3 .29 .12 V28 H2 v2 h28 v-2Z m0 -15 a1 1 0 1 1 -1 -1 1 1 0 0 1 1 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 28
                moveTo(x = 17.0f, y = 28.0f)
                // V 15.82
                verticalLineTo(y = 15.82f)
                // a 3 3 0 0 0 1.47 -1.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.47f,
                    dy1 = -1.12f,
                )
                // l 8.6 2.3
                lineToRelative(dx = 8.6f, dy = 2.3f)
                // l 0.51 -1.93
                lineToRelative(dx = 0.51f, dy = -1.93f)
                // l -8.6 -2.3
                lineToRelative(dx = -8.6f, dy = -2.3f)
                // a 3 3 0 0 0 -2.63 -2.73
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.63f,
                    dy1 = -2.73f,
                )
                // L 14.19 2
                lineTo(x = 14.19f, y = 2.0f)
                // l -1.93 0.52
                lineToRelative(dx = -1.93f, dy = 0.52f)
                // l 2.13 7.95
                lineToRelative(dx = 2.13f, dy = 7.95f)
                // a 2.96 2.96 0 0 0 -1.09 3.82
                arcToRelative(
                    a = 2.96f,
                    b = 2.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.09f,
                    dy1 = 3.82f,
                )
                // L 7 20.59
                lineTo(x = 7.0f, y = 20.59f)
                // L 8.41 22
                lineTo(x = 8.41f, y = 22.0f)
                // l 6.3 -6.3
                lineToRelative(dx = 6.3f, dy = -6.3f)
                // l 0.29 0.12
                lineToRelative(dx = 0.29f, dy = 0.12f)
                // V 28
                verticalLineTo(y = 28.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 0 -15
                moveToRelative(dx = 0.0f, dy = -15.0f)
                // a 1 1 0 1 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
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
        }.build().also { _windPower = it }
    }

@Suppress("ObjectPropertyName")
private var _windPower: ImageVector? = null
