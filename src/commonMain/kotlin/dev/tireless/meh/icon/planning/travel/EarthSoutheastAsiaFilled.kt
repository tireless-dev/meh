package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthSoutheastAsiaFilled: ImageVector
    get() {
        val current = _earthSoutheastAsiaFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EarthSoutheastAsiaFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="17.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="17.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 18
                moveTo(x = 17.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="3" height="2" x="14.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 24
                moveTo(x = 14.0f, y = 24.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M4.7 20 H6 l4.18 2.6 a1 1 0 0 0 1.36 -.3 l1 -1.5 a1 1 0 0 0 -.12 -1.27 L10 17.11 11 14 h5.32 a1 1 0 0 0 .93 -.63 l1.58 -3.95 A1 1 0 0 0 18.8 8.6 L16.5 4.03 A11.97 11.97 0 0 1 26.38 22 H23 a1 1 0 0 0 -1 1 v3.38 A11.96 11.96 0 0 1 4.7 20
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
                // M 4.7 20
                moveTo(x = 4.7f, y = 20.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // l 4.18 2.6
                lineToRelative(dx = 4.18f, dy = 2.6f)
                // a 1 1 0 0 0 1.36 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.36f,
                    dy1 = -0.3f,
                )
                // l 1 -1.5
                lineToRelative(dx = 1.0f, dy = -1.5f)
                // a 1 1 0 0 0 -0.12 -1.27
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.12f,
                    dy1 = -1.27f,
                )
                // L 10 17.11
                lineTo(x = 10.0f, y = 17.11f)
                // L 11 14
                lineTo(x = 11.0f, y = 14.0f)
                // h 5.32
                horizontalLineToRelative(dx = 5.32f)
                // a 1 1 0 0 0 0.93 -0.63
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.93f,
                    dy1 = -0.63f,
                )
                // l 1.58 -3.95
                lineToRelative(dx = 1.58f, dy = -3.95f)
                // A 1 1 0 0 0 18.8 8.6
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.8f,
                    y1 = 8.6f,
                )
                // L 16.5 4.03
                lineTo(x = 16.5f, y = 4.03f)
                // A 11.97 11.97 0 0 1 26.38 22
                arcTo(
                    horizontalEllipseRadius = 11.97f,
                    verticalEllipseRadius = 11.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.38f,
                    y1 = 22.0f,
                )
                // H 23
                horizontalLineTo(x = 23.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3.38
                verticalLineToRelative(dy = 3.38f)
                // A 11.96 11.96 0 0 1 4.7 20
                arcTo(
                    horizontalEllipseRadius = 11.96f,
                    verticalEllipseRadius = 11.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.7f,
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
        }.build().also { _earthSoutheastAsiaFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _earthSoutheastAsiaFilled: ImageVector? = null
