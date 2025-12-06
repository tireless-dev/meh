package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DfsortIbmZSort: ImageVector
    get() {
        val current = _dfsortIbmZSort
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DfsortIbmZSort",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m10.6 24 1.4 1.4 -5 5 -5 -5 L3.4 24 6 26.6 V2 h2 v24.6z M14 2 v2 h16 V2z m0 8 h14 V8 H14z m0 6 h12 v-2 H14z m0 6 h10 v-2 H14z m0 6 h8 v-2 h-8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.6 24
                moveTo(x = 10.6f, y = 24.0f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // L 3.4 24
                lineTo(x = 3.4f, y = 24.0f)
                // L 6 26.6
                lineTo(x = 6.0f, y = 26.6f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24.6z
                verticalLineToRelative(dy = 24.6f)
                close()
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // H 14z
                horizontalLineTo(x = 14.0f)
                close()
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 14z
                horizontalLineTo(x = 14.0f)
                close()
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 14z
                horizontalLineTo(x = 14.0f)
                close()
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _dfsortIbmZSort = it }
    }

@Suppress("ObjectPropertyName")
private var _dfsortIbmZSort: ImageVector? = null
