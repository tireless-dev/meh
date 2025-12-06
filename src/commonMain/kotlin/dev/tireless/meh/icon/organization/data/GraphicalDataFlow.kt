package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GraphicalDataFlow: ImageVector
    get() {
        val current = _graphicalDataFlow
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.GraphicalDataFlow",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 30 h-6 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-6 -8 v6 h6 v-6Z m-4 4 h-6 a3 3 0 0 1 -3 -3 v-4 h2 v4 a1 1 0 0 0 1 1 h6Z m8 -8 h-2 v-3 a1 1 0 0 0 -1 -1 h-5 v-2 h5 a3 3 0 0 1 3 3Z m-11 0 a1 1 0 0 1 -.5 -.13 L10 15.29 l-4.5 2.58 a1 1 0 0 1 -1.47 -1.1 l1.06 -4.57 -2.82 -3.02 a1 1 0 0 1 .57 -1.67 l4.2 -.7 L9.1 2.56 a1 1 0 0 1 1.79 -.02 l2.2 4.27 4.08 .7 a1 1 0 0 1 .56 1.67 l-2.82 3.02 1.06 4.57 A1 1 0 0 1 15 18 m-5 -5 .5 .27 3 1.72 -.78 -3.37 2.29 -2.45 -3.24 -.56 -1.74 -3.38 -1.65 3.38 L5 9.18 l2.28 2.44 -.79 3.37 3.01 -1.72z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m -6 -8
                moveToRelative(dx = -6.0f, dy = -8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 3 3 0 0 1 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m 8 -8
                moveToRelative(dx = 8.0f, dy = -8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 3 3 0 0 1 3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                close()
                // m -11 0
                moveToRelative(dx = -11.0f, dy = 0.0f)
                // a 1 1 0 0 1 -0.5 -0.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = -0.13f,
                )
                // L 10 15.29
                lineTo(x = 10.0f, y = 15.29f)
                // l -4.5 2.58
                lineToRelative(dx = -4.5f, dy = 2.58f)
                // a 1 1 0 0 1 -1.47 -1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.47f,
                    dy1 = -1.1f,
                )
                // l 1.06 -4.57
                lineToRelative(dx = 1.06f, dy = -4.57f)
                // l -2.82 -3.02
                lineToRelative(dx = -2.82f, dy = -3.02f)
                // a 1 1 0 0 1 0.57 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -1.67f,
                )
                // l 4.2 -0.7
                lineToRelative(dx = 4.2f, dy = -0.7f)
                // L 9.1 2.56
                lineTo(x = 9.1f, y = 2.56f)
                // a 1 1 0 0 1 1.79 -0.02
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.79f,
                    dy1 = -0.02f,
                )
                // l 2.2 4.27
                lineToRelative(dx = 2.2f, dy = 4.27f)
                // l 4.08 0.7
                lineToRelative(dx = 4.08f, dy = 0.7f)
                // a 1 1 0 0 1 0.56 1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.56f,
                    dy1 = 1.67f,
                )
                // l -2.82 3.02
                lineToRelative(dx = -2.82f, dy = 3.02f)
                // l 1.06 4.57
                lineToRelative(dx = 1.06f, dy = 4.57f)
                // A 1 1 0 0 1 15 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 18.0f,
                )
                // m -5 -5
                moveToRelative(dx = -5.0f, dy = -5.0f)
                // l 0.5 0.27
                lineToRelative(dx = 0.5f, dy = 0.27f)
                // l 3 1.72
                lineToRelative(dx = 3.0f, dy = 1.72f)
                // l -0.78 -3.37
                lineToRelative(dx = -0.78f, dy = -3.37f)
                // l 2.29 -2.45
                lineToRelative(dx = 2.29f, dy = -2.45f)
                // l -3.24 -0.56
                lineToRelative(dx = -3.24f, dy = -0.56f)
                // l -1.74 -3.38
                lineToRelative(dx = -1.74f, dy = -3.38f)
                // l -1.65 3.38
                lineToRelative(dx = -1.65f, dy = 3.38f)
                // L 5 9.18
                lineTo(x = 5.0f, y = 9.18f)
                // l 2.28 2.44
                lineToRelative(dx = 2.28f, dy = 2.44f)
                // l -0.79 3.37
                lineToRelative(dx = -0.79f, dy = 3.37f)
                // l 3.01 -1.72z
                lineToRelative(dx = 3.01f, dy = -1.72f)
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
        }.build().also { _graphicalDataFlow = it }
    }

@Suppress("ObjectPropertyName")
private var _graphicalDataFlow: ImageVector? = null
