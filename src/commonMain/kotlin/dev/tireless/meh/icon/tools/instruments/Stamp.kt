package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stamp: ImageVector
    get() {
        val current = _stamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Stamp",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 18 h-6 v-3.1 a7.5 7.5 0 0 1 1.16 -3.86 6 6 0 0 0 -1.37 -7.7 6 6 0 0 0 -9.69 3.54 6 6 0 0 0 .75 4.18 A7.3 7.3 0 0 1 12 14.79 V18 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 v2 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 M12.07 7.24 a4 4 0 1 1 7.37 2.78 A10 10 0 0 0 18.07 14 h-4.13 a9.5 9.5 0 0 0 -1.38 -3.97 4 4 0 0 1 -.49 -2.79 M18 16 v2 h-4 v-2Z m6 12 H8 v-2 h16Z M6 24 v-4 h20 v4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -3.1
                verticalLineToRelative(dy = -3.1f)
                // a 7.5 7.5 0 0 1 1.16 -3.86
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.16f,
                    dy1 = -3.86f,
                )
                // a 6 6 0 0 0 -1.37 -7.7
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.37f,
                    dy1 = -7.7f,
                )
                // a 6 6 0 0 0 -9.69 3.54
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.69f,
                    dy1 = 3.54f,
                )
                // a 6 6 0 0 0 0.75 4.18
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.75f,
                    dy1 = 4.18f,
                )
                // A 7.3 7.3 0 0 1 12 14.79
                arcTo(
                    horizontalEllipseRadius = 7.3f,
                    verticalEllipseRadius = 7.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 14.79f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // M 12.07 7.24
                moveTo(x = 12.07f, y = 7.24f)
                // a 4 4 0 1 1 7.37 2.78
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.37f,
                    dy1 = 2.78f,
                )
                // A 10 10 0 0 0 18.07 14
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.07f,
                    y1 = 14.0f,
                )
                // h -4.13
                horizontalLineToRelative(dx = -4.13f)
                // a 9.5 9.5 0 0 0 -1.38 -3.97
                arcToRelative(
                    a = 9.5f,
                    b = 9.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.38f,
                    dy1 = -3.97f,
                )
                // a 4 4 0 0 1 -0.49 -2.79
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.49f,
                    dy1 = -2.79f,
                )
                // M 18 16
                moveTo(x = 18.0f, y = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 6 12
                moveToRelative(dx = 6.0f, dy = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
                close()
                // M 6 24
                moveTo(x = 6.0f, y = 24.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
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
        }.build().also { _stamp = it }
    }

@Suppress("ObjectPropertyName")
private var _stamp: ImageVector? = null
