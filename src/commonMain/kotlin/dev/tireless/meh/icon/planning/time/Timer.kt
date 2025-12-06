package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Timer: ImageVector
    get() {
        val current = _timer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Timer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="9" x="15.0" y="11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 11
                moveTo(x = 15.0f, y = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="6" height="2" x="13.0" y="2.0" fill="#000" style="fill:#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 2
                moveTo(x = 13.0f, y = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // m28 9 -1.42 -1.41 -2.25 2.25 a10.94 10.94 0 1 0 1.18 1.65Z M16 26 a9 9 0 1 1 9 -9 9 9 0 0 1 -9 9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 9
                moveTo(x = 28.0f, y = 9.0f)
                // l -1.42 -1.41
                lineToRelative(dx = -1.42f, dy = -1.41f)
                // l -2.25 2.25
                lineToRelative(dx = -2.25f, dy = 2.25f)
                // a 10.94 10.94 0 1 0 1.18 1.65z
                arcToRelative(
                    a = 10.94f,
                    b = 10.94f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.18f,
                    dy1 = 1.65f,
                )
                close()
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // a 9 9 0 1 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9 9 0 0 1 -9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 9.0f,
                )
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
        }.build().also { _timer = it }
    }

@Suppress("ObjectPropertyName")
private var _timer: ImageVector? = null
