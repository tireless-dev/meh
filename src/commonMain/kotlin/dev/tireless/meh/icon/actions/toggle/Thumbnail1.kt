package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thumbnail1: ImageVector
    get() {
        val current = _thumbnail1
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Thumbnail1",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M8 30 H4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m-4 -6 v4 h4 v-4Z m14 6 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m-4 -6 v4 h4 v-4Z m14 6 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m-4 -6 v4 h4 v-4Z m4 -4 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 M4 4 v14 h24 V4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 30
                moveTo(x = 8.0f, y = 30.0f)
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
                // m -4 -6
                moveToRelative(dx = -4.0f, dy = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // m 14 6
                moveToRelative(dx = 14.0f, dy = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // m -4 -6
                moveToRelative(dx = -4.0f, dy = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // m 14 6
                moveToRelative(dx = 14.0f, dy = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // m -4 -6
                moveToRelative(dx = -4.0f, dy = -6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
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
        }.build().also { _thumbnail1 = it }
    }

@Suppress("ObjectPropertyName")
private var _thumbnail1: ImageVector? = null
