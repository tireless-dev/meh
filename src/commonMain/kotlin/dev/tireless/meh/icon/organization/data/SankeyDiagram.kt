package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SankeyDiagram: ImageVector
    get() {
        val current = _sankeyDiagram
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SankeyDiagram",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 v6.04 c-1.96 .2 -6.32 1.24 -10.56 6.28 l-.6 -.85 C11.98 5.67 6.33 4.27 4 4.04 V2 H2 v28 h2 v-3.95 a15 15 0 0 0 9.92 -3.96 c4.55 5.37 11.32 5.95 14.01 5.95 H28 V30 h2 V2Z m0 8.06 v9.99 a12.9 12.9 0 0 1 -9.28 -4.14 c3.78 -4.64 7.57 -5.65 9.28 -5.85 m-12.85 4.47 a18 18 0 0 0 1.01 1.44 29 29 0 0 0 -1 1.5 16 16 0 0 1 -1.04 1.46 l-.25 -.42 C9.33 10.33 5.8 8.44 4 8.07 V6.05 c2 .24 6.82 1.55 11.15 8.48 M4 24.05 v-13.9 c1.33 .45 4.2 2.28 8.13 9.34 q.3 .5 .6 .96 A13 13 0 0 1 4 24.05 m11.32 -3.42 a18 18 0 0 0 1.53 -2.1 q.33 -.52 .67 -1 A14.9 14.9 0 0 0 28 22.05 v3.99 c-2.33 -.01 -8.63 -.52 -12.68 -5.4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
                // v 6.04
                verticalLineToRelative(dy = 6.04f)
                // c -1.96 0.2 -6.32 1.24 -10.56 6.28
                curveToRelative(
                    dx1 = -1.96f,
                    dy1 = 0.2f,
                    dx2 = -6.32f,
                    dy2 = 1.24f,
                    dx3 = -10.56f,
                    dy3 = 6.28f,
                )
                // l -0.6 -0.85
                lineToRelative(dx = -0.6f, dy = -0.85f)
                // C 11.98 5.67 6.33 4.27 4 4.04
                curveTo(
                    x1 = 11.98f,
                    y1 = 5.67f,
                    x2 = 6.33f,
                    y2 = 4.27f,
                    x3 = 4.0f,
                    y3 = 4.04f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3.95
                verticalLineToRelative(dy = -3.95f)
                // a 15 15 0 0 0 9.92 -3.96
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.92f,
                    dy1 = -3.96f,
                )
                // c 4.55 5.37 11.32 5.95 14.01 5.95
                curveToRelative(
                    dx1 = 4.55f,
                    dy1 = 5.37f,
                    dx2 = 11.32f,
                    dy2 = 5.95f,
                    dx3 = 14.01f,
                    dy3 = 5.95f,
                )
                // H 28
                horizontalLineTo(x = 28.0f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 0 8.06
                moveToRelative(dx = 0.0f, dy = 8.06f)
                // v 9.99
                verticalLineToRelative(dy = 9.99f)
                // a 12.9 12.9 0 0 1 -9.28 -4.14
                arcToRelative(
                    a = 12.9f,
                    b = 12.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.28f,
                    dy1 = -4.14f,
                )
                // c 3.78 -4.64 7.57 -5.65 9.28 -5.85
                curveToRelative(
                    dx1 = 3.78f,
                    dy1 = -4.64f,
                    dx2 = 7.57f,
                    dy2 = -5.65f,
                    dx3 = 9.28f,
                    dy3 = -5.85f,
                )
                // m -12.85 4.47
                moveToRelative(dx = -12.85f, dy = 4.47f)
                // a 18 18 0 0 0 1.01 1.44
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.01f,
                    dy1 = 1.44f,
                )
                // a 29 29 0 0 0 -1 1.5
                arcToRelative(
                    a = 29.0f,
                    b = 29.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.5f,
                )
                // a 16 16 0 0 1 -1.04 1.46
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.04f,
                    dy1 = 1.46f,
                )
                // l -0.25 -0.42
                lineToRelative(dx = -0.25f, dy = -0.42f)
                // C 9.33 10.33 5.8 8.44 4 8.07
                curveTo(
                    x1 = 9.33f,
                    y1 = 10.33f,
                    x2 = 5.8f,
                    y2 = 8.44f,
                    x3 = 4.0f,
                    y3 = 8.07f,
                )
                // V 6.05
                verticalLineTo(y = 6.05f)
                // c 2 0.24 6.82 1.55 11.15 8.48
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.24f,
                    dx2 = 6.82f,
                    dy2 = 1.55f,
                    dx3 = 11.15f,
                    dy3 = 8.48f,
                )
                // M 4 24.05
                moveTo(x = 4.0f, y = 24.05f)
                // v -13.9
                verticalLineToRelative(dy = -13.9f)
                // c 1.33 0.45 4.2 2.28 8.13 9.34
                curveToRelative(
                    dx1 = 1.33f,
                    dy1 = 0.45f,
                    dx2 = 4.2f,
                    dy2 = 2.28f,
                    dx3 = 8.13f,
                    dy3 = 9.34f,
                )
                // q 0.3 0.5 0.6 0.96
                quadToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.5f,
                    dx2 = 0.6f,
                    dy2 = 0.96f,
                )
                // A 13 13 0 0 1 4 24.05
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 24.05f,
                )
                // m 11.32 -3.42
                moveToRelative(dx = 11.32f, dy = -3.42f)
                // a 18 18 0 0 0 1.53 -2.1
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.53f,
                    dy1 = -2.1f,
                )
                // q 0.33 -0.52 0.67 -1
                quadToRelative(
                    dx1 = 0.33f,
                    dy1 = -0.52f,
                    dx2 = 0.67f,
                    dy2 = -1.0f,
                )
                // A 14.9 14.9 0 0 0 28 22.05
                arcTo(
                    horizontalEllipseRadius = 14.9f,
                    verticalEllipseRadius = 14.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 22.05f,
                )
                // v 3.99
                verticalLineToRelative(dy = 3.99f)
                // c -2.33 -0.01 -8.63 -0.52 -12.68 -5.4
                curveToRelative(
                    dx1 = -2.33f,
                    dy1 = -0.01f,
                    dx2 = -8.63f,
                    dy2 = -0.52f,
                    dx3 = -12.68f,
                    dy3 = -5.4f,
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
        }.build().also { _sankeyDiagram = it }
    }

@Suppress("ObjectPropertyName")
private var _sankeyDiagram: ImageVector? = null
