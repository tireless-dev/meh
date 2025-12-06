package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartMaximum: ImageVector
    get() {
        val current = _chartMaximum
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartMaximum",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="2" x="8.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="12.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="20.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 6
                moveTo(x = 20.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="24.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 6
                moveTo(x = 24.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="28.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // m27.99 28 -.03 -.16 C26.51 19.07 24.06 9.09 18 8.09 V6 h-2 v2.09 C9.92 9.06 7.47 19.06 6.01 27.84 L6 28 H4 V8 h2 V6 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z M8.02 28 c2.02 -12.1 4.95 -18 8.97 -18 s6.95 5.9 8.97 18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.99 28
                moveTo(x = 27.99f, y = 28.0f)
                // l -0.03 -0.16
                lineToRelative(dx = -0.03f, dy = -0.16f)
                // C 26.51 19.07 24.06 9.09 18 8.09
                curveTo(
                    x1 = 26.51f,
                    y1 = 19.07f,
                    x2 = 24.06f,
                    y2 = 9.09f,
                    x3 = 18.0f,
                    y3 = 8.09f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.09
                verticalLineToRelative(dy = 2.09f)
                // C 9.92 9.06 7.47 19.06 6.01 27.84
                curveTo(
                    x1 = 9.92f,
                    y1 = 9.06f,
                    x2 = 7.47f,
                    y2 = 19.06f,
                    x3 = 6.01f,
                    y3 = 27.84f,
                )
                // L 6 28
                lineTo(x = 6.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // M 8.02 28
                moveTo(x = 8.02f, y = 28.0f)
                // c 2.02 -12.1 4.95 -18 8.97 -18
                curveToRelative(
                    dx1 = 2.02f,
                    dy1 = -12.1f,
                    dx2 = 4.95f,
                    dy2 = -18.0f,
                    dx3 = 8.97f,
                    dy3 = -18.0f,
                )
                // s 6.95 5.9 8.97 18z
                reflectiveCurveToRelative(
                    dx1 = 6.95f,
                    dy1 = 5.9f,
                    dx2 = 8.97f,
                    dy2 = 18.0f,
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
        }.build().also { _chartMaximum = it }
    }

@Suppress("ObjectPropertyName")
private var _chartMaximum: ImageVector? = null
