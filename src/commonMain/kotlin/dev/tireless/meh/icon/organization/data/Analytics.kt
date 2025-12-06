package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Analytics: ImageVector
    get() {
        val current = _analytics
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Analytics",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // M30 9 h-7 v2 h3.59 L19 18.59 l-4.29 -4.3 a1 1 0 0 0 -1.42 0 L6 21.59 7.41 23 14 16.41 l4.29 4.3 a1 1 0 0 0 1.42 0 l8.29 -8.3 V16 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 9
                moveTo(x = 30.0f, y = 9.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.59
                horizontalLineToRelative(dx = 3.59f)
                // L 19 18.59
                lineTo(x = 19.0f, y = 18.59f)
                // l -4.29 -4.3
                lineToRelative(dx = -4.29f, dy = -4.3f)
                // a 1 1 0 0 0 -1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.0f,
                )
                // L 6 21.59
                lineTo(x = 6.0f, y = 21.59f)
                // L 7.41 23
                lineTo(x = 7.41f, y = 23.0f)
                // L 14 16.41
                lineTo(x = 14.0f, y = 16.41f)
                // l 4.29 4.3
                lineToRelative(dx = 4.29f, dy = 4.3f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // l 8.29 -8.3
                lineToRelative(dx = 8.29f, dy = -8.3f)
                // V 16
                verticalLineTo(y = 16.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _analytics = it }
    }

@Suppress("ObjectPropertyName")
private var _analytics: ImageVector? = null
