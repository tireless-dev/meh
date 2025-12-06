package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SubtractLarge: ImageVector
    get() {
        val current = _subtractLarge
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SubtractLarge",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="5.0 15.0 5.0 17.0 27.0 17.0 27.0 15.0 5.0 15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // L 5 17
                lineTo(x = 5.0f, y = 17.0f)
                // L 27 17
                lineTo(x = 27.0f, y = 17.0f)
                // L 27 15
                lineTo(x = 27.0f, y = 15.0f)
                // L 5 15z
                lineTo(x = 5.0f, y = 15.0f)
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
        }.build().also { _subtractLarge = it }
    }

@Suppress("ObjectPropertyName")
private var _subtractLarge: ImageVector? = null
