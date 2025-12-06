package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Comments: ImageVector
    get() {
        val current = _comments
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Comments",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.32 9.5 -8 -7 A2 2 0 0 0 20 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V11 a2 2 0 0 0 -.68 -1.5 M28 28 H4 V4 h14 v7 a2 2 0 0 0 2 2 h8z m-8 -17 V4 l8 7z M6 20.08 c0 -4.04 2.01 -6.29 5.18 -6.29 2.15 0 3.54 .91 4.38 2.77 l-1.94 1.03 c-.35 -1.07 -1.1 -1.79 -2.44 -1.79 -1.69 0 -2.77 1.22 -2.77 3.27 v1.9 c0 2.06 1.08 3.22 2.77 3.22 1.35 0 2.2 -.82 2.6 -1.9 l1.83 1.08 a4.6 4.6 0 0 1 -4.43 2.84 C8 26.2 6 24.13 6 20.08 m10.82 1.41 c0 -2.87 1.6 -4.67 4.16 -4.67 2.58 0 4.18 1.8 4.18 4.67 0 2.9 -1.6 4.72 -4.18 4.72 -2.56 0 -4.16 -1.83 -4.16 -4.72 m6.04 .85 v-1.67 c0 -1.34 -.73 -2.08 -1.88 -2.08 -1.13 0 -1.86 .74 -1.86 2.08 v1.67 c0 1.36 .73 2.1 1.86 2.1 1.15 0 1.87 -.74 1.87 -2.1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.32 9.5
                moveTo(x = 29.32f, y = 9.5f)
                // l -8 -7
                lineToRelative(dx = -8.0f, dy = -7.0f)
                // A 2 2 0 0 0 20 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // V 11
                verticalLineTo(y = 11.0f)
                // a 2 2 0 0 0 -0.68 -1.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.68f,
                    dy1 = -1.5f,
                )
                // M 28 28
                moveTo(x = 28.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m -8 -17
                moveToRelative(dx = -8.0f, dy = -17.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // l 8 7z
                lineToRelative(dx = 8.0f, dy = 7.0f)
                close()
                // M 6 20.08
                moveTo(x = 6.0f, y = 20.08f)
                // c 0 -4.04 2.01 -6.29 5.18 -6.29
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.04f,
                    dx2 = 2.01f,
                    dy2 = -6.29f,
                    dx3 = 5.18f,
                    dy3 = -6.29f,
                )
                // c 2.15 0 3.54 0.91 4.38 2.77
                curveToRelative(
                    dx1 = 2.15f,
                    dy1 = 0.0f,
                    dx2 = 3.54f,
                    dy2 = 0.91f,
                    dx3 = 4.38f,
                    dy3 = 2.77f,
                )
                // l -1.94 1.03
                lineToRelative(dx = -1.94f, dy = 1.03f)
                // c -0.35 -1.07 -1.1 -1.79 -2.44 -1.79
                curveToRelative(
                    dx1 = -0.35f,
                    dy1 = -1.07f,
                    dx2 = -1.1f,
                    dy2 = -1.79f,
                    dx3 = -2.44f,
                    dy3 = -1.79f,
                )
                // c -1.69 0 -2.77 1.22 -2.77 3.27
                curveToRelative(
                    dx1 = -1.69f,
                    dy1 = 0.0f,
                    dx2 = -2.77f,
                    dy2 = 1.22f,
                    dx3 = -2.77f,
                    dy3 = 3.27f,
                )
                // v 1.9
                verticalLineToRelative(dy = 1.9f)
                // c 0 2.06 1.08 3.22 2.77 3.22
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.06f,
                    dx2 = 1.08f,
                    dy2 = 3.22f,
                    dx3 = 2.77f,
                    dy3 = 3.22f,
                )
                // c 1.35 0 2.2 -0.82 2.6 -1.9
                curveToRelative(
                    dx1 = 1.35f,
                    dy1 = 0.0f,
                    dx2 = 2.2f,
                    dy2 = -0.82f,
                    dx3 = 2.6f,
                    dy3 = -1.9f,
                )
                // l 1.83 1.08
                lineToRelative(dx = 1.83f, dy = 1.08f)
                // a 4.6 4.6 0 0 1 -4.43 2.84
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.43f,
                    dy1 = 2.84f,
                )
                // C 8 26.2 6 24.13 6 20.08
                curveTo(
                    x1 = 8.0f,
                    y1 = 26.2f,
                    x2 = 6.0f,
                    y2 = 24.13f,
                    x3 = 6.0f,
                    y3 = 20.08f,
                )
                // m 10.82 1.41
                moveToRelative(dx = 10.82f, dy = 1.41f)
                // c 0 -2.87 1.6 -4.67 4.16 -4.67
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.87f,
                    dx2 = 1.6f,
                    dy2 = -4.67f,
                    dx3 = 4.16f,
                    dy3 = -4.67f,
                )
                // c 2.58 0 4.18 1.8 4.18 4.67
                curveToRelative(
                    dx1 = 2.58f,
                    dy1 = 0.0f,
                    dx2 = 4.18f,
                    dy2 = 1.8f,
                    dx3 = 4.18f,
                    dy3 = 4.67f,
                )
                // c 0 2.9 -1.6 4.72 -4.18 4.72
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.9f,
                    dx2 = -1.6f,
                    dy2 = 4.72f,
                    dx3 = -4.18f,
                    dy3 = 4.72f,
                )
                // c -2.56 0 -4.16 -1.83 -4.16 -4.72
                curveToRelative(
                    dx1 = -2.56f,
                    dy1 = 0.0f,
                    dx2 = -4.16f,
                    dy2 = -1.83f,
                    dx3 = -4.16f,
                    dy3 = -4.72f,
                )
                // m 6.04 0.85
                moveToRelative(dx = 6.04f, dy = 0.85f)
                // v -1.67
                verticalLineToRelative(dy = -1.67f)
                // c 0 -1.34 -0.73 -2.08 -1.88 -2.08
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.34f,
                    dx2 = -0.73f,
                    dy2 = -2.08f,
                    dx3 = -1.88f,
                    dy3 = -2.08f,
                )
                // c -1.13 0 -1.86 0.74 -1.86 2.08
                curveToRelative(
                    dx1 = -1.13f,
                    dy1 = 0.0f,
                    dx2 = -1.86f,
                    dy2 = 0.74f,
                    dx3 = -1.86f,
                    dy3 = 2.08f,
                )
                // v 1.67
                verticalLineToRelative(dy = 1.67f)
                // c 0 1.36 0.73 2.1 1.86 2.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.36f,
                    dx2 = 0.73f,
                    dy2 = 2.1f,
                    dx3 = 1.86f,
                    dy3 = 2.1f,
                )
                // c 1.15 0 1.87 -0.74 1.87 -2.1
                curveToRelative(
                    dx1 = 1.15f,
                    dy1 = 0.0f,
                    dx2 = 1.87f,
                    dy2 = -0.74f,
                    dx3 = 1.87f,
                    dy3 = -2.1f,
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
        }.build().also { _comments = it }
    }

@Suppress("ObjectPropertyName")
private var _comments: ImageVector? = null
