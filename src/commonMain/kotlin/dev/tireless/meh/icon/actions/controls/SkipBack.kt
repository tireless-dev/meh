package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkipBack: ImageVector
    get() {
        val current = _skipBack
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SkipBack",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 28 a1 1 0 0 1 -.5 -.13 l-19 -11 a1 1 0 0 1 0 -1.74 l19 -11 a1 1 0 0 1 1 0 A1 1 0 0 1 28 5 v22 a1 1 0 0 1 -1 1 M10 16 l16 9.27 V6.73Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 28
                moveTo(x = 27.0f, y = 28.0f)
                // a 1 1 0 0 1 -0.5 -0.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = -0.13f,
                )
                // l -19 -11
                lineToRelative(dx = -19.0f, dy = -11.0f)
                // a 1 1 0 0 1 0 -1.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.74f,
                )
                // l 19 -11
                lineToRelative(dx = 19.0f, dy = -11.0f)
                // a 1 1 0 0 1 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // A 1 1 0 0 1 28 5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 5.0f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // l 16 9.27
                lineToRelative(dx = 16.0f, dy = 9.27f)
                // V 6.73z
                verticalLineTo(y = 6.73f)
                close()
            }
            // <rect width="2" height="24" x="2.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _skipBack = it }
    }

@Suppress("ObjectPropertyName")
private var _skipBack: ImageVector? = null
