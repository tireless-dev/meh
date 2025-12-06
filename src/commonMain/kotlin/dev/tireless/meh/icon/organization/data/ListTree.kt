package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListTree: ImageVector
    get() {
        val current = _listTree
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ListTree",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M7 4 H5 v22 a2 2 0 0 0 2 2 h5 v-2 H7 v-6 h5 v-2 H7 v-6 h5 v-2 H7z m9 8 h2 v-2 h-2z m4 -2 v2 h7 v-2z m-4 10 h2 v-2 h-2z m4 0 h7 v-2 h-7z m-4 8 h2 v-2 h-2z m4 0 h7 v-2 h-7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
                // m 9 8
                moveToRelative(dx = 9.0f, dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -4 10
                moveToRelative(dx = -4.0f, dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
                // m -4 8
                moveToRelative(dx = -4.0f, dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
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
        }.build().also { _listTree = it }
    }

@Suppress("ObjectPropertyName")
private var _listTree: ImageVector? = null
