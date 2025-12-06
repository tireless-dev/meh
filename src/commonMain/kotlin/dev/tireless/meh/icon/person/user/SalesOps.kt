package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SalesOps: ImageVector
    get() {
        val current = _salesOps
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SalesOps",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 6 V4 h-3 V2 h-2 v2 h-1 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h4 v2 h-6 v2 h3 v2 h2 v-2 h1 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 h-4 V6z m-6 14 v2 h2.59 L23 25.59 l-2.3 -2.3 a1 1 0 0 0 -1.41 0 L14 28.6 15.41 30 l4.6 -4.59 2.28 2.3 a1 1 0 0 0 1.42 0 L28 23.4 V26 h2 v-6z M4 30 H2 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 5.22 2.33 l-1.5 1.34 A5 5 0 0 0 15 20 H9 a5 5 0 0 0 -5 5z m8 -14 a7 7 0 1 0 0 -14 7 7 0 0 0 0 14 m0 -12 a5 5 0 1 1 0 10 5 5 0 0 1 0 -10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 6
                moveTo(x = 30.0f, y = 6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 6z
                verticalLineTo(y = 6.0f)
                close()
                // m -6 14
                moveToRelative(dx = -6.0f, dy = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.59
                horizontalLineToRelative(dx = 2.59f)
                // L 23 25.59
                lineTo(x = 23.0f, y = 25.59f)
                // l -2.3 -2.3
                lineToRelative(dx = -2.3f, dy = -2.3f)
                // a 1 1 0 0 0 -1.41 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.41f,
                    dy1 = 0.0f,
                )
                // L 14 28.6
                lineTo(x = 14.0f, y = 28.6f)
                // L 15.41 30
                lineTo(x = 15.41f, y = 30.0f)
                // l 4.6 -4.59
                lineToRelative(dx = 4.6f, dy = -4.59f)
                // l 2.28 2.3
                lineToRelative(dx = 2.28f, dy = 2.3f)
                // a 1 1 0 0 0 1.42 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.42f,
                    dy1 = 0.0f,
                )
                // L 28 23.4
                lineTo(x = 28.0f, y = 23.4f)
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // M 4 30
                moveTo(x = 4.0f, y = 30.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 7 7 0 0 1 5.22 2.33
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.22f,
                    dy1 = 2.33f,
                )
                // l -1.5 1.34
                lineToRelative(dx = -1.5f, dy = 1.34f)
                // A 5 5 0 0 0 15 20
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 20.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 5 5 0 0 0 -5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                close()
                // m 8 -14
                moveToRelative(dx = 8.0f, dy = -14.0f)
                // a 7 7 0 1 0 0 -14
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -14.0f,
                )
                // a 7 7 0 0 0 0 14
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 14.0f,
                )
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // a 5 5 0 1 1 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                // a 5 5 0 0 1 0 -10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
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
        }.build().also { _salesOps = it }
    }

@Suppress("ObjectPropertyName")
private var _salesOps: ImageVector? = null
