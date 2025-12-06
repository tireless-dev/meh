package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Compare: ImageVector
    get() {
        val current = _compare
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Compare",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 6 H18 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10 v2 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 M4 15 h6.17 l-2.58 2.59 L9 19 l5 -5 -5 -5 -1.41 1.41 L10.17 13 H4 V4 h12 v20 H4Z m12 13 v-2 a2 2 0 0 0 2 -2 V8 h10 v9 h-6.17 l2.58 -2.59 L23 13 l-5 5 5 5 1.41 -1.41 L21.83 19 H28 v9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // M 4 15
                moveTo(x = 4.0f, y = 15.0f)
                // h 6.17
                horizontalLineToRelative(dx = 6.17f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 9 19
                lineTo(x = 9.0f, y = 19.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 10.17 13
                lineTo(x = 10.17f, y = 13.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 12 13
                moveToRelative(dx = 12.0f, dy = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -6.17
                horizontalLineToRelative(dx = -6.17f)
                // l 2.58 -2.59
                lineToRelative(dx = 2.58f, dy = -2.59f)
                // L 23 13
                lineTo(x = 23.0f, y = 13.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 21.83 19
                lineTo(x = 21.83f, y = 19.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // v 9z
                verticalLineToRelative(dy = 9.0f)
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
        }.build().also { _compare = it }
    }

@Suppress("ObjectPropertyName")
private var _compare: ImageVector? = null
