package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moon: ImageVector
    get() {
        val current = _moon
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Moon",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M13.5 5.41 a15.1 15.1 0 0 0 11.6 18.2 A11 11 0 0 1 17.12 27 H16.7 A11.1 11.1 0 0 1 13.5 5.4 M14.98 3 l-.17 .02 A13.1 13.1 0 0 0 16.63 29 h.5 a13 13 0 0 0 10.7 -5.56 1 1 0 0 0 -.79 -1.56 13.08 13.08 0 0 1 -11.15 -17.5 A1 1 0 0 0 14.98 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13.5 5.41
                moveTo(x = 13.5f, y = 5.41f)
                // a 15.1 15.1 0 0 0 11.6 18.2
                arcToRelative(
                    a = 15.1f,
                    b = 15.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 11.6f,
                    dy1 = 18.2f,
                )
                // A 11 11 0 0 1 17.12 27
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.12f,
                    y1 = 27.0f,
                )
                // H 16.7
                horizontalLineTo(x = 16.7f)
                // A 11.1 11.1 0 0 1 13.5 5.4
                arcTo(
                    horizontalEllipseRadius = 11.1f,
                    verticalEllipseRadius = 11.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.5f,
                    y1 = 5.4f,
                )
                // M 14.98 3
                moveTo(x = 14.98f, y = 3.0f)
                // l -0.17 0.02
                lineToRelative(dx = -0.17f, dy = 0.02f)
                // A 13.1 13.1 0 0 0 16.63 29
                arcTo(
                    horizontalEllipseRadius = 13.1f,
                    verticalEllipseRadius = 13.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.63f,
                    y1 = 29.0f,
                )
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // a 13 13 0 0 0 10.7 -5.56
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.7f,
                    dy1 = -5.56f,
                )
                // a 1 1 0 0 0 -0.79 -1.56
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.79f,
                    dy1 = -1.56f,
                )
                // a 13.08 13.08 0 0 1 -11.15 -17.5
                arcToRelative(
                    a = 13.08f,
                    b = 13.08f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -11.15f,
                    dy1 = -17.5f,
                )
                // A 1 1 0 0 0 14.98 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.98f,
                    y1 = 3.0f,
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
        }.build().also { _moon = it }
    }

@Suppress("ObjectPropertyName")
private var _moon: ImageVector? = null
