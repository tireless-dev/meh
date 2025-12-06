package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Async: ImageVector
    get() {
        val current = _async
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Async",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23.22 4 H26 V2 h-7 v6 h2 V5.1 c4.24 1.93 7 6.15 7 10.9 0 6.62 -5.38 12 -12 12 v2 a14.02 14.02 0 0 0 7.22 -26
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.22 4
                moveTo(x = 23.22f, y = 4.0f)
                // H 26
                horizontalLineTo(x = 26.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5.1
                verticalLineTo(y = 5.1f)
                // c 4.24 1.93 7 6.15 7 10.9
                curveToRelative(
                    dx1 = 4.24f,
                    dy1 = 1.93f,
                    dx2 = 7.0f,
                    dy2 = 6.15f,
                    dx3 = 7.0f,
                    dy3 = 10.9f,
                )
                // c 0 6.62 -5.38 12 -12 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 6.62f,
                    dx2 = -5.38f,
                    dy2 = 12.0f,
                    dx3 = -12.0f,
                    dy3 = 12.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 14.02 14.02 0 0 0 7.22 -26
                arcToRelative(
                    a = 14.02f,
                    b = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.22f,
                    dy1 = -26.0f,
                )
            }
            // M16 20 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 20
                moveTo(x = 16.0f, y = 20.0f)
                // a 1.5 1.5 0 1 0 0 3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                )
                // a 1.5 1.5 0 0 0 0 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
            }
            // <rect width="2" height="9" x="15.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M16 4 V2 a14.02 14.02 0 0 0 -7.22 26 H6 v2 h7 v-6 h-2 v2.9 C6.74 24.95 4 20.72 4 16 4 9.38 9.38 4 16 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // a 14.02 14.02 0 0 0 -7.22 26
                arcToRelative(
                    a = 14.02f,
                    b = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.22f,
                    dy1 = 26.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.9
                verticalLineToRelative(dy = 2.9f)
                // C 6.74 24.95 4 20.72 4 16
                curveTo(
                    x1 = 6.74f,
                    y1 = 24.95f,
                    x2 = 4.0f,
                    y2 = 20.72f,
                    x3 = 4.0f,
                    y3 = 16.0f,
                )
                // C 4 9.38 9.38 4 16 4
                curveTo(
                    x1 = 4.0f,
                    y1 = 9.38f,
                    x2 = 9.38f,
                    y2 = 4.0f,
                    x3 = 16.0f,
                    y3 = 4.0f,
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
        }.build().also { _async = it }
    }

@Suppress("ObjectPropertyName")
private var _async: ImageVector? = null
