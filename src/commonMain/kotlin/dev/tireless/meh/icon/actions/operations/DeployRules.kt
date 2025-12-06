package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeployRules: ImageVector
    get() {
        val current = _deployRules
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DeployRules",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="18.0 4.0 12.0 10.0 13.41 11.41 17.0 7.83 17.0 20.0 19.0 20.0 19.0 7.83 22.59 11.41 24.0 10.0 18.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 4
                moveTo(x = 18.0f, y = 4.0f)
                // L 12 10
                lineTo(x = 12.0f, y = 10.0f)
                // L 13.41 11.41
                lineTo(x = 13.41f, y = 11.41f)
                // L 17 7.83
                lineTo(x = 17.0f, y = 7.83f)
                // L 17 20
                lineTo(x = 17.0f, y = 20.0f)
                // L 19 20
                lineTo(x = 19.0f, y = 20.0f)
                // L 19 7.83
                lineTo(x = 19.0f, y = 7.83f)
                // L 22.59 11.41
                lineTo(x = 22.59f, y = 11.41f)
                // L 24 10
                lineTo(x = 24.0f, y = 10.0f)
                // L 18 4z
                lineTo(x = 18.0f, y = 4.0f)
                close()
            }
            // <rect width="7" height="2" x="8.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="16" height="2" x="8.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -16z
                horizontalLineToRelative(dx = -16.0f)
                close()
            }
            // <rect width="16" height="2" x="8.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -16z
                horizontalLineToRelative(dx = -16.0f)
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
        }.build().also { _deployRules = it }
    }

@Suppress("ObjectPropertyName")
private var _deployRules: ImageVector? = null
