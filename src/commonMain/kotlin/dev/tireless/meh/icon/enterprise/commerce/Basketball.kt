package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Basketball: ImageVector
    get() {
        val current = _basketball
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Basketball",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m11.95 13 h-5.9 a14.4 14.4 0 0 1 2.73 -7.15 A12 12 0 0 1 27.95 15 M17 15 V4.05 a12 12 0 0 1 6.29 2.44 A16.3 16.3 0 0 0 20.04 15Z m-2 0 h-3.04 a16.3 16.3 0 0 0 -3.25 -8.51 A12 12 0 0 1 15 4.05Z m0 2 v10.95 a12 12 0 0 1 -6.29 -2.44 A16.3 16.3 0 0 0 11.96 17Z m2 0 h3.04 a16.3 16.3 0 0 0 3.25 8.51 A12 12 0 0 1 17 27.95Z M7.22 7.85 A14.4 14.4 0 0 1 9.96 15 h-5.9 a12 12 0 0 1 3.16 -7.15 M4.05 17 h5.9 a14.4 14.4 0 0 1 -2.73 7.15 A12 12 0 0 1 4.05 17 m20.73 7.15 A14.4 14.4 0 0 1 22.04 17 h5.9 a12 12 0 0 1 -3.16 7.15
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
                // m 11.95 13
                moveToRelative(dx = 11.95f, dy = 13.0f)
                // h -5.9
                horizontalLineToRelative(dx = -5.9f)
                // a 14.4 14.4 0 0 1 2.73 -7.15
                arcToRelative(
                    a = 14.4f,
                    b = 14.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.73f,
                    dy1 = -7.15f,
                )
                // A 12 12 0 0 1 27.95 15
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.95f,
                    y1 = 15.0f,
                )
                // M 17 15
                moveTo(x = 17.0f, y = 15.0f)
                // V 4.05
                verticalLineTo(y = 4.05f)
                // a 12 12 0 0 1 6.29 2.44
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.29f,
                    dy1 = 2.44f,
                )
                // A 16.3 16.3 0 0 0 20.04 15z
                arcTo(
                    horizontalEllipseRadius = 16.3f,
                    verticalEllipseRadius = 16.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.04f,
                    y1 = 15.0f,
                )
                close()
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // h -3.04
                horizontalLineToRelative(dx = -3.04f)
                // a 16.3 16.3 0 0 0 -3.25 -8.51
                arcToRelative(
                    a = 16.3f,
                    b = 16.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.25f,
                    dy1 = -8.51f,
                )
                // A 12 12 0 0 1 15 4.05z
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 4.05f,
                )
                close()
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // v 10.95
                verticalLineToRelative(dy = 10.95f)
                // a 12 12 0 0 1 -6.29 -2.44
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.29f,
                    dy1 = -2.44f,
                )
                // A 16.3 16.3 0 0 0 11.96 17z
                arcTo(
                    horizontalEllipseRadius = 16.3f,
                    verticalEllipseRadius = 16.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.96f,
                    y1 = 17.0f,
                )
                close()
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // h 3.04
                horizontalLineToRelative(dx = 3.04f)
                // a 16.3 16.3 0 0 0 3.25 8.51
                arcToRelative(
                    a = 16.3f,
                    b = 16.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.25f,
                    dy1 = 8.51f,
                )
                // A 12 12 0 0 1 17 27.95z
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 27.95f,
                )
                close()
                // M 7.22 7.85
                moveTo(x = 7.22f, y = 7.85f)
                // A 14.4 14.4 0 0 1 9.96 15
                arcTo(
                    horizontalEllipseRadius = 14.4f,
                    verticalEllipseRadius = 14.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.96f,
                    y1 = 15.0f,
                )
                // h -5.9
                horizontalLineToRelative(dx = -5.9f)
                // a 12 12 0 0 1 3.16 -7.15
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.16f,
                    dy1 = -7.15f,
                )
                // M 4.05 17
                moveTo(x = 4.05f, y = 17.0f)
                // h 5.9
                horizontalLineToRelative(dx = 5.9f)
                // a 14.4 14.4 0 0 1 -2.73 7.15
                arcToRelative(
                    a = 14.4f,
                    b = 14.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.73f,
                    dy1 = 7.15f,
                )
                // A 12 12 0 0 1 4.05 17
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.05f,
                    y1 = 17.0f,
                )
                // m 20.73 7.15
                moveToRelative(dx = 20.73f, dy = 7.15f)
                // A 14.4 14.4 0 0 1 22.04 17
                arcTo(
                    horizontalEllipseRadius = 14.4f,
                    verticalEllipseRadius = 14.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.04f,
                    y1 = 17.0f,
                )
                // h 5.9
                horizontalLineToRelative(dx = 5.9f)
                // a 12 12 0 0 1 -3.16 7.15
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.16f,
                    dy1 = 7.15f,
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
        }.build().also { _basketball = it }
    }

@Suppress("ObjectPropertyName")
private var _basketball: ImageVector? = null
