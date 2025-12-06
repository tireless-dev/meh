package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Help: ImageVector
    get() {
        val current = _help
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Help",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 26 a12 12 0 1 1 12 -12 12 12 0 0 1 -12 12
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // a 14 14 0 1 0 14 14
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 14.0f,
                )
                // A 14 14 0 0 0 16 2
                arcTo(
                    horizontalEllipseRadius = 14.0f,
                    verticalEllipseRadius = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 2.0f,
                )
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // a 12 12 0 1 1 12 -12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = -12.0f,
                )
                // a 12 12 0 0 1 -12 12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 12.0f,
                )
            }
            // <circle cx="16.0" cy="23.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 23.5
                moveTo(x = 16.0f, y = 23.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M17 8 h-1.5 a4.5 4.5 0 0 0 -4.5 4.5 V13 h2 v-.5 a2.5 2.5 0 0 1 2.5 -2.5 H17 a2.5 2.5 0 0 1 0 5 h-2 v4.5 h2 V17 a4.5 4.5 0 0 0 0 -9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 8
                moveTo(x = 17.0f, y = 8.0f)
                // h -1.5
                horizontalLineToRelative(dx = -1.5f)
                // a 4.5 4.5 0 0 0 -4.5 4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.5f,
                    dy1 = 4.5f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -0.5
                verticalLineToRelative(dy = -0.5f)
                // a 2.5 2.5 0 0 1 2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = -2.5f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 2.5 2.5 0 0 1 0 5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4.5
                verticalLineToRelative(dy = 4.5f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 17
                verticalLineTo(y = 17.0f)
                // a 4.5 4.5 0 0 0 0 -9
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -9.0f,
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
        }.build().also { _help = it }
    }

@Suppress("ObjectPropertyName")
private var _help: ImageVector? = null
