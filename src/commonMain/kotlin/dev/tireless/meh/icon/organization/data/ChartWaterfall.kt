package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartWaterfall: ImageVector
    get() {
        val current = _chartWaterfall
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartWaterfall",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 28 V18 h-2 v10 h-4 V4 h-2 v24 H10 V14 H8 v14 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 28
                moveTo(x = 28.0f, y = 28.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 14
                verticalLineTo(y = 14.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
            // <rect width="2" height="14" x="14.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _chartWaterfall = it }
    }

@Suppress("ObjectPropertyName")
private var _chartWaterfall: ImageVector? = null
