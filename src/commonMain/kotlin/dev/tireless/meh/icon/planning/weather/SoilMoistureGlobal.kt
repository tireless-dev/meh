package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoilMoistureGlobal: ImageVector
    get() {
        val current = _soilMoistureGlobal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SoilMoistureGlobal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 30 a4.73 4.73 0 0 1 -4.2 -7.35 l3.36 -5.2 a1 1 0 0 1 1.68 0 l3.31 5.12 A5 5 0 0 1 30 25.22 4.9 4.9 0 0 1 25 30 m0 -10.16 -2.5 3.86 a2.93 2.93 0 1 0 5.5 1.52 3 3 0 0 0 -.54 -1.6Z M11 24 H9 A17 17 0 0 1 26 7 h4 v2 h-4 a15 15 0 0 0 -15 15
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 30
                moveTo(x = 25.0f, y = 30.0f)
                // a 4.73 4.73 0 0 1 -4.2 -7.35
                arcToRelative(
                    a = 4.73f,
                    b = 4.73f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.2f,
                    dy1 = -7.35f,
                )
                // l 3.36 -5.2
                lineToRelative(dx = 3.36f, dy = -5.2f)
                // a 1 1 0 0 1 1.68 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.68f,
                    dy1 = 0.0f,
                )
                // l 3.31 5.12
                lineToRelative(dx = 3.31f, dy = 5.12f)
                // A 5 5 0 0 1 30 25.22
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 30.0f,
                    y1 = 25.22f,
                )
                // A 4.9 4.9 0 0 1 25 30
                arcTo(
                    horizontalEllipseRadius = 4.9f,
                    verticalEllipseRadius = 4.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 30.0f,
                )
                // m 0 -10.16
                moveToRelative(dx = 0.0f, dy = -10.16f)
                // l -2.5 3.86
                lineToRelative(dx = -2.5f, dy = 3.86f)
                // a 2.93 2.93 0 1 0 5.5 1.52
                arcToRelative(
                    a = 2.93f,
                    b = 2.93f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.5f,
                    dy1 = 1.52f,
                )
                // a 3 3 0 0 0 -0.54 -1.6z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -1.6f,
                )
                close()
                // M 11 24
                moveTo(x = 11.0f, y = 24.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // A 17 17 0 0 1 26 7
                arcTo(
                    horizontalEllipseRadius = 17.0f,
                    verticalEllipseRadius = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.0f,
                    y1 = 7.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 15 15 0 0 0 -15 15
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -15.0f,
                    dy1 = 15.0f,
                )
            }
            // M16 24 h-2 a12 12 0 0 1 12 -12 h4 v2 h-4 a10 10 0 0 0 -10 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 24
                moveTo(x = 16.0f, y = 24.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 12 12 0 0 1 12 -12
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = -12.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 10 10 0 0 0 -10 10
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 10.0f,
                )
            }
            // M26 2 a22 22 0 0 0 -12 3.58 A22 22 0 0 0 2 2 v2 a20 20 0 0 1 10.26 2.84 22 22 0 0 0 -2.31 2.14 A17 17 0 0 0 2 7 v2 a15 15 0 0 1 6.62 1.54 22 22 0 0 0 -1.7 2.53 A12 12 0 0 0 2 12 v2 a10 10 0 0 1 4 .85 A22 22 0 0 0 4 24 h2 A20 20 0 0 1 26 4 h4 V2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 2
                moveTo(x = 26.0f, y = 2.0f)
                // a 22 22 0 0 0 -12 3.58
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 3.58f,
                )
                // A 22 22 0 0 0 2 2
                arcTo(
                    horizontalEllipseRadius = 22.0f,
                    verticalEllipseRadius = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 20 20 0 0 1 10.26 2.84
                arcToRelative(
                    a = 20.0f,
                    b = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.26f,
                    dy1 = 2.84f,
                )
                // a 22 22 0 0 0 -2.31 2.14
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.31f,
                    dy1 = 2.14f,
                )
                // A 17 17 0 0 0 2 7
                arcTo(
                    horizontalEllipseRadius = 17.0f,
                    verticalEllipseRadius = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 7.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 15 15 0 0 1 6.62 1.54
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.62f,
                    dy1 = 1.54f,
                )
                // a 22 22 0 0 0 -1.7 2.53
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 2.53f,
                )
                // A 12 12 0 0 0 2 12
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 12.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 10 10 0 0 1 4 0.85
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.85f,
                )
                // A 22 22 0 0 0 4 24
                arcTo(
                    horizontalEllipseRadius = 22.0f,
                    verticalEllipseRadius = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 24.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // A 20 20 0 0 1 26 4
                arcTo(
                    horizontalEllipseRadius = 20.0f,
                    verticalEllipseRadius = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 26.0f,
                    y1 = 4.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
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
        }.build().also { _soilMoistureGlobal = it }
    }

@Suppress("ObjectPropertyName")
private var _soilMoistureGlobal: ImageVector? = null
