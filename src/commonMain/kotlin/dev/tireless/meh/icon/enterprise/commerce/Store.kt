package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Store: ImageVector
    get() {
        val current = _store
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Store",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m30 10.68 -2 -6 A1 1 0 0 0 27 4 H5 a1 1 0 0 0 -1 .68 l-2 6 A1 1 0 0 0 2 11 v6 a1 1 0 0 0 1 1 h1 v10 h2 V18 h6 v10 h16 V18 h1 a1 1 0 0 0 1 -1 v-6 a1 1 0 0 0 0 -.32 M26 26 H14 v-8 h12Z m2 -10 h-4 v-4 h-2 v4 h-5 v-4 h-2 v4 h-5 v-4 H8 v4 H4 v-4.84 L5.72 6 h20.56 L28 11.16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 10.68
                moveTo(x = 30.0f, y = 10.68f)
                // l -2 -6
                lineToRelative(dx = -2.0f, dy = -6.0f)
                // A 1 1 0 0 0 27 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 4.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 1 1 0 0 0 -1 0.68
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.68f,
                )
                // l -2 6
                lineToRelative(dx = -2.0f, dy = 6.0f)
                // A 1 1 0 0 0 2 11
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 11.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 1 1 0 0 0 0 -0.32
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -0.32f,
                )
                // M 26 26
                moveTo(x = 26.0f, y = 26.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m 2 -10
                moveToRelative(dx = 2.0f, dy = -10.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4.84
                verticalLineToRelative(dy = -4.84f)
                // L 5.72 6
                lineTo(x = 5.72f, y = 6.0f)
                // h 20.56
                horizontalLineToRelative(dx = 20.56f)
                // L 28 11.16z
                lineTo(x = 28.0f, y = 11.16f)
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
        }.build().also { _store = it }
    }

@Suppress("ObjectPropertyName")
private var _store: ImageVector? = null
