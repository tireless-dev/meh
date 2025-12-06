package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatsonxData: ImageVector
    get() {
        val current = _watsonxData
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WatsonxData",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 24 a2 2 0 0 0 -2 2 l.02 .22 a12.9 12.9 0 0 1 -15.48 .41 l.78 .05 A7.7 7.7 0 0 0 17 19 h-2 a5.68 5.68 0 0 1 -11.18 1.5 A5 5 0 0 0 11 16 v-2 H9 v2 a3 3 0 0 1 -6 0 q.01 -3.19 1.46 -6 L2.7 9.08 A15.02 15.02 0 0 0 25.2 27.83 2 2 0 0 0 28 26 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 24
                moveTo(x = 26.0f, y = 24.0f)
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
                // l 0.02 0.22
                lineToRelative(dx = 0.02f, dy = 0.22f)
                // a 12.9 12.9 0 0 1 -15.48 0.41
                arcToRelative(
                    a = 12.9f,
                    b = 12.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -15.48f,
                    dy1 = 0.41f,
                )
                // l 0.78 0.05
                lineToRelative(dx = 0.78f, dy = 0.05f)
                // A 7.7 7.7 0 0 0 17 19
                arcTo(
                    horizontalEllipseRadius = 7.7f,
                    verticalEllipseRadius = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 19.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 5.68 5.68 0 0 1 -11.18 1.5
                arcToRelative(
                    a = 5.68f,
                    b = 5.68f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -11.18f,
                    dy1 = 1.5f,
                )
                // A 5 5 0 0 0 11 16
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 16.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 3 3 0 0 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // q 0.01 -3.19 1.46 -6
                quadToRelative(
                    dx1 = 0.01f,
                    dy1 = -3.19f,
                    dx2 = 1.46f,
                    dy2 = -6.0f,
                )
                // L 2.7 9.08
                lineTo(x = 2.7f, y = 9.08f)
                // A 15.02 15.02 0 0 0 25.2 27.83
                arcTo(
                    horizontalEllipseRadius = 15.02f,
                    verticalEllipseRadius = 15.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.2f,
                    y1 = 27.83f,
                )
                // A 2 2 0 0 0 28 26
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 26.0f,
                )
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
            }
            // <rect width="2" height="2" x="21.0" y="21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 21
                moveTo(x = 23.0f, y = 21.0f)
                // l -8.742278E-8 2
                lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
                // l -2 -8.742278E-8
                lineToRelative(dx = -2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 -2z
                lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="15.0" y="15.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 14.999999
                moveTo(x = 17.0f, y = 14.999999f)
                // l -8.742278E-8 2
                lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
                // l -2 -8.742278E-8
                lineToRelative(dx = -2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 -2z
                lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
                close()
            }
            // <rect width="2" height="2" x="9.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // l -8.742278E-8 -2
                lineToRelative(dx = -8.742278E-8f, dy = -2.0f)
                // l 2 -8.742278E-8
                lineToRelative(dx = 2.0f, dy = -8.742278E-8f)
                // l 8.742278E-8 2z
                lineToRelative(dx = 8.742278E-8f, dy = 2.0f)
                close()
            }
            // M16 1 a15 15 0 0 0 -9.2 3.17 A2 2 0 0 0 4 6 a2 2 0 1 0 4 0 L7.98 5.78 a12.9 12.9 0 0 1 15.47 -.42 l-.76 -.04 A7.7 7.7 0 0 0 15.02 13 h2 a5.68 5.68 0 0 1 10.6 -2.81 13 13 0 0 1 .56 1.32 A5 5 0 0 0 21 16 v2 h2 v-2 a3 3 0 0 1 6 0 q-.01 3.19 -1.46 6 l1.77 .92 A15.02 15.02 0 0 0 16 1
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 1
                moveTo(x = 16.0f, y = 1.0f)
                // a 15 15 0 0 0 -9.2 3.17
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.2f,
                    dy1 = 3.17f,
                )
                // A 2 2 0 0 0 4 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 6.0f,
                )
                // a 2 2 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // L 7.98 5.78
                lineTo(x = 7.98f, y = 5.78f)
                // a 12.9 12.9 0 0 1 15.47 -0.42
                arcToRelative(
                    a = 12.9f,
                    b = 12.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 15.47f,
                    dy1 = -0.42f,
                )
                // l -0.76 -0.04
                lineToRelative(dx = -0.76f, dy = -0.04f)
                // A 7.7 7.7 0 0 0 15.02 13
                arcTo(
                    horizontalEllipseRadius = 7.7f,
                    verticalEllipseRadius = 7.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.02f,
                    y1 = 13.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5.68 5.68 0 0 1 10.6 -2.81
                arcToRelative(
                    a = 5.68f,
                    b = 5.68f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.6f,
                    dy1 = -2.81f,
                )
                // a 13 13 0 0 1 0.56 1.32
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.56f,
                    dy1 = 1.32f,
                )
                // A 5 5 0 0 0 21 16
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 16.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // q -0.01 3.19 -1.46 6
                quadToRelative(
                    dx1 = -0.01f,
                    dy1 = 3.19f,
                    dx2 = -1.46f,
                    dy2 = 6.0f,
                )
                // l 1.77 0.92
                lineToRelative(dx = 1.77f, dy = 0.92f)
                // A 15.02 15.02 0 0 0 16 1
                arcTo(
                    horizontalEllipseRadius = 15.02f,
                    verticalEllipseRadius = 15.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 1.0f,
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
        }.build().also { _watsonxData = it }
    }

@Suppress("ObjectPropertyName")
private var _watsonxData: ImageVector? = null
