package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatsonMachineLearning: ImageVector
    get() {
        val current = _watsonMachineLearning
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WatsonMachineLearning",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 26 h-2 v-8.24 l-3.23 3.88 a1 1 0 0 1 -1.54 0 L12 17.76 V26 h-2 V15 a1 1 0 0 1 .66 -.94 1 1 0 0 1 1.11 .3 L16 19.44 l4.23 -5.08 a1 1 0 0 1 1.11 -.3 A1 1 0 0 1 22 15Z M4.16 14.65 l-3 -1.75 a.76 .76 0 1 0 -.76 1.32 l3 1.78 a.76 .76 0 1 0 .76 -1.31Z m4.13 -4.13 a.73 .73 0 0 0 1 .27 .75 .75 0 0 0 .28 -1 l-1.74 -3 a.76 .76 0 1 0 -1.32 .76Z M16 9 a.76 .76 0 0 0 .76 -.76 V4.76 a.76 .76 0 1 0 -1.52 0 v3.49 A.76 .76 0 0 0 16 9 m6.68 1.79 a1 1 0 0 0 .37 .11 .8 .8 0 0 0 .66 -.38 l1.75 -3 a.76 .76 0 0 0 -1.32 -.76 l-1.74 3 a.75 .75 0 0 0 .28 1.03 m9.22 2.39 a.76 .76 0 0 0 -1 -.28 l-3 1.75 A.76 .76 0 0 0 28.6 16 l3 -1.74 a.77 .77 0 0 0 .3 -1.08
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 26
                moveTo(x = 22.0f, y = 26.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8.24
                verticalLineToRelative(dy = -8.24f)
                // l -3.23 3.88
                lineToRelative(dx = -3.23f, dy = 3.88f)
                // a 1 1 0 0 1 -1.54 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.54f,
                    dy1 = 0.0f,
                )
                // L 12 17.76
                lineTo(x = 12.0f, y = 17.76f)
                // V 26
                verticalLineTo(y = 26.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 15
                verticalLineTo(y = 15.0f)
                // a 1 1 0 0 1 0.66 -0.94
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.66f,
                    dy1 = -0.94f,
                )
                // a 1 1 0 0 1 1.11 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.11f,
                    dy1 = 0.3f,
                )
                // L 16 19.44
                lineTo(x = 16.0f, y = 19.44f)
                // l 4.23 -5.08
                lineToRelative(dx = 4.23f, dy = -5.08f)
                // a 1 1 0 0 1 1.11 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.11f,
                    dy1 = -0.3f,
                )
                // A 1 1 0 0 1 22 15z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 15.0f,
                )
                close()
                // M 4.16 14.65
                moveTo(x = 4.16f, y = 14.65f)
                // l -3 -1.75
                lineToRelative(dx = -3.0f, dy = -1.75f)
                // a 0.76 0.76 0 1 0 -0.76 1.32
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -0.76f,
                    dy1 = 1.32f,
                )
                // l 3 1.78
                lineToRelative(dx = 3.0f, dy = 1.78f)
                // a 0.76 0.76 0 1 0 0.76 -1.31z
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.76f,
                    dy1 = -1.31f,
                )
                close()
                // m 4.13 -4.13
                moveToRelative(dx = 4.13f, dy = -4.13f)
                // a 0.73 0.73 0 0 0 1 0.27
                arcToRelative(
                    a = 0.73f,
                    b = 0.73f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.27f,
                )
                // a 0.75 0.75 0 0 0 0.28 -1
                arcToRelative(
                    a = 0.75f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.28f,
                    dy1 = -1.0f,
                )
                // l -1.74 -3
                lineToRelative(dx = -1.74f, dy = -3.0f)
                // a 0.76 0.76 0 1 0 -1.32 0.76z
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.32f,
                    dy1 = 0.76f,
                )
                close()
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // a 0.76 0.76 0 0 0 0.76 -0.76
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.76f,
                    dy1 = -0.76f,
                )
                // V 4.76
                verticalLineTo(y = 4.76f)
                // a 0.76 0.76 0 1 0 -1.52 0
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -1.52f,
                    dy1 = 0.0f,
                )
                // v 3.49
                verticalLineToRelative(dy = 3.49f)
                // A 0.76 0.76 0 0 0 16 9
                arcTo(
                    horizontalEllipseRadius = 0.76f,
                    verticalEllipseRadius = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 9.0f,
                )
                // m 6.68 1.79
                moveToRelative(dx = 6.68f, dy = 1.79f)
                // a 1 1 0 0 0 0.37 0.11
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.37f,
                    dy1 = 0.11f,
                )
                // a 0.8 0.8 0 0 0 0.66 -0.38
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.66f,
                    dy1 = -0.38f,
                )
                // l 1.75 -3
                lineToRelative(dx = 1.75f, dy = -3.0f)
                // a 0.76 0.76 0 0 0 -1.32 -0.76
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.32f,
                    dy1 = -0.76f,
                )
                // l -1.74 3
                lineToRelative(dx = -1.74f, dy = 3.0f)
                // a 0.75 0.75 0 0 0 0.28 1.03
                arcToRelative(
                    a = 0.75f,
                    b = 0.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.28f,
                    dy1 = 1.03f,
                )
                // m 9.22 2.39
                moveToRelative(dx = 9.22f, dy = 2.39f)
                // a 0.76 0.76 0 0 0 -1 -0.28
                arcToRelative(
                    a = 0.76f,
                    b = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -0.28f,
                )
                // l -3 1.75
                lineToRelative(dx = -3.0f, dy = 1.75f)
                // A 0.76 0.76 0 0 0 28.6 16
                arcTo(
                    horizontalEllipseRadius = 0.76f,
                    verticalEllipseRadius = 0.76f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.6f,
                    y1 = 16.0f,
                )
                // l 3 -1.74
                lineToRelative(dx = 3.0f, dy = -1.74f)
                // a 0.77 0.77 0 0 0 0.3 -1.08
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.3f,
                    dy1 = -1.08f,
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
        }.build().also { _watsonMachineLearning = it }
    }

@Suppress("ObjectPropertyName")
private var _watsonMachineLearning: ImageVector? = null
