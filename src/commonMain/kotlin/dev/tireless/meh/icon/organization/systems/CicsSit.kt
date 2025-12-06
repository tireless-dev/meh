package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsSit: ImageVector
    get() {
        val current = _cicsSit
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CicsSit",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="23.0 22.0 30.0 27.0 23.0 32.0 23.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 22
                moveTo(x = 23.0f, y = 22.0f)
                // L 30 27
                lineTo(x = 30.0f, y = 27.0f)
                // L 23 32
                lineTo(x = 23.0f, y = 32.0f)
                // L 23 22z
                lineTo(x = 23.0f, y = 22.0f)
                close()
            }
            // M26 3 H6 a3 3 0 0 0 -3 3 v20 a3 3 0 0 0 3 3 h11 v-9 h12 V6 a3 3 0 0 0 -3 -3 M6 5 h20 a1 1 0 0 1 1 1 v3 H5 V6 a1 1 0 0 1 1 -1 m9 6 v7 H5 v-7z m0 16 H6 a1 1 0 0 1 -1 -1 v-6 h10z m2 -9 v-7 h10 v7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 3
                moveTo(x = 26.0f, y = 3.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 6
                verticalLineTo(y = 6.0f)
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
                // M 6 5
                moveTo(x = 6.0f, y = 5.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // m 9 6
                moveToRelative(dx = 9.0f, dy = 6.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -7z
                verticalLineToRelative(dy = -7.0f)
                close()
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
                // m 2 -9
                moveToRelative(dx = 2.0f, dy = -9.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 7z
                verticalLineToRelative(dy = 7.0f)
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
        }.build().also { _cicsSit = it }
    }

@Suppress("ObjectPropertyName")
private var _cicsSit: ImageVector? = null
