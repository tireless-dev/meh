package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoftwareResourceCluster: ImageVector
    get() {
        val current = _softwareResourceCluster
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SoftwareResourceCluster",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 21 c-.5 0 -1 -.2 -1.4 -.6 l-3 -3 C19.2 17 19 16.5 19 16 s.2 -1 .6 -1.4 l3 -3 C23 11.2 23.5 11 24 11 s1 .2 1.4 .6 l3 3 C28.8 15 29 15.5 29 16 s-.2 1 -.6 1.4 l-3 3 A2 2 0 0 1 24 21 m0 -8 -3 3 3 3 3 -3z m-8 0 c-.5 0 -1 -.2 -1.4 -.6 l-3 -3 C11.2 9 11 8.5 11 8 s.2 -1 .6 -1.4 l3 -3 C15 3.2 15.5 3 16 3 s1 .2 1.4 .6 l3 3 C20.8 7 21 7.5 21 8 s-.2 1 -.6 1.4 l-3 3 A2 2 0 0 1 16 13 m0 -8 -3 3 3 3 3 -3z m0 24 c-.5 0 -1 -.2 -1.4 -.6 l-3 -3 C11.2 25 11 24.5 11 24 s.2 -1 .6 -1.4 l3 -3 C15 19.2 15.5 19 16 19 s1 .2 1.4 .6 l3 3 C20.8 23 21 23.5 21 24 s-.2 1 -.6 1.4 l-3 3 A2 2 0 0 1 16 29 m0 -8 -3 3 3 3 3 -3z m-8 0 c-.5 0 -1 -.2 -1.4 -.6 l-3 -3 C3.2 17 3 16.5 3 16 s.2 -1 .6 -1.4 l3 -3 C7 11.2 7.5 11 8 11 s1 .2 1.4 .6 l3 3 C12.8 15 13 15.5 13 16 s-.2 1 -.6 1.4 l-3 3 A2 2 0 0 1 8 21 m0 -8 -3 3 3 3 3 -3z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 21
                moveTo(x = 24.0f, y = 21.0f)
                // c -0.5 0 -1 -0.2 -1.4 -0.6
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.2f,
                    dx3 = -1.4f,
                    dy3 = -0.6f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // C 19.2 17 19 16.5 19 16
                curveTo(
                    x1 = 19.2f,
                    y1 = 17.0f,
                    x2 = 19.0f,
                    y2 = 16.5f,
                    x3 = 19.0f,
                    y3 = 16.0f,
                )
                // s 0.2 -1 0.6 -1.4
                reflectiveCurveToRelative(
                    dx1 = 0.2f,
                    dy1 = -1.0f,
                    dx2 = 0.6f,
                    dy2 = -1.4f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // C 23 11.2 23.5 11 24 11
                curveTo(
                    x1 = 23.0f,
                    y1 = 11.2f,
                    x2 = 23.5f,
                    y2 = 11.0f,
                    x3 = 24.0f,
                    y3 = 11.0f,
                )
                // s 1 0.2 1.4 0.6
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.2f,
                    dx2 = 1.4f,
                    dy2 = 0.6f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // C 28.8 15 29 15.5 29 16
                curveTo(
                    x1 = 28.8f,
                    y1 = 15.0f,
                    x2 = 29.0f,
                    y2 = 15.5f,
                    x3 = 29.0f,
                    y3 = 16.0f,
                )
                // s -0.2 1 -0.6 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.2f,
                    dy1 = 1.0f,
                    dx2 = -0.6f,
                    dy2 = 1.4f,
                )
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // A 2 2 0 0 1 24 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 21.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3z
                lineToRelative(dx = 3.0f, dy = -3.0f)
                close()
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // c -0.5 0 -1 -0.2 -1.4 -0.6
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.2f,
                    dx3 = -1.4f,
                    dy3 = -0.6f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // C 11.2 9 11 8.5 11 8
                curveTo(
                    x1 = 11.2f,
                    y1 = 9.0f,
                    x2 = 11.0f,
                    y2 = 8.5f,
                    x3 = 11.0f,
                    y3 = 8.0f,
                )
                // s 0.2 -1 0.6 -1.4
                reflectiveCurveToRelative(
                    dx1 = 0.2f,
                    dy1 = -1.0f,
                    dx2 = 0.6f,
                    dy2 = -1.4f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // C 15 3.2 15.5 3 16 3
                curveTo(
                    x1 = 15.0f,
                    y1 = 3.2f,
                    x2 = 15.5f,
                    y2 = 3.0f,
                    x3 = 16.0f,
                    y3 = 3.0f,
                )
                // s 1 0.2 1.4 0.6
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.2f,
                    dx2 = 1.4f,
                    dy2 = 0.6f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // C 20.8 7 21 7.5 21 8
                curveTo(
                    x1 = 20.8f,
                    y1 = 7.0f,
                    x2 = 21.0f,
                    y2 = 7.5f,
                    x3 = 21.0f,
                    y3 = 8.0f,
                )
                // s -0.2 1 -0.6 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.2f,
                    dy1 = 1.0f,
                    dx2 = -0.6f,
                    dy2 = 1.4f,
                )
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // A 2 2 0 0 1 16 13
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 13.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3z
                lineToRelative(dx = 3.0f, dy = -3.0f)
                close()
                // m 0 24
                moveToRelative(dx = 0.0f, dy = 24.0f)
                // c -0.5 0 -1 -0.2 -1.4 -0.6
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.2f,
                    dx3 = -1.4f,
                    dy3 = -0.6f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // C 11.2 25 11 24.5 11 24
                curveTo(
                    x1 = 11.2f,
                    y1 = 25.0f,
                    x2 = 11.0f,
                    y2 = 24.5f,
                    x3 = 11.0f,
                    y3 = 24.0f,
                )
                // s 0.2 -1 0.6 -1.4
                reflectiveCurveToRelative(
                    dx1 = 0.2f,
                    dy1 = -1.0f,
                    dx2 = 0.6f,
                    dy2 = -1.4f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // C 15 19.2 15.5 19 16 19
                curveTo(
                    x1 = 15.0f,
                    y1 = 19.2f,
                    x2 = 15.5f,
                    y2 = 19.0f,
                    x3 = 16.0f,
                    y3 = 19.0f,
                )
                // s 1 0.2 1.4 0.6
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.2f,
                    dx2 = 1.4f,
                    dy2 = 0.6f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // C 20.8 23 21 23.5 21 24
                curveTo(
                    x1 = 20.8f,
                    y1 = 23.0f,
                    x2 = 21.0f,
                    y2 = 23.5f,
                    x3 = 21.0f,
                    y3 = 24.0f,
                )
                // s -0.2 1 -0.6 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.2f,
                    dy1 = 1.0f,
                    dx2 = -0.6f,
                    dy2 = 1.4f,
                )
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // A 2 2 0 0 1 16 29
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 29.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3z
                lineToRelative(dx = 3.0f, dy = -3.0f)
                close()
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // c -0.5 0 -1 -0.2 -1.4 -0.6
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.2f,
                    dx3 = -1.4f,
                    dy3 = -0.6f,
                )
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // C 3.2 17 3 16.5 3 16
                curveTo(
                    x1 = 3.2f,
                    y1 = 17.0f,
                    x2 = 3.0f,
                    y2 = 16.5f,
                    x3 = 3.0f,
                    y3 = 16.0f,
                )
                // s 0.2 -1 0.6 -1.4
                reflectiveCurveToRelative(
                    dx1 = 0.2f,
                    dy1 = -1.0f,
                    dx2 = 0.6f,
                    dy2 = -1.4f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // C 7 11.2 7.5 11 8 11
                curveTo(
                    x1 = 7.0f,
                    y1 = 11.2f,
                    x2 = 7.5f,
                    y2 = 11.0f,
                    x3 = 8.0f,
                    y3 = 11.0f,
                )
                // s 1 0.2 1.4 0.6
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.2f,
                    dx2 = 1.4f,
                    dy2 = 0.6f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // C 12.8 15 13 15.5 13 16
                curveTo(
                    x1 = 12.8f,
                    y1 = 15.0f,
                    x2 = 13.0f,
                    y2 = 15.5f,
                    x3 = 13.0f,
                    y3 = 16.0f,
                )
                // s -0.2 1 -0.6 1.4
                reflectiveCurveToRelative(
                    dx1 = -0.2f,
                    dy1 = 1.0f,
                    dx2 = -0.6f,
                    dy2 = 1.4f,
                )
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // A 2 2 0 0 1 8 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 21.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3z
                lineToRelative(dx = 3.0f, dy = -3.0f)
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
        }.build().also { _softwareResourceCluster = it }
    }

@Suppress("ObjectPropertyName")
private var _softwareResourceCluster: ImageVector? = null
