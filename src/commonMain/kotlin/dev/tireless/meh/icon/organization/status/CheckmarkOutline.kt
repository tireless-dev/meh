package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkOutline: ImageVector
    get() {
        val current = _checkmarkOutline
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CheckmarkOutline",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="14.0 21.414 9.0 16.413 10.413 15.0 14.0 18.586 21.585 11.0 23.0 12.415 14.0 21.414" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 21.414
                moveTo(x = 14.0f, y = 21.414f)
                // L 9 16.413
                lineTo(x = 9.0f, y = 16.413f)
                // L 10.413 15
                lineTo(x = 10.413f, y = 15.0f)
                // L 14 18.586
                lineTo(x = 14.0f, y = 18.586f)
                // L 21.585 11
                lineTo(x = 21.585f, y = 11.0f)
                // L 23 12.415
                lineTo(x = 23.0f, y = 12.415f)
                // L 14 21.414z
                lineTo(x = 14.0f, y = 21.414f)
                close()
            }
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 26 a12 12 0 1 1 12 -12 12 12 0 0 1 -12 12
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // a 12 12 0 1 1 12 -12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = -12.0f,
                )
                // a 12 12 0 0 1 -12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 12.0f,
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
        }.build().also { _checkmarkOutline = it }
    }

@Suppress("ObjectPropertyName")
private var _checkmarkOutline: ImageVector? = null
