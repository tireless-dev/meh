package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IncreaseLevel: ImageVector
    get() {
        val current = _increaseLevel
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.IncreaseLevel",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="23.0 4.0 18.0 7.75 18.0 14.25 15.0 12.0 10.0 15.75 10.0 22.25 7.0 20.0 2.0 23.75 2.0 30.0 4.0 30.0 4.0 24.75 7.0 22.5 10.0 24.75 10.0 30.0 12.0 30.0 12.0 16.75 15.0 14.5 18.0 16.75 18.0 30.0 20.0 30.0 20.0 8.75 23.0 6.5 26.0 8.75 26.0 30.0 28.0 30.0 28.0 7.75 23.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 4
                moveTo(x = 23.0f, y = 4.0f)
                // L 18 7.75
                lineTo(x = 18.0f, y = 7.75f)
                // L 18 14.25
                lineTo(x = 18.0f, y = 14.25f)
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
                // L 10 15.75
                lineTo(x = 10.0f, y = 15.75f)
                // L 10 22.25
                lineTo(x = 10.0f, y = 22.25f)
                // L 7 20
                lineTo(x = 7.0f, y = 20.0f)
                // L 2 23.75
                lineTo(x = 2.0f, y = 23.75f)
                // L 2 30
                lineTo(x = 2.0f, y = 30.0f)
                // L 4 30
                lineTo(x = 4.0f, y = 30.0f)
                // L 4 24.75
                lineTo(x = 4.0f, y = 24.75f)
                // L 7 22.5
                lineTo(x = 7.0f, y = 22.5f)
                // L 10 24.75
                lineTo(x = 10.0f, y = 24.75f)
                // L 10 30
                lineTo(x = 10.0f, y = 30.0f)
                // L 12 30
                lineTo(x = 12.0f, y = 30.0f)
                // L 12 16.75
                lineTo(x = 12.0f, y = 16.75f)
                // L 15 14.5
                lineTo(x = 15.0f, y = 14.5f)
                // L 18 16.75
                lineTo(x = 18.0f, y = 16.75f)
                // L 18 30
                lineTo(x = 18.0f, y = 30.0f)
                // L 20 30
                lineTo(x = 20.0f, y = 30.0f)
                // L 20 8.75
                lineTo(x = 20.0f, y = 8.75f)
                // L 23 6.5
                lineTo(x = 23.0f, y = 6.5f)
                // L 26 8.75
                lineTo(x = 26.0f, y = 8.75f)
                // L 26 30
                lineTo(x = 26.0f, y = 30.0f)
                // L 28 30
                lineTo(x = 28.0f, y = 30.0f)
                // L 28 7.75
                lineTo(x = 28.0f, y = 7.75f)
                // L 23 4z
                lineTo(x = 23.0f, y = 4.0f)
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
        }.build().also { _increaseLevel = it }
    }

@Suppress("ObjectPropertyName")
private var _increaseLevel: ImageVector? = null
