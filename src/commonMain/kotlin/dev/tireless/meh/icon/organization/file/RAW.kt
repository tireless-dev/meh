package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RAW: ImageVector
    get() {
        val current = _rAW
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RAW",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="29.2 9.0 28.86 17.0 28.6 21.54 28.19 18.0 27.51 12.54 25.49 12.54 24.81 18.0 24.4 21.54 24.14 17.0 23.8 9.0 22.0 9.0 23.0 23.0 25.27 23.0 26.03 18.07 26.49 14.0 26.5 13.97 26.51 14.0 26.97 18.07 27.73 23.0 30.0 23.0 31.0 9.0 29.2 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.2 9
                moveTo(x = 29.2f, y = 9.0f)
                // L 28.86 17
                lineTo(x = 28.86f, y = 17.0f)
                // L 28.6 21.54
                lineTo(x = 28.6f, y = 21.54f)
                // L 28.19 18
                lineTo(x = 28.19f, y = 18.0f)
                // L 27.51 12.54
                lineTo(x = 27.51f, y = 12.54f)
                // L 25.49 12.54
                lineTo(x = 25.49f, y = 12.54f)
                // L 24.81 18
                lineTo(x = 24.81f, y = 18.0f)
                // L 24.4 21.54
                lineTo(x = 24.4f, y = 21.54f)
                // L 24.14 17
                lineTo(x = 24.14f, y = 17.0f)
                // L 23.8 9
                lineTo(x = 23.8f, y = 9.0f)
                // L 22 9
                lineTo(x = 22.0f, y = 9.0f)
                // L 23 23
                lineTo(x = 23.0f, y = 23.0f)
                // L 25.27 23
                lineTo(x = 25.27f, y = 23.0f)
                // L 26.03 18.07
                lineTo(x = 26.03f, y = 18.07f)
                // L 26.49 14
                lineTo(x = 26.49f, y = 14.0f)
                // L 26.5 13.97
                lineTo(x = 26.5f, y = 13.97f)
                // L 26.51 14
                lineTo(x = 26.51f, y = 14.0f)
                // L 26.97 18.07
                lineTo(x = 26.97f, y = 18.07f)
                // L 27.73 23
                lineTo(x = 27.73f, y = 23.0f)
                // L 30 23
                lineTo(x = 30.0f, y = 23.0f)
                // L 31 9
                lineTo(x = 31.0f, y = 9.0f)
                // L 29.2 9z
                lineTo(x = 29.2f, y = 9.0f)
                close()
            }
            // M18 9 h-4 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5Z m-4 -1 v-4 a2 2 0 0 0 -2 -2 H2 v14 h2 v-6 h1.48 l2.34 6 H10 l-2.37 -6 H8 a2 2 0 0 0 2 -2 m-6 -4 h4 v4 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 11
                verticalLineTo(y = 11.0f)
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
                // m -4 7
                moveToRelative(dx = -4.0f, dy = 7.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
                // m -4 -1
                moveToRelative(dx = -4.0f, dy = -1.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 1.48
                horizontalLineToRelative(dx = 1.48f)
                // l 2.34 6
                lineToRelative(dx = 2.34f, dy = 6.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // l -2.37 -6
                lineToRelative(dx = -2.37f, dy = -6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // m -6 -4
                moveToRelative(dx = -6.0f, dy = -4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _rAW = it }
    }

@Suppress("ObjectPropertyName")
private var _rAW: ImageVector? = null
