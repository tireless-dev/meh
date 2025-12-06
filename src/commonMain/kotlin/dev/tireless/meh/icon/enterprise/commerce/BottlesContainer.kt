package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BottlesContainer: ImageVector
    get() {
        val current = _bottlesContainer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BottlesContainer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 10 V8 a1 1 0 0 0 -1 -1 h-3 v2 h2 v1.97 s2 1.12 2 3.48 V23 h-4 v2 h5 a1 1 0 0 0 1 -1 v-9.55 c0 -1.71 -.72 -3.3 -2 -4.45 m-8 0 V8 a1 1 0 0 0 -1 -1 h-4 a1 1 0 0 0 -1 1 v2 a6 6 0 0 0 -2 4.45 V24 a1 1 0 0 0 1 1 h8 a1 1 0 0 0 1 -1 v-9.55 c0 -1.71 -.72 -3.3 -2 -4.45 m0 13 H9 v-8.55 c0 -2.36 2 -3.48 2 -3.48 V9 h2 v1.97 s2 1.12 2 3.48z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 10
                moveTo(x = 23.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 1.97
                verticalLineToRelative(dy = 1.97f)
                // s 2 1.12 2 3.48
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.12f,
                    dx2 = 2.0f,
                    dy2 = 3.48f,
                )
                // V 23
                verticalLineTo(y = 23.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -9.55
                verticalLineToRelative(dy = -9.55f)
                // c 0 -1.71 -0.72 -3.3 -2 -4.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.71f,
                    dx2 = -0.72f,
                    dy2 = -3.3f,
                    dx3 = -2.0f,
                    dy3 = -4.45f,
                )
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 6 6 0 0 0 -2 4.45
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 4.45f,
                )
                // V 24
                verticalLineTo(y = 24.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -9.55
                verticalLineToRelative(dy = -9.55f)
                // c 0 -1.71 -0.72 -3.3 -2 -4.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.71f,
                    dx2 = -0.72f,
                    dy2 = -3.3f,
                    dx3 = -2.0f,
                    dy3 = -4.45f,
                )
                // m 0 13
                moveToRelative(dx = 0.0f, dy = 13.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v -8.55
                verticalLineToRelative(dy = -8.55f)
                // c 0 -2.36 2 -3.48 2 -3.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.36f,
                    dx2 = 2.0f,
                    dy2 = -3.48f,
                    dx3 = 2.0f,
                    dy3 = -3.48f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 1.97
                verticalLineToRelative(dy = 1.97f)
                // s 2 1.12 2 3.48z
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.12f,
                    dx2 = 2.0f,
                    dy2 = 3.48f,
                )
                close()
            }
            // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H4 V4 h24z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 24z
                horizontalLineToRelative(dx = 24.0f)
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
        }.build().also { _bottlesContainer = it }
    }

@Suppress("ObjectPropertyName")
private var _bottlesContainer: ImageVector? = null
