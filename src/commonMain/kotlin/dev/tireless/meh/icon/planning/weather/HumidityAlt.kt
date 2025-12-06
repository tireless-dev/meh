package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HumidityAlt: ImageVector
    get() {
        val current = _humidityAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.HumidityAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 12 a3.9 3.9 0 0 1 -4 -3.78 4 4 0 0 1 .65 -2.06 l2.52 -3.75 a1.04 1.04 0 0 1 1.66 0 l2.49 3.7 A4 4 0 0 1 30 8.22 3.9 3.9 0 0 1 26 12 m0 -7.24 -1.66 2.47 a2 2 0 0 0 -.34 1 2.01 2.01 0 0 0 4 0 2 2 0 0 0 -.37 -1.05Z M23.5 30 h-15 a6.5 6.5 0 0 1 -1.3 -12.86 9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 30 M16 12 a7 7 0 0 0 -6.94 6.15 l-.1 .8 -.82 .07 A4.5 4.5 0 0 0 8.5 28 h15 a4.5 4.5 0 0 0 .36 -8.98 l-.82 -.06 -.1 -.81 A7 7 0 0 0 16 12
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 12
                moveTo(x = 26.0f, y = 12.0f)
                // a 3.9 3.9 0 0 1 -4 -3.78
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -3.78f,
                )
                // a 4 4 0 0 1 0.65 -2.06
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = -2.06f,
                )
                // l 2.52 -3.75
                lineToRelative(dx = 2.52f, dy = -3.75f)
                // a 1.04 1.04 0 0 1 1.66 0
                arcToRelative(
                    a = 1.04f,
                    b = 1.04f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.66f,
                    dy1 = 0.0f,
                )
                // l 2.49 3.7
                lineToRelative(dx = 2.49f, dy = 3.7f)
                // A 4 4 0 0 1 30 8.22
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 30.0f,
                    y1 = 8.22f,
                )
                // A 3.9 3.9 0 0 1 26 12
                arcTo(
                    horizontalEllipseRadius = 3.9f,
                    verticalEllipseRadius = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.0f,
                    y1 = 12.0f,
                )
                // m 0 -7.24
                moveToRelative(dx = 0.0f, dy = -7.24f)
                // l -1.66 2.47
                lineToRelative(dx = -1.66f, dy = 2.47f)
                // a 2 2 0 0 0 -0.34 1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.34f,
                    dy1 = 1.0f,
                )
                // a 2.01 2.01 0 0 0 4 0
                arcToRelative(
                    a = 2.01f,
                    b = 2.01f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 -0.37 -1.05z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.37f,
                    dy1 = -1.05f,
                )
                close()
                // M 23.5 30
                moveTo(x = 23.5f, y = 30.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // a 6.5 6.5 0 0 1 -1.3 -12.86
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = -12.86f,
                )
                // a 9 9 0 0 1 17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 17.6f,
                    dy1 = 0.0f,
                )
                // A 6.5 6.5 0 0 1 23.5 30
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 30.0f,
                )
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // a 7 7 0 0 0 -6.94 6.15
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.94f,
                    dy1 = 6.15f,
                )
                // l -0.1 0.8
                lineToRelative(dx = -0.1f, dy = 0.8f)
                // l -0.82 0.07
                lineToRelative(dx = -0.82f, dy = 0.07f)
                // A 4.5 4.5 0 0 0 8.5 28
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.5f,
                    y1 = 28.0f,
                )
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // a 4.5 4.5 0 0 0 0.36 -8.98
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.36f,
                    dy1 = -8.98f,
                )
                // l -0.82 -0.06
                lineToRelative(dx = -0.82f, dy = -0.06f)
                // l -0.1 -0.81
                lineToRelative(dx = -0.1f, dy = -0.81f)
                // A 7 7 0 0 0 16 12
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 12.0f,
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
        }.build().also { _humidityAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _humidityAlt: ImageVector? = null
