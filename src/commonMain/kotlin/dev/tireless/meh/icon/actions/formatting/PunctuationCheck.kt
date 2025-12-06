package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PunctuationCheck: ImageVector
    get() {
        val current = _punctuationCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PunctuationCheck",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m23 27.18 -2.59 -2.6 L19 26 l4 4 7 -7 -1.41 -1.41z M14 16 h-3 v-.17 c0 -1.4 .74 -2.71 1.94 -3.43 l1.14 -.69 L13.05 10 l-1.14 .69 A6 6 0 0 0 9 15.83 V21 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1 m8 0 h-3 v-.17 c0 -1.4 .74 -2.71 1.94 -3.43 l1.14 -.69 L21.05 10 l-1.14 .69 A6 6 0 0 0 17 15.83 V21 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1 M12 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v11 h-2 V6 H6 v20 h6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 27.18
                moveTo(x = 23.0f, y = 27.18f)
                // l -2.59 -2.6
                lineToRelative(dx = -2.59f, dy = -2.6f)
                // L 19 26
                lineTo(x = 19.0f, y = 26.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // l -1.41 -1.41z
                lineToRelative(dx = -1.41f, dy = -1.41f)
                close()
                // M 14 16
                moveTo(x = 14.0f, y = 16.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -0.17
                verticalLineToRelative(dy = -0.17f)
                // c 0 -1.4 0.74 -2.71 1.94 -3.43
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                    dx2 = 0.74f,
                    dy2 = -2.71f,
                    dx3 = 1.94f,
                    dy3 = -3.43f,
                )
                // l 1.14 -0.69
                lineToRelative(dx = 1.14f, dy = -0.69f)
                // L 13.05 10
                lineTo(x = 13.05f, y = 10.0f)
                // l -1.14 0.69
                lineToRelative(dx = -1.14f, dy = 0.69f)
                // A 6 6 0 0 0 9 15.83
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 15.83f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -0.17
                verticalLineToRelative(dy = -0.17f)
                // c 0 -1.4 0.74 -2.71 1.94 -3.43
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                    dx2 = 0.74f,
                    dy2 = -2.71f,
                    dx3 = 1.94f,
                    dy3 = -3.43f,
                )
                // l 1.14 -0.69
                lineToRelative(dx = 1.14f, dy = -0.69f)
                // L 21.05 10
                lineTo(x = 21.05f, y = 10.0f)
                // l -1.14 0.69
                lineToRelative(dx = -1.14f, dy = 0.69f)
                // A 6 6 0 0 0 17 15.83
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 15.83f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // M 12 28
                moveTo(x = 12.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
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
        }.build().also { _punctuationCheck = it }
    }

@Suppress("ObjectPropertyName")
private var _punctuationCheck: ImageVector? = null
