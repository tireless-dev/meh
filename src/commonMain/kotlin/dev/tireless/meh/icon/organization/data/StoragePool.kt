package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StoragePool: ImageVector
    get() {
        val current = _storagePool
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.StoragePool",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 4 v24 h24 V4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
            }
            // M17.5 13 A3.5 3.5 0 1 1 21 9.5 a3.5 3.5 0 0 1 -3.5 3.5 m0 -5 A1.5 1.5 0 1 0 19 9.5 1.5 1.5 0 0 0 17.5 8 m-3 18 a3.5 3.5 0 1 1 3.5 -3.5 3.5 3.5 0 0 1 -3.5 3.5 m0 -5 a1.5 1.5 0 1 0 1.5 1.5 1.5 1.5 0 0 0 -1.5 -1.5 m-5 -3 a3.5 3.5 0 1 1 3.5 -3.5 A3.5 3.5 0 0 1 9.5 18 m0 -5 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 9.5 13 m13 8 a3.5 3.5 0 1 1 3.5 -3.5 3.5 3.5 0 0 1 -3.5 3.5 m0 -5 a1.5 1.5 0 1 0 1.5 1.5 1.5 1.5 0 0 0 -1.5 -1.5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.5 13
                moveTo(x = 17.5f, y = 13.0f)
                // A 3.5 3.5 0 1 1 21 9.5
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 9.5f,
                )
                // a 3.5 3.5 0 0 1 -3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 3.5f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // A 1.5 1.5 0 1 0 19 9.5
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 9.5f,
                )
                // A 1.5 1.5 0 0 0 17.5 8
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.5f,
                    y1 = 8.0f,
                )
                // m -3 18
                moveToRelative(dx = -3.0f, dy = 18.0f)
                // a 3.5 3.5 0 1 1 3.5 -3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.5f,
                    dy1 = -3.5f,
                )
                // a 3.5 3.5 0 0 1 -3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 3.5f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // a 1.5 1.5 0 0 0 -1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = -1.5f,
                )
                // m -5 -3
                moveToRelative(dx = -5.0f, dy = -3.0f)
                // a 3.5 3.5 0 1 1 3.5 -3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.5f,
                    dy1 = -3.5f,
                )
                // A 3.5 3.5 0 0 1 9.5 18
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 18.0f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // A 1.5 1.5 0 0 0 9.5 13
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.5f,
                    y1 = 13.0f,
                )
                // m 13 8
                moveToRelative(dx = 13.0f, dy = 8.0f)
                // a 3.5 3.5 0 1 1 3.5 -3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.5f,
                    dy1 = -3.5f,
                )
                // a 3.5 3.5 0 0 1 -3.5 3.5
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 3.5f,
                )
                // m 0 -5
                moveToRelative(dx = 0.0f, dy = -5.0f)
                // a 1.5 1.5 0 1 0 1.5 1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 1.5f,
                    dy1 = 1.5f,
                )
                // a 1.5 1.5 0 0 0 -1.5 -1.5
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = -1.5f,
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
        }.build().also { _storagePool = it }
    }

@Suppress("ObjectPropertyName")
private var _storagePool: ImageVector? = null
