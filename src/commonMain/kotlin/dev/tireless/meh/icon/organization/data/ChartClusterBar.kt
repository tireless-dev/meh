package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartClusterBar: ImageVector
    get() {
        val current = _chartClusterBar
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartClusterBar",
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
            // <rect width="2" height="10" x="10.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="7.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="18" x="26.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 8
                moveTo(x = 26.0f, y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="12" x="23.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 14
                moveTo(x = 23.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="14" x="15.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 26
                moveTo(x = 17.0f, y = 26.0f)
                // l -2 0
                lineToRelative(dx = -2.0f, dy = 0.0f)
                // l 0 -14
                lineToRelative(dx = 0.0f, dy = -14.0f)
                // l 2 -0z
                lineToRelative(dx = 2.0f, dy = -0.0f)
                close()
            }
            // <rect width="2" height="8" x="18.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 26
                moveTo(x = 20.0f, y = 26.0f)
                // l -2 0
                lineToRelative(dx = -2.0f, dy = 0.0f)
                // l 0 -8
                lineToRelative(dx = 0.0f, dy = -8.0f)
                // l 2 -0z
                lineToRelative(dx = 2.0f, dy = -0.0f)
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
        }.build().also { _chartClusterBar = it }
    }

@Suppress("ObjectPropertyName")
private var _chartClusterBar: ImageVector? = null
