package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cookie: ImageVector
    get() {
        val current = _cookie
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cookie",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="10.0" cy="21.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 21
                moveTo(x = 10.0f, y = 21.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="23.0" cy="20.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 20
                moveTo(x = 23.0f, y = 20.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="13.0" cy="10.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 10
                moveTo(x = 13.0f, y = 10.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="14.0" cy="15.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="23.0" cy="5.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 5
                moveTo(x = 23.0f, y = 5.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="29.0" cy="3.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 3
                moveTo(x = 29.0f, y = 3.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="16.0" cy="23.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 23
                moveTo(x = 16.0f, y = 23.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 30 C8.3 30 2 23.7 2 16 S8.3 2 16 2 h.3 l1.4 .1 -.3 1.2 a4.95 4.95 0 0 0 4.8 6.3 c1 0 2 -.3 2.9 -.9 l1.3 1.5 a2 2 0 0 0 -.6 1.4 c0 1.3 1.3 2.4 2.7 1.9 l1.2 -.5 .2 1.3 C30 14.9 30 15.5 30 16 c0 7.7 -6.3 14 -14 14 M15.3 4 C9 4.4 4 9.6 4 16 c0 6.6 5.4 12 12 12 s12 -5.4 12 -12 v-.4 a4 4 0 0 1 -4.2 -4 v-.2 a6.96 6.96 0 0 1 -8.6 -6.8 c0 -.2 0 -.4 .1 -.6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // C 8.3 30 2 23.7 2 16
                curveTo(
                    x1 = 8.3f,
                    y1 = 30.0f,
                    x2 = 2.0f,
                    y2 = 23.7f,
                    x3 = 2.0f,
                    y3 = 16.0f,
                )
                // S 8.3 2 16 2
                reflectiveCurveTo(
                    x1 = 8.3f,
                    y1 = 2.0f,
                    x2 = 16.0f,
                    y2 = 2.0f,
                )
                // h 0.3
                horizontalLineToRelative(dx = 0.3f)
                // l 1.4 0.1
                lineToRelative(dx = 1.4f, dy = 0.1f)
                // l -0.3 1.2
                lineToRelative(dx = -0.3f, dy = 1.2f)
                // a 4.95 4.95 0 0 0 4.8 6.3
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.8f,
                    dy1 = 6.3f,
                )
                // c 1 0 2 -0.3 2.9 -0.9
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = -0.3f,
                    dx3 = 2.9f,
                    dy3 = -0.9f,
                )
                // l 1.3 1.5
                lineToRelative(dx = 1.3f, dy = 1.5f)
                // a 2 2 0 0 0 -0.6 1.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.6f,
                    dy1 = 1.4f,
                )
                // c 0 1.3 1.3 2.4 2.7 1.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.3f,
                    dx2 = 1.3f,
                    dy2 = 2.4f,
                    dx3 = 2.7f,
                    dy3 = 1.9f,
                )
                // l 1.2 -0.5
                lineToRelative(dx = 1.2f, dy = -0.5f)
                // l 0.2 1.3
                lineToRelative(dx = 0.2f, dy = 1.3f)
                // C 30 14.9 30 15.5 30 16
                curveTo(
                    x1 = 30.0f,
                    y1 = 14.9f,
                    x2 = 30.0f,
                    y2 = 15.5f,
                    x3 = 30.0f,
                    y3 = 16.0f,
                )
                // c 0 7.7 -6.3 14 -14 14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.7f,
                    dx2 = -6.3f,
                    dy2 = 14.0f,
                    dx3 = -14.0f,
                    dy3 = 14.0f,
                )
                // M 15.3 4
                moveTo(x = 15.3f, y = 4.0f)
                // C 9 4.4 4 9.6 4 16
                curveTo(
                    x1 = 9.0f,
                    y1 = 4.4f,
                    x2 = 4.0f,
                    y2 = 9.6f,
                    x3 = 4.0f,
                    y3 = 16.0f,
                )
                // c 0 6.6 5.4 12 12 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.6f,
                    dx2 = 5.4f,
                    dy2 = 12.0f,
                    dx3 = 12.0f,
                    dy3 = 12.0f,
                )
                // s 12 -5.4 12 -12
                reflectiveCurveToRelative(
                    dx1 = 12.0f,
                    dy1 = -5.4f,
                    dx2 = 12.0f,
                    dy2 = -12.0f,
                )
                // v -0.4
                verticalLineToRelative(dy = -0.4f)
                // a 4 4 0 0 1 -4.2 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.2f,
                    dy1 = -4.0f,
                )
                // v -0.2
                verticalLineToRelative(dy = -0.2f)
                // a 6.96 6.96 0 0 1 -8.6 -6.8
                arcToRelative(
                    a = 6.96f,
                    b = 6.96f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.6f,
                    dy1 = -6.8f,
                )
                // c 0 -0.2 0 -0.4 0.1 -0.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.2f,
                    dx2 = 0.0f,
                    dy2 = -0.4f,
                    dx3 = 0.1f,
                    dy3 = -0.6f,
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
        }.build().also { _cookie = it }
    }

@Suppress("ObjectPropertyName")
private var _cookie: ImageVector? = null
