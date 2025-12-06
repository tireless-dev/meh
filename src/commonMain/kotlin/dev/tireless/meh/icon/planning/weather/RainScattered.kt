package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RainScattered: ImageVector
    get() {
        val current = _rainScattered
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RainScattered",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M8.5 32 a1 1 0 0 1 -.44 -.1 1 1 0 0 1 -.45 -1.35 l1.5 -3 a1 1 0 0 1 1.79 .9 l-1.5 3 A1 1 0 0 1 8.5 32
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8.5 32
                moveTo(x = 8.5f, y = 32.0f)
                // a 1 1 0 0 1 -0.44 -0.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.44f,
                    dy1 = -0.1f,
                )
                // a 1 1 0 0 1 -0.45 -1.35
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.45f,
                    dy1 = -1.35f,
                )
                // l 1.5 -3
                lineToRelative(dx = 1.5f, dy = -3.0f)
                // a 1 1 0 0 1 1.79 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.79f,
                    dy1 = 0.9f,
                )
                // l -1.5 3
                lineToRelative(dx = -1.5f, dy = 3.0f)
                // A 1 1 0 0 1 8.5 32
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.5f,
                    y1 = 32.0f,
                )
            }
            // <rect width="2" height="3" x="27.232" y="15.733" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.464172 16.879757
                moveTo(x = 26.464172f, y = 16.879757f)
                // l 1.4139667 -1.4144604
                lineToRelative(dx = 1.4139667f, dy = -1.4144604f)
                // l 2.1216908 2.12095
                lineToRelative(dx = 2.1216908f, dy = 2.12095f)
                // l -1.4139667 1.4144604z
                lineToRelative(dx = -1.4139667f, dy = 1.4144604f)
                close()
            }
            // <rect width="3" height="2" x="29.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 10
                moveTo(x = 29.0f, y = 10.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="2" x="26.732" y="3.768" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.464233 5.1215553
                moveTo(x = 26.464233f, y = 5.1215553f)
                // l 2.1213202 -2.1213202
                lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -2.1213202 2.1213202z
                lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
                close()
            }
            // <rect width="2" height="3" x="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 0
                moveTo(x = 20.0f, y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="3" x="12.768" y="3.268" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.000233 4.4144464
                moveTo(x = 12.000233f, y = 4.4144464f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 2.1213202 2.1213202
                lineToRelative(dx = 2.1213202f, dy = 2.1213202f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
                close()
            }
            // M27 11 a6 6 0 0 0 -11.37 -2.67 A7 7 0 0 0 13.5 8 a7.55 7.55 0 0 0 -7.15 5.24 A6 6 0 0 0 8 25 h7.38 l-1.27 2.55 a1 1 0 1 0 1.78 .9 L17.62 25 H19 a6 6 0 0 0 5.22 -8.95 A6 6 0 0 0 27 11 m-8 12 H8 a4 4 0 0 1 -.67 -7.93 l.66 -.11 .15 -.66 a5.5 5.5 0 0 1 10.73 0 L19 14.96 l.66 .11 A4 4 0 0 1 19 23 m3.93 -8.51 a6 6 0 0 0 -2.28 -1.25 7.5 7.5 0 0 0 -3.19 -4.06 3.99 3.99 0 1 1 5.47 5.3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // a 6 6 0 0 0 -11.37 -2.67
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.37f,
                    dy1 = -2.67f,
                )
                // A 7 7 0 0 0 13.5 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.5f,
                    y1 = 8.0f,
                )
                // a 7.55 7.55 0 0 0 -7.15 5.24
                arcToRelative(
                    a = 7.55f,
                    b = 7.55f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.15f,
                    dy1 = 5.24f,
                )
                // A 6 6 0 0 0 8 25
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 25.0f,
                )
                // h 7.38
                horizontalLineToRelative(dx = 7.38f)
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
                // L 17.62 25
                lineTo(x = 17.62f, y = 25.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 6 6 0 0 0 5.22 -8.95
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.22f,
                    dy1 = -8.95f,
                )
                // A 6 6 0 0 0 27 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 11.0f,
                )
                // m -8 12
                moveToRelative(dx = -8.0f, dy = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 4 4 0 0 1 -0.67 -7.93
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.67f,
                    dy1 = -7.93f,
                )
                // l 0.66 -0.11
                lineToRelative(dx = 0.66f, dy = -0.11f)
                // l 0.15 -0.66
                lineToRelative(dx = 0.15f, dy = -0.66f)
                // a 5.5 5.5 0 0 1 10.73 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.73f,
                    dy1 = 0.0f,
                )
                // L 19 14.96
                lineTo(x = 19.0f, y = 14.96f)
                // l 0.66 0.11
                lineToRelative(dx = 0.66f, dy = 0.11f)
                // A 4 4 0 0 1 19 23
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 23.0f,
                )
                // m 3.93 -8.51
                moveToRelative(dx = 3.93f, dy = -8.51f)
                // a 6 6 0 0 0 -2.28 -1.25
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.28f,
                    dy1 = -1.25f,
                )
                // a 7.5 7.5 0 0 0 -3.19 -4.06
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.19f,
                    dy1 = -4.06f,
                )
                // a 3.99 3.99 0 1 1 5.47 5.3
                arcToRelative(
                    a = 3.99f,
                    b = 3.99f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.47f,
                    dy1 = 5.3f,
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
        }.build().also { _rainScattered = it }
    }

@Suppress("ObjectPropertyName")
private var _rainScattered: ImageVector? = null
