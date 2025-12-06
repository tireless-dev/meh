package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextStrikethrough: ImageVector
    get() {
        val current = _textStrikethrough
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextStrikethrough",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 15 H17.96 l-1.34 -.34 c-2.81 -.66 -4.4 -1.15 -4.4 -3.42 a2.9 2.9 0 0 1 .79 -2.14 A4.8 4.8 0 0 1 16.02 8 c2.83 -.06 4.14 .9 5.2 2.36 l1.62 -1.18 A7.5 7.5 0 0 0 16 6 a6.8 6.8 0 0 0 -4.4 1.66 4.8 4.8 0 0 0 -1.39 3.57 A4.4 4.4 0 0 0 11.96 15 H4 v2 h13.65 c1.97 .57 3.15 1.31 3.18 3.36 a3.1 3.1 0 0 1 -.87 2.4 A5.8 5.8 0 0 1 16.24 24 a6.6 6.6 0 0 1 -5.14 -2.7 l-1.54 1.3 a8.5 8.5 0 0 0 6.65 3.4 h.1 a7.7 7.7 0 0 0 5.05 -1.82 5 5 0 0 0 1.46 -3.85 A5 5 0 0 0 21.68 17 H28Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 15
                moveTo(x = 28.0f, y = 15.0f)
                // H 17.96
                horizontalLineTo(x = 17.96f)
                // l -1.34 -0.34
                lineToRelative(dx = -1.34f, dy = -0.34f)
                // c -2.81 -0.66 -4.4 -1.15 -4.4 -3.42
                curveToRelative(
                    dx1 = -2.81f,
                    dy1 = -0.66f,
                    dx2 = -4.4f,
                    dy2 = -1.15f,
                    dx3 = -4.4f,
                    dy3 = -3.42f,
                )
                // a 2.9 2.9 0 0 1 0.79 -2.14
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.79f,
                    dy1 = -2.14f,
                )
                // A 4.8 4.8 0 0 1 16.02 8
                arcTo(
                    horizontalEllipseRadius = 4.8f,
                    verticalEllipseRadius = 4.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.02f,
                    y1 = 8.0f,
                )
                // c 2.83 -0.06 4.14 0.9 5.2 2.36
                curveToRelative(
                    dx1 = 2.83f,
                    dy1 = -0.06f,
                    dx2 = 4.14f,
                    dy2 = 0.9f,
                    dx3 = 5.2f,
                    dy3 = 2.36f,
                )
                // l 1.62 -1.18
                lineToRelative(dx = 1.62f, dy = -1.18f)
                // A 7.5 7.5 0 0 0 16 6
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 6.0f,
                )
                // a 6.8 6.8 0 0 0 -4.4 1.66
                arcToRelative(
                    a = 6.8f,
                    b = 6.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.4f,
                    dy1 = 1.66f,
                )
                // a 4.8 4.8 0 0 0 -1.39 3.57
                arcToRelative(
                    a = 4.8f,
                    b = 4.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.39f,
                    dy1 = 3.57f,
                )
                // A 4.4 4.4 0 0 0 11.96 15
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.96f,
                    y1 = 15.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 13.65
                horizontalLineToRelative(dx = 13.65f)
                // c 1.97 0.57 3.15 1.31 3.18 3.36
                curveToRelative(
                    dx1 = 1.97f,
                    dy1 = 0.57f,
                    dx2 = 3.15f,
                    dy2 = 1.31f,
                    dx3 = 3.18f,
                    dy3 = 3.36f,
                )
                // a 3.1 3.1 0 0 1 -0.87 2.4
                arcToRelative(
                    a = 3.1f,
                    b = 3.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.87f,
                    dy1 = 2.4f,
                )
                // A 5.8 5.8 0 0 1 16.24 24
                arcTo(
                    horizontalEllipseRadius = 5.8f,
                    verticalEllipseRadius = 5.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.24f,
                    y1 = 24.0f,
                )
                // a 6.6 6.6 0 0 1 -5.14 -2.7
                arcToRelative(
                    a = 6.6f,
                    b = 6.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.14f,
                    dy1 = -2.7f,
                )
                // l -1.54 1.3
                lineToRelative(dx = -1.54f, dy = 1.3f)
                // a 8.5 8.5 0 0 0 6.65 3.4
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.65f,
                    dy1 = 3.4f,
                )
                // h 0.1
                horizontalLineToRelative(dx = 0.1f)
                // a 7.7 7.7 0 0 0 5.05 -1.82
                arcToRelative(
                    a = 7.7f,
                    b = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.05f,
                    dy1 = -1.82f,
                )
                // a 5 5 0 0 0 1.46 -3.85
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.46f,
                    dy1 = -3.85f,
                )
                // A 5 5 0 0 0 21.68 17
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.68f,
                    y1 = 17.0f,
                )
                // H 28z
                horizontalLineTo(x = 28.0f)
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
        }.build().also { _textStrikethrough = it }
    }

@Suppress("ObjectPropertyName")
private var _textStrikethrough: ImageVector? = null
