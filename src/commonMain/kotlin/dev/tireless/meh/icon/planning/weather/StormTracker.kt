package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StormTracker: ImageVector
    get() {
        val current = _stormTracker
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.StormTracker",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a1 1 0 0 0 -.97 .77 L13.3 10.1 a10.07 10.07 0 1 0 8.6 8.6 l7.33 -1.72 A1 1 0 0 0 30 16 14 14 0 0 0 16 2 m-4.7 18.7 A1 1 0 0 0 12 21 l.23 -.03 3.76 -.88 A4 4 0 1 1 11.91 16 l-.88 3.76 a1 1 0 0 0 .26 .94 m2.04 -2.04 L15.61 9 A7.5 7.5 0 0 1 23 16.39Z M20 20 a8 8 0 1 1 -8 -8 8 8 0 0 1 .84 .05 l-.46 1.97 L12 14 a6 6 0 1 0 6 6 l-.02 -.38 1.97 -.46 A8 8 0 0 1 20 20 m4.97 -4.08 a9.5 9.5 0 0 0 -8.9 -8.9 l.72 -3 a12 12 0 0 1 11.18 11.2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 1 1 0 0 0 -0.97 0.77
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = 0.77f,
                )
                // L 13.3 10.1
                lineTo(x = 13.3f, y = 10.1f)
                // a 10.07 10.07 0 1 0 8.6 8.6
                arcToRelative(
                    a = 10.07f,
                    b = 10.07f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.6f,
                    dy1 = 8.6f,
                )
                // l 7.33 -1.72
                lineToRelative(dx = 7.33f, dy = -1.72f)
                // A 1 1 0 0 0 30 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 16.0f,
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
                // m -4.7 18.7
                moveToRelative(dx = -4.7f, dy = 18.7f)
                // A 1 1 0 0 0 12 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // l 0.23 -0.03
                lineToRelative(dx = 0.23f, dy = -0.03f)
                // l 3.76 -0.88
                lineToRelative(dx = 3.76f, dy = -0.88f)
                // A 4 4 0 1 1 11.91 16
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 11.91f,
                    y1 = 16.0f,
                )
                // l -0.88 3.76
                lineToRelative(dx = -0.88f, dy = 3.76f)
                // a 1 1 0 0 0 0.26 0.94
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.26f,
                    dy1 = 0.94f,
                )
                // m 2.04 -2.04
                moveToRelative(dx = 2.04f, dy = -2.04f)
                // L 15.61 9
                lineTo(x = 15.61f, y = 9.0f)
                // A 7.5 7.5 0 0 1 23 16.39z
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 16.39f,
                )
                close()
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // a 8 8 0 1 1 -8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -8.0f,
                )
                // a 8 8 0 0 1 0.84 0.05
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.84f,
                    dy1 = 0.05f,
                )
                // l -0.46 1.97
                lineToRelative(dx = -0.46f, dy = 1.97f)
                // L 12 14
                lineTo(x = 12.0f, y = 14.0f)
                // a 6 6 0 1 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // l -0.02 -0.38
                lineToRelative(dx = -0.02f, dy = -0.38f)
                // l 1.97 -0.46
                lineToRelative(dx = 1.97f, dy = -0.46f)
                // A 8 8 0 0 1 20 20
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 20.0f,
                )
                // m 4.97 -4.08
                moveToRelative(dx = 4.97f, dy = -4.08f)
                // a 9.5 9.5 0 0 0 -8.9 -8.9
                arcToRelative(
                    a = 9.5f,
                    b = 9.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.9f,
                    dy1 = -8.9f,
                )
                // l 0.72 -3
                lineToRelative(dx = 0.72f, dy = -3.0f)
                // a 12 12 0 0 1 11.18 11.2z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 11.18f,
                    dy1 = 11.2f,
                )
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
        }.build().also { _stormTracker = it }
    }

@Suppress("ObjectPropertyName")
private var _stormTracker: ImageVector? = null
