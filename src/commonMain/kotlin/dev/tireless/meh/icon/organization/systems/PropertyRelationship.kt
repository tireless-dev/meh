package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PropertyRelationship: ImageVector
    get() {
        val current = _propertyRelationship
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PropertyRelationship",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 16.0 22.0 24.0 20.6 22.6 27.2 16.0 20.6 9.4 22.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // L 22 24
                lineTo(x = 22.0f, y = 24.0f)
                // L 20.6 22.6
                lineTo(x = 20.6f, y = 22.6f)
                // L 27.2 16
                lineTo(x = 27.2f, y = 16.0f)
                // L 20.6 9.4
                lineTo(x = 20.6f, y = 9.4f)
                // L 22 8z
                lineTo(x = 22.0f, y = 8.0f)
                close()
            }
            // <rect width="8" height="2" x="12.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <polygon points="2.0 16.0 10.0 8.0 11.4 9.4 4.8 16.0 11.4 22.6 10.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // L 10 8
                lineTo(x = 10.0f, y = 8.0f)
                // L 11.4 9.4
                lineTo(x = 11.4f, y = 9.4f)
                // L 4.8 16
                lineTo(x = 4.8f, y = 16.0f)
                // L 11.4 22.6
                lineTo(x = 11.4f, y = 22.6f)
                // L 10 24z
                lineTo(x = 10.0f, y = 24.0f)
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
        }.build().also { _propertyRelationship = it }
    }

@Suppress("ObjectPropertyName")
private var _propertyRelationship: ImageVector? = null
