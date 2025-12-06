package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartPopulation: ImageVector
    get() {
        val current = _chartPopulation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartPopulation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 22 H17 v-2 h9 v-6 h-9 v-2 h5 V6 h-5 V2 h-2 v4 h-5 v6 h5 v2 H6 v6 h9 v2 H2 v6 h13 v2 h2 v-2 h13Z M20 8 v2 h-3 V8Z m-8 2 V8 h3 v2Z m12 6 v2 h-7 v-2Z M8 18 v-2 h7 v2Z m-4 8 v-2 h11 v2Z m24 0 H17 v-2 h11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 13z
                horizontalLineToRelative(dx = 13.0f)
                close()
                // M 20 8
                moveTo(x = 20.0f, y = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
                // m -8 2
                moveToRelative(dx = -8.0f, dy = 2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 12 6
                moveToRelative(dx = 12.0f, dy = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 11z
                horizontalLineToRelative(dx = 11.0f)
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
        }.build().also { _chartPopulation = it }
    }

@Suppress("ObjectPropertyName")
private var _chartPopulation: ImageVector? = null
