package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JPG: ImageVector
    get() {
        val current = _jPG
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.JPG",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 23 h-6 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 h-6 v10 h4 v-4 h-2 v-2 h4Z m-16 0 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z m-6 7 H4 a2 2 0 0 1 -2 -2 v-2 h2 v2 h4 V9 h2 v12 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 23
                moveTo(x = 30.0f, y = 23.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // V 11
                verticalLineTo(y = 11.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m -16 0
                moveToRelative(dx = -16.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -6 7
                moveToRelative(dx = -6.0f, dy = 7.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
        }.build().also { _jPG = it }
    }

@Suppress("ObjectPropertyName")
private var _jPG: ImageVector? = null
