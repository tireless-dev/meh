package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowShiftDown: ImageVector
    get() {
        val current = _arrowShiftDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArrowShiftDown",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 6 v10 h5 a1 1 0 0 1 .7 1.7 l-12 12 a1 1 0 0 1 -1.4 0 l-12 -12 A1 1 0 0 1 4 16 h5 V6 a2 2 0 0 1 2 -2 h10 a2 2 0 0 1 2 2 m-7 21.59 L25.59 18 H21 V6 H11 v12 H6.41Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 6
                moveTo(x = 23.0f, y = 6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 1 1 0 0 1 0.7 1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = 1.7f,
                )
                // l -12 12
                lineToRelative(dx = -12.0f, dy = 12.0f)
                // a 1 1 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -12 -12
                lineToRelative(dx = -12.0f, dy = -12.0f)
                // A 1 1 0 0 1 4 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // m -7 21.59
                moveToRelative(dx = -7.0f, dy = 21.59f)
                // L 25.59 18
                lineTo(x = 25.59f, y = 18.0f)
                // H 21
                horizontalLineTo(x = 21.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 6.41z
                horizontalLineTo(x = 6.41f)
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
        }.build().also { _arrowShiftDown = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowShiftDown: ImageVector? = null
