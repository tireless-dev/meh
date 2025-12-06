package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Meter: ImageVector
    get() {
        val current = _meter
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Meter",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 16 a10 10 0 0 0 -1.14 -4.62 l-1.5 1.5 A8 8 0 0 1 24 16Z m-2.59 -6 L22 8.59 l-4.71 4.71 A3 3 0 0 0 16 13 a3 3 0 1 0 3 3 3 3 0 0 0 -.3 -1.29Z M16 17 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m0 -9 a8 8 0 0 1 3.12 .64 l1.5 -1.5 A10 10 0 0 0 6 16 h2 a8 8 0 0 1 8 -8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 16
                moveTo(x = 26.0f, y = 16.0f)
                // a 10 10 0 0 0 -1.14 -4.62
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.14f,
                    dy1 = -4.62f,
                )
                // l -1.5 1.5
                lineToRelative(dx = -1.5f, dy = 1.5f)
                // A 8 8 0 0 1 24 16z
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 16.0f,
                )
                close()
                // m -2.59 -6
                moveToRelative(dx = -2.59f, dy = -6.0f)
                // L 22 8.59
                lineTo(x = 22.0f, y = 8.59f)
                // l -4.71 4.71
                lineToRelative(dx = -4.71f, dy = 4.71f)
                // A 3 3 0 0 0 16 13
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 13.0f,
                )
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 0 -0.3 -1.29z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -1.29f,
                )
                close()
                // M 16 17
                moveTo(x = 16.0f, y = 17.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // m 0 -9
                moveToRelative(dx = 0.0f, dy = -9.0f)
                // a 8 8 0 0 1 3.12 0.64
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.12f,
                    dy1 = 0.64f,
                )
                // l 1.5 -1.5
                lineToRelative(dx = 1.5f, dy = -1.5f)
                // A 10 10 0 0 0 6 16
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 16.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 8 8 0 0 1 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
            }
            // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 14 14 0 1 1 14 -14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = -14.0f,
                )
                // a 14 14 0 0 1 -14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 14.0f,
                )
                // m 0 -26
                moveToRelative(dx = 0.0f, dy = -26.0f)
                // a 12 12 0 1 0 12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
                // A 12 12 0 0 0 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
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
        }.build().also { _meter = it }
    }

@Suppress("ObjectPropertyName")
private var _meter: ImageVector? = null
