package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleRightSolid: ImageVector
    get() {
        val current = _triangleRightSolid
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TriangleRightSolid",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M3 2.98 A1 1 0 0 1 4 2 a1 1 0 0 1 .49 .12 l23.99 13.02 C28.82 15.34 29 15.67 29 16 s-.18 .67 -.52 .86 l-24 13.02 A1 1 0 0 1 4 30 a1 1 0 0 1 -1 -.98z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 2.98
                moveTo(x = 3.0f, y = 2.98f)
                // A 1 1 0 0 1 4 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 2.0f,
                )
                // a 1 1 0 0 1 0.49 0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.49f,
                    dy1 = 0.12f,
                )
                // l 23.99 13.02
                lineToRelative(dx = 23.99f, dy = 13.02f)
                // C 28.82 15.34 29 15.67 29 16
                curveTo(
                    x1 = 28.82f,
                    y1 = 15.34f,
                    x2 = 29.0f,
                    y2 = 15.67f,
                    x3 = 29.0f,
                    y3 = 16.0f,
                )
                // s -0.18 0.67 -0.52 0.86
                reflectiveCurveToRelative(
                    dx1 = -0.18f,
                    dy1 = 0.67f,
                    dx2 = -0.52f,
                    dy2 = 0.86f,
                )
                // l -24 13.02
                lineToRelative(dx = -24.0f, dy = 13.02f)
                // A 1 1 0 0 1 4 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 30.0f,
                )
                // a 1 1 0 0 1 -1 -0.98z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -0.98f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // l -1.3987644E-6 32
                lineToRelative(dx = -1.3987644E-6f, dy = 32.0f)
                // l -32 -1.3987644E-6
                lineToRelative(dx = -32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 -32z
                lineToRelative(dx = 1.3987644E-6f, dy = -32.0f)
                close()
            }
        }.build().also { _triangleRightSolid = it }
    }

@Suppress("ObjectPropertyName")
private var _triangleRightSolid: ImageVector? = null
