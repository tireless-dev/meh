package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlagFilled: ImageVector
    get() {
        val current = _flagFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlagFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M6 30 H4 V2 h24 l-5.8 9 5.8 9 H6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 30
                moveTo(x = 6.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // l -5.8 9
                lineToRelative(dx = -5.8f, dy = 9.0f)
                // l 5.8 9
                lineToRelative(dx = 5.8f, dy = 9.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
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
        }.build().also { _flagFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _flagFilled: ImageVector? = null
