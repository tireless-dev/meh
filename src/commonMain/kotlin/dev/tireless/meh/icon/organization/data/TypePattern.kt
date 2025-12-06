package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TypePattern: ImageVector
    get() {
        val current = _typePattern
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TypePattern",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 15.0 17.0 15.0 17.0 2.0 15.0 2.0 15.0 15.0 2.0 15.0 2.0 17.0 15.0 17.0 15.0 30.0 17.0 30.0 17.0 17.0 30.0 17.0 30.0 15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // L 17 15
                lineTo(x = 17.0f, y = 15.0f)
                // L 17 2
                lineTo(x = 17.0f, y = 2.0f)
                // L 15 2
                lineTo(x = 15.0f, y = 2.0f)
                // L 15 15
                lineTo(x = 15.0f, y = 15.0f)
                // L 2 15
                lineTo(x = 2.0f, y = 15.0f)
                // L 2 17
                lineTo(x = 2.0f, y = 17.0f)
                // L 15 17
                lineTo(x = 15.0f, y = 17.0f)
                // L 15 30
                lineTo(x = 15.0f, y = 30.0f)
                // L 17 30
                lineTo(x = 17.0f, y = 30.0f)
                // L 17 17
                lineTo(x = 17.0f, y = 17.0f)
                // L 30 17
                lineTo(x = 30.0f, y = 17.0f)
                // L 30 15z
                lineTo(x = 30.0f, y = 15.0f)
                close()
            }
            // <polygon points="25.586 20.0 27.0 21.414 23.414 25.0 27.0 28.586 25.586 30.0 20.586 25.0 25.586 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.586 20
                moveTo(x = 25.586f, y = 20.0f)
                // L 27 21.414
                lineTo(x = 27.0f, y = 21.414f)
                // L 23.414 25
                lineTo(x = 23.414f, y = 25.0f)
                // L 27 28.586
                lineTo(x = 27.0f, y = 28.586f)
                // L 25.586 30
                lineTo(x = 25.586f, y = 30.0f)
                // L 20.586 25
                lineTo(x = 20.586f, y = 25.0f)
                // L 25.586 20z
                lineTo(x = 25.586f, y = 20.0f)
                close()
            }
            // M11 30 H3 a1 1 0 0 1 -.9 -1.45 l4 -8 a1.04 1.04 0 0 1 1.8 0 l4 8 A1 1 0 0 1 11 30 m-6.38 -2 h4.76 L7 23.24Z M28 12 h-6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-6 -8 v6 h6 V4Z M7 12 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5 m0 -8 a3 3 0 1 0 3 3 3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 30
                moveTo(x = 11.0f, y = 30.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 1 -0.9 -1.45
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = -1.45f,
                )
                // l 4 -8
                lineToRelative(dx = 4.0f, dy = -8.0f)
                // a 1.04 1.04 0 0 1 1.8 0
                arcToRelative(
                    a = 1.04f,
                    b = 1.04f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                )
                // l 4 8
                lineToRelative(dx = 4.0f, dy = 8.0f)
                // A 1 1 0 0 1 11 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 30.0f,
                )
                // m -6.38 -2
                moveToRelative(dx = -6.38f, dy = -2.0f)
                // h 4.76
                horizontalLineToRelative(dx = 4.76f)
                // L 7 23.24z
                lineTo(x = 7.0f, y = 23.24f)
                close()
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m -6 -8
                moveToRelative(dx = -6.0f, dy = -8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // a 5 5 0 1 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
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
        }.build().also { _typePattern = it }
    }

@Suppress("ObjectPropertyName")
private var _typePattern: ImageVector? = null
