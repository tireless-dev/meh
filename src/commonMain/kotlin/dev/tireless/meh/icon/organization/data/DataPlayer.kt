package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataPlayer: ImageVector
    get() {
        val current = _dataPlayer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataPlayer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 24 v2 H15.82 a2.98 2.98 0 0 0 -5.64 0 H4 v-2 H2 v6 h2 v-2 h6.18 a2.98 2.98 0 0 0 5.64 0 H28 v2 h2 v-6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 24
                moveTo(x = 28.0f, y = 24.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 15.82
                horizontalLineTo(x = 15.82f)
                // a 2.98 2.98 0 0 0 -5.64 0
                arcToRelative(
                    a = 2.98f,
                    b = 2.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.64f,
                    dy1 = 0.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 6.18
                horizontalLineToRelative(dx = 6.18f)
                // a 2.98 2.98 0 0 0 5.64 0
                arcToRelative(
                    a = 2.98f,
                    b = 2.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.64f,
                    dy1 = 0.0f,
                )
                // H 28
                horizontalLineTo(x = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
            }
            // <polygon points="13.0 7.5 13.0 16.499 13.0 16.499 21.0 12.0 13.0 7.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 7.5
                moveTo(x = 13.0f, y = 7.5f)
                // L 13 16.499
                lineTo(x = 13.0f, y = 16.499f)
                // L 13 16.499
                lineTo(x = 13.0f, y = 16.499f)
                // L 21 12
                lineTo(x = 21.0f, y = 12.0f)
                // L 13 7.5z
                lineTo(x = 13.0f, y = 7.5f)
                close()
            }
            // M16 22 a10 10 0 1 1 10 -10 10 10 0 0 1 -10 10 m0 -18 a8 8 0 1 0 8 8 8 8 0 0 0 -8 -8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 10 10 0 1 1 10 -10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = -10.0f,
                )
                // a 10 10 0 0 1 -10 10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 10.0f,
                )
                // m 0 -18
                moveToRelative(dx = 0.0f, dy = -18.0f)
                // a 8 8 0 1 0 8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 8.0f,
                )
                // a 8 8 0 0 0 -8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = -8.0f,
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
        }.build().also { _dataPlayer = it }
    }

@Suppress("ObjectPropertyName")
private var _dataPlayer: ImageVector? = null
