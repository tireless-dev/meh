package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoadBalancerApplication: ImageVector
    get() {
        val current = _loadBalancerApplication
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LoadBalancerApplication",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="4" height="4" x="4.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 26
                moveTo(x = 4.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="4" x="14.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 26
                moveTo(x = 14.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="4" x="24.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 26
                moveTo(x = 24.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M25 16 h-8 v-2 h-2 v2 H7 a2 2 0 0 0 -2 2 v6 h2 v-6 h8 v6 h2 v-6 h8 v6 h2 v-6 a2 2 0 0 0 -2 -2 M9 2 v10 h14 V2Z m2 2 h2 v6 h-2Z m10 6 h-6 V4 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 16
                moveTo(x = 25.0f, y = 16.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 2 2
                moveToRelative(dx = 2.0f, dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 10 6
                moveToRelative(dx = 10.0f, dy = 6.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
        }.build().also { _loadBalancerApplication = it }
    }

@Suppress("ObjectPropertyName")
private var _loadBalancerApplication: ImageVector? = null
