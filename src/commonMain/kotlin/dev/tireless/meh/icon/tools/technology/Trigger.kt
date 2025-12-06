package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trigger: ImageVector
    get() {
        val current = _trigger
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Trigger",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m2 19 1.4 1.4 L9 14.8 l5.6 5.6 L16 19 l-7 -7z m26.6 -7.4 L23 17.2 l-5.6 -5.6 L16 13 l7 7 7 -7z M9 22 a2 2 0 1 0 0 4 2 2 0 0 0 0 -4 m14 -12 a2 2 0 1 0 0 -4 2 2 0 0 0 0 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // l 1.4 1.4
                lineToRelative(dx = 1.4f, dy = 1.4f)
                // L 9 14.8
                lineTo(x = 9.0f, y = 14.8f)
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
                // L 16 19
                lineTo(x = 16.0f, y = 19.0f)
                // l -7 -7z
                lineToRelative(dx = -7.0f, dy = -7.0f)
                close()
                // m 26.6 -7.4
                moveToRelative(dx = 26.6f, dy = -7.4f)
                // L 23 17.2
                lineTo(x = 23.0f, y = 17.2f)
                // l -5.6 -5.6
                lineToRelative(dx = -5.6f, dy = -5.6f)
                // L 16 13
                lineTo(x = 16.0f, y = 13.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // l 7 -7z
                lineToRelative(dx = 7.0f, dy = -7.0f)
                close()
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // a 2 2 0 1 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // m 14 -12
                moveToRelative(dx = 14.0f, dy = -12.0f)
                // a 2 2 0 1 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
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
        }.build().also { _trigger = it }
    }

@Suppress("ObjectPropertyName")
private var _trigger: ImageVector? = null
