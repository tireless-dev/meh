package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LicenseGlobal: ImageVector
    get() {
        val current = _licenseGlobal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LicenseGlobal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 14 a8 8 0 1 0 8 8 8 8 0 0 0 -8 -8 m5.91 7 h-1.95 a12 12 0 0 0 -1.22 -4.33 A6 6 0 0 1 27.9 21 m-7.85 0 A10 10 0 0 1 22 16.01 10 10 0 0 1 23.94 21Z m3.89 2 A10 10 0 0 1 22 27.99 10 10 0 0 1 20.06 23Z m-4.69 -6.33 A12 12 0 0 0 18.04 21 H16.1 a6 6 0 0 1 3.17 -4.33 M16.1 23 h1.95 a12 12 0 0 0 1.22 4.33 A6 6 0 0 1 16.1 23 m8.65 4.33 A12 12 0 0 0 25.96 23 h1.95 a6 6 0 0 1 -3.17 4.33
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 14
                moveTo(x = 22.0f, y = 14.0f)
                // a 8 8 0 1 0 8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 8.0f,
                )
                // a 8 8 0 0 0 -8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = -8.0f,
                )
                // m 5.91 7
                moveToRelative(dx = 5.91f, dy = 7.0f)
                // h -1.95
                horizontalLineToRelative(dx = -1.95f)
                // a 12 12 0 0 0 -1.22 -4.33
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.22f,
                    dy1 = -4.33f,
                )
                // A 6 6 0 0 1 27.9 21
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.9f,
                    y1 = 21.0f,
                )
                // m -7.85 0
                moveToRelative(dx = -7.85f, dy = 0.0f)
                // A 10 10 0 0 1 22 16.01
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 16.01f,
                )
                // A 10 10 0 0 1 23.94 21z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.94f,
                    y1 = 21.0f,
                )
                close()
                // m 3.89 2
                moveToRelative(dx = 3.89f, dy = 2.0f)
                // A 10 10 0 0 1 22 27.99
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 27.99f,
                )
                // A 10 10 0 0 1 20.06 23z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.06f,
                    y1 = 23.0f,
                )
                close()
                // m -4.69 -6.33
                moveToRelative(dx = -4.69f, dy = -6.33f)
                // A 12 12 0 0 0 18.04 21
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.04f,
                    y1 = 21.0f,
                )
                // H 16.1
                horizontalLineTo(x = 16.1f)
                // a 6 6 0 0 1 3.17 -4.33
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.17f,
                    dy1 = -4.33f,
                )
                // M 16.1 23
                moveTo(x = 16.1f, y = 23.0f)
                // h 1.95
                horizontalLineToRelative(dx = 1.95f)
                // a 12 12 0 0 0 1.22 4.33
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.22f,
                    dy1 = 4.33f,
                )
                // A 6 6 0 0 1 16.1 23
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.1f,
                    y1 = 23.0f,
                )
                // m 8.65 4.33
                moveToRelative(dx = 8.65f, dy = 4.33f)
                // A 12 12 0 0 0 25.96 23
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.96f,
                    y1 = 23.0f,
                )
                // h 1.95
                horizontalLineToRelative(dx = 1.95f)
                // a 6 6 0 0 1 -3.17 4.33
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.17f,
                    dy1 = 4.33f,
                )
            }
            // <rect width="6" height="2" x="6.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 14
                moveTo(x = 6.0f, y = 14.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="12" height="2" x="6.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="12" height="2" x="6.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="6" height="2" x="6.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 24
                moveTo(x = 6.0f, y = 24.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // M12 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v8 h-2 V4 H4 v24 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 30
                moveTo(x = 12.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _licenseGlobal = it }
    }

@Suppress("ObjectPropertyName")
private var _licenseGlobal: ImageVector? = null
