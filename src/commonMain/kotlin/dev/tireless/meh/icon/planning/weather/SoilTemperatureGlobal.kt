package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SoilTemperatureGlobal: ImageVector
    get() {
        val current = _soilTemperatureGlobal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SoilTemperatureGlobal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 30 a4.99 4.99 0 0 1 -3 -8.98 V15 a3 3 0 0 1 6 0 v6.02 A4.99 4.99 0 0 1 25 30 m0 -16 a1 1 0 0 0 -1 1 v7.13 l-.5 .29 A3 3 0 0 0 22 25 a3 3 0 0 0 6 0 3 3 0 0 0 -1.5 -2.58 L26 22.13 V15 a1 1 0 0 0 -1 -1 m-9 10 h-2 a12 12 0 0 1 3.76 -8.73 l1.38 1.46 A10 10 0 0 0 16 24
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 30
                moveTo(x = 25.0f, y = 30.0f)
                // a 4.99 4.99 0 0 1 -3 -8.98
                arcToRelative(
                    a = 4.99f,
                    b = 4.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -8.98f,
                )
                // V 15
                verticalLineTo(y = 15.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 6.02
                verticalLineToRelative(dy = 6.02f)
                // A 4.99 4.99 0 0 1 25 30
                arcTo(
                    horizontalEllipseRadius = 4.99f,
                    verticalEllipseRadius = 4.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.0f,
                    y1 = 30.0f,
                )
                // m 0 -16
                moveToRelative(dx = 0.0f, dy = -16.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 7.13
                verticalLineToRelative(dy = 7.13f)
                // l -0.5 0.29
                lineToRelative(dx = -0.5f, dy = 0.29f)
                // A 3 3 0 0 0 22 25
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 25.0f,
                )
                // a 3 3 0 0 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 0 0 -1.5 -2.58
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.5f,
                    dy1 = -2.58f,
                )
                // L 26 22.13
                lineTo(x = 26.0f, y = 22.13f)
                // V 15
                verticalLineTo(y = 15.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // m -9 10
                moveToRelative(dx = -9.0f, dy = 10.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 12 12 0 0 1 3.76 -8.73
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.76f,
                    dy1 = -8.73f,
                )
                // l 1.38 1.46
                lineToRelative(dx = 1.38f, dy = 1.46f)
                // A 10 10 0 0 0 16 24
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 24.0f,
                )
            }
            // M11 24 H9 A17 17 0 0 1 26 7 h4 v2 h-4 a15 15 0 0 0 -15 15
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
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
        }.build().also { _soilTemperatureGlobal = it }
    }

@Suppress("ObjectPropertyName")
private var _soilTemperatureGlobal: ImageVector? = null
