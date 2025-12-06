package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CaretSort: ImageVector
    get() {
        val current = _caretSort
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CaretSort",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="24.0 24.0 16.0 32.0 8.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 24
                moveTo(x = 24.0f, y = 24.0f)
                // L 16 32
                lineTo(x = 16.0f, y = 32.0f)
                // L 8 24z
                lineTo(x = 8.0f, y = 24.0f)
                close()
            }
            // <polygon points="8.0 8.0 16.0 0.0 24.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // L 16 0
                lineTo(x = 16.0f, y = 0.0f)
                // L 24 8z
                lineTo(x = 24.0f, y = 8.0f)
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
        }.build().also { _caretSort = it }
    }

@Suppress("ObjectPropertyName")
private var _caretSort: ImageVector? = null
