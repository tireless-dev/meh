package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wikis: ImageVector
    get() {
        val current = _wikis
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Wikis",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m12 13 h-6 a24 24 0 0 0 -2.79 -10.55 A12 12 0 0 1 28 15 M16 28 a5 5 0 0 1 -.67 0 A22 22 0 0 1 12 17 h8 a22 22 0 0 1 -3.3 11 5 5 0 0 1 -.7 0 m-4 -13 a22 22 0 0 1 3.3 -11 6 6 0 0 1 1.34 0 A22 22 0 0 1 20 15Z m.76 -10.55 A24 24 0 0 0 10 15 H4 a12 12 0 0 1 8.79 -10.55Z M4.05 17 h6 a24 24 0 0 0 2.75 10.55 A12 12 0 0 1 4.05 17 m15.16 10.55 A24 24 0 0 0 22 17 h6 a12 12 0 0 1 -8.79 10.55
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
                // m 12 13
                moveToRelative(dx = 12.0f, dy = 13.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 24 24 0 0 0 -2.79 -10.55
                arcToRelative(
                    a = 24.0f,
                    b = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.79f,
                    dy1 = -10.55f,
                )
                // A 12 12 0 0 1 28 15
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 15.0f,
                )
                // M 16 28
                moveTo(x = 16.0f, y = 28.0f)
                // a 5 5 0 0 1 -0.67 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.67f,
                    dy1 = 0.0f,
                )
                // A 22 22 0 0 1 12 17
                arcTo(
                    horizontalEllipseRadius = 22.0f,
                    verticalEllipseRadius = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 17.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 22 22 0 0 1 -3.3 11
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.3f,
                    dy1 = 11.0f,
                )
                // a 5 5 0 0 1 -0.7 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.0f,
                )
                // m -4 -13
                moveToRelative(dx = -4.0f, dy = -13.0f)
                // a 22 22 0 0 1 3.3 -11
                arcToRelative(
                    a = 22.0f,
                    b = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.3f,
                    dy1 = -11.0f,
                )
                // a 6 6 0 0 1 1.34 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.34f,
                    dy1 = 0.0f,
                )
                // A 22 22 0 0 1 20 15z
                arcTo(
                    horizontalEllipseRadius = 22.0f,
                    verticalEllipseRadius = 22.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 15.0f,
                )
                close()
                // m 0.76 -10.55
                moveToRelative(dx = 0.76f, dy = -10.55f)
                // A 24 24 0 0 0 10 15
                arcTo(
                    horizontalEllipseRadius = 24.0f,
                    verticalEllipseRadius = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 15.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 12 12 0 0 1 8.79 -10.55z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.79f,
                    dy1 = -10.55f,
                )
                close()
                // M 4.05 17
                moveTo(x = 4.05f, y = 17.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 24 24 0 0 0 2.75 10.55
                arcToRelative(
                    a = 24.0f,
                    b = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.75f,
                    dy1 = 10.55f,
                )
                // A 12 12 0 0 1 4.05 17
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.05f,
                    y1 = 17.0f,
                )
                // m 15.16 10.55
                moveToRelative(dx = 15.16f, dy = 10.55f)
                // A 24 24 0 0 0 22 17
                arcTo(
                    horizontalEllipseRadius = 24.0f,
                    verticalEllipseRadius = 24.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 17.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 12 12 0 0 1 -8.79 10.55
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.79f,
                    dy1 = 10.55f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 32 0
                moveTo(x = 32.0f, y = 0.0f)
                // l -1.3987644E-6 32
                lineToRelative(dx = -1.3987644E-6f, dy = 32.0f)
                // l -32 -1.3987644E-6
                lineToRelative(dx = -32.0f, dy = -1.3987644E-6f)
                // l 1.3987644E-6 -32z
                lineToRelative(dx = 1.3987644E-6f, dy = -32.0f)
                close()
            }
        }.build().also { _wikis = it }
    }

@Suppress("ObjectPropertyName")
private var _wikis: ImageVector? = null
