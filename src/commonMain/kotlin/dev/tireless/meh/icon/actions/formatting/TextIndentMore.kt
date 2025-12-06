package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextIndentMore: ImageVector
    get() {
        val current = _textIndentMore
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextIndentMore",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="10" height="2" x="20.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 6
                moveTo(x = 20.0f, y = 6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="7" height="2" x="20.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="10" height="2" x="20.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 18
                moveTo(x = 20.0f, y = 18.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="7" height="2" x="20.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 24
                moveTo(x = 20.0f, y = 24.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="2" height="24" x="14.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <polygon points="3.85 22.5 2.44 21.12 8.73 15.0 2.44 8.88 3.85 7.5 11.56 15.0 3.85 22.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3.85 22.5
                moveTo(x = 3.85f, y = 22.5f)
                // L 2.44 21.12
                lineTo(x = 2.44f, y = 21.12f)
                // L 8.73 15
                lineTo(x = 8.73f, y = 15.0f)
                // L 2.44 8.88
                lineTo(x = 2.44f, y = 8.88f)
                // L 3.85 7.5
                lineTo(x = 3.85f, y = 7.5f)
                // L 11.56 15
                lineTo(x = 11.56f, y = 15.0f)
                // L 3.85 22.5z
                lineTo(x = 3.85f, y = 22.5f)
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
        }.build().also { _textIndentMore = it }
    }

@Suppress("ObjectPropertyName")
private var _textIndentMore: ImageVector? = null
