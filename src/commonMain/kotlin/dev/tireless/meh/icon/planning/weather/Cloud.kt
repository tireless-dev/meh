package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cloud: ImageVector
    get() {
        val current = _cloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cloud",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 7 a8 8 0 0 1 1.51 .15 8 8 0 0 1 6.35 6.34 l.26 1.35 1.35 .24 a5.5 5.5 0 0 1 -1 10.92 H7.5 a5.5 5.5 0 0 1 -1 -10.92 l1.34 -.24 .26 -1.35 A8 8 0 0 1 16 7 m0 -2 a10 10 0 0 0 -9.83 8.12 A7.5 7.5 0 0 0 7.49 28 h17 a7.5 7.5 0 0 0 1.32 -14.88 10 10 0 0 0 -7.94 -7.94 A10 10 0 0 0 16 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // a 8 8 0 0 1 1.51 0.15
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.51f,
                    dy1 = 0.15f,
                )
                // a 8 8 0 0 1 6.35 6.34
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.35f,
                    dy1 = 6.34f,
                )
                // l 0.26 1.35
                lineToRelative(dx = 0.26f, dy = 1.35f)
                // l 1.35 0.24
                lineToRelative(dx = 1.35f, dy = 0.24f)
                // a 5.5 5.5 0 0 1 -1 10.92
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 10.92f,
                )
                // H 7.5
                horizontalLineTo(x = 7.5f)
                // a 5.5 5.5 0 0 1 -1 -10.92
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -10.92f,
                )
                // l 1.34 -0.24
                lineToRelative(dx = 1.34f, dy = -0.24f)
                // l 0.26 -1.35
                lineToRelative(dx = 0.26f, dy = -1.35f)
                // A 8 8 0 0 1 16 7
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 7.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 10 10 0 0 0 -9.83 8.12
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.83f,
                    dy1 = 8.12f,
                )
                // A 7.5 7.5 0 0 0 7.49 28
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.49f,
                    y1 = 28.0f,
                )
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // a 7.5 7.5 0 0 0 1.32 -14.88
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.32f,
                    dy1 = -14.88f,
                )
                // a 10 10 0 0 0 -7.94 -7.94
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.94f,
                    dy1 = -7.94f,
                )
                // A 10 10 0 0 0 16 5
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
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
        }.build().also { _cloud = it }
    }

@Suppress("ObjectPropertyName")
private var _cloud: ImageVector? = null
