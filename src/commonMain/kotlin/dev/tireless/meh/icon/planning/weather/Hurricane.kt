package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hurricane: ImageVector
    get() {
        val current = _hurricane
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Hurricane",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22.65 4.18 20.48 6.7 l-1.4 1.62 1.7 1.29 A8 8 0 0 1 24 16 v.1 c.02 .43 .24 10.11 -14.65 11.72 l2.18 -2.52 1.4 -1.62 -1.72 -1.28 a8 8 0 0 1 -3.2 -6.4 v-.1 C7.97 15.47 7.75 5.8 22.64 4.18 M25 2 h-.05 C5.25 2.91 6 16 6 16 a10 10 0 0 0 4.01 8 l-3.77 4.36 A1 1 0 0 0 7 30 h.05 C26.75 29.09 26 16 26 16 a10 10 0 0 0 -4.01 -8 l3.77 -4.36 A1 1 0 0 0 25 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.65 4.18
                moveTo(x = 22.65f, y = 4.18f)
                // L 20.48 6.7
                lineTo(x = 20.48f, y = 6.7f)
                // l -1.4 1.62
                lineToRelative(dx = -1.4f, dy = 1.62f)
                // l 1.7 1.29
                lineToRelative(dx = 1.7f, dy = 1.29f)
                // A 8 8 0 0 1 24 16
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 16.0f,
                )
                // v 0.1
                verticalLineToRelative(dy = 0.1f)
                // c 0.02 0.43 0.24 10.11 -14.65 11.72
                curveToRelative(
                    dx1 = 0.02f,
                    dy1 = 0.43f,
                    dx2 = 0.24f,
                    dy2 = 10.11f,
                    dx3 = -14.65f,
                    dy3 = 11.72f,
                )
                // l 2.18 -2.52
                lineToRelative(dx = 2.18f, dy = -2.52f)
                // l 1.4 -1.62
                lineToRelative(dx = 1.4f, dy = -1.62f)
                // l -1.72 -1.28
                lineToRelative(dx = -1.72f, dy = -1.28f)
                // a 8 8 0 0 1 -3.2 -6.4
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.2f,
                    dy1 = -6.4f,
                )
                // v -0.1
                verticalLineToRelative(dy = -0.1f)
                // C 7.97 15.47 7.75 5.8 22.64 4.18
                curveTo(
                    x1 = 7.97f,
                    y1 = 15.47f,
                    x2 = 7.75f,
                    y2 = 5.8f,
                    x3 = 22.64f,
                    y3 = 4.18f,
                )
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // h -0.05
                horizontalLineToRelative(dx = -0.05f)
                // C 5.25 2.91 6 16 6 16
                curveTo(
                    x1 = 5.25f,
                    y1 = 2.91f,
                    x2 = 6.0f,
                    y2 = 16.0f,
                    x3 = 6.0f,
                    y3 = 16.0f,
                )
                // a 10 10 0 0 0 4.01 8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.01f,
                    dy1 = 8.0f,
                )
                // l -3.77 4.36
                lineToRelative(dx = -3.77f, dy = 4.36f)
                // A 1 1 0 0 0 7 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 30.0f,
                )
                // h 0.05
                horizontalLineToRelative(dx = 0.05f)
                // C 26.75 29.09 26 16 26 16
                curveTo(
                    x1 = 26.75f,
                    y1 = 29.09f,
                    x2 = 26.0f,
                    y2 = 16.0f,
                    x3 = 26.0f,
                    y3 = 16.0f,
                )
                // a 10 10 0 0 0 -4.01 -8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.01f,
                    dy1 = -8.0f,
                )
                // l 3.77 -4.36
                lineToRelative(dx = 3.77f, dy = -4.36f)
                // A 1 1 0 0 0 25 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 2.0f,
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
        }.build().also { _hurricane = it }
    }

@Suppress("ObjectPropertyName")
private var _hurricane: ImageVector? = null
