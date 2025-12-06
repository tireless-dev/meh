package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BusinessProcesses: ImageVector
    get() {
        val current = _businessProcesses
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BusinessProcesses",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 31 h-.03 a1 1 0 0 1 -.91 -.66 l-3.14 -8.62 -2 4.67 A1 1 0 0 1 16 27 h-4 v-2 h3.34 l2.74 -6.4 a1 1 0 0 1 1.86 .05 l3.14 8.63 2 -4.67 A1 1 0 0 1 26 22 h4 v2 h-3.34 l-2.74 6.4 A1 1 0 0 1 23 31
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 31
                moveTo(x = 23.0f, y = 31.0f)
                // h -0.03
                horizontalLineToRelative(dx = -0.03f)
                // a 1 1 0 0 1 -0.91 -0.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.91f,
                    dy1 = -0.66f,
                )
                // l -3.14 -8.62
                lineToRelative(dx = -3.14f, dy = -8.62f)
                // l -2 4.67
                lineToRelative(dx = -2.0f, dy = 4.67f)
                // A 1 1 0 0 1 16 27
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 27.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3.34
                horizontalLineToRelative(dx = 3.34f)
                // l 2.74 -6.4
                lineToRelative(dx = 2.74f, dy = -6.4f)
                // a 1 1 0 0 1 1.86 0.05
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.86f,
                    dy1 = 0.05f,
                )
                // l 3.14 8.63
                lineToRelative(dx = 3.14f, dy = 8.63f)
                // l 2 -4.67
                lineToRelative(dx = 2.0f, dy = -4.67f)
                // A 1 1 0 0 1 26 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.0f,
                    y1 = 22.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3.34
                horizontalLineToRelative(dx = -3.34f)
                // l -2.74 6.4
                lineToRelative(dx = -2.74f, dy = 6.4f)
                // A 1 1 0 0 1 23 31
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.0f,
                    y1 = 31.0f,
                )
            }
            // M9 25 H4 V10 h24 v9 h2 v-9 a2 2 0 0 0 -2 -2 h-6 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v4 H4 a2 2 0 0 0 -2 2 v15 a2 2 0 0 0 2 2 h5z m3 -21 h8 v4 h-8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 25
                moveTo(x = 9.0f, y = 25.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
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
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v 15
                verticalLineToRelative(dy = 15.0f)
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
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // m 3 -21
                moveToRelative(dx = 3.0f, dy = -21.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _businessProcesses = it }
    }

@Suppress("ObjectPropertyName")
private var _businessProcesses: ImageVector? = null
