package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UpToTop: ImageVector
    get() {
        val current = _upToTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UpToTop",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 14.0 6.0 24.0 7.4 25.4 16.0 16.8 24.6 25.4 26.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // L 6 24
                lineTo(x = 6.0f, y = 24.0f)
                // L 7.4 25.4
                lineTo(x = 7.4f, y = 25.4f)
                // L 16 16.8
                lineTo(x = 16.0f, y = 16.8f)
                // L 24.6 25.4
                lineTo(x = 24.6f, y = 25.4f)
                // L 26 24z
                lineTo(x = 26.0f, y = 24.0f)
                close()
            }
            // <rect width="24" height="2" x="4.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
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
        }.build().also { _upToTop = it }
    }

@Suppress("ObjectPropertyName")
private var _upToTop: ImageVector? = null
