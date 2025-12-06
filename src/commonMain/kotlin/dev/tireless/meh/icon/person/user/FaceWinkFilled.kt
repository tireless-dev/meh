package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceWinkFilled: ImageVector
    get() {
        val current = _faceWinkFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FaceWinkFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M8 13 h6 v2 H8Z m8 11 a8 8 0 0 1 -6.85 -3.89 l1.71 -1 a6 6 0 0 0 10.28 0 l1.71 1 A8 8 0 0 1 16 24 m4.5 -8 a2.5 2.5 0 0 1 0 -5 2.5 2.5 0 0 1 0 5
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
                // M 8 13
                moveTo(x = 8.0f, y = 13.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
                // m 8 11
                moveToRelative(dx = 8.0f, dy = 11.0f)
                // a 8 8 0 0 1 -6.85 -3.89
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.85f,
                    dy1 = -3.89f,
                )
                // l 1.71 -1
                lineToRelative(dx = 1.71f, dy = -1.0f)
                // a 6 6 0 0 0 10.28 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.28f,
                    dy1 = 0.0f,
                )
                // l 1.71 1
                lineToRelative(dx = 1.71f, dy = 1.0f)
                // A 8 8 0 0 1 16 24
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 24.0f,
                )
                // m 4.5 -8
                moveToRelative(dx = 4.5f, dy = -8.0f)
                // a 2.5 2.5 0 0 1 0 -5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
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
        }.build().also { _faceWinkFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _faceWinkFilled: ImageVector? = null
