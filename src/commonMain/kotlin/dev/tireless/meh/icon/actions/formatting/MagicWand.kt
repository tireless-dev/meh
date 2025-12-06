package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MagicWand: ImageVector
    get() {
        val current = _magicWand
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MagicWand",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29.41 24 12 6.59 a2.05 2.05 0 0 0 -2.83 0 L6.6 9.17 a2 2 0 0 0 0 2.83 l17.4 17.41 a2 2 0 0 0 2.84 0 l2.58 -2.58 a2 2 0 0 0 0 -2.83 M8 10.59 10.59 8 l5 5 -2.6 2.59z M25.41 28 l-11 -11 L17 14.41 l11 11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.41 24
                moveTo(x = 29.41f, y = 24.0f)
                // L 12 6.59
                lineTo(x = 12.0f, y = 6.59f)
                // a 2.05 2.05 0 0 0 -2.83 0
                arcToRelative(
                    a = 2.05f,
                    b = 2.05f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 0.0f,
                )
                // L 6.6 9.17
                lineTo(x = 6.6f, y = 9.17f)
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
                // l 17.4 17.41
                lineToRelative(dx = 17.4f, dy = 17.41f)
                // a 2 2 0 0 0 2.84 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.84f,
                    dy1 = 0.0f,
                )
                // l 2.58 -2.58
                lineToRelative(dx = 2.58f, dy = -2.58f)
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
                // M 8 10.59
                moveTo(x = 8.0f, y = 10.59f)
                // L 10.59 8
                lineTo(x = 10.59f, y = 8.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l -2.6 2.59z
                lineToRelative(dx = -2.6f, dy = 2.59f)
                close()
                // M 25.41 28
                moveTo(x = 25.41f, y = 28.0f)
                // l -11 -11
                lineToRelative(dx = -11.0f, dy = -11.0f)
                // L 17 14.41
                lineTo(x = 17.0f, y = 14.41f)
                // l 11 11z
                lineToRelative(dx = 11.0f, dy = 11.0f)
                close()
            }
            // <rect width="3" height="3" x="2.586" y="14.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2.0003023 16
                moveTo(x = 2.0003023f, y = 16.0f)
                // l 2.1213202 -2.1213202
                lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
                // l 2.1213202 2.1213202
                lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
                // l -2.1213202 2.1213202z
                lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
                close()
            }
            // <rect width="3" height="3" x="14.586" y="2.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.000302 3.999999
                moveTo(x = 14.000302f, y = 3.999999f)
                // l 2.1213202 -2.1213202
                lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
                // l 2.1213202 2.1213202
                lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
                // l -2.1213202 2.1213202z
                lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
                close()
            }
            // <rect width="3" height="3" x="2.586" y="2.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2.000302 4
                moveTo(x = 2.000302f, y = 4.0f)
                // l 2.1213202 -2.1213202
                lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
                // l 2.1213202 2.1213202
                lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
                // l -2.1213202 2.1213202z
                lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
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
        }.build().also { _magicWand = it }
    }

@Suppress("ObjectPropertyName")
private var _magicWand: ImageVector? = null
