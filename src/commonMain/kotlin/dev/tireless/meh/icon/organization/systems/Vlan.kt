package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Vlan: ImageVector
    get() {
        val current = _vlan
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Vlan",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 17 v-2 H17 v-4 h2 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 h-6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h2 v4 H2 v2 h6 v4 H6 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 h-2 v-4 h12 v4 h-2 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 h-2 v-4Z M13 4 h6 v5 h-6Z m-1 24 H6 v-5 h6Z m14 0 h-6 v-5 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 17
                moveTo(x = 30.0f, y = 17.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // M 13 4
                moveTo(x = 13.0f, y = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
                // m -1 24
                moveToRelative(dx = -1.0f, dy = 24.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m 14 0
                moveToRelative(dx = 14.0f, dy = 0.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _vlan = it }
    }

@Suppress("ObjectPropertyName")
private var _vlan: ImageVector? = null
