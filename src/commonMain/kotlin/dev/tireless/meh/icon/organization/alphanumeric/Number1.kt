package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Number1: ImageVector
    get() {
        val current = _number1
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Number1",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 10 v12z m1 -1 h-5 v2 h3 v10 h-3 v2 h8 v-2 h-3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
                // m 1 -1
                moveToRelative(dx = 1.0f, dy = -1.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
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
        }.build().also { _number1 = it }
    }

@Suppress("ObjectPropertyName")
private var _number1: ImageVector? = null
