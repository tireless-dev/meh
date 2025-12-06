package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseDatastax: ImageVector
    get() {
        val current = _databaseDatastax
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DatabaseDatastax",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m18.87 22.07 1.8 -1.75 a4.2 4.2 0 0 0 3.28 1.63 c1.4 0 2 -.53 2 -1.38 0 -.69 -.41 -1.12 -1.47 -1.26 l-1.2 -.16 c-2.57 -.32 -4 -1.45 -4 -3.64 0 -2.32 1.82 -3.79 4.55 -3.79 a5.7 5.7 0 0 1 4.7 1.89 l-1.73 1.72 a4 4 0 0 0 -2.87 -1.29 c-1.27 0 -1.82 .5 -1.82 1.24 0 .8 .44 1.18 1.56 1.36 l1.22 .16 q3.91 .55 3.89 3.54 c0 2.33 -1.96 3.94 -4.95 3.94 a6.1 6.1 0 0 1 -4.96 -2.21 M4.24 7.95 h5.84 c4.19 0 6.92 2.69 6.92 8.03 S14.27 24 10.08 24 H4.24Z m5.84 13.36 c2.25 0 3.7 -1.33 3.7 -4.07 v-2.53 c0 -2.74 -1.45 -4.07 -3.7 -4.07 h-2.8 v10.67Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18.87 22.07
                moveTo(x = 18.87f, y = 22.07f)
                // l 1.8 -1.75
                lineToRelative(dx = 1.8f, dy = -1.75f)
                // a 4.2 4.2 0 0 0 3.28 1.63
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.28f,
                    dy1 = 1.63f,
                )
                // c 1.4 0 2 -0.53 2 -1.38
                curveToRelative(
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.53f,
                    dx3 = 2.0f,
                    dy3 = -1.38f,
                )
                // c 0 -0.69 -0.41 -1.12 -1.47 -1.26
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.69f,
                    dx2 = -0.41f,
                    dy2 = -1.12f,
                    dx3 = -1.47f,
                    dy3 = -1.26f,
                )
                // l -1.2 -0.16
                lineToRelative(dx = -1.2f, dy = -0.16f)
                // c -2.57 -0.32 -4 -1.45 -4 -3.64
                curveToRelative(
                    dx1 = -2.57f,
                    dy1 = -0.32f,
                    dx2 = -4.0f,
                    dy2 = -1.45f,
                    dx3 = -4.0f,
                    dy3 = -3.64f,
                )
                // c 0 -2.32 1.82 -3.79 4.55 -3.79
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.32f,
                    dx2 = 1.82f,
                    dy2 = -3.79f,
                    dx3 = 4.55f,
                    dy3 = -3.79f,
                )
                // a 5.7 5.7 0 0 1 4.7 1.89
                arcToRelative(
                    a = 5.7f,
                    b = 5.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.7f,
                    dy1 = 1.89f,
                )
                // l -1.73 1.72
                lineToRelative(dx = -1.73f, dy = 1.72f)
                // a 4 4 0 0 0 -2.87 -1.29
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.87f,
                    dy1 = -1.29f,
                )
                // c -1.27 0 -1.82 0.5 -1.82 1.24
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.0f,
                    dx2 = -1.82f,
                    dy2 = 0.5f,
                    dx3 = -1.82f,
                    dy3 = 1.24f,
                )
                // c 0 0.8 0.44 1.18 1.56 1.36
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.8f,
                    dx2 = 0.44f,
                    dy2 = 1.18f,
                    dx3 = 1.56f,
                    dy3 = 1.36f,
                )
                // l 1.22 0.16
                lineToRelative(dx = 1.22f, dy = 0.16f)
                // q 3.91 0.55 3.89 3.54
                quadToRelative(
                    dx1 = 3.91f,
                    dy1 = 0.55f,
                    dx2 = 3.89f,
                    dy2 = 3.54f,
                )
                // c 0 2.33 -1.96 3.94 -4.95 3.94
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.33f,
                    dx2 = -1.96f,
                    dy2 = 3.94f,
                    dx3 = -4.95f,
                    dy3 = 3.94f,
                )
                // a 6.1 6.1 0 0 1 -4.96 -2.21
                arcToRelative(
                    a = 6.1f,
                    b = 6.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.96f,
                    dy1 = -2.21f,
                )
                // M 4.24 7.95
                moveTo(x = 4.24f, y = 7.95f)
                // h 5.84
                horizontalLineToRelative(dx = 5.84f)
                // c 4.19 0 6.92 2.69 6.92 8.03
                curveToRelative(
                    dx1 = 4.19f,
                    dy1 = 0.0f,
                    dx2 = 6.92f,
                    dy2 = 2.69f,
                    dx3 = 6.92f,
                    dy3 = 8.03f,
                )
                // S 14.27 24 10.08 24
                reflectiveCurveTo(
                    x1 = 14.27f,
                    y1 = 24.0f,
                    x2 = 10.08f,
                    y2 = 24.0f,
                )
                // H 4.24z
                horizontalLineTo(x = 4.24f)
                close()
                // m 5.84 13.36
                moveToRelative(dx = 5.84f, dy = 13.36f)
                // c 2.25 0 3.7 -1.33 3.7 -4.07
                curveToRelative(
                    dx1 = 2.25f,
                    dy1 = 0.0f,
                    dx2 = 3.7f,
                    dy2 = -1.33f,
                    dx3 = 3.7f,
                    dy3 = -4.07f,
                )
                // v -2.53
                verticalLineToRelative(dy = -2.53f)
                // c 0 -2.74 -1.45 -4.07 -3.7 -4.07
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.74f,
                    dx2 = -1.45f,
                    dy2 = -4.07f,
                    dx3 = -3.7f,
                    dy3 = -4.07f,
                )
                // h -2.8
                horizontalLineToRelative(dx = -2.8f)
                // v 10.67z
                verticalLineToRelative(dy = 10.67f)
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
        }.build().also { _databaseDatastax = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseDatastax: ImageVector? = null
