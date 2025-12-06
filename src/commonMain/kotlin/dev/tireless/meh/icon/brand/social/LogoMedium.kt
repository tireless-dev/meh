package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoMedium: ImageVector
    get() {
        val current = _logoMedium
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LogoMedium",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 16 c0 3.7 -.6 6.7 -1.4 6.7 s-1.4 -3 -1.4 -6.7 .6 -6.7 1.4 -6.7 1.4 3 1.4 6.7 m-3.5 0 c0 4.1 -1.8 7.5 -3.9 7.5 s-3.9 -3.4 -3.9 -7.5 1.8 -7.5 3.9 -7.5 3.9 3.4 3.9 7.5 m-8.7 0 c0 4.4 -3.5 8 -7.9 8 S2 20.4 2 16 s3.5 -8 7.9 -8 7.9 3.6 7.9 8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // c 0 3.7 -0.6 6.7 -1.4 6.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.7f,
                    dx2 = -0.6f,
                    dy2 = 6.7f,
                    dx3 = -1.4f,
                    dy3 = 6.7f,
                )
                // s -1.4 -3 -1.4 -6.7
                reflectiveCurveToRelative(
                    dx1 = -1.4f,
                    dy1 = -3.0f,
                    dx2 = -1.4f,
                    dy2 = -6.7f,
                )
                // s 0.6 -6.7 1.4 -6.7
                reflectiveCurveToRelative(
                    dx1 = 0.6f,
                    dy1 = -6.7f,
                    dx2 = 1.4f,
                    dy2 = -6.7f,
                )
                // s 1.4 3 1.4 6.7
                reflectiveCurveToRelative(
                    dx1 = 1.4f,
                    dy1 = 3.0f,
                    dx2 = 1.4f,
                    dy2 = 6.7f,
                )
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // c 0 4.1 -1.8 7.5 -3.9 7.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.1f,
                    dx2 = -1.8f,
                    dy2 = 7.5f,
                    dx3 = -3.9f,
                    dy3 = 7.5f,
                )
                // s -3.9 -3.4 -3.9 -7.5
                reflectiveCurveToRelative(
                    dx1 = -3.9f,
                    dy1 = -3.4f,
                    dx2 = -3.9f,
                    dy2 = -7.5f,
                )
                // s 1.8 -7.5 3.9 -7.5
                reflectiveCurveToRelative(
                    dx1 = 1.8f,
                    dy1 = -7.5f,
                    dx2 = 3.9f,
                    dy2 = -7.5f,
                )
                // s 3.9 3.4 3.9 7.5
                reflectiveCurveToRelative(
                    dx1 = 3.9f,
                    dy1 = 3.4f,
                    dx2 = 3.9f,
                    dy2 = 7.5f,
                )
                // m -8.7 0
                moveToRelative(dx = -8.7f, dy = 0.0f)
                // c 0 4.4 -3.5 8 -7.9 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.4f,
                    dx2 = -3.5f,
                    dy2 = 8.0f,
                    dx3 = -7.9f,
                    dy3 = 8.0f,
                )
                // S 2 20.4 2 16
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 20.4f,
                    x2 = 2.0f,
                    y2 = 16.0f,
                )
                // s 3.5 -8 7.9 -8
                reflectiveCurveToRelative(
                    dx1 = 3.5f,
                    dy1 = -8.0f,
                    dx2 = 7.9f,
                    dy2 = -8.0f,
                )
                // s 7.9 3.6 7.9 8
                reflectiveCurveToRelative(
                    dx1 = 7.9f,
                    dy1 = 3.6f,
                    dx2 = 7.9f,
                    dy2 = 8.0f,
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
        }.build().also { _logoMedium = it }
    }

@Suppress("ObjectPropertyName")
private var _logoMedium: ImageVector? = null
