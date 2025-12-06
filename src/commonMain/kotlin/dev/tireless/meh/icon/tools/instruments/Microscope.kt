package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Microscope: ImageVector
    get() {
        val current = _microscope
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Microscope",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25.4 24 a7.9 7.9 0 0 0 -1.68 -8.57 3.9 3.9 0 0 0 -1.08 -4.41 l2.78 -2.78 a2 2 0 0 0 0 -2.83 l-2.83 -2.83 a2 2 0 0 0 -2.83 0 L6.59 15.76 a2 2 0 0 0 0 2.83 L9.4 21.4 a2 2 0 0 0 2.83 0 l4.78 -4.77 a3.93 3.93 0 0 0 5.51 .43 A5.9 5.9 0 0 1 23.18 24 H16 v4 H4 v2 h24 v-6Z m-14.57 -4 L8 17.17 l1.88 -1.88 2.83 2.83Z M16 14 a4 4 0 0 0 .08 .75 l-1.96 1.96 -2.83 -2.83 L21.17 4 24 6.83 l-3.25 3.25 A3.98 3.98 0 0 0 16 14 m4 2 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m6 12 h-8 v-2 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.4 24
                moveTo(x = 25.4f, y = 24.0f)
                // a 7.9 7.9 0 0 0 -1.68 -8.57
                arcToRelative(
                    a = 7.9f,
                    b = 7.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.68f,
                    dy1 = -8.57f,
                )
                // a 3.9 3.9 0 0 0 -1.08 -4.41
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.08f,
                    dy1 = -4.41f,
                )
                // l 2.78 -2.78
                lineToRelative(dx = 2.78f, dy = -2.78f)
                // a 2 2 0 0 0 0 -2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.83f,
                )
                // l -2.83 -2.83
                lineToRelative(dx = -2.83f, dy = -2.83f)
                // a 2 2 0 0 0 -2.83 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.83f,
                    dy1 = 0.0f,
                )
                // L 6.59 15.76
                lineTo(x = 6.59f, y = 15.76f)
                // a 2 2 0 0 0 0 2.83
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.83f,
                )
                // L 9.4 21.4
                lineTo(x = 9.4f, y = 21.4f)
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
                // l 4.78 -4.77
                lineToRelative(dx = 4.78f, dy = -4.77f)
                // a 3.93 3.93 0 0 0 5.51 0.43
                arcToRelative(
                    a = 3.93f,
                    b = 3.93f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.51f,
                    dy1 = 0.43f,
                )
                // A 5.9 5.9 0 0 1 23.18 24
                arcTo(
                    horizontalEllipseRadius = 5.9f,
                    verticalEllipseRadius = 5.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.18f,
                    y1 = 24.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // m -14.57 -4
                moveToRelative(dx = -14.57f, dy = -4.0f)
                // L 8 17.17
                lineTo(x = 8.0f, y = 17.17f)
                // l 1.88 -1.88
                lineToRelative(dx = 1.88f, dy = -1.88f)
                // l 2.83 2.83z
                lineToRelative(dx = 2.83f, dy = 2.83f)
                close()
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // a 4 4 0 0 0 0.08 0.75
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.08f,
                    dy1 = 0.75f,
                )
                // l -1.96 1.96
                lineToRelative(dx = -1.96f, dy = 1.96f)
                // l -2.83 -2.83
                lineToRelative(dx = -2.83f, dy = -2.83f)
                // L 21.17 4
                lineTo(x = 21.17f, y = 4.0f)
                // L 24 6.83
                lineTo(x = 24.0f, y = 6.83f)
                // l -3.25 3.25
                lineToRelative(dx = -3.25f, dy = 3.25f)
                // A 3.98 3.98 0 0 0 16 14
                arcTo(
                    horizontalEllipseRadius = 3.98f,
                    verticalEllipseRadius = 3.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 14.0f,
                )
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 6 12
                moveToRelative(dx = 6.0f, dy = 12.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _microscope = it }
    }

@Suppress("ObjectPropertyName")
private var _microscope: ImageVector? = null
