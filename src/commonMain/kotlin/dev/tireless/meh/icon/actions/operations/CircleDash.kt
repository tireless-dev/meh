package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleDash: ImageVector
    get() {
        val current = _circleDash
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CircleDash",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M7.7 4.7 a15 15 0 0 0 -3 3.1 L6.3 9 a13 13 0 0 1 2.6 -2.7Z m-3.1 7.6 -1.9 -.6 A13 13 0 0 0 2 16 h2 a12 12 0 0 1 .6 -3.7 m-1.9 8.1 a14 14 0 0 0 2 3.9 l1.6 -1.2 a13 13 0 0 1 -1.7 -3.3Z m5.1 6.9 a14 14 0 0 0 3.9 2 l.6 -1.9 A13 13 0 0 1 9 25.7Z m3.9 -24.6 .6 1.9 A12 12 0 0 1 16 4 V2 a13 13 0 0 0 -4.3 .7 m12.5 24.6 a15 15 0 0 0 3.1 -3.1 L25.7 23 a12 12 0 0 1 -2.7 2.7Z m3.2 -7.6 1.9 .6 A16 16 0 0 0 30 16 h-2 a12 12 0 0 1 -.6 3.7 m1.8 -8.1 a14 14 0 0 0 -2 -3.9 l-1.6 1.2 a13 13 0 0 1 1.7 3.3Z m-5.1 -7 a14 14 0 0 0 -3.9 -2 l-.6 1.9 a13 13 0 0 1 3.3 1.7Z m-3.8 24.7 -.6 -1.9 A12 12 0 0 1 16 28 v2 a21 21 0 0 0 4.3 -.7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7.7 4.7
                moveTo(x = 7.7f, y = 4.7f)
                // a 15 15 0 0 0 -3 3.1
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.1f,
                )
                // L 6.3 9
                lineTo(x = 6.3f, y = 9.0f)
                // a 13 13 0 0 1 2.6 -2.7z
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.6f,
                    dy1 = -2.7f,
                )
                close()
                // m -3.1 7.6
                moveToRelative(dx = -3.1f, dy = 7.6f)
                // l -1.9 -0.6
                lineToRelative(dx = -1.9f, dy = -0.6f)
                // A 13 13 0 0 0 2 16
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 12 12 0 0 1 0.6 -3.7
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.6f,
                    dy1 = -3.7f,
                )
                // m -1.9 8.1
                moveToRelative(dx = -1.9f, dy = 8.1f)
                // a 14 14 0 0 0 2 3.9
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 3.9f,
                )
                // l 1.6 -1.2
                lineToRelative(dx = 1.6f, dy = -1.2f)
                // a 13 13 0 0 1 -1.7 -3.3z
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = -3.3f,
                )
                close()
                // m 5.1 6.9
                moveToRelative(dx = 5.1f, dy = 6.9f)
                // a 14 14 0 0 0 3.9 2
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.9f,
                    dy1 = 2.0f,
                )
                // l 0.6 -1.9
                lineToRelative(dx = 0.6f, dy = -1.9f)
                // A 13 13 0 0 1 9 25.7z
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 25.7f,
                )
                close()
                // m 3.9 -24.6
                moveToRelative(dx = 3.9f, dy = -24.6f)
                // l 0.6 1.9
                lineToRelative(dx = 0.6f, dy = 1.9f)
                // A 12 12 0 0 1 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // a 13 13 0 0 0 -4.3 0.7
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.3f,
                    dy1 = 0.7f,
                )
                // m 12.5 24.6
                moveToRelative(dx = 12.5f, dy = 24.6f)
                // a 15 15 0 0 0 3.1 -3.1
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.1f,
                    dy1 = -3.1f,
                )
                // L 25.7 23
                lineTo(x = 25.7f, y = 23.0f)
                // a 12 12 0 0 1 -2.7 2.7z
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.7f,
                    dy1 = 2.7f,
                )
                close()
                // m 3.2 -7.6
                moveToRelative(dx = 3.2f, dy = -7.6f)
                // l 1.9 0.6
                lineToRelative(dx = 1.9f, dy = 0.6f)
                // A 16 16 0 0 0 30 16
                arcTo(
                    horizontalEllipseRadius = 16.0f,
                    verticalEllipseRadius = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 16.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 12 12 0 0 1 -0.6 3.7
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.6f,
                    dy1 = 3.7f,
                )
                // m 1.8 -8.1
                moveToRelative(dx = 1.8f, dy = -8.1f)
                // a 14 14 0 0 0 -2 -3.9
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -3.9f,
                )
                // l -1.6 1.2
                lineToRelative(dx = -1.6f, dy = 1.2f)
                // a 13 13 0 0 1 1.7 3.3z
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 3.3f,
                )
                close()
                // m -5.1 -7
                moveToRelative(dx = -5.1f, dy = -7.0f)
                // a 14 14 0 0 0 -3.9 -2
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.9f,
                    dy1 = -2.0f,
                )
                // l -0.6 1.9
                lineToRelative(dx = -0.6f, dy = 1.9f)
                // a 13 13 0 0 1 3.3 1.7z
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.3f,
                    dy1 = 1.7f,
                )
                close()
                // m -3.8 24.7
                moveToRelative(dx = -3.8f, dy = 24.7f)
                // l -0.6 -1.9
                lineToRelative(dx = -0.6f, dy = -1.9f)
                // A 12 12 0 0 1 16 28
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 21 21 0 0 0 4.3 -0.7
                arcToRelative(
                    a = 21.0f,
                    b = 21.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.3f,
                    dy1 = -0.7f,
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
        }.build().also { _circleDash = it }
    }

@Suppress("ObjectPropertyName")
private var _circleDash: ImageVector? = null
