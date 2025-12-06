package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterPp: ImageVector
    get() {
        val current = _letterPp
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LetterPp",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 13 h-6 v14 h2 v-4 h4 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-4 8 v-6 h4 v6Z M9 23 H7 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 H9Z m0 -7 h4 v-5 H9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // M 9 23
                moveTo(x = 9.0f, y = 23.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // H 9z
                horizontalLineTo(x = 9.0f)
                close()
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
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
        }.build().also { _letterPp = it }
    }

@Suppress("ObjectPropertyName")
private var _letterPp: ImageVector? = null
