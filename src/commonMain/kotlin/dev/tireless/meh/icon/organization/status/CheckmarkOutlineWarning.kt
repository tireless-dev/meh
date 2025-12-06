package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkOutlineWarning: ImageVector
    get() {
        val current = _checkmarkOutlineWarning
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CheckmarkOutlineWarning",
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
            // M27.38 28 h-6.76 L24 21.24Z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.38 28
                moveTo(x = 27.38f, y = 28.0f)
                // h -6.76
                horizontalLineToRelative(dx = -6.76f)
                // L 24 21.24z
                lineTo(x = 24.0f, y = 21.24f)
                close()
                // M 24 18
                moveTo(x = 24.0f, y = 18.0f)
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
                // l -5 10
                lineToRelative(dx = -5.0f, dy = 10.0f)
                // A 1 1 0 0 0 19 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 30.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 0 0.92 -1.39
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.92f,
                    dy1 = -1.39f,
                )
                // L 24.9 18.55
                lineTo(x = 24.9f, y = 18.55f)
                // A 1 1 0 0 0 24 18
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 18.0f,
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
        }.build().also { _checkmarkOutlineWarning = it }
    }

@Suppress("ObjectPropertyName")
private var _checkmarkOutlineWarning: ImageVector? = null
