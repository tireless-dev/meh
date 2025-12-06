package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mobile: ImageVector
    get() {
        val current = _mobile
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Mobile",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 4 H10 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 2 v2 H10 V6Z M10 28 V10 h12 v18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 4
                moveTo(x = 22.0f, y = 4.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 18z
                verticalLineToRelative(dy = 18.0f)
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
        }.build().also { _mobile = it }
    }

@Suppress("ObjectPropertyName")
private var _mobile: ImageVector? = null
