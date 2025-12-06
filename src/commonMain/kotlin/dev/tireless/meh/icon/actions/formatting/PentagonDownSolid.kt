package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PentagonDownSolid: ImageVector
    get() {
        val current = _pentagonDownSolid
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PentagonDownSolid",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 30 a1 1 0 0 0 .6 -.2 l13 -9.54 a1 1 0 0 0 .35 -1.11 L24.98 3.69 A1 1 0 0 0 24.03 3 H7.97 a1 1 0 0 0 -.95 .7 L2.05 19.14 a1 1 0 0 0 .36 1.11 l13 9.55 A1 1 0 0 0 16 30
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 1 1 0 0 0 0.6 -0.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.6f,
                    dy1 = -0.2f,
                )
                // l 13 -9.54
                lineToRelative(dx = 13.0f, dy = -9.54f)
                // a 1 1 0 0 0 0.35 -1.11
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.35f,
                    dy1 = -1.11f,
                )
                // L 24.98 3.69
                lineTo(x = 24.98f, y = 3.69f)
                // A 1 1 0 0 0 24.03 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.03f,
                    y1 = 3.0f,
                )
                // H 7.97
                horizontalLineTo(x = 7.97f)
                // a 1 1 0 0 0 -0.95 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.95f,
                    dy1 = 0.7f,
                )
                // L 2.05 19.14
                lineTo(x = 2.05f, y = 19.14f)
                // a 1 1 0 0 0 0.36 1.11
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.36f,
                    dy1 = 1.11f,
                )
                // l 13 9.55
                lineToRelative(dx = 13.0f, dy = 9.55f)
                // A 1 1 0 0 0 16 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
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
        }.build().also { _pentagonDownSolid = it }
    }

@Suppress("ObjectPropertyName")
private var _pentagonDownSolid: ImageVector? = null
