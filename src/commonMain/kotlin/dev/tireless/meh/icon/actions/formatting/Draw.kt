package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Draw: ImageVector
    get() {
        val current = _draw
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Draw",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M19.14 28 a3.42 3.42 0 0 1 -2.42 -5.85 L21.86 17 a1.42 1.42 0 1 0 -2 -2 L13 21.85 a3.5 3.5 0 0 1 -4.85 0 3.43 3.43 0 0 1 0 -4.84 l8.58 -8.58 a1.42 1.42 0 1 0 -2 -2 L6.41 14.7 5 13.3 13.29 5 a3.43 3.43 0 0 1 4.84 4.85 l-8.57 8.57 a1.4 1.4 0 0 0 0 2 1.45 1.45 0 0 0 2 0 l6.86 -6.86 a3.43 3.43 0 1 1 4.85 4.84 l-5.15 5.15 a1.42 1.42 0 0 0 2 2 l4.44 -4.43 L26 22.56 21.56 27 a3.4 3.4 0 0 1 -2.42 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.14 28
                moveTo(x = 19.14f, y = 28.0f)
                // a 3.42 3.42 0 0 1 -2.42 -5.85
                arcToRelative(
                    a = 3.42f,
                    b = 3.42f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.42f,
                    dy1 = -5.85f,
                )
                // L 21.86 17
                lineTo(x = 21.86f, y = 17.0f)
                // a 1.42 1.42 0 1 0 -2 -2
                arcToRelative(
                    a = 1.42f,
                    b = 1.42f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // L 13 21.85
                lineTo(x = 13.0f, y = 21.85f)
                // a 3.5 3.5 0 0 1 -4.85 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.85f,
                    dy1 = 0.0f,
                )
                // a 3.43 3.43 0 0 1 0 -4.84
                arcToRelative(
                    a = 3.43f,
                    b = 3.43f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.84f,
                )
                // l 8.58 -8.58
                lineToRelative(dx = 8.58f, dy = -8.58f)
                // a 1.42 1.42 0 1 0 -2 -2
                arcToRelative(
                    a = 1.42f,
                    b = 1.42f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // L 6.41 14.7
                lineTo(x = 6.41f, y = 14.7f)
                // L 5 13.3
                lineTo(x = 5.0f, y = 13.3f)
                // L 13.29 5
                lineTo(x = 13.29f, y = 5.0f)
                // a 3.43 3.43 0 0 1 4.84 4.85
                arcToRelative(
                    a = 3.43f,
                    b = 3.43f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.84f,
                    dy1 = 4.85f,
                )
                // l -8.57 8.57
                lineToRelative(dx = -8.57f, dy = 8.57f)
                // a 1.4 1.4 0 0 0 0 2
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1.45 1.45 0 0 0 2 0
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 6.86 -6.86
                lineToRelative(dx = 6.86f, dy = -6.86f)
                // a 3.43 3.43 0 1 1 4.85 4.84
                arcToRelative(
                    a = 3.43f,
                    b = 3.43f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.85f,
                    dy1 = 4.84f,
                )
                // l -5.15 5.15
                lineToRelative(dx = -5.15f, dy = 5.15f)
                // a 1.42 1.42 0 0 0 2 2
                arcToRelative(
                    a = 1.42f,
                    b = 1.42f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // l 4.44 -4.43
                lineToRelative(dx = 4.44f, dy = -4.43f)
                // L 26 22.56
                lineTo(x = 26.0f, y = 22.56f)
                // L 21.56 27
                lineTo(x = 21.56f, y = 27.0f)
                // a 3.4 3.4 0 0 1 -2.42 1
                arcToRelative(
                    a = 3.4f,
                    b = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.42f,
                    dy1 = 1.0f,
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
        }.build().also { _draw = it }
    }

@Suppress("ObjectPropertyName")
private var _draw: ImageVector? = null
