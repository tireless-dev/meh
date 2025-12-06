package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hashtag: ImageVector
    get() {
        val current = _hashtag
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Hashtag",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 12 v-2 h-6 V4 h-2 v6 h-8 V4 h-2 v6 H4 v2 h6 v8 H4 v2 h6 v6 h2 v-6 h8 v6 h2 v-6 h6 v-2 h-6 v-8Z m-8 8 h-8 v-8 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _hashtag = it }
    }

@Suppress("ObjectPropertyName")
private var _hashtag: ImageVector? = null
