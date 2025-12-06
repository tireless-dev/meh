package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Restart: ImageVector
    get() {
        val current = _restart
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Restart",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 18 A10 10 0 1 1 16 8 h6.18 l-3.58 3.59 L20 13 l6 -6 -6 -6 -1.4 1.41 L22.19 6 H16 a12 12 0 1 0 12 12Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // A 10 10 0 1 1 16 8
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 8.0f,
                )
                // h 6.18
                horizontalLineToRelative(dx = 6.18f)
                // l -3.58 3.59
                lineToRelative(dx = -3.58f, dy = 3.59f)
                // L 20 13
                lineTo(x = 20.0f, y = 13.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -1.4 1.41
                lineToRelative(dx = -1.4f, dy = 1.41f)
                // L 22.19 6
                lineTo(x = 22.19f, y = 6.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // a 12 12 0 1 0 12 12z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
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
        }.build().also { _restart = it }
    }

@Suppress("ObjectPropertyName")
private var _restart: ImageVector? = null
