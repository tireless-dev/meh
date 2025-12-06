package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoPython: ImageVector
    get() {
        val current = _logoPython
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoPython",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23.49 9.14 v2.97 a4.3 4.3 0 0 1 -4.17 4.23 h-6.68 a3.4 3.4 0 0 0 -3.34 3.4 v6.36 c0 1.8 1.58 2.87 3.34 3.4 a11 11 0 0 0 6.68 0 c1.68 -.5 3.34 -1.48 3.34 -3.4 v-2.55 h-6.68 V22.7 H26 c1.94 0 2.66 -1.35 3.34 -3.39 a11.5 11.5 0 0 0 0 -6.78 c-.48 -1.94 -1.4 -3.4 -3.34 -3.4Z m-3.75 16.1 a1.27 1.27 0 1 1 -1.26 1.28 1.26 1.26 0 0 1 1.26 -1.27
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.49 9.14
                moveTo(x = 23.49f, y = 9.14f)
                // v 2.97
                verticalLineToRelative(dy = 2.97f)
                // a 4.3 4.3 0 0 1 -4.17 4.23
                arcToRelative(
                    a = 4.3f,
                    b = 4.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.17f,
                    dy1 = 4.23f,
                )
                // h -6.68
                horizontalLineToRelative(dx = -6.68f)
                // a 3.4 3.4 0 0 0 -3.34 3.4
                arcToRelative(
                    a = 3.4f,
                    b = 3.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.34f,
                    dy1 = 3.4f,
                )
                // v 6.36
                verticalLineToRelative(dy = 6.36f)
                // c 0 1.8 1.58 2.87 3.34 3.4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.8f,
                    dx2 = 1.58f,
                    dy2 = 2.87f,
                    dx3 = 3.34f,
                    dy3 = 3.4f,
                )
                // a 11 11 0 0 0 6.68 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.68f,
                    dy1 = 0.0f,
                )
                // c 1.68 -0.5 3.34 -1.48 3.34 -3.4
                curveToRelative(
                    dx1 = 1.68f,
                    dy1 = -0.5f,
                    dx2 = 3.34f,
                    dy2 = -1.48f,
                    dx3 = 3.34f,
                    dy3 = -3.4f,
                )
                // v -2.55
                verticalLineToRelative(dy = -2.55f)
                // h -6.68
                horizontalLineToRelative(dx = -6.68f)
                // V 22.7
                verticalLineTo(y = 22.7f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // c 1.94 0 2.66 -1.35 3.34 -3.39
                curveToRelative(
                    dx1 = 1.94f,
                    dy1 = 0.0f,
                    dx2 = 2.66f,
                    dy2 = -1.35f,
                    dx3 = 3.34f,
                    dy3 = -3.39f,
                )
                // a 11.5 11.5 0 0 0 0 -6.78
                arcToRelative(
                    a = 11.5f,
                    b = 11.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.78f,
                )
                // c -0.48 -1.94 -1.4 -3.4 -3.34 -3.4z
                curveToRelative(
                    dx1 = -0.48f,
                    dy1 = -1.94f,
                    dx2 = -1.4f,
                    dy2 = -3.4f,
                    dx3 = -3.34f,
                    dy3 = -3.4f,
                )
                close()
                // m -3.75 16.1
                moveToRelative(dx = -3.75f, dy = 16.1f)
                // a 1.27 1.27 0 1 1 -1.26 1.28
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.26f,
                    dy1 = 1.28f,
                )
                // a 1.26 1.26 0 0 1 1.26 -1.27
                arcToRelative(
                    a = 1.26f,
                    b = 1.26f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.26f,
                    dy1 = -1.27f,
                )
            }
            // M19.74 25.25 a1.27 1.27 0 1 1 -1.26 1.27 1.26 1.26 0 0 1 1.26 -1.27
            path {
                // M 19.74 25.25
                moveTo(x = 19.74f, y = 25.25f)
                // a 1.27 1.27 0 1 1 -1.26 1.27
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.26f,
                    dy1 = 1.27f,
                )
                // a 1.26 1.26 0 0 1 1.26 -1.27
                arcToRelative(
                    a = 1.26f,
                    b = 1.26f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.26f,
                    dy1 = -1.27f,
                )
            }
            // M15.84 2 a19 19 0 0 0 -3.2 .27 C9.82 2.77 9.3 3.82 9.3 5.74 V8.3 h6.68 v.85 H6.8 a4.2 4.2 0 0 0 -4.18 3.39 12.5 12.5 0 0 0 0 6.79 c.48 1.97 1.61 3.38 3.55 3.38 h2.3 v-3.05 a4.24 4.24 0 0 1 4.17 -4.15 h6.68 a3.37 3.37 0 0 0 3.34 -3.4 V5.76 a3.7 3.7 0 0 0 -3.34 -3.48 A21 21 0 0 0 15.84 2 m-3.62 2.05 a1.27 1.27 0 1 1 -1.25 1.27 1.27 1.27 0 0 1 1.25 -1.27
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15.84 2
                moveTo(x = 15.84f, y = 2.0f)
                // a 19 19 0 0 0 -3.2 0.27
                arcToRelative(
                    a = 19.0f,
                    b = 19.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.2f,
                    dy1 = 0.27f,
                )
                // C 9.82 2.77 9.3 3.82 9.3 5.74
                curveTo(
                    x1 = 9.82f,
                    y1 = 2.77f,
                    x2 = 9.3f,
                    y2 = 3.82f,
                    x3 = 9.3f,
                    y3 = 5.74f,
                )
                // V 8.3
                verticalLineTo(y = 8.3f)
                // h 6.68
                horizontalLineToRelative(dx = 6.68f)
                // v 0.85
                verticalLineToRelative(dy = 0.85f)
                // H 6.8
                horizontalLineTo(x = 6.8f)
                // a 4.2 4.2 0 0 0 -4.18 3.39
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.18f,
                    dy1 = 3.39f,
                )
                // a 12.5 12.5 0 0 0 0 6.79
                arcToRelative(
                    a = 12.5f,
                    b = 12.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.79f,
                )
                // c 0.48 1.97 1.61 3.38 3.55 3.38
                curveToRelative(
                    dx1 = 0.48f,
                    dy1 = 1.97f,
                    dx2 = 1.61f,
                    dy2 = 3.38f,
                    dx3 = 3.55f,
                    dy3 = 3.38f,
                )
                // h 2.3
                horizontalLineToRelative(dx = 2.3f)
                // v -3.05
                verticalLineToRelative(dy = -3.05f)
                // a 4.24 4.24 0 0 1 4.17 -4.15
                arcToRelative(
                    a = 4.24f,
                    b = 4.24f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.17f,
                    dy1 = -4.15f,
                )
                // h 6.68
                horizontalLineToRelative(dx = 6.68f)
                // a 3.37 3.37 0 0 0 3.34 -3.4
                arcToRelative(
                    a = 3.37f,
                    b = 3.37f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.34f,
                    dy1 = -3.4f,
                )
                // V 5.76
                verticalLineTo(y = 5.76f)
                // a 3.7 3.7 0 0 0 -3.34 -3.48
                arcToRelative(
                    a = 3.7f,
                    b = 3.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.34f,
                    dy1 = -3.48f,
                )
                // A 21 21 0 0 0 15.84 2
                arcTo(
                    horizontalEllipseRadius = 21.0f,
                    verticalEllipseRadius = 21.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.84f,
                    y1 = 2.0f,
                )
                // m -3.62 2.05
                moveToRelative(dx = -3.62f, dy = 2.05f)
                // a 1.27 1.27 0 1 1 -1.25 1.27
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.25f,
                    dy1 = 1.27f,
                )
                // a 1.27 1.27 0 0 1 1.25 -1.27
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.25f,
                    dy1 = -1.27f,
                )
            }
            // M12.22 4.05 a1.27 1.27 0 1 1 -1.25 1.27 1.27 1.27 0 0 1 1.25 -1.27
            path {
                // M 12.22 4.05
                moveTo(x = 12.22f, y = 4.05f)
                // a 1.27 1.27 0 1 1 -1.25 1.27
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.25f,
                    dy1 = 1.27f,
                )
                // a 1.27 1.27 0 0 1 1.25 -1.27
                arcToRelative(
                    a = 1.27f,
                    b = 1.27f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.25f,
                    dy1 = -1.27f,
                )
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _logoPython = it }
    }

@Suppress("ObjectPropertyName")
private var _logoPython: ImageVector? = null
