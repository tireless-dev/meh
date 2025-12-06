package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationCompany: ImageVector
    get() {
        val current = _locationCompany
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LocationCompany",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m16 30 -8.44 -9.95 -.34 -.45 A11 11 0 0 1 5 13 a11 11 0 0 1 22 0 11 11 0 0 1 -2.21 6.6 s-.3 .4 -.35 .45Z M8.81 18.4 l.29 .37 L16 26.9 l6.91 -8.15 .28 -.37 A9 9 0 0 0 25 13 a9 9 0 0 0 -18 0 9 9 0 0 0 1.81 5.4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // l -8.44 -9.95
                lineToRelative(dx = -8.44f, dy = -9.95f)
                // l -0.34 -0.45
                lineToRelative(dx = -0.34f, dy = -0.45f)
                // A 11 11 0 0 1 5 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 13.0f,
                )
                // a 11 11 0 0 1 22 0
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 22.0f,
                    dy1 = 0.0f,
                )
                // a 11 11 0 0 1 -2.21 6.6
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.21f,
                    dy1 = 6.6f,
                )
                // s -0.3 0.4 -0.35 0.45z
                reflectiveCurveToRelative(
                    dx1 = -0.3f,
                    dy1 = 0.4f,
                    dx2 = -0.35f,
                    dy2 = 0.45f,
                )
                close()
                // M 8.81 18.4
                moveTo(x = 8.81f, y = 18.4f)
                // l 0.29 0.37
                lineToRelative(dx = 0.29f, dy = 0.37f)
                // L 16 26.9
                lineTo(x = 16.0f, y = 26.9f)
                // l 6.91 -8.15
                lineToRelative(dx = 6.91f, dy = -8.15f)
                // l 0.28 -0.37
                lineToRelative(dx = 0.28f, dy = -0.37f)
                // A 9 9 0 0 0 25 13
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 13.0f,
                )
                // a 9 9 0 0 0 -18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -18.0f,
                    dy1 = 0.0f,
                )
                // a 9 9 0 0 0 1.81 5.4
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.81f,
                    dy1 = 5.4f,
                )
            }
            // M21 18 h-2 v-8 h-6 v8 h-2 v-8 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 18
                moveTo(x = 21.0f, y = 18.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // <rect width="2" height="2" x="15.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="15.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 12
                moveTo(x = 15.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
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
        }.build().also { _locationCompany = it }
    }

@Suppress("ObjectPropertyName")
private var _locationCompany: ImageVector? = null
