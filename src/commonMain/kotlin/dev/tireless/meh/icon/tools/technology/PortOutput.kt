package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PortOutput: ImageVector
    get() {
        val current = _portOutput
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PortOutput",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 16.0 23.0 9.0 21.5859 10.4141 26.1719 15.0 9.0 15.0 9.0 17.0 26.1719 17.0 21.5859 21.5859 23.0 23.0 30.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // L 21.5859 10.4141
                lineTo(x = 21.5859f, y = 10.4141f)
                // L 26.1719 15
                lineTo(x = 26.1719f, y = 15.0f)
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // L 9 17
                lineTo(x = 9.0f, y = 17.0f)
                // L 26.1719 17
                lineTo(x = 26.1719f, y = 17.0f)
                // L 21.5859 21.5859
                lineTo(x = 21.5859f, y = 21.5859f)
                // L 23 23
                lineTo(x = 23.0f, y = 23.0f)
                // L 30 16z
                lineTo(x = 30.0f, y = 16.0f)
                close()
            }
            // M14 28 a12.01 12.01 0 1 1 6.55 -22.06 l-1.1 1.68 A10.01 10.01 0 1 0 14 26 a10 10 0 0 0 5.45 -1.62 l1.1 1.68 A12 12 0 0 1 14 28
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 28
                moveTo(x = 14.0f, y = 28.0f)
                // a 12.01 12.01 0 1 1 6.55 -22.06
                arcToRelative(
                    a = 12.01f,
                    b = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.55f,
                    dy1 = -22.06f,
                )
                // l -1.1 1.68
                lineToRelative(dx = -1.1f, dy = 1.68f)
                // A 10.01 10.01 0 1 0 14 26
                arcTo(
                    horizontalEllipseRadius = 10.01f,
                    verticalEllipseRadius = 10.01f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 26.0f,
                )
                // a 10 10 0 0 0 5.45 -1.62
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.45f,
                    dy1 = -1.62f,
                )
                // l 1.1 1.68
                lineToRelative(dx = 1.1f, dy = 1.68f)
                // A 12 12 0 0 1 14 28
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 28.0f,
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
        }.build().also { _portOutput = it }
    }

@Suppress("ObjectPropertyName")
private var _portOutput: ImageVector? = null
