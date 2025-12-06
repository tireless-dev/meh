package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScreenOff: ImageVector
    get() {
        val current = _screenOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ScreenOff",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 22 H11.41 L30 3.41 28.59 2 l-2 2 H4 a2 2 0 0 0 -2 2 v16 h2 V6 h20.59 L2 28.59 3.41 30 l6 -6 H12 v4 H8 v2 h16 v-2 h-4 v-4 h8 a2 2 0 0 0 2 -2 V9 h-2Z m-10 6 h-4 v-4 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 22
                moveTo(x = 28.0f, y = 22.0f)
                // H 11.41
                horizontalLineTo(x = 11.41f)
                // L 30 3.41
                lineTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 20.59
                horizontalLineToRelative(dx = 20.59f)
                // L 2 28.59
                lineTo(x = 2.0f, y = 28.59f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m -10 6
                moveToRelative(dx = -10.0f, dy = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _screenOff = it }
    }

@Suppress("ObjectPropertyName")
private var _screenOff: ImageVector? = null
