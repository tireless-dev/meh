package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Subsetting: ImageVector
    get() {
        val current = _subsetting
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Subsetting",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m24.87 16.5 -8 -14 c-.36 -.62 -1.38 -.62 -1.74 0 l-8 14 A1 1 0 0 0 8 18 h7 v12 h2 V18 h7 a1 1 0 0 0 .87 -1.5 M9.72 16 16 5.02 22.28 16z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.87 16.5
                moveTo(x = 24.87f, y = 16.5f)
                // l -8 -14
                lineToRelative(dx = -8.0f, dy = -14.0f)
                // c -0.36 -0.62 -1.38 -0.62 -1.74 0
                curveToRelative(
                    dx1 = -0.36f,
                    dy1 = -0.62f,
                    dx2 = -1.38f,
                    dy2 = -0.62f,
                    dx3 = -1.74f,
                    dy3 = 0.0f,
                )
                // l -8 14
                lineToRelative(dx = -8.0f, dy = 14.0f)
                // A 1 1 0 0 0 8 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 18.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // a 1 1 0 0 0 0.87 -1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.87f,
                    dy1 = -1.5f,
                )
                // M 9.72 16
                moveTo(x = 9.72f, y = 16.0f)
                // L 16 5.02
                lineTo(x = 16.0f, y = 5.02f)
                // L 22.28 16z
                lineTo(x = 22.28f, y = 16.0f)
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
        }.build().also { _subsetting = it }
    }

@Suppress("ObjectPropertyName")
private var _subsetting: ImageVector? = null
