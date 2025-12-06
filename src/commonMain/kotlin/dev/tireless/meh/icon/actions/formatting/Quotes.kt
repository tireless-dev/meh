package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Quotes: ImageVector
    get() {
        val current = _quotes
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Quotes",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 15 H6.11 A9 9 0 0 1 10 8.86 l1.79 -1.2 L10.69 6 8.9 7.2 A11 11 0 0 0 4 16.35 V23 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m14 0 h-5.89 A9 9 0 0 1 24 8.86 l1.79 -1.2 L24.7 6 l-1.8 1.2 a11 11 0 0 0 -4.9 9.15 V23 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // H 6.11
                horizontalLineTo(x = 6.11f)
                // A 9 9 0 0 1 10 8.86
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 8.86f,
                )
                // l 1.79 -1.2
                lineToRelative(dx = 1.79f, dy = -1.2f)
                // L 10.69 6
                lineTo(x = 10.69f, y = 6.0f)
                // L 8.9 7.2
                lineTo(x = 8.9f, y = 7.2f)
                // A 11 11 0 0 0 4 16.35
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 16.35f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m 14 0
                moveToRelative(dx = 14.0f, dy = 0.0f)
                // h -5.89
                horizontalLineToRelative(dx = -5.89f)
                // A 9 9 0 0 1 24 8.86
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 8.86f,
                )
                // l 1.79 -1.2
                lineToRelative(dx = 1.79f, dy = -1.2f)
                // L 24.7 6
                lineTo(x = 24.7f, y = 6.0f)
                // l -1.8 1.2
                lineToRelative(dx = -1.8f, dy = 1.2f)
                // a 11 11 0 0 0 -4.9 9.15
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.9f,
                    dy1 = 9.15f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
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
        }.build().also { _quotes = it }
    }

@Suppress("ObjectPropertyName")
private var _quotes: ImageVector? = null
