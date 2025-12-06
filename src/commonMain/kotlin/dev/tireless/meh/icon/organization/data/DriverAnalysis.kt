package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DriverAnalysis: ImageVector
    get() {
        val current = _driverAnalysis
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DriverAnalysis",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="22.0" cy="16.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
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
            // M30 15 h-2.09 A6 6 0 0 0 22 10 h-.02 a9.98 9.98 0 0 0 -17.93 5 H2 v2 h2.05 a9.98 9.98 0 0 0 17.93 5 H22 a6 6 0 0 0 5.91 -5 H30Z M14 8 a8 8 0 0 1 5.74 2.45 A6 6 0 0 0 16.09 15 H6.07 A8 8 0 0 1 14 8 m0 16 a8 8 0 0 1 -7.93 -7 h10.02 a6 6 0 0 0 3.65 4.55 A8 8 0 0 1 14 24 m8 -4 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // h -2.09
                horizontalLineToRelative(dx = -2.09f)
                // A 6 6 0 0 0 22 10
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 10.0f,
                )
                // h -0.02
                horizontalLineToRelative(dx = -0.02f)
                // a 9.98 9.98 0 0 0 -17.93 5
                arcToRelative(
                    a = 9.98f,
                    b = 9.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -17.93f,
                    dy1 = 5.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.05
                horizontalLineToRelative(dx = 2.05f)
                // a 9.98 9.98 0 0 0 17.93 5
                arcToRelative(
                    a = 9.98f,
                    b = 9.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 17.93f,
                    dy1 = 5.0f,
                )
                // H 22
                horizontalLineTo(x = 22.0f)
                // a 6 6 0 0 0 5.91 -5
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.91f,
                    dy1 = -5.0f,
                )
                // H 30z
                horizontalLineTo(x = 30.0f)
                close()
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // a 8 8 0 0 1 5.74 2.45
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.74f,
                    dy1 = 2.45f,
                )
                // A 6 6 0 0 0 16.09 15
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.09f,
                    y1 = 15.0f,
                )
                // H 6.07
                horizontalLineTo(x = 6.07f)
                // A 8 8 0 0 1 14 8
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 8.0f,
                )
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // a 8 8 0 0 1 -7.93 -7
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.93f,
                    dy1 = -7.0f,
                )
                // h 10.02
                horizontalLineToRelative(dx = 10.02f)
                // a 6 6 0 0 0 3.65 4.55
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.65f,
                    dy1 = 4.55f,
                )
                // A 8 8 0 0 1 14 24
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 24.0f,
                )
                // m 8 -4
                moveToRelative(dx = 8.0f, dy = -4.0f)
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
        }.build().also { _driverAnalysis = it }
    }

@Suppress("ObjectPropertyName")
private var _driverAnalysis: ImageVector? = null
