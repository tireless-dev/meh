package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pressure: ImageVector
    get() {
        val current = _pressure
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Pressure",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m17.5 16 8.16 -7.25 A1 1 0 0 0 25 7 h-3 V2 h-2 v7 h2.37 L16 14.66 9.63 9 H12 V2 h-2 v5 H7 a1 1 0 0 0 -.66 1.75 L14.49 16 l-8.15 7.25 A1 1 0 0 0 7 25 h3 v5 h2 v-7 H9.63 L16 17.34 22.37 23 H20 v7 h2 v-5 h3 a1 1 0 0 0 .66 -1.75Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.5 16
                moveTo(x = 17.5f, y = 16.0f)
                // l 8.16 -7.25
                lineToRelative(dx = 8.16f, dy = -7.25f)
                // A 1 1 0 0 0 25 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 7.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 2.37
                horizontalLineToRelative(dx = 2.37f)
                // L 16 14.66
                lineTo(x = 16.0f, y = 14.66f)
                // L 9.63 9
                lineTo(x = 9.63f, y = 9.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 -0.66 1.75
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.66f,
                    dy1 = 1.75f,
                )
                // L 14.49 16
                lineTo(x = 14.49f, y = 16.0f)
                // l -8.15 7.25
                lineToRelative(dx = -8.15f, dy = 7.25f)
                // A 1 1 0 0 0 7 25
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 25.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // H 9.63
                horizontalLineTo(x = 9.63f)
                // L 16 17.34
                lineTo(x = 16.0f, y = 17.34f)
                // L 22.37 23
                lineTo(x = 22.37f, y = 23.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 1 1 0 0 0 0.66 -1.75z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.66f,
                    dy1 = -1.75f,
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
        }.build().also { _pressure = it }
    }

@Suppress("ObjectPropertyName")
private var _pressure: ImageVector? = null
