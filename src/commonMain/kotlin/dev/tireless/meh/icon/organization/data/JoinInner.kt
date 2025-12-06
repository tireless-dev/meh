package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinInner: ImageVector
    get() {
        val current = _joinInner
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.JoinInner",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 6 a10 10 0 0 0 -4 .84 10 10 0 1 0 0 18.32 A10 10 0 1 0 20 6 m-8 18 a8 8 0 1 1 1.76 -15.8 9.97 9.97 0 0 0 0 15.6 A8 8 0 0 1 12 24 m8 0 a8 8 0 0 1 -1.76 -.2 9.97 9.97 0 0 0 0 -15.6 A8 8 0 1 1 20 24
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 6
                moveTo(x = 20.0f, y = 6.0f)
                // a 10 10 0 0 0 -4 0.84
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.84f,
                )
                // a 10 10 0 1 0 0 18.32
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 18.32f,
                )
                // A 10 10 0 1 0 20 6
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 6.0f,
                )
                // m -8 18
                moveToRelative(dx = -8.0f, dy = 18.0f)
                // a 8 8 0 1 1 1.76 -15.8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.76f,
                    dy1 = -15.8f,
                )
                // a 9.97 9.97 0 0 0 0 15.6
                arcToRelative(
                    a = 9.97f,
                    b = 9.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 15.6f,
                )
                // A 8 8 0 0 1 12 24
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 24.0f,
                )
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // a 8 8 0 0 1 -1.76 -0.2
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.76f,
                    dy1 = -0.2f,
                )
                // a 9.97 9.97 0 0 0 0 -15.6
                arcToRelative(
                    a = 9.97f,
                    b = 9.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -15.6f,
                )
                // A 8 8 0 1 1 20 24
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 24.0f,
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
        }.build().also { _joinInner = it }
    }

@Suppress("ObjectPropertyName")
private var _joinInner: ImageVector? = null
