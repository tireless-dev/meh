package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthSoutheastAsia: ImageVector
    get() {
        val current = _earthSoutheastAsia
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EarthSoutheastAsia",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
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
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-.6 2.03 2.5 5.02 L16.32 13 h-6.05 l-1.4 4.39 2.84 2.85 -1 1.51 L6.29 19 h-1.9 a11.94 11.94 0 0 1 11 -14.97 M5.1 21 h.61 l3.94 2.45 a2 2 0 0 0 2.72 -.59 l1 -1.51 a2 2 0 0 0 -.24 -2.53 l-2 -1.98 .6 -1.84 h4.6 a2 2 0 0 0 1.85 -1.26 l1.58 -3.95 a2 2 0 0 0 -.07 -1.64 l-2 -4.02 A11.96 11.96 0 0 1 26.88 21 H23 a2 2 0 0 0 -2 2 v3.9 A11.95 11.95 0 0 1 5.1 21 M23 25.73 V23 h2.73 A12 12 0 0 1 23 25.73
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
                // m -0.6 2.03
                moveToRelative(dx = -0.6f, dy = 2.03f)
                // l 2.5 5.02
                lineToRelative(dx = 2.5f, dy = 5.02f)
                // L 16.32 13
                lineTo(x = 16.32f, y = 13.0f)
                // h -6.05
                horizontalLineToRelative(dx = -6.05f)
                // l -1.4 4.39
                lineToRelative(dx = -1.4f, dy = 4.39f)
                // l 2.84 2.85
                lineToRelative(dx = 2.84f, dy = 2.85f)
                // l -1 1.51
                lineToRelative(dx = -1.0f, dy = 1.51f)
                // L 6.29 19
                lineTo(x = 6.29f, y = 19.0f)
                // h -1.9
                horizontalLineToRelative(dx = -1.9f)
                // a 11.94 11.94 0 0 1 11 -14.97
                arcToRelative(
                    a = 11.94f,
                    b = 11.94f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 11.0f,
                    dy1 = -14.97f,
                )
                // M 5.1 21
                moveTo(x = 5.1f, y = 21.0f)
                // h 0.61
                horizontalLineToRelative(dx = 0.61f)
                // l 3.94 2.45
                lineToRelative(dx = 3.94f, dy = 2.45f)
                // a 2 2 0 0 0 2.72 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.72f,
                    dy1 = -0.59f,
                )
                // l 1 -1.51
                lineToRelative(dx = 1.0f, dy = -1.51f)
                // a 2 2 0 0 0 -0.24 -2.53
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.24f,
                    dy1 = -2.53f,
                )
                // l -2 -1.98
                lineToRelative(dx = -2.0f, dy = -1.98f)
                // l 0.6 -1.84
                lineToRelative(dx = 0.6f, dy = -1.84f)
                // h 4.6
                horizontalLineToRelative(dx = 4.6f)
                // a 2 2 0 0 0 1.85 -1.26
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.85f,
                    dy1 = -1.26f,
                )
                // l 1.58 -3.95
                lineToRelative(dx = 1.58f, dy = -3.95f)
                // a 2 2 0 0 0 -0.07 -1.64
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.07f,
                    dy1 = -1.64f,
                )
                // l -2 -4.02
                lineToRelative(dx = -2.0f, dy = -4.02f)
                // A 11.96 11.96 0 0 1 26.88 21
                arcTo(
                    horizontalEllipseRadius = 11.96f,
                    verticalEllipseRadius = 11.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.88f,
                    y1 = 21.0f,
                )
                // H 23
                horizontalLineTo(x = 23.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 3.9
                verticalLineToRelative(dy = 3.9f)
                // A 11.95 11.95 0 0 1 5.1 21
                arcTo(
                    horizontalEllipseRadius = 11.95f,
                    verticalEllipseRadius = 11.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.1f,
                    y1 = 21.0f,
                )
                // M 23 25.73
                moveTo(x = 23.0f, y = 25.73f)
                // V 23
                verticalLineTo(y = 23.0f)
                // h 2.73
                horizontalLineToRelative(dx = 2.73f)
                // A 12 12 0 0 1 23 25.73
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 25.73f,
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
        }.build().also { _earthSoutheastAsia = it }
    }

@Suppress("ObjectPropertyName")
private var _earthSoutheastAsia: ImageVector? = null
