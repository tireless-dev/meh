package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectTarget: ImageVector
    get() {
        val current = _connectTarget
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ConnectTarget",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="28" x="28.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // m20 10 -1.41 1.41 L22.17 15 H11.9 a5 5 0 1 0 0 2 h10.27 l-3.58 3.59 L20 22 l6 -6Z M7 19 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 22.17 15
                lineTo(x = 22.17f, y = 15.0f)
                // H 11.9
                horizontalLineTo(x = 11.9f)
                // a 5 5 0 1 0 0 2
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 10.27
                horizontalLineToRelative(dx = 10.27f)
                // l -3.58 3.59
                lineToRelative(dx = -3.58f, dy = 3.59f)
                // L 20 22
                lineTo(x = 20.0f, y = 22.0f)
                // l 6 -6z
                lineToRelative(dx = 6.0f, dy = -6.0f)
                close()
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // a 3 3 0 1 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
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
        }.build().also { _connectTarget = it }
    }

@Suppress("ObjectPropertyName")
private var _connectTarget: ImageVector? = null
