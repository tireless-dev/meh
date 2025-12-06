package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunMirror: ImageVector
    get() {
        val current = _runMirror
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RunMirror",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="9.0 19.0 9.0 25.0 14.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
                // L 9 25
                lineTo(x = 9.0f, y = 25.0f)
                // L 14 22z
                lineTo(x = 14.0f, y = 22.0f)
                close()
            }
            // M11 16 c3.3 0 6 2.7 6 6 s-2.7 6 -6 6 -6 -2.7 -6 -6 2.7 -6 6 -6 m0 -2 c-4.4 0 -8 3.6 -8 8 s3.6 8 8 8 8 -3.6 8 -8 -3.6 -8 -8 -8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 16
                moveTo(x = 11.0f, y = 16.0f)
                // c 3.3 0 6 2.7 6 6
                curveToRelative(
                    dx1 = 3.3f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 2.7f,
                    dx3 = 6.0f,
                    dy3 = 6.0f,
                )
                // s -2.7 6 -6 6
                reflectiveCurveToRelative(
                    dx1 = -2.7f,
                    dy1 = 6.0f,
                    dx2 = -6.0f,
                    dy2 = 6.0f,
                )
                // s -6 -2.7 -6 -6
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -2.7f,
                    dx2 = -6.0f,
                    dy2 = -6.0f,
                )
                // s 2.7 -6 6 -6
                reflectiveCurveToRelative(
                    dx1 = 2.7f,
                    dy1 = -6.0f,
                    dx2 = 6.0f,
                    dy2 = -6.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // c -4.4 0 -8 3.6 -8 8
                curveToRelative(
                    dx1 = -4.4f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 3.6f,
                    dx3 = -8.0f,
                    dy3 = 8.0f,
                )
                // s 3.6 8 8 8
                reflectiveCurveToRelative(
                    dx1 = 3.6f,
                    dy1 = 8.0f,
                    dx2 = 8.0f,
                    dy2 = 8.0f,
                )
                // s 8 -3.6 8 -8
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = -3.6f,
                    dx2 = 8.0f,
                    dy2 = -8.0f,
                )
                // s -3.6 -8 -8 -8
                reflectiveCurveToRelative(
                    dx1 = -3.6f,
                    dy1 = -8.0f,
                    dx2 = -8.0f,
                    dy2 = -8.0f,
                )
            }
            // M4 6 v6 h22 v14 h-4 v2 h4 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 m2 4 V6 h20 v4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // m 2 4
                moveToRelative(dx = 2.0f, dy = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 4z
                verticalLineToRelative(dy = 4.0f)
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
        }.build().also { _runMirror = it }
    }

@Suppress("ObjectPropertyName")
private var _runMirror: ImageVector? = null
