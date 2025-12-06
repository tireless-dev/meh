package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Select02: ImageVector
    get() {
        val current = _select02
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Select02",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="12.0 6.0 8.0 6.0 8.0 2.0 6.0 2.0 6.0 6.0 2.0 6.0 2.0 8.0 6.0 8.0 6.0 12.0 8.0 12.0 8.0 8.0 12.0 8.0 12.0 6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // L 8 6
                lineTo(x = 8.0f, y = 6.0f)
                // L 8 2
                lineTo(x = 8.0f, y = 2.0f)
                // L 6 2
                lineTo(x = 6.0f, y = 2.0f)
                // L 6 6
                lineTo(x = 6.0f, y = 6.0f)
                // L 2 6
                lineTo(x = 2.0f, y = 6.0f)
                // L 2 8
                lineTo(x = 2.0f, y = 8.0f)
                // L 6 8
                lineTo(x = 6.0f, y = 8.0f)
                // L 6 12
                lineTo(x = 6.0f, y = 12.0f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 8 8
                lineTo(x = 8.0f, y = 8.0f)
                // L 12 8
                lineTo(x = 12.0f, y = 8.0f)
                // L 12 6z
                lineTo(x = 12.0f, y = 6.0f)
                close()
            }
            // M30 10 V4 h-6 v2 h-8 v2 h8 v2 h2 v14 h-2 v2 H10 v-2 H8 v-8 H6 v8 H4 v6 h6 v-2 h14 v2 h6 v-6 h-2 V10Z M8 28 H6 v-2 h2Z m20 0 h-2 v-2 h2Z M26 6 h2 v2 h-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 10
                moveTo(x = 30.0f, y = 10.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 10z
                verticalLineTo(y = 10.0f)
                close()
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 20 0
                moveToRelative(dx = 20.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 26 6
                moveTo(x = 26.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _select02 = it }
    }

@Suppress("ObjectPropertyName")
private var _select02: ImageVector? = null
