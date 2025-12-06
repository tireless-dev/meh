package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CaretLeft: ImageVector
    get() {
        val current = _caretLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CaretLeft",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="20.0 24.0 10.0 16.0 20.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 24
                moveTo(x = 20.0f, y = 24.0f)
                // L 10 16
                lineTo(x = 10.0f, y = 16.0f)
                // L 20 8z
                lineTo(x = 20.0f, y = 8.0f)
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
        }.build().also { _caretLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _caretLeft: ImageVector? = null
