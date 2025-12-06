package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Undo: ImageVector
    get() {
        val current = _undo
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Undo",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 10 H7.81 l3.6 -3.59 L10 5 l-6 6 6 6 1.4 -1.41 L7.82 12 H20 a6 6 0 0 1 0 12 h-8 v2 h8 a8 8 0 0 0 0 -16
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // H 7.81
                horizontalLineTo(x = 7.81f)
                // l 3.6 -3.59
                lineToRelative(dx = 3.6f, dy = -3.59f)
                // L 10 5
                lineTo(x = 10.0f, y = 5.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 1.4 -1.41
                lineToRelative(dx = 1.4f, dy = -1.41f)
                // L 7.82 12
                lineTo(x = 7.82f, y = 12.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // a 6 6 0 0 1 0 12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 12.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 8 8 0 0 0 0 -16
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -16.0f,
                )
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
        }.build().also { _undo = it }
    }

@Suppress("ObjectPropertyName")
private var _undo: ImageVector? = null
