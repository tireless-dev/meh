package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThunderstormScattered: ImageVector
    get() {
        val current = _thunderstormScattered
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ThunderstormScattered",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="13.338 30.0 11.602 29.0 13.889 25.0 10.0 25.0 13.993 18.0 15.73 19.0 13.446 23.0 17.337 23.0 13.338 30.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13.338 30
                moveTo(x = 13.338f, y = 30.0f)
                // L 11.602 29
                lineTo(x = 11.602f, y = 29.0f)
                // L 13.889 25
                lineTo(x = 13.889f, y = 25.0f)
                // L 10 25
                lineTo(x = 10.0f, y = 25.0f)
                // L 13.993 18
                lineTo(x = 13.993f, y = 18.0f)
                // L 15.73 19
                lineTo(x = 15.73f, y = 19.0f)
                // L 13.446 23
                lineTo(x = 13.446f, y = 23.0f)
                // L 17.337 23
                lineTo(x = 17.337f, y = 23.0f)
                // L 13.338 30z
                lineTo(x = 13.338f, y = 30.0f)
                close()
            }
            // M27 11 a6 6 0 0 0 -11.37 -2.67 A7 7 0 0 0 13.5 8 a7.55 7.55 0 0 0 -7.15 5.24 A6 6 0 0 0 8 25 v-2 a4 4 0 0 1 -.67 -7.93 l.66 -.11 .15 -.66 a5.5 5.5 0 0 1 10.73 0 L19 14.96 l.66 .11 A4 4 0 0 1 19 23 v2 a6 6 0 0 0 5.22 -8.95 A6 6 0 0 0 27 11 m-4.07 3.49 a6 6 0 0 0 -2.28 -1.25 7.5 7.5 0 0 0 -3.19 -4.06 3.99 3.99 0 1 1 5.47 5.3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // a 6 6 0 0 0 -11.37 -2.67
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.37f,
                    dy1 = -2.67f,
                )
                // A 7 7 0 0 0 13.5 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.5f,
                    y1 = 8.0f,
                )
                // a 7.55 7.55 0 0 0 -7.15 5.24
                arcToRelative(
                    a = 7.55f,
                    b = 7.55f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.15f,
                    dy1 = 5.24f,
                )
                // A 6 6 0 0 0 8 25
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 25.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 4 4 0 0 1 -0.67 -7.93
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.67f,
                    dy1 = -7.93f,
                )
                // l 0.66 -0.11
                lineToRelative(dx = 0.66f, dy = -0.11f)
                // l 0.15 -0.66
                lineToRelative(dx = 0.15f, dy = -0.66f)
                // a 5.5 5.5 0 0 1 10.73 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.73f,
                    dy1 = 0.0f,
                )
                // L 19 14.96
                lineTo(x = 19.0f, y = 14.96f)
                // l 0.66 0.11
                lineToRelative(dx = 0.66f, dy = 0.11f)
                // A 4 4 0 0 1 19 23
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 23.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 6 6 0 0 0 5.22 -8.95
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.22f,
                    dy1 = -8.95f,
                )
                // A 6 6 0 0 0 27 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 11.0f,
                )
                // m -4.07 3.49
                moveToRelative(dx = -4.07f, dy = 3.49f)
                // a 6 6 0 0 0 -2.28 -1.25
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.28f,
                    dy1 = -1.25f,
                )
                // a 7.5 7.5 0 0 0 -3.19 -4.06
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.19f,
                    dy1 = -4.06f,
                )
                // a 3.99 3.99 0 1 1 5.47 5.3
                arcToRelative(
                    a = 3.99f,
                    b = 3.99f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.47f,
                    dy1 = 5.3f,
                )
            }
            // <rect width="3" height="2" x="26.732" y="16.233" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.585556 19.000767
                moveTo(x = 28.585556f, y = 19.000767f)
                // l -2.1213205 -2.1213202
                lineToRelative(dx = -2.1213205f, dy = -2.1213202f)
                // l 1.4142134 -1.4142137
                lineToRelative(dx = 1.4142134f, dy = -1.4142137f)
                // l 2.1213205 2.1213202z
                lineToRelative(dx = 2.1213205f, dy = 2.1213202f)
                close()
            }
            // <rect width="3" height="2" x="29.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 10
                moveTo(x = 29.0f, y = 10.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="2" x="26.732" y="3.768" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.464233 5.1215553
                moveTo(x = 26.464233f, y = 5.1215553f)
                // l 2.1213202 -2.1213202
                lineToRelative(dx = 2.1213202f, dy = -2.1213202f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -2.1213202 2.1213202z
                lineToRelative(dx = -2.1213202f, dy = 2.1213202f)
                close()
            }
            // <rect width="2" height="3" x="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 0
                moveTo(x = 20.0f, y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="3" height="2" x="12.268" y="3.768" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14.121553 6.5357685
                moveTo(x = 14.121553f, y = 6.5357685f)
                // l -2.1213205 -2.1213202
                lineToRelative(dx = -2.1213205f, dy = -2.1213202f)
                // l 1.4142134 -1.4142137
                lineToRelative(dx = 1.4142134f, dy = -1.4142137f)
                // l 2.1213205 2.1213202z
                lineToRelative(dx = 2.1213205f, dy = 2.1213202f)
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
        }.build().also { _thunderstormScattered = it }
    }

@Suppress("ObjectPropertyName")
private var _thunderstormScattered: ImageVector? = null
