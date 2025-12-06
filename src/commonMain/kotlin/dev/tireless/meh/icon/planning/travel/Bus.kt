package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bus: ImageVector
    get() {
        val current = _bus
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Bus",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="4" x="27.0" y="11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 11
                moveTo(x = 27.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="3.0" y="11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="20.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="10.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M21 4 H11 a5 5 0 0 0 -5 5 v14 a2 2 0 0 0 2 2 v3 h2 v-3 h12 v3 h2 v-3 a2 2 0 0 0 2 -2 V9 a5 5 0 0 0 -5 -5 m3 6 v6 H8 v-6Z M11 6 h10 a3 3 0 0 1 2.82 2 H8.18 A3 3 0 0 1 11 6 M8 23 v-5 h16 v5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // m 3 6
                moveToRelative(dx = 3.0f, dy = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 11 6
                moveTo(x = 11.0f, y = 6.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 3 3 0 0 1 2.82 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.82f,
                    dy1 = 2.0f,
                )
                // H 8.18
                horizontalLineTo(x = 8.18f)
                // A 3 3 0 0 1 11 6
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 6.0f,
                )
                // M 8 23
                moveTo(x = 8.0f, y = 23.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 5z
                verticalLineToRelative(dy = 5.0f)
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
        }.build().also { _bus = it }
    }

@Suppress("ObjectPropertyName")
private var _bus: ImageVector? = null
