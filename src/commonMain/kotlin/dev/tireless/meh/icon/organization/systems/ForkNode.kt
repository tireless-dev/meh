package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ForkNode: ImageVector
    get() {
        val current = _forkNode
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ForkNode",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="4" height="2" x="26.0" y="21.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 26 21
                moveTo(x = 26.0f, y = 21.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="26.0" y="9.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 26 9
                moveTo(x = 26.0f, y = 9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="24.0 11.0 24.0 9.0 20.0 9.0 20.0 4.0 14.0 4.0 14.0 28.0 20.0 28.0 20.0 23.0 24.0 23.0 24.0 21.0 20.0 21.0 20.0 11.0 24.0 11.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 24 11
                moveTo(x = 24.0f, y = 11.0f)
                // L 24 9
                lineTo(x = 24.0f, y = 9.0f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // L 20 4
                lineTo(x = 20.0f, y = 4.0f)
                // L 14 4
                lineTo(x = 14.0f, y = 4.0f)
                // L 14 28
                lineTo(x = 14.0f, y = 28.0f)
                // L 20 28
                lineTo(x = 20.0f, y = 28.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 24 23
                lineTo(x = 24.0f, y = 23.0f)
                // L 24 21
                lineTo(x = 24.0f, y = 21.0f)
                // L 20 21
                lineTo(x = 20.0f, y = 21.0f)
                // L 20 11
                lineTo(x = 20.0f, y = 11.0f)
                // L 24 11z
                lineTo(x = 24.0f, y = 11.0f)
                close()
            }
            // <polygon points="10.1719 15.0 2.0 15.0 2.0 17.0 10.1719 17.0 7.5859 19.5859 9.0 21.0 14.0 16.0 9.0 11.0 7.5859 12.4141 10.1719 15.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 10.1719 15
                moveTo(x = 10.1719f, y = 15.0f)
                // L 2 15
                lineTo(x = 2.0f, y = 15.0f)
                // L 2 17
                lineTo(x = 2.0f, y = 17.0f)
                // L 10.1719 17
                lineTo(x = 10.1719f, y = 17.0f)
                // L 7.5859 19.5859
                lineTo(x = 7.5859f, y = 19.5859f)
                // L 9 21
                lineTo(x = 9.0f, y = 21.0f)
                // L 14 16
                lineTo(x = 14.0f, y = 16.0f)
                // L 9 11
                lineTo(x = 9.0f, y = 11.0f)
                // L 7.5859 12.4141
                lineTo(x = 7.5859f, y = 12.4141f)
                // L 10.1719 15z
                lineTo(x = 10.1719f, y = 15.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _forkNode = it }
    }

@Suppress("ObjectPropertyName")
private var _forkNode: ImageVector? = null
