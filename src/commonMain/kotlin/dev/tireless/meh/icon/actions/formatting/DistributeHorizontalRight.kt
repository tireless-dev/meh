package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DistributeHorizontalRight: ImageVector
    get() {
        val current = _distributeHorizontalRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DistributeHorizontalRight",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="28" x="28.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M24 22 h-4 a2 2 0 0 1 -2 -2 v-8 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 m-4 -10 v8 h4 v-8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 22
                moveTo(x = 24.0f, y = 22.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // m -4 -10
                moveToRelative(dx = -4.0f, dy = -10.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -8z
                verticalLineToRelative(dy = -8.0f)
                close()
            }
            // <rect width="2" height="28" x="12.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M8 26 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M4 8 v16 h4 V8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 26
                moveTo(x = 8.0f, y = 26.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // M 4 8
                moveTo(x = 4.0f, y = 8.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
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
        }.build().also { _distributeHorizontalRight = it }
    }

@Suppress("ObjectPropertyName")
private var _distributeHorizontalRight: ImageVector? = null
