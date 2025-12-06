package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DoubleAxisChartBar: ImageVector
    get() {
        val current = _doubleAxisChartBar
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DoubleAxisChartBar",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 4 V2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h26 v-2 H4 v-3 h22 v-7 H4 v-4 h14 V7 H4 V4z m-6 16 v3 H4 v-3z M16 9 v3 H4 V9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // m -6 16
                moveToRelative(dx = -6.0f, dy = 16.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -3z
                verticalLineToRelative(dy = -3.0f)
                close()
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 9z
                verticalLineTo(y = 9.0f)
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
        }.build().also { _doubleAxisChartBar = it }
    }

@Suppress("ObjectPropertyName")
private var _doubleAxisChartBar: ImageVector? = null
