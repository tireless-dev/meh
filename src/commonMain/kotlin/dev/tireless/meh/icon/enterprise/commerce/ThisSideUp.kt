package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThisSideUp: ImageVector
    get() {
        val current = _thisSideUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ThisSideUp",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // <polygon points="7.0 5.828 7.0 24.0 9.0 24.0 9.0 5.828 12.586 9.414 14.0 8.0 8.0 2.0 2.0 8.0 3.414 9.414 7.0 5.828" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 5.828
                moveTo(x = 7.0f, y = 5.828f)
                // L 7 24
                lineTo(x = 7.0f, y = 24.0f)
                // L 9 24
                lineTo(x = 9.0f, y = 24.0f)
                // L 9 5.828
                lineTo(x = 9.0f, y = 5.828f)
                // L 12.586 9.414
                lineTo(x = 12.586f, y = 9.414f)
                // L 14 8
                lineTo(x = 14.0f, y = 8.0f)
                // L 8 2
                lineTo(x = 8.0f, y = 2.0f)
                // L 2 8
                lineTo(x = 2.0f, y = 8.0f)
                // L 3.414 9.414
                lineTo(x = 3.414f, y = 9.414f)
                // L 7 5.828z
                lineTo(x = 7.0f, y = 5.828f)
                close()
            }
            // <polygon points="23.0 5.828 23.0 24.0 25.0 24.0 25.0 5.828 28.586 9.414 30.0 8.0 24.0 2.0 18.0 8.0 19.414 9.414 23.0 5.828" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 5.828
                moveTo(x = 23.0f, y = 5.828f)
                // L 23 24
                lineTo(x = 23.0f, y = 24.0f)
                // L 25 24
                lineTo(x = 25.0f, y = 24.0f)
                // L 25 5.828
                lineTo(x = 25.0f, y = 5.828f)
                // L 28.586 9.414
                lineTo(x = 28.586f, y = 9.414f)
                // L 30 8
                lineTo(x = 30.0f, y = 8.0f)
                // L 24 2
                lineTo(x = 24.0f, y = 2.0f)
                // L 18 8
                lineTo(x = 18.0f, y = 8.0f)
                // L 19.414 9.414
                lineTo(x = 19.414f, y = 9.414f)
                // L 23 5.828z
                lineTo(x = 23.0f, y = 5.828f)
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
        }.build().also { _thisSideUp = it }
    }

@Suppress("ObjectPropertyName")
private var _thisSideUp: ImageVector? = null
