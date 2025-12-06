package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SettingsAdjust: ImageVector
    get() {
        val current = _settingsAdjust
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SettingsAdjust",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 8 h-4.1 c-.5 -2.3 -2.5 -4 -4.9 -4 s-4.4 1.7 -4.9 4 H2 v2 h14.1 c.5 2.3 2.5 4 4.9 4 s4.4 -1.7 4.9 -4 H30z m-9 4 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3 M2 24 h4.1 c.5 2.3 2.5 4 4.9 4 s4.4 -1.7 4.9 -4 H30 v-2 H15.9 c-.5 -2.3 -2.5 -4 -4.9 -4 s-4.4 1.7 -4.9 4 H2z m9 -4 c1.7 0 3 1.3 3 3 s-1.3 3 -3 3 -3 -1.3 -3 -3 1.3 -3 3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 8
                moveTo(x = 30.0f, y = 8.0f)
                // h -4.1
                horizontalLineToRelative(dx = -4.1f)
                // c -0.5 -2.3 -2.5 -4 -4.9 -4
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -2.3f,
                    dx2 = -2.5f,
                    dy2 = -4.0f,
                    dx3 = -4.9f,
                    dy3 = -4.0f,
                )
                // s -4.4 1.7 -4.9 4
                reflectiveCurveToRelative(
                    dx1 = -4.4f,
                    dy1 = 1.7f,
                    dx2 = -4.9f,
                    dy2 = 4.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 14.1
                horizontalLineToRelative(dx = 14.1f)
                // c 0.5 2.3 2.5 4 4.9 4
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 2.3f,
                    dx2 = 2.5f,
                    dy2 = 4.0f,
                    dx3 = 4.9f,
                    dy3 = 4.0f,
                )
                // s 4.4 -1.7 4.9 -4
                reflectiveCurveToRelative(
                    dx1 = 4.4f,
                    dy1 = -1.7f,
                    dx2 = 4.9f,
                    dy2 = -4.0f,
                )
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
                // m -9 4
                moveToRelative(dx = -9.0f, dy = 4.0f)
                // c -1.7 0 -3 -1.3 -3 -3
                curveToRelative(
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.3f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // s 1.3 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.3f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // s 3 1.3 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.3f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s -1.3 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.3f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // M 2 24
                moveTo(x = 2.0f, y = 24.0f)
                // h 4.1
                horizontalLineToRelative(dx = 4.1f)
                // c 0.5 2.3 2.5 4 4.9 4
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 2.3f,
                    dx2 = 2.5f,
                    dy2 = 4.0f,
                    dx3 = 4.9f,
                    dy3 = 4.0f,
                )
                // s 4.4 -1.7 4.9 -4
                reflectiveCurveToRelative(
                    dx1 = 4.4f,
                    dy1 = -1.7f,
                    dx2 = 4.9f,
                    dy2 = -4.0f,
                )
                // H 30
                horizontalLineTo(x = 30.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 15.9
                horizontalLineTo(x = 15.9f)
                // c -0.5 -2.3 -2.5 -4 -4.9 -4
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -2.3f,
                    dx2 = -2.5f,
                    dy2 = -4.0f,
                    dx3 = -4.9f,
                    dy3 = -4.0f,
                )
                // s -4.4 1.7 -4.9 4
                reflectiveCurveToRelative(
                    dx1 = -4.4f,
                    dy1 = 1.7f,
                    dx2 = -4.9f,
                    dy2 = 4.0f,
                )
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
                // m 9 -4
                moveToRelative(dx = 9.0f, dy = -4.0f)
                // c 1.7 0 3 1.3 3 3
                curveToRelative(
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.3f,
                    dx3 = 3.0f,
                    dy3 = 3.0f,
                )
                // s -1.3 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.3f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // s -3 -1.3 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.3f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // s 1.3 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.3f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
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
        }.build().also { _settingsAdjust = it }
    }

@Suppress("ObjectPropertyName")
private var _settingsAdjust: ImageVector? = null
