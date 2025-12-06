package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Customer: ImageVector
    get() {
        val current = _customer
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Customer",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29.76 21.34 A1 1 0 0 0 29 21 h-2 v-2 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -2 2 v2 h-2 a1 1 0 0 0 -.99 1.14 l1 7 A1 1 0 0 0 18 30 h10 a1 1 0 0 0 .99 -.86 l1 -7 a1 1 0 0 0 -.23 -.8 M21 19 h4 v2 h-4z m6.13 9 h-8.26 l-.72 -5 h9.7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.76 21.34
                moveTo(x = 29.76f, y = 21.34f)
                // A 1 1 0 0 0 29 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.0f,
                    y1 = 21.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 1 1 0 0 0 -0.99 1.14
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.99f,
                    dy1 = 1.14f,
                )
                // l 1 7
                lineToRelative(dx = 1.0f, dy = 7.0f)
                // A 1 1 0 0 0 18 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 30.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 1 1 0 0 0 0.99 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.99f,
                    dy1 = -0.86f,
                )
                // l 1 -7
                lineToRelative(dx = 1.0f, dy = -7.0f)
                // a 1 1 0 0 0 -0.23 -0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.23f,
                    dy1 = -0.8f,
                )
                // M 21 19
                moveTo(x = 21.0f, y = 19.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 6.13 9
                moveToRelative(dx = 6.13f, dy = 9.0f)
                // h -8.26
                horizontalLineToRelative(dx = -8.26f)
                // l -0.72 -5
                lineToRelative(dx = -0.72f, dy = -5.0f)
                // h 9.7z
                horizontalLineToRelative(dx = 9.7f)
                close()
            }
            // <rect width="2" height="10" x="10.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // m16.78 17.88 -1.9 -2.39 -1.45 -3.6 A3 3 0 0 0 10.65 10 H5 a3 3 0 0 0 -3 3 v7 a2 2 0 0 0 2 2 h1 v8 h2 V20 H4 v-7 a1 1 0 0 1 1 -1 h5.65 a1 1 0 0 1 .92 .63 l1.65 4 2 2.5z M4 5 a4 4 0 1 1 8 0 4 4 0 0 1 -8 0 m2 0 a2 2 0 1 0 4 0 2 2 0 0 0 -4 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16.78 17.88
                moveTo(x = 16.78f, y = 17.88f)
                // l -1.9 -2.39
                lineToRelative(dx = -1.9f, dy = -2.39f)
                // l -1.45 -3.6
                lineToRelative(dx = -1.45f, dy = -3.6f)
                // A 3 3 0 0 0 10.65 10
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.65f,
                    y1 = 10.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 5.65
                horizontalLineToRelative(dx = 5.65f)
                // a 1 1 0 0 1 0.92 0.63
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 0.63f,
                )
                // l 1.65 4
                lineToRelative(dx = 1.65f, dy = 4.0f)
                // l 2 2.5z
                lineToRelative(dx = 2.0f, dy = 2.5f)
                close()
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // m 2 0
                moveToRelative(dx = 2.0f, dy = 0.0f)
                // a 2 2 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
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
        }.build().also { _customer = it }
    }

@Suppress("ObjectPropertyName")
private var _customer: ImageVector? = null
