package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SatisfyDefinition: ImageVector
    get() {
        val current = _satisfyDefinition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SatisfyDefinition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17.4 19.55 c0 -1.84 1.39 -2.75 3.84 -2.75 h1.53 v-.66 c0 -1 -.5 -1.58 -1.67 -1.58 a2.3 2.3 0 0 0 -2.05 1.13 l-1.31 -1.17 c.65 -1.03 1.7 -1.72 3.51 -1.72 2.43 0 3.72 1.16 3.72 3.2 v4.24 h.9 V22 h-1.22 c-.95 0 -1.54 -.62 -1.67 -1.55 h-.1 c-.3 1.15 -1.28 1.76 -2.63 1.76 -1.82 0 -2.86 -1.05 -2.86 -2.66 m5.36 -.24 v-1.19 h-1.42 c-1.15 0 -1.72 .4 -1.72 1.1 v.3 c0 .72 .5 1.08 1.36 1.08 .98 0 1.78 -.44 1.78 -1.29 m-16.14 .9 1.53 -1.48 a4 4 0 0 0 3.09 1.48 c1.4 0 2.12 -.67 2.12 -1.69 0 -.8 -.38 -1.3 -1.64 -1.53 l-1.14 -.18 c-2.43 -.37 -3.6 -1.53 -3.6 -3.5 0 -2.15 1.67 -3.54 4.36 -3.54 1.8 0 3.15 .62 4.12 1.77 l-1.55 1.47 a3.2 3.2 0 0 0 -2.7 -1.24 c-1.28 0 -1.95 .51 -1.95 1.41 0 .91 .51 1.3 1.67 1.5 l1.12 .2 c2.42 .44 3.56 1.52 3.56 3.5 0 2.28 -1.63 3.83 -4.51 3.83 a5.6 5.6 0 0 1 -4.48 -2
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.4 19.55
                moveTo(x = 17.4f, y = 19.55f)
                // c 0 -1.84 1.39 -2.75 3.84 -2.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.84f,
                    dx2 = 1.39f,
                    dy2 = -2.75f,
                    dx3 = 3.84f,
                    dy3 = -2.75f,
                )
                // h 1.53
                horizontalLineToRelative(dx = 1.53f)
                // v -0.66
                verticalLineToRelative(dy = -0.66f)
                // c 0 -1 -0.5 -1.58 -1.67 -1.58
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                    dx2 = -0.5f,
                    dy2 = -1.58f,
                    dx3 = -1.67f,
                    dy3 = -1.58f,
                )
                // a 2.3 2.3 0 0 0 -2.05 1.13
                arcToRelative(
                    a = 2.3f,
                    b = 2.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.05f,
                    dy1 = 1.13f,
                )
                // l -1.31 -1.17
                lineToRelative(dx = -1.31f, dy = -1.17f)
                // c 0.65 -1.03 1.7 -1.72 3.51 -1.72
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = -1.03f,
                    dx2 = 1.7f,
                    dy2 = -1.72f,
                    dx3 = 3.51f,
                    dy3 = -1.72f,
                )
                // c 2.43 0 3.72 1.16 3.72 3.2
                curveToRelative(
                    dx1 = 2.43f,
                    dy1 = 0.0f,
                    dx2 = 3.72f,
                    dy2 = 1.16f,
                    dx3 = 3.72f,
                    dy3 = 3.2f,
                )
                // v 4.24
                verticalLineToRelative(dy = 4.24f)
                // h 0.9
                horizontalLineToRelative(dx = 0.9f)
                // V 22
                verticalLineTo(y = 22.0f)
                // h -1.22
                horizontalLineToRelative(dx = -1.22f)
                // c -0.95 0 -1.54 -0.62 -1.67 -1.55
                curveToRelative(
                    dx1 = -0.95f,
                    dy1 = 0.0f,
                    dx2 = -1.54f,
                    dy2 = -0.62f,
                    dx3 = -1.67f,
                    dy3 = -1.55f,
                )
                // h -0.1
                horizontalLineToRelative(dx = -0.1f)
                // c -0.3 1.15 -1.28 1.76 -2.63 1.76
                curveToRelative(
                    dx1 = -0.3f,
                    dy1 = 1.15f,
                    dx2 = -1.28f,
                    dy2 = 1.76f,
                    dx3 = -2.63f,
                    dy3 = 1.76f,
                )
                // c -1.82 0 -2.86 -1.05 -2.86 -2.66
                curveToRelative(
                    dx1 = -1.82f,
                    dy1 = 0.0f,
                    dx2 = -2.86f,
                    dy2 = -1.05f,
                    dx3 = -2.86f,
                    dy3 = -2.66f,
                )
                // m 5.36 -0.24
                moveToRelative(dx = 5.36f, dy = -0.24f)
                // v -1.19
                verticalLineToRelative(dy = -1.19f)
                // h -1.42
                horizontalLineToRelative(dx = -1.42f)
                // c -1.15 0 -1.72 0.4 -1.72 1.1
                curveToRelative(
                    dx1 = -1.15f,
                    dy1 = 0.0f,
                    dx2 = -1.72f,
                    dy2 = 0.4f,
                    dx3 = -1.72f,
                    dy3 = 1.1f,
                )
                // v 0.3
                verticalLineToRelative(dy = 0.3f)
                // c 0 0.72 0.5 1.08 1.36 1.08
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.72f,
                    dx2 = 0.5f,
                    dy2 = 1.08f,
                    dx3 = 1.36f,
                    dy3 = 1.08f,
                )
                // c 0.98 0 1.78 -0.44 1.78 -1.29
                curveToRelative(
                    dx1 = 0.98f,
                    dy1 = 0.0f,
                    dx2 = 1.78f,
                    dy2 = -0.44f,
                    dx3 = 1.78f,
                    dy3 = -1.29f,
                )
                // m -16.14 0.9
                moveToRelative(dx = -16.14f, dy = 0.9f)
                // l 1.53 -1.48
                lineToRelative(dx = 1.53f, dy = -1.48f)
                // a 4 4 0 0 0 3.09 1.48
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.09f,
                    dy1 = 1.48f,
                )
                // c 1.4 0 2.12 -0.67 2.12 -1.69
                curveToRelative(
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                    dx2 = 2.12f,
                    dy2 = -0.67f,
                    dx3 = 2.12f,
                    dy3 = -1.69f,
                )
                // c 0 -0.8 -0.38 -1.3 -1.64 -1.53
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.8f,
                    dx2 = -0.38f,
                    dy2 = -1.3f,
                    dx3 = -1.64f,
                    dy3 = -1.53f,
                )
                // l -1.14 -0.18
                lineToRelative(dx = -1.14f, dy = -0.18f)
                // c -2.43 -0.37 -3.6 -1.53 -3.6 -3.5
                curveToRelative(
                    dx1 = -2.43f,
                    dy1 = -0.37f,
                    dx2 = -3.6f,
                    dy2 = -1.53f,
                    dx3 = -3.6f,
                    dy3 = -3.5f,
                )
                // c 0 -2.15 1.67 -3.54 4.36 -3.54
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.15f,
                    dx2 = 1.67f,
                    dy2 = -3.54f,
                    dx3 = 4.36f,
                    dy3 = -3.54f,
                )
                // c 1.8 0 3.15 0.62 4.12 1.77
                curveToRelative(
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                    dx2 = 3.15f,
                    dy2 = 0.62f,
                    dx3 = 4.12f,
                    dy3 = 1.77f,
                )
                // l -1.55 1.47
                lineToRelative(dx = -1.55f, dy = 1.47f)
                // a 3.2 3.2 0 0 0 -2.7 -1.24
                arcToRelative(
                    a = 3.2f,
                    b = 3.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.7f,
                    dy1 = -1.24f,
                )
                // c -1.28 0 -1.95 0.51 -1.95 1.41
                curveToRelative(
                    dx1 = -1.28f,
                    dy1 = 0.0f,
                    dx2 = -1.95f,
                    dy2 = 0.51f,
                    dx3 = -1.95f,
                    dy3 = 1.41f,
                )
                // c 0 0.91 0.51 1.3 1.67 1.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.91f,
                    dx2 = 0.51f,
                    dy2 = 1.3f,
                    dx3 = 1.67f,
                    dy3 = 1.5f,
                )
                // l 1.12 0.2
                lineToRelative(dx = 1.12f, dy = 0.2f)
                // c 2.42 0.44 3.56 1.52 3.56 3.5
                curveToRelative(
                    dx1 = 2.42f,
                    dy1 = 0.44f,
                    dx2 = 3.56f,
                    dy2 = 1.52f,
                    dx3 = 3.56f,
                    dy3 = 3.5f,
                )
                // c 0 2.28 -1.63 3.83 -4.51 3.83
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.28f,
                    dx2 = -1.63f,
                    dy2 = 3.83f,
                    dx3 = -4.51f,
                    dy3 = 3.83f,
                )
                // a 5.6 5.6 0 0 1 -4.48 -2
                arcToRelative(
                    a = 5.6f,
                    b = 5.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.48f,
                    dy1 = -2.0f,
                )
            }
            // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 28 h24 V4 H4z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _satisfyDefinition = it }
    }

@Suppress("ObjectPropertyName")
private var _satisfyDefinition: ImageVector? = null
