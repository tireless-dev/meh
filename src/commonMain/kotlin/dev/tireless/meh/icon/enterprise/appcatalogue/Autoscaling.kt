package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autoscaling: ImageVector
    get() {
        val current = _autoscaling
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Autoscaling",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22 28 H12 v-2 h10 V10 H6 v10 H4 V10 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 28
                moveTo(x = 22.0f, y = 28.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 10
                verticalLineTo(y = 10.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
            }
            // M28 22 h-2 v-2 h2 V4 H12 v2 h-2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 22
                moveTo(x = 28.0f, y = 22.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
            }
            // <polygon points="10.0 14.0 10.0 16.0 14.586 16.0 3.0 27.586 4.414 29.0 16.0 17.414 16.0 22.0 18.0 22.0 18.0 14.0 10.0 14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 14
                moveTo(x = 10.0f, y = 14.0f)
                // L 10 16
                lineTo(x = 10.0f, y = 16.0f)
                // L 14.586 16
                lineTo(x = 14.586f, y = 16.0f)
                // L 3 27.586
                lineTo(x = 3.0f, y = 27.586f)
                // L 4.414 29
                lineTo(x = 4.414f, y = 29.0f)
                // L 16 17.414
                lineTo(x = 16.0f, y = 17.414f)
                // L 16 22
                lineTo(x = 16.0f, y = 22.0f)
                // L 18 22
                lineTo(x = 18.0f, y = 22.0f)
                // L 18 14
                lineTo(x = 18.0f, y = 14.0f)
                // L 10 14z
                lineTo(x = 10.0f, y = 14.0f)
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
        }.build().also { _autoscaling = it }
    }

@Suppress("ObjectPropertyName")
private var _autoscaling: ImageVector? = null
