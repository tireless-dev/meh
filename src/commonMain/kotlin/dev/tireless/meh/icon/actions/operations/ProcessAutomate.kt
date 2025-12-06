package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProcessAutomate: ImageVector
    get() {
        val current = _processAutomate
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ProcessAutomate",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M31 17 a3 3 0 0 0 -6 0 3 3 0 0 0 2 2.82 v2.6 l-11 6.42 L5.98 23 28.5 9.86 a1 1 0 0 0 0 -1.72 l-12 -7 a1 1 0 0 0 -1 0 l-12 7 A1 1 0 0 0 3 9 v3.18 a3 3 0 1 0 2 0 v-2.6 l11 -6.42 L26.02 9 3.5 22.14 a1 1 0 0 0 0 1.72 l12 7 a1 1 0 0 0 1 0 l12 -7 A1 1 0 0 0 29 23 v-3.18 A3 3 0 0 0 31 17 M4 16 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m24 2 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 17
                moveTo(x = 31.0f, y = 17.0f)
                // a 3 3 0 0 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 0 0 2 2.82
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.82f,
                )
                // v 2.6
                verticalLineToRelative(dy = 2.6f)
                // l -11 6.42
                lineToRelative(dx = -11.0f, dy = 6.42f)
                // L 5.98 23
                lineTo(x = 5.98f, y = 23.0f)
                // L 28.5 9.86
                lineTo(x = 28.5f, y = 9.86f)
                // a 1 1 0 0 0 0 -1.72
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.72f,
                )
                // l -12 -7
                lineToRelative(dx = -12.0f, dy = -7.0f)
                // a 1 1 0 0 0 -1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                // l -12 7
                lineToRelative(dx = -12.0f, dy = 7.0f)
                // A 1 1 0 0 0 3 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 9.0f,
                )
                // v 3.18
                verticalLineToRelative(dy = 3.18f)
                // a 3 3 0 1 0 2 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v -2.6
                verticalLineToRelative(dy = -2.6f)
                // l 11 -6.42
                lineToRelative(dx = 11.0f, dy = -6.42f)
                // L 26.02 9
                lineTo(x = 26.02f, y = 9.0f)
                // L 3.5 22.14
                lineTo(x = 3.5f, y = 22.14f)
                // a 1 1 0 0 0 0 1.72
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l 12 7
                lineToRelative(dx = 12.0f, dy = 7.0f)
                // a 1 1 0 0 0 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 12 -7
                lineToRelative(dx = 12.0f, dy = -7.0f)
                // A 1 1 0 0 0 29 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.0f,
                    y1 = 23.0f,
                )
                // v -3.18
                verticalLineToRelative(dy = -3.18f)
                // A 3 3 0 0 0 31 17
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 31.0f,
                    y1 = 17.0f,
                )
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
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
                // m 24 2
                moveToRelative(dx = 24.0f, dy = 2.0f)
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
        }.build().also { _processAutomate = it }
    }

@Suppress("ObjectPropertyName")
private var _processAutomate: ImageVector? = null
