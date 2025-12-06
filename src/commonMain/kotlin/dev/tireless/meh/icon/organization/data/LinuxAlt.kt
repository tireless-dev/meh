package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinuxAlt: ImageVector
    get() {
        val current = _linuxAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LinuxAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22.61 20.52 a6.2 6.2 0 0 0 1.39 -4 c0 -3.04 -2.02 -5.52 -4.5 -5.52 a4.2 4.2 0 0 0 -3.5 2.06 A4.2 4.2 0 0 0 12.5 11 C10.02 11 8 13.48 8 16.53 a6.2 6.2 0 0 0 1.39 4 L8.4 21.2 a1 1 0 0 0 -.18 1.43 C8.66 23.17 12.62 28 16 28 s7.34 -4.83 7.78 -5.37 a1 1 0 0 0 -.18 -1.43z M12.5 13 c1.36 0 2.5 1.61 2.5 3.53 v1.56 a9 9 0 0 0 -1.02 .23 L14 18 c0 -1.1 -.67 -2 -1.5 -2 S11 16.9 11 18 a2.4 2.4 0 0 0 .4 1.36 l-.24 .12 A4 4 0 0 1 10 16.53 C10 14.6 11.14 13 12.5 13 M16 26 c-1.57 0 -3.96 -2.08 -5.52 -3.8 C11.9 21.27 14.27 20 16 20 s4.1 1.28 5.52 2.2 C19.96 23.91 17.57 26 16 26 m4.84 -6.52 -.25 -.12 A2.4 2.4 0 0 0 21 18 c0 -1.1 -.67 -2 -1.5 -2 S18 16.9 18 18 l.02 .32 A9 9 0 0 0 17 18.1 v-1.56 C17 14.6 18.14 13 19.5 13 s2.5 1.61 2.5 3.53 a4 4 0 0 1 -1.16 2.95
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.61 20.52
                moveTo(x = 22.61f, y = 20.52f)
                // a 6.2 6.2 0 0 0 1.39 -4
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.39f,
                    dy1 = -4.0f,
                )
                // c 0 -3.04 -2.02 -5.52 -4.5 -5.52
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.04f,
                    dx2 = -2.02f,
                    dy2 = -5.52f,
                    dx3 = -4.5f,
                    dy3 = -5.52f,
                )
                // a 4.2 4.2 0 0 0 -3.5 2.06
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.5f,
                    dy1 = 2.06f,
                )
                // A 4.2 4.2 0 0 0 12.5 11
                arcTo(
                    horizontalEllipseRadius = 4.2f,
                    verticalEllipseRadius = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.5f,
                    y1 = 11.0f,
                )
                // C 10.02 11 8 13.48 8 16.53
                curveTo(
                    x1 = 10.02f,
                    y1 = 11.0f,
                    x2 = 8.0f,
                    y2 = 13.48f,
                    x3 = 8.0f,
                    y3 = 16.53f,
                )
                // a 6.2 6.2 0 0 0 1.39 4
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.39f,
                    dy1 = 4.0f,
                )
                // L 8.4 21.2
                lineTo(x = 8.4f, y = 21.2f)
                // a 1 1 0 0 0 -0.18 1.43
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.18f,
                    dy1 = 1.43f,
                )
                // C 8.66 23.17 12.62 28 16 28
                curveTo(
                    x1 = 8.66f,
                    y1 = 23.17f,
                    x2 = 12.62f,
                    y2 = 28.0f,
                    x3 = 16.0f,
                    y3 = 28.0f,
                )
                // s 7.34 -4.83 7.78 -5.37
                reflectiveCurveToRelative(
                    dx1 = 7.34f,
                    dy1 = -4.83f,
                    dx2 = 7.78f,
                    dy2 = -5.37f,
                )
                // a 1 1 0 0 0 -0.18 -1.43z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.18f,
                    dy1 = -1.43f,
                )
                close()
                // M 12.5 13
                moveTo(x = 12.5f, y = 13.0f)
                // c 1.36 0 2.5 1.61 2.5 3.53
                curveToRelative(
                    dx1 = 1.36f,
                    dy1 = 0.0f,
                    dx2 = 2.5f,
                    dy2 = 1.61f,
                    dx3 = 2.5f,
                    dy3 = 3.53f,
                )
                // v 1.56
                verticalLineToRelative(dy = 1.56f)
                // a 9 9 0 0 0 -1.02 0.23
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.02f,
                    dy1 = 0.23f,
                )
                // L 14 18
                lineTo(x = 14.0f, y = 18.0f)
                // c 0 -1.1 -0.67 -2 -1.5 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = -0.67f,
                    dy2 = -2.0f,
                    dx3 = -1.5f,
                    dy3 = -2.0f,
                )
                // S 11 16.9 11 18
                reflectiveCurveTo(
                    x1 = 11.0f,
                    y1 = 16.9f,
                    x2 = 11.0f,
                    y2 = 18.0f,
                )
                // a 2.4 2.4 0 0 0 0.4 1.36
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = 1.36f,
                )
                // l -0.24 0.12
                lineToRelative(dx = -0.24f, dy = 0.12f)
                // A 4 4 0 0 1 10 16.53
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 16.53f,
                )
                // C 10 14.6 11.14 13 12.5 13
                curveTo(
                    x1 = 10.0f,
                    y1 = 14.6f,
                    x2 = 11.14f,
                    y2 = 13.0f,
                    x3 = 12.5f,
                    y3 = 13.0f,
                )
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // c -1.57 0 -3.96 -2.08 -5.52 -3.8
                curveToRelative(
                    dx1 = -1.57f,
                    dy1 = 0.0f,
                    dx2 = -3.96f,
                    dy2 = -2.08f,
                    dx3 = -5.52f,
                    dy3 = -3.8f,
                )
                // C 11.9 21.27 14.27 20 16 20
                curveTo(
                    x1 = 11.9f,
                    y1 = 21.27f,
                    x2 = 14.27f,
                    y2 = 20.0f,
                    x3 = 16.0f,
                    y3 = 20.0f,
                )
                // s 4.1 1.28 5.52 2.2
                reflectiveCurveToRelative(
                    dx1 = 4.1f,
                    dy1 = 1.28f,
                    dx2 = 5.52f,
                    dy2 = 2.2f,
                )
                // C 19.96 23.91 17.57 26 16 26
                curveTo(
                    x1 = 19.96f,
                    y1 = 23.91f,
                    x2 = 17.57f,
                    y2 = 26.0f,
                    x3 = 16.0f,
                    y3 = 26.0f,
                )
                // m 4.84 -6.52
                moveToRelative(dx = 4.84f, dy = -6.52f)
                // l -0.25 -0.12
                lineToRelative(dx = -0.25f, dy = -0.12f)
                // A 2.4 2.4 0 0 0 21 18
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 18.0f,
                )
                // c 0 -1.1 -0.67 -2 -1.5 -2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.1f,
                    dx2 = -0.67f,
                    dy2 = -2.0f,
                    dx3 = -1.5f,
                    dy3 = -2.0f,
                )
                // S 18 16.9 18 18
                reflectiveCurveTo(
                    x1 = 18.0f,
                    y1 = 16.9f,
                    x2 = 18.0f,
                    y2 = 18.0f,
                )
                // l 0.02 0.32
                lineToRelative(dx = 0.02f, dy = 0.32f)
                // A 9 9 0 0 0 17 18.1
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 18.1f,
                )
                // v -1.56
                verticalLineToRelative(dy = -1.56f)
                // C 17 14.6 18.14 13 19.5 13
                curveTo(
                    x1 = 17.0f,
                    y1 = 14.6f,
                    x2 = 18.14f,
                    y2 = 13.0f,
                    x3 = 19.5f,
                    y3 = 13.0f,
                )
                // s 2.5 1.61 2.5 3.53
                reflectiveCurveToRelative(
                    dx1 = 2.5f,
                    dy1 = 1.61f,
                    dx2 = 2.5f,
                    dy2 = 3.53f,
                )
                // a 4 4 0 0 1 -1.16 2.95
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.16f,
                    dy1 = 2.95f,
                )
            }
            // M30 30 a3.9 3.9 0 0 1 -4 -4 V14 a10 10 0 0 0 -20 0 v12 a3.9 3.9 0 0 1 -4 4 v-2 a1.88 1.88 0 0 0 2 -2 V14 a12 12 0 0 1 24 0 v12 a1.88 1.88 0 0 0 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 30
                moveTo(x = 30.0f, y = 30.0f)
                // a 3.9 3.9 0 0 1 -4 -4
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 10 10 0 0 0 -20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 3.9 3.9 0 0 1 -4 4
                arcToRelative(
                    a = 3.9f,
                    b = 3.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1.88 1.88 0 0 0 2 -2
                arcToRelative(
                    a = 1.88f,
                    b = 1.88f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // a 12 12 0 0 1 24 0
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 24.0f,
                    dy1 = 0.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 1.88 1.88 0 0 0 2 2z
                arcToRelative(
                    a = 1.88f,
                    b = 1.88f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
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
        }.build().also { _linuxAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _linuxAlt: ImageVector? = null
