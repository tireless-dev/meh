package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceAdd: ImageVector
    get() {
        val current = _faceAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FaceAdd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 22 a6 6 0 0 1 -5.14 -2.92 l-1.71 1 a8 8 0 0 0 13.7 0 l-1.71 -1 A6 6 0 0 1 16 22
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 22
                moveTo(x = 16.0f, y = 22.0f)
                // a 6 6 0 0 1 -5.14 -2.92
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.14f,
                    dy1 = -2.92f,
                )
                // l -1.71 1
                lineToRelative(dx = -1.71f, dy = 1.0f)
                // a 8 8 0 0 0 13.7 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 13.7f,
                    dy1 = 0.0f,
                )
                // l -1.71 -1
                lineToRelative(dx = -1.71f, dy = -1.0f)
                // A 6 6 0 0 1 16 22
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 22.0f,
                )
            }
            // <polygon points="30.0 4.0 26.0 4.0 26.0 0.0 24.0 0.0 24.0 4.0 20.0 4.0 20.0 6.0 24.0 6.0 24.0 10.0 26.0 10.0 26.0 6.0 30.0 6.0 30.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // L 26 4
                lineTo(x = 26.0f, y = 4.0f)
                // L 26 0
                lineTo(x = 26.0f, y = 0.0f)
                // L 24 0
                lineTo(x = 24.0f, y = 0.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 20 4
                lineTo(x = 20.0f, y = 4.0f)
                // L 20 6
                lineTo(x = 20.0f, y = 6.0f)
                // L 24 6
                lineTo(x = 24.0f, y = 6.0f)
                // L 24 10
                lineTo(x = 24.0f, y = 10.0f)
                // L 26 10
                lineTo(x = 26.0f, y = 10.0f)
                // L 26 6
                lineTo(x = 26.0f, y = 6.0f)
                // L 30 6
                lineTo(x = 30.0f, y = 6.0f)
                // L 30 4z
                lineTo(x = 30.0f, y = 4.0f)
                close()
            }
            // M11.5 11 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5 m9 0 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.5 11
                moveTo(x = 11.5f, y = 11.0f)
                // a 2.5 2.5 0 1 0 2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = 2.5f,
                )
                // a 2.5 2.5 0 0 0 -2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
                // m 9 0
                moveToRelative(dx = 9.0f, dy = 0.0f)
                // a 2.5 2.5 0 1 0 2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = 2.5f,
                )
                // a 2.5 2.5 0 0 0 -2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
            }
            // M27.61 13 A12 12 0 0 1 28 16 12 12 0 1 1 16 4 V2 a14 14 0 1 0 13.67 11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.61 13
                moveTo(x = 27.61f, y = 13.0f)
                // A 12 12 0 0 1 28 16
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.0f,
                    y1 = 16.0f,
                )
                // A 12 12 0 1 1 16 4
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 4.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // a 14 14 0 1 0 13.67 11z
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 13.67f,
                    dy1 = 11.0f,
                )
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
        }.build().also { _faceAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _faceAdd: ImageVector? = null
