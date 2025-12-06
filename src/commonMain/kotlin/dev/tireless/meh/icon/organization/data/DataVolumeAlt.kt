package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataVolumeAlt: ImageVector
    get() {
        val current = _dataVolumeAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataVolumeAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 29 a3 3 0 1 1 0 -6 3 3 0 0 1 0 6 m0 -4 a1 1 0 1 0 0 2 1 1 0 0 0 0 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 29
                moveTo(x = 25.0f, y = 29.0f)
                // a 3 3 0 1 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
            }
            // <circle cx="20.0" cy="21.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 21
                moveTo(x = 20.0f, y = 21.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M15 19 a3 3 0 1 1 0 -6 3 3 0 0 1 0 6 m0 -4 a1 1 0 1 0 0 2 1 1 0 0 0 0 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 19
                moveTo(x = 15.0f, y = 19.0f)
                // a 3 3 0 1 1 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 1 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
            }
            // M13 27 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h7.59 c.53 0 1.04 .2 1.41 .59 L16.41 7 H28 a2 2 0 0 1 2 2 v7 h-2 V9 H15.59 l-4 -4 H4 v20 h9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 13 27
                moveTo(x = 13.0f, y = 27.0f)
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
                // h 9z
                horizontalLineToRelative(dx = 9.0f)
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
        }.build().also { _dataVolumeAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _dataVolumeAlt: ImageVector? = null
