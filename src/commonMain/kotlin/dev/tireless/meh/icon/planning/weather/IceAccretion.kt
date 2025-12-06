package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IceAccretion: ImageVector
    get() {
        val current = _iceAccretion
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.IceAccretion",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 2 a2 2 0 0 0 -2 2 v16 l1 2 1 -2 V4 h4 v10 l1 2 1 -2 V2Z m24 0 H14 v8 l1 2 1 -2 V4 h2 v13 l1 2 1 -2 V4 h4 v10 l1 2 1 -2 V4 h2 v20 l1 2 1 -2 V4 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 24 0
                moveToRelative(dx = 24.0f, dy = 0.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // l 1 2
                lineToRelative(dx = 1.0f, dy = 2.0f)
                // l 1 -2
                lineToRelative(dx = 1.0f, dy = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
            }
            // <polygon points="14.0 28.0 13.0 30.0 12.0 28.0 12.0 16.0 14.0 16.0 14.0 28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 28
                moveTo(x = 14.0f, y = 28.0f)
                // L 13 30
                lineTo(x = 13.0f, y = 30.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 16
                lineTo(x = 12.0f, y = 16.0f)
                // L 14 16
                lineTo(x = 14.0f, y = 16.0f)
                // L 14 28z
                lineTo(x = 14.0f, y = 28.0f)
                close()
            }
            // <polygon points="24.0 26.0 23.0 28.0 22.0 26.0 22.0 20.0 24.0 20.0 24.0 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 26
                moveTo(x = 24.0f, y = 26.0f)
                // L 23 28
                lineTo(x = 23.0f, y = 28.0f)
                // L 22 26
                lineTo(x = 22.0f, y = 26.0f)
                // L 22 20
                lineTo(x = 22.0f, y = 20.0f)
                // L 24 20
                lineTo(x = 24.0f, y = 20.0f)
                // L 24 26z
                lineTo(x = 24.0f, y = 26.0f)
                close()
            }
            // <polygon points="8.0 24.0 7.0 26.0 6.0 24.0 6.0 18.0 8.0 18.0 8.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 24
                moveTo(x = 8.0f, y = 24.0f)
                // L 7 26
                lineTo(x = 7.0f, y = 26.0f)
                // L 6 24
                lineTo(x = 6.0f, y = 24.0f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // L 8 18
                lineTo(x = 8.0f, y = 18.0f)
                // L 8 24z
                lineTo(x = 8.0f, y = 24.0f)
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
        }.build().also { _iceAccretion = it }
    }

@Suppress("ObjectPropertyName")
private var _iceAccretion: ImageVector? = null
