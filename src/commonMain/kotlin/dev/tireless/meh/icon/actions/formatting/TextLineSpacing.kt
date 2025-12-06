package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextLineSpacing: ImageVector
    get() {
        val current = _textLineSpacing
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextLineSpacing",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="13" height="2" x="17.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 6
                moveTo(x = 17.0f, y = 6.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -13z
                horizontalLineToRelative(dx = -13.0f)
                close()
            }
            // <rect width="10" height="2" x="17.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="13" height="2" x="17.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 18
                moveTo(x = 17.0f, y = 18.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -13z
                horizontalLineToRelative(dx = -13.0f)
                close()
            }
            // <rect width="10" height="2" x="17.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 24
                moveTo(x = 17.0f, y = 24.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <polygon points="11.59 13.41 8.0 9.83 8.0 9.83 4.41 13.42 3.0 12.0 8.0 7.0 13.0 12.0 11.59 13.41" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.59 13.41
                moveTo(x = 11.59f, y = 13.41f)
                // L 8 9.83
                lineTo(x = 8.0f, y = 9.83f)
                // L 8 9.83
                lineTo(x = 8.0f, y = 9.83f)
                // L 4.41 13.42
                lineTo(x = 4.41f, y = 13.42f)
                // L 3 12
                lineTo(x = 3.0f, y = 12.0f)
                // L 8 7
                lineTo(x = 8.0f, y = 7.0f)
                // L 13 12
                lineTo(x = 13.0f, y = 12.0f)
                // L 11.59 13.41z
                lineTo(x = 11.59f, y = 13.41f)
                close()
            }
            // <polygon points="11.59 18.59 8.0 22.17 8.0 22.17 4.41 18.58 3.0 20.0 8.0 25.0 13.0 20.0 11.59 18.59" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.59 18.59
                moveTo(x = 11.59f, y = 18.59f)
                // L 8 22.17
                lineTo(x = 8.0f, y = 22.17f)
                // L 8 22.17
                lineTo(x = 8.0f, y = 22.17f)
                // L 4.41 18.58
                lineTo(x = 4.41f, y = 18.58f)
                // L 3 20
                lineTo(x = 3.0f, y = 20.0f)
                // L 8 25
                lineTo(x = 8.0f, y = 25.0f)
                // L 13 20
                lineTo(x = 13.0f, y = 20.0f)
                // L 11.59 18.59z
                lineTo(x = 11.59f, y = 18.59f)
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
        }.build().also { _textLineSpacing = it }
    }

@Suppress("ObjectPropertyName")
private var _textLineSpacing: ImageVector? = null
