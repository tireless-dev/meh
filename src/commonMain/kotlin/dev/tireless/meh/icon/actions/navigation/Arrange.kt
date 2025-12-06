package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrange: ImageVector
    get() {
        val current = _arrange
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Arrange",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 29 H2 v-2 h28z m-3 -10 H5 v2 h22z m-3 -8 H8 v2 h16z m-3 -8 H11 v2 h10z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 29
                moveTo(x = 30.0f, y = 29.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 28z
                horizontalLineToRelative(dx = 28.0f)
                close()
                // m -3 -10
                moveToRelative(dx = -3.0f, dy = -10.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 22z
                horizontalLineToRelative(dx = 22.0f)
                close()
                // m -3 -8
                moveToRelative(dx = -3.0f, dy = -8.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
                // m -3 -8
                moveToRelative(dx = -3.0f, dy = -8.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _arrange = it }
    }

@Suppress("ObjectPropertyName")
private var _arrange: ImageVector? = null
