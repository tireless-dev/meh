package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileLandscape: ImageVector
    get() {
        val current = _mobileLandscape
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileLandscape",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M3 10 v12 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 m2 0 h2 v12 H5Z m22 12 H9 V10 h18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h 22
                horizontalLineToRelative(dx = 22.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
                // m 22 12
                moveToRelative(dx = 22.0f, dy = 12.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 18z
                horizontalLineToRelative(dx = 18.0f)
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
        }.build().also { _mobileLandscape = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileLandscape: ImageVector? = null
