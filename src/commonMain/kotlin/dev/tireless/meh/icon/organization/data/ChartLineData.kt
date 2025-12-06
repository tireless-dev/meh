package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartLineData: ImageVector
    get() {
        val current = _chartLineData
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartLineData",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M10.06 17.88 A4 4 0 0 0 11 18 a4 4 0 0 0 2.23 -.68 l3.22 2.87 a3.9 3.9 0 0 0 -.2 3.17 A4 4 0 1 0 22.62 19 l2.54 -5.09 a3.8 3.8 0 0 0 2.91 -.53 A4 4 0 1 0 23.38 13 l-2.54 5.09 A4 4 0 0 0 20 18 a4 4 0 0 0 -2.23 .68 l-3.22 -2.87 a3.9 3.9 0 0 0 .2 -3.17 4 4 0 1 0 -6.45 4.29 L4 25 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4.67Z M26 8 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 m-4 14 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 M11 12 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.06 17.88
                moveTo(x = 10.06f, y = 17.88f)
                // A 4 4 0 0 0 11 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 0 0 2.23 -0.68
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.23f,
                    dy1 = -0.68f,
                )
                // l 3.22 2.87
                lineToRelative(dx = 3.22f, dy = 2.87f)
                // a 3.9 3.9 0 0 0 -0.2 3.17
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.2f,
                    dy1 = 3.17f,
                )
                // A 4 4 0 1 0 22.62 19
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 22.62f,
                    y1 = 19.0f,
                )
                // l 2.54 -5.09
                lineToRelative(dx = 2.54f, dy = -5.09f)
                // a 3.8 3.8 0 0 0 2.91 -0.53
                arcToRelative(
                    a = 3.8f,
                    b = 3.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.91f,
                    dy1 = -0.53f,
                )
                // A 4 4 0 1 0 23.38 13
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 23.38f,
                    y1 = 13.0f,
                )
                // l -2.54 5.09
                lineToRelative(dx = -2.54f, dy = 5.09f)
                // A 4 4 0 0 0 20 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 0 0 -2.23 0.68
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.23f,
                    dy1 = 0.68f,
                )
                // l -3.22 -2.87
                lineToRelative(dx = -3.22f, dy = -2.87f)
                // a 3.9 3.9 0 0 0 0.2 -3.17
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.2f,
                    dy1 = -3.17f,
                )
                // a 4 4 0 1 0 -6.45 4.29
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.45f,
                    dy1 = 4.29f,
                )
                // L 4 25
                lineTo(x = 4.0f, y = 25.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4.67z
                horizontalLineTo(x = 4.67f)
                close()
                // M 26 8
                moveTo(x = 26.0f, y = 8.0f)
                // a 2 2 0 1 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
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
                // m -4 14
                moveToRelative(dx = -4.0f, dy = 14.0f)
                // a 2 2 0 1 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
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
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
                // a 2 2 0 1 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
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
        }.build().also { _chartLineData = it }
    }

@Suppress("ObjectPropertyName")
private var _chartLineData: ImageVector? = null
