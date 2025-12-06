package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserAccessLocked: ImageVector
    get() {
        val current = _userAccessLocked
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UserAccessLocked",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 8 V5 a4 4 0 0 0 -8 0 v3 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-6 -3 a2 2 0 0 1 4 0 v3 h-4z m-2 11 v-6 h8 v6z m-4 14 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5z M9 10 a3 3 0 1 1 0 6 3 3 0 0 1 0 -6 m0 -2 a5 5 0 1 0 0 10 A5 5 0 0 0 9 8
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // m -6 -3
                moveToRelative(dx = -6.0f, dy = -3.0f)
                // a 2 2 0 0 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -2 11
                moveToRelative(dx = -2.0f, dy = 11.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
                close()
                // m -4 14
                moveToRelative(dx = -4.0f, dy = 14.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                close()
                // M 9 10
                moveTo(x = 9.0f, y = 10.0f)
                // a 3 3 0 1 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // a 3 3 0 0 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 5 5 0 1 0 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                // A 5 5 0 0 0 9 8
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 8.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _userAccessLocked = it }
    }

@Suppress("ObjectPropertyName")
private var _userAccessLocked: ImageVector? = null
