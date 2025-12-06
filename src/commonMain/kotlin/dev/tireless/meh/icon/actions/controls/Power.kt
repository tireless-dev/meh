package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Power: ImageVector
    get() {
        val current = _power
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Power",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m22.5 5.74 -1 1.73 a11 11 0 1 1 -11 0 l-1 -1.73 a13 13 0 1 0 13 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.5 5.74
                moveTo(x = 22.5f, y = 5.74f)
                // l -1 1.73
                lineToRelative(dx = -1.0f, dy = 1.73f)
                // a 11 11 0 1 1 -11 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -11.0f,
                    dy1 = 0.0f,
                )
                // l -1 -1.73
                lineToRelative(dx = -1.0f, dy = -1.73f)
                // a 13 13 0 1 0 13 0
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 13.0f,
                    dy1 = 0.0f,
                )
            }
            // <rect width="2" height="14" x="15.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _power = it }
    }

@Suppress("ObjectPropertyName")
private var _power: ImageVector? = null
