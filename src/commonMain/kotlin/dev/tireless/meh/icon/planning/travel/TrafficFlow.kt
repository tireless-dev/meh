package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrafficFlow: ImageVector
    get() {
        val current = _trafficFlow
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TrafficFlow",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="26.0 8.0 22.0 4.0 18.0 8.0 19.41 9.42 21.0 7.83 21.0 18.0 23.0 18.0 23.0 7.83 24.58 9.41 26.0 8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 8
                moveTo(x = 26.0f, y = 8.0f)
                // L 22 4
                lineTo(x = 22.0f, y = 4.0f)
                // L 18 8
                lineTo(x = 18.0f, y = 8.0f)
                // L 19.41 9.42
                lineTo(x = 19.41f, y = 9.42f)
                // L 21 7.83
                lineTo(x = 21.0f, y = 7.83f)
                // L 21 18
                lineTo(x = 21.0f, y = 18.0f)
                // L 23 18
                lineTo(x = 23.0f, y = 18.0f)
                // L 23 7.83
                lineTo(x = 23.0f, y = 7.83f)
                // L 24.58 9.41
                lineTo(x = 24.58f, y = 9.41f)
                // L 26 8z
                lineTo(x = 26.0f, y = 8.0f)
                close()
            }
            // <polygon points="12.59 22.58 11.0 24.17 11.0 14.0 9.0 14.0 9.0 24.17 7.42 22.59 6.0 24.0 10.0 28.0 14.0 24.0 12.59 22.58" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.59 22.58
                moveTo(x = 12.59f, y = 22.58f)
                // L 11 24.17
                lineTo(x = 11.0f, y = 24.17f)
                // L 11 14
                lineTo(x = 11.0f, y = 14.0f)
                // L 9 14
                lineTo(x = 9.0f, y = 14.0f)
                // L 9 24.17
                lineTo(x = 9.0f, y = 24.17f)
                // L 7.42 22.59
                lineTo(x = 7.42f, y = 22.59f)
                // L 6 24
                lineTo(x = 6.0f, y = 24.0f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 14 24
                lineTo(x = 14.0f, y = 24.0f)
                // L 12.59 22.58z
                lineTo(x = 12.59f, y = 22.58f)
                close()
            }
            // <rect width="2" height="28" x="2.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 28
                verticalLineToRelative(dy = 28.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
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
            // <rect width="2" height="4" x="15.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="15.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 10
                moveTo(x = 15.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="15.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="15.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 26
                moveTo(x = 15.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
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
        }.build().also { _trafficFlow = it }
    }

@Suppress("ObjectPropertyName")
private var _trafficFlow: ImageVector? = null
