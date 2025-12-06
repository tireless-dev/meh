package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FitToHeight: ImageVector
    get() {
        val current = _fitToHeight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FitToHeight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="11.0 10.0 12.41 11.41 15.0 8.83 15.0 23.17 12.41 20.59 11.0 22.0 16.0 27.0 21.0 22.0 19.59 20.59 17.0 23.17 17.0 8.83 19.59 11.41 21.0 10.0 16.0 5.0 11.0 10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 10
                moveTo(x = 11.0f, y = 10.0f)
                // L 12.41 11.41
                lineTo(x = 12.41f, y = 11.41f)
                // L 15 8.83
                lineTo(x = 15.0f, y = 8.83f)
                // L 15 23.17
                lineTo(x = 15.0f, y = 23.17f)
                // L 12.41 20.59
                lineTo(x = 12.41f, y = 20.59f)
                // L 11 22
                lineTo(x = 11.0f, y = 22.0f)
                // L 16 27
                lineTo(x = 16.0f, y = 27.0f)
                // L 21 22
                lineTo(x = 21.0f, y = 22.0f)
                // L 19.59 20.59
                lineTo(x = 19.59f, y = 20.59f)
                // L 17 23.17
                lineTo(x = 17.0f, y = 23.17f)
                // L 17 8.83
                lineTo(x = 17.0f, y = 8.83f)
                // L 19.59 11.41
                lineTo(x = 19.59f, y = 11.41f)
                // L 21 10
                lineTo(x = 21.0f, y = 10.0f)
                // L 16 5
                lineTo(x = 16.0f, y = 5.0f)
                // L 11 10z
                lineTo(x = 11.0f, y = 10.0f)
                close()
            }
            // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 4 v24 h24 V4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
        }.build().also { _fitToHeight = it }
    }

@Suppress("ObjectPropertyName")
private var _fitToHeight: ImageVector? = null
