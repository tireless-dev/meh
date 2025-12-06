package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BottomPanelClose: ImageVector
    get() {
        val current = _bottomPanelClose
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BottomPanelClose",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 16 v6 H4 v-6z m0 -14 v12 H4 V6 h11 v6.17 l-3.59 -3.58 L10 10 l6 6 6 -6 -1.41 -1.41 L17 12.17 V6z
            path(
                strokeLineWidth = 0.0f,
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
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // m 0 -14
                moveToRelative(dx = 0.0f, dy = -14.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 6.17
                verticalLineToRelative(dy = 6.17f)
                // l -3.59 -3.58
                lineToRelative(dx = -3.59f, dy = -3.58f)
                // L 10 10
                lineTo(x = 10.0f, y = 10.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // L 17 12.17
                lineTo(x = 17.0f, y = 12.17f)
                // V 6z
                verticalLineTo(y = 6.0f)
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
        }.build().also { _bottomPanelClose = it }
    }

@Suppress("ObjectPropertyName")
private var _bottomPanelClose: ImageVector? = null
