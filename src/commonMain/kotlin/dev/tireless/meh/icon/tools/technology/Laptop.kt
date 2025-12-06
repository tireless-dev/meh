package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Laptop: ImageVector
    get() {
        val current = _laptop
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Laptop",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 24 H6 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 M6 8 v14 h20 V8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 24
                moveTo(x = 26.0f, y = 24.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
            }
            // <rect width="28" height="2" x="2.0" y="26.005" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 26.005
                moveTo(x = 2.0f, y = 26.005f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
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
        }.build().also { _laptop = it }
    }

@Suppress("ObjectPropertyName")
private var _laptop: ImageVector? = null
