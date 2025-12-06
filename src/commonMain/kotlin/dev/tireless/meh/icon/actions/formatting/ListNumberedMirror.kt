package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ListNumberedMirror: ImageVector
    get() {
        val current = _listNumberedMirror
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ListNumberedMirror",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 28 h-6 v-4 a2 2 0 0 1 2 -2 h2 v-2 h-4 v-2 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v2 h4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 28
                moveTo(x = 28.0f, y = 28.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // <rect width="14" height="2" x="2.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -14z
                horizontalLineToRelative(dx = -14.0f)
                close()
            }
            // <polygon points="26.0 12.0 26.0 4.0 24.0 4.0 24.0 5.0 22.0 5.0 22.0 7.0 24.0 7.0 24.0 12.0 22.0 12.0 22.0 14.0 24.0 14.0 26.0 14.0 28.0 14.0 28.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 12
                moveTo(x = 26.0f, y = 12.0f)
                // L 26 4
                lineTo(x = 26.0f, y = 4.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 24 5
                lineTo(x = 24.0f, y = 5.0f)
                // L 22 5
                lineTo(x = 22.0f, y = 5.0f)
                // L 22 7
                lineTo(x = 22.0f, y = 7.0f)
                // L 24 7
                lineTo(x = 24.0f, y = 7.0f)
                // L 24 12
                lineTo(x = 24.0f, y = 12.0f)
                // L 22 12
                lineTo(x = 22.0f, y = 12.0f)
                // L 22 14
                lineTo(x = 22.0f, y = 14.0f)
                // L 24 14
                lineTo(x = 24.0f, y = 14.0f)
                // L 26 14
                lineTo(x = 26.0f, y = 14.0f)
                // L 28 14
                lineTo(x = 28.0f, y = 14.0f)
                // L 28 12z
                lineTo(x = 28.0f, y = 12.0f)
                close()
            }
            // <rect width="14" height="2" x="2.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -14z
                horizontalLineToRelative(dx = -14.0f)
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
        }.build().also { _listNumberedMirror = it }
    }

@Suppress("ObjectPropertyName")
private var _listNumberedMirror: ImageVector? = null
