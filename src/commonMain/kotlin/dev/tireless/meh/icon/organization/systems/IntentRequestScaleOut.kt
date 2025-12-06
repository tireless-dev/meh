package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentRequestScaleOut: ImageVector
    get() {
        val current = _intentRequestScaleOut
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.IntentRequestScaleOut",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="19.0 20.4 20.4 19.0 28.0 26.6 28.0 20.0 30.0 20.0 30.0 30.0 20.0 30.0 20.0 28.0 26.6 28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 20.4
                moveTo(x = 19.0f, y = 20.4f)
                // L 20.4 19
                lineTo(x = 20.4f, y = 19.0f)
                // L 28 26.6
                lineTo(x = 28.0f, y = 26.6f)
                // L 28 20
                lineTo(x = 28.0f, y = 20.0f)
                // L 30 20
                lineTo(x = 30.0f, y = 20.0f)
                // L 30 30
                lineTo(x = 30.0f, y = 30.0f)
                // L 20 30
                lineTo(x = 20.0f, y = 30.0f)
                // L 20 28
                lineTo(x = 20.0f, y = 28.0f)
                // L 26.6 28z
                lineTo(x = 26.6f, y = 28.0f)
                close()
            }
            // <polygon points="13.0 20.4 11.6 19.0 4.0 26.6 4.0 20.0 2.0 20.0 2.0 30.0 12.0 30.0 12.0 28.0 5.4 28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 20.4
                moveTo(x = 13.0f, y = 20.4f)
                // L 11.6 19
                lineTo(x = 11.6f, y = 19.0f)
                // L 4 26.6
                lineTo(x = 4.0f, y = 26.6f)
                // L 4 20
                lineTo(x = 4.0f, y = 20.0f)
                // L 2 20
                lineTo(x = 2.0f, y = 20.0f)
                // L 2 30
                lineTo(x = 2.0f, y = 30.0f)
                // L 12 30
                lineTo(x = 12.0f, y = 30.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 5.4 28z
                lineTo(x = 5.4f, y = 28.0f)
                close()
            }
            // <polygon points="17.0 16.0 15.0 16.0 15.0 5.8 10.4 10.4 9.0 9.0 16.0 2.0 23.0 9.0 21.6 10.4 17.0 5.8" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 16
                moveTo(x = 17.0f, y = 16.0f)
                // L 15 16
                lineTo(x = 15.0f, y = 16.0f)
                // L 15 5.8
                lineTo(x = 15.0f, y = 5.8f)
                // L 10.4 10.4
                lineTo(x = 10.4f, y = 10.4f)
                // L 9 9
                lineTo(x = 9.0f, y = 9.0f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // L 23 9
                lineTo(x = 23.0f, y = 9.0f)
                // L 21.6 10.4
                lineTo(x = 21.6f, y = 10.4f)
                // L 17 5.8z
                lineTo(x = 17.0f, y = 5.8f)
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
        }.build().also { _intentRequestScaleOut = it }
    }

@Suppress("ObjectPropertyName")
private var _intentRequestScaleOut: ImageVector? = null
