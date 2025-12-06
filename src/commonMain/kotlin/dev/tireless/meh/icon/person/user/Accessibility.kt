package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Accessibility: ImageVector
    get() {
        val current = _accessibility
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Accessibility",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.55 26.11 -3.05 1.52 L23.66 21 H15 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 4 0 v4 h7 v-2 h-5 v-2 a4 4 0 0 0 -8 0 v1 a9 9 0 1 0 8.77 11 h-2.06 A7 7 0 1 1 11 16 v3 a4 4 0 0 0 4 4 h7.34 l3.16 7.37 4.95 -2.48Z M15.5 8 A3.5 3.5 0 1 1 19 4.5 3.5 3.5 0 0 1 15.5 8 m0 -5 A1.5 1.5 0 1 0 17 4.5 1.5 1.5 0 0 0 15.5 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.55 26.11
                moveTo(x = 29.55f, y = 26.11f)
                // l -3.05 1.52
                lineToRelative(dx = -3.05f, dy = 1.52f)
                // L 23.66 21
                lineTo(x = 23.66f, y = 21.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 9 9 0 1 0 8.77 11
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.77f,
                    dy1 = 11.0f,
                )
                // h -2.06
                horizontalLineToRelative(dx = -2.06f)
                // A 7 7 0 1 1 11 16
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 16.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 4 4 0 0 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // h 7.34
                horizontalLineToRelative(dx = 7.34f)
                // l 3.16 7.37
                lineToRelative(dx = 3.16f, dy = 7.37f)
                // l 4.95 -2.48z
                lineToRelative(dx = 4.95f, dy = -2.48f)
                close()
                // M 15.5 8
                moveTo(x = 15.5f, y = 8.0f)
                // A 3.5 3.5 0 1 1 19 4.5
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 4.5f,
                )
                // A 3.5 3.5 0 0 1 15.5 8
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.5f,
                    y1 = 8.0f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // A 1.5 1.5 0 1 0 17 4.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 4.5f,
                )
                // A 1.5 1.5 0 0 0 15.5 3
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.5f,
                    y1 = 3.0f,
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
        }.build().also { _accessibility = it }
    }

@Suppress("ObjectPropertyName")
private var _accessibility: ImageVector? = null
