package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Touch2: ImageVector
    get() {
        val current = _touch2
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Touch2",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 15 h-2 a11 11 0 0 0 -22 0 H3 a13 13 0 0 1 26 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 15
                moveTo(x = 29.0f, y = 15.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 11 11 0 0 0 -22 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -22.0f,
                    dy1 = 0.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 13 13 0 0 1 26 0
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 26.0f,
                    dy1 = 0.0f,
                )
            }
            // M25 28 h-2 V15 a7 7 0 1 0 -14 0 v13 H7 V15 a9 9 0 0 1 18 0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 28
                moveTo(x = 25.0f, y = 28.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 15
                verticalLineTo(y = 15.0f)
                // a 7 7 0 1 0 -14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 15
                verticalLineTo(y = 15.0f)
                // a 9 9 0 0 1 18 0z
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M21 20 H11 v-5 a5 5 0 0 1 10 0Z m-8 -2 h6 v-3 a3 3 0 0 0 -6 0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 20
                moveTo(x = 21.0f, y = 20.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 5 5 0 0 1 10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                close()
                // m -8 -2
                moveToRelative(dx = -8.0f, dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 3 3 0 0 0 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
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
        }.build().also { _touch2 = it }
    }

@Suppress("ObjectPropertyName")
private var _touch2: ImageVector? = null
