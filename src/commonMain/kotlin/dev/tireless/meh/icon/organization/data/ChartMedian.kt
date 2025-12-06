package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartMedian: ImageVector
    get() {
        val current = _chartMedian
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartMedian",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="16.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 23.999998
                moveTo(x = 16.0f, y = 23.999998f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // M18 28 v-2 h-2 v2 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // M26.05 19.68 A3.4 3.4 0 0 1 23 22 c-2.17 0 -3.31 -3.33 -4.52 -6.86 A63 63 0 0 0 17.34 12 H18 v-2 h-1.58 c-1.2 -2.29 -2.84 -4 -5.42 -4 -3.68 0 -4.9 3.53 -4.95 3.68 l1.9 .64 A3.4 3.4 0 0 1 11 8 c2.92 0 4.28 3.96 5.59 7.79 L17.37 18 H16 v2 h2.2 c1.08 2.29 2.5 4 4.8 4 3.68 0 4.9 -3.53 4.95 -3.68Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.05 19.68
                moveTo(x = 26.05f, y = 19.68f)
                // A 3.4 3.4 0 0 1 23 22
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 22.0f,
                )
                // c -2.17 0 -3.31 -3.33 -4.52 -6.86
                curveToRelative(
                    dx1 = -2.17f,
                    dy1 = 0.0f,
                    dx2 = -3.31f,
                    dy2 = -3.33f,
                    dx3 = -4.52f,
                    dy3 = -6.86f,
                )
                // A 63 63 0 0 0 17.34 12
                arcTo(
                    horizontalEllipseRadius = 63.0f,
                    verticalEllipseRadius = 63.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.34f,
                    y1 = 12.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -1.58
                horizontalLineToRelative(dx = -1.58f)
                // c -1.2 -2.29 -2.84 -4 -5.42 -4
                curveToRelative(
                    dx1 = -1.2f,
                    dy1 = -2.29f,
                    dx2 = -2.84f,
                    dy2 = -4.0f,
                    dx3 = -5.42f,
                    dy3 = -4.0f,
                )
                // c -3.68 0 -4.9 3.53 -4.95 3.68
                curveToRelative(
                    dx1 = -3.68f,
                    dy1 = 0.0f,
                    dx2 = -4.9f,
                    dy2 = 3.53f,
                    dx3 = -4.95f,
                    dy3 = 3.68f,
                )
                // l 1.9 0.64
                lineToRelative(dx = 1.9f, dy = 0.64f)
                // A 3.4 3.4 0 0 1 11 8
                arcTo(
                    horizontalEllipseRadius = 3.4f,
                    verticalEllipseRadius = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 8.0f,
                )
                // c 2.92 0 4.28 3.96 5.59 7.79
                curveToRelative(
                    dx1 = 2.92f,
                    dy1 = 0.0f,
                    dx2 = 4.28f,
                    dy2 = 3.96f,
                    dx3 = 5.59f,
                    dy3 = 7.79f,
                )
                // L 17.37 18
                lineTo(x = 17.37f, y = 18.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.2
                horizontalLineToRelative(dx = 2.2f)
                // c 1.08 2.29 2.5 4 4.8 4
                curveToRelative(
                    dx1 = 1.08f,
                    dy1 = 2.29f,
                    dx2 = 2.5f,
                    dy2 = 4.0f,
                    dx3 = 4.8f,
                    dy3 = 4.0f,
                )
                // c 3.68 0 4.9 -3.53 4.95 -3.68z
                curveToRelative(
                    dx1 = 3.68f,
                    dy1 = 0.0f,
                    dx2 = 4.9f,
                    dy2 = -3.53f,
                    dx3 = 4.95f,
                    dy3 = -3.68f,
                )
                close()
            }
            // <rect width="2" height="2" x="16.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // <rect width="2" height="2" x="16.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15.999999 4
                moveTo(x = 15.999999f, y = 4.0f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
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
        }.build().also { _chartMedian = it }
    }

@Suppress("ObjectPropertyName")
private var _chartMedian: ImageVector? = null
