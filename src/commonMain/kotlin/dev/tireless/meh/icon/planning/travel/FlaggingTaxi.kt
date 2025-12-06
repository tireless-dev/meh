package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlaggingTaxi: ImageVector
    get() {
        val current = _flaggingTaxi
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlaggingTaxi",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m24.8 2 -4.44 6.66 a3 3 0 0 1 -2.5 1.34 H12 a3 3 0 0 0 -3 3 v6 a2 2 0 0 0 2 2 v7 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 V16 h-2 v12 h-4 v-9 h-2 v-6 a1 1 0 0 1 1 -1 h5.86 a5 5 0 0 0 4.16 -2.23 l4.44 -6.66Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.8 2
                moveTo(x = 24.8f, y = 2.0f)
                // l -4.44 6.66
                lineToRelative(dx = -4.44f, dy = 6.66f)
                // a 3 3 0 0 1 -2.5 1.34
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = 1.34f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 5.86
                horizontalLineToRelative(dx = 5.86f)
                // a 5 5 0 0 0 4.16 -2.23
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.16f,
                    dy1 = -2.23f,
                )
                // l 4.44 -6.66z
                lineToRelative(dx = 4.44f, dy = -6.66f)
                close()
            }
            // M11 5 a4 4 0 1 1 4 4 4 4 0 0 1 -4 -4 m2 0 a2 2 0 1 0 2 -2 2 2 0 0 0 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 5
                moveTo(x = 11.0f, y = 5.0f)
                // a 4 4 0 1 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // a 2 2 0 1 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
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
        }.build().also { _flaggingTaxi = it }
    }

@Suppress("ObjectPropertyName")
private var _flaggingTaxi: ImageVector? = null
