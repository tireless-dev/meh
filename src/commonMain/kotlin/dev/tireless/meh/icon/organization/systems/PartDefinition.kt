package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PartDefinition: ImageVector
    get() {
        val current = _partDefinition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PartDefinition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20.83 16.8 c-2.44 0 -3.83 .92 -3.83 2.76 0 1.6 1.03 2.65 2.85 2.65 1.34 0 2.32 -.6 2.62 -1.76 h.1 c.14 .93 .72 1.55 1.67 1.55 h1.22 v-1.75 h-.9 v-4.23 c0 -2.05 -1.28 -3.2 -3.7 -3.2 -1.81 0 -2.86 .69 -3.52 1.72 l1.31 1.17 a2.3 2.3 0 0 1 2.05 -1.14 c1.17 0 1.66 .59 1.66 1.59 v.65z m1.53 2.52 c0 .84 -.79 1.29 -1.77 1.29 -.86 0 -1.36 -.36 -1.36 -1.09 v-.29 c0 -.7 .57 -1.1 1.72 -1.1 h1.41z m-13.09 -1.9 h3.13 c2.22 0 3.56 -1.47 3.56 -3.7 0 -2.22 -1.34 -3.72 -3.56 -3.72 H7 v12 h2.27z m0 -5.44 h2.92 c.88 0 1.41 .46 1.41 1.34 v.79 c0 .88 -.53 1.36 -1.4 1.36 H9.26z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.83 16.8
                moveTo(x = 20.83f, y = 16.8f)
                // c -2.44 0 -3.83 0.92 -3.83 2.76
                curveToRelative(
                    dx1 = -2.44f,
                    dy1 = 0.0f,
                    dx2 = -3.83f,
                    dy2 = 0.92f,
                    dx3 = -3.83f,
                    dy3 = 2.76f,
                )
                // c 0 1.6 1.03 2.65 2.85 2.65
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.6f,
                    dx2 = 1.03f,
                    dy2 = 2.65f,
                    dx3 = 2.85f,
                    dy3 = 2.65f,
                )
                // c 1.34 0 2.32 -0.6 2.62 -1.76
                curveToRelative(
                    dx1 = 1.34f,
                    dy1 = 0.0f,
                    dx2 = 2.32f,
                    dy2 = -0.6f,
                    dx3 = 2.62f,
                    dy3 = -1.76f,
                )
                // h 0.1
                horizontalLineToRelative(dx = 0.1f)
                // c 0.14 0.93 0.72 1.55 1.67 1.55
                curveToRelative(
                    dx1 = 0.14f,
                    dy1 = 0.93f,
                    dx2 = 0.72f,
                    dy2 = 1.55f,
                    dx3 = 1.67f,
                    dy3 = 1.55f,
                )
                // h 1.22
                horizontalLineToRelative(dx = 1.22f)
                // v -1.75
                verticalLineToRelative(dy = -1.75f)
                // h -0.9
                horizontalLineToRelative(dx = -0.9f)
                // v -4.23
                verticalLineToRelative(dy = -4.23f)
                // c 0 -2.05 -1.28 -3.2 -3.7 -3.2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.05f,
                    dx2 = -1.28f,
                    dy2 = -3.2f,
                    dx3 = -3.7f,
                    dy3 = -3.2f,
                )
                // c -1.81 0 -2.86 0.69 -3.52 1.72
                curveToRelative(
                    dx1 = -1.81f,
                    dy1 = 0.0f,
                    dx2 = -2.86f,
                    dy2 = 0.69f,
                    dx3 = -3.52f,
                    dy3 = 1.72f,
                )
                // l 1.31 1.17
                lineToRelative(dx = 1.31f, dy = 1.17f)
                // a 2.3 2.3 0 0 1 2.05 -1.14
                arcToRelative(
                    a = 2.3f,
                    b = 2.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.05f,
                    dy1 = -1.14f,
                )
                // c 1.17 0 1.66 0.59 1.66 1.59
                curveToRelative(
                    dx1 = 1.17f,
                    dy1 = 0.0f,
                    dx2 = 1.66f,
                    dy2 = 0.59f,
                    dx3 = 1.66f,
                    dy3 = 1.59f,
                )
                // v 0.65z
                verticalLineToRelative(dy = 0.65f)
                close()
                // m 1.53 2.52
                moveToRelative(dx = 1.53f, dy = 2.52f)
                // c 0 0.84 -0.79 1.29 -1.77 1.29
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.84f,
                    dx2 = -0.79f,
                    dy2 = 1.29f,
                    dx3 = -1.77f,
                    dy3 = 1.29f,
                )
                // c -0.86 0 -1.36 -0.36 -1.36 -1.09
                curveToRelative(
                    dx1 = -0.86f,
                    dy1 = 0.0f,
                    dx2 = -1.36f,
                    dy2 = -0.36f,
                    dx3 = -1.36f,
                    dy3 = -1.09f,
                )
                // v -0.29
                verticalLineToRelative(dy = -0.29f)
                // c 0 -0.7 0.57 -1.1 1.72 -1.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.7f,
                    dx2 = 0.57f,
                    dy2 = -1.1f,
                    dx3 = 1.72f,
                    dy3 = -1.1f,
                )
                // h 1.41z
                horizontalLineToRelative(dx = 1.41f)
                close()
                // m -13.09 -1.9
                moveToRelative(dx = -13.09f, dy = -1.9f)
                // h 3.13
                horizontalLineToRelative(dx = 3.13f)
                // c 2.22 0 3.56 -1.47 3.56 -3.7
                curveToRelative(
                    dx1 = 2.22f,
                    dy1 = 0.0f,
                    dx2 = 3.56f,
                    dy2 = -1.47f,
                    dx3 = 3.56f,
                    dy3 = -3.7f,
                )
                // c 0 -2.22 -1.34 -3.72 -3.56 -3.72
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.22f,
                    dx2 = -1.34f,
                    dy2 = -3.72f,
                    dx3 = -3.56f,
                    dy3 = -3.72f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2.27z
                horizontalLineToRelative(dx = 2.27f)
                close()
                // m 0 -5.44
                moveToRelative(dx = 0.0f, dy = -5.44f)
                // h 2.92
                horizontalLineToRelative(dx = 2.92f)
                // c 0.88 0 1.41 0.46 1.41 1.34
                curveToRelative(
                    dx1 = 0.88f,
                    dy1 = 0.0f,
                    dx2 = 1.41f,
                    dy2 = 0.46f,
                    dx3 = 1.41f,
                    dy3 = 1.34f,
                )
                // v 0.79
                verticalLineToRelative(dy = 0.79f)
                // c 0 0.88 -0.53 1.36 -1.4 1.36
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.88f,
                    dx2 = -0.53f,
                    dy2 = 1.36f,
                    dx3 = -1.4f,
                    dy3 = 1.36f,
                )
                // H 9.26z
                horizontalLineTo(x = 9.26f)
                close()
            }
            // M2 4 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 m26 24 H4 V4 h24z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // m 26 24
                moveToRelative(dx = 26.0f, dy = 24.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
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
        }.build().also { _partDefinition = it }
    }

@Suppress("ObjectPropertyName")
private var _partDefinition: ImageVector? = null
