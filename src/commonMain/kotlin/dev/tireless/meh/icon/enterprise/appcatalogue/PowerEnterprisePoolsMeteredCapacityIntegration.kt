package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PowerEnterprisePoolsMeteredCapacityIntegration: ImageVector
    get() {
        val current = _powerEnterprisePoolsMeteredCapacityIntegration
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PowerEnterprisePoolsMeteredCapacityIntegration",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16.02 30 A14.02 14.02 0 0 1 6.1 6.1 l1.42 1.42 A12 12 0 0 0 4.02 16 c0 3.21 1.26 6.22 3.53 8.48 a12 12 0 0 0 8.47 3.5 h.02 q2.03 0 3.88 -.65 l.66 1.89 a14 14 0 0 1 -4.54 .76z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.02 30
                moveTo(x = 16.02f, y = 30.0f)
                // A 14.02 14.02 0 0 1 6.1 6.1
                arcTo(
                    horizontalEllipseRadius = 14.02f,
                    verticalEllipseRadius = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.1f,
                    y1 = 6.1f,
                )
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // A 12 12 0 0 0 4.02 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.02f,
                    y1 = 16.0f,
                )
                // c 0 3.21 1.26 6.22 3.53 8.48
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.21f,
                    dx2 = 1.26f,
                    dy2 = 6.22f,
                    dx3 = 3.53f,
                    dy3 = 8.48f,
                )
                // a 12 12 0 0 0 8.47 3.5
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.47f,
                    dy1 = 3.5f,
                )
                // h 0.02
                horizontalLineToRelative(dx = 0.02f)
                // q 2.03 0 3.88 -0.65
                quadToRelative(
                    dx1 = 2.03f,
                    dy1 = 0.0f,
                    dx2 = 3.88f,
                    dy2 = -0.65f,
                )
                // l 0.66 1.89
                lineToRelative(dx = 0.66f, dy = 1.89f)
                // a 14 14 0 0 1 -4.54 0.76z
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.54f,
                    dy1 = 0.76f,
                )
                close()
            }
            // M15 16 h2 v4 h2 a2 2 0 0 1 2 2 v3 h-2 v-3 h-2 v3 h-2 v-3 h-2 v3 h-2 v-3 a2 2 0 0 1 2 -2 h2z m8 10 a1 1 0 1 1 0 2 1 1 0 1 1 0 -2 M9 4 a1 1 0 1 1 0 2 1 1 0 1 1 0 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 16
                moveTo(x = 15.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 8 10
                moveToRelative(dx = 8.0f, dy = 10.0f)
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
                // a 1 1 0 1 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
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
                // a 1 1 0 1 1 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
            }
            // M20.92 10.1 a5 5 0 0 0 -9.84 0 A4 4 0 0 0 12 18 h1 v-2 h-1 a2 2 0 0 1 0 -4 h1 v-1 a3 3 0 0 1 6 0 v1 h1 a2 2 0 0 1 0 4 h-1 v2 h1 a4 4 0 0 0 .92 -7.9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.92 10.1
                moveTo(x = 20.92f, y = 10.1f)
                // a 5 5 0 0 0 -9.84 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.84f,
                    dy1 = 0.0f,
                )
                // A 4 4 0 0 0 12 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 2 2 0 0 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 4 4 0 0 0 0.92 -7.9
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.92f,
                    dy1 = -7.9f,
                )
            }
            // m25.9 25.89 -1.41 -1.42 A12.01 12.01 0 0 0 12.13 4.63 l-.67 -1.88 A14.02 14.02 0 0 1 25.9 25.89
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.9 25.89
                moveTo(x = 25.9f, y = 25.89f)
                // l -1.41 -1.42
                lineToRelative(dx = -1.41f, dy = -1.42f)
                // A 12.01 12.01 0 0 0 12.13 4.63
                arcTo(
                    horizontalEllipseRadius = 12.01f,
                    verticalEllipseRadius = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.13f,
                    y1 = 4.63f,
                )
                // l -0.67 -1.88
                lineToRelative(dx = -0.67f, dy = -1.88f)
                // A 14.02 14.02 0 0 1 25.9 25.89
                arcTo(
                    horizontalEllipseRadius = 14.02f,
                    verticalEllipseRadius = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.9f,
                    y1 = 25.89f,
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
        }.build().also { _powerEnterprisePoolsMeteredCapacityIntegration = it }
    }

@Suppress("ObjectPropertyName")
private var _powerEnterprisePoolsMeteredCapacityIntegration: ImageVector? = null
