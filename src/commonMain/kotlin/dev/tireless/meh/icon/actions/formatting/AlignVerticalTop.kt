package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignVerticalTop: ImageVector
    get() {
        val current = _alignVerticalTop
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AlignVerticalTop",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 20 h-4 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v7 a2 2 0 0 1 -2 2 m-4 -9 v7 h4 v-7Z m-8 17 H8 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v15 a2 2 0 0 1 -2 2 M8 11 v15 h4 V11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 20
                moveTo(x = 24.0f, y = 20.0f)
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
                // v -7
                verticalLineToRelative(dy = -7.0f)
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // m -4 -9
                moveToRelative(dx = -4.0f, dy = -9.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -7z
                verticalLineToRelative(dy = -7.0f)
                close()
                // m -8 17
                moveToRelative(dx = -8.0f, dy = 17.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // v 15
                verticalLineToRelative(dy = 15.0f)
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
                // M 8 11
                moveTo(x = 8.0f, y = 11.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 11z
                verticalLineTo(y = 11.0f)
                close()
            }
            // <rect width="28" height="2" x="2.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
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
        }.build().also { _alignVerticalTop = it }
    }

@Suppress("ObjectPropertyName")
private var _alignVerticalTop: ImageVector? = null
