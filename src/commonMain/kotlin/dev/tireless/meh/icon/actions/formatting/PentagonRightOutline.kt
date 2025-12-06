package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PentagonRightOutline: ImageVector
    get() {
        val current = _pentagonRightOutline
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PentagonRightOutline",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m27.76 16 -8.68 11.83 L5 23.3 V8.7 l14.08 -4.53z M30 16 a1 1 0 0 0 -.2 -.6 l-9.54 -13 a1 1 0 0 0 -1.11 -.35 L3.69 7.02 A1 1 0 0 0 3 7.97 v16.06 a1 1 0 0 0 .7 .95 l15.45 4.97 a1 1 0 0 0 1.11 -.36 l9.55 -13 A1 1 0 0 0 30 16
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.76 16
                moveTo(x = 27.76f, y = 16.0f)
                // l -8.68 11.83
                lineToRelative(dx = -8.68f, dy = 11.83f)
                // L 5 23.3
                lineTo(x = 5.0f, y = 23.3f)
                // V 8.7
                verticalLineTo(y = 8.7f)
                // l 14.08 -4.53z
                lineToRelative(dx = 14.08f, dy = -4.53f)
                close()
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // a 1 1 0 0 0 -0.2 -0.6
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.2f,
                    dy1 = -0.6f,
                )
                // l -9.54 -13
                lineToRelative(dx = -9.54f, dy = -13.0f)
                // a 1 1 0 0 0 -1.11 -0.35
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.11f,
                    dy1 = -0.35f,
                )
                // L 3.69 7.02
                lineTo(x = 3.69f, y = 7.02f)
                // A 1 1 0 0 0 3 7.97
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 7.97f,
                )
                // v 16.06
                verticalLineToRelative(dy = 16.06f)
                // a 1 1 0 0 0 0.7 0.95
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = 0.95f,
                )
                // l 15.45 4.97
                lineToRelative(dx = 15.45f, dy = 4.97f)
                // a 1 1 0 0 0 1.11 -0.36
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.11f,
                    dy1 = -0.36f,
                )
                // l 9.55 -13
                lineToRelative(dx = 9.55f, dy = -13.0f)
                // A 1 1 0 0 0 30 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 16.0f,
                )
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
        }.build().also { _pentagonRightOutline = it }
    }

@Suppress("ObjectPropertyName")
private var _pentagonRightOutline: ImageVector? = null
