package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataStructured: ImageVector
    get() {
        val current = _dataStructured
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataStructured",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="9.0" cy="7.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M27 22.14 V18 a2 2 0 0 0 -2 -2 h-8 v-4 h9 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h9 v4 H7 a2 2 0 0 0 -2 2 v4.14 a4 4 0 1 0 2 0 V18 h8 v4 h-3 v8 h8 v-8 h-3 v-4 h8 v4.14 a4 4 0 1 0 2 0 M8 26 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 m10 -2 v4 h-4 v-4Z M6 10 V4 h20 v6Z m20 18 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 22.14
                moveTo(x = 27.0f, y = 22.14f)
                // V 18
                verticalLineTo(y = 18.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 4.14
                verticalLineToRelative(dy = 4.14f)
                // a 4 4 0 1 0 2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // V 18
                verticalLineTo(y = 18.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4.14
                verticalLineToRelative(dy = 4.14f)
                // a 4 4 0 1 0 2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // a 2 2 0 1 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
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
                // m 10 -2
                moveToRelative(dx = 10.0f, dy = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // m 20 18
                moveToRelative(dx = 20.0f, dy = 18.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
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
        }.build().also { _dataStructured = it }
    }

@Suppress("ObjectPropertyName")
private var _dataStructured: ImageVector? = null
