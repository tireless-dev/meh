package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataSetEncryption: ImageVector
    get() {
        val current = _dataSetEncryption
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataSetEncryption",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 21.28 V20 a4 4 0 0 0 -8 0 v1.28 A2 2 0 0 0 20 23 v5 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -1 -1.72 M25 18 a2 2 0 0 1 2 2 v1 h-4 v-1 a2 2 0 0 1 2 -2 m3 10 h-6 v-5 h6z M16 2.13 A33 33 0 0 0 13 2 C7.7 2 2 3.25 2 6 v18 c0 2.75 5.7 4 11 4 q1.52 0 3 -.13 v-2.01 A30 30 0 0 1 13 26 c-5.85 0 -8.85 -1.46 -9 -2 v-3.57 C6.13 21.5 9.64 22 13 22 q1.52 0 3 -.13 v-2.01 A30 30 0 0 1 13 20 c-5.85 0 -8.85 -1.46 -9 -2 v-3.57 C6.13 15.5 9.64 16 13 16 q1.52 0 3 -.13 c4.25 -.4 8 -1.64 8 -3.87 V6 c0 -2.23 -3.75 -3.47 -8 -3.87 m6 9.86 c-.13 .45 -2.13 1.49 -6 1.87 A30 30 0 0 1 13 14 c-5.85 0 -8.85 -1.46 -9 -2 V8.43 C6.13 9.5 9.64 10 13 10 q1.5 0 3 -.14 a18 18 0 0 0 6 -1.43z m-6 -4.13 A30 30 0 0 1 13 8 C7.16 8 4.16 6.54 4 6.02 V6.01 C4.16 5.46 7.16 4 13 4 q1.65 0 3 .14 c3.84 .37 5.84 1.4 6 1.86 -.16 .46 -2.16 1.49 -6 1.86
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 21.28
                moveTo(x = 29.0f, y = 21.28f)
                // V 20
                verticalLineTo(y = 20.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // v 1.28
                verticalLineToRelative(dy = 1.28f)
                // A 2 2 0 0 0 20 23
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 23.0f,
                )
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 2 2 0 0 0 -1 -1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.72f,
                )
                // M 25 18
                moveTo(x = 25.0f, y = 18.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
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
                // m 3 10
                moveToRelative(dx = 3.0f, dy = 10.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 16 2.13
                moveTo(x = 16.0f, y = 2.13f)
                // A 33 33 0 0 0 13 2
                arcTo(
                    horizontalEllipseRadius = 33.0f,
                    verticalEllipseRadius = 33.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 2.0f,
                )
                // C 7.7 2 2 3.25 2 6
                curveTo(
                    x1 = 7.7f,
                    y1 = 2.0f,
                    x2 = 2.0f,
                    y2 = 3.25f,
                    x3 = 2.0f,
                    y3 = 6.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // c 0 2.75 5.7 4 11 4
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.75f,
                    dx2 = 5.7f,
                    dy2 = 4.0f,
                    dx3 = 11.0f,
                    dy3 = 4.0f,
                )
                // q 1.52 0 3 -0.13
                quadToRelative(
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.13f,
                )
                // v -2.01
                verticalLineToRelative(dy = -2.01f)
                // A 30 30 0 0 1 13 26
                arcTo(
                    horizontalEllipseRadius = 30.0f,
                    verticalEllipseRadius = 30.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 26.0f,
                )
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // C 6.13 21.5 9.64 22 13 22
                curveTo(
                    x1 = 6.13f,
                    y1 = 21.5f,
                    x2 = 9.64f,
                    y2 = 22.0f,
                    x3 = 13.0f,
                    y3 = 22.0f,
                )
                // q 1.52 0 3 -0.13
                quadToRelative(
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.13f,
                )
                // v -2.01
                verticalLineToRelative(dy = -2.01f)
                // A 30 30 0 0 1 13 20
                arcTo(
                    horizontalEllipseRadius = 30.0f,
                    verticalEllipseRadius = 30.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 20.0f,
                )
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // v -3.57
                verticalLineToRelative(dy = -3.57f)
                // C 6.13 15.5 9.64 16 13 16
                curveTo(
                    x1 = 6.13f,
                    y1 = 15.5f,
                    x2 = 9.64f,
                    y2 = 16.0f,
                    x3 = 13.0f,
                    y3 = 16.0f,
                )
                // q 1.52 0 3 -0.13
                quadToRelative(
                    dx1 = 1.52f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.13f,
                )
                // c 4.25 -0.4 8 -1.64 8 -3.87
                curveToRelative(
                    dx1 = 4.25f,
                    dy1 = -0.4f,
                    dx2 = 8.0f,
                    dy2 = -1.64f,
                    dx3 = 8.0f,
                    dy3 = -3.87f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // c 0 -2.23 -3.75 -3.47 -8 -3.87
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.23f,
                    dx2 = -3.75f,
                    dy2 = -3.47f,
                    dx3 = -8.0f,
                    dy3 = -3.87f,
                )
                // m 6 9.86
                moveToRelative(dx = 6.0f, dy = 9.86f)
                // c -0.13 0.45 -2.13 1.49 -6 1.87
                curveToRelative(
                    dx1 = -0.13f,
                    dy1 = 0.45f,
                    dx2 = -2.13f,
                    dy2 = 1.49f,
                    dx3 = -6.0f,
                    dy3 = 1.87f,
                )
                // A 30 30 0 0 1 13 14
                arcTo(
                    horizontalEllipseRadius = 30.0f,
                    verticalEllipseRadius = 30.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 14.0f,
                )
                // c -5.85 0 -8.85 -1.46 -9 -2
                curveToRelative(
                    dx1 = -5.85f,
                    dy1 = 0.0f,
                    dx2 = -8.85f,
                    dy2 = -1.46f,
                    dx3 = -9.0f,
                    dy3 = -2.0f,
                )
                // V 8.43
                verticalLineTo(y = 8.43f)
                // C 6.13 9.5 9.64 10 13 10
                curveTo(
                    x1 = 6.13f,
                    y1 = 9.5f,
                    x2 = 9.64f,
                    y2 = 10.0f,
                    x3 = 13.0f,
                    y3 = 10.0f,
                )
                // q 1.5 0 3 -0.14
                quadToRelative(
                    dx1 = 1.5f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -0.14f,
                )
                // a 18 18 0 0 0 6 -1.43z
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = -1.43f,
                )
                close()
                // m -6 -4.13
                moveToRelative(dx = -6.0f, dy = -4.13f)
                // A 30 30 0 0 1 13 8
                arcTo(
                    horizontalEllipseRadius = 30.0f,
                    verticalEllipseRadius = 30.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.0f,
                    y1 = 8.0f,
                )
                // C 7.16 8 4.16 6.54 4 6.02
                curveTo(
                    x1 = 7.16f,
                    y1 = 8.0f,
                    x2 = 4.16f,
                    y2 = 6.54f,
                    x3 = 4.0f,
                    y3 = 6.02f,
                )
                // V 6.01
                verticalLineTo(y = 6.01f)
                // C 4.16 5.46 7.16 4 13 4
                curveTo(
                    x1 = 4.16f,
                    y1 = 5.46f,
                    x2 = 7.16f,
                    y2 = 4.0f,
                    x3 = 13.0f,
                    y3 = 4.0f,
                )
                // q 1.65 0 3 0.14
                quadToRelative(
                    dx1 = 1.65f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 0.14f,
                )
                // c 3.84 0.37 5.84 1.4 6 1.86
                curveToRelative(
                    dx1 = 3.84f,
                    dy1 = 0.37f,
                    dx2 = 5.84f,
                    dy2 = 1.4f,
                    dx3 = 6.0f,
                    dy3 = 1.86f,
                )
                // c -0.16 0.46 -2.16 1.49 -6 1.86
                curveToRelative(
                    dx1 = -0.16f,
                    dy1 = 0.46f,
                    dx2 = -2.16f,
                    dy2 = 1.49f,
                    dx3 = -6.0f,
                    dy3 = 1.86f,
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
        }.build().also { _dataSetEncryption = it }
    }

@Suppress("ObjectPropertyName")
private var _dataSetEncryption: ImageVector? = null
