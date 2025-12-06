package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NextFilled: ImageVector
    get() {
        val current = _nextFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NextFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M2 16 A14 14 0 1 0 16 2 14 14 0 0 0 2 16 m6 -1 h12.15 l-5.58 -5.6 L16 8 l8 8 -8 8 -1.43 -1.43 L20.15 17 H8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // A 14 14 0 1 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // A 14 14 0 0 0 2 16
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // m 6 -1
                moveToRelative(dx = 6.0f, dy = -1.0f)
                // h 12.15
                horizontalLineToRelative(dx = 12.15f)
                // l -5.58 -5.6
                lineToRelative(dx = -5.58f, dy = -5.6f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // l -1.43 -1.43
                lineToRelative(dx = -1.43f, dy = -1.43f)
                // L 20.15 17
                lineTo(x = 20.15f, y = 17.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
            }
            // <polygon points="16.0 8.0 14.57 9.393 20.15 15.0 8.0 15.0 8.0 17.0 20.15 17.0 14.57 22.573 16.0 24.0 24.0 16.0 16.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // L 14.57 9.393
                lineTo(x = 14.57f, y = 9.393f)
                // L 20.15 15
                lineTo(x = 20.15f, y = 15.0f)
                // L 8 15
                lineTo(x = 8.0f, y = 15.0f)
                // L 8 17
                lineTo(x = 8.0f, y = 17.0f)
                // L 20.15 17
                lineTo(x = 20.15f, y = 17.0f)
                // L 14.57 22.573
                lineTo(x = 14.57f, y = 22.573f)
                // L 16 24
                lineTo(x = 16.0f, y = 24.0f)
                // L 24 16
                lineTo(x = 24.0f, y = 16.0f)
                // L 16 8z
                lineTo(x = 16.0f, y = 8.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _nextFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _nextFilled: ImageVector? = null
