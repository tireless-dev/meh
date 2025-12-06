package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentPolicy: ImageVector
    get() {
        val current = _deploymentPolicy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DeploymentPolicy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="19.0 16.0 19.0 14.0 26.171 14.0 23.878 11.707 25.292 10.293 30.0 15.0 25.292 19.707 23.878 18.293 26.171 16.0 19.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 16
                moveTo(x = 19.0f, y = 16.0f)
                // L 19 14
                lineTo(x = 19.0f, y = 14.0f)
                // L 26.171 14
                lineTo(x = 26.171f, y = 14.0f)
                // L 23.878 11.707
                lineTo(x = 23.878f, y = 11.707f)
                // L 25.292 10.293
                lineTo(x = 25.292f, y = 10.293f)
                // L 30 15
                lineTo(x = 30.0f, y = 15.0f)
                // L 25.292 19.707
                lineTo(x = 25.292f, y = 19.707f)
                // L 23.878 18.293
                lineTo(x = 23.878f, y = 18.293f)
                // L 26.171 16
                lineTo(x = 26.171f, y = 16.0f)
                // L 19 16z
                lineTo(x = 19.0f, y = 16.0f)
                close()
            }
            // <polygon points="17.0 12.0 15.0 12.0 15.0 5.828 12.707 8.121 11.293 6.707 16.0 2.0 20.707 6.707 19.293 8.121 17.0 5.828 17.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // L 15 12
                lineTo(x = 15.0f, y = 12.0f)
                // L 15 5.828
                lineTo(x = 15.0f, y = 5.828f)
                // L 12.707 8.121
                lineTo(x = 12.707f, y = 8.121f)
                // L 11.293 6.707
                lineTo(x = 11.293f, y = 6.707f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // L 20.707 6.707
                lineTo(x = 20.707f, y = 6.707f)
                // L 19.293 8.121
                lineTo(x = 19.293f, y = 8.121f)
                // L 17 5.828
                lineTo(x = 17.0f, y = 5.828f)
                // L 17 12z
                lineTo(x = 17.0f, y = 12.0f)
                close()
            }
            // M17 20.1 V18 a4 4 0 0 0 -4 -4 H5.83 l2.3 -2.3 -1.42 -1.4 L2 15 l4.7 4.7 1.42 -1.4 -2.3 -2.3 H13 a2 2 0 0 1 2 2 v2.1 a5 5 0 1 0 2 0 M16 28 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 20.1
                moveTo(x = 17.0f, y = 20.1f)
                // V 18
                verticalLineTo(y = 18.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // H 5.83
                horizontalLineTo(x = 5.83f)
                // l 2.3 -2.3
                lineToRelative(dx = 2.3f, dy = -2.3f)
                // l -1.42 -1.4
                lineToRelative(dx = -1.42f, dy = -1.4f)
                // L 2 15
                lineTo(x = 2.0f, y = 15.0f)
                // l 4.7 4.7
                lineToRelative(dx = 4.7f, dy = 4.7f)
                // l 1.42 -1.4
                lineToRelative(dx = 1.42f, dy = -1.4f)
                // l -2.3 -2.3
                lineToRelative(dx = -2.3f, dy = -2.3f)
                // H 13
                horizontalLineTo(x = 13.0f)
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
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // a 5 5 0 1 0 2 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // a 3 3 0 1 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
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
        }.build().also { _deploymentPolicy = it }
    }

@Suppress("ObjectPropertyName")
private var _deploymentPolicy: ImageVector? = null
