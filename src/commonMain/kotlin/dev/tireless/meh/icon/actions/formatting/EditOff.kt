package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EditOff: ImageVector
    get() {
        val current = _editOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EditOff",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 28.6 3.4 2 2 3.4 l10.1 10.1 L4 21.6 V28 h6.4 l8.1 -8.1 L28.6 30z M9.6 26 H6 v-3.6 l7.5 -7.5 3.6 3.6z M29.4 6.2 l-3.6 -3.6 c-.8 -.8 -2 -.8 -2.8 0 l-8 8 1.4 1.4 L20 8.4 l3.6 3.6 -3.6 3.6 1.4 1.4 8 -8 c.8 -.8 .8 -2 0 -2.8 M25 10.6 21.4 7 l3 -3 L28 7.6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 28.6
                moveTo(x = 30.0f, y = 28.6f)
                // L 3.4 2
                lineTo(x = 3.4f, y = 2.0f)
                // L 2 3.4
                lineTo(x = 2.0f, y = 3.4f)
                // l 10.1 10.1
                lineToRelative(dx = 10.1f, dy = 10.1f)
                // L 4 21.6
                lineTo(x = 4.0f, y = 21.6f)
                // V 28
                verticalLineTo(y = 28.0f)
                // h 6.4
                horizontalLineToRelative(dx = 6.4f)
                // l 8.1 -8.1
                lineToRelative(dx = 8.1f, dy = -8.1f)
                // L 28.6 30z
                lineTo(x = 28.6f, y = 30.0f)
                close()
                // M 9.6 26
                moveTo(x = 9.6f, y = 26.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -3.6
                verticalLineToRelative(dy = -3.6f)
                // l 7.5 -7.5
                lineToRelative(dx = 7.5f, dy = -7.5f)
                // l 3.6 3.6z
                lineToRelative(dx = 3.6f, dy = 3.6f)
                close()
                // M 29.4 6.2
                moveTo(x = 29.4f, y = 6.2f)
                // l -3.6 -3.6
                lineToRelative(dx = -3.6f, dy = -3.6f)
                // c -0.8 -0.8 -2 -0.8 -2.8 0
                curveToRelative(
                    dx1 = -0.8f,
                    dy1 = -0.8f,
                    dx2 = -2.0f,
                    dy2 = -0.8f,
                    dx3 = -2.8f,
                    dy3 = 0.0f,
                )
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // L 20 8.4
                lineTo(x = 20.0f, y = 8.4f)
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // l -3.6 3.6
                lineToRelative(dx = -3.6f, dy = 3.6f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // l 8 -8
                lineToRelative(dx = 8.0f, dy = -8.0f)
                // c 0.8 -0.8 0.8 -2 0 -2.8
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = -0.8f,
                    dx2 = 0.8f,
                    dy2 = -2.0f,
                    dx3 = 0.0f,
                    dy3 = -2.8f,
                )
                // M 25 10.6
                moveTo(x = 25.0f, y = 10.6f)
                // L 21.4 7
                lineTo(x = 21.4f, y = 7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // L 28 7.6z
                lineTo(x = 28.0f, y = 7.6f)
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
        }.build().also { _editOff = it }
    }

@Suppress("ObjectPropertyName")
private var _editOff: ImageVector? = null
