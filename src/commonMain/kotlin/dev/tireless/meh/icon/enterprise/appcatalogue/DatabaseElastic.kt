package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseElastic: ImageVector
    get() {
        val current = _databaseElastic
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DatabaseElastic",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m17.83 22.07 1.8 -1.75 a4.2 4.2 0 0 0 3.28 1.63 c1.4 0 2 -.53 2 -1.38 0 -.69 -.41 -1.12 -1.47 -1.26 l-1.2 -.16 c-2.57 -.32 -4 -1.45 -4 -3.64 0 -2.32 1.82 -3.79 4.55 -3.79 a5.7 5.7 0 0 1 4.7 1.89 l-1.73 1.72 a4 4 0 0 0 -2.87 -1.29 c-1.27 0 -1.82 .5 -1.82 1.24 0 .8 .44 1.18 1.56 1.36 l1.22 .16 c2.62 .37 3.89 1.54 3.89 3.54 0 2.33 -1.96 3.94 -4.95 3.94 a6.1 6.1 0 0 1 -4.96 -2.21 M5.25 24 V7.95 h10.58 v2.69 H8.27 v3.89 h6.67 v2.69 H8.28 v4.09 h7.55 V24Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.83 22.07
                moveTo(x = 17.83f, y = 22.07f)
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
                // c 2.62 0.37 3.89 1.54 3.89 3.54
                curveToRelative(
                    dx1 = 2.62f,
                    dy1 = 0.37f,
                    dx2 = 3.89f,
                    dy2 = 1.54f,
                    dx3 = 3.89f,
                    dy3 = 3.54f,
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
                // M 5.25 24
                moveTo(x = 5.25f, y = 24.0f)
                // V 7.95
                verticalLineTo(y = 7.95f)
                // h 10.58
                horizontalLineToRelative(dx = 10.58f)
                // v 2.69
                verticalLineToRelative(dy = 2.69f)
                // H 8.27
                horizontalLineTo(x = 8.27f)
                // v 3.89
                verticalLineToRelative(dy = 3.89f)
                // h 6.67
                horizontalLineToRelative(dx = 6.67f)
                // v 2.69
                verticalLineToRelative(dy = 2.69f)
                // H 8.28
                horizontalLineTo(x = 8.28f)
                // v 4.09
                verticalLineToRelative(dy = 4.09f)
                // h 7.55
                horizontalLineToRelative(dx = 7.55f)
                // V 24z
                verticalLineTo(y = 24.0f)
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
        }.build().also { _databaseElastic = it }
    }

@Suppress("ObjectPropertyName")
private var _databaseElastic: ImageVector? = null
