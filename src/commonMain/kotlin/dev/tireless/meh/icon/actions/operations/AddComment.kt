package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddComment: ImageVector
    get() {
        val current = _addComment
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AddComment",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17.74 30 16 29 l4 -7 h6 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h9 v2 H6 a4 4 0 0 1 -4 -4 V8 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v12 a4 4 0 0 1 -4 4 h-4.84Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.74 30
                moveTo(x = 17.74f, y = 30.0f)
                // L 16 29
                lineTo(x = 16.0f, y = 29.0f)
                // l 4 -7
                lineToRelative(dx = 4.0f, dy = -7.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h -4.84z
                horizontalLineToRelative(dx = -4.84f)
                close()
            }
            // <polygon points="17.0 9.0 15.0 9.0 15.0 13.0 11.0 13.0 11.0 15.0 15.0 15.0 15.0 19.0 17.0 19.0 17.0 15.0 21.0 15.0 21.0 13.0 17.0 13.0 17.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 9
                moveTo(x = 17.0f, y = 9.0f)
                // L 15 9
                lineTo(x = 15.0f, y = 9.0f)
                // L 15 13
                lineTo(x = 15.0f, y = 13.0f)
                // L 11 13
                lineTo(x = 11.0f, y = 13.0f)
                // L 11 15
                lineTo(x = 11.0f, y = 15.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
                // L 15 19
                lineTo(x = 15.0f, y = 19.0f)
                // L 17 19
                lineTo(x = 17.0f, y = 19.0f)
                // L 17 15
                lineTo(x = 17.0f, y = 15.0f)
                // L 21 15
                lineTo(x = 21.0f, y = 15.0f)
                // L 21 13
                lineTo(x = 21.0f, y = 13.0f)
                // L 17 13
                lineTo(x = 17.0f, y = 13.0f)
                // L 17 9z
                lineTo(x = 17.0f, y = 9.0f)
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
        }.build().also { _addComment = it }
    }

@Suppress("ObjectPropertyName")
private var _addComment: ImageVector? = null
