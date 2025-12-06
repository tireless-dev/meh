package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClassicBatch: ImageVector
    get() {
        val current = _classicBatch
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ClassicBatch",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 4 v16 a2 2 0 0 1 -2 2 H12 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 m-2 16 V4 H12 v16z M8 6 H6 v18 a2 2 0 0 0 2 2 h18 v-2 H8z m-4 4 H2 v18 a2 2 0 0 0 2 2 h18 v-2 H4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // H 12
                horizontalLineTo(x = 12.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // m -2 16
                moveToRelative(dx = -2.0f, dy = 16.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 16z
                verticalLineToRelative(dy = 16.0f)
                close()
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _classicBatch = it }
    }

@Suppress("ObjectPropertyName")
private var _classicBatch: ImageVector? = null
