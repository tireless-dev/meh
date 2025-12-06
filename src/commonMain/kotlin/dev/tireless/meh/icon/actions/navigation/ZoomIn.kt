package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZoomIn: ImageVector
    get() {
        val current = _zoomIn
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ZoomIn",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="18.0 12.0 14.0 12.0 14.0 8.0 12.0 8.0 12.0 12.0 8.0 12.0 8.0 14.0 12.0 14.0 12.0 18.0 14.0 18.0 14.0 14.0 18.0 14.0 18.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // L 14 12
                lineTo(x = 14.0f, y = 12.0f)
                // L 14 8
                lineTo(x = 14.0f, y = 8.0f)
                // L 12 8
                lineTo(x = 12.0f, y = 8.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
                // L 12 14
                lineTo(x = 12.0f, y = 14.0f)
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // L 14 18
                lineTo(x = 14.0f, y = 18.0f)
                // L 14 14
                lineTo(x = 14.0f, y = 14.0f)
                // L 18 14
                lineTo(x = 18.0f, y = 14.0f)
                // L 18 12z
                lineTo(x = 18.0f, y = 12.0f)
                close()
            }
            // M21.45 20 A11 11 0 0 0 24 13 a11 11 0 1 0 -11 11 11 11 0 0 0 7 -2.55 L27.59 29 29 27.59Z M13 22 a9 9 0 1 1 9 -9 9 9 0 0 1 -9 9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.45 20
                moveTo(x = 21.45f, y = 20.0f)
                // A 11 11 0 0 0 24 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 13.0f,
                )
                // a 11 11 0 1 0 -11 11
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -11.0f,
                    dy1 = 11.0f,
                )
                // a 11 11 0 0 0 7 -2.55
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -2.55f,
                )
                // L 27.59 29
                lineTo(x = 27.59f, y = 29.0f)
                // L 29 27.59z
                lineTo(x = 29.0f, y = 27.59f)
                close()
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // a 9 9 0 1 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9 9 0 0 1 -9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 9.0f,
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
        }.build().also { _zoomIn = it }
    }

@Suppress("ObjectPropertyName")
private var _zoomIn: ImageVector? = null
