package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fragments: ImageVector
    get() {
        val current = _fragments
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Fragments",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 30 a5 5 0 0 1 -4.9 -4 H6 a2 2 0 0 1 -2 -2 v-5 h1 a3 3 0 0 0 0 -6 H4 V8 a2 2 0 0 1 2 -2 h5.1 a5 5 0 0 1 9.8 0 H26 a2 2 0 0 1 2 2 v5 h-1 a3 3 0 0 0 0 6 h1 v5 a2 2 0 0 1 -2 2 h-5.1 a5 5 0 0 1 -4.9 4 M6 20.9 V24 h7 v1 a3 3 0 0 0 6 0 v-1 h7 v-3.1 a5 5 0 0 1 0 -9.8 V8 h-7 V7 a3 3 0 0 0 -6 0 v1 H6 v3.1 a5 5 0 0 1 0 9.8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 5 5 0 0 1 -4.9 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.9f,
                    dy1 = -4.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 3 3 0 0 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 5.1
                horizontalLineToRelative(dx = 5.1f)
                // a 5 5 0 0 1 9.8 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.8f,
                    dy1 = 0.0f,
                )
                // H 26
                horizontalLineTo(x = 26.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 3 3 0 0 0 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // h -5.1
                horizontalLineToRelative(dx = -5.1f)
                // a 5 5 0 0 1 -4.9 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.9f,
                    dy1 = 4.0f,
                )
                // M 6 20.9
                moveTo(x = 6.0f, y = 20.9f)
                // V 24
                verticalLineTo(y = 24.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 3 3 0 0 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -3.1
                verticalLineToRelative(dy = -3.1f)
                // a 5 5 0 0 1 0 -9.8
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -9.8f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // a 3 3 0 0 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 3.1
                verticalLineToRelative(dy = 3.1f)
                // a 5 5 0 0 1 0 9.8
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 9.8f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 32
                moveTo(x = 32.0f, y = 32.0f)
                // l -32 0
                lineToRelative(dx = -32.0f, dy = 0.0f)
                // l 0 -32
                lineToRelative(dx = 0.0f, dy = -32.0f)
                // l 32 -0z
                lineToRelative(dx = 32.0f, dy = -0.0f)
                close()
            }
        }.build().also { _fragments = it }
    }

@Suppress("ObjectPropertyName")
private var _fragments: ImageVector? = null
