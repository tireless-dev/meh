package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ISOFilled: ImageVector
    get() {
        val current = _iSOFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ISOFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="3" height="6" x="21.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 13
                moveTo(x = 21.0f, y = 13.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 M8 21 H6 V11 h2Z m9 -8 h-5 v2 h3 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-5 v-2 h5 v-2 h-3 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h5Z m9 6 a2 2 0 0 1 -2 2 h-3 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 9 -8
                moveToRelative(dx = 9.0f, dy = -8.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // m 9 6
                moveToRelative(dx = 9.0f, dy = 6.0f)
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
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
        }.build().also { _iSOFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _iSOFilled: ImageVector? = null
