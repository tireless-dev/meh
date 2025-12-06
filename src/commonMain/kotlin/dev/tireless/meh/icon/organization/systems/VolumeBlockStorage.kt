package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VolumeBlockStorage: ImageVector
    get() {
        val current = _volumeBlockStorage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VolumeBlockStorage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 21 h-7 v-7 h7Z m-5 -2 h3 v-3 h-3Z m5 11 h-7 v-7 h7Z m-5 -2 h3 v-3 h-3Z m14 -7 h-7 v-7 h7Z m-5 -2 h3 v-3 h-3Z m5 11 h-7 v-7 h7Z m-5 -2 h3 v-3 h-3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 21
                moveTo(x = 17.0f, y = 21.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 5 11
                moveToRelative(dx = 5.0f, dy = 11.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 14 -7
                moveToRelative(dx = 14.0f, dy = -7.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 5 11
                moveToRelative(dx = 5.0f, dy = 11.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
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
        }.build().also { _volumeBlockStorage = it }
    }

@Suppress("ObjectPropertyName")
private var _volumeBlockStorage: ImageVector? = null
