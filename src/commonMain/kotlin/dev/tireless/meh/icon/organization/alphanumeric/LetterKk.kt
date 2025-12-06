package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterKk: ImageVector
    get() {
        val current = _letterKk
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LetterKk",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="15.0 9.0 12.89 9.0 9.0 15.55 9.0 9.0 7.0 9.0 7.0 23.0 9.0 23.0 9.0 18.71 9.93 17.22 12.89 23.0 15.0 23.0 11.11 15.43 15.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // L 12.89 9
                lineTo(x = 12.89f, y = 9.0f)
                // L 9 15.55
                lineTo(x = 9.0f, y = 15.55f)
                // L 9 9
                lineTo(x = 9.0f, y = 9.0f)
                // L 7 9
                lineTo(x = 7.0f, y = 9.0f)
                // L 7 23
                lineTo(x = 7.0f, y = 23.0f)
                // L 9 23
                lineTo(x = 9.0f, y = 23.0f)
                // L 9 18.71
                lineTo(x = 9.0f, y = 18.71f)
                // L 9.93 17.22
                lineTo(x = 9.93f, y = 17.22f)
                // L 12.89 23
                lineTo(x = 12.89f, y = 23.0f)
                // L 15 23
                lineTo(x = 15.0f, y = 23.0f)
                // L 11.11 15.43
                lineTo(x = 11.11f, y = 15.43f)
                // L 15 9z
                lineTo(x = 15.0f, y = 9.0f)
                close()
            }
            // <polygon points="22.78 23.0 25.0 23.0 21.22 17.0 25.0 13.0 22.76 13.0 19.0 17.17 19.0 9.0 17.0 9.0 17.0 23.0 19.0 23.0 19.0 19.25 19.96 18.21 22.78 23.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.78 23
                moveTo(x = 22.78f, y = 23.0f)
                // L 25 23
                lineTo(x = 25.0f, y = 23.0f)
                // L 21.22 17
                lineTo(x = 21.22f, y = 17.0f)
                // L 25 13
                lineTo(x = 25.0f, y = 13.0f)
                // L 22.76 13
                lineTo(x = 22.76f, y = 13.0f)
                // L 19 17.17
                lineTo(x = 19.0f, y = 17.17f)
                // L 19 9
                lineTo(x = 19.0f, y = 9.0f)
                // L 17 9
                lineTo(x = 17.0f, y = 9.0f)
                // L 17 23
                lineTo(x = 17.0f, y = 23.0f)
                // L 19 23
                lineTo(x = 19.0f, y = 23.0f)
                // L 19 19.25
                lineTo(x = 19.0f, y = 19.25f)
                // L 19.96 18.21
                lineTo(x = 19.96f, y = 18.21f)
                // L 22.78 23z
                lineTo(x = 22.78f, y = 23.0f)
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
        }.build().also { _letterKk = it }
    }

@Suppress("ObjectPropertyName")
private var _letterKk: ImageVector? = null
