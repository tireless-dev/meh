package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServiceLevels: ImageVector
    get() {
        val current = _serviceLevels
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ServiceLevels",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="7.0" cy="19.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="16.0" cy="11.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 11
                moveTo(x = 16.0f, y = 11.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="25.0" cy="19.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 19
                moveTo(x = 25.0f, y = 19.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="10.0" cy="14.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M30 20 h-2 a12 12 0 0 0 -.58 -3.7 l1.9 -.6 A14 14 0 0 1 30 20 M29.85 8.98 l-2.44 2.43 A2 2 0 0 1 24 10 a2 2 0 0 1 .59 -1.41 l2.43 -2.44 A3.93 3.93 0 0 0 22 10 a4 4 0 0 0 .57 2.02 l-4.55 4.55 A4 4 0 0 0 16 16 a4 4 0 1 0 4 4 4 4 0 0 0 -.57 -2.02 l4.55 -4.55 A4 4 0 0 0 26 14 a4 4 0 0 0 3.85 -5.02 M16 22 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 M4 20 H2 A14.02 14.02 0 0 1 20.3 6.68 l-.6 1.9 A12 12 0 0 0 4 20
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 20
                moveTo(x = 30.0f, y = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 12 12 0 0 0 -0.58 -3.7
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.58f,
                    dy1 = -3.7f,
                )
                // l 1.9 -0.6
                lineToRelative(dx = 1.9f, dy = -0.6f)
                // A 14 14 0 0 1 30 20
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 30.0f,
                    y1 = 20.0f,
                )
                // M 29.85 8.98
                moveTo(x = 29.85f, y = 8.98f)
                // l -2.44 2.43
                lineToRelative(dx = -2.44f, dy = 2.43f)
                // A 2 2 0 0 1 24 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 10.0f,
                )
                // a 2 2 0 0 1 0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.41f,
                )
                // l 2.43 -2.44
                lineToRelative(dx = 2.43f, dy = -2.44f)
                // A 3.93 3.93 0 0 0 22 10
                arcTo(
                    horizontalEllipseRadius = 3.93f,
                    verticalEllipseRadius = 3.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 10.0f,
                )
                // a 4 4 0 0 0 0.57 2.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.57f,
                    dy1 = 2.02f,
                )
                // l -4.55 4.55
                lineToRelative(dx = -4.55f, dy = 4.55f)
                // A 4 4 0 0 0 16 16
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 16.0f,
                )
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
                // a 4 4 0 0 0 -0.57 -2.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.57f,
                    dy1 = -2.02f,
                )
                // l 4.55 -4.55
                lineToRelative(dx = 4.55f, dy = -4.55f)
                // A 4 4 0 0 0 26 14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 14.0f,
                )
                // a 4 4 0 0 0 3.85 -5.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.85f,
                    dy1 = -5.02f,
                )
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 2 2 0 1 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // A 14.02 14.02 0 0 1 20.3 6.68
                arcTo(
                    horizontalEllipseRadius = 14.02f,
                    verticalEllipseRadius = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.3f,
                    y1 = 6.68f,
                )
                // l -0.6 1.9
                lineToRelative(dx = -0.6f, dy = 1.9f)
                // A 12 12 0 0 0 4 20
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 20.0f,
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
        }.build().also { _serviceLevels = it }
    }

@Suppress("ObjectPropertyName")
private var _serviceLevels: ImageVector? = null
