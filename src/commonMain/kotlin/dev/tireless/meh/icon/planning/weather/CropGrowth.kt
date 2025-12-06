package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CropGrowth: ImageVector
    get() {
        val current = _cropGrowth
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CropGrowth",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 13 a4 4 0 0 0 4 -4 V6 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 19 4 h-3 v3 a6 6 0 0 0 6 6 h1 v13 H11 v-5 h1 a4 4 0 0 0 4 -4 v-3 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 5 12 H2 v3 a6 6 0 0 0 6 6 h1 v5 H2 v2 h28 v-2 h-5 V13Z m-1 -3 a2 2 0 0 1 2 -2 h1 v1 a2 2 0 0 1 -2 2 h-1Z m-14 8 a2 2 0 0 1 2 -2 h1 v1 a2 2 0 0 1 -2 2 h-1Z m-2 1 H8 a4 4 0 0 1 -4 -4 v-1 h1 a4 4 0 0 1 4 4Z m14 -8 h-1 a4 4 0 0 1 -4 -4 V6 h1 a4 4 0 0 1 4 4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 13
                moveTo(x = 26.0f, y = 13.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 4 4 0 0 0 -2.75 1.1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.75f,
                    dy1 = 1.1f,
                )
                // A 6 6 0 0 0 19 4
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 4.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 6 6 0 0 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 4 4 0 0 0 -2.75 1.1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.75f,
                    dy1 = 1.1f,
                )
                // A 6 6 0 0 0 5 12
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 12.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 6 6 0 0 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // V 13z
                verticalLineTo(y = 13.0f)
                close()
                // m -1 -3
                moveToRelative(dx = -1.0f, dy = -3.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // m -14 8
                moveToRelative(dx = -14.0f, dy = 8.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h -1z
                horizontalLineToRelative(dx = -1.0f)
                close()
                // m -2 1
                moveToRelative(dx = -2.0f, dy = 1.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 1 4 4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                close()
                // m 14 -8
                moveToRelative(dx = 14.0f, dy = -8.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 1 4 4z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
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
        }.build().also { _cropGrowth = it }
    }

@Suppress("ObjectPropertyName")
private var _cropGrowth: ImageVector? = null
