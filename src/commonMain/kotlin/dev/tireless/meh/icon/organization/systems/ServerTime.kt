package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerTime: ImageVector
    get() {
        val current = _serverTime
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ServerTime",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 30 H4 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 M4 22 v6 h24 v-6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // M 4 22
                moveTo(x = 4.0f, y = 22.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
            }
            // <circle cx="7.0" cy="25.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <polygon points="19.0 11.586 17.0 9.586 17.0 6.0 15.0 6.0 15.0 10.414 17.586 13.0 19.0 11.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 11.586
                moveTo(x = 19.0f, y = 11.586f)
                // L 17 9.586
                lineTo(x = 17.0f, y = 9.586f)
                // L 17 6
                lineTo(x = 17.0f, y = 6.0f)
                // L 15 6
                lineTo(x = 15.0f, y = 6.0f)
                // L 15 10.414
                lineTo(x = 15.0f, y = 10.414f)
                // L 17.586 13
                lineTo(x = 17.586f, y = 13.0f)
                // L 19 11.586z
                lineTo(x = 19.0f, y = 11.586f)
                close()
            }
            // M16 18 a8 8 0 1 1 8 -8 8 8 0 0 1 -8 8 m0 -14 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // a 8 8 0 1 1 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // a 8 8 0 0 1 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
                )
                // m 0 -14
                moveToRelative(dx = 0.0f, dy = -14.0f)
                // a 6 6 0 1 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // a 6 6 0 0 0 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
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
        }.build().also { _serverTime = it }
    }

@Suppress("ObjectPropertyName")
private var _serverTime: ImageVector? = null
