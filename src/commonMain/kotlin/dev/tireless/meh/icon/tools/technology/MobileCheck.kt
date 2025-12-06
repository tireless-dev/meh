package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileCheck: ImageVector
    get() {
        val current = _mobileCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileCheck",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="20.0 27.18 17.41 24.59 16.0 26.0 20.0 30.0 28.0 22.0 26.59 20.59 20.0 27.18" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 27.18
                moveTo(x = 20.0f, y = 27.18f)
                // L 17.41 24.59
                lineTo(x = 17.41f, y = 24.59f)
                // L 16 26
                lineTo(x = 16.0f, y = 26.0f)
                // L 20 30
                lineTo(x = 20.0f, y = 30.0f)
                // L 28 22
                lineTo(x = 28.0f, y = 22.0f)
                // L 26.59 20.59
                lineTo(x = 26.59f, y = 20.59f)
                // L 20 27.18z
                lineTo(x = 20.0f, y = 27.18f)
                close()
            }
            // M10 28 V10 h12 v9 h2 V6 a2 2 0 0 0 -2 -2 H10 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h4 v-2Z m0 -22 h12 v2 H10Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 0 -22
                moveToRelative(dx = 0.0f, dy = -22.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10z
                horizontalLineTo(x = 10.0f)
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
        }.build().also { _mobileCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileCheck: ImageVector? = null
