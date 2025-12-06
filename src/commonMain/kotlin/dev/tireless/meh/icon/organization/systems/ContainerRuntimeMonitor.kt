package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerRuntimeMonitor: ImageVector
    get() {
        val current = _containerRuntimeMonitor
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ContainerRuntimeMonitor",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="22.0" cy="23.0" radius="2.0" fill="#000" stroke-width="0" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.0f,
            ) {
                // M 22 23
                moveTo(x = 22.0f, y = 23.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M29.78 22.48 A8.6 8.6 0 0 0 22 17 a8.6 8.6 0 0 0 -7.78 5.48 L14 23 l.22 .52 A8.6 8.6 0 0 0 22 29 a8.6 8.6 0 0 0 7.78 -5.48 L30 23z M22 27 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.78 22.48
                moveTo(x = 29.78f, y = 22.48f)
                // A 8.6 8.6 0 0 0 22 17
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 17.0f,
                )
                // a 8.6 8.6 0 0 0 -7.78 5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.78f,
                    dy1 = 5.48f,
                )
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // l 0.22 0.52
                lineToRelative(dx = 0.22f, dy = 0.52f)
                // A 8.6 8.6 0 0 0 22 29
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 29.0f,
                )
                // a 8.6 8.6 0 0 0 7.78 -5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.78f,
                    dy1 = -5.48f,
                )
                // L 30 23z
                lineTo(x = 30.0f, y = 23.0f)
                close()
                // M 22 27
                moveTo(x = 22.0f, y = 27.0f)
                // a 4 4 0 1 1 0 -8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -8.0f,
                )
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
            }
            // M12 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v10 h-2 V6 H6 v20 h6z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 28
                moveTo(x = 12.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _containerRuntimeMonitor = it }
    }

@Suppress("ObjectPropertyName")
private var _containerRuntimeMonitor: ImageVector? = null
