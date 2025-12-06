package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningHex: ImageVector
    get() {
        val current = _warningHex
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WarningHex",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 21 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 21
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 21
                moveTo(x = 16.0f, y = 21.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // A 1.5 1.5 0 0 0 16 21
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 21.0f,
                )
            }
            // <rect width="2" height="10" x="15.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M23 29 H9 a1 1 0 0 1 -.86 -.5 l-7 -12 a1 1 0 0 1 0 -1 l7 -12 A1 1 0 0 1 9 3 h14 a1 1 0 0 1 .86 .5 l7 12 a1 1 0 0 1 0 1 l-7 12 A1 1 0 0 1 23 29 M9.57 27 h12.86 l6.41 -11 -6.41 -11 H9.57 L3.16 16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 29
                moveTo(x = 23.0f, y = 29.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 1 -0.86 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.86f,
                    dy1 = -0.5f,
                )
                // l -7 -12
                lineToRelative(dx = -7.0f, dy = -12.0f)
                // a 1 1 0 0 1 0 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
                // l 7 -12
                lineToRelative(dx = 7.0f, dy = -12.0f)
                // A 1 1 0 0 1 9 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 3.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 1 0.86 0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.86f,
                    dy1 = 0.5f,
                )
                // l 7 12
                lineToRelative(dx = 7.0f, dy = 12.0f)
                // a 1 1 0 0 1 0 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                )
                // l -7 12
                lineToRelative(dx = -7.0f, dy = 12.0f)
                // A 1 1 0 0 1 23 29
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 29.0f,
                )
                // M 9.57 27
                moveTo(x = 9.57f, y = 27.0f)
                // h 12.86
                horizontalLineToRelative(dx = 12.86f)
                // l 6.41 -11
                lineToRelative(dx = 6.41f, dy = -11.0f)
                // l -6.41 -11
                lineToRelative(dx = -6.41f, dy = -11.0f)
                // H 9.57
                horizontalLineTo(x = 9.57f)
                // L 3.16 16z
                lineTo(x = 3.16f, y = 16.0f)
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
        }.build().also { _warningHex = it }
    }

@Suppress("ObjectPropertyName")
private var _warningHex: ImageVector? = null
