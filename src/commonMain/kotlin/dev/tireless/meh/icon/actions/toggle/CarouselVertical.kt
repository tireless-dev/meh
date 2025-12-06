package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarouselVertical: ImageVector
    get() {
        val current = _carouselVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CarouselVertical",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 10 v12 a2 2 0 0 1 -2 2 H8 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 M8 22 h16 V10 H8Z m16 6 v4 h-2 v-4 H10 v4 H8 v-4 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 m0 -28 v4 a2 2 0 0 1 -2 2 H10 a2 2 0 0 1 -2 -2 V0 h2 v4 h12 V0Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 10
                moveTo(x = 26.0f, y = 10.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
                // m 16 6
                moveToRelative(dx = 16.0f, dy = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // m 0 -28
                moveToRelative(dx = 0.0f, dy = -28.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // V 0
                verticalLineTo(y = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 0z
                verticalLineTo(y = 0.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 32
                moveTo(x = 0.0f, y = 32.0f)
                // l -1.3987644E-6 -32
                lineToRelative(dx = -1.3987644E-6f, dy = -32.0f)
                // l 32 -1.3987644E-6
                lineToRelative(dx = 32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 32z
                lineToRelative(dx = 1.3987644E-6f, dy = 32.0f)
                close()
            }
        }.build().also { _carouselVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _carouselVertical: ImageVector? = null
