package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CollapseAll: ImageVector
    get() {
        val current = _collapseAll
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CollapseAll",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 15 h-2 V7 H13 V5 h15 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M25 20 h-2 v-8 H8 v-2 h15 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 20
                moveTo(x = 25.0f, y = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // M18 27 H4 a2 2 0 0 1 -2 -2 v-8 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 M4 17 v8 h14 v-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 27
                moveTo(x = 18.0f, y = 27.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // M 4 17
                moveTo(x = 4.0f, y = 17.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
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
        }.build().also { _collapseAll = it }
    }

@Suppress("ObjectPropertyName")
private var _collapseAll: ImageVector? = null
