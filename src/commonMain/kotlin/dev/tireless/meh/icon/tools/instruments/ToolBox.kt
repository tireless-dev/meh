package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolBox: ImageVector
    get() {
        val current = _toolBox
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ToolBox",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 9 h-3 V6 a2 2 0 0 0 -2 -2 H10 a2 2 0 0 0 -2 2 v3 H5 a3 3 0 0 0 -3 3 v14 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V12 a3 3 0 0 0 -3 -3 M10 6 h12 v3 H10Z m18 20 H4 v-9 h8 v5 h8 v-5 h8Z m-14 -9 h4 v3 h-4Z M4 15 v-3 a1 1 0 0 1 1 -1 h22 a1 1 0 0 1 1 1 v3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 9
                moveTo(x = 27.0f, y = 9.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // V 12
                verticalLineTo(y = 12.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // M 10 6
                moveTo(x = 10.0f, y = 6.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
                close()
                // m 18 20
                moveToRelative(dx = 18.0f, dy = 20.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -14 -9
                moveToRelative(dx = -14.0f, dy = -9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 4 15
                moveTo(x = 4.0f, y = 15.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 3z
                verticalLineToRelative(dy = 3.0f)
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
        }.build().also { _toolBox = it }
    }

@Suppress("ObjectPropertyName")
private var _toolBox: ImageVector? = null
