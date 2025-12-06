package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExpandCategories: ImageVector
    get() {
        val current = _expandCategories
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ExpandCategories",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="6" height="2" x="20.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 26
                moveTo(x = 20.0f, y = 26.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="8" height="2" x="20.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 18
                moveTo(x = 20.0f, y = 18.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // <rect width="10" height="2" x="20.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="2" height="24" x="15.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <polygon points="10.586 3.959 7.0 7.249 3.412 3.958 2.0 5.373 7.0 10.0 12.0 5.373 10.586 3.959" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.586 3.959
                moveTo(x = 10.586f, y = 3.959f)
                // L 7 7.249
                lineTo(x = 7.0f, y = 7.249f)
                // L 3.412 3.958
                lineTo(x = 3.412f, y = 3.958f)
                // L 2 5.373
                lineTo(x = 2.0f, y = 5.373f)
                // L 7 10
                lineTo(x = 7.0f, y = 10.0f)
                // L 12 5.373
                lineTo(x = 12.0f, y = 5.373f)
                // L 10.586 3.959z
                lineTo(x = 10.586f, y = 3.959f)
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
        }.build().also { _expandCategories = it }
    }

@Suppress("ObjectPropertyName")
private var _expandCategories: ImageVector? = null
