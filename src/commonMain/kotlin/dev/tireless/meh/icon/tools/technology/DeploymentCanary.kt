package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentCanary: ImageVector
    get() {
        val current = _deploymentCanary
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DeploymentCanary",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="23.0" cy="11.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 11
                moveTo(x = 23.0f, y = 11.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M26.46 7.46 A5 5 0 0 0 22.93 6 h-.01 a5 5 0 0 0 -3.52 1.46 l-2.9 2.9 L8.41 2.3 a.97 .97 0 0 0 -1.38 0 L6.49 2.84 a8.5 8.5 0 0 0 0 12.02 L9.64 18 1.05 26.6 2.47 28 l10 -10 -4.57 -4.56 a6.5 6.5 0 0 1 -.17 -9.01 l8.36 8.36 a3.13 3.13 0 0 1 0 4.43 l-.8 .8 1.42 1.4 .8 -.79 a5.1 5.1 0 0 0 .36 -6.81 l2.94 -2.94 a3 3 0 0 1 4.24 0 L27.17 11 22 16.17 V19 a7 7 0 0 1 -7 7 h-3 v2 h3 a9 9 0 0 0 9 -9 v-2.06 c.76 -.7 6 -5.94 6 -5.94z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.46 7.46
                moveTo(x = 26.46f, y = 7.46f)
                // A 5 5 0 0 0 22.93 6
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.93f,
                    y1 = 6.0f,
                )
                // h -0.01
                horizontalLineToRelative(dx = -0.01f)
                // a 5 5 0 0 0 -3.52 1.46
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.52f,
                    dy1 = 1.46f,
                )
                // l -2.9 2.9
                lineToRelative(dx = -2.9f, dy = 2.9f)
                // L 8.41 2.3
                lineTo(x = 8.41f, y = 2.3f)
                // a 0.97 0.97 0 0 0 -1.38 0
                arcToRelative(
                    a = 0.97f,
                    b = 0.97f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.38f,
                    dy1 = 0.0f,
                )
                // L 6.49 2.84
                lineTo(x = 6.49f, y = 2.84f)
                // a 8.5 8.5 0 0 0 0 12.02
                arcToRelative(
                    a = 8.5f,
                    b = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 12.02f,
                )
                // L 9.64 18
                lineTo(x = 9.64f, y = 18.0f)
                // L 1.05 26.6
                lineTo(x = 1.05f, y = 26.6f)
                // L 2.47 28
                lineTo(x = 2.47f, y = 28.0f)
                // l 10 -10
                lineToRelative(dx = 10.0f, dy = -10.0f)
                // l -4.57 -4.56
                lineToRelative(dx = -4.57f, dy = -4.56f)
                // a 6.5 6.5 0 0 1 -0.17 -9.01
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.17f,
                    dy1 = -9.01f,
                )
                // l 8.36 8.36
                lineToRelative(dx = 8.36f, dy = 8.36f)
                // a 3.13 3.13 0 0 1 0 4.43
                arcToRelative(
                    a = 3.13f,
                    b = 3.13f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.43f,
                )
                // l -0.8 0.8
                lineToRelative(dx = -0.8f, dy = 0.8f)
                // l 1.42 1.4
                lineToRelative(dx = 1.42f, dy = 1.4f)
                // l 0.8 -0.79
                lineToRelative(dx = 0.8f, dy = -0.79f)
                // a 5.1 5.1 0 0 0 0.36 -6.81
                arcToRelative(
                    a = 5.1f,
                    b = 5.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.36f,
                    dy1 = -6.81f,
                )
                // l 2.94 -2.94
                lineToRelative(dx = 2.94f, dy = -2.94f)
                // a 3 3 0 0 1 4.24 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.24f,
                    dy1 = 0.0f,
                )
                // L 27.17 11
                lineTo(x = 27.17f, y = 11.0f)
                // L 22 16.17
                lineTo(x = 22.0f, y = 16.17f)
                // V 19
                verticalLineTo(y = 19.0f)
                // a 7 7 0 0 1 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 9 9 0 0 0 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // v -2.06
                verticalLineToRelative(dy = -2.06f)
                // c 0.76 -0.7 6 -5.94 6 -5.94z
                curveToRelative(
                    dx1 = 0.76f,
                    dy1 = -0.7f,
                    dx2 = 6.0f,
                    dy2 = -5.94f,
                    dx3 = 6.0f,
                    dy3 = -5.94f,
                )
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
        }.build().also { _deploymentCanary = it }
    }

@Suppress("ObjectPropertyName")
private var _deploymentCanary: ImageVector? = null
