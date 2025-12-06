package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TopDataSets: ImageVector
    get() {
        val current = _topDataSets
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TopDataSets",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M14 2.01 13 2 C7.7 2 2 3.25 2 6 v18 c0 2.75 5.7 4 11 4 l1 -.01 v-2.01 L13 26 c-5.85 0 -8.85 -1.46 -9 -2 v-3.57 C6.13 21.5 9.64 22 13 22 l1 -.01 v-2.01 L13 20 c-5.85 0 -8.85 -1.46 -9 -2 v-3.57 C6.13 15.5 9.64 16 13 16 l1 -.01 c4.99 -.15 10 -1.41 10 -3.99 V6 c0 -2.58 -5.01 -3.84 -10 -3.99 m8 9.98 c-.15 .52 -2.82 1.84 -8 1.99 L13 14 c-5.85 0 -8.85 -1.46 -9 -2 V8.43 C6.13 9.5 9.64 10 13 10 q.5 0 1 -.02 c3.04 -.08 6.08 -.59 8 -1.55z m-8 -4.01 L13 8 C7.16 8 4.16 6.54 4 6.02 V6.01 C4.16 5.46 7.16 4 13 4 l1 .02 c5.15 .15 7.81 1.44 8 1.98 -.19 .54 -2.85 1.83 -8 1.98 m16 20.6 -2.83 -2.83 a5 5 0 1 0 -1.41 1.41 L28.58 30z M23 26 a3 3 0 1 1 0 -6 3 3 0 0 1 0 6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 2.01
                moveTo(x = 14.0f, y = 2.01f)
                // L 13 2
                lineTo(x = 13.0f, y = 2.0f)
                // C 7.7 2 2 3.25 2 6
                curveTo(
                    x1 = 7.7f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.25f,
                    x3 = 2.0f,
                    y3 = 6.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.75 5.7 4 11 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.75f,
                    dx2 = 5.7f,
                    dy2 = 4.0f,
                    dx3 = 11.0f,
                    dy3 = 4.0f,
                )
                // l 1 -0.01
                lineToRelative(dx = 1.0f, dy = -0.01f)
                // v -2.01
                verticalLineToRelative(dy = -2.01f)
                // L 13 26
                lineTo(x = 13.0f, y = 26.0f)
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // C 6.13 21.5 9.64 22 13 22
                curveTo(
                    x1 = 6.13f,
                    y1 = 21.5f,
                    x2 = 9.64f,
                    y2 = 22.0f,
                    x3 = 13.0f,
                    y3 = 22.0f,
                )
                // l 1 -0.01
                lineToRelative(dx = 1.0f, dy = -0.01f)
                // v -2.01
                verticalLineToRelative(dy = -2.01f)
                // L 13 20
                lineTo(x = 13.0f, y = 20.0f)
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // C 6.13 15.5 9.64 16 13 16
                curveTo(
                    x1 = 6.13f,
                    y1 = 15.5f,
                    x2 = 9.64f,
                    y2 = 16.0f,
                    x3 = 13.0f,
                    y3 = 16.0f,
                )
                // l 1 -0.01
                lineToRelative(dx = 1.0f, dy = -0.01f)
                // c 4.99 -0.15 10 -1.41 10 -3.99
                curveToRelative(
                    dx1 = 4.99f,
                    dy1 = -0.15f,
                    dx2 = 10.0f,
                    dy2 = -1.41f,
                    dx3 = 10.0f,
                    dy3 = -3.99f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -2.58 -5.01 -3.84 -10 -3.99
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.58f,
                    dx2 = -5.01f,
                    dy2 = -3.84f,
                    dx3 = -10.0f,
                    dy3 = -3.99f,
                )
                // m 8 9.98
                moveToRelative(dx = 8.0f, dy = 9.98f)
                // c -0.15 0.52 -2.82 1.84 -8 1.99
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 0.52f,
                    dx2 = -2.82f,
                    dy2 = 1.84f,
                    dx3 = -8.0f,
                    dy3 = 1.99f,
                )
                // L 13 14
                lineTo(x = 13.0f, y = 14.0f)
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // V 8.43
                verticalLineTo(y = 8.43f)
                // C 6.13 9.5 9.64 10 13 10
                curveTo(
                    x1 = 6.13f,
                    y1 = 9.5f,
                    x2 = 9.64f,
                    y2 = 10.0f,
                    x3 = 13.0f,
                    y3 = 10.0f,
                )
                // q 0.5 0 1 -0.02
                quadToRelative(
                    dx1 = 0.5f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.02f,
                )
                // c 3.04 -0.08 6.08 -0.59 8 -1.55z
                curveToRelative(
                    dx1 = 3.04f,
                    dy1 = -0.08f,
                    dx2 = 6.08f,
                    dy2 = -0.59f,
                    dx3 = 8.0f,
                    dy3 = -1.55f,
                )
                close()
                // m -8 -4.01
                moveToRelative(dx = -8.0f, dy = -4.01f)
                // L 13 8
                lineTo(x = 13.0f, y = 8.0f)
                // C 7.16 8 4.16 6.54 4 6.02
                curveTo(
                    x1 = 7.16f,
                    y1 = 8.0f,
                    x2 = 4.16f,
                    y2 = 6.54f,
                    x3 = 4.0f,
                    y3 = 6.02f,
                )
                // V 6.01
                verticalLineTo(y = 6.01f)
                // C 4.16 5.46 7.16 4 13 4
                curveTo(
                    x1 = 4.16f,
                    y1 = 5.46f,
                    x2 = 7.16f,
                    y2 = 4.0f,
                    x3 = 13.0f,
                    y3 = 4.0f,
                )
                // l 1 0.02
                lineToRelative(dx = 1.0f, dy = 0.02f)
                // c 5.15 0.15 7.81 1.44 8 1.98
                curveToRelative(
                    dx1 = 5.15f,
                    dy1 = 0.15f,
                    dx2 = 7.81f,
                    dy2 = 1.44f,
                    dx3 = 8.0f,
                    dy3 = 1.98f,
                )
                // c -0.19 0.54 -2.85 1.83 -8 1.98
                curveToRelative(
                    dx1 = -0.19f,
                    dy1 = 0.54f,
                    dx2 = -2.85f,
                    dy2 = 1.83f,
                    dx3 = -8.0f,
                    dy3 = 1.98f,
                )
                // m 16 20.6
                moveToRelative(dx = 16.0f, dy = 20.6f)
                // l -2.83 -2.83
                lineToRelative(dx = -2.83f, dy = -2.83f)
                // a 5 5 0 1 0 -1.41 1.41
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.41f,
                    dy1 = 1.41f,
                )
                // L 28.58 30z
                lineTo(x = 28.58f, y = 30.0f)
                close()
                // M 23 26
                moveTo(x = 23.0f, y = 26.0f)
                // a 3 3 0 1 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
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
        }.build().also { _topDataSets = it }
    }

@Suppress("ObjectPropertyName")
private var _topDataSets: ImageVector? = null
