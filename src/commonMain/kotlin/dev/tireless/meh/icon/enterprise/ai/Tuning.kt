package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tuning: ImageVector
    get() {
        val current = _tuning
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Tuning",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 30 v-4.1 c2.3 -.5 4 -2.5 4 -4.9 s-1.7 -4.4 -4 -4.9 V2 h-2 v14.1 c-2.3 .5 -4 2.5 -4 4.9 s1.7 4.4 4 4.9 V30z m-4 -9 c0 -1.7 1.3 -3 3 -3 s3 1.3 3 3 -1.3 3 -3 3 -3 -1.3 -3 -3 M8 2 v4.1 C5.7 6.6 4 8.6 4 11 s1.7 4.4 4 4.9 V30 h2 V15.9 c2.3 -.5 4 -2.5 4 -4.9 s-1.7 -4.4 -4 -4.9 V2z m4 9 c0 1.7 -1.3 3 -3 3 s-3 -1.3 -3 -3 1.3 -3 3 -3 3 1.3 3 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 30
                moveTo(x = 24.0f, y = 30.0f)
                // v -4.1
                verticalLineToRelative(dy = -4.1f)
                // c 2.3 -0.5 4 -2.5 4 -4.9
                curveToRelative(
                    dx1 = 2.3f,
                    dy1 = -0.5f,
                    dx2 = 4.0f,
                    dy2 = -2.5f,
                    dx3 = 4.0f,
                    dy3 = -4.9f,
                )
                // s -1.7 -4.4 -4 -4.9
                reflectiveCurveToRelative(
                    dx1 = -1.7f,
                    dy1 = -4.4f,
                    dx2 = -4.0f,
                    dy2 = -4.9f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 14.1
                verticalLineToRelative(dy = 14.1f)
                // c -2.3 0.5 -4 2.5 -4 4.9
                curveToRelative(
                    dx1 = -2.3f,
                    dy1 = 0.5f,
                    dx2 = -4.0f,
                    dy2 = 2.5f,
                    dx3 = -4.0f,
                    dy3 = 4.9f,
                )
                // s 1.7 4.4 4 4.9
                reflectiveCurveToRelative(
                    dx1 = 1.7f,
                    dy1 = 4.4f,
                    dx2 = 4.0f,
                    dy2 = 4.9f,
                )
                // V 30z
                verticalLineTo(y = 30.0f)
                close()
                // m -4 -9
                moveToRelative(dx = -4.0f, dy = -9.0f)
                // c 0 -1.7 1.3 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                    dx2 = 1.3f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // s 3 1.3 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.3f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
                )
                // s -1.3 3 -3 3
                reflectiveCurveToRelative(
                    dx1 = -1.3f,
                    dy1 = 3.0f,
                    dx2 = -3.0f,
                    dy2 = 3.0f,
                )
                // s -3 -1.3 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.3f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 4.1
                verticalLineToRelative(dy = 4.1f)
                // C 5.7 6.6 4 8.6 4 11
                curveTo(
                    x1 = 5.7f,
                    y1 = 6.6f,
                    x2 = 4.0f,
                    y2 = 8.6f,
                    x3 = 4.0f,
                    y3 = 11.0f,
                )
                // s 1.7 4.4 4 4.9
                reflectiveCurveToRelative(
                    dx1 = 1.7f,
                    dy1 = 4.4f,
                    dx2 = 4.0f,
                    dy2 = 4.9f,
                )
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 15.9
                verticalLineTo(y = 15.9f)
                // c 2.3 -0.5 4 -2.5 4 -4.9
                curveToRelative(
                    dx1 = 2.3f,
                    dy1 = -0.5f,
                    dx2 = 4.0f,
                    dy2 = -2.5f,
                    dx3 = 4.0f,
                    dy3 = -4.9f,
                )
                // s -1.7 -4.4 -4 -4.9
                reflectiveCurveToRelative(
                    dx1 = -1.7f,
                    dy1 = -4.4f,
                    dx2 = -4.0f,
                    dy2 = -4.9f,
                )
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 4 9
                moveToRelative(dx = 4.0f, dy = 9.0f)
                // c 0 1.7 -1.3 3 -3 3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                    dx2 = -1.3f,
                    dy2 = 3.0f,
                    dx3 = -3.0f,
                    dy3 = 3.0f,
                )
                // s -3 -1.3 -3 -3
                reflectiveCurveToRelative(
                    dx1 = -3.0f,
                    dy1 = -1.3f,
                    dx2 = -3.0f,
                    dy2 = -3.0f,
                )
                // s 1.3 -3 3 -3
                reflectiveCurveToRelative(
                    dx1 = 1.3f,
                    dy1 = -3.0f,
                    dx2 = 3.0f,
                    dy2 = -3.0f,
                )
                // s 3 1.3 3 3
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 1.3f,
                    dx2 = 3.0f,
                    dy2 = 3.0f,
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
        }.build().also { _tuning = it }
    }

@Suppress("ObjectPropertyName")
private var _tuning: ImageVector? = null
