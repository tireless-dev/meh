package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PricingTraditional: ImageVector
    get() {
        val current = _pricingTraditional
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PricingTraditional",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 15.07 V8.12 a6.7 6.7 0 0 1 4.22 2.5 l1.56 -1.25 A8.7 8.7 0 0 0 17 6.1 V3 h-2 v3.02 c-3.62 .22 -6 2.26 -6 5.22 0 4.28 3.13 5.12 6 5.56 v7.16 c-2.72 -.18 -4.02 -1.1 -5.22 -2.59 l-1.56 1.26 c1.77 2.2 3.74 3.17 6.78 3.33 V29 h2 v-3.04 c3.73 -.3 6 -2.33 6 -5.44 0 -4.21 -3.14 -5.02 -6 -5.45 m-6 -3.83 c0 -2.15 2.03 -3.05 4 -3.21 v6.75 c-2.57 -.43 -4 -1.05 -4 -3.54 m6 12.71 V17.1 c2.57 .42 4 1 4 3.43 0 2.53 -2.19 3.26 -4 3.43
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 15.07
                moveTo(x = 17.0f, y = 15.07f)
                // V 8.12
                verticalLineTo(y = 8.12f)
                // a 6.7 6.7 0 0 1 4.22 2.5
                arcToRelative(
                    a = 6.7f,
                    b = 6.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.22f,
                    dy1 = 2.5f,
                )
                // l 1.56 -1.25
                lineToRelative(dx = 1.56f, dy = -1.25f)
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
                // c 0 4.28 3.13 5.12 6 5.56
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.28f,
                    dx2 = 3.13f,
                    dy2 = 5.12f,
                    dx3 = 6.0f,
                    dy3 = 5.56f,
                )
                // v 7.16
                verticalLineToRelative(dy = 7.16f)
                // c -2.72 -0.18 -4.02 -1.1 -5.22 -2.59
                curveToRelative(
                    dx1 = -2.72f,
                    dy1 = -0.18f,
                    dx2 = -4.02f,
                    dy2 = -1.1f,
                    dx3 = -5.22f,
                    dy3 = -2.59f,
                )
                // l -1.56 1.26
                lineToRelative(dx = -1.56f, dy = 1.26f)
                // c 1.77 2.2 3.74 3.17 6.78 3.33
                curveToRelative(
                    dx1 = 1.77f,
                    dy1 = 2.2f,
                    dx2 = 3.74f,
                    dy2 = 3.17f,
                    dx3 = 6.78f,
                    dy3 = 3.33f,
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
                // c 0 -4.21 -3.14 -5.02 -6 -5.45
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.21f,
                    dx2 = -3.14f,
                    dy2 = -5.02f,
                    dx3 = -6.0f,
                    dy3 = -5.45f,
                )
                // m -6 -3.83
                moveToRelative(dx = -6.0f, dy = -3.83f)
                // c 0 -2.15 2.03 -3.05 4 -3.21
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.15f,
                    dx2 = 2.03f,
                    dy2 = -3.05f,
                    dx3 = 4.0f,
                    dy3 = -3.21f,
                )
                // v 6.75
                verticalLineToRelative(dy = 6.75f)
                // c -2.57 -0.43 -4 -1.05 -4 -3.54
                curveToRelative(
                    dx1 = -2.57f,
                    dy1 = -0.43f,
                    dx2 = -4.0f,
                    dy2 = -1.05f,
                    dx3 = -4.0f,
                    dy3 = -3.54f,
                )
                // m 6 12.71
                moveToRelative(dx = 6.0f, dy = 12.71f)
                // V 17.1
                verticalLineTo(y = 17.1f)
                // c 2.57 0.42 4 1 4 3.43
                curveToRelative(
                    dx1 = 2.57f,
                    dy1 = 0.42f,
                    dx2 = 4.0f,
                    dy2 = 1.0f,
                    dx3 = 4.0f,
                    dy3 = 3.43f,
                )
                // c 0 2.53 -2.19 3.26 -4 3.43
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.53f,
                    dx2 = -2.19f,
                    dy2 = 3.26f,
                    dx3 = -4.0f,
                    dy3 = 3.43f,
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
        }.build().also { _pricingTraditional = it }
    }

@Suppress("ObjectPropertyName")
private var _pricingTraditional: ImageVector? = null
