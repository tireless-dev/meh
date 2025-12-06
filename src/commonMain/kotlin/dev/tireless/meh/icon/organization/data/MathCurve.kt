package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MathCurve: ImageVector
    get() {
        val current = _mathCurve
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MathCurve",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M10.36 23.06 c2.41 1.53 5.26 2.94 7.6 2.94 a3.9 3.9 0 0 0 2.85 -1.08 c2.28 -2.3 .14 -6.4 -1.94 -10.38 l5.8 -5.8 a44 44 0 0 1 3.01 2.13 L29 9.35 a45 45 0 0 0 -2.87 -2.06 L30 3.4 28.59 2 l-4.21 4.2 c-3.32 -1.9 -7.1 -3.24 -9.23 -1.12 -2.04 2.05 -.55 5.54 1.27 9.09 l-6.3 6.3 c-1.04 -.71 -2 -1.44 -2.8 -2.1 L6 19.88 a48 48 0 0 0 2.67 2.04 L4 26.58 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H5.41Z m6.2 -16.56 c1.14 -1.14 3.7 -.29 6.34 1.18 l-5 5 c-1.3 -2.62 -2.34 -5.17 -1.34 -6.18 m.83 9.53 c1.58 3.03 3.18 6.3 2 7.47 -1.3 1.31 -4.52 -.03 -7.57 -1.9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.36 23.06
                moveTo(x = 10.36f, y = 23.06f)
                // c 2.41 1.53 5.26 2.94 7.6 2.94
                curveToRelative(
                    dx1 = 2.41f,
                    dy1 = 1.53f,
                    dx2 = 5.26f,
                    dy2 = 2.94f,
                    dx3 = 7.6f,
                    dy3 = 2.94f,
                )
                // a 3.9 3.9 0 0 0 2.85 -1.08
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.85f,
                    dy1 = -1.08f,
                )
                // c 2.28 -2.3 0.14 -6.4 -1.94 -10.38
                curveToRelative(
                    dx1 = 2.28f,
                    dy1 = -2.3f,
                    dx2 = 0.14f,
                    dy2 = -6.4f,
                    dx3 = -1.94f,
                    dy3 = -10.38f,
                )
                // l 5.8 -5.8
                lineToRelative(dx = 5.8f, dy = -5.8f)
                // a 44 44 0 0 1 3.01 2.13
                arcToRelative(
                    a = 44.0f,
                    b = 44.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.01f,
                    dy1 = 2.13f,
                )
                // L 29 9.35
                lineTo(x = 29.0f, y = 9.35f)
                // a 45 45 0 0 0 -2.87 -2.06
                arcToRelative(
                    a = 45.0f,
                    b = 45.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.87f,
                    dy1 = -2.06f,
                )
                // L 30 3.4
                lineTo(x = 30.0f, y = 3.4f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // l -4.21 4.2
                lineToRelative(dx = -4.21f, dy = 4.2f)
                // c -3.32 -1.9 -7.1 -3.24 -9.23 -1.12
                curveToRelative(
                    dx1 = -3.32f,
                    dy1 = -1.9f,
                    dx2 = -7.1f,
                    dy2 = -3.24f,
                    dx3 = -9.23f,
                    dy3 = -1.12f,
                )
                // c -2.04 2.05 -0.55 5.54 1.27 9.09
                curveToRelative(
                    dx1 = -2.04f,
                    dy1 = 2.05f,
                    dx2 = -0.55f,
                    dy2 = 5.54f,
                    dx3 = 1.27f,
                    dy3 = 9.09f,
                )
                // l -6.3 6.3
                lineToRelative(dx = -6.3f, dy = 6.3f)
                // c -1.04 -0.71 -2 -1.44 -2.8 -2.1
                curveToRelative(
                    dx1 = -1.04f,
                    dy1 = -0.71f,
                    dx2 = -2.0f,
                    dy2 = -1.44f,
                    dx3 = -2.8f,
                    dy3 = -2.1f,
                )
                // L 6 19.88
                lineTo(x = 6.0f, y = 19.88f)
                // a 48 48 0 0 0 2.67 2.04
                arcToRelative(
                    a = 48.0f,
                    b = 48.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.67f,
                    dy1 = 2.04f,
                )
                // L 4 26.58
                lineTo(x = 4.0f, y = 26.58f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5.41z
                horizontalLineTo(x = 5.41f)
                close()
                // m 6.2 -16.56
                moveToRelative(dx = 6.2f, dy = -16.56f)
                // c 1.14 -1.14 3.7 -0.29 6.34 1.18
                curveToRelative(
                    dx1 = 1.14f,
                    dy1 = -1.14f,
                    dx2 = 3.7f,
                    dy2 = -0.29f,
                    dx3 = 6.34f,
                    dy3 = 1.18f,
                )
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // c -1.3 -2.62 -2.34 -5.17 -1.34 -6.18
                curveToRelative(
                    dx1 = -1.3f,
                    dy1 = -2.62f,
                    dx2 = -2.34f,
                    dy2 = -5.17f,
                    dx3 = -1.34f,
                    dy3 = -6.18f,
                )
                // m 0.83 9.53
                moveToRelative(dx = 0.83f, dy = 9.53f)
                // c 1.58 3.03 3.18 6.3 2 7.47
                curveToRelative(
                    dx1 = 1.58f,
                    dy1 = 3.03f,
                    dx2 = 3.18f,
                    dy2 = 6.3f,
                    dx3 = 2.0f,
                    dy3 = 7.47f,
                )
                // c -1.3 1.31 -4.52 -0.03 -7.57 -1.9z
                curveToRelative(
                    dx1 = -1.3f,
                    dy1 = 1.31f,
                    dx2 = -4.52f,
                    dy2 = -0.03f,
                    dx3 = -7.57f,
                    dy3 = -1.9f,
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
        }.build().also { _mathCurve = it }
    }

@Suppress("ObjectPropertyName")
private var _mathCurve: ImageVector? = null
