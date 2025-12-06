package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ordinal: ImageVector
    get() {
        val current = _ordinal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Ordinal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 26 V4 h-8 v6 h-6 v6 H6 v10 H2 v2 h28 v-2Z M8 26 v-8 h4 v8Z m6 0 V12 h4 v14Z m6 0 V6 h4 v20Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 26
                moveTo(x = 26.0f, y = 26.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 14z
                verticalLineToRelative(dy = 14.0f)
                close()
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 20z
                verticalLineToRelative(dy = 20.0f)
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
        }.build().also { _ordinal = it }
    }

@Suppress("ObjectPropertyName")
private var _ordinal: ImageVector? = null
