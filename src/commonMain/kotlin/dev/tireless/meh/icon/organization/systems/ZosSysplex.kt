package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZosSysplex: ImageVector
    get() {
        val current = _zosSysplex
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ZosSysplex",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 14 h8 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H9 a2 2 0 0 0 -2 2 v3 H4 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h3 v3 a2 2 0 0 0 2 2 h9 v1 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-8 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v5 H9 v-3 h3 a2 2 0 0 0 2 -2 v-8 a2 2 0 0 0 -2 -2 H9 V7 h9 v5 a2 2 0 0 0 2 2 m1.41 14 L28 21.41 V28z m5.18 -8 L20 26.59 V20z m-16.04 -8 L4 18.55 V12z m-5.17 8 L12 13.38 V20z m16.03 -8 L28 5.41 V12z m5.18 -8 L20 10.59 V4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 14
                moveTo(x = 20.0f, y = 14.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // m 1.41 14
                moveToRelative(dx = 1.41f, dy = 14.0f)
                // L 28 21.41
                lineTo(x = 28.0f, y = 21.41f)
                // V 28z
                verticalLineTo(y = 28.0f)
                close()
                // m 5.18 -8
                moveToRelative(dx = 5.18f, dy = -8.0f)
                // L 20 26.59
                lineTo(x = 20.0f, y = 26.59f)
                // V 20z
                verticalLineTo(y = 20.0f)
                close()
                // m -16.04 -8
                moveToRelative(dx = -16.04f, dy = -8.0f)
                // L 4 18.55
                lineTo(x = 4.0f, y = 18.55f)
                // V 12z
                verticalLineTo(y = 12.0f)
                close()
                // m -5.17 8
                moveToRelative(dx = -5.17f, dy = 8.0f)
                // L 12 13.38
                lineTo(x = 12.0f, y = 13.38f)
                // V 20z
                verticalLineTo(y = 20.0f)
                close()
                // m 16.03 -8
                moveToRelative(dx = 16.03f, dy = -8.0f)
                // L 28 5.41
                lineTo(x = 28.0f, y = 5.41f)
                // V 12z
                verticalLineTo(y = 12.0f)
                close()
                // m 5.18 -8
                moveToRelative(dx = 5.18f, dy = -8.0f)
                // L 20 10.59
                lineTo(x = 20.0f, y = 10.59f)
                // V 4z
                verticalLineTo(y = 4.0f)
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
        }.build().also { _zosSysplex = it }
    }

@Suppress("ObjectPropertyName")
private var _zosSysplex: ImageVector? = null
