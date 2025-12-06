package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NullSign: ImageVector
    get() {
        val current = _nullSign
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NullSign",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 3.41 28.59 2 l-3.44 3.43 A14 14 0 0 0 16 2 C8.28 2 2 8.28 2 16 c0 3.5 1.3 6.7 3.43 9.15 L2 28.6 3.41 30 l3.44 -3.43 A14 14 0 0 0 16 30 c7.72 0 14 -6.28 14 -14 0 -3.5 -1.3 -6.7 -3.43 -9.15z M4 16 a12.01 12.01 0 0 1 19.74 -9.15 l-16.9 16.9 A12 12 0 0 1 4 16 m24 0 a12.01 12.01 0 0 1 -19.74 9.15 l16.9 -16.9 C26.92 10.36 28 13.06 28 16
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 3.41
                moveTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // l -3.44 3.43
                lineToRelative(dx = -3.44f, dy = 3.43f)
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // C 8.28 2 2 8.28 2 16
                curveTo(
                    x1 = 8.28f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 8.28f,
                    x3 = 2.0f,
                    y3 = 16.0f,
                )
                // c 0 3.5 1.3 6.7 3.43 9.15
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.5f,
                    dx2 = 1.3f,
                    dy2 = 6.7f,
                    dx3 = 3.43f,
                    dy3 = 9.15f,
                )
                // L 2 28.6
                lineTo(x = 2.0f, y = 28.6f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 3.44 -3.43
                lineToRelative(dx = 3.44f, dy = -3.43f)
                // A 14 14 0 0 0 16 30
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
                // c 7.72 0 14 -6.28 14 -14
                curveToRelative(
                    dx1 = 7.72f,
                    dy1 = 0.0f,
                    dx2 = 14.0f,
                    dy2 = -6.28f,
                    dx3 = 14.0f,
                    dy3 = -14.0f,
                )
                // c 0 -3.5 -1.3 -6.7 -3.43 -9.15z
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.5f,
                    dx2 = -1.3f,
                    dy2 = -6.7f,
                    dx3 = -3.43f,
                    dy3 = -9.15f,
                )
                close()
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // a 12.01 12.01 0 0 1 19.74 -9.15
                arcToRelative(
                    a = 12.01f,
                    b = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 19.74f,
                    dy1 = -9.15f,
                )
                // l -16.9 16.9
                lineToRelative(dx = -16.9f, dy = 16.9f)
                // A 12 12 0 0 1 4 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // a 12.01 12.01 0 0 1 -19.74 9.15
                arcToRelative(
                    a = 12.01f,
                    b = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -19.74f,
                    dy1 = 9.15f,
                )
                // l 16.9 -16.9
                lineToRelative(dx = 16.9f, dy = -16.9f)
                // C 26.92 10.36 28 13.06 28 16
                curveTo(
                    x1 = 26.92f,
                    y1 = 10.36f,
                    x2 = 28.0f,
                    y2 = 13.06f,
                    x3 = 28.0f,
                    y3 = 16.0f,
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
        }.build().also { _nullSign = it }
    }

@Suppress("ObjectPropertyName")
private var _nullSign: ImageVector? = null
