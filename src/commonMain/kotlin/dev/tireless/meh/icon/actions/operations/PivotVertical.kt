package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PivotVertical: ImageVector
    get() {
        val current = _pivotVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PivotVertical",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H4 V8 h24z m0 -22 H4 V4 h24z m-6 4 h2 v16 h-2z m-7 4 5 5 -5 5 -1.4 -1.4 2.6 -2.6 H10 a2 2 0 0 1 -2 -2 v-6 h2 v6 h6.2 l-2.6 -2.6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
                close()
                // m 0 -22
                moveToRelative(dx = 0.0f, dy = -22.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
                close()
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m -7 4
                moveToRelative(dx = -7.0f, dy = 4.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l -1.4 -1.4
                lineToRelative(dx = -1.4f, dy = -1.4f)
                // l 2.6 -2.6
                lineToRelative(dx = 2.6f, dy = -2.6f)
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6.2
                horizontalLineToRelative(dx = 6.2f)
                // l -2.6 -2.6z
                lineToRelative(dx = -2.6f, dy = -2.6f)
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
        }.build().also { _pivotVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _pivotVertical: ImageVector? = null
