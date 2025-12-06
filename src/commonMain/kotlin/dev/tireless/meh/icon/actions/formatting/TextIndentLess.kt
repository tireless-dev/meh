package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextIndentLess: ImageVector
    get() {
        val current = _textIndentLess
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextIndentLess",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="10" height="2" x="2.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="7" height="2" x="5.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 12
                moveTo(x = 5.0f, y = 12.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="10" height="2" x="2.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="7" height="2" x="5.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 24
                moveTo(x = 5.0f, y = 24.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="2" height="24" x="16.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <polygon points="28.15 23.5 29.56 22.12 23.27 16.0 29.56 9.88 28.15 8.5 20.44 16.0 28.15 23.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.15 23.5
                moveTo(x = 28.15f, y = 23.5f)
                // L 29.56 22.12
                lineTo(x = 29.56f, y = 22.12f)
                // L 23.27 16
                lineTo(x = 23.27f, y = 16.0f)
                // L 29.56 9.88
                lineTo(x = 29.56f, y = 9.88f)
                // L 28.15 8.5
                lineTo(x = 28.15f, y = 8.5f)
                // L 20.44 16
                lineTo(x = 20.44f, y = 16.0f)
                // L 28.15 23.5z
                lineTo(x = 28.15f, y = 23.5f)
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
        }.build().also { _textIndentLess = it }
    }

@Suppress("ObjectPropertyName")
private var _textIndentLess: ImageVector? = null
