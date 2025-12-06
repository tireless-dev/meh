package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronSortDown: ImageVector
    get() {
        val current = _chevronSortDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChevronSortDown",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 28.0 9.0 21.0 10.4 19.6 16.0 25.2 21.6 19.6 23.0 21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // L 9 21
                lineTo(x = 9.0f, y = 21.0f)
                // L 10.4 19.6
                lineTo(x = 10.4f, y = 19.6f)
                // L 16 25.2
                lineTo(x = 16.0f, y = 25.2f)
                // L 21.6 19.6
                lineTo(x = 21.6f, y = 19.6f)
                // L 23 21z
                lineTo(x = 23.0f, y = 21.0f)
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
        }.build().also { _chevronSortDown = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronSortDown: ImageVector? = null
