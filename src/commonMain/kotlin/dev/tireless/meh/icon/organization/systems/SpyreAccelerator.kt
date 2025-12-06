package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SpyreAccelerator: ImageVector
    get() {
        val current = _spyreAccelerator
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SpyreAccelerator",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M7 17 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 m0 -4 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 m6 4 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 m0 -4 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 m12 4 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 m0 -4 a1 1 0 1 0 0 -2 1 1 0 0 0 0 2 M2 7 v17 h6 v-3 h3 v4 h16 v-4 h3 V7z m23 16 H13 v-2 h12z m3 -4 H6 v3 H4 V9 h24z m-6 -8 h-6 v6 h6z m-2 4 h-2 v-2 h2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 17
                moveTo(x = 7.0f, y = 17.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 6 4
                moveToRelative(dx = 6.0f, dy = 4.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 12 4
                moveToRelative(dx = 12.0f, dy = 4.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
                // v 17
                verticalLineToRelative(dy = 17.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 7z
                verticalLineTo(y = 7.0f)
                close()
                // m 23 16
                moveToRelative(dx = 23.0f, dy = 16.0f)
                // H 13
                horizontalLineTo(x = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 12z
                horizontalLineToRelative(dx = 12.0f)
                close()
                // m 3 -4
                moveToRelative(dx = 3.0f, dy = -4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
                close()
                // m -6 -8
                moveToRelative(dx = -6.0f, dy = -8.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m -2 4
                moveToRelative(dx = -2.0f, dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _spyreAccelerator = it }
    }

@Suppress("ObjectPropertyName")
private var _spyreAccelerator: ImageVector? = null
