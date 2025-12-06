package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImageCopy: ImageVector
    get() {
        val current = _imageCopy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ImageCopy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 22 H2 V4 a2 2 0 0 1 2 -2 h18 v2 H4Z m17 -5 a3 3 0 1 0 -3 -3 3 3 0 0 0 3 3 m0 -4 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 17 -5
                moveToRelative(dx = 17.0f, dy = -5.0f)
                // a 3 3 0 1 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
            }
            // M28 7 H9 a2 2 0 0 0 -2 2 v19 a2 2 0 0 0 2 2 h19 a2 2 0 0 0 2 -2 V9 a2 2 0 0 0 -2 -2 m0 21 H9 v-6 l4 -4 5.59 5.59 a2 2 0 0 0 2.82 0 L23 22 l5 5Z m0 -3.83 -3.59 -3.58 a2 2 0 0 0 -2.82 0 L20 22.17 l-5.59 -5.58 a2 2 0 0 0 -2.82 0 L9 19.17 V9 h19Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 7
                moveTo(x = 28.0f, y = 7.0f)
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
                // v 19
                verticalLineToRelative(dy = 19.0f)
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
                // h 19
                horizontalLineToRelative(dx = 19.0f)
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
                // V 9
                verticalLineTo(y = 9.0f)
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
                // m 0 21
                moveToRelative(dx = 0.0f, dy = 21.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l 5.59 5.59
                lineToRelative(dx = 5.59f, dy = 5.59f)
                // a 2 2 0 0 0 2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = 0.0f,
                )
                // L 23 22
                lineTo(x = 23.0f, y = 22.0f)
                // l 5 5z
                lineToRelative(dx = 5.0f, dy = 5.0f)
                close()
                // m 0 -3.83
                moveToRelative(dx = 0.0f, dy = -3.83f)
                // l -3.59 -3.58
                lineToRelative(dx = -3.59f, dy = -3.58f)
                // a 2 2 0 0 0 -2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 0.0f,
                )
                // L 20 22.17
                lineTo(x = 20.0f, y = 22.17f)
                // l -5.59 -5.58
                lineToRelative(dx = -5.59f, dy = -5.58f)
                // a 2 2 0 0 0 -2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 0.0f,
                )
                // L 9 19.17
                lineTo(x = 9.0f, y = 19.17f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 19z
                horizontalLineToRelative(dx = 19.0f)
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
        }.build().also { _imageCopy = it }
    }

@Suppress("ObjectPropertyName")
private var _imageCopy: ImageVector? = null
