package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceDizzy: ImageVector
    get() {
        val current = _faceDizzy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FaceDizzy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
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
            // <polygon points="24.41 11.0 23.0 9.59 21.0 11.59 19.0 9.59 17.59 11.0 19.59 13.0 17.59 15.0 19.0 16.41 21.0 14.41 23.0 16.41 24.41 15.0 22.41 13.0 24.41 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.41 11
                moveTo(x = 24.41f, y = 11.0f)
                // L 23 9.59
                lineTo(x = 23.0f, y = 9.59f)
                // L 21 11.59
                lineTo(x = 21.0f, y = 11.59f)
                // L 19 9.59
                lineTo(x = 19.0f, y = 9.59f)
                // L 17.59 11
                lineTo(x = 17.59f, y = 11.0f)
                // L 19.59 13
                lineTo(x = 19.59f, y = 13.0f)
                // L 17.59 15
                lineTo(x = 17.59f, y = 15.0f)
                // L 19 16.41
                lineTo(x = 19.0f, y = 16.41f)
                // L 21 14.41
                lineTo(x = 21.0f, y = 14.41f)
                // L 23 16.41
                lineTo(x = 23.0f, y = 16.41f)
                // L 24.41 15
                lineTo(x = 24.41f, y = 15.0f)
                // L 22.41 13
                lineTo(x = 22.41f, y = 13.0f)
                // L 24.41 11z
                lineTo(x = 24.41f, y = 11.0f)
                close()
            }
            // <polygon points="14.41 11.0 13.0 9.59 11.0 11.59 9.0 9.59 7.59 11.0 9.59 13.0 7.59 15.0 9.0 16.41 11.0 14.41 13.0 16.41 14.41 15.0 12.41 13.0 14.41 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.41 11
                moveTo(x = 14.41f, y = 11.0f)
                // L 13 9.59
                lineTo(x = 13.0f, y = 9.59f)
                // L 11 11.59
                lineTo(x = 11.0f, y = 11.59f)
                // L 9 9.59
                lineTo(x = 9.0f, y = 9.59f)
                // L 7.59 11
                lineTo(x = 7.59f, y = 11.0f)
                // L 9.59 13
                lineTo(x = 9.59f, y = 13.0f)
                // L 7.59 15
                lineTo(x = 7.59f, y = 15.0f)
                // L 9 16.41
                lineTo(x = 9.0f, y = 16.41f)
                // L 11 14.41
                lineTo(x = 11.0f, y = 14.41f)
                // L 13 16.41
                lineTo(x = 13.0f, y = 16.41f)
                // L 14.41 15
                lineTo(x = 14.41f, y = 15.0f)
                // L 12.41 13
                lineTo(x = 12.41f, y = 13.0f)
                // L 14.41 11z
                lineTo(x = 14.41f, y = 11.0f)
                close()
            }
            // M16 19 a3 3 0 1 0 3 3 3 3 0 0 0 -3 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 19
                moveTo(x = 16.0f, y = 19.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
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
        }.build().also { _faceDizzy = it }
    }

@Suppress("ObjectPropertyName")
private var _faceDizzy: ImageVector? = null
