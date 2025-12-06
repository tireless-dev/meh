package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sprout: ImageVector
    get() {
        val current = _sprout
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Sprout",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 2 a11 11 0 0 0 -10.25 7.02 A7 7 0 0 0 9 6 H6 v3 a7 7 0 0 0 7 7 h1 v9.05 a10 10 0 0 0 -6.07 2.88 l1.41 1.41 a8 8 0 0 1 12.31 1.22 l1.66 -1.12 A10 10 0 0 0 16 25.06 V16 h1 A11 11 0 0 0 28 5 V2Z M13 14 a5 5 0 0 1 -5 -5 V8 h1 a5 5 0 0 1 5 5 v1Z m13 -9 a9 9 0 0 1 -9 9 h-1 v-1 a9 9 0 0 1 9 -9 h1Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 2
                moveTo(x = 25.0f, y = 2.0f)
                // a 11 11 0 0 0 -10.25 7.02
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.25f,
                    dy1 = 7.02f,
                )
                // A 7 7 0 0 0 9 6
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 6.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 7 7 0 0 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 9.05
                verticalLineToRelative(dy = 9.05f)
                // a 10 10 0 0 0 -6.07 2.88
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.07f,
                    dy1 = 2.88f,
                )
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // a 8 8 0 0 1 12.31 1.22
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.31f,
                    dy1 = 1.22f,
                )
                // l 1.66 -1.12
                lineToRelative(dx = 1.66f, dy = -1.12f)
                // A 10 10 0 0 0 16 25.06
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 25.06f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // A 11 11 0 0 0 28 5
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 5.0f,
                )
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // M 13 14
                moveTo(x = 13.0f, y = 14.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 5 5 0 0 1 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // v 1z
                verticalLineToRelative(dy = 1.0f)
                close()
                // m 13 -9
                moveToRelative(dx = 13.0f, dy = -9.0f)
                // a 9 9 0 0 1 -9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 9.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 9 9 0 0 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // h 1z
                horizontalLineToRelative(dx = 1.0f)
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
        }.build().also { _sprout = it }
    }

@Suppress("ObjectPropertyName")
private var _sprout: ImageVector? = null
