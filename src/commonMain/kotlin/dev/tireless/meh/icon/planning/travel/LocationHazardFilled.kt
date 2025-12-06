package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationHazardFilled: ImageVector
    get() {
        val current = _locationHazardFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LocationHazardFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 22 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 22 m-1.12 -6 h2.24 V7 h-2.25Z
            path {
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 1.5 1.5 0 1 1 1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -1.5f,
                )
                // A 1.5 1.5 0 0 1 16 22
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 22.0f,
                )
                // m -1.12 -6
                moveToRelative(dx = -1.12f, dy = -6.0f)
                // h 2.24
                horizontalLineToRelative(dx = 2.24f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h -2.25z
                horizontalLineToRelative(dx = -2.25f)
                close()
            }
            // M16 2 A11 11 0 0 0 5 13 a11 11 0 0 0 2.22 6.6 s.3 .4 .34 .45 L16 30 l8.44 -9.95 .34 -.45 A11 11 0 0 0 27 13 11 11 0 0 0 16 2 m-1.12 5 h2.24 v9 h-2.25Z M16 22 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 22
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // A 11 11 0 0 0 5 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 13.0f,
                )
                // a 11 11 0 0 0 2.22 6.6
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.22f,
                    dy1 = 6.6f,
                )
                // s 0.3 0.4 0.34 0.45
                reflectiveCurveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.4f,
                    dx2 = 0.34f,
                    dy2 = 0.45f,
                )
                // L 16 30
                lineTo(x = 16.0f, y = 30.0f)
                // l 8.44 -9.95
                lineToRelative(dx = 8.44f, dy = -9.95f)
                // l 0.34 -0.45
                lineToRelative(dx = 0.34f, dy = -0.45f)
                // A 11 11 0 0 0 27 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 13.0f,
                )
                // A 11 11 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m -1.12 5
                moveToRelative(dx = -1.12f, dy = 5.0f)
                // h 2.24
                horizontalLineToRelative(dx = 2.24f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2.25z
                horizontalLineToRelative(dx = -2.25f)
                close()
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 1.5 1.5 0 1 1 1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -1.5f,
                )
                // A 1.5 1.5 0 0 1 16 22
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 22.0f,
                )
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
        }.build().also { _locationHazardFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _locationHazardFilled: ImageVector? = null
