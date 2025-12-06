package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkFilled: ImageVector
    get() {
        val current = _checkmarkFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CheckmarkFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-2 19.6 -5 -5 1.6 -1.6 3.4 3.4 7.41 -7.4 1.6 1.59Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m -2 19.6
                moveToRelative(dx = -2.0f, dy = 19.6f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l 1.6 -1.6
                lineToRelative(dx = 1.6f, dy = -1.6f)
                // l 3.4 3.4
                lineToRelative(dx = 3.4f, dy = 3.4f)
                // l 7.41 -7.4
                lineToRelative(dx = 7.41f, dy = -7.4f)
                // l 1.6 1.59z
                lineToRelative(dx = 1.6f, dy = 1.59f)
                close()
            }
            // <polygon points="14.0 21.591 9.0 16.591 10.591 15.0 14.0 18.409 21.41 11.0 23.005 12.585 14.0 21.591" fill="#000" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 14 21.591
                moveTo(x = 14.0f, y = 21.591f)
                // L 9 16.591
                lineTo(x = 9.0f, y = 16.591f)
                // L 10.591 15
                lineTo(x = 10.591f, y = 15.0f)
                // L 14 18.409
                lineTo(x = 14.0f, y = 18.409f)
                // L 21.41 11
                lineTo(x = 21.41f, y = 11.0f)
                // L 23.005 12.585
                lineTo(x = 23.005f, y = 12.585f)
                // L 14 21.591z
                lineTo(x = 14.0f, y = 21.591f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _checkmarkFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _checkmarkFilled: ImageVector? = null
