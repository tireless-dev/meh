package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsDownFilled: ImageVector
    get() {
        val current = _thumbsDownFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ThumbsDownFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="5" height="14" x="2.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // M23 2 H9 v14.8 l3.04 4.57 .85 5.91 A2 2 0 0 0 14.87 29 H15 a3 3 0 0 0 3 -3 v-6 h8 a4 4 0 0 0 4 -4 V9 a7 7 0 0 0 -7 -7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 2
                moveTo(x = 23.0f, y = 2.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 14.8
                verticalLineToRelative(dy = 14.8f)
                // l 3.04 4.57
                lineToRelative(dx = 3.04f, dy = 4.57f)
                // l 0.85 5.91
                lineToRelative(dx = 0.85f, dy = 5.91f)
                // A 2 2 0 0 0 14.87 29
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.87f,
                    y1 = 29.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
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
        }.build().also { _thumbsDownFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _thumbsDownFilled: ImageVector? = null
