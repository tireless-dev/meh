package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserActivity: ImageVector
    get() {
        val current = _userActivity
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UserActivity",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 23 h-.02 a1 1 0 0 1 -.94 -.73 L20.87 11.2 l-1.93 5.16 A1 1 0 0 1 18 17 h-4 v-2 h3.3 l2.76 -7.35 a1 1 0 0 1 1.9 .08 l3.11 10.89 1.98 -5.94 A1 1 0 0 1 28 12 h4 v2 h-3.28 l-2.77 8.32 A1 1 0 0 1 25 23 m-10 7 h-2 v-7 a3 3 0 0 0 -3 -3 H6 a3 3 0 0 0 -3 3 v7 H1 v-7 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M8 8 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 23
                moveTo(x = 25.0f, y = 23.0f)
                // h -0.02
                horizontalLineToRelative(dx = -0.02f)
                // a 1 1 0 0 1 -0.94 -0.73
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.94f,
                    dy1 = -0.73f,
                )
                // L 20.87 11.2
                lineTo(x = 20.87f, y = 11.2f)
                // l -1.93 5.16
                lineToRelative(dx = -1.93f, dy = 5.16f)
                // A 1 1 0 0 1 18 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 17.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3.3
                horizontalLineToRelative(dx = 3.3f)
                // l 2.76 -7.35
                lineToRelative(dx = 2.76f, dy = -7.35f)
                // a 1 1 0 0 1 1.9 0.08
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.9f,
                    dy1 = 0.08f,
                )
                // l 3.11 10.89
                lineToRelative(dx = 3.11f, dy = 10.89f)
                // l 1.98 -5.94
                lineToRelative(dx = 1.98f, dy = -5.94f)
                // A 1 1 0 0 1 28 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 12.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3.28
                horizontalLineToRelative(dx = -3.28f)
                // l -2.77 8.32
                lineToRelative(dx = -2.77f, dy = 8.32f)
                // A 1 1 0 0 1 25 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 23.0f,
                )
                // m -10 7
                moveToRelative(dx = -10.0f, dy = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 1
                horizontalLineTo(x = 1.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                close()
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // a 3 3 0 1 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 5 5 0 1 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
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
        }.build().also { _userActivity = it }
    }

@Suppress("ObjectPropertyName")
private var _userActivity: ImageVector? = null
