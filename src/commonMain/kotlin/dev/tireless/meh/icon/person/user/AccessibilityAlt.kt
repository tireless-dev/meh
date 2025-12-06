package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AccessibilityAlt: ImageVector
    get() {
        val current = _accessibilityAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AccessibilityAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="23.0 14.0 23.0 12.0 9.0 12.0 9.0 14.0 14.0 14.0 14.0 16.734 10.132 23.504 11.868 24.496 15.58 18.0 16.42 18.0 20.132 24.496 21.868 23.504 18.0 16.734 18.0 14.0 23.0 14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 14
                moveTo(x = 23.0f, y = 14.0f)
                // L 23 12
                lineTo(x = 23.0f, y = 12.0f)
                // L 9 12
                lineTo(x = 9.0f, y = 12.0f)
                // L 9 14
                lineTo(x = 9.0f, y = 14.0f)
                // L 14 14
                lineTo(x = 14.0f, y = 14.0f)
                // L 14 16.734
                lineTo(x = 14.0f, y = 16.734f)
                // L 10.132 23.504
                lineTo(x = 10.132f, y = 23.504f)
                // L 11.868 24.496
                lineTo(x = 11.868f, y = 24.496f)
                // L 15.58 18
                lineTo(x = 15.58f, y = 18.0f)
                // L 16.42 18
                lineTo(x = 16.42f, y = 18.0f)
                // L 20.132 24.496
                lineTo(x = 20.132f, y = 24.496f)
                // L 21.868 23.504
                lineTo(x = 21.868f, y = 23.504f)
                // L 18 16.734
                lineTo(x = 18.0f, y = 16.734f)
                // L 18 14
                lineTo(x = 18.0f, y = 14.0f)
                // L 23 14z
                lineTo(x = 23.0f, y = 14.0f)
                close()
            }
            // <circle cx="16.0" cy="9.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 14 14 0 1 1 14 -14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = -14.0f,
                )
                // a 14 14 0 0 1 -14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 14.0f,
                )
                // m 0 -26
                moveToRelative(dx = 0.0f, dy = -26.0f)
                // a 12 12 0 1 0 12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                )
                // A 12 12 0 0 0 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 4.0f,
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
        }.build().also { _accessibilityAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _accessibilityAlt: ImageVector? = null
