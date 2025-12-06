package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateClockwise: ImageVector
    get() {
        val current = _rotateClockwise
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RotateClockwise",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 30 H16 a2 2 0 0 1 -2 -2 V16 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 M16 16 v12 h12 V16Z M15 2 l-1.41 1.41 L16.17 6 H11 a7 7 0 0 0 -7 7 v5 h2 v-5 a5 5 0 0 1 5 -5 h5.17 l-2.58 2.59 L15 12 l5 -5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
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
                // V 16
                verticalLineTo(y = 16.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 16z
                verticalLineTo(y = 16.0f)
                close()
                // M 15 2
                moveTo(x = 15.0f, y = 2.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 16.17 6
                lineTo(x = 16.17f, y = 6.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 5.17
                horizontalLineToRelative(dx = 5.17f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
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
        }.build().also { _rotateClockwise = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateClockwise: ImageVector? = null
