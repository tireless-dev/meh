package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WorshipJewish: ImageVector
    get() {
        val current = _worshipJewish
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WorshipJewish",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m24.3 16 3.58 -6.52 A1 1 0 0 0 27 8 h-7.1 l-3.02 -5.48 a1 1 0 0 0 -1.76 0 L12.11 8 H5 a1 1 0 0 0 -.88 1.48 L7.71 16 l-3.59 6.52 A1 1 0 0 0 5 24 h7.1 l3.02 5.48 a1 1 0 0 0 1.76 0 L19.89 24 H27 a1 1 0 0 0 .88 -1.48Z m-5.6 6 L16 26.92 13.3 22 H6.7 l3.3 -6 -3.3 -6 h6.6 L16 5.08 18.7 10 h6.6 L22 16 l3.3 6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.3 16
                moveTo(x = 24.3f, y = 16.0f)
                // l 3.58 -6.52
                lineToRelative(dx = 3.58f, dy = -6.52f)
                // A 1 1 0 0 0 27 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 8.0f,
                )
                // h -7.1
                horizontalLineToRelative(dx = -7.1f)
                // l -3.02 -5.48
                lineToRelative(dx = -3.02f, dy = -5.48f)
                // a 1 1 0 0 0 -1.76 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.76f,
                    dy1 = 0.0f,
                )
                // L 12.11 8
                lineTo(x = 12.11f, y = 8.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 1 1 0 0 0 -0.88 1.48
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.88f,
                    dy1 = 1.48f,
                )
                // L 7.71 16
                lineTo(x = 7.71f, y = 16.0f)
                // l -3.59 6.52
                lineToRelative(dx = -3.59f, dy = 6.52f)
                // A 1 1 0 0 0 5 24
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 24.0f,
                )
                // h 7.1
                horizontalLineToRelative(dx = 7.1f)
                // l 3.02 5.48
                lineToRelative(dx = 3.02f, dy = 5.48f)
                // a 1 1 0 0 0 1.76 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.76f,
                    dy1 = 0.0f,
                )
                // L 19.89 24
                lineTo(x = 19.89f, y = 24.0f)
                // H 27
                horizontalLineTo(x = 27.0f)
                // a 1 1 0 0 0 0.88 -1.48z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.88f,
                    dy1 = -1.48f,
                )
                close()
                // m -5.6 6
                moveToRelative(dx = -5.6f, dy = 6.0f)
                // L 16 26.92
                lineTo(x = 16.0f, y = 26.92f)
                // L 13.3 22
                lineTo(x = 13.3f, y = 22.0f)
                // H 6.7
                horizontalLineTo(x = 6.7f)
                // l 3.3 -6
                lineToRelative(dx = 3.3f, dy = -6.0f)
                // l -3.3 -6
                lineToRelative(dx = -3.3f, dy = -6.0f)
                // h 6.6
                horizontalLineToRelative(dx = 6.6f)
                // L 16 5.08
                lineTo(x = 16.0f, y = 5.08f)
                // L 18.7 10
                lineTo(x = 18.7f, y = 10.0f)
                // h 6.6
                horizontalLineToRelative(dx = 6.6f)
                // L 22 16
                lineTo(x = 22.0f, y = 16.0f)
                // l 3.3 6z
                lineToRelative(dx = 3.3f, dy = 6.0f)
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
        }.build().also { _worshipJewish = it }
    }

@Suppress("ObjectPropertyName")
private var _worshipJewish: ImageVector? = null
