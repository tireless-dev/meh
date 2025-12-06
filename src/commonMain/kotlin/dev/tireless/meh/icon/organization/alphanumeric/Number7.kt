package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Number7: ImageVector
    get() {
        val current = _number7
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Number7",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="20.0 9.0 12.0 9.0 12.0 13.0 14.0 13.0 14.0 11.0 17.85 11.0 13.0 23.0 15.16 23.0 20.0 11.0 20.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 12 13
                lineTo(x = 12.0f, y = 13.0f)
                // L 14 13
                lineTo(x = 14.0f, y = 13.0f)
                // L 14 11
                lineTo(x = 14.0f, y = 11.0f)
                // L 17.85 11
                lineTo(x = 17.85f, y = 11.0f)
                // L 13 23
                lineTo(x = 13.0f, y = 23.0f)
                // L 15.16 23
                lineTo(x = 15.16f, y = 23.0f)
                // L 20 11
                lineTo(x = 20.0f, y = 11.0f)
                // L 20 9z
                lineTo(x = 20.0f, y = 9.0f)
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
        }.build().also { _number7 = it }
    }

@Suppress("ObjectPropertyName")
private var _number7: ImageVector? = null
