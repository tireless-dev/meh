package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserFilled: ImageVector
    get() {
        val current = _userFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UserFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M6 30 h20 v-5 a7 7 0 0 0 -7 -7 h-6 a7 7 0 0 0 -7 7Z M9 9 a7 7 0 1 0 7 -7 7 7 0 0 0 -7 7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 30
                moveTo(x = 6.0f, y = 30.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 7 7 0 0 0 -7 7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                close()
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // a 7 7 0 1 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
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
        }.build().also { _userFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _userFilled: ImageVector? = null
