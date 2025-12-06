package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SubtractFilled: ImageVector
    get() {
        val current = _subtractFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SubtractFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 C8.4 2 2 8.4 2 16 s6.4 14 14 14 14 -6.4 14 -14 S23.6 2 16 2 m8 15 H8 v-2 h16z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // C 8.4 2 2 8.4 2 16
                curveTo(
                    x1 = 8.4f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 8.4f,
                    x3 = 2.0f,
                    y3 = 16.0f,
                )
                // s 6.4 14 14 14
                reflectiveCurveToRelative(
                    dx1 = 6.4f,
                    dy1 = 14.0f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // s 14 -6.4 14 -14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = -6.4f,
                    dx2 = 14.0f,
                    dy2 = -14.0f,
                )
                // S 23.6 2 16 2
                reflectiveCurveTo(
                    x1 = 23.6f,
                    y1 = 2.0f,
                    x2 = 16.0f,
                    y2 = 2.0f,
                )
                // m 8 15
                moveToRelative(dx = 8.0f, dy = 15.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
            }
            // <polygon points="24.0 17.0 8.0 17.0 8.0 15.0 24.0 15.0 24.0 17.0" fill="#000" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 24 17
                moveTo(x = 24.0f, y = 17.0f)
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // L 8 15
                lineTo(x = 8.0f, y = 15.0f)
                // L 24 15
                lineTo(x = 24.0f, y = 15.0f)
                // L 24 17z
                lineTo(x = 24.0f, y = 17.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _subtractFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _subtractFilled: ImageVector? = null
