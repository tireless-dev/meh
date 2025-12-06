package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningDiamond: ImageVector
    get() {
        val current = _warningDiamond
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WarningDiamond",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 20 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // a 1.5 1.5 0 1 0 0 3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                )
                // a 1.5 1.5 0 0 0 0 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
            }
            // <rect width="2" height="9" x="15.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M16 30 a2 2 0 0 1 -1.47 -.6 L2.6 17.46 a2.1 2.1 0 0 1 0 -2.94 L14.53 2.6 a2.1 2.1 0 0 1 2.94 0 L29.4 14.53 a2.1 2.1 0 0 1 0 2.94 L17.47 29.4 A2 2 0 0 1 16 30 m0 -26 q-.03 0 -.06 .02 L4.02 15.94 a.1 .1 0 0 0 0 .12 l11.92 11.92 a.1 .1 0 0 0 .12 0 l11.92 -11.92 a.1 .1 0 0 0 0 -.12 L16.06 4.02z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 2 2 0 0 1 -1.47 -0.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.47f,
                    dy1 = -0.6f,
                )
                // L 2.6 17.46
                lineTo(x = 2.6f, y = 17.46f)
                // a 2.1 2.1 0 0 1 0 -2.94
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.94f,
                )
                // L 14.53 2.6
                lineTo(x = 14.53f, y = 2.6f)
                // a 2.1 2.1 0 0 1 2.94 0
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.94f,
                    dy1 = 0.0f,
                )
                // L 29.4 14.53
                lineTo(x = 29.4f, y = 14.53f)
                // a 2.1 2.1 0 0 1 0 2.94
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.94f,
                )
                // L 17.47 29.4
                lineTo(x = 17.47f, y = 29.4f)
                // A 2 2 0 0 1 16 30
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
                // m 0 -26
                moveToRelative(dx = 0.0f, dy = -26.0f)
                // q -0.03 0 -0.06 0.02
                quadToRelative(
                    dx1 = -0.03f,
                    dy1 = 0.0f,
                    dx2 = -0.06f,
                    dy2 = 0.02f,
                )
                // L 4.02 15.94
                lineTo(x = 4.02f, y = 15.94f)
                // a 0.1 0.1 0 0 0 0 0.12
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 0.12f,
                )
                // l 11.92 11.92
                lineToRelative(dx = 11.92f, dy = 11.92f)
                // a 0.1 0.1 0 0 0 0.12 0
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.12f,
                    dy1 = 0.0f,
                )
                // l 11.92 -11.92
                lineToRelative(dx = 11.92f, dy = -11.92f)
                // a 0.1 0.1 0 0 0 0 -0.12
                arcToRelative(
                    a = 0.1f,
                    b = 0.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -0.12f,
                )
                // L 16.06 4.02z
                lineTo(x = 16.06f, y = 4.02f)
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
        }.build().also { _warningDiamond = it }
    }

@Suppress("ObjectPropertyName")
private var _warningDiamond: ImageVector? = null
