package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Home: ImageVector
    get() {
        val current = _home
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Home",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
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
            // M16.61 2.21 a1 1 0 0 0 -1.24 0 L1 13.41 2.24 15 4 13.62 V26 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V13.63 L29.76 15 31 13.43Z M18 26 h-4 v-8 h4Z m2 0 v-8 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -2 2 v8 H6 V12.06 l10 -7.79 10 7.8 V26Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.61 2.21
                moveTo(x = 16.61f, y = 2.21f)
                // a 1 1 0 0 0 -1.24 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.24f,
                    dy1 = 0.0f,
                )
                // L 1 13.41
                lineTo(x = 1.0f, y = 13.41f)
                // L 2.24 15
                lineTo(x = 2.24f, y = 15.0f)
                // L 4 13.62
                lineTo(x = 4.0f, y = 13.62f)
                // V 26
                verticalLineTo(y = 26.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // V 13.63
                verticalLineTo(y = 13.63f)
                // L 29.76 15
                lineTo(x = 29.76f, y = 15.0f)
                // L 31 13.43z
                lineTo(x = 31.0f, y = 13.43f)
                close()
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 12.06
                verticalLineTo(y = 12.06f)
                // l 10 -7.79
                lineToRelative(dx = 10.0f, dy = -7.79f)
                // l 10 7.8
                lineToRelative(dx = 10.0f, dy = 7.8f)
                // V 26z
                verticalLineTo(y = 26.0f)
                close()
            }
        }.build().also { _home = it }
    }

@Suppress("ObjectPropertyName")
private var _home: ImageVector? = null
