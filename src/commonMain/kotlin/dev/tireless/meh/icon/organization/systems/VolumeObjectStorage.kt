package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeObjectStorage: ImageVector
    get() {
        val current = _volumeObjectStorage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VolumeObjectStorage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 24 a3 3 0 0 0 -2.04 .81 l-4 -2.4 a2 2 0 0 0 0 -.82 l4 -2.4 a3.25 3.25 0 1 0 -.92 -1.78 l-4 2.4 a3 3 0 1 0 0 4.38 l4 2.4 L20 27 a3 3 0 1 0 3 -3 m0 -8 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1 m-9 7 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m9 5 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 24
                moveTo(x = 23.0f, y = 24.0f)
                // a 3 3 0 0 0 -2.04 0.81
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.04f,
                    dy1 = 0.81f,
                )
                // l -4 -2.4
                lineToRelative(dx = -4.0f, dy = -2.4f)
                // a 2 2 0 0 0 0 -0.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -0.82f,
                )
                // l 4 -2.4
                lineToRelative(dx = 4.0f, dy = -2.4f)
                // a 3.25 3.25 0 1 0 -0.92 -1.78
                arcToRelative(
                    a = 3.25f,
                    b = 3.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.92f,
                    dy1 = -1.78f,
                )
                // l -4 2.4
                lineToRelative(dx = -4.0f, dy = 2.4f)
                // a 3 3 0 1 0 0 4.38
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.38f,
                )
                // l 4 2.4
                lineToRelative(dx = 4.0f, dy = 2.4f)
                // L 20 27
                lineTo(x = 20.0f, y = 27.0f)
                // a 3 3 0 1 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // a 1 1 0 1 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // m -9 7
                moveToRelative(dx = -9.0f, dy = 7.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // m 9 5
                moveToRelative(dx = 9.0f, dy = 5.0f)
                // a 1 1 0 1 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
            }
            // M8 28 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h7.59 A2 2 0 0 1 13 4.59 L16.41 8 H28 a2 2 0 0 1 2 2 v8 h-2 v-8 H15.59 l-4 -4 H4 v20 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 28
                moveTo(x = 8.0f, y = 28.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // A 2 2 0 0 1 13 4.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 4.59f,
                )
                // L 16.41 8
                lineTo(x = 16.41f, y = 8.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
        }.build().also { _volumeObjectStorage = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeObjectStorage: ImageVector? = null
