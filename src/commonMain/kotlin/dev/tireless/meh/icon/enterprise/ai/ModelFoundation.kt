package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelFoundation: ImageVector
    get() {
        val current = _modelFoundation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ModelFoundation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 19 a3 3 0 0 0 0 -6 3 3 0 0 0 -2.82 2 h-5.77 l7.3 -7.3 A3 3 0 1 0 27 2 a3 3 0 0 0 -2.82 2 H7.82 a3 3 0 1 0 -1.53 3.7 l7.3 7.3 H7.82 a3 3 0 1 0 0 2 h5.77 l-7.3 7.3 A3 3 0 1 0 5 30 a3 3 0 0 0 2.82 -2 h16.36 a3 3 0 1 0 1.53 -3.7 l-7.3 -7.3 h5.77 A3 3 0 0 0 27 19 m0 -4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M7.82 6 h16.36 l.12 .29 -8.3 8.3 -8.3 -8.3z M27 4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M4 5 a1 1 0 1 1 2 0 1 1 0 0 1 -2 0 m1 12 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m19.18 9 H7.82 L7.7 25.71 l8.3 -8.3 8.3 8.3z M5 28 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m23 -1 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // a 3 3 0 0 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 0 -2.82 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 2.0f,
                )
                // h -5.77
                horizontalLineToRelative(dx = -5.77f)
                // l 7.3 -7.3
                lineToRelative(dx = 7.3f, dy = -7.3f)
                // A 3 3 0 1 0 27 2
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 2.0f,
                )
                // a 3 3 0 0 0 -2.82 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 2.0f,
                )
                // H 7.82
                horizontalLineTo(x = 7.82f)
                // a 3 3 0 1 0 -1.53 3.7
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.53f,
                    dy1 = 3.7f,
                )
                // l 7.3 7.3
                lineToRelative(dx = 7.3f, dy = 7.3f)
                // H 7.82
                horizontalLineTo(x = 7.82f)
                // a 3 3 0 1 0 0 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 5.77
                horizontalLineToRelative(dx = 5.77f)
                // l -7.3 7.3
                lineToRelative(dx = -7.3f, dy = 7.3f)
                // A 3 3 0 1 0 5 30
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 30.0f,
                )
                // a 3 3 0 0 0 2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = -2.0f,
                )
                // h 16.36
                horizontalLineToRelative(dx = 16.36f)
                // a 3 3 0 1 0 1.53 -3.7
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.53f,
                    dy1 = -3.7f,
                )
                // l -7.3 -7.3
                lineToRelative(dx = -7.3f, dy = -7.3f)
                // h 5.77
                horizontalLineToRelative(dx = 5.77f)
                // A 3 3 0 0 0 27 19
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 19.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // M 7.82 6
                moveTo(x = 7.82f, y = 6.0f)
                // h 16.36
                horizontalLineToRelative(dx = 16.36f)
                // l 0.12 0.29
                lineToRelative(dx = 0.12f, dy = 0.29f)
                // l -8.3 8.3
                lineToRelative(dx = -8.3f, dy = 8.3f)
                // l -8.3 -8.3z
                lineToRelative(dx = -8.3f, dy = -8.3f)
                close()
                // M 27 4
                moveTo(x = 27.0f, y = 4.0f)
                // a 1 1 0 1 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
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
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // m 1 12
                moveToRelative(dx = 1.0f, dy = 12.0f)
                // a 1 1 0 1 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 19.18 9
                moveToRelative(dx = 19.18f, dy = 9.0f)
                // H 7.82
                horizontalLineTo(x = 7.82f)
                // L 7.7 25.71
                lineTo(x = 7.7f, y = 25.71f)
                // l 8.3 -8.3
                lineToRelative(dx = 8.3f, dy = -8.3f)
                // l 8.3 8.3z
                lineToRelative(dx = 8.3f, dy = 8.3f)
                close()
                // M 5 28
                moveTo(x = 5.0f, y = 28.0f)
                // a 1 1 0 1 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 23 -1
                moveToRelative(dx = 23.0f, dy = -1.0f)
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _modelFoundation = it }
    }

@Suppress("ObjectPropertyName")
private var _modelFoundation: ImageVector? = null
