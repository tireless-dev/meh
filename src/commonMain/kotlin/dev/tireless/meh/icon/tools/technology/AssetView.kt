package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AssetView: ImageVector
    get() {
        val current = _assetView
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AssetView",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="22.0" cy="24.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 24
                moveTo(x = 22.0f, y = 24.0f)
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
            // M29.78 23.48 A8.6 8.6 0 0 0 22 18 a8.6 8.6 0 0 0 -7.78 5.48 L14 24 l.22 .52 A8.6 8.6 0 0 0 22 30 a8.6 8.6 0 0 0 7.78 -5.48 L30 24Z M22 28 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m-10 -4 a4 4 0 1 1 2.98 -6.67 l-1.49 1.34 A2 2 0 1 0 12 22Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.78 23.48
                moveTo(x = 29.78f, y = 23.48f)
                // A 8.6 8.6 0 0 0 22 18
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 18.0f,
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
                // L 14 24
                lineTo(x = 14.0f, y = 24.0f)
                // l 0.22 0.52
                lineToRelative(dx = 0.22f, dy = 0.52f)
                // A 8.6 8.6 0 0 0 22 30
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 30.0f,
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
                // L 30 24z
                lineTo(x = 30.0f, y = 24.0f)
                close()
                // M 22 28
                moveTo(x = 22.0f, y = 28.0f)
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
                // m -10 -4
                moveToRelative(dx = -10.0f, dy = -4.0f)
                // a 4 4 0 1 1 2.98 -6.67
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.98f,
                    dy1 = -6.67f,
                )
                // l -1.49 1.34
                lineToRelative(dx = -1.49f, dy = 1.34f)
                // A 2 2 0 1 0 12 22z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                close()
            }
            // M26 2 a4 4 0 0 0 -1.85 .48 L7.76 10.96 A9.99 9.99 0 0 0 12 30 v-2 a8 8 0 1 1 5.63 -13.68 l1.4 -1.4 a10 10 0 0 0 -5.39 -2.77 l8.38 -4.34 L22 6 a4 4 0 0 0 4 4 l.19 -.02 L23.07 16 h2.24 l4.25 -8.21 A3.97 3.97 0 0 0 26 2 m0 6 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 2
                moveTo(x = 26.0f, y = 2.0f)
                // a 4 4 0 0 0 -1.85 0.48
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.85f,
                    dy1 = 0.48f,
                )
                // L 7.76 10.96
                lineTo(x = 7.76f, y = 10.96f)
                // A 9.99 9.99 0 0 0 12 30
                arcTo(
                    horizontalEllipseRadius = 9.99f,
                    verticalEllipseRadius = 9.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 30.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 8 8 0 1 1 5.63 -13.68
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.63f,
                    dy1 = -13.68f,
                )
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // a 10 10 0 0 0 -5.39 -2.77
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.39f,
                    dy1 = -2.77f,
                )
                // l 8.38 -4.34
                lineToRelative(dx = 8.38f, dy = -4.34f)
                // L 22 6
                lineTo(x = 22.0f, y = 6.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // l 0.19 -0.02
                lineToRelative(dx = 0.19f, dy = -0.02f)
                // L 23.07 16
                lineTo(x = 23.07f, y = 16.0f)
                // h 2.24
                horizontalLineToRelative(dx = 2.24f)
                // l 4.25 -8.21
                lineToRelative(dx = 4.25f, dy = -8.21f)
                // A 3.97 3.97 0 0 0 26 2
                arcTo(
                    horizontalEllipseRadius = 3.97f,
                    verticalEllipseRadius = 3.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 2.0f,
                )
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
        }.build().also { _assetView = it }
    }

@Suppress("ObjectPropertyName")
private var _assetView: ImageVector? = null
