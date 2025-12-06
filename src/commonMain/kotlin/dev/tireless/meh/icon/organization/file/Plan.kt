package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Plan: ImageVector
    get() {
        val current = _plan
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Plan",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M31 8 c0 -.4 -.2 -.7 -.5 -.9 l-7 -4 C23.3 3 23.2 3 23 3 s-.3 0 -.5 .1 L16 6.8 9.5 3.1 C9.3 3 9.2 3 9 3 S8.7 3 8.5 3.1 l-7 4 A1 1 0 0 0 1 8 v20 c0 .6 .4 1 1 1 .2 0 .3 -.1 .5 -.1 L9 25.2 l6.5 3.7 C15.7 29 15.8 29 16 29 s.3 0 .5 -.1 l6.5 -3.7 6.5 3.7 C29.6 29 29.8 29 30 29 c.6 0 1 -.4 1 -1z M3 8.6 l5 -2.9 v17.7 l-5 2.9z m12 17.7 -5 -2.9 V5.7 l5 2.9z m7 -2.9 -5 2.9 V8.6 l5 -2.9z m2 0 V5.7 l5 2.9 v17.7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 8
                moveTo(x = 31.0f, y = 8.0f)
                // c 0 -0.4 -0.2 -0.7 -0.5 -0.9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.4f,
                    dx2 = -0.2f,
                    dy2 = -0.7f,
                    dx3 = -0.5f,
                    dy3 = -0.9f,
                )
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // C 23.3 3 23.2 3 23 3
                curveTo(
                    x1 = 23.3f,
                    y1 = 3.0f,
                    x2 = 23.2f,
                    y2 = 3.0f,
                    x3 = 23.0f,
                    y3 = 3.0f,
                )
                // s -0.3 0 -0.5 0.1
                reflectiveCurveToRelative(
                    dx1 = -0.3f,
                    dy1 = 0.0f,
                    dx2 = -0.5f,
                    dy2 = 0.1f,
                )
                // L 16 6.8
                lineTo(x = 16.0f, y = 6.8f)
                // L 9.5 3.1
                lineTo(x = 9.5f, y = 3.1f)
                // C 9.3 3 9.2 3 9 3
                curveTo(
                    x1 = 9.3f,
                    y1 = 3.0f,
                    x2 = 9.2f,
                    y2 = 3.0f,
                    x3 = 9.0f,
                    y3 = 3.0f,
                )
                // S 8.7 3 8.5 3.1
                reflectiveCurveTo(
                    x1 = 8.7f,
                    y1 = 3.0f,
                    x2 = 8.5f,
                    y2 = 3.1f,
                )
                // l -7 4
                lineToRelative(dx = -7.0f, dy = 4.0f)
                // A 1 1 0 0 0 1 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 1.0f,
                    y1 = 8.0f,
                )
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // c 0 0.6 0.4 1 1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = 0.4f,
                    dy2 = 1.0f,
                    dx3 = 1.0f,
                    dy3 = 1.0f,
                )
                // c 0.2 0 0.3 -0.1 0.5 -0.1
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = 0.0f,
                    dx2 = 0.3f,
                    dy2 = -0.1f,
                    dx3 = 0.5f,
                    dy3 = -0.1f,
                )
                // L 9 25.2
                lineTo(x = 9.0f, y = 25.2f)
                // l 6.5 3.7
                lineToRelative(dx = 6.5f, dy = 3.7f)
                // C 15.7 29 15.8 29 16 29
                curveTo(
                    x1 = 15.7f,
                    y1 = 29.0f,
                    x2 = 15.8f,
                    y2 = 29.0f,
                    x3 = 16.0f,
                    y3 = 29.0f,
                )
                // s 0.3 0 0.5 -0.1
                reflectiveCurveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.0f,
                    dx2 = 0.5f,
                    dy2 = -0.1f,
                )
                // l 6.5 -3.7
                lineToRelative(dx = 6.5f, dy = -3.7f)
                // l 6.5 3.7
                lineToRelative(dx = 6.5f, dy = 3.7f)
                // C 29.6 29 29.8 29 30 29
                curveTo(
                    x1 = 29.6f,
                    y1 = 29.0f,
                    x2 = 29.8f,
                    y2 = 29.0f,
                    x3 = 30.0f,
                    y3 = 29.0f,
                )
                // c 0.6 0 1 -0.4 1 -1z
                curveToRelative(
                    dx1 = 0.6f,
                    dy1 = 0.0f,
                    dx2 = 1.0f,
                    dy2 = -0.4f,
                    dx3 = 1.0f,
                    dy3 = -1.0f,
                )
                close()
                // M 3 8.6
                moveTo(x = 3.0f, y = 8.6f)
                // l 5 -2.9
                lineToRelative(dx = 5.0f, dy = -2.9f)
                // v 17.7
                verticalLineToRelative(dy = 17.7f)
                // l -5 2.9z
                lineToRelative(dx = -5.0f, dy = 2.9f)
                close()
                // m 12 17.7
                moveToRelative(dx = 12.0f, dy = 17.7f)
                // l -5 -2.9
                lineToRelative(dx = -5.0f, dy = -2.9f)
                // V 5.7
                verticalLineTo(y = 5.7f)
                // l 5 2.9z
                lineToRelative(dx = 5.0f, dy = 2.9f)
                close()
                // m 7 -2.9
                moveToRelative(dx = 7.0f, dy = -2.9f)
                // l -5 2.9
                lineToRelative(dx = -5.0f, dy = 2.9f)
                // V 8.6
                verticalLineTo(y = 8.6f)
                // l 5 -2.9z
                lineToRelative(dx = 5.0f, dy = -2.9f)
                close()
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // V 5.7
                verticalLineTo(y = 5.7f)
                // l 5 2.9
                lineToRelative(dx = 5.0f, dy = 2.9f)
                // v 17.7z
                verticalLineToRelative(dy = 17.7f)
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
        }.build().also { _plan = it }
    }

@Suppress("ObjectPropertyName")
private var _plan: ImageVector? = null
