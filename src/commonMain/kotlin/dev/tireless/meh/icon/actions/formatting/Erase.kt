package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Erase: ImageVector
    get() {
        val current = _erase
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Erase",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="23" height="2" x="7.0" y="27.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 27
                moveTo(x = 7.0f, y = 27.0f)
                // h 23
                horizontalLineToRelative(dx = 23.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -23z
                horizontalLineToRelative(dx = -23.0f)
                close()
            }
            // m27.38 10.51 -7.93 -7.92 a2 2 0 0 0 -2.83 0 l-14 14 a2 2 0 0 0 0 2.83 L7.13 24 h9.59 l10.66 -10.66 a2 2 0 0 0 0 -2.83 M15.89 22 H8 l-4 -4 6.31 -6.31 7.93 7.92Z m3.76 -3.76 -7.92 -7.93 L18 4 l8 7.93Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.38 10.51
                moveTo(x = 27.38f, y = 10.51f)
                // l -7.93 -7.92
                lineToRelative(dx = -7.93f, dy = -7.92f)
                // a 2 2 0 0 0 -2.83 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 0.0f,
                )
                // l -14 14
                lineToRelative(dx = -14.0f, dy = 14.0f)
                // a 2 2 0 0 0 0 2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.83f,
                )
                // L 7.13 24
                lineTo(x = 7.13f, y = 24.0f)
                // h 9.59
                horizontalLineToRelative(dx = 9.59f)
                // l 10.66 -10.66
                lineToRelative(dx = 10.66f, dy = -10.66f)
                // a 2 2 0 0 0 0 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.83f,
                )
                // M 15.89 22
                moveTo(x = 15.89f, y = 22.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l 6.31 -6.31
                lineToRelative(dx = 6.31f, dy = -6.31f)
                // l 7.93 7.92z
                lineToRelative(dx = 7.93f, dy = 7.92f)
                close()
                // m 3.76 -3.76
                moveToRelative(dx = 3.76f, dy = -3.76f)
                // l -7.92 -7.93
                lineToRelative(dx = -7.92f, dy = -7.93f)
                // L 18 4
                lineTo(x = 18.0f, y = 4.0f)
                // l 8 7.93z
                lineToRelative(dx = 8.0f, dy = 7.93f)
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
        }.build().also { _erase = it }
    }

@Suppress("ObjectPropertyName")
private var _erase: ImageVector? = null
