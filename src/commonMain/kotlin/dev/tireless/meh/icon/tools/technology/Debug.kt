package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Debug: ImageVector
    get() {
        val current = _debug
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Debug",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.83 20 .34 -2 L25 17.15 v-4.38 l5.06 -1.36 -.51 -1.93 -4.83 1.29 A9 9 0 0 0 20 5 V2 h-2 v2.23 a9 9 0 0 0 -4 0 V2 h-2 v3 a9 9 0 0 0 -4.71 5.82 L2.46 9.48 2 11.41 l5 1.36 v4.38 L1.84 18 l.32 2 L7 19.18 a9 9 0 0 0 .82 3.57 l-4.53 4.54 1.42 1.42 4.19 -4.2 a9 9 0 0 0 14.2 0 l4.19 4.2 1.42 -1.42 -4.54 -4.54 A9 9 0 0 0 25 19.18Z M15 25.92 A7 7 0 0 1 9 19 v-6 h6Z M9.29 11 a7 7 0 0 1 13.42 0Z M23 19 a7 7 0 0 1 -6 6.92 V13 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.83 20
                moveTo(x = 29.83f, y = 20.0f)
                // l 0.34 -2
                lineToRelative(dx = 0.34f, dy = -2.0f)
                // L 25 17.15
                lineTo(x = 25.0f, y = 17.15f)
                // v -4.38
                verticalLineToRelative(dy = -4.38f)
                // l 5.06 -1.36
                lineToRelative(dx = 5.06f, dy = -1.36f)
                // l -0.51 -1.93
                lineToRelative(dx = -0.51f, dy = -1.93f)
                // l -4.83 1.29
                lineToRelative(dx = -4.83f, dy = 1.29f)
                // A 9 9 0 0 0 20 5
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 5.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.23
                verticalLineToRelative(dy = 2.23f)
                // a 9 9 0 0 0 -4 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 9 9 0 0 0 -4.71 5.82
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.71f,
                    dy1 = 5.82f,
                )
                // L 2.46 9.48
                lineTo(x = 2.46f, y = 9.48f)
                // L 2 11.41
                lineTo(x = 2.0f, y = 11.41f)
                // l 5 1.36
                lineToRelative(dx = 5.0f, dy = 1.36f)
                // v 4.38
                verticalLineToRelative(dy = 4.38f)
                // L 1.84 18
                lineTo(x = 1.84f, y = 18.0f)
                // l 0.32 2
                lineToRelative(dx = 0.32f, dy = 2.0f)
                // L 7 19.18
                lineTo(x = 7.0f, y = 19.18f)
                // a 9 9 0 0 0 0.82 3.57
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.82f,
                    dy1 = 3.57f,
                )
                // l -4.53 4.54
                lineToRelative(dx = -4.53f, dy = 4.54f)
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // l 4.19 -4.2
                lineToRelative(dx = 4.19f, dy = -4.2f)
                // a 9 9 0 0 0 14.2 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.2f,
                    dy1 = 0.0f,
                )
                // l 4.19 4.2
                lineToRelative(dx = 4.19f, dy = 4.2f)
                // l 1.42 -1.42
                lineToRelative(dx = 1.42f, dy = -1.42f)
                // l -4.54 -4.54
                lineToRelative(dx = -4.54f, dy = -4.54f)
                // A 9 9 0 0 0 25 19.18z
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 19.18f,
                )
                close()
                // M 15 25.92
                moveTo(x = 15.0f, y = 25.92f)
                // A 7 7 0 0 1 9 19
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 19.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 9.29 11
                moveTo(x = 9.29f, y = 11.0f)
                // a 7 7 0 0 1 13.42 0z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.42f,
                    dy1 = 0.0f,
                )
                close()
                // M 23 19
                moveTo(x = 23.0f, y = 19.0f)
                // a 7 7 0 0 1 -6 6.92
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 6.92f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _debug = it }
    }

@Suppress("ObjectPropertyName")
private var _debug: ImageVector? = null
