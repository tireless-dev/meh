package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArithmeticMean: ImageVector
    get() {
        val current = _arithmeticMean
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ArithmeticMean",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="24.0 9.0 22.0 9.0 16.0 17.5713 10.0 9.0 8.0 9.0 15.0 19.0 8.0 29.0 10.0 29.0 16.0 20.4287 22.0 29.0 24.0 29.0 17.0 19.0 24.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 9
                moveTo(x = 24.0f, y = 9.0f)
                // L 22 9
                lineTo(x = 22.0f, y = 9.0f)
                // L 16 17.5713
                lineTo(x = 16.0f, y = 17.5713f)
                // L 10 9
                lineTo(x = 10.0f, y = 9.0f)
                // L 8 9
                lineTo(x = 8.0f, y = 9.0f)
                // L 15 19
                lineTo(x = 15.0f, y = 19.0f)
                // L 8 29
                lineTo(x = 8.0f, y = 29.0f)
                // L 10 29
                lineTo(x = 10.0f, y = 29.0f)
                // L 16 20.4287
                lineTo(x = 16.0f, y = 20.4287f)
                // L 22 29
                lineTo(x = 22.0f, y = 29.0f)
                // L 24 29
                lineTo(x = 24.0f, y = 29.0f)
                // L 17 19
                lineTo(x = 17.0f, y = 19.0f)
                // L 24 9z
                lineTo(x = 24.0f, y = 9.0f)
                close()
            }
            // <rect width="16" height="2" x="8.0" y="3.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -16z
                horizontalLineToRelative(dx = -16.0f)
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
        }.build().also { _arithmeticMean = it }
    }

@Suppress("ObjectPropertyName")
private var _arithmeticMean: ImageVector? = null
