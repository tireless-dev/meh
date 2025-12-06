package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Layers: ImageVector
    get() {
        val current = _layers
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Layers",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 24 a1 1 0 0 1 -.47 -.12 l-13 -7 .94 -1.76 L16 21.86 l12.53 -6.74 .94 1.76 -13 7 A1 1 0 0 1 16 24
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 24
                moveTo(x = 16.0f, y = 24.0f)
                // a 1 1 0 0 1 -0.47 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.12f,
                )
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // L 16 21.86
                lineTo(x = 16.0f, y = 21.86f)
                // l 12.53 -6.74
                lineToRelative(dx = 12.53f, dy = -6.74f)
                // l 0.94 1.76
                lineToRelative(dx = 0.94f, dy = 1.76f)
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 1 16 24
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 24.0f,
                )
            }
            // M16 30 a1 1 0 0 1 -.47 -.12 l-13 -7 .94 -1.76 L16 27.86 l12.53 -6.74 .94 1.76 -13 7 A1 1 0 0 1 16 30 m0 -12 a1 1 0 0 1 -.47 -.12 l-13 -7 a1 1 0 0 1 0 -1.76 l13 -7 a1 1 0 0 1 .94 0 l13 7 a1 1 0 0 1 0 1.76 l-13 7 A1 1 0 0 1 16 18 M5.1 10 16 15.86 26.9 10 16 4.14Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.47 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.12f,
                )
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // L 16 27.86
                lineTo(x = 16.0f, y = 27.86f)
                // l 12.53 -6.74
                lineToRelative(dx = 12.53f, dy = -6.74f)
                // l 0.94 1.76
                lineToRelative(dx = 0.94f, dy = 1.76f)
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 1 16 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // a 1 1 0 0 1 -0.47 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.12f,
                )
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // a 1 1 0 0 1 0 -1.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.76f,
                )
                // l 13 -7
                lineToRelative(dx = 13.0f, dy = -7.0f)
                // a 1 1 0 0 1 0.94 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.94f,
                    dy1 = 0.0f,
                )
                // l 13 7
                lineToRelative(dx = 13.0f, dy = 7.0f)
                // a 1 1 0 0 1 0 1.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.76f,
                )
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 1 16 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 18.0f,
                )
                // M 5.1 10
                moveTo(x = 5.1f, y = 10.0f)
                // L 16 15.86
                lineTo(x = 16.0f, y = 15.86f)
                // L 26.9 10
                lineTo(x = 26.9f, y = 10.0f)
                // L 16 4.14z
                lineTo(x = 16.0f, y = 4.14f)
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
        }.build().also { _layers = it }
    }

@Suppress("ObjectPropertyName")
private var _layers: ImageVector? = null
