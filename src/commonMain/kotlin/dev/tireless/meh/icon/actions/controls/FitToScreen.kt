package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FitToScreen: ImageVector
    get() {
        val current = _fitToScreen
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FitToScreen",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="22.0 16.0 24.0 16.0 24.0 8.0 16.0 8.0 16.0 10.0 22.0 10.0 22.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
                // L 24 16
                lineTo(x = 24.0f, y = 16.0f)
                // L 24 8
                lineTo(x = 24.0f, y = 8.0f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // L 16 10
                lineTo(x = 16.0f, y = 10.0f)
                // L 22 10
                lineTo(x = 22.0f, y = 10.0f)
                // L 22 16z
                lineTo(x = 22.0f, y = 16.0f)
                close()
            }
            // <polygon points="8.0 24.0 16.0 24.0 16.0 22.0 10.0 22.0 10.0 16.0 8.0 16.0 8.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 24
                moveTo(x = 8.0f, y = 24.0f)
                // L 16 24
                lineTo(x = 16.0f, y = 24.0f)
                // L 16 22
                lineTo(x = 16.0f, y = 22.0f)
                // L 10 22
                lineTo(x = 10.0f, y = 22.0f)
                // L 10 16
                lineTo(x = 10.0f, y = 16.0f)
                // L 8 16
                lineTo(x = 8.0f, y = 16.0f)
                // L 8 24z
                lineTo(x = 8.0f, y = 24.0f)
                close()
            }
            // M26 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2 M6 6 v20 h20 V6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 28
                moveTo(x = 26.0f, y = 28.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
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
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
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
        }.build().also { _fitToScreen = it }
    }

@Suppress("ObjectPropertyName")
private var _fitToScreen: ImageVector? = null
