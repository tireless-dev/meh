package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartViolinPlot: ImageVector
    get() {
        val current = _chartViolinPlot
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartViolinPlot",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 30 H4 a2 2 0 0 1 -2 -2 V2 h2 v26 h26Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 30
                moveTo(x = 30.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // V 2
                verticalLineTo(y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 26z
                horizontalLineToRelative(dx = 26.0f)
                close()
            }
            // M14.86 7.82 13 4.72 V2 h-2 v2.72 l-1.86 3.1 A8 8 0 0 0 8 11.94 v.12 a8 8 0 0 0 1.14 4.12 l1.86 3.1 V26 h2 v-6.72 l1.86 -3.1 A8 8 0 0 0 16 12.06 v-.12 a8 8 0 0 0 -1.14 -4.12 M12 6.94 l1.15 1.91 A6 6 0 0 1 13.92 11 h-3.84 a6 6 0 0 1 .78 -2.15Z m0 10.12 -1.14 -1.91 A6 6 0 0 1 10.08 13 h3.84 a6 6 0 0 1 -.77 2.15Z m15.86 -5.24 L26 8.72 V2 h-2 v6.72 l-1.86 3.1 A8 8 0 0 0 21 15.94 v.12 a8 8 0 0 0 1.14 4.12 l1.86 3.1 V26 h2 v-2.72 l1.86 -3.1 A8 8 0 0 0 29 16.06 v-.12 a8 8 0 0 0 -1.14 -4.12 M25 10.94 l1.15 1.91 A6 6 0 0 1 26.92 15 h-3.84 a6 6 0 0 1 .78 -2.15Z m0 10.12 -1.14 -1.91 A6 6 0 0 1 23.08 17 h3.84 a6 6 0 0 1 -.78 2.15Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.86 7.82
                moveTo(x = 14.86f, y = 7.82f)
                // L 13 4.72
                lineTo(x = 13.0f, y = 4.72f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.72
                verticalLineToRelative(dy = 2.72f)
                // l -1.86 3.1
                lineToRelative(dx = -1.86f, dy = 3.1f)
                // A 8 8 0 0 0 8 11.94
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 11.94f,
                )
                // v 0.12
                verticalLineToRelative(dy = 0.12f)
                // a 8 8 0 0 0 1.14 4.12
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.14f,
                    dy1 = 4.12f,
                )
                // l 1.86 3.1
                lineToRelative(dx = 1.86f, dy = 3.1f)
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6.72
                verticalLineToRelative(dy = -6.72f)
                // l 1.86 -3.1
                lineToRelative(dx = 1.86f, dy = -3.1f)
                // A 8 8 0 0 0 16 12.06
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 12.06f,
                )
                // v -0.12
                verticalLineToRelative(dy = -0.12f)
                // a 8 8 0 0 0 -1.14 -4.12
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.14f,
                    dy1 = -4.12f,
                )
                // M 12 6.94
                moveTo(x = 12.0f, y = 6.94f)
                // l 1.15 1.91
                lineToRelative(dx = 1.15f, dy = 1.91f)
                // A 6 6 0 0 1 13.92 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.92f,
                    y1 = 11.0f,
                )
                // h -3.84
                horizontalLineToRelative(dx = -3.84f)
                // a 6 6 0 0 1 0.78 -2.15z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.78f,
                    dy1 = -2.15f,
                )
                close()
                // m 0 10.12
                moveToRelative(dx = 0.0f, dy = 10.12f)
                // l -1.14 -1.91
                lineToRelative(dx = -1.14f, dy = -1.91f)
                // A 6 6 0 0 1 10.08 13
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.08f,
                    y1 = 13.0f,
                )
                // h 3.84
                horizontalLineToRelative(dx = 3.84f)
                // a 6 6 0 0 1 -0.77 2.15z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = 2.15f,
                )
                close()
                // m 15.86 -5.24
                moveToRelative(dx = 15.86f, dy = -5.24f)
                // L 26 8.72
                lineTo(x = 26.0f, y = 8.72f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6.72
                verticalLineToRelative(dy = 6.72f)
                // l -1.86 3.1
                lineToRelative(dx = -1.86f, dy = 3.1f)
                // A 8 8 0 0 0 21 15.94
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 15.94f,
                )
                // v 0.12
                verticalLineToRelative(dy = 0.12f)
                // a 8 8 0 0 0 1.14 4.12
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.14f,
                    dy1 = 4.12f,
                )
                // l 1.86 3.1
                lineToRelative(dx = 1.86f, dy = 3.1f)
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.72
                verticalLineToRelative(dy = -2.72f)
                // l 1.86 -3.1
                lineToRelative(dx = 1.86f, dy = -3.1f)
                // A 8 8 0 0 0 29 16.06
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.0f,
                    y1 = 16.06f,
                )
                // v -0.12
                verticalLineToRelative(dy = -0.12f)
                // a 8 8 0 0 0 -1.14 -4.12
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.14f,
                    dy1 = -4.12f,
                )
                // M 25 10.94
                moveTo(x = 25.0f, y = 10.94f)
                // l 1.15 1.91
                lineToRelative(dx = 1.15f, dy = 1.91f)
                // A 6 6 0 0 1 26.92 15
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.92f,
                    y1 = 15.0f,
                )
                // h -3.84
                horizontalLineToRelative(dx = -3.84f)
                // a 6 6 0 0 1 0.78 -2.15z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.78f,
                    dy1 = -2.15f,
                )
                close()
                // m 0 10.12
                moveToRelative(dx = 0.0f, dy = 10.12f)
                // l -1.14 -1.91
                lineToRelative(dx = -1.14f, dy = -1.91f)
                // A 6 6 0 0 1 23.08 17
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.08f,
                    y1 = 17.0f,
                )
                // h 3.84
                horizontalLineToRelative(dx = 3.84f)
                // a 6 6 0 0 1 -0.78 2.15z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.78f,
                    dy1 = 2.15f,
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
        }.build().also { _chartViolinPlot = it }
    }

@Suppress("ObjectPropertyName")
private var _chartViolinPlot: ImageVector? = null
