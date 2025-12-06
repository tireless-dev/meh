package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Table: ImageVector
    get() {
        val current = _table
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Table",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2Z m-2 0 v4 H5 V5Z m0 22 H5 v-4 h22Z m0 -6 H5 v-4 h22Z m0 -6 H5 v-4 h22Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 5
                moveTo(x = 29.0f, y = 5.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // h 22
                horizontalLineToRelative(dx = 22.0f)
                // a 2 2 0 0 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // V 5z
                verticalLineTo(y = 5.0f)
                close()
                // m 0 22
                moveToRelative(dx = 0.0f, dy = 22.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 22z
                horizontalLineToRelative(dx = 22.0f)
                close()
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 22z
                horizontalLineToRelative(dx = 22.0f)
                close()
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 22z
                horizontalLineToRelative(dx = 22.0f)
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
        }.build().also { _table = it }
    }

@Suppress("ObjectPropertyName")
private var _table: ImageVector? = null
