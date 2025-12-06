package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Renew: ImageVector
    get() {
        val current = _renew
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Renew",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 10 H6.78 A11 11 0 0 1 27 16 h2 A13 13 0 0 0 6 7.68 V4 H4 v8 h8Z m8 12 h5.22 A11 11 0 0 1 5 16 H3 a13 13 0 0 0 23 8.32 V28 h2 v-8 h-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // H 6.78
                horizontalLineTo(x = 6.78f)
                // A 11 11 0 0 1 27 16
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 27.0f,
                    y1 = 16.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // A 13 13 0 0 0 6 7.68
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 7.68f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
                close()
                // m 8 12
                moveToRelative(dx = 8.0f, dy = 12.0f)
                // h 5.22
                horizontalLineToRelative(dx = 5.22f)
                // A 11 11 0 0 1 5 16
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 16.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 13 13 0 0 0 23 8.32
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 23.0f,
                    dy1 = 8.32f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
        }.build().also { _renew = it }
    }

@Suppress("ObjectPropertyName")
private var _renew: ImageVector? = null
