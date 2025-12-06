package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scales: ImageVector
    get() {
        val current = _scales
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Scales",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 16 a5 5 0 0 0 10 0 1 1 0 0 0 -.1 -.45 l-4 -8 -.05 -.08 A1 1 0 0 0 25 7 h-6.18 A3 3 0 0 0 17 5.18 V2 h-2 v3.18 A3 3 0 0 0 13.18 7 H7 a1 1 0 0 0 -.9 .55 l-4 8 A1 1 0 0 0 2 16 a5 5 0 0 0 10 0 1 1 0 0 0 -.1 -.45 L8.61 9 h4.56 A3 3 0 0 0 15 10.82 V28 H6 v2 h20 v-2 h-9 V10.82 A3 3 0 0 0 18.82 9 h4.56 l-3.27 6.55 A1 1 0 0 0 20 16 M7 19 a3 3 0 0 1 -2.82 -2 h5.63 A3 3 0 0 1 7 19 m2.38 -4 H4.62 L7 10.24Z M16 9 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m9 10 a3 3 0 0 1 -2.82 -2 h5.63 A3 3 0 0 1 25 19 m0 -8.76 L27.38 15 h-4.76Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 16
                moveTo(x = 20.0f, y = 16.0f)
                // a 5 5 0 0 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 -0.1 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = -0.45f,
                )
                // l -4 -8
                lineToRelative(dx = -4.0f, dy = -8.0f)
                // l -0.05 -0.08
                lineToRelative(dx = -0.05f, dy = -0.08f)
                // A 1 1 0 0 0 25 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 7.0f,
                )
                // h -6.18
                horizontalLineToRelative(dx = -6.18f)
                // A 3 3 0 0 0 17 5.18
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 5.18f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3.18
                verticalLineToRelative(dy = 3.18f)
                // A 3 3 0 0 0 13.18 7
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.18f,
                    y1 = 7.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 -0.9 0.55
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.55f,
                )
                // l -4 8
                lineToRelative(dx = -4.0f, dy = 8.0f)
                // A 1 1 0 0 0 2 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // a 5 5 0 0 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 0 -0.1 -0.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.1f,
                    dy1 = -0.45f,
                )
                // L 8.61 9
                lineTo(x = 8.61f, y = 9.0f)
                // h 4.56
                horizontalLineToRelative(dx = 4.56f)
                // A 3 3 0 0 0 15 10.82
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 10.82f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // V 10.82
                verticalLineTo(y = 10.82f)
                // A 3 3 0 0 0 18.82 9
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.82f,
                    y1 = 9.0f,
                )
                // h 4.56
                horizontalLineToRelative(dx = 4.56f)
                // l -3.27 6.55
                lineToRelative(dx = -3.27f, dy = 6.55f)
                // A 1 1 0 0 0 20 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 16.0f,
                )
                // M 7 19
                moveTo(x = 7.0f, y = 19.0f)
                // a 3 3 0 0 1 -2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.82f,
                    dy1 = -2.0f,
                )
                // h 5.63
                horizontalLineToRelative(dx = 5.63f)
                // A 3 3 0 0 1 7 19
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 19.0f,
                )
                // m 2.38 -4
                moveToRelative(dx = 2.38f, dy = -4.0f)
                // H 4.62
                horizontalLineTo(x = 4.62f)
                // L 7 10.24z
                lineTo(x = 7.0f, y = 10.24f)
                close()
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // m 9 10
                moveToRelative(dx = 9.0f, dy = 10.0f)
                // a 3 3 0 0 1 -2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.82f,
                    dy1 = -2.0f,
                )
                // h 5.63
                horizontalLineToRelative(dx = 5.63f)
                // A 3 3 0 0 1 25 19
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 19.0f,
                )
                // m 0 -8.76
                moveToRelative(dx = 0.0f, dy = -8.76f)
                // L 27.38 15
                lineTo(x = 27.38f, y = 15.0f)
                // h -4.76z
                horizontalLineToRelative(dx = -4.76f)
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
        }.build().also { _scales = it }
    }

@Suppress("ObjectPropertyName")
private var _scales: ImageVector? = null
