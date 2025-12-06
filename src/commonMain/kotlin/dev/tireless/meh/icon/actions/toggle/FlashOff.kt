package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashOff: ImageVector
    get() {
        val current = _flashOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlashOff",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M11.13 6.89 11.8 4 h8 l-2 9 H23 l-2.49 3.25 1.43 1.43 3.87 -5.07 a1 1 0 0 0 .11 -1 A1 1 0 0 0 25 11 h-4.75 L22 3.22 a1 1 0 0 0 -.2 -.85 A1 1 0 0 0 21 2 H11 a1 1 0 0 0 -1 .77 L9.46 5.22Z M30 28.59 l-9.31 -9.31 -1.42 -1.43 -8.67 -8.66 -1.67 -1.67 L3.41 2 2 3.41 l6.4 6.41 L7 15.77 A1 1 0 0 0 8 17 h4.83 L11 28.85 a1 1 0 0 0 .6 1.07 A1 1 0 0 0 12 30 a1 1 0 0 0 .79 -.39 l6.68 -8.73 L28.59 30Z M9.26 15 l.81 -3.52 L13.59 15Z m4.32 10.28 L15 16.37 l3 3.08Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.13 6.89
                moveTo(x = 11.13f, y = 6.89f)
                // L 11.8 4
                lineTo(x = 11.8f, y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // l -2 9
                lineToRelative(dx = -2.0f, dy = 9.0f)
                // H 23
                horizontalLineTo(x = 23.0f)
                // l -2.49 3.25
                lineToRelative(dx = -2.49f, dy = 3.25f)
                // l 1.43 1.43
                lineToRelative(dx = 1.43f, dy = 1.43f)
                // l 3.87 -5.07
                lineToRelative(dx = 3.87f, dy = -5.07f)
                // a 1 1 0 0 0 0.11 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.11f,
                    dy1 = -1.0f,
                )
                // A 1 1 0 0 0 25 11
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 11.0f,
                )
                // h -4.75
                horizontalLineToRelative(dx = -4.75f)
                // L 22 3.22
                lineTo(x = 22.0f, y = 3.22f)
                // a 1 1 0 0 0 -0.2 -0.85
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.2f,
                    dy1 = -0.85f,
                )
                // A 1 1 0 0 0 21 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 2.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 1 1 0 0 0 -1 0.77
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.77f,
                )
                // L 9.46 5.22z
                lineTo(x = 9.46f, y = 5.22f)
                close()
                // M 30 28.59
                moveTo(x = 30.0f, y = 28.59f)
                // l -9.31 -9.31
                lineToRelative(dx = -9.31f, dy = -9.31f)
                // l -1.42 -1.43
                lineToRelative(dx = -1.42f, dy = -1.43f)
                // l -8.67 -8.66
                lineToRelative(dx = -8.67f, dy = -8.66f)
                // l -1.67 -1.67
                lineToRelative(dx = -1.67f, dy = -1.67f)
                // L 3.41 2
                lineTo(x = 3.41f, y = 2.0f)
                // L 2 3.41
                lineTo(x = 2.0f, y = 3.41f)
                // l 6.4 6.41
                lineToRelative(dx = 6.4f, dy = 6.41f)
                // L 7 15.77
                lineTo(x = 7.0f, y = 15.77f)
                // A 1 1 0 0 0 8 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 17.0f,
                )
                // h 4.83
                horizontalLineToRelative(dx = 4.83f)
                // L 11 28.85
                lineTo(x = 11.0f, y = 28.85f)
                // a 1 1 0 0 0 0.6 1.07
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.6f,
                    dy1 = 1.07f,
                )
                // A 1 1 0 0 0 12 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 30.0f,
                )
                // a 1 1 0 0 0 0.79 -0.39
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.79f,
                    dy1 = -0.39f,
                )
                // l 6.68 -8.73
                lineToRelative(dx = 6.68f, dy = -8.73f)
                // L 28.59 30z
                lineTo(x = 28.59f, y = 30.0f)
                close()
                // M 9.26 15
                moveTo(x = 9.26f, y = 15.0f)
                // l 0.81 -3.52
                lineToRelative(dx = 0.81f, dy = -3.52f)
                // L 13.59 15z
                lineTo(x = 13.59f, y = 15.0f)
                close()
                // m 4.32 10.28
                moveToRelative(dx = 4.32f, dy = 10.28f)
                // L 15 16.37
                lineTo(x = 15.0f, y = 16.37f)
                // l 3 3.08z
                lineToRelative(dx = 3.0f, dy = 3.08f)
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
        }.build().also { _flashOff = it }
    }

@Suppress("ObjectPropertyName")
private var _flashOff: ImageVector? = null
