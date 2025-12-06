package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Return: ImageVector
    get() {
        val current = _return
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Return",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 8 v2 a4 4 0 0 1 0 8 H10 v-5 l-6 6 6 6 v-5 h12 a6 6 0 0 0 0 -12
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 8
                moveTo(x = 22.0f, y = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 6 6 0 0 0 0 -12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -12.0f,
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
        }.build().also { _return = it }
    }

@Suppress("ObjectPropertyName")
private var _return: ImageVector? = null
