package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tornado: ImageVector
    get() {
        val current = _tornado
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Tornado",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="4" height="2" x="16.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 26
                moveTo(x = 16.0f, y = 26.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="6" height="2" x="12.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="10" height="2" x="8.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // <rect width="12" height="2" x="8.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // <rect width="14" height="2" x="10.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -14z
                horizontalLineToRelative(dx = -14.0f)
                close()
            }
            // <rect width="18" height="2" x="8.0" y="6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -18z
                horizontalLineToRelative(dx = -18.0f)
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
        }.build().also { _tornado = it }
    }

@Suppress("ObjectPropertyName")
private var _tornado: ImageVector? = null
