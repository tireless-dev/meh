package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EventSchedule: ImageVector
    get() {
        val current = _eventSchedule
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.EventSchedule",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 30 a8 8 0 1 1 8 -8 8 8 0 0 1 -8 8 m0 -14 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 30
                moveTo(x = 21.0f, y = 30.0f)
                // a 8 8 0 1 1 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // a 8 8 0 0 1 -8 8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 8.0f,
                )
                // m 0 -14
                moveToRelative(dx = 0.0f, dy = -14.0f)
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
            // <polygon points="22.59 25.0 20.0 22.41 20.0 18.0 22.0 18.0 22.0 21.59 24.0 23.59 22.59 25.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.59 25
                moveTo(x = 22.59f, y = 25.0f)
                // L 20 22.41
                lineTo(x = 20.0f, y = 22.41f)
                // L 20 18
                lineTo(x = 20.0f, y = 18.0f)
                // L 22 18
                lineTo(x = 22.0f, y = 18.0f)
                // L 22 21.59
                lineTo(x = 22.0f, y = 21.59f)
                // L 24 23.59
                lineTo(x = 24.0f, y = 23.59f)
                // L 22.59 25z
                lineTo(x = 22.59f, y = 25.0f)
                close()
            }
            // M28 6 a2 2 0 0 0 -2 -2 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 v-2 H6 V6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v6 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 6
                moveTo(x = 28.0f, y = 6.0f)
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
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
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
        }.build().also { _eventSchedule = it }
    }

@Suppress("ObjectPropertyName")
private var _eventSchedule: ImageVector? = null
