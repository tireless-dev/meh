package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KubernetesControlPlaneNode: ImageVector
    get() {
        val current = _kubernetesControlPlaneNode
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.KubernetesControlPlaneNode",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22.95 20 h-2.18 a3 3 0 0 0 -2.82 -2 3 3 0 0 0 -2.81 2 H8.95 v2 h6.19 a3 3 0 0 0 2.81 2 3 3 0 0 0 2.82 -2 h2.18z m-5 2 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m5 -10 h-6.18 a3 3 0 0 0 -2.82 -2 3 3 0 0 0 -2.81 2 H8.95 v2 h2.19 a3 3 0 0 0 2.81 2 3 3 0 0 0 2.82 -2 h6.18z m-9 2 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.95 20
                moveTo(x = 22.95f, y = 20.0f)
                // h -2.18
                horizontalLineToRelative(dx = -2.18f)
                // a 3 3 0 0 0 -2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = -2.0f,
                )
                // a 3 3 0 0 0 -2.81 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.81f,
                    dy1 = 2.0f,
                )
                // H 8.95
                horizontalLineTo(x = 8.95f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6.19
                horizontalLineToRelative(dx = 6.19f)
                // a 3 3 0 0 0 2.81 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.81f,
                    dy1 = 2.0f,
                )
                // a 3 3 0 0 0 2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = -2.0f,
                )
                // h 2.18z
                horizontalLineToRelative(dx = 2.18f)
                close()
                // m -5 2
                moveToRelative(dx = -5.0f, dy = 2.0f)
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
                // m 5 -10
                moveToRelative(dx = 5.0f, dy = -10.0f)
                // h -6.18
                horizontalLineToRelative(dx = -6.18f)
                // a 3 3 0 0 0 -2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.82f,
                    dy1 = -2.0f,
                )
                // a 3 3 0 0 0 -2.81 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.81f,
                    dy1 = 2.0f,
                )
                // H 8.95
                horizontalLineTo(x = 8.95f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.19
                horizontalLineToRelative(dx = 2.19f)
                // a 3 3 0 0 0 2.81 2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.81f,
                    dy1 = 2.0f,
                )
                // a 3 3 0 0 0 2.82 -2
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.82f,
                    dy1 = -2.0f,
                )
                // h 6.18z
                horizontalLineToRelative(dx = 6.18f)
                close()
                // m -9 2
                moveToRelative(dx = -9.0f, dy = 2.0f)
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
            // M29.9 18.99 27.3 7.8 a2 2 0 0 0 -1.12 -1.37 l-9.4 -4.25 a2 2 0 0 0 -1.65 0 L5.72 6.43 A2 2 0 0 0 4.6 7.8 L2 19 a2 2 0 0 0 .4 1.7 l6.88 8.56 A2 2 0 0 0 10.84 30 h10.23 a2 2 0 0 0 1.55 -.75 l6.89 -8.55 a2 2 0 0 0 .39 -1.71 M21.07 28 H10.84 l-6.89 -8.56 2.6 -11.19 L15.94 4 l9.4 4.25 2.6 11.2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.9 18.99
                moveTo(x = 29.9f, y = 18.99f)
                // L 27.3 7.8
                lineTo(x = 27.3f, y = 7.8f)
                // a 2 2 0 0 0 -1.12 -1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.12f,
                    dy1 = -1.37f,
                )
                // l -9.4 -4.25
                lineToRelative(dx = -9.4f, dy = -4.25f)
                // a 2 2 0 0 0 -1.65 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.65f,
                    dy1 = 0.0f,
                )
                // L 5.72 6.43
                lineTo(x = 5.72f, y = 6.43f)
                // A 2 2 0 0 0 4.6 7.8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.6f,
                    y1 = 7.8f,
                )
                // L 2 19
                lineTo(x = 2.0f, y = 19.0f)
                // a 2 2 0 0 0 0.4 1.7
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.4f,
                    dy1 = 1.7f,
                )
                // l 6.88 8.56
                lineToRelative(dx = 6.88f, dy = 8.56f)
                // A 2 2 0 0 0 10.84 30
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.84f,
                    y1 = 30.0f,
                )
                // h 10.23
                horizontalLineToRelative(dx = 10.23f)
                // a 2 2 0 0 0 1.55 -0.75
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.55f,
                    dy1 = -0.75f,
                )
                // l 6.89 -8.55
                lineToRelative(dx = 6.89f, dy = -8.55f)
                // a 2 2 0 0 0 0.39 -1.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.39f,
                    dy1 = -1.71f,
                )
                // M 21.07 28
                moveTo(x = 21.07f, y = 28.0f)
                // H 10.84
                horizontalLineTo(x = 10.84f)
                // l -6.89 -8.56
                lineToRelative(dx = -6.89f, dy = -8.56f)
                // l 2.6 -11.19
                lineToRelative(dx = 2.6f, dy = -11.19f)
                // L 15.94 4
                lineTo(x = 15.94f, y = 4.0f)
                // l 9.4 4.25
                lineToRelative(dx = 9.4f, dy = 4.25f)
                // l 2.6 11.2z
                lineToRelative(dx = 2.6f, dy = 11.2f)
                close()
            }
            // M0 0 h32 v32 H0z
            path {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // H 0z
                horizontalLineTo(x = 0.0f)
                close()
            }
        }.build().also { _kubernetesControlPlaneNode = it }
    }

@Suppress("ObjectPropertyName")
private var _kubernetesControlPlaneNode: ImageVector? = null
