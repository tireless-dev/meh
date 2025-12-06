package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InsertSyntax: ImageVector
    get() {
        val current = _insertSyntax
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InsertSyntax",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="20.17 16.0 17.59 18.58 19.0 20.0 23.0 16.0 19.0 12.0 17.58 13.41 20.17 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.17 16
                moveTo(x = 20.17f, y = 16.0f)
                // L 17.59 18.58
                lineTo(x = 17.59f, y = 18.58f)
                // L 19 20
                lineTo(x = 19.0f, y = 20.0f)
                // L 23 16
                lineTo(x = 23.0f, y = 16.0f)
                // L 19 12
                lineTo(x = 19.0f, y = 12.0f)
                // L 17.58 13.41
                lineTo(x = 17.58f, y = 13.41f)
                // L 20.17 16z
                lineTo(x = 20.17f, y = 16.0f)
                close()
            }
            // <polygon points="11.83 16.0 14.41 13.42 13.0 12.0 9.0 16.0 13.0 20.0 14.42 18.59 11.83 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.83 16
                moveTo(x = 11.83f, y = 16.0f)
                // L 14.41 13.42
                lineTo(x = 14.41f, y = 13.42f)
                // L 13 12
                lineTo(x = 13.0f, y = 12.0f)
                // L 9 16
                lineTo(x = 9.0f, y = 16.0f)
                // L 13 20
                lineTo(x = 13.0f, y = 20.0f)
                // L 14.42 18.59
                lineTo(x = 14.42f, y = 18.59f)
                // L 11.83 16z
                lineTo(x = 11.83f, y = 16.0f)
                close()
            }
            // M27 22.14 V9.86 A4 4 0 1 0 22.14 5 H9.86 A4 4 0 1 0 5 9.86 v12.28 A4 4 0 1 0 9.86 27 h12.28 A4 4 0 1 0 27 22.14 M26 4 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m16.14 -3 H9.86 A4 4 0 0 0 7 22.14 V9.86 A4 4 0 0 0 9.86 7 h12.28 A4 4 0 0 0 25 9.86 v12.28 A4 4 0 0 0 22.14 25 M26 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 22.14
                moveTo(x = 27.0f, y = 22.14f)
                // V 9.86
                verticalLineTo(y = 9.86f)
                // A 4 4 0 1 0 22.14 5
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 22.14f,
                    y1 = 5.0f,
                )
                // H 9.86
                horizontalLineTo(x = 9.86f)
                // A 4 4 0 1 0 5 9.86
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 9.86f,
                )
                // v 12.28
                verticalLineToRelative(dy = 12.28f)
                // A 4 4 0 1 0 9.86 27
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 9.86f,
                    y1 = 27.0f,
                )
                // h 12.28
                horizontalLineToRelative(dx = 12.28f)
                // A 4 4 0 1 0 27 22.14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 27.0f,
                    y1 = 22.14f,
                )
                // M 26 4
                moveTo(x = 26.0f, y = 4.0f)
                // a 2 2 0 1 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
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
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // a 2 2 0 1 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
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
                // m 2 22
                moveToRelative(dx = 2.0f, dy = 22.0f)
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
                // m 16.14 -3
                moveToRelative(dx = 16.14f, dy = -3.0f)
                // H 9.86
                horizontalLineTo(x = 9.86f)
                // A 4 4 0 0 0 7 22.14
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 22.14f,
                )
                // V 9.86
                verticalLineTo(y = 9.86f)
                // A 4 4 0 0 0 9.86 7
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.86f,
                    y1 = 7.0f,
                )
                // h 12.28
                horizontalLineToRelative(dx = 12.28f)
                // A 4 4 0 0 0 25 9.86
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 9.86f,
                )
                // v 12.28
                verticalLineToRelative(dy = 12.28f)
                // A 4 4 0 0 0 22.14 25
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.14f,
                    y1 = 25.0f,
                )
                // M 26 28
                moveTo(x = 26.0f, y = 28.0f)
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
        }.build().also { _insertSyntax = it }
    }

@Suppress("ObjectPropertyName")
private var _insertSyntax: ImageVector? = null
