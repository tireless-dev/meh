package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HexagonOutline: ImageVector
    get() {
        val current = _hexagonOutline
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.HexagonOutline",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 29 H9 a1 1 0 0 1 -.86 -.5 l-7 -12 a1 1 0 0 1 0 -1 l7 -12 A1 1 0 0 1 9 3 h14 a1 1 0 0 1 .86 .5 l7 12 a1 1 0 0 1 0 1 l-7 12 A1 1 0 0 1 23 29 M9.57 27 h12.86 l6.41 -11 -6.41 -11 H9.57 L3.16 16z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 29
                moveTo(x = 23.0f, y = 29.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 1 -0.86 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.86f,
                    dy1 = -0.5f,
                )
                // l -7 -12
                lineToRelative(dx = -7.0f, dy = -12.0f)
                // a 1 1 0 0 1 0 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
                // l 7 -12
                lineToRelative(dx = 7.0f, dy = -12.0f)
                // A 1 1 0 0 1 9 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 3.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 1 0.86 0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.86f,
                    dy1 = 0.5f,
                )
                // l 7 12
                lineToRelative(dx = 7.0f, dy = 12.0f)
                // a 1 1 0 0 1 0 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                )
                // l -7 12
                lineToRelative(dx = -7.0f, dy = 12.0f)
                // A 1 1 0 0 1 23 29
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 29.0f,
                )
                // M 9.57 27
                moveTo(x = 9.57f, y = 27.0f)
                // h 12.86
                horizontalLineToRelative(dx = 12.86f)
                // l 6.41 -11
                lineToRelative(dx = 6.41f, dy = -11.0f)
                // l -6.41 -11
                lineToRelative(dx = -6.41f, dy = -11.0f)
                // H 9.57
                horizontalLineTo(x = 9.57f)
                // L 3.16 16z
                lineTo(x = 3.16f, y = 16.0f)
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
        }.build().also { _hexagonOutline = it }
    }

@Suppress("ObjectPropertyName")
private var _hexagonOutline: ImageVector? = null
