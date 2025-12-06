package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAdmin: ImageVector
    get() {
        val current = _userAdmin
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UserAdmin",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 4 a5 5 0 1 1 -5 5 5 5 0 0 1 5 -5 m0 -2 a7 7 0 1 0 7 7 7 7 0 0 0 -7 -7 m10 28 h-2 v-5 a5 5 0 0 0 -5 -5 H9 a5 5 0 0 0 -5 5 v5 H2 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // a 5 5 0 1 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 7 7 0 1 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // m 10 28
                moveToRelative(dx = 10.0f, dy = 28.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 7 7 0 0 1 7 7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                close()
            }
            // <polygon points="25.0 16.18 22.41 13.59 21.0 15.0 25.0 19.0 32.0 12.0 30.59 10.59 25.0 16.18" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 16.18
                moveTo(x = 25.0f, y = 16.18f)
                // L 22.41 13.59
                lineTo(x = 22.41f, y = 13.59f)
                // L 21 15
                lineTo(x = 21.0f, y = 15.0f)
                // L 25 19
                lineTo(x = 25.0f, y = 19.0f)
                // L 32 12
                lineTo(x = 32.0f, y = 12.0f)
                // L 30.59 10.59
                lineTo(x = 30.59f, y = 10.59f)
                // L 25 16.18z
                lineTo(x = 25.0f, y = 16.18f)
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
        }.build().also { _userAdmin = it }
    }

@Suppress("ObjectPropertyName")
private var _userAdmin: ImageVector? = null
