package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shapes: ImageVector
    get() {
        val current = _shapes
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Shapes",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M5 16 H3 v11 a2 2 0 0 0 2 2 h8 v-2 H5z m23 13 H17 a1 1 0 0 1 -.88 -1.48 l5.5 -10 A1 1 0 0 1 22.5 17 a1 1 0 0 1 .88 .52 l5.5 10 A1 1 0 0 1 28 29 m-9.3 -2 h7.6 l-3.8 -6.92z M27 3 H16 v2 h11 v14 h2 V5 a2 2 0 0 0 -2 -2 M11 3 H5 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 8 H5 V5 h6z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 16
                moveTo(x = 5.0f, y = 16.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
                // m 23 13
                moveToRelative(dx = 23.0f, dy = 13.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 1 1 0 0 1 -0.88 -1.48
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.88f,
                    dy1 = -1.48f,
                )
                // l 5.5 -10
                lineToRelative(dx = 5.5f, dy = -10.0f)
                // A 1 1 0 0 1 22.5 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.5f,
                    y1 = 17.0f,
                )
                // a 1 1 0 0 1 0.88 0.52
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.88f,
                    dy1 = 0.52f,
                )
                // l 5.5 10
                lineToRelative(dx = 5.5f, dy = 10.0f)
                // A 1 1 0 0 1 28 29
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 29.0f,
                )
                // m -9.3 -2
                moveToRelative(dx = -9.3f, dy = -2.0f)
                // h 7.6
                horizontalLineToRelative(dx = 7.6f)
                // l -3.8 -6.92z
                lineToRelative(dx = -3.8f, dy = -6.92f)
                close()
                // M 27 3
                moveTo(x = 27.0f, y = 3.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // M 11 3
                moveTo(x = 11.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
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
        }.build().also { _shapes = it }
    }

@Suppress("ObjectPropertyName")
private var _shapes: ImageVector? = null
