package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagNone: ImageVector
    get() {
        val current = _tagNone
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TagNone",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m23.1 10.32 6.9 -6.9 L28.59 2 2 28.59 3.41 30 l6.91 -6.9 6.32 6.31 a2 2 0 0 0 2.83 0 l9.94 -9.94 a2 2 0 0 0 0 -2.83Z M18.05 28 l-6.32 -6.32 9.94 -9.94 L28 18.06Z M10 14 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.1 10.32
                moveTo(x = 23.1f, y = 10.32f)
                // l 6.9 -6.9
                lineToRelative(dx = 6.9f, dy = -6.9f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // L 2 28.59
                lineTo(x = 2.0f, y = 28.59f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 6.91 -6.9
                lineToRelative(dx = 6.91f, dy = -6.9f)
                // l 6.32 6.31
                lineToRelative(dx = 6.32f, dy = 6.31f)
                // a 2 2 0 0 0 2.83 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.83f,
                    dy1 = 0.0f,
                )
                // l 9.94 -9.94
                lineToRelative(dx = 9.94f, dy = -9.94f)
                // a 2 2 0 0 0 0 -2.83z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.83f,
                )
                close()
                // M 18.05 28
                moveTo(x = 18.05f, y = 28.0f)
                // l -6.32 -6.32
                lineToRelative(dx = -6.32f, dy = -6.32f)
                // l 9.94 -9.94
                lineToRelative(dx = 9.94f, dy = -9.94f)
                // L 28 18.06z
                lineTo(x = 28.0f, y = 18.06f)
                close()
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
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
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // a 2 2 0 1 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
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
            }
            // m7.5 20.26 1.4 -1.41 -4.9 -4.9 V4 h9.94 l4.9 4.9 1.42 -1.4 -4.9 -4.91 A2 2 0 0 0 13.94 2 H4 a2 2 0 0 0 -2 2 v9.94 a2 2 0 0 0 .59 1.42Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.5 20.26
                moveTo(x = 7.5f, y = 20.26f)
                // l 1.4 -1.41
                lineToRelative(dx = 1.4f, dy = -1.41f)
                // l -4.9 -4.9
                lineToRelative(dx = -4.9f, dy = -4.9f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 9.94
                horizontalLineToRelative(dx = 9.94f)
                // l 4.9 4.9
                lineToRelative(dx = 4.9f, dy = 4.9f)
                // l 1.42 -1.4
                lineToRelative(dx = 1.42f, dy = -1.4f)
                // l -4.9 -4.91
                lineToRelative(dx = -4.9f, dy = -4.91f)
                // A 2 2 0 0 0 13.94 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.94f,
                    y1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 9.94
                verticalLineToRelative(dy = 9.94f)
                // a 2 2 0 0 0 0.59 1.42z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.59f,
                    dy1 = 1.42f,
                )
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
        }.build().also { _tagNone = it }
    }

@Suppress("ObjectPropertyName")
private var _tagNone: ImageVector? = null
