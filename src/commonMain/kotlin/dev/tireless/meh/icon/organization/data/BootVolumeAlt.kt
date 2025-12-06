package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BootVolumeAlt: ImageVector
    get() {
        val current = _bootVolumeAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BootVolumeAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 30 h-7 a2 2 0 0 1 -2 -2 v-2 h2 v2 h7 v-7 h-2 v-2 h2 a2 2 0 0 1 2 2 v7 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 30
                moveTo(x = 26.0f, y = 30.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
            }
            // <polygon points="12.0 24.0 14.0 24.0 13.9998 17.414 22.5823 26.0 24.0 24.5857 15.4139 15.9998 22.0 16.0 22.0 14.0 12.0 14.0 12.0 24.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 24
                moveTo(x = 12.0f, y = 24.0f)
                // L 14 24
                lineTo(x = 14.0f, y = 24.0f)
                // L 13.9998 17.414
                lineTo(x = 13.9998f, y = 17.414f)
                // L 22.5823 26
                lineTo(x = 22.5823f, y = 26.0f)
                // L 24 24.5857
                lineTo(x = 24.0f, y = 24.5857f)
                // L 15.4139 15.9998
                lineTo(x = 15.4139f, y = 15.9998f)
                // L 22 16
                lineTo(x = 22.0f, y = 16.0f)
                // L 22 14
                lineTo(x = 22.0f, y = 14.0f)
                // L 12 14
                lineTo(x = 12.0f, y = 14.0f)
                // L 12 24z
                lineTo(x = 12.0f, y = 24.0f)
                close()
            }
            // M8 27 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h7.59 c.53 0 1.04 .2 1.41 .59 L16.41 7 H28 a2 2 0 0 1 2 2 v7 h-2 V9 H15.59 l-4 -4 H4 v20 h4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 27
                moveTo(x = 8.0f, y = 27.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 7.59
                horizontalLineToRelative(dx = 7.59f)
                // c 0.53 0 1.04 0.2 1.41 0.59
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = 0.0f,
                    dx2 = 1.04f,
                    dy2 = 0.2f,
                    dx3 = 1.41f,
                    dy3 = 0.59f,
                )
                // L 16.41 7
                lineTo(x = 16.41f, y = 7.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // H 15.59
                horizontalLineTo(x = 15.59f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _bootVolumeAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _bootVolumeAlt: ImageVector? = null
