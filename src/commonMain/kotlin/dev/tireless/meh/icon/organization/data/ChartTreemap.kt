package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartTreemap: ImageVector
    get() {
        val current = _chartTreemap
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartTreemap",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 12 h-5 V4 h5Z M16 4 h5 v10 h-5Z m-2 0 v16 H4 V4Z M4 22 h10 v6 H4Z m12 6 V16 h12 v12Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 0 12
                moveToRelative(dx = 0.0f, dy = 12.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 12 6
                moveToRelative(dx = 12.0f, dy = 6.0f)
                // V 16
                verticalLineTo(y = 16.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
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
        }.build().also { _chartTreemap = it }
    }

@Suppress("ObjectPropertyName")
private var _chartTreemap: ImageVector? = null
