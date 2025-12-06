package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrafficIncident: ImageVector
    get() {
        val current = _trafficIncident
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TrafficIncident",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // <rect width="6" height="2" x="11.314" y="11.514" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.485575 13.928214
                moveTo(x = 11.485575f, y = 13.928214f)
                // l 4.2426405 -4.2426405
                lineToRelative(dx = 4.2426405f, dy = -4.2426405f)
                // l 1.4142135 1.4142135
                lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
                // l -4.2426405 4.2426405z
                lineToRelative(dx = -4.2426405f, dy = 4.2426405f)
                close()
            }
            // m12.08 23.43 4.12 2.32 a2 2 0 0 0 2.38 -.33 l8.84 -8.84 a2 2 0 0 0 .33 -2.38 l-2.3 -4.14 1.8 -1.79 -1.42 -1.41 -1.42 1.41 -4.95 -4.95 a2 2 0 0 0 -2.82 0 L14.5 1.2 13.1 2.62 l2.12 2.12 -8.48 8.48 -2.12 -2.12 -1.42 1.41 2.12 2.13 a2 2 0 0 0 0 2.82 l4.95 4.95 -1.41 1.42 1.41 1.41Z M26 15.17 17.17 24 l-4.55 -2.52 10.86 -10.86Z m-16.44 3.7 1.42 -1.4 -1.42 -1.42 -1.4 1.41 -1.42 -1.41 L18.05 4.74 l1.41 1.41 -1.41 1.41 1.41 1.42 1.42 -1.42 1.41 1.42 -11.31 11.31Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.08 23.43
                moveTo(x = 12.08f, y = 23.43f)
                // l 4.12 2.32
                lineToRelative(dx = 4.12f, dy = 2.32f)
                // a 2 2 0 0 0 2.38 -0.33
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.38f,
                    dy1 = -0.33f,
                )
                // l 8.84 -8.84
                lineToRelative(dx = 8.84f, dy = -8.84f)
                // a 2 2 0 0 0 0.33 -2.38
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.33f,
                    dy1 = -2.38f,
                )
                // l -2.3 -4.14
                lineToRelative(dx = -2.3f, dy = -4.14f)
                // l 1.8 -1.79
                lineToRelative(dx = 1.8f, dy = -1.79f)
                // l -1.42 -1.41
                lineToRelative(dx = -1.42f, dy = -1.41f)
                // l -1.42 1.41
                lineToRelative(dx = -1.42f, dy = 1.41f)
                // l -4.95 -4.95
                lineToRelative(dx = -4.95f, dy = -4.95f)
                // a 2 2 0 0 0 -2.82 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 0.0f,
                )
                // L 14.5 1.2
                lineTo(x = 14.5f, y = 1.2f)
                // L 13.1 2.62
                lineTo(x = 13.1f, y = 2.62f)
                // l 2.12 2.12
                lineToRelative(dx = 2.12f, dy = 2.12f)
                // l -8.48 8.48
                lineToRelative(dx = -8.48f, dy = 8.48f)
                // l -2.12 -2.12
                lineToRelative(dx = -2.12f, dy = -2.12f)
                // l -1.42 1.41
                lineToRelative(dx = -1.42f, dy = 1.41f)
                // l 2.12 2.13
                lineToRelative(dx = 2.12f, dy = 2.13f)
                // a 2 2 0 0 0 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // l 4.95 4.95
                lineToRelative(dx = 4.95f, dy = 4.95f)
                // l -1.41 1.42
                lineToRelative(dx = -1.41f, dy = 1.42f)
                // l 1.41 1.41z
                lineToRelative(dx = 1.41f, dy = 1.41f)
                close()
                // M 26 15.17
                moveTo(x = 26.0f, y = 15.17f)
                // L 17.17 24
                lineTo(x = 17.17f, y = 24.0f)
                // l -4.55 -2.52
                lineToRelative(dx = -4.55f, dy = -2.52f)
                // l 10.86 -10.86z
                lineToRelative(dx = 10.86f, dy = -10.86f)
                close()
                // m -16.44 3.7
                moveToRelative(dx = -16.44f, dy = 3.7f)
                // l 1.42 -1.4
                lineToRelative(dx = 1.42f, dy = -1.4f)
                // l -1.42 -1.42
                lineToRelative(dx = -1.42f, dy = -1.42f)
                // l -1.4 1.41
                lineToRelative(dx = -1.4f, dy = 1.41f)
                // l -1.42 -1.41
                lineToRelative(dx = -1.42f, dy = -1.41f)
                // L 18.05 4.74
                lineTo(x = 18.05f, y = 4.74f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // l 1.41 1.42
                lineToRelative(dx = 1.41f, dy = 1.42f)
                // l 1.42 -1.42
                lineToRelative(dx = 1.42f, dy = -1.42f)
                // l 1.41 1.42
                lineToRelative(dx = 1.41f, dy = 1.42f)
                // l -11.31 11.31z
                lineToRelative(dx = -11.31f, dy = 11.31f)
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
        }.build().also { _trafficIncident = it }
    }

@Suppress("ObjectPropertyName")
private var _trafficIncident: ImageVector? = null
