package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HybridNetworking: ImageVector
    get() {
        val current = _hybridNetworking
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.HybridNetworking",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M17 24.18 V20 h-2 v4.18 a3 3 0 1 0 2 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 24.18
                moveTo(x = 17.0f, y = 24.18f)
                // V 20
                verticalLineTo(y = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4.18
                verticalLineToRelative(dy = 4.18f)
                // a 3 3 0 1 0 2 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
            }
            // M26 12 a4 4 0 0 0 -3.86 3 H9.86 a4 4 0 1 0 0 2 h12.28 A4 4 0 1 0 26 12 M6 18 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m20 0 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 12
                moveTo(x = 26.0f, y = 12.0f)
                // a 4 4 0 0 0 -3.86 3
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.86f,
                    dy1 = 3.0f,
                )
                // H 9.86
                horizontalLineTo(x = 9.86f)
                // a 4 4 0 1 0 0 2
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 12.28
                horizontalLineToRelative(dx = 12.28f)
                // A 4 4 0 1 0 26 12
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 26.0f,
                    y1 = 12.0f,
                )
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
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
                // m 20 0
                moveToRelative(dx = 20.0f, dy = 0.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
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
            // M19 5 a3 3 0 1 0 -4 2.82 V12 h2 V7.82 A3 3 0 0 0 19 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 5
                moveTo(x = 19.0f, y = 5.0f)
                // a 3 3 0 1 0 -4 2.82
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 2.82f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7.82
                verticalLineTo(y = 7.82f)
                // A 3 3 0 0 0 19 5
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 5.0f,
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
        }.build().also { _hybridNetworking = it }
    }

@Suppress("ObjectPropertyName")
private var _hybridNetworking: ImageVector? = null
