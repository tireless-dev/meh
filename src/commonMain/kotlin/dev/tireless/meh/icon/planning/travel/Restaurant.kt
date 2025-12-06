package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Restaurant: ImageVector
    get() {
        val current = _restaurant
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Restaurant",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="10" x="9.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M14 11 a4 4 0 0 1 -8 0 V2 H4 v9 a6 6 0 0 0 5 5.91 V30 h2 V16.91 A6 6 0 0 0 16 11 V2 h-2Z m8 -9 h-1 v28 h2 V20 h3 a2 2 0 0 0 2 -2 V8 a5.8 5.8 0 0 0 -6 -6 m4 16 h-3 V4.09 c2.88 .56 3 3.54 3 3.91Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 11
                moveTo(x = 14.0f, y = 11.0f)
                // a 4 4 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // a 6 6 0 0 0 5 5.91
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.91f,
                )
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 16.91
                verticalLineTo(y = 16.91f)
                // A 6 6 0 0 0 16 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 11.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 8 -9
                moveToRelative(dx = 8.0f, dy = -9.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // a 5.8 5.8 0 0 0 -6 -6
                arcToRelative(
                    a = 5.8f,
                    b = 5.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
                // m 4 16
                moveToRelative(dx = 4.0f, dy = 16.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 4.09
                verticalLineTo(y = 4.09f)
                // c 2.88 0.56 3 3.54 3 3.91z
                curveToRelative(
                    dx1 = 2.88f,
                    dy1 = 0.56f,
                    dx2 = 3.0f,
                    dy2 = 3.54f,
                    dx3 = 3.0f,
                    dy3 = 3.91f,
                )
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
        }.build().also { _restaurant = it }
    }

@Suppress("ObjectPropertyName")
private var _restaurant: ImageVector? = null
