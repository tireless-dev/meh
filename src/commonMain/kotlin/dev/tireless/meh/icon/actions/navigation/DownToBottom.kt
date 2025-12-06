package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DownToBottom: ImageVector
    get() {
        val current = _downToBottom
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DownToBottom",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 18.0 6.0 8.0 7.4 6.6 16.0 15.2 24.6 6.6 26.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // L 6 8
                lineTo(x = 6.0f, y = 8.0f)
                // L 7.4 6.6
                lineTo(x = 7.4f, y = 6.6f)
                // L 16 15.2
                lineTo(x = 16.0f, y = 15.2f)
                // L 24.6 6.6
                lineTo(x = 24.6f, y = 6.6f)
                // L 26 8z
                lineTo(x = 26.0f, y = 8.0f)
                close()
            }
            // <rect width="24" height="2" x="4.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -24z
                horizontalLineToRelative(dx = -24.0f)
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
        }.build().also { _downToBottom = it }
    }

@Suppress("ObjectPropertyName")
private var _downToBottom: ImageVector? = null
