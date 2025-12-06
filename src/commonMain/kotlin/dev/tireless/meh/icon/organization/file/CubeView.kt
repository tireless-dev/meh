package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CubeView: ImageVector
    get() {
        val current = _cubeView
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CubeView",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="16.0" cy="16.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M23.78 15.48 A8.6 8.6 0 0 0 16 10 a8.6 8.6 0 0 0 -7.78 5.48 L8 16 l.22 .52 A8.6 8.6 0 0 0 16 22 a8.6 8.6 0 0 0 7.78 -5.48 L24 16Z M16 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.78 15.48
                moveTo(x = 23.78f, y = 15.48f)
                // A 8.6 8.6 0 0 0 16 10
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 10.0f,
                )
                // a 8.6 8.6 0 0 0 -7.78 5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.78f,
                    dy1 = 5.48f,
                )
                // L 8 16
                lineTo(x = 8.0f, y = 16.0f)
                // l 0.22 0.52
                lineToRelative(dx = 0.22f, dy = 0.52f)
                // A 8.6 8.6 0 0 0 16 22
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 22.0f,
                )
                // a 8.6 8.6 0 0 0 7.78 -5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.78f,
                    dy1 = -5.48f,
                )
                // L 24 16z
                lineTo(x = 24.0f, y = 16.0f)
                close()
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
            }
            // m28.5 8.14 -12 -7 a1 1 0 0 0 -1 0 l-12 7 A1 1 0 0 0 3 9 v14 a1 1 0 0 0 .5 .86 l12 7 a1 1 0 0 0 1 0 l12 -7 A1 1 0 0 0 29 23 V9 a1 1 0 0 0 -.5 -.86 M27 22.43 l-11 6.41 -11 -6.41 V9.57 l11 -6.41 11 6.41Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.5 8.14
                moveTo(x = 28.5f, y = 8.14f)
                // l -12 -7
                lineToRelative(dx = -12.0f, dy = -7.0f)
                // a 1 1 0 0 0 -1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                // l -12 7
                lineToRelative(dx = -12.0f, dy = 7.0f)
                // A 1 1 0 0 0 3 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 9.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 1 1 0 0 0 0.5 0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.86f,
                )
                // l 12 7
                lineToRelative(dx = 12.0f, dy = 7.0f)
                // a 1 1 0 0 0 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 12 -7
                lineToRelative(dx = 12.0f, dy = -7.0f)
                // A 1 1 0 0 0 29 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.0f,
                    y1 = 23.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 0 -0.5 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -0.86f,
                )
                // M 27 22.43
                moveTo(x = 27.0f, y = 22.43f)
                // l -11 6.41
                lineToRelative(dx = -11.0f, dy = 6.41f)
                // l -11 -6.41
                lineToRelative(dx = -11.0f, dy = -6.41f)
                // V 9.57
                verticalLineTo(y = 9.57f)
                // l 11 -6.41
                lineToRelative(dx = 11.0f, dy = -6.41f)
                // l 11 6.41z
                lineToRelative(dx = 11.0f, dy = 6.41f)
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
        }.build().also { _cubeView = it }
    }

@Suppress("ObjectPropertyName")
private var _cubeView: ImageVector? = null
