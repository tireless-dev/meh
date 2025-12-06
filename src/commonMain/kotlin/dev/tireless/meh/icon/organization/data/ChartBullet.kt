package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBullet: ImageVector
    get() {
        val current = _chartBullet
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartBullet",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 22 H16 v-1 h-2 v1 H2 v6 h12 v1 h2 v-1 h14Z M4 26 v-2 h10 v2Z m24 0 H16 v-2 h12Z m2 -13 h-6 v-1 h-2 v1 H2 v6 h20 v1 h2 v-1 h6Z M4 17 v-2 h18 v2Z m24 0 h-4 v-2 h4Z m2 -13 H10 V3 H8 v1 H2 v6 h6 v1 h2 v-1 h20Z M4 8 V6 h4 v2Z m24 0 H10 V6 h18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
                // M 4 26
                moveTo(x = 4.0f, y = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m 2 -13
                moveToRelative(dx = 2.0f, dy = -13.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 2 -13
                moveToRelative(dx = 2.0f, dy = -13.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 20z
                horizontalLineToRelative(dx = 20.0f)
                close()
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 18z
                horizontalLineToRelative(dx = 18.0f)
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
        }.build().also { _chartBullet = it }
    }

@Suppress("ObjectPropertyName")
private var _chartBullet: ImageVector? = null
