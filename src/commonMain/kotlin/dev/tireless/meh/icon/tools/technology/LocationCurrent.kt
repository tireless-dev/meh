package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationCurrent: ImageVector
    get() {
        val current = _locationCurrent
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LocationCurrent",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 12.98 a1 1 0 0 0 .63 .95 l9.6 3.84 3.84 9.6 A1 1 0 0 0 19 28 h.02 a1 1 0 0 0 .92 -.66 l8 -22 a1 1 0 0 0 -1.28 -1.28 l-22 8 A1 1 0 0 0 4 12.98
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 12.98
                moveTo(x = 4.0f, y = 12.98f)
                // a 1 1 0 0 0 0.63 0.95
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.63f,
                    dy1 = 0.95f,
                )
                // l 9.6 3.84
                lineToRelative(dx = 9.6f, dy = 3.84f)
                // l 3.84 9.6
                lineToRelative(dx = 3.84f, dy = 9.6f)
                // A 1 1 0 0 0 19 28
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 28.0f,
                )
                // h 0.02
                horizontalLineToRelative(dx = 0.02f)
                // a 1 1 0 0 0 0.92 -0.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.92f,
                    dy1 = -0.66f,
                )
                // l 8 -22
                lineToRelative(dx = 8.0f, dy = -22.0f)
                // a 1 1 0 0 0 -1.28 -1.28
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.28f,
                    dy1 = -1.28f,
                )
                // l -22 8
                lineToRelative(dx = -22.0f, dy = 8.0f)
                // A 1 1 0 0 0 4 12.98
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 12.98f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _locationCurrent = it }
    }

@Suppress("ObjectPropertyName")
private var _locationCurrent: ImageVector? = null
