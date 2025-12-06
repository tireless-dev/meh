package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartMinimum: ImageVector
    get() {
        val current = _chartMinimum
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartMinimum",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 28 v-2 h2 v-2 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
            // <rect width="2" height="2" x="8.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 24
                moveTo(x = 8.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="12.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 24
                moveTo(x = 12.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="20.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 24
                moveTo(x = 20.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="24.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 24
                moveTo(x = 24.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="28.0" y="24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 24
                moveTo(x = 28.0f, y = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M27.95 4.33 25.97 4 C23.95 16.1 21.01 22 17 22 s-6.95 -5.9 -8.97 -18 L6.05 4.33 C7.51 13.06 9.96 22.93 16 23.9 V26 h2 v-2.09 c6.04 -.98 8.5 -10.85 9.95 -19.58
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.95 4.33
                moveTo(x = 27.95f, y = 4.33f)
                // L 25.97 4
                lineTo(x = 25.97f, y = 4.0f)
                // C 23.95 16.1 21.01 22 17 22
                curveTo(
                    x1 = 23.95f,
                    y1 = 16.1f,
                    x2 = 21.01f,
                    y2 = 22.0f,
                    x3 = 17.0f,
                    y3 = 22.0f,
                )
                // s -6.95 -5.9 -8.97 -18
                reflectiveCurveToRelative(
                    dx1 = -6.95f,
                    dy1 = -5.9f,
                    dx2 = -8.97f,
                    dy2 = -18.0f,
                )
                // L 6.05 4.33
                lineTo(x = 6.05f, y = 4.33f)
                // C 7.51 13.06 9.96 22.93 16 23.9
                curveTo(
                    x1 = 7.51f,
                    y1 = 13.06f,
                    x2 = 9.96f,
                    y2 = 22.93f,
                    x3 = 16.0f,
                    y3 = 23.9f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.09
                verticalLineToRelative(dy = -2.09f)
                // c 6.04 -0.98 8.5 -10.85 9.95 -19.58
                curveToRelative(
                    dx1 = 6.04f,
                    dy1 = -0.98f,
                    dx2 = 8.5f,
                    dy2 = -10.85f,
                    dx3 = 9.95f,
                    dy3 = -19.58f,
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
        }.build().also { _chartMinimum = it }
    }

@Suppress("ObjectPropertyName")
private var _chartMinimum: ImageVector? = null
