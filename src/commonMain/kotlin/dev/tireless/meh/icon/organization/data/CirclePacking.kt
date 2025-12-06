package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CirclePacking: ImageVector
    get() {
        val current = _circlePacking
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CirclePacking",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m7.5 7 a3.5 3.5 0 1 1 -3.5 3.5 A3.5 3.5 0 0 1 23.5 9 m.43 -1.98 L23.5 7 a5.5 5.5 0 0 0 -4.13 1.88 A8 8 0 0 0 13.8 4.2 a11.9 11.9 0 0 1 10.13 2.81 M16 28 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m-4 -10 a6 6 0 1 1 6 -6 6 6 0 0 1 -6 6 m-8 -2 a12 12 0 0 1 .21 -2.2 8 8 0 0 0 7.35 6.18 6 6 0 0 0 -.9 6.75 A12 12 0 0 1 4 16 m17.33 10.73 a5.98 5.98 0 0 0 -4.18 -8.62 8 8 0 0 0 1.92 -2.36 5.5 5.5 0 0 0 8.91 -.07 L28 16 a12 12 0 0 1 -6.67 10.73
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
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
                // m 7.5 7
                moveToRelative(dx = 7.5f, dy = 7.0f)
                // a 3.5 3.5 0 1 1 -3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 3.5f,
                )
                // A 3.5 3.5 0 0 1 23.5 9
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 9.0f,
                )
                // m 0.43 -1.98
                moveToRelative(dx = 0.43f, dy = -1.98f)
                // L 23.5 7
                lineTo(x = 23.5f, y = 7.0f)
                // a 5.5 5.5 0 0 0 -4.13 1.88
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.13f,
                    dy1 = 1.88f,
                )
                // A 8 8 0 0 0 13.8 4.2
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.8f,
                    y1 = 4.2f,
                )
                // a 11.9 11.9 0 0 1 10.13 2.81
                arcToRelative(
                    a = 11.9f,
                    b = 11.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.13f,
                    dy1 = 2.81f,
                )
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
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
                // m -4 -10
                moveToRelative(dx = -4.0f, dy = -10.0f)
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
                // m -8 -2
                moveToRelative(dx = -8.0f, dy = -2.0f)
                // a 12 12 0 0 1 0.21 -2.2
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.21f,
                    dy1 = -2.2f,
                )
                // a 8 8 0 0 0 7.35 6.18
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.35f,
                    dy1 = 6.18f,
                )
                // a 6 6 0 0 0 -0.9 6.75
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 6.75f,
                )
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
                // m 17.33 10.73
                moveToRelative(dx = 17.33f, dy = 10.73f)
                // a 5.98 5.98 0 0 0 -4.18 -8.62
                arcToRelative(
                    a = 5.98f,
                    b = 5.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.18f,
                    dy1 = -8.62f,
                )
                // a 8 8 0 0 0 1.92 -2.36
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.92f,
                    dy1 = -2.36f,
                )
                // a 5.5 5.5 0 0 0 8.91 -0.07
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.91f,
                    dy1 = -0.07f,
                )
                // L 28 16
                lineTo(x = 28.0f, y = 16.0f)
                // a 12 12 0 0 1 -6.67 10.73
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.67f,
                    dy1 = 10.73f,
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
        }.build().also { _circlePacking = it }
    }

@Suppress("ObjectPropertyName")
private var _circlePacking: ImageVector? = null
