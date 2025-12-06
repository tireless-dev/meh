package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Train: ImageVector
    get() {
        val current = _train
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Train",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 3 H11 a5 5 0 0 0 -5 5 v12 a5 5 0 0 0 3.58 4.77 L7.77 29 h2.18 l1.7 -4 h8.7 l1.7 4 h2.18 l-1.81 -4.23 A5 5 0 0 0 26 20 V8 a5 5 0 0 0 -5 -5 M11 5 h10 a3 3 0 0 1 2.82 2 H8.18 A3 3 0 0 1 11 5 m13 14 h-3 v2 h2.82 A3 3 0 0 1 21 23 H11 a3 3 0 0 1 -2.82 -2 H11 v-2 H8 v-2 h16Z m0 -4 H8 V9 h16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 5 5 0 0 0 3.58 4.77
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.58f,
                    dy1 = 4.77f,
                )
                // L 7.77 29
                lineTo(x = 7.77f, y = 29.0f)
                // h 2.18
                horizontalLineToRelative(dx = 2.18f)
                // l 1.7 -4
                lineToRelative(dx = 1.7f, dy = -4.0f)
                // h 8.7
                horizontalLineToRelative(dx = 8.7f)
                // l 1.7 4
                lineToRelative(dx = 1.7f, dy = 4.0f)
                // h 2.18
                horizontalLineToRelative(dx = 2.18f)
                // l -1.81 -4.23
                lineToRelative(dx = -1.81f, dy = -4.23f)
                // A 5 5 0 0 0 26 20
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 20.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 3 3 0 0 1 2.82 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.82f,
                    dy1 = 2.0f,
                )
                // H 8.18
                horizontalLineTo(x = 8.18f)
                // A 3 3 0 0 1 11 5
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 5.0f,
                )
                // m 13 14
                moveToRelative(dx = 13.0f, dy = 14.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.82
                horizontalLineToRelative(dx = 2.82f)
                // A 3 3 0 0 1 21 23
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 23.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 3 3 0 0 1 -2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.82f,
                    dy1 = -2.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
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
        }.build().also { _train = it }
    }

@Suppress("ObjectPropertyName")
private var _train: ImageVector? = null
