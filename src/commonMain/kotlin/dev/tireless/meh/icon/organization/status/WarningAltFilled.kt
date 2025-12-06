package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningAltFilled: ImageVector
    get() {
        val current = _warningAltFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WarningAltFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 26 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 26 m-1.12 -5 h2.24 v-9 h-2.25Z
            path {
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // a 1.5 1.5 0 1 1 1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -1.5f,
                )
                // A 1.5 1.5 0 0 1 16 26
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 26.0f,
                )
                // m -1.12 -5
                moveToRelative(dx = -1.12f, dy = -5.0f)
                // h 2.24
                horizontalLineToRelative(dx = 2.24f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h -2.25z
                horizontalLineToRelative(dx = -2.25f)
                close()
            }
            // M16 6.17 4.65 28 h22.7Z M14.88 12 h2.24 v9 h-2.25Z M16 26 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 26
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 6.17
                moveTo(x = 16.0f, y = 6.17f)
                // L 4.65 28
                lineTo(x = 4.65f, y = 28.0f)
                // h 22.7z
                horizontalLineToRelative(dx = 22.7f)
                close()
                // M 14.88 12
                moveTo(x = 14.88f, y = 12.0f)
                // h 2.24
                horizontalLineToRelative(dx = 2.24f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2.25z
                horizontalLineToRelative(dx = -2.25f)
                close()
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // a 1.5 1.5 0 1 1 1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.5f,
                    dy1 = -1.5f,
                )
                // A 1.5 1.5 0 0 1 16 26
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 26.0f,
                )
            }
            // M29 30 H3 a1 1 0 0 1 -.89 -1.46 l13 -25 a1 1 0 0 1 1.78 0 l13 25 A1 1 0 0 1 29 30 M4.65 28 h22.7 L16 6.17z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 30
                moveTo(x = 29.0f, y = 30.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 1 -0.89 -1.46
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.89f,
                    dy1 = -1.46f,
                )
                // l 13 -25
                lineToRelative(dx = 13.0f, dy = -25.0f)
                // a 1 1 0 0 1 1.78 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 13 25
                lineToRelative(dx = 13.0f, dy = 25.0f)
                // A 1 1 0 0 1 29 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 29.0f,
                    y1 = 30.0f,
                )
                // M 4.65 28
                moveTo(x = 4.65f, y = 28.0f)
                // h 22.7
                horizontalLineToRelative(dx = 22.7f)
                // L 16 6.17z
                lineTo(x = 16.0f, y = 6.17f)
                close()
            }
            // <rect width="32" height="32" fill="#000" />
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
        }.build().also { _warningAltFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _warningAltFilled: ImageVector? = null
