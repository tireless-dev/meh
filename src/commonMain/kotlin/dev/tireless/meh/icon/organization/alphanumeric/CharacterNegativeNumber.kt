package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CharacterNegativeNumber: ImageVector
    get() {
        val current = _characterNegativeNumber
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CharacterNegativeNumber",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="19.5 22.5 19.5 21.5 22.5 21.5 22.5 10.5 19.5 10.5 19.5 9.5 23.5 9.5 23.5 21.5 26.5 21.5 26.5 22.5 19.5 22.5" fill="#000" style="fill:#fff" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.5 22.5
                moveTo(x = 19.5f, y = 22.5f)
                // L 19.5 21.5
                lineTo(x = 19.5f, y = 21.5f)
                // L 22.5 21.5
                lineTo(x = 22.5f, y = 21.5f)
                // L 22.5 10.5
                lineTo(x = 22.5f, y = 10.5f)
                // L 19.5 10.5
                lineTo(x = 19.5f, y = 10.5f)
                // L 19.5 9.5
                lineTo(x = 19.5f, y = 9.5f)
                // L 23.5 9.5
                lineTo(x = 23.5f, y = 9.5f)
                // L 23.5 21.5
                lineTo(x = 23.5f, y = 21.5f)
                // L 26.5 21.5
                lineTo(x = 26.5f, y = 21.5f)
                // L 26.5 22.5
                lineTo(x = 26.5f, y = 22.5f)
                // L 19.5 22.5z
                lineTo(x = 19.5f, y = 22.5f)
                close()
            }
            // M23 10 v12z m1 -1 h-5 v2 h3 v10 h-3 v2 h8 v-2 h-3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 10
                moveTo(x = 23.0f, y = 10.0f)
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
            // <rect width="10" height="2" x="5.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
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
        }.build().also { _characterNegativeNumber = it }
    }

@Suppress("ObjectPropertyName")
private var _characterNegativeNumber: ImageVector? = null
