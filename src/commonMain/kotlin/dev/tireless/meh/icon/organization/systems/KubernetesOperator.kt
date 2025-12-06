package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KubernetesOperator: ImageVector
    get() {
        val current = _kubernetesOperator
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.KubernetesOperator",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M19 21 h-6 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-6 -8 v6 h6 v-6z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 21
                moveTo(x = 19.0f, y = 21.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // m -6 -8
                moveToRelative(dx = -6.0f, dy = -8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
            }
            // M30 16 c0 -7.72 -6.28 -14 -14 -14 S2 8.28 2 16 a14.02 14.02 0 0 0 21.7 11.7 3 3 0 0 0 4 -4 A14 14 0 0 0 30 16 M4 16 a12.01 12.01 0 1 1 22.23 6.27 3 3 0 0 0 -3.96 3.96 A12.01 12.01 0 0 1 4 16 m21 10 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 16
                moveTo(x = 30.0f, y = 16.0f)
                // c 0 -7.72 -6.28 -14 -14 -14
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.72f,
                    dx2 = -6.28f,
                    dy2 = -14.0f,
                    dx3 = -14.0f,
                    dy3 = -14.0f,
                )
                // S 2 8.28 2 16
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 8.28f,
                    x2 = 2.0f,
                    y2 = 16.0f,
                )
                // a 14.02 14.02 0 0 0 21.7 11.7
                arcToRelative(
                    a = 14.02f,
                    b = 14.02f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 21.7f,
                    dy1 = 11.7f,
                )
                // a 3 3 0 0 0 4 -4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // A 14 14 0 0 0 30 16
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 16.0f,
                )
                // M 4 16
                moveTo(x = 4.0f, y = 16.0f)
                // a 12.01 12.01 0 1 1 22.23 6.27
                arcToRelative(
                    a = 12.01f,
                    b = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 22.23f,
                    dy1 = 6.27f,
                )
                // a 3 3 0 0 0 -3.96 3.96
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.96f,
                    dy1 = 3.96f,
                )
                // A 12.01 12.01 0 0 1 4 16
                arcTo(
                    horizontalEllipseRadius = 12.01f,
                    verticalEllipseRadius = 12.01f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // m 21 10
                moveToRelative(dx = 21.0f, dy = 10.0f)
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
                // a 1 1 0 0 1 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
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
        }.build().also { _kubernetesOperator = it }
    }

@Suppress("ObjectPropertyName")
private var _kubernetesOperator: ImageVector? = null
