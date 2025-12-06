package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartLine: ImageVector
    get() {
        val current = _chartLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartLine",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m4.67 28 6.39 -12 7.3 6.49 a2 2 0 0 0 1.7 .47 2 2 0 0 0 1.42 -1.07 L27 10.9 25.18 10 l-5.49 11 -7.3 -6.49 A2 2 0 0 0 10.71 14 a2 2 0 0 0 -1.42 1 L4 25 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4.67 28
                moveTo(x = 4.67f, y = 28.0f)
                // l 6.39 -12
                lineToRelative(dx = 6.39f, dy = -12.0f)
                // l 7.3 6.49
                lineToRelative(dx = 7.3f, dy = 6.49f)
                // a 2 2 0 0 0 1.7 0.47
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 0.47f,
                )
                // a 2 2 0 0 0 1.42 -1.07
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = -1.07f,
                )
                // L 27 10.9
                lineTo(x = 27.0f, y = 10.9f)
                // L 25.18 10
                lineTo(x = 25.18f, y = 10.0f)
                // l -5.49 11
                lineToRelative(dx = -5.49f, dy = 11.0f)
                // l -7.3 -6.49
                lineToRelative(dx = -7.3f, dy = -6.49f)
                // A 2 2 0 0 0 10.71 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.71f,
                    y1 = 14.0f,
                )
                // a 2 2 0 0 0 -1.42 1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 1.0f,
                )
                // L 4 25
                lineTo(x = 4.0f, y = 25.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
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
        }.build().also { _chartLine = it }
    }

@Suppress("ObjectPropertyName")
private var _chartLine: ImageVector? = null
