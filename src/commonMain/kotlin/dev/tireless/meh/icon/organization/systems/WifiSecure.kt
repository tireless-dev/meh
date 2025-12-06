package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WifiSecure: ImageVector
    get() {
        val current = _wifiSecure
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WifiSecure",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 20 v-3 a4 4 0 0 0 -8 0 v3 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-6 -3 a2 2 0 0 1 4 0 v3 h-4Z m-2 11 v-6 h8 v6Z M6.1 7.1 l1.42 1.42 a12 12 0 0 1 16.96 0 L25.9 7.1 a14 14 0 0 0 -19.79 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // m -6 -3
                moveToRelative(dx = -6.0f, dy = -3.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -2 11
                moveToRelative(dx = -2.0f, dy = 11.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // M 6.1 7.1
                moveTo(x = 6.1f, y = 7.1f)
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // a 12 12 0 0 1 16.96 0
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 16.96f,
                    dy1 = 0.0f,
                )
                // L 25.9 7.1
                lineTo(x = 25.9f, y = 7.1f)
                // a 14 14 0 0 0 -19.79 0
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -19.79f,
                    dy1 = 0.0f,
                )
            }
            // M16 8 a9 9 0 0 0 -6.36 2.64 l1.41 1.41 a7 7 0 0 1 9.9 0 l1.41 -1.41 A9 9 0 0 0 16 8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // a 9 9 0 0 0 -6.36 2.64
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.36f,
                    dy1 = 2.64f,
                )
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // a 7 7 0 0 1 9.9 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.9f,
                    dy1 = 0.0f,
                )
                // l 1.41 -1.41
                lineToRelative(dx = 1.41f, dy = -1.41f)
                // A 9 9 0 0 0 16 8
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 8.0f,
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
        }.build().also { _wifiSecure = it }
    }

@Suppress("ObjectPropertyName")
private var _wifiSecure: ImageVector? = null
