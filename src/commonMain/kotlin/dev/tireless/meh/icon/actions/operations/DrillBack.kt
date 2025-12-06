package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DrillBack: ImageVector
    get() {
        val current = _drillBack
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DrillBack",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="6.0 22.0 7.414 20.586 3.828 17.0 12.0 17.0 12.0 15.0 3.828 15.0 7.414 11.414 6.0 10.0 0.0 16.0 6.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 22
                moveTo(x = 6.0f, y = 22.0f)
                // L 7.414 20.586
                lineTo(x = 7.414f, y = 20.586f)
                // L 3.828 17
                lineTo(x = 3.828f, y = 17.0f)
                // L 12 17
                lineTo(x = 12.0f, y = 17.0f)
                // L 12 15
                lineTo(x = 12.0f, y = 15.0f)
                // L 3.828 15
                lineTo(x = 3.828f, y = 15.0f)
                // L 7.414 11.414
                lineTo(x = 7.414f, y = 11.414f)
                // L 6 10
                lineTo(x = 6.0f, y = 10.0f)
                // L 0 16
                lineTo(x = 0.0f, y = 16.0f)
                // L 6 22z
                lineTo(x = 6.0f, y = 22.0f)
                close()
            }
            // M16 10 a6 6 0 0 0 -4.24 1.76 L16 16 l-4.24 4.24 A6 6 0 1 0 16 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 10
                moveTo(x = 16.0f, y = 10.0f)
                // a 6 6 0 0 0 -4.24 1.76
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.24f,
                    dy1 = 1.76f,
                )
                // L 16 16
                lineTo(x = 16.0f, y = 16.0f)
                // l -4.24 4.24
                lineToRelative(dx = -4.24f, dy = 4.24f)
                // A 6 6 0 1 0 16 10
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 10.0f,
                )
            }
            // M16 2 a14 14 0 0 0 -9.9 4.1 l1.42 1.42 a12 12 0 1 1 0 16.96 L6.1 25.9 A14 14 0 1 0 16 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 0 0 -9.9 4.1
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.9f,
                    dy1 = 4.1f,
                )
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // a 12 12 0 1 1 0 16.96
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 16.96f,
                )
                // L 6.1 25.9
                lineTo(x = 6.1f, y = 25.9f)
                // A 14 14 0 1 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
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
        }.build().also { _drillBack = it }
    }

@Suppress("ObjectPropertyName")
private var _drillBack: ImageVector? = null
