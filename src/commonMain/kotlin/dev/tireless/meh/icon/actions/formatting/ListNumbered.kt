package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListNumbered: ImageVector
    get() {
        val current = _listNumbered
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ListNumbered",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="14" height="2" x="16.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -14z
                horizontalLineToRelative(dx = -14.0f)
                close()
            }
            // <rect width="14" height="2" x="16.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -14z
                horizontalLineToRelative(dx = -14.0f)
                close()
            }
            // <polygon points="8.0 12.0 8.0 4.0 6.0 4.0 6.0 5.0 4.0 5.0 4.0 7.0 6.0 7.0 6.0 12.0 4.0 12.0 4.0 14.0 6.0 14.0 8.0 14.0 10.0 14.0 10.0 12.0 8.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // L 8 4
                lineTo(x = 8.0f, y = 4.0f)
                // L 6 4
                lineTo(x = 6.0f, y = 4.0f)
                // L 6 5
                lineTo(x = 6.0f, y = 5.0f)
                // L 4 5
                lineTo(x = 4.0f, y = 5.0f)
                // L 4 7
                lineTo(x = 4.0f, y = 7.0f)
                // L 6 7
                lineTo(x = 6.0f, y = 7.0f)
                // L 6 12
                lineTo(x = 6.0f, y = 12.0f)
                // L 4 12
                lineTo(x = 4.0f, y = 12.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
                // L 6 14
                lineTo(x = 6.0f, y = 14.0f)
                // L 8 14
                lineTo(x = 8.0f, y = 14.0f)
                // L 10 14
                lineTo(x = 10.0f, y = 14.0f)
                // L 10 12
                lineTo(x = 10.0f, y = 12.0f)
                // L 8 12z
                lineTo(x = 8.0f, y = 12.0f)
                close()
            }
            // M10 28 H4 v-4 a2 2 0 0 1 2 -2 h2 v-2 H4 v-2 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 H6 v2 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 28
                moveTo(x = 10.0f, y = 28.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _listNumbered = it }
    }

@Suppress("ObjectPropertyName")
private var _listNumbered: ImageVector? = null
