package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JobDaemon: ImageVector
    get() {
        val current = _jobDaemon
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.JobDaemon",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 17 h8 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v11 a2 2 0 0 0 2 2 m0 -13 h8 v11 h-8z M8 19 h5 v2 H8 a2 2 0 0 1 -2 -2 V8 h2z m-4 4 h5 v2 H4 a2 2 0 0 1 -2 -2 V12 h2z m23 -3 c-1.6 0 -3.1 1.4 -4 2.4 -.9 -1 -2.4 -2.4 -4 -2.4 -2.6 0 -4 2 -4 4 s1.4 4 4 4 3.1 -1.4 4 -2.4 c.9 1 2.4 2.4 4 2.4 2.6 0 4 -2 4 -4 s-1.4 -4 -4 -4 m-8 6 c-1.5 0 -2 -1.1 -2 -2 s.5 -2 2 -2 2 1.1 2.8 2 c-.7 .9 -1.9 2 -2.8 2 m8 0 c-.9 0 -2 -1.1 -2.8 -2 .7 -.9 1.9 -2 2.8 -2 1.5 0 2 1.1 2 2 s-.5 2 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
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
                // m 0 -13
                moveToRelative(dx = 0.0f, dy = -13.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
                close()
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 23 -3
                moveToRelative(dx = 23.0f, dy = -3.0f)
                // c -1.6 0 -3.1 1.4 -4 2.4
                curveToRelative(
                    dx1 = -1.6f,
                    dy1 = 0.0f,
                    dx2 = -3.1f,
                    dy2 = 1.4f,
                    dx3 = -4.0f,
                    dy3 = 2.4f,
                )
                // c -0.9 -1 -2.4 -2.4 -4 -2.4
                curveToRelative(
                    dx1 = -0.9f,
                    dy1 = -1.0f,
                    dx2 = -2.4f,
                    dy2 = -2.4f,
                    dx3 = -4.0f,
                    dy3 = -2.4f,
                )
                // c -2.6 0 -4 2 -4 4
                curveToRelative(
                    dx1 = -2.6f,
                    dy1 = 0.0f,
                    dx2 = -4.0f,
                    dy2 = 2.0f,
                    dx3 = -4.0f,
                    dy3 = 4.0f,
                )
                // s 1.4 4 4 4
                reflectiveCurveToRelative(
                    dx1 = 1.4f,
                    dy1 = 4.0f,
                    dx2 = 4.0f,
                    dy2 = 4.0f,
                )
                // s 3.1 -1.4 4 -2.4
                reflectiveCurveToRelative(
                    dx1 = 3.1f,
                    dy1 = -1.4f,
                    dx2 = 4.0f,
                    dy2 = -2.4f,
                )
                // c 0.9 1 2.4 2.4 4 2.4
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = 1.0f,
                    dx2 = 2.4f,
                    dy2 = 2.4f,
                    dx3 = 4.0f,
                    dy3 = 2.4f,
                )
                // c 2.6 0 4 -2 4 -4
                curveToRelative(
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -2.0f,
                    dx3 = 4.0f,
                    dy3 = -4.0f,
                )
                // s -1.4 -4 -4 -4
                reflectiveCurveToRelative(
                    dx1 = -1.4f,
                    dy1 = -4.0f,
                    dx2 = -4.0f,
                    dy2 = -4.0f,
                )
                // m -8 6
                moveToRelative(dx = -8.0f, dy = 6.0f)
                // c -1.5 0 -2 -1.1 -2 -2
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.1f,
                    dx3 = -2.0f,
                    dy3 = -2.0f,
                )
                // s 0.5 -2 2 -2
                reflectiveCurveToRelative(
                    dx1 = 0.5f,
                    dy1 = -2.0f,
                    dx2 = 2.0f,
                    dy2 = -2.0f,
                )
                // s 2 1.1 2.8 2
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.1f,
                    dx2 = 2.8f,
                    dy2 = 2.0f,
                )
                // c -0.7 0.9 -1.9 2 -2.8 2
                curveToRelative(
                    dx1 = -0.7f,
                    dy1 = 0.9f,
                    dx2 = -1.9f,
                    dy2 = 2.0f,
                    dx3 = -2.8f,
                    dy3 = 2.0f,
                )
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // c -0.9 0 -2 -1.1 -2.8 -2
                curveToRelative(
                    dx1 = -0.9f,
                    dy1 = 0.0f,
                    dx2 = -2.0f,
                    dy2 = -1.1f,
                    dx3 = -2.8f,
                    dy3 = -2.0f,
                )
                // c 0.7 -0.9 1.9 -2 2.8 -2
                curveToRelative(
                    dx1 = 0.7f,
                    dy1 = -0.9f,
                    dx2 = 1.9f,
                    dy2 = -2.0f,
                    dx3 = 2.8f,
                    dy3 = -2.0f,
                )
                // c 1.5 0 2 1.1 2 2
                curveToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.0f,
                    dx2 = 2.0f,
                    dy2 = 1.1f,
                    dx3 = 2.0f,
                    dy3 = 2.0f,
                )
                // s -0.5 2 -2 2
                reflectiveCurveToRelative(
                    dx1 = -0.5f,
                    dy1 = 2.0f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
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
        }.build().also { _jobDaemon = it }
    }

@Suppress("ObjectPropertyName")
private var _jobDaemon: ImageVector? = null
