package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CenterToFit: ImageVector
    get() {
        val current = _centerToFit
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CenterToFit",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="8.0 2.0 2.0 2.0 2.0 8.0 4.0 8.0 4.0 4.0 8.0 4.0 8.0 2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // L 2 2
                lineTo(x = 2.0f, y = 2.0f)
                // L 2 8
                lineTo(x = 2.0f, y = 8.0f)
                // L 4 8
                lineTo(x = 4.0f, y = 8.0f)
                // L 4 4
                lineTo(x = 4.0f, y = 4.0f)
                // L 8 4
                lineTo(x = 8.0f, y = 4.0f)
                // L 8 2z
                lineTo(x = 8.0f, y = 2.0f)
                close()
            }
            // <polygon points="24.0 2.0 30.0 2.0 30.0 8.0 28.0 8.0 28.0 4.0 24.0 4.0 24.0 2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 2
                moveTo(x = 24.0f, y = 2.0f)
                // L 30 2
                lineTo(x = 30.0f, y = 2.0f)
                // L 30 8
                lineTo(x = 30.0f, y = 8.0f)
                // L 28 8
                lineTo(x = 28.0f, y = 8.0f)
                // L 28 4
                lineTo(x = 28.0f, y = 4.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 24 2z
                lineTo(x = 24.0f, y = 2.0f)
                close()
            }
            // <polygon points="8.0 30.0 2.0 30.0 2.0 24.0 4.0 24.0 4.0 28.0 8.0 28.0 8.0 30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 30
                moveTo(x = 8.0f, y = 30.0f)
                // L 2 30
                lineTo(x = 2.0f, y = 30.0f)
                // L 2 24
                lineTo(x = 2.0f, y = 24.0f)
                // L 4 24
                lineTo(x = 4.0f, y = 24.0f)
                // L 4 28
                lineTo(x = 4.0f, y = 28.0f)
                // L 8 28
                lineTo(x = 8.0f, y = 28.0f)
                // L 8 30z
                lineTo(x = 8.0f, y = 30.0f)
                close()
            }
            // <polygon points="24.0 30.0 30.0 30.0 30.0 24.0 28.0 24.0 28.0 28.0 24.0 28.0 24.0 30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 30
                moveTo(x = 24.0f, y = 30.0f)
                // L 30 30
                lineTo(x = 30.0f, y = 30.0f)
                // L 30 24
                lineTo(x = 30.0f, y = 24.0f)
                // L 28 24
                lineTo(x = 28.0f, y = 24.0f)
                // L 28 28
                lineTo(x = 28.0f, y = 28.0f)
                // L 24 28
                lineTo(x = 24.0f, y = 28.0f)
                // L 24 30z
                lineTo(x = 24.0f, y = 30.0f)
                close()
            }
            // M24 24 H8 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 M8 10 v12 h16 V10Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 24
                moveTo(x = 24.0f, y = 24.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 10z
                verticalLineTo(y = 10.0f)
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
        }.build().also { _centerToFit = it }
    }

@Suppress("ObjectPropertyName")
private var _centerToFit: ImageVector? = null
