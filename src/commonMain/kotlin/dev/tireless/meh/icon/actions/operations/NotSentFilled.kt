package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotSentFilled: ImageVector
    get() {
        val current = _notSentFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NotSentFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 28.59 3.41 2 2 3.41 l8 8 -7.34 2.65 a1 1 0 0 0 0 1.87 l8.59 3.43 L14.59 16 16 17.41 l-3.37 3.37 3.44 8.59 A1 1 0 0 0 17 30 a1 1 0 0 0 .92 -.66 L20.6 22 l8 8Z m-7.51 -11.76 3.45 -9.49 a1 1 0 0 0 -1.28 -1.28 l-9.49 3.45Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 28.59
                moveTo(x = 30.0f, y = 28.59f)
                // L 3.41 2
                lineTo(x = 3.41f, y = 2.0f)
                // L 2 3.41
                lineTo(x = 2.0f, y = 3.41f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
                // l -7.34 2.65
                lineToRelative(dx = -7.34f, dy = 2.65f)
                // a 1 1 0 0 0 0 1.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.87f,
                )
                // l 8.59 3.43
                lineToRelative(dx = 8.59f, dy = 3.43f)
                // L 14.59 16
                lineTo(x = 14.59f, y = 16.0f)
                // L 16 17.41
                lineTo(x = 16.0f, y = 17.41f)
                // l -3.37 3.37
                lineToRelative(dx = -3.37f, dy = 3.37f)
                // l 3.44 8.59
                lineToRelative(dx = 3.44f, dy = 8.59f)
                // A 1 1 0 0 0 17 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 30.0f,
                )
                // a 1 1 0 0 0 0.92 -0.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.92f,
                    dy1 = -0.66f,
                )
                // L 20.6 22
                lineTo(x = 20.6f, y = 22.0f)
                // l 8 8z
                lineToRelative(dx = 8.0f, dy = 8.0f)
                close()
                // m -7.51 -11.76
                moveToRelative(dx = -7.51f, dy = -11.76f)
                // l 3.45 -9.49
                lineToRelative(dx = 3.45f, dy = -9.49f)
                // a 1 1 0 0 0 -1.28 -1.28
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.28f,
                    dy1 = -1.28f,
                )
                // l -9.49 3.45z
                lineToRelative(dx = -9.49f, dy = 3.45f)
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
        }.build().also { _notSentFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _notSentFilled: ImageVector? = null
