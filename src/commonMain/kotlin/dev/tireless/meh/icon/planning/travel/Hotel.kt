package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hotel: ImageVector
    get() {
        val current = _hotel
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Hotel",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M9.5 15 A1.5 1.5 0 1 1 8 16.5 1.5 1.5 0 0 1 9.5 15 m0 -2 a3.5 3.5 0 1 0 3.5 3.5 A3.5 3.5 0 0 0 9.5 13
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9.5 15
                moveTo(x = 9.5f, y = 15.0f)
                // A 1.5 1.5 0 1 1 8 16.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 16.5f,
                )
                // A 1.5 1.5 0 0 1 9.5 15
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 15.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 3.5 3.5 0 1 0 3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.5f,
                    dy1 = 3.5f,
                )
                // A 3.5 3.5 0 0 0 9.5 13
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.5f,
                    y1 = 13.0f,
                )
            }
            // M25 14 h-8 a2 2 0 0 0 -2 2 v6 H4 V10.6 l12 -6.46 12.53 6.74 .94 -1.76 -13 -7 a1 1 0 0 0 -.94 0 l-13 7 A1 1 0 0 0 2 10 v20 h2 v-6 h24 v6 h2 V19 a5 5 0 0 0 -5 -5 m-8 8 v-6 h8 a3 3 0 0 1 3 3 v3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 14
                moveTo(x = 25.0f, y = 14.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 10.6
                verticalLineTo(y = 10.6f)
                // l 12 -6.46
                lineToRelative(dx = 12.0f, dy = -6.46f)
                // l 12.53 6.74
                lineToRelative(dx = 12.53f, dy = 6.74f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // a 1 1 0 0 0 -0.94 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.94f,
                    dy1 = 0.0f,
                )
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 0 2 10
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 10.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 19
                verticalLineTo(y = 19.0f)
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
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
        }.build().also { _hotel = it }
    }

@Suppress("ObjectPropertyName")
private var _hotel: ImageVector? = null
