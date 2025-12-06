package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sleet: ImageVector
    get() {
        val current = _sleet
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Sleet",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="6.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 24
                moveTo(x = 6.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="8.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 24
                moveTo(x = 10.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="6.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 28
                moveTo(x = 6.0f, y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M21 30 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 21 30 m3.8 -20.86 a9 9 0 0 0 -17.6 0 A6.5 6.5 0 0 0 8.5 22 h8.88 l-1.27 2.55 a1 1 0 1 0 1.78 .9 L19.62 22 h3.88 a6.5 6.5 0 0 0 1.3 -12.86 M23.5 20 h-15 a4.5 4.5 0 0 1 -.36 -8.98 l.82 -.06 .1 -.82 a7 7 0 0 1 13.88 0 l.1 .82 .82 .06 A4.5 4.5 0 0 1 23.5 20
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 30
                moveTo(x = 21.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 2 -4
                lineToRelative(dx = 2.0f, dy = -4.0f)
                // a 1 1 0 1 1 1.8 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.9f,
                )
                // l -2 4
                lineToRelative(dx = -2.0f, dy = 4.0f)
                // A 1 1 0 0 1 21 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 30.0f,
                )
                // m 3.8 -20.86
                moveToRelative(dx = 3.8f, dy = -20.86f)
                // a 9 9 0 0 0 -17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -17.6f,
                    dy1 = 0.0f,
                )
                // A 6.5 6.5 0 0 0 8.5 22
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.5f,
                    y1 = 22.0f,
                )
                // h 8.88
                horizontalLineToRelative(dx = 8.88f)
                // l -1.27 2.55
                lineToRelative(dx = -1.27f, dy = 2.55f)
                // a 1 1 0 1 0 1.78 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.9f,
                )
                // L 19.62 22
                lineTo(x = 19.62f, y = 22.0f)
                // h 3.88
                horizontalLineToRelative(dx = 3.88f)
                // a 6.5 6.5 0 0 0 1.3 -12.86
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.3f,
                    dy1 = -12.86f,
                )
                // M 23.5 20
                moveTo(x = 23.5f, y = 20.0f)
                // h -15
                horizontalLineToRelative(dx = -15.0f)
                // a 4.5 4.5 0 0 1 -0.36 -8.98
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.36f,
                    dy1 = -8.98f,
                )
                // l 0.82 -0.06
                lineToRelative(dx = 0.82f, dy = -0.06f)
                // l 0.1 -0.82
                lineToRelative(dx = 0.1f, dy = -0.82f)
                // a 7 7 0 0 1 13.88 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.88f,
                    dy1 = 0.0f,
                )
                // l 0.1 0.82
                lineToRelative(dx = 0.1f, dy = 0.82f)
                // l 0.82 0.06
                lineToRelative(dx = 0.82f, dy = 0.06f)
                // A 4.5 4.5 0 0 1 23.5 20
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
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
        }.build().also { _sleet = it }
    }

@Suppress("ObjectPropertyName")
private var _sleet: ImageVector? = null
