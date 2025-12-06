package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionBearRight02: ImageVector
    get() {
        val current = _directionBearRight02
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DirectionBearRight02",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 4 v2 h6.59 l-6.54 6.54 A7 7 0 0 0 14 17.49 V28 h2 V17.49 a5 5 0 0 1 1.46 -3.54 L24 7.41 V14 h2 V4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 4
                moveTo(x = 16.0f, y = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6.59
                horizontalLineToRelative(dx = 6.59f)
                // l -6.54 6.54
                lineToRelative(dx = -6.54f, dy = 6.54f)
                // A 7 7 0 0 0 14 17.49
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 17.49f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 17.49
                verticalLineTo(y = 17.49f)
                // a 5 5 0 0 1 1.46 -3.54
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.46f,
                    dy1 = -3.54f,
                )
                // L 24 7.41
                lineTo(x = 24.0f, y = 7.41f)
                // V 14
                verticalLineTo(y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // <rect width="2" height="8" x="8.5" y="5.55" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5.9998217 7.4140353
                moveTo(x = 5.9998217f, y = 7.4140353f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 5.656854 5.656854
                lineToRelative(dx = 5.656854f, dy = 5.656854f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
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
        }.build().also { _directionBearRight02 = it }
    }

@Suppress("ObjectPropertyName")
private var _directionBearRight02: ImageVector? = null
