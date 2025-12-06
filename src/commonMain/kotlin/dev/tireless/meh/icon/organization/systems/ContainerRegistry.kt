package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerRegistry: ImageVector
    get() {
        val current = _containerRegistry
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ContainerRegistry",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 13 V6 H8 v16 h16 v-9Z m-7 -5 h5 v5 h-5Z m0 7 h5 v5 h-5Z m12 5 h-5 v-5 h5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 13
                moveTo(x = 17.0f, y = 13.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -9z
                verticalLineToRelative(dy = -9.0f)
                close()
                // m -7 -5
                moveToRelative(dx = -7.0f, dy = -5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // m 12 5
                moveToRelative(dx = 12.0f, dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
            }
            // M28 11 h-9 V2 h9Z m-7 -2 h5 V4 h-5Z m7 11 h-2 v2 h2 v6 H4 v-6 h2 v-2 H4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 11
                moveTo(x = 28.0f, y = 11.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 9z
                horizontalLineToRelative(dx = 9.0f)
                close()
                // m -7 -2
                moveToRelative(dx = -7.0f, dy = -2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
                // m 7 11
                moveToRelative(dx = 7.0f, dy = 11.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
        }.build().also { _containerRegistry = it }
    }

@Suppress("ObjectPropertyName")
private var _containerRegistry: ImageVector? = null
