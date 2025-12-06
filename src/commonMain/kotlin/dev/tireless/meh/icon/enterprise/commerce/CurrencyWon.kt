package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CurrencyWon: ImageVector
    get() {
        val current = _currencyWon
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CurrencyWon",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="28.0 14.0 28.0 12.0 23.045 12.0 24.0 5.0 22.0 5.0 20.0 23.0 17.0 8.0 15.0 8.0 12.0 23.0 10.0 5.0 8.0 5.0 8.955 12.0 4.0 12.0 4.0 14.0 9.227 14.0 9.636 17.0 4.0 17.0 4.0 19.0 9.909 19.0 11.0 27.0 13.0 27.0 16.0 12.0 19.0 27.0 21.0 27.0 22.091 19.0 28.0 19.0 28.0 17.0 22.364 17.0 22.773 14.0 28.0 14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 14
                moveTo(x = 28.0f, y = 14.0f)
                // L 28 12
                lineTo(x = 28.0f, y = 12.0f)
                // L 23.045 12
                lineTo(x = 23.045f, y = 12.0f)
                // L 24 5
                lineTo(x = 24.0f, y = 5.0f)
                // L 22 5
                lineTo(x = 22.0f, y = 5.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 10 5
                lineTo(x = 10.0f, y = 5.0f)
                // L 8 5
                lineTo(x = 8.0f, y = 5.0f)
                // L 8.955 12
                lineTo(x = 8.955f, y = 12.0f)
                // L 4 12
                lineTo(x = 4.0f, y = 12.0f)
                // L 4 14
                lineTo(x = 4.0f, y = 14.0f)
                // L 9.227 14
                lineTo(x = 9.227f, y = 14.0f)
                // L 9.636 17
                lineTo(x = 9.636f, y = 17.0f)
                // L 4 17
                lineTo(x = 4.0f, y = 17.0f)
                // L 4 19
                lineTo(x = 4.0f, y = 19.0f)
                // L 9.909 19
                lineTo(x = 9.909f, y = 19.0f)
                // L 11 27
                lineTo(x = 11.0f, y = 27.0f)
                // L 13 27
                lineTo(x = 13.0f, y = 27.0f)
                // L 16 12
                lineTo(x = 16.0f, y = 12.0f)
                // L 19 27
                lineTo(x = 19.0f, y = 27.0f)
                // L 21 27
                lineTo(x = 21.0f, y = 27.0f)
                // L 22.091 19
                lineTo(x = 22.091f, y = 19.0f)
                // L 28 19
                lineTo(x = 28.0f, y = 19.0f)
                // L 28 17
                lineTo(x = 28.0f, y = 17.0f)
                // L 22.364 17
                lineTo(x = 22.364f, y = 17.0f)
                // L 22.773 14
                lineTo(x = 22.773f, y = 14.0f)
                // L 28 14z
                lineTo(x = 28.0f, y = 14.0f)
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
        }.build().also { _currencyWon = it }
    }

@Suppress("ObjectPropertyName")
private var _currencyWon: ImageVector? = null
