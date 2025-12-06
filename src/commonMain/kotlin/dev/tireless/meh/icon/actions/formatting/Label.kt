package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Label: ImageVector
    get() {
        val current = _label
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Label",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 13 h-5 v2 h5 v2 h-4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h6 v-8 a2 2 0 0 0 -2 -2 m0 8 h-4 v-2 h4Z M13 9 H9 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // M 13 9
                moveTo(x = 13.0f, y = 9.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 11
                verticalLineTo(y = 11.0f)
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
                // m -4 7
                moveToRelative(dx = -4.0f, dy = 7.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
            }
            // M28 28 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2 M4 6 v20 h24 V6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 28
                moveTo(x = 28.0f, y = 28.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
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
        }.build().also { _label = it }
    }

@Suppress("ObjectPropertyName")
private var _label: ImageVector? = null
