package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleLeftSolid: ImageVector
    get() {
        val current = _triangleLeftSolid
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TriangleLeftSolid",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 29.02 A1 1 0 0 1 28 30 a1 1 0 0 1 -.49 -.12 L3.52 16.86 C3.18 16.66 3 16.33 3 16 s.18 -.67 .52 -.86 l24 -13.02 A1 1 0 0 1 28 2 a1 1 0 0 1 1 .98z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 29.02
                moveTo(x = 29.0f, y = 29.02f)
                // A 1 1 0 0 1 28 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 30.0f,
                )
                // a 1 1 0 0 1 -0.49 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.49f,
                    dy1 = -0.12f,
                )
                // L 3.52 16.86
                lineTo(x = 3.52f, y = 16.86f)
                // C 3.18 16.66 3 16.33 3 16
                curveTo(
                    x1 = 3.18f,
                    y1 = 16.66f,
                    x2 = 3.0f,
                    y2 = 16.33f,
                    x3 = 3.0f,
                    y3 = 16.0f,
                )
                // s 0.18 -0.67 0.52 -0.86
                reflectiveCurveToRelative(
                    dx1 = 0.18f,
                    dy1 = -0.67f,
                    dx2 = 0.52f,
                    dy2 = -0.86f,
                )
                // l 24 -13.02
                lineToRelative(dx = 24.0f, dy = -13.02f)
                // A 1 1 0 0 1 28 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 2.0f,
                )
                // a 1 1 0 0 1 1 0.98z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.98f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // l -1.3987644E-6 -32
                lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
                // l 32 -1.3987644E-6
                lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 32z
                lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
                close()
            }
        }.build().also { _triangleLeftSolid = it }
    }

@Suppress("ObjectPropertyName")
private var _triangleLeftSolid: ImageVector? = null
