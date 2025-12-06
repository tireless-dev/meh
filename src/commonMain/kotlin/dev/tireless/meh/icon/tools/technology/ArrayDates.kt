package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrayDates: ImageVector
    get() {
        val current = _arrayDates
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArrayDates",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 8 h-2 V6 h-2 v2 h-6 V6 h-2 v2 H9 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 M9 22 v-7 h14 v7z m14 -9 H9 v-3 h2 v1 h2 v-1 h6 v1 h2 v-1 h2z M4 2 h4 v2 H4 v4 H2 V4 a2 2 0 0 1 2 -2 m26 2 v4 h-2 V4 h-4 V2 h4 a2 2 0 0 1 2 2 M8 28 v2 H4 a2 2 0 0 1 -2 -2 v-4 h2 v4z m22 -4 v4 a2 2 0 0 1 -2 2 h-4 v-2 h4 v-4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 8
                moveTo(x = 23.0f, y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 7z
                verticalLineToRelative(dy = 7.0f)
                close()
                // m 14 -9
                moveToRelative(dx = 14.0f, dy = -9.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // m 26 2
                moveToRelative(dx = 26.0f, dy = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
                close()
                // m 22 -4
                moveToRelative(dx = 22.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
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
        }.build().also { _arrayDates = it }
    }

@Suppress("ObjectPropertyName")
private var _arrayDates: ImageVector? = null
