package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CodeHide: ImageVector
    get() {
        val current = _codeHide
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CodeHide",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="17.713 13.471 19.576 6.518 17.645 6.0 16.08 11.838 17.713 13.471" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.713 13.471
                moveTo(x = 17.713f, y = 13.471f)
                // L 19.576 6.518
                lineTo(x = 19.576f, y = 6.518f)
                // L 17.645 6
                lineTo(x = 17.645f, y = 6.0f)
                // L 16.08 11.838
                lineTo(x = 16.08f, y = 11.838f)
                // L 17.713 13.471z
                lineTo(x = 17.713f, y = 13.471f)
                close()
            }
            // <polygon points="24.207 19.965 25.621 21.379 31.0 16.0 24.0 9.0 22.586 10.414 28.172 16.0 24.207 19.965" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.207 19.965
                moveTo(x = 24.207f, y = 19.965f)
                // L 25.621 21.379
                lineTo(x = 25.621f, y = 21.379f)
                // L 31 16
                lineTo(x = 31.0f, y = 16.0f)
                // L 24 9
                lineTo(x = 24.0f, y = 9.0f)
                // L 22.586 10.414
                lineTo(x = 22.586f, y = 10.414f)
                // L 28.172 16
                lineTo(x = 28.172f, y = 16.0f)
                // L 24.207 19.965z
                lineTo(x = 24.207f, y = 19.965f)
                close()
            }
            // <polygon points="30.0 28.586 3.414 2.0 2.0 3.414 7.793 9.207 1.0 16.0 8.0 23.0 9.414 21.586 3.828 16.0 9.207 10.621 14.884 16.298 12.423 25.482 14.355 26.0 16.517 17.931 28.586 30.0 30.0 28.586" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 28.586
                moveTo(x = 30.0f, y = 28.586f)
                // L 3.414 2
                lineTo(x = 3.414f, y = 2.0f)
                // L 2 3.414
                lineTo(x = 2.0f, y = 3.414f)
                // L 7.793 9.207
                lineTo(x = 7.793f, y = 9.207f)
                // L 1 16
                lineTo(x = 1.0f, y = 16.0f)
                // L 8 23
                lineTo(x = 8.0f, y = 23.0f)
                // L 9.414 21.586
                lineTo(x = 9.414f, y = 21.586f)
                // L 3.828 16
                lineTo(x = 3.828f, y = 16.0f)
                // L 9.207 10.621
                lineTo(x = 9.207f, y = 10.621f)
                // L 14.884 16.298
                lineTo(x = 14.884f, y = 16.298f)
                // L 12.423 25.482
                lineTo(x = 12.423f, y = 25.482f)
                // L 14.355 26
                lineTo(x = 14.355f, y = 26.0f)
                // L 16.517 17.931
                lineTo(x = 16.517f, y = 17.931f)
                // L 28.586 30
                lineTo(x = 28.586f, y = 30.0f)
                // L 30 28.586z
                lineTo(x = 30.0f, y = 28.586f)
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
        }.build().also { _codeHide = it }
    }

@Suppress("ObjectPropertyName")
private var _codeHide: ImageVector? = null
