package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationStarFilled: ImageVector
    get() {
        val current = _locationStarFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LocationStarFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="16.0 7.0 17.912 10.667 22.0 11.173 19.0 13.926 19.6 18.0 16.0 15.708 12.4 18.0 13.0 13.926 10.0 11.173 14.2 10.667 16.0 7.0" fill="#000" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // L 17.912 10.667
                lineTo(x = 17.912f, y = 10.667f)
                // L 22 11.173
                lineTo(x = 22.0f, y = 11.173f)
                // L 19 13.926
                lineTo(x = 19.0f, y = 13.926f)
                // L 19.6 18
                lineTo(x = 19.6f, y = 18.0f)
                // L 16 15.708
                lineTo(x = 16.0f, y = 15.708f)
                // L 12.4 18
                lineTo(x = 12.4f, y = 18.0f)
                // L 13 13.926
                lineTo(x = 13.0f, y = 13.926f)
                // L 10 11.173
                lineTo(x = 10.0f, y = 11.173f)
                // L 14.2 10.667
                lineTo(x = 14.2f, y = 10.667f)
                // L 16 7z
                lineTo(x = 16.0f, y = 7.0f)
                close()
            }
            // M16 2 A11 11 0 0 0 5 13 a11 11 0 0 0 2.22 6.6 s.3 .4 .34 .45 L16 30 l8.44 -9.95 .34 -.45 A11 11 0 0 0 27 13 11 11 0 0 0 16 2 m3.6 16 L16 15.7 12.4 18 l.6 -4.07 -3 -2.76 4.2 -.5 L16 7 l1.91 3.67 4.09 .5 -3 2.76Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // A 11 11 0 0 0 5 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 13.0f,
                )
                // a 11 11 0 0 0 2.22 6.6
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.22f,
                    dy1 = 6.6f,
                )
                // s 0.3 0.4 0.34 0.45
                reflectiveCurveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.4f,
                    dx2 = 0.34f,
                    dy2 = 0.45f,
                )
                // L 16 30
                lineTo(x = 16.0f, y = 30.0f)
                // l 8.44 -9.95
                lineToRelative(dx = 8.44f, dy = -9.95f)
                // l 0.34 -0.45
                lineToRelative(dx = 0.34f, dy = -0.45f)
                // A 11 11 0 0 0 27 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 13.0f,
                )
                // A 11 11 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 3.6 16
                moveToRelative(dx = 3.6f, dy = 16.0f)
                // L 16 15.7
                lineTo(x = 16.0f, y = 15.7f)
                // L 12.4 18
                lineTo(x = 12.4f, y = 18.0f)
                // l 0.6 -4.07
                lineToRelative(dx = 0.6f, dy = -4.07f)
                // l -3 -2.76
                lineToRelative(dx = -3.0f, dy = -2.76f)
                // l 4.2 -0.5
                lineToRelative(dx = 4.2f, dy = -0.5f)
                // L 16 7
                lineTo(x = 16.0f, y = 7.0f)
                // l 1.91 3.67
                lineToRelative(dx = 1.91f, dy = 3.67f)
                // l 4.09 0.5
                lineToRelative(dx = 4.09f, dy = 0.5f)
                // l -3 2.76z
                lineToRelative(dx = -3.0f, dy = 2.76f)
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
        }.build().also { _locationStarFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _locationStarFilled: ImageVector? = null
