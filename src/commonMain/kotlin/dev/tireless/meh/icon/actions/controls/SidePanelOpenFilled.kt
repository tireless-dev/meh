package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SidePanelOpenFilled: ImageVector
    get() {
        val current = _sidePanelOpenFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SidePanelOpenFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 22 H12 v-9 h10.2 l-3.6 3.6 L20 22 l6 -6 -6 -6 -1.4 1.4 3.6 3.6 H12 V6 h16z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 4
                moveTo(x = 28.0f, y = 4.0f)
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
                // m 0 22
                moveToRelative(dx = 0.0f, dy = 22.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h 10.2
                horizontalLineToRelative(dx = 10.2f)
                // l -3.6 3.6
                lineToRelative(dx = -3.6f, dy = 3.6f)
                // L 20 22
                lineTo(x = 20.0f, y = 22.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // l -1.4 1.4
                lineToRelative(dx = -1.4f, dy = 1.4f)
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
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
        }.build().also { _sidePanelOpenFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _sidePanelOpenFilled: ImageVector? = null
