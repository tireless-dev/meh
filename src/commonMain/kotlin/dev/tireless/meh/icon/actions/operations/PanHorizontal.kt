package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PanHorizontal: ImageVector
    get() {
        val current = _panHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PanHorizontal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="24.0 10.0 22.586 11.414 26.172 15.0 5.828 15.0 9.414 11.414 8.0 10.0 2.0 16.0 8.0 22.0 9.414 20.586 5.828 17.0 26.172 17.0 22.586 20.586 24.0 22.0 30.0 16.0 24.0 10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 10
                moveTo(x = 24.0f, y = 10.0f)
                // L 22.586 11.414
                lineTo(x = 22.586f, y = 11.414f)
                // L 26.172 15
                lineTo(x = 26.172f, y = 15.0f)
                // L 5.828 15
                lineTo(x = 5.828f, y = 15.0f)
                // L 9.414 11.414
                lineTo(x = 9.414f, y = 11.414f)
                // L 8 10
                lineTo(x = 8.0f, y = 10.0f)
                // L 2 16
                lineTo(x = 2.0f, y = 16.0f)
                // L 8 22
                lineTo(x = 8.0f, y = 22.0f)
                // L 9.414 20.586
                lineTo(x = 9.414f, y = 20.586f)
                // L 5.828 17
                lineTo(x = 5.828f, y = 17.0f)
                // L 26.172 17
                lineTo(x = 26.172f, y = 17.0f)
                // L 22.586 20.586
                lineTo(x = 22.586f, y = 20.586f)
                // L 24 22
                lineTo(x = 24.0f, y = 22.0f)
                // L 30 16
                lineTo(x = 30.0f, y = 16.0f)
                // L 24 10z
                lineTo(x = 24.0f, y = 10.0f)
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
        }.build().also { _panHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _panHorizontal: ImageVector? = null
