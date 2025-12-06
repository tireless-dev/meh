package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindGusts: ImageVector
    get() {
        val current = _windGusts
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WindGusts",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.32 8.05 -18 -6 A1 1 0 0 0 10.4 2.2 L4 7 V2 H2 v28 h2 V11 l6.4 4.8 a1 1 0 0 0 .92 .15 l18 -6 a1 1 0 0 0 0 -1.9 M10 13 4.67 9 10 5Z m4 -.05 -2 .66 V4.4 l2 .66Z m4 -1.34 -2 .67 V5.72 l2 .67Z m2 -.66 v-3.9 L25.84 9Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.32 8.05
                moveTo(x = 29.32f, y = 8.05f)
                // l -18 -6
                lineToRelative(dx = -18.0f, dy = -6.0f)
                // A 1 1 0 0 0 10.4 2.2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.4f,
                    y1 = 2.2f,
                )
                // L 4 7
                lineTo(x = 4.0f, y = 7.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // l 6.4 4.8
                lineToRelative(dx = 6.4f, dy = 4.8f)
                // a 1 1 0 0 0 0.92 0.15
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.92f,
                    dy1 = 0.15f,
                )
                // l 18 -6
                lineToRelative(dx = 18.0f, dy = -6.0f)
                // a 1 1 0 0 0 0 -1.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.9f,
                )
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // L 4.67 9
                lineTo(x = 4.67f, y = 9.0f)
                // L 10 5z
                lineTo(x = 10.0f, y = 5.0f)
                close()
                // m 4 -0.05
                moveToRelative(dx = 4.0f, dy = -0.05f)
                // l -2 0.66
                lineToRelative(dx = -2.0f, dy = 0.66f)
                // V 4.4
                verticalLineTo(y = 4.4f)
                // l 2 0.66z
                lineToRelative(dx = 2.0f, dy = 0.66f)
                close()
                // m 4 -1.34
                moveToRelative(dx = 4.0f, dy = -1.34f)
                // l -2 0.67
                lineToRelative(dx = -2.0f, dy = 0.67f)
                // V 5.72
                verticalLineTo(y = 5.72f)
                // l 2 0.67z
                lineToRelative(dx = 2.0f, dy = 0.67f)
                close()
                // m 2 -0.66
                moveToRelative(dx = 2.0f, dy = -0.66f)
                // v -3.9
                verticalLineToRelative(dy = -3.9f)
                // L 25.84 9z
                lineTo(x = 25.84f, y = 9.0f)
                close()
            }
            // M20 22 a4 4 0 0 0 -8 0 h2 a2 2 0 1 1 2 2 H8 v2 h8 a4 4 0 0 0 4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 22
                moveTo(x = 20.0f, y = 22.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 1 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
            }
            // M26 22 a4 4 0 0 0 -4 4 h2 a2 2 0 1 1 2 2 H12 v2 h14 a4 4 0 0 0 0 -8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 22
                moveTo(x = 26.0f, y = 22.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 1 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 4 4 0 0 0 0 -8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -8.0f,
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
        }.build().also { _windGusts = it }
    }

@Suppress("ObjectPropertyName")
private var _windGusts: ImageVector? = null
