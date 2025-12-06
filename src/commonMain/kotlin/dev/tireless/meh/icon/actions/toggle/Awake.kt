package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Awake: ImageVector
    get() {
        val current = _awake
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Awake",
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
            // <rect width="5" height="2" x="21.67" y="6.85" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.686926 8.8908615
                moveTo(x = 21.686926f, y = 8.8908615f)
                // l 3.535534 -3.535534
                lineToRelative(dx = 3.535534f, dy = -3.535534f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -3.535534 3.535534z
                lineToRelative(dx = -3.535534f, dy = 3.535534f)
                close()
            }
            // <rect width="5" height="2" x="25.04" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.04 15
                moveTo(x = 25.04f, y = 15.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // <rect width="2" height="5" x="23.15" y="21.67" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.692684 23.103724
                moveTo(x = 21.692684f, y = 23.103724f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 3.535534 3.535534
                lineToRelative(dx = 3.535534f, dy = 3.535534f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
                close()
            }
            // <rect width="2" height="5" x="15.0" y="25.04" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 25.04
                moveTo(x = 15.0f, y = 25.04f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="5" height="2" x="5.37" y="23.15" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.3964405 25.201832
                moveTo(x = 5.3964405f, y = 25.201832f)
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
            // <rect width="2" height="5" x="6.85" y="5.37" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.390682 6.8028955
                moveTo(x = 5.390682f, y = 6.8028955f)
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
        }.build().also { _awake = it }
    }

@Suppress("ObjectPropertyName")
private var _awake: ImageVector? = null
