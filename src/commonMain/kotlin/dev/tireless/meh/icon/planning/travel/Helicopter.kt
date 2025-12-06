package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Helicopter: ImageVector
    get() {
        val current = _helicopter
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Helicopter",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 8 V6 H8 v2 h10 v4 H4 V8 H2 v8 h2 v-2 h6.22 l2.05 8.21 A5 5 0 0 0 17.12 26 H26 a4 4 0 0 0 4 -4 v-2.64 a2 2 0 0 0 -.46 -1.28 l-4.47 -5.36 A2 2 0 0 0 23.53 12 H20 V8Z m-4 16 h-8.88 a3 3 0 0 1 -2.9 -2.27 L12.27 14 H18 v6 h10 v2 a2 2 0 0 1 -2 2 m-2.47 -10 3.33 4 H20 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 8
                moveTo(x = 30.0f, y = 8.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 6.22
                horizontalLineToRelative(dx = 6.22f)
                // l 2.05 8.21
                lineToRelative(dx = 2.05f, dy = 8.21f)
                // A 5 5 0 0 0 17.12 26
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.12f,
                    y1 = 26.0f,
                )
                // H 26
                horizontalLineTo(x = 26.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // v -2.64
                verticalLineToRelative(dy = -2.64f)
                // a 2 2 0 0 0 -0.46 -1.28
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.46f,
                    dy1 = -1.28f,
                )
                // l -4.47 -5.36
                lineToRelative(dx = -4.47f, dy = -5.36f)
                // A 2 2 0 0 0 23.53 12
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.53f,
                    y1 = 12.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
                // m -4 16
                moveToRelative(dx = -4.0f, dy = 16.0f)
                // h -8.88
                horizontalLineToRelative(dx = -8.88f)
                // a 3 3 0 0 1 -2.9 -2.27
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.9f,
                    dy1 = -2.27f,
                )
                // L 12.27 14
                lineTo(x = 12.27f, y = 14.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // m -2.47 -10
                moveToRelative(dx = -2.47f, dy = -10.0f)
                // l 3.33 4
                lineToRelative(dx = 3.33f, dy = 4.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
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
        }.build().also { _helicopter = it }
    }

@Suppress("ObjectPropertyName")
private var _helicopter: ImageVector? = null
