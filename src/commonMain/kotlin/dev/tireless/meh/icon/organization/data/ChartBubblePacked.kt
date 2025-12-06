package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBubblePacked: ImageVector
    get() {
        val current = _chartBubblePacked
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartBubblePacked",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27.53 17.17 A8.99 8.99 0 1 0 13.61 5.88 a6 6 0 1 0 -8.56 7.34 7 7 0 1 0 8 11.49 A6 6 0 0 0 25 24 l-.02 -.36 a3.49 3.49 0 1 0 2.55 -6.47 M21 4 a7 7 0 1 1 -7 7 7 7 0 0 1 7 -7 M8 4 a4 4 0 1 1 -4 4 4 4 0 0 1 4 -4 m11 24 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.53 17.17
                moveTo(x = 27.53f, y = 17.17f)
                // A 8.99 8.99 0 1 0 13.61 5.88
                arcTo(
                    horizontalEllipseRadius = 8.99f,
                    verticalEllipseRadius = 8.99f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 13.61f,
                    y1 = 5.88f,
                )
                // a 6 6 0 1 0 -8.56 7.34
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -8.56f,
                    dy1 = 7.34f,
                )
                // a 7 7 0 1 0 8 11.49
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 11.49f,
                )
                // A 6 6 0 0 0 25 24
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 24.0f,
                )
                // l -0.02 -0.36
                lineToRelative(dx = -0.02f, dy = -0.36f)
                // a 3.49 3.49 0 1 0 2.55 -6.47
                arcToRelative(
                    a = 3.49f,
                    b = 3.49f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.55f,
                    dy1 = -6.47f,
                )
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // a 7 7 0 1 1 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // M 8 4
                moveTo(x = 8.0f, y = 4.0f)
                // a 4 4 0 1 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // m 11 24
                moveToRelative(dx = 11.0f, dy = 24.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
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
        }.build().also { _chartBubblePacked = it }
    }

@Suppress("ObjectPropertyName")
private var _chartBubblePacked: ImageVector? = null
