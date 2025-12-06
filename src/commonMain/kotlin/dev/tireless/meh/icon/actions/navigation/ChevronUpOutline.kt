package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChevronUpOutline: ImageVector
    get() {
        val current = _chevronUpOutline
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChevronUpOutline",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="9.4142 19.4142 16.0 12.8286 22.5858 19.4142 24.0 18.0 16.0 10.0 8.0 18.0 9.4142 19.4142" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9.4142 19.4142
                moveTo(x = 9.4142f, y = 19.4142f)
                // L 16 12.8286
                lineTo(x = 16.0f, y = 12.8286f)
                // L 22.5858 19.4142
                lineTo(x = 22.5858f, y = 19.4142f)
                // L 24 18
                lineTo(x = 24.0f, y = 18.0f)
                // L 16 10
                lineTo(x = 16.0f, y = 10.0f)
                // L 8 18
                lineTo(x = 8.0f, y = 18.0f)
                // L 9.4142 19.4142z
                lineTo(x = 9.4142f, y = 19.4142f)
                close()
            }
            // M30 16 c0 7.72 -6.28 14 -14 14 S2 23.72 2 16 8.28 2 16 2 s14 6.28 14 14 M4 16 A12.01 12.01 0 1 0 16 4 C9.38 4 4 9.38 4 16
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // c 0 7.72 -6.28 14 -14 14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 7.72f,
                    dx2 = -6.28f,
                    dy2 = 14.0f,
                    dx3 = -14.0f,
                    dy3 = 14.0f,
                )
                // S 2 23.72 2 16
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 23.72f,
                    x2 = 2.0f,
                    y2 = 16.0f,
                )
                // S 8.28 2 16 2
                reflectiveCurveTo(
                    x1 = 8.28f,
                    y1 = 2.0f,
                    x2 = 16.0f,
                    y2 = 2.0f,
                )
                // s 14 6.28 14 14
                reflectiveCurveToRelative(
                    dx1 = 14.0f,
                    dy1 = 6.28f,
                    dx2 = 14.0f,
                    dy2 = 14.0f,
                )
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // A 12.01 12.01 0 1 0 16 4
                arcTo(
                    horizontalEllipseRadius = 12.01f,
                    verticalEllipseRadius = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
                // C 9.38 4 4 9.38 4 16
                curveTo(
                    x1 = 9.38f,
                    y1 = 4.0f,
                    x2 = 4.0f,
                    y2 = 9.38f,
                    x3 = 4.0f,
                    y3 = 16.0f,
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
        }.build().also { _chevronUpOutline = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronUpOutline: ImageVector? = null
