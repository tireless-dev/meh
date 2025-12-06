package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Voicemail: ImageVector
    get() {
        val current = _voicemail
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Voicemail",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 10 a6 6 0 0 0 -4.46 10 h-7.08 A6 6 0 1 0 8 22 h16 a6 6 0 0 0 0 -12 M4 16 a4 4 0 1 1 4 4 4 4 0 0 1 -4 -4 m20 4 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 10
                moveTo(x = 24.0f, y = 10.0f)
                // a 6 6 0 0 0 -4.46 10
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.46f,
                    dy1 = 10.0f,
                )
                // h -7.08
                horizontalLineToRelative(dx = -7.08f)
                // A 6 6 0 1 0 8 22
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 22.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 6 6 0 0 0 0 -12
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -12.0f,
                )
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // a 4 4 0 1 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
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
                // m 20 4
                moveToRelative(dx = 20.0f, dy = 4.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
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
        }.build().also { _voicemail = it }
    }

@Suppress("ObjectPropertyName")
private var _voicemail: ImageVector? = null
