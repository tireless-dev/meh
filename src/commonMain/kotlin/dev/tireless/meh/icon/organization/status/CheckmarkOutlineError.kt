package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkOutlineError: ImageVector
    get() {
        val current = _checkmarkOutlineError
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CheckmarkOutlineError",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M14 24 a10 10 0 1 1 10 -10 h2 a12 12 0 1 0 -12 12Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 24
                moveTo(x = 14.0f, y = 24.0f)
                // a 10 10 0 1 1 10 -10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = -10.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 12 12 0 1 0 -12 12z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 12.0f,
                )
                close()
            }
            // <polygon points="12.0 15.59 9.41 13.0 8.0 14.41 12.0 18.41 19.0 11.41 17.59 10.0 12.0 15.59" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 15.59
                moveTo(x = 12.0f, y = 15.59f)
                // L 9.41 13
                lineTo(x = 9.41f, y = 13.0f)
                // L 8 14.41
                lineTo(x = 8.0f, y = 14.41f)
                // L 12 18.41
                lineTo(x = 12.0f, y = 18.41f)
                // L 19 11.41
                lineTo(x = 19.0f, y = 11.41f)
                // L 17.59 10
                lineTo(x = 17.59f, y = 10.0f)
                // L 12 15.59z
                lineTo(x = 12.0f, y = 15.59f)
                close()
            }
            // M30 24 a6 6 0 1 0 -6 6 6 6 0 0 0 6 -6 m-2 0 a4 4 0 0 1 -.57 2.02 l-5.45 -5.45 A4 4 0 0 1 24 20 a4 4 0 0 1 4 4 m-8 0 a4 4 0 0 1 .57 -2.02 l5.45 5.45 A4 4 0 0 1 24 28 a4 4 0 0 1 -4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 24
                moveTo(x = 30.0f, y = 24.0f)
                // a 6 6 0 1 0 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // a 6 6 0 0 0 6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = -6.0f,
                )
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 4 4 0 0 1 -0.57 2.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.57f,
                    dy1 = 2.02f,
                )
                // l -5.45 -5.45
                lineToRelative(dx = -5.45f, dy = -5.45f)
                // A 4 4 0 0 1 24 20
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 20.0f,
                )
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 4 4 0 0 1 0.57 -2.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -2.02f,
                )
                // l 5.45 5.45
                lineToRelative(dx = 5.45f, dy = 5.45f)
                // A 4 4 0 0 1 24 28
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 28.0f,
                )
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
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
        }.build().also { _checkmarkOutlineError = it }
    }

@Suppress("ObjectPropertyName")
private var _checkmarkOutlineError: ImageVector? = null
