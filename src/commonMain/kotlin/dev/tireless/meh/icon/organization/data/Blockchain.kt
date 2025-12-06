package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Blockchain: ImageVector
    get() {
        val current = _blockchain
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Blockchain",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M6 24 H4 V8 h2Z M28 8 h-2 v16 h2Z m-4 -2 V4 H8 v2Z m0 22 v-2 H8 v2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 24
                moveTo(x = 6.0f, y = 24.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m -4 -2
                moveToRelative(dx = -4.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 0 22
                moveToRelative(dx = 0.0f, dy = 22.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
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
        }.build().also { _blockchain = it }
    }

@Suppress("ObjectPropertyName")
private var _blockchain: ImageVector? = null
