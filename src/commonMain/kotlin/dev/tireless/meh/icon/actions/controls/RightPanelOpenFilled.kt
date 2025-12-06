package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RightPanelOpenFilled: ImageVector
    get() {
        val current = _rightPanelOpenFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RightPanelOpenFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M2 6 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 m2 0 h16 v9 H9.83 l3.58 -3.59 L12 10 l-6 6 6 6 1.41 -1.41 L9.83 17 H20 v9 H4z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 6
                moveTo(x = 2.0f, y = 6.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 9.83
                horizontalLineTo(x = 9.83f)
                // l 3.58 -3.59
                lineToRelative(dx = 3.58f, dy = -3.59f)
                // L 12 10
                lineTo(x = 12.0f, y = 10.0f)
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // L 9.83 17
                lineTo(x = 9.83f, y = 17.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _rightPanelOpenFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _rightPanelOpenFilled: ImageVector? = null
