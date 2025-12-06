package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MachineLearningModel: ImageVector
    get() {
        val current = _machineLearningModel
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MachineLearningModel",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 19 a3 3 0 0 0 0 -6 3 3 0 0 0 -2.82 2 h-5.77 l7.3 -7.3 a3 3 0 1 0 -1.41 -1.41 l-8.3 8.3 V8 a2 2 0 0 1 2 -2 h2 V4 h-2 a4 4 0 0 0 -3 1.38 A4 4 0 0 0 12 4 h-1 c-4.96 0 -9 4.04 -9 9 v6 c0 4.96 4.04 9 9 9 h1 c1.2 0 2.27 -.54 3 -1.38 A4 4 0 0 0 18 28 h2 v-2 h-2 a2 2 0 0 1 -2 -2 v-6.59 l8.3 8.3 A3 3 0 1 0 27 24 a3 3 0 0 0 -1.29 .3 l-7.3 -7.3 h5.77 A3 3 0 0 0 27 19 m0 -4 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m0 -11 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m-13 8 h-2 v2 h2 v4 h-2 a3 3 0 0 0 -3 3 v2 h2 v-2 a1 1 0 0 1 1 -1 h2 v4 a2 2 0 0 1 -2 2 h-1 a7 7 0 0 1 -6.92 -6 H6 v-2 H4 v-4 h3 a3 3 0 0 0 3 -3 V9 H8 v2 a1 1 0 0 1 -1 1 H4.08 A7 7 0 0 1 11 6 h1 a2 2 0 0 1 2 2z m14 15 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 19
                moveTo(x = 27.0f, y = 19.0f)
                // a 3 3 0 0 0 0 -6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -6.0f,
                )
                // a 3 3 0 0 0 -2.82 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = 2.0f,
                )
                // h -5.77
                horizontalLineToRelative(dx = -5.77f)
                // l 7.3 -7.3
                lineToRelative(dx = 7.3f, dy = -7.3f)
                // a 3 3 0 1 0 -1.41 -1.41
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.41f,
                    dy1 = -1.41f,
                )
                // l -8.3 8.3
                lineToRelative(dx = -8.3f, dy = 8.3f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 4 4 0 0 0 -3 1.38
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 1.38f,
                )
                // A 4 4 0 0 0 12 4
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 4.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // c -4.96 0 -9 4.04 -9 9
                curveToRelative(
                    dx1 = -4.96f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = 4.04f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // c 0 4.96 4.04 9 9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.96f,
                    dx2 = 4.04f,
                    dy2 = 9.0f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 1.2 0 2.27 -0.54 3 -1.38
                curveToRelative(
                    dx1 = 1.2f,
                    dy1 = 0.0f,
                    dx2 = 2.27f,
                    dy2 = -0.54f,
                    dx3 = 3.0f,
                    dy3 = -1.38f,
                )
                // A 4 4 0 0 0 18 28
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 28.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v -6.59
                verticalLineToRelative(dy = -6.59f)
                // l 8.3 8.3
                lineToRelative(dx = 8.3f, dy = 8.3f)
                // A 3 3 0 1 0 27 24
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 24.0f,
                )
                // a 3 3 0 0 0 -1.29 0.3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.29f,
                    dy1 = 0.3f,
                )
                // l -7.3 -7.3
                lineToRelative(dx = -7.3f, dy = -7.3f)
                // h 5.77
                horizontalLineToRelative(dx = 5.77f)
                // A 3 3 0 0 0 27 19
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 19.0f,
                )
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // a 1 1 0 1 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // m 0 -11
                moveToRelative(dx = 0.0f, dy = -11.0f)
                // a 1 1 0 1 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // a 1 1 0 0 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // m -13 8
                moveToRelative(dx = -13.0f, dy = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 7 7 0 0 1 -6.92 -6
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.92f,
                    dy1 = -6.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // H 4.08
                horizontalLineTo(x = 4.08f)
                // A 7 7 0 0 1 11 6
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 6.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 14 15
                moveToRelative(dx = 14.0f, dy = 15.0f)
                // a 1 1 0 1 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _machineLearningModel = it }
    }

@Suppress("ObjectPropertyName")
private var _machineLearningModel: ImageVector? = null
