package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SnowDensity: ImageVector
    get() {
        val current = _snowDensity
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SnowDensity",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 28 a9 9 0 0 1 -9 -9 10 10 0 0 1 1.5 -4.96 l6.65 -10.6 a1.04 1.04 0 0 1 1.7 0 l6.63 10.55 A10 10 0 0 1 25 19 a9 9 0 0 1 -9 9 m0 -22.15 -5.78 9.2 A8 8 0 0 0 9 19 a7 7 0 0 0 14 0 8 8 0 0 0 -1.25 -4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // a 9 9 0 0 1 -9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = -9.0f,
                )
                // a 10 10 0 0 1 1.5 -4.96
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -4.96f,
                )
                // l 6.65 -10.6
                lineToRelative(dx = 6.65f, dy = -10.6f)
                // a 1.04 1.04 0 0 1 1.7 0
                arcToRelative(
                    a = 1.04f,
                    b = 1.04f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 6.63 10.55
                lineToRelative(dx = 6.63f, dy = 10.55f)
                // A 10 10 0 0 1 25 19
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 19.0f,
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
                // m 0 -22.15
                moveToRelative(dx = 0.0f, dy = -22.15f)
                // l -5.78 9.2
                lineToRelative(dx = -5.78f, dy = 9.2f)
                // A 8 8 0 0 0 9 19
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 19.0f,
                )
                // a 7 7 0 0 0 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 0 0 -1.25 -4z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.25f,
                    dy1 = -4.0f,
                )
                close()
            }
            // <polygon points="20.6 16.8 19.4 15.2 17.0 17.0 17.0 14.0 15.0 14.0 15.0 17.0 12.6 15.2 11.4 16.8 14.333 19.0 11.4 21.2 12.6 22.8 15.0 21.0 15.0 24.0 17.0 24.0 17.0 21.0 19.4 22.8 20.6 21.2 17.667 19.0 20.6 16.8" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.6 16.8
                moveTo(x = 20.6f, y = 16.8f)
                // L 19.4 15.2
                lineTo(x = 19.4f, y = 15.2f)
                // L 17 17
                lineTo(x = 17.0f, y = 17.0f)
                // L 17 14
                lineTo(x = 17.0f, y = 14.0f)
                // L 15 14
                lineTo(x = 15.0f, y = 14.0f)
                // L 15 17
                lineTo(x = 15.0f, y = 17.0f)
                // L 12.6 15.2
                lineTo(x = 12.6f, y = 15.2f)
                // L 11.4 16.8
                lineTo(x = 11.4f, y = 16.8f)
                // L 14.333 19
                lineTo(x = 14.333f, y = 19.0f)
                // L 11.4 21.2
                lineTo(x = 11.4f, y = 21.2f)
                // L 12.6 22.8
                lineTo(x = 12.6f, y = 22.8f)
                // L 15 21
                lineTo(x = 15.0f, y = 21.0f)
                // L 15 24
                lineTo(x = 15.0f, y = 24.0f)
                // L 17 24
                lineTo(x = 17.0f, y = 24.0f)
                // L 17 21
                lineTo(x = 17.0f, y = 21.0f)
                // L 19.4 22.8
                lineTo(x = 19.4f, y = 22.8f)
                // L 20.6 21.2
                lineTo(x = 20.6f, y = 21.2f)
                // L 17.667 19
                lineTo(x = 17.667f, y = 19.0f)
                // L 20.6 16.8z
                lineTo(x = 20.6f, y = 16.8f)
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
        }.build().also { _snowDensity = it }
    }

@Suppress("ObjectPropertyName")
private var _snowDensity: ImageVector? = null
