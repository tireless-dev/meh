package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Camera: ImageVector
    get() {
        val current = _camera
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Camera",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 26 H3 a1 1 0 0 1 -1 -1 V8 a1 1 0 0 1 1 -1 h6.46 l1.71 -2.55 A1 1 0 0 1 12 4 h8 a1 1 0 0 1 .83 .45 L22.54 7 H29 a1 1 0 0 1 1 1 v17 a1 1 0 0 1 -1 1 M4 24 h24 V9 h-6 a1 1 0 0 1 -.83 -.45 L19.46 6 h-6.92 l-1.71 2.55 A1 1 0 0 1 10 9 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 26
                moveTo(x = 29.0f, y = 26.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 6.46
                horizontalLineToRelative(dx = 6.46f)
                // l 1.71 -2.55
                lineToRelative(dx = 1.71f, dy = -2.55f)
                // A 1 1 0 0 1 12 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 4.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 1 1 0 0 1 0.83 0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.83f,
                    dy1 = 0.45f,
                )
                // L 22.54 7
                lineTo(x = 22.54f, y = 7.0f)
                // H 29
                horizontalLineTo(x = 29.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 17
                verticalLineToRelative(dy = 17.0f)
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
                // M 4 24
                moveTo(x = 4.0f, y = 24.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 1 1 0 0 1 -0.83 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.83f,
                    dy1 = -0.45f,
                )
                // L 19.46 6
                lineTo(x = 19.46f, y = 6.0f)
                // h -6.92
                horizontalLineToRelative(dx = -6.92f)
                // l -1.71 2.55
                lineToRelative(dx = -1.71f, dy = 2.55f)
                // A 1 1 0 0 1 10 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 9.0f,
                )
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M16 22 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m0 -10 a4 4 0 1 0 4 4 4 4 0 0 0 -4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 6 6 0 1 1 6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = -6.0f,
                )
                // a 6 6 0 0 1 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // a 4 4 0 1 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
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
        }.build().also { _camera = it }
    }

@Suppress("ObjectPropertyName")
private var _camera: ImageVector? = null
