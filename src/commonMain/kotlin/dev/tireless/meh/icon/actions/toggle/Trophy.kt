package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trophy: ImageVector
    get() {
        val current = _trophy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Trophy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 7 h-2 V6 a2 2 0 0 0 -2 -2 H10 a2 2 0 0 0 -2 2 v1 H6 a2 2 0 0 0 -2 2 v3 a4 4 0 0 0 4 4 h.32 A8.2 8.2 0 0 0 15 21.93 V26 h-5 v2 h12 v-2 h-5 v-4.07 A8 8 0 0 0 23.74 16 H24 a4 4 0 0 0 4 -4 V9 a2 2 0 0 0 -2 -2 M8 14 a2 2 0 0 1 -2 -2 V9 h2Z m14 0 a6 6 0 0 1 -6.19 6 A6.2 6.2 0 0 1 10 13.7 V6 h12Z m4 -2 a2 2 0 0 1 -2 2 V9 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 7
                moveTo(x = 26.0f, y = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // h 0.32
                horizontalLineToRelative(dx = 0.32f)
                // A 8.2 8.2 0 0 0 15 21.93
                arcTo(
                    horizontalEllipseRadius = 8.2f,
                    verticalEllipseRadius = 8.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 21.93f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -4.07
                verticalLineToRelative(dy = -4.07f)
                // A 8 8 0 0 0 23.74 16
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.74f,
                    y1 = 16.0f,
                )
                // H 24
                horizontalLineTo(x = 24.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
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
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 14 0
                moveToRelative(dx = 14.0f, dy = 0.0f)
                // a 6 6 0 0 1 -6.19 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.19f,
                    dy1 = 6.0f,
                )
                // A 6.2 6.2 0 0 1 10 13.7
                arcTo(
                    horizontalEllipseRadius = 6.2f,
                    verticalEllipseRadius = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 13.7f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _trophy = it }
    }

@Suppress("ObjectPropertyName")
private var _trophy: ImageVector? = null
