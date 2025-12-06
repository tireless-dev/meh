package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WifiBridgeAlt: ImageVector
    get() {
        val current = _wifiBridgeAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WifiBridgeAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M13 26 h-2 a5 5 0 0 0 -5 -5 v-2 a7 7 0 0 1 7 7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 26
                moveTo(x = 13.0f, y = 26.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 7 7 0 0 1 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
            }
            // M18 26 h-2 A10 10 0 0 0 6 16 v-2 a12 12 0 0 1 12 12 m8 -13 a7 7 0 0 1 -7 -7 h2 a5 5 0 0 0 5 5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 26
                moveTo(x = 18.0f, y = 26.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // A 10 10 0 0 0 6 16
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 16.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 12 12 0 0 1 12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
                // m 8 -13
                moveToRelative(dx = 8.0f, dy = -13.0f)
                // a 7 7 0 0 1 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5 5 0 0 0 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                close()
            }
            // M26 18 A12 12 0 0 1 14 6 h2 a10 10 0 0 0 10 10Z M7.7 24.3 a1 1 0 0 0 -1.4 0 L2 28.58 3.41 30 l4.3 -4.3 a1 1 0 0 0 0 -1.4 M28.6 2 l-4.3 4.3 a1 1 0 0 0 1.42 1.4 L30 3.42Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // A 12 12 0 0 1 14 6
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 6.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 10 10 0 0 0 10 10z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 10.0f,
                )
                close()
                // M 7.7 24.3
                moveTo(x = 7.7f, y = 24.3f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 2 28.58
                lineTo(x = 2.0f, y = 28.58f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 4.3 -4.3
                lineToRelative(dx = 4.3f, dy = -4.3f)
                // a 1 1 0 0 0 0 -1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                )
                // M 28.6 2
                moveTo(x = 28.6f, y = 2.0f)
                // l -4.3 4.3
                lineToRelative(dx = -4.3f, dy = 4.3f)
                // a 1 1 0 0 0 1.42 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 1.4f,
                )
                // L 30 3.42z
                lineTo(x = 30.0f, y = 3.42f)
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
        }.build().also { _wifiBridgeAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _wifiBridgeAlt: ImageVector? = null
