package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddLarge: ImageVector
    get() {
        val current = _addLarge
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AddLarge",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="17.0 15.0 17.0 5.0 15.0 5.0 15.0 15.0 5.0 15.0 5.0 17.0 15.0 17.0 15.0 27.0 17.0 27.0 17.0 17.0 27.0 17.0 27.0 15.0 17.0 15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 15
                moveTo(x = 17.0f, y = 15.0f)
                // L 17 5
                lineTo(x = 17.0f, y = 5.0f)
                // L 15 5
                lineTo(x = 15.0f, y = 5.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // L 5 17
                lineTo(x = 5.0f, y = 17.0f)
                // L 15 17
                lineTo(x = 15.0f, y = 17.0f)
                // L 15 27
                lineTo(x = 15.0f, y = 27.0f)
                // L 17 27
                lineTo(x = 17.0f, y = 27.0f)
                // L 17 17
                lineTo(x = 17.0f, y = 17.0f)
                // L 27 17
                lineTo(x = 27.0f, y = 17.0f)
                // L 27 15
                lineTo(x = 27.0f, y = 15.0f)
                // L 17 15z
                lineTo(x = 17.0f, y = 15.0f)
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
        }.build().also { _addLarge = it }
    }

@Suppress("ObjectPropertyName")
private var _addLarge: ImageVector? = null
