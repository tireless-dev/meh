package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PricingContainer: ImageVector
    get() {
        val current = _pricingContainer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PricingContainer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 h-5 v2 h5 v24 h-5 v2 h5 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-5 18.52 c0 -4.62 -3.78 -5.14 -6.82 -5.56 C12.87 14.5 11 14.1 11 11.25 c0 -2.39 2.51 -3.24 4.65 -3.24 a6.8 6.8 0 0 1 5.57 2.63 l1.56 -1.26 A8.7 8.7 0 0 0 17 6.1 V3 h-2 v3.02 c-3.62 .22 -6 2.26 -6 5.22 0 4.73 3.83 5.26 6.91 5.69 3.25 .45 5.09 .84 5.09 3.58 0 3.03 -3.13 3.48 -5 3.48 -3.43 0 -4.88 -.96 -6.22 -2.63 l-1.56 1.26 c1.77 2.19 3.73 3.17 6.78 3.34 V29 h2 v-3.04 c3.73 -.3 6 -2.33 6 -5.44
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
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
                // m -5 18.52
                moveToRelative(dx = -5.0f, dy = 18.52f)
                // c 0 -4.62 -3.78 -5.14 -6.82 -5.56
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.62f,
                    dx2 = -3.78f,
                    dy2 = -5.14f,
                    dx3 = -6.82f,
                    dy3 = -5.56f,
                )
                // C 12.87 14.5 11 14.1 11 11.25
                curveTo(
                    x1 = 12.87f,
                    y1 = 14.5f,
                    x2 = 11.0f,
                    y2 = 14.1f,
                    x3 = 11.0f,
                    y3 = 11.25f,
                )
                // c 0 -2.39 2.51 -3.24 4.65 -3.24
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.39f,
                    dx2 = 2.51f,
                    dy2 = -3.24f,
                    dx3 = 4.65f,
                    dy3 = -3.24f,
                )
                // a 6.8 6.8 0 0 1 5.57 2.63
                arcToRelative(
                    a = 6.8f,
                    b = 6.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.57f,
                    dy1 = 2.63f,
                )
                // l 1.56 -1.26
                lineToRelative(dx = 1.56f, dy = -1.26f)
                // A 8.7 8.7 0 0 0 17 6.1
                arcTo(
                    horizontalEllipseRadius = 8.7f,
                    verticalEllipseRadius = 8.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 6.1f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3.02
                verticalLineToRelative(dy = 3.02f)
                // c -3.62 0.22 -6 2.26 -6 5.22
                curveToRelative(
                    dx1 = -3.62f,
                    dy1 = 0.22f,
                    dx2 = -6.0f,
                    dy2 = 2.26f,
                    dx3 = -6.0f,
                    dy3 = 5.22f,
                )
                // c 0 4.73 3.83 5.26 6.91 5.69
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.73f,
                    dx2 = 3.83f,
                    dy2 = 5.26f,
                    dx3 = 6.91f,
                    dy3 = 5.69f,
                )
                // c 3.25 0.45 5.09 0.84 5.09 3.58
                curveToRelative(
                    dx1 = 3.25f,
                    dy1 = 0.45f,
                    dx2 = 5.09f,
                    dy2 = 0.84f,
                    dx3 = 5.09f,
                    dy3 = 3.58f,
                )
                // c 0 3.03 -3.13 3.48 -5 3.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.03f,
                    dx2 = -3.13f,
                    dy2 = 3.48f,
                    dx3 = -5.0f,
                    dy3 = 3.48f,
                )
                // c -3.43 0 -4.88 -0.96 -6.22 -2.63
                curveToRelative(
                    dx1 = -3.43f,
                    dy1 = 0.0f,
                    dx2 = -4.88f,
                    dy2 = -0.96f,
                    dx3 = -6.22f,
                    dy3 = -2.63f,
                )
                // l -1.56 1.26
                lineToRelative(dx = -1.56f, dy = 1.26f)
                // c 1.77 2.19 3.73 3.17 6.78 3.34
                curveToRelative(
                    dx1 = 1.77f,
                    dy1 = 2.19f,
                    dx2 = 3.73f,
                    dy2 = 3.17f,
                    dx3 = 6.78f,
                    dy3 = 3.34f,
                )
                // V 29
                verticalLineTo(y = 29.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3.04
                verticalLineToRelative(dy = -3.04f)
                // c 3.73 -0.3 6 -2.33 6 -5.44
                curveToRelative(
                    dx1 = 3.73f,
                    dy1 = -0.3f,
                    dx2 = 6.0f,
                    dy2 = -2.33f,
                    dx3 = 6.0f,
                    dy3 = -5.44f,
                )
            }
            // M4 4 h5 V2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h5 v-2 H4z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 2
                verticalLineTo(y = 2.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
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
        }.build().also { _pricingContainer = it }
    }

@Suppress("ObjectPropertyName")
private var _pricingContainer: ImageVector? = null
