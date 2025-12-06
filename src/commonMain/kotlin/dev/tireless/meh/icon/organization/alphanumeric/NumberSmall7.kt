package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NumberSmall7: ImageVector
    get() {
        val current = _numberSmall7
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NumberSmall7",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.44 21.0 14.44 21.0 17.0 13.0 15.0 13.0 15.0 14.0 13.0 14.0 13.0 11.0 19.0 11.0 19.0 13.0 16.44 21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.44 21
                moveTo(x = 16.44f, y = 21.0f)
                // L 14.44 21
                lineTo(x = 14.44f, y = 21.0f)
                // L 17 13
                lineTo(x = 17.0f, y = 13.0f)
                // L 15 13
                lineTo(x = 15.0f, y = 13.0f)
                // L 15 14
                lineTo(x = 15.0f, y = 14.0f)
                // L 13 14
                lineTo(x = 13.0f, y = 14.0f)
                // L 13 11
                lineTo(x = 13.0f, y = 11.0f)
                // L 19 11
                lineTo(x = 19.0f, y = 11.0f)
                // L 19 13
                lineTo(x = 19.0f, y = 13.0f)
                // L 16.44 21z
                lineTo(x = 16.44f, y = 21.0f)
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
        }.build().also { _numberSmall7 = it }
    }

@Suppress("ObjectPropertyName")
private var _numberSmall7: ImageVector? = null
