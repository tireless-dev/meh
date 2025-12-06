package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light: ImageVector
    get() {
        val current = _light
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Light",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="5" x="15.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="5" height="2" x="21.668" y="6.854" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.687681 8.899519
                moveTo(x = 21.687681f, y = 8.899519f)
                // l 3.535534 -3.535534
                lineToRelative(dx = 3.535534f, dy = -3.535534f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -3.535534 3.535534z
                lineToRelative(dx = -3.535534f, dy = 3.535534f)
                close()
            }
            // <rect width="5" height="2" x="25.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 15
                moveTo(x = 25.0f, y = 15.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // <rect width="2" height="5" x="23.147" y="21.668" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.687681 23.100895
                moveTo(x = 21.687681f, y = 23.100895f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 3.535534 3.535534
                lineToRelative(dx = 3.535534f, dy = 3.535534f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
                close()
            }
            // <rect width="2" height="5" x="15.0" y="25.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 25
                moveTo(x = 15.0f, y = 25.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="5" height="2" x="5.375" y="23.147" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.39439 25.191809
                moveTo(x = 5.39439f, y = 25.191809f)
                // l 3.535534 -3.535534
                lineToRelative(dx = 3.535534f, dy = -3.535534f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -3.535534 3.535534z
                lineToRelative(dx = -3.535534f, dy = 3.535534f)
                close()
            }
            // <rect width="5" height="2" x="2.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // <rect width="2" height="5" x="6.854" y="5.375" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.3946834 6.8078966
                moveTo(x = 5.3946834f, y = 6.8078966f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 3.535534 3.535534
                lineToRelative(dx = 3.535534f, dy = 3.535534f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
                close()
            }
            // M16 12 a4 4 0 1 1 -4 4 4 4 0 0 1 4 -4 m0 -2 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // a 4 4 0 1 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 6 6 0 1 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // a 6 6 0 0 0 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
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
        }.build().also { _light = it }
    }

@Suppress("ObjectPropertyName")
private var _light: ImageVector? = null
