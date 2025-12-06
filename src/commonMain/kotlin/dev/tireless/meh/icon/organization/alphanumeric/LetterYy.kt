package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterYy: ImageVector
    get() {
        val current = _letterYy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LetterYy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="15.0 9.0 13.0 9.0 11.0 16.0 9.0 9.0 7.0 9.0 10.0 18.0 10.0 23.0 12.0 23.0 12.0 18.0 12.0 18.0 15.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // L 13 9
                lineTo(x = 13.0f, y = 9.0f)
                // L 11 16
                lineTo(x = 11.0f, y = 16.0f)
                // L 9 9
                lineTo(x = 9.0f, y = 9.0f)
                // L 7 9
                lineTo(x = 7.0f, y = 9.0f)
                // L 10 18
                lineTo(x = 10.0f, y = 18.0f)
                // L 10 23
                lineTo(x = 10.0f, y = 23.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // L 12 18
                lineTo(x = 12.0f, y = 18.0f)
                // L 15 9z
                lineTo(x = 15.0f, y = 9.0f)
                close()
            }
            // m23 13 -2 7.52 L19.08 13 H17 l3.15 9.87 L19.53 25 H17 v2 h2.26 a2 2 0 0 0 1.91 -1.42 L25 13Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 13
                moveTo(x = 23.0f, y = 13.0f)
                // l -2 7.52
                lineToRelative(dx = -2.0f, dy = 7.52f)
                // L 19.08 13
                lineTo(x = 19.08f, y = 13.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // l 3.15 9.87
                lineToRelative(dx = 3.15f, dy = 9.87f)
                // L 19.53 25
                lineTo(x = 19.53f, y = 25.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.26
                horizontalLineToRelative(dx = 2.26f)
                // a 2 2 0 0 0 1.91 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.91f,
                    dy1 = -1.42f,
                )
                // L 25 13z
                lineTo(x = 25.0f, y = 13.0f)
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
        }.build().also { _letterYy = it }
    }

@Suppress("ObjectPropertyName")
private var _letterYy: ImageVector? = null
