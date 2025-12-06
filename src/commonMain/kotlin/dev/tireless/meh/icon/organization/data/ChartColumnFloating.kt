package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartColumnFloating: ImageVector
    get() {
        val current = _chartColumnFloating
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartColumnFloating",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 22 h-8 V4 h8Z m-6 -2 h4 V6 h-4Z m-6 4 H8 V10 h8Z m-6 -2 h4 V12 h-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 22
                moveTo(x = 28.0f, y = 22.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -6 -2
                moveToRelative(dx = -6.0f, dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -6 -2
                moveToRelative(dx = -6.0f, dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
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
        }.build().also { _chartColumnFloating = it }
    }

@Suppress("ObjectPropertyName")
private var _chartColumnFloating: ImageVector? = null
