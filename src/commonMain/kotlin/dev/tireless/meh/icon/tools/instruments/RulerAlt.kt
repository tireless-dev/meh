package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RulerAlt: ImageVector
    get() {
        val current = _rulerAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RulerAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29.41 21.67 10.34 2.58 a2 2 0 0 0 -2.83 0 L2.59 7.51 a2 2 0 0 0 0 2.82 l19.07 19.09 A2 2 0 0 0 23.08 30 a2 2 0 0 0 1.41 -.58 l4.92 -4.93 a2 2 0 0 0 0 -2.82 M23.08 28 4 8.92 8.92 4 l3.79 3.79 L10.46 10 l1.41 1.41 2.25 -2.21 4.13 4.13 L16 15.58 17.42 17 l2.25 -2.25 4.13 4.13 -2.25 2.25 L23 22.54 l2.25 -2.25 L28 23.08Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.41 21.67
                moveTo(x = 29.41f, y = 21.67f)
                // L 10.34 2.58
                lineTo(x = 10.34f, y = 2.58f)
                // a 2 2 0 0 0 -2.83 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 0.0f,
                )
                // L 2.59 7.51
                lineTo(x = 2.59f, y = 7.51f)
                // a 2 2 0 0 0 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // l 19.07 19.09
                lineToRelative(dx = 19.07f, dy = 19.09f)
                // A 2 2 0 0 0 23.08 30
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.08f,
                    y1 = 30.0f,
                )
                // a 2 2 0 0 0 1.41 -0.58
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.41f,
                    dy1 = -0.58f,
                )
                // l 4.92 -4.93
                lineToRelative(dx = 4.92f, dy = -4.93f)
                // a 2 2 0 0 0 0 -2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.82f,
                )
                // M 23.08 28
                moveTo(x = 23.08f, y = 28.0f)
                // L 4 8.92
                lineTo(x = 4.0f, y = 8.92f)
                // L 8.92 4
                lineTo(x = 8.92f, y = 4.0f)
                // l 3.79 3.79
                lineToRelative(dx = 3.79f, dy = 3.79f)
                // L 10.46 10
                lineTo(x = 10.46f, y = 10.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // l 2.25 -2.21
                lineToRelative(dx = 2.25f, dy = -2.21f)
                // l 4.13 4.13
                lineToRelative(dx = 4.13f, dy = 4.13f)
                // L 16 15.58
                lineTo(x = 16.0f, y = 15.58f)
                // L 17.42 17
                lineTo(x = 17.42f, y = 17.0f)
                // l 2.25 -2.25
                lineToRelative(dx = 2.25f, dy = -2.25f)
                // l 4.13 4.13
                lineToRelative(dx = 4.13f, dy = 4.13f)
                // l -2.25 2.25
                lineToRelative(dx = -2.25f, dy = 2.25f)
                // L 23 22.54
                lineTo(x = 23.0f, y = 22.54f)
                // l 2.25 -2.25
                lineToRelative(dx = 2.25f, dy = -2.25f)
                // L 28 23.08z
                lineTo(x = 28.0f, y = 23.08f)
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
        }.build().also { _rulerAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _rulerAlt: ImageVector? = null
