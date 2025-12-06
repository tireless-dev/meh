package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddAlt: ImageVector
    get() {
        val current = _addAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AddAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 4 c6.6 0 12 5.4 12 12 s-5.4 12 -12 12 S4 22.6 4 16 9.4 4 16 4 m0 -2 C8.3 2 2 8.3 2 16 s6.3 14 14 14 14 -6.3 14 -14 S23.7 2 16 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // c 6.6 0 12 5.4 12 12
                curveToRelative(
                    dx1 = 6.6f,
                    dy1 = 0.0f,
                    dx2 = 12.0f,
                    dy2 = 5.4f,
                    dx3 = 12.0f,
                    dy3 = 12.0f,
                )
                // s -5.4 12 -12 12
                reflectiveCurveToRelative(
                    dx1 = -5.4f,
                    dy1 = 12.0f,
                    dx2 = -12.0f,
                    dy2 = 12.0f,
                )
                // S 4 22.6 4 16
                reflectiveCurveTo(
                    x1 = 4.0f,
                    y1 = 22.6f,
                    x2 = 4.0f,
                    y2 = 16.0f,
                )
                // S 9.4 4 16 4
                reflectiveCurveTo(
                    x1 = 9.4f,
                    y1 = 4.0f,
                    x2 = 16.0f,
                    y2 = 4.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // C 8.3 2 2 8.3 2 16
                curveTo(
                    x1 = 8.3f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 8.3f,
                    x3 = 2.0f,
                    y3 = 16.0f,
                )
                // s 6.3 14 14 14
                reflectiveCurveToRelative(
                    dx1 = 6.3f,
                    dy1 = 14.0f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // s 14 -6.3 14 -14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = -6.3f,
                    dx2 = 14.0f,
                    dy2 = -14.0f,
                )
                // S 23.7 2 16 2
                reflectiveCurveTo(
                    x1 = 23.7f,
                    y1 = 2.0f,
                    x2 = 16.0f,
                    y2 = 2.0f,
                )
            }
            // <polygon points="24.0 15.0 17.0 15.0 17.0 8.0 15.0 8.0 15.0 15.0 8.0 15.0 8.0 17.0 15.0 17.0 15.0 24.0 17.0 24.0 17.0 17.0 24.0 17.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 15
                moveTo(x = 24.0f, y = 15.0f)
                // L 17 15
                lineTo(x = 17.0f, y = 15.0f)
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
                // L 8 15
                lineTo(x = 8.0f, y = 15.0f)
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // L 15 17
                lineTo(x = 15.0f, y = 17.0f)
                // L 15 24
                lineTo(x = 15.0f, y = 24.0f)
                // L 17 24
                lineTo(x = 17.0f, y = 24.0f)
                // L 17 17
                lineTo(x = 17.0f, y = 17.0f)
                // L 24 17z
                lineTo(x = 24.0f, y = 17.0f)
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
        }.build().also { _addAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _addAlt: ImageVector? = null
