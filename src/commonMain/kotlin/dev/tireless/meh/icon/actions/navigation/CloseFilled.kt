package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloseFilled: ImageVector
    get() {
        val current = _closeFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CloseFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 C8.2 2 2 8.2 2 16 s6.2 14 14 14 14 -6.2 14 -14 S23.8 2 16 2 m5.4 21 L16 17.6 10.6 23 9 21.4 l5.4 -5.4 L9 10.6 10.6 9 l5.4 5.4 L21.4 9 l1.6 1.6 -5.4 5.4 5.4 5.4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // C 8.2 2 2 8.2 2 16
                curveTo(
                    x1 = 8.2f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 8.2f,
                    x3 = 2.0f,
                    y3 = 16.0f,
                )
                // s 6.2 14 14 14
                reflectiveCurveToRelative(
                    dx1 = 6.2f,
                    dy1 = 14.0f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // s 14 -6.2 14 -14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = -6.2f,
                    dx2 = 14.0f,
                    dy2 = -14.0f,
                )
                // S 23.8 2 16 2
                reflectiveCurveTo(
                    x1 = 23.8f,
                    y1 = 2.0f,
                    x2 = 16.0f,
                    y2 = 2.0f,
                )
                // m 5.4 21
                moveToRelative(dx = 5.4f, dy = 21.0f)
                // L 16 17.6
                lineTo(x = 16.0f, y = 17.6f)
                // L 10.6 23
                lineTo(x = 10.6f, y = 23.0f)
                // L 9 21.4
                lineTo(x = 9.0f, y = 21.4f)
                // l 5.4 -5.4
                lineToRelative(dx = 5.4f, dy = -5.4f)
                // L 9 10.6
                lineTo(x = 9.0f, y = 10.6f)
                // L 10.6 9
                lineTo(x = 10.6f, y = 9.0f)
                // l 5.4 5.4
                lineToRelative(dx = 5.4f, dy = 5.4f)
                // L 21.4 9
                lineTo(x = 21.4f, y = 9.0f)
                // l 1.6 1.6
                lineToRelative(dx = 1.6f, dy = 1.6f)
                // l -5.4 5.4
                lineToRelative(dx = -5.4f, dy = 5.4f)
                // l 5.4 5.4z
                lineToRelative(dx = 5.4f, dy = 5.4f)
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
        }.build().also { _closeFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _closeFilled: ImageVector? = null
