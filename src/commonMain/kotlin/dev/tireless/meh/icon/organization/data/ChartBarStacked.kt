package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBarStacked: ImageVector
    get() {
        val current = _chartBarStacked
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartBarStacked",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 28 v-3 h22 v-8 H4 v-4 h14 V5 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z m20 -5 H14 v-4 h10Z m-8 -12 h-6 V7 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // m 20 -5
                moveToRelative(dx = 20.0f, dy = -5.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
                // m -8 -12
                moveToRelative(dx = -8.0f, dy = -12.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _chartBarStacked = it }
    }

@Suppress("ObjectPropertyName")
private var _chartBarStacked: ImageVector? = null
