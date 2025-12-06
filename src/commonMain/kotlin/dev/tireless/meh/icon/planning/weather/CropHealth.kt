package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CropHealth: ImageVector
    get() {
        val current = _cropHealth
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CropHealth",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="8" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
            }
            // M17 29 a1 1 0 0 1 -.78 -.38 L12.52 24 H2 v-2 h11 a1 1 0 0 1 .78 .38 l3.15 3.93 5.24 -7.86 a1 1 0 0 1 1.63 -.05 l2.7 3.6 H30 v2 h-4 a1 1 0 0 1 -.8 -.4 l-2.15 -2.87 -5.22 7.82 A1 1 0 0 1 17.04 29Z m-6 -13 v-5 h1 a4 4 0 0 0 4 -4 V4 h-3 a4 4 0 0 0 -2.75 1.1 A6 6 0 0 0 5 2 H2 v3 a6 6 0 0 0 6 6 h1 v5 H2 v2 h14 v-2Z m2 -10 h1 v1 a2 2 0 0 1 -2 2 h-1 V8 a2 2 0 0 1 2 -2 M8 9 a4 4 0 0 1 -4 -4 V4 h1 a4 4 0 0 1 4 4 v1Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 29
                moveTo(x = 17.0f, y = 29.0f)
                // a 1 1 0 0 1 -0.78 -0.38
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.78f,
                    dy1 = -0.38f,
                )
                // L 12.52 24
                lineTo(x = 12.52f, y = 24.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // a 1 1 0 0 1 0.78 0.38
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.78f,
                    dy1 = 0.38f,
                )
                // l 3.15 3.93
                lineToRelative(dx = 3.15f, dy = 3.93f)
                // l 5.24 -7.86
                lineToRelative(dx = 5.24f, dy = -7.86f)
                // a 1 1 0 0 1 1.63 -0.05
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.63f,
                    dy1 = -0.05f,
                )
                // l 2.7 3.6
                lineToRelative(dx = 2.7f, dy = 3.6f)
                // H 30
                horizontalLineTo(x = 30.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 1 -0.8 -0.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = -0.4f,
                )
                // l -2.15 -2.87
                lineToRelative(dx = -2.15f, dy = -2.87f)
                // l -5.22 7.82
                lineToRelative(dx = -5.22f, dy = 7.82f)
                // A 1 1 0 0 1 17.04 29z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.04f,
                    y1 = 29.0f,
                )
                close()
                // m -6 -13
                moveToRelative(dx = -6.0f, dy = -13.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // a 4 4 0 0 0 -2.75 1.1
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.75f,
                    dy1 = 1.1f,
                )
                // A 6 6 0 0 0 5 2
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 2.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 6 6 0 0 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m 2 -10
                moveToRelative(dx = 2.0f, dy = -10.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // M 8 9
                moveTo(x = 8.0f, y = 9.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 1z
                verticalLineToRelative(dy = 1.0f)
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
        }.build().also { _cropHealth = it }
    }

@Suppress("ObjectPropertyName")
private var _cropHealth: ImageVector? = null
