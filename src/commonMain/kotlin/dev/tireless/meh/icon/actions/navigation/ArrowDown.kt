package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowDown: ImageVector
    get() {
        val current = _arrowDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArrowDown",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="24.59 16.59 17.0 24.17 17.0 4.0 15.0 4.0 15.0 24.17 7.41 16.59 6.0 18.0 16.0 28.0 26.0 18.0 24.59 16.59" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.59 16.59
                moveTo(x = 24.59f, y = 16.59f)
                // L 17 24.17
                lineTo(x = 17.0f, y = 24.17f)
                // L 17 4
                lineTo(x = 17.0f, y = 4.0f)
                // L 15 4
                lineTo(x = 15.0f, y = 4.0f)
                // L 15 24.17
                lineTo(x = 15.0f, y = 24.17f)
                // L 7.41 16.59
                lineTo(x = 7.41f, y = 16.59f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // L 16 28
                lineTo(x = 16.0f, y = 28.0f)
                // L 26 18
                lineTo(x = 26.0f, y = 18.0f)
                // L 24.59 16.59z
                lineTo(x = 24.59f, y = 16.59f)
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
        }.build().also { _arrowDown = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDown: ImageVector? = null
