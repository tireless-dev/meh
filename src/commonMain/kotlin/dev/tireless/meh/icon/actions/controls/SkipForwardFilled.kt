package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkipForwardFilled: ImageVector
    get() {
        val current = _skipForwardFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SkipForwardFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="24" x="28.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 4
                moveTo(x = 28.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M5 28 a1 1 0 0 1 -1 -1 V5 a1 1 0 0 1 1.5 -.87 l19 11 a1 1 0 0 1 0 1.73 l-19 11 A1 1 0 0 1 5 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 28
                moveTo(x = 5.0f, y = 28.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 1 1.5 -0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -0.87f,
                )
                // l 19 11
                lineToRelative(dx = 19.0f, dy = 11.0f)
                // a 1 1 0 0 1 0 1.73
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.73f,
                )
                // l -19 11
                lineToRelative(dx = -19.0f, dy = 11.0f)
                // A 1 1 0 0 1 5 28
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 28.0f,
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
        }.build().also { _skipForwardFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _skipForwardFilled: ImageVector? = null
