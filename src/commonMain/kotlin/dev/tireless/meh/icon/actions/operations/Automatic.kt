package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Automatic: ImageVector
    get() {
        val current = _automatic
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Automatic",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 16 h-4 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V18 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5Z m-6 4 a11 11 0 0 1 -9.22 -5 H12 v-2 H4 v8 h2 v-3.69 A13 13 0 0 0 16 29Z m4 -17 h5.22 A11 11 0 0 0 5 16 H3 a13 13 0 0 1 23 -8.32 V4 h2 v8 h-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 16
                moveTo(x = 26.0f, y = 16.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // m -4 7
                moveToRelative(dx = -4.0f, dy = 7.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
                close()
                // m -6 4
                moveToRelative(dx = -6.0f, dy = 4.0f)
                // a 11 11 0 0 1 -9.22 -5
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.22f,
                    dy1 = -5.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3.69
                verticalLineToRelative(dy = -3.69f)
                // A 13 13 0 0 0 16 29z
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 29.0f,
                )
                close()
                // m 4 -17
                moveToRelative(dx = 4.0f, dy = -17.0f)
                // h 5.22
                horizontalLineToRelative(dx = 5.22f)
                // A 11 11 0 0 0 5 16
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 16.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 13 13 0 0 1 23 -8.32
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 23.0f,
                    dy1 = -8.32f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _automatic = it }
    }

@Suppress("ObjectPropertyName")
private var _automatic: ImageVector? = null
