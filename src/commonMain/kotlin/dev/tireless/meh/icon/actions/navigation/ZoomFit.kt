package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZoomFit: ImageVector
    get() {
        val current = _zoomFit
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ZoomFit",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21.45 20 A11 11 0 0 0 24 13 a11 11 0 1 0 -11 11 11 11 0 0 0 7 -2.55 L27.59 29 29 27.59Z M13 22 a9 9 0 1 1 9 -9 9 9 0 0 1 -9 9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.45 20
                moveTo(x = 21.45f, y = 20.0f)
                // A 11 11 0 0 0 24 13
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 13.0f,
                )
                // a 11 11 0 1 0 -11 11
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -11.0f,
                    dy1 = 11.0f,
                )
                // a 11 11 0 0 0 7 -2.55
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -2.55f,
                )
                // L 27.59 29
                lineTo(x = 27.59f, y = 29.0f)
                // L 29 27.59z
                lineTo(x = 29.0f, y = 27.59f)
                close()
                // M 13 22
                moveTo(x = 13.0f, y = 22.0f)
                // a 9 9 0 1 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
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
            }
            // M10 12 H8 v-2 a2 2 0 0 1 2 -2 h2 v2 h-2Z m8 0 h-2 v-2 h-2 V8 h2 a2 2 0 0 1 2 2Z m-6 6 h-2 a2 2 0 0 1 -2 -2 v-2 h2 v2 h2Z m4 0 h-2 v-2 h2 v-2 h2 v2 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m -6 6
                moveToRelative(dx = -6.0f, dy = 6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
        }.build().also { _zoomFit = it }
    }

@Suppress("ObjectPropertyName")
private var _zoomFit: ImageVector? = null
