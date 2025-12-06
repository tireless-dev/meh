package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JsError: ImageVector
    get() {
        val current = _jsError
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.JsError",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20.33 30 h-2.66 A1.67 1.67 0 0 1 16 28.33 V26 h2 v2 h2 v-8 h2 v8.33 A1.67 1.67 0 0 1 20.33 30 m8 0 H24 v-2 h4 v-2 h-2 a2 2 0 0 1 -2 -2 v-2.33 A1.67 1.67 0 0 1 25.67 20 H30 v2 h-4 v2 h2 a2 2 0 0 1 2 2 v2.33 A1.67 1.67 0 0 1 28.33 30 M16 18 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.33 30
                moveTo(x = 20.33f, y = 30.0f)
                // h -2.66
                horizontalLineToRelative(dx = -2.66f)
                // A 1.67 1.67 0 0 1 16 28.33
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 28.33f,
                )
                // V 26
                verticalLineTo(y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8.33
                verticalLineToRelative(dy = 8.33f)
                // A 1.67 1.67 0 0 1 20.33 30
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.33f,
                    y1 = 30.0f,
                )
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // H 24
                horizontalLineTo(x = 24.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v -2.33
                verticalLineToRelative(dy = -2.33f)
                // A 1.67 1.67 0 0 1 25.67 20
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 25.67f,
                    y1 = 20.0f,
                )
                // H 30
                horizontalLineTo(x = 30.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 2.33
                verticalLineToRelative(dy = 2.33f)
                // A 1.67 1.67 0 0 1 28.33 30
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 28.33f,
                    y1 = 30.0f,
                )
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // a 1.5 1.5 0 1 0 0 3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                )
                // a 1.5 1.5 0 0 0 0 -3
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
            }
            // <rect width="2" height="9" x="15.0" y="7.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 7
                moveTo(x = 15.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M14 26 H9.5 a1 1 0 0 1 -.86 -.5 l-6.5 -11 a1 1 0 0 1 0 -1 l6.5 -11 A1 1 0 0 1 9.5 2 h13 a1 1 0 0 1 .86 .5 l6.5 11 a1 1 0 0 1 0 1 l-2 3.4 -1.72 -1.02 1.7 -2.88 -5.91 -10 H10.07 l-5.9 10 5.9 10 H14z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 26
                moveTo(x = 14.0f, y = 26.0f)
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // a 1 1 0 0 1 -0.86 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.86f,
                    dy1 = -0.5f,
                )
                // l -6.5 -11
                lineToRelative(dx = -6.5f, dy = -11.0f)
                // a 1 1 0 0 1 0 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
                // l 6.5 -11
                lineToRelative(dx = 6.5f, dy = -11.0f)
                // A 1 1 0 0 1 9.5 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 2.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // a 1 1 0 0 1 0.86 0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.86f,
                    dy1 = 0.5f,
                )
                // l 6.5 11
                lineToRelative(dx = 6.5f, dy = 11.0f)
                // a 1 1 0 0 1 0 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                )
                // l -2 3.4
                lineToRelative(dx = -2.0f, dy = 3.4f)
                // l -1.72 -1.02
                lineToRelative(dx = -1.72f, dy = -1.02f)
                // l 1.7 -2.88
                lineToRelative(dx = 1.7f, dy = -2.88f)
                // l -5.91 -10
                lineToRelative(dx = -5.91f, dy = -10.0f)
                // H 10.07
                horizontalLineTo(x = 10.07f)
                // l -5.9 10
                lineToRelative(dx = -5.9f, dy = 10.0f)
                // l 5.9 10
                lineToRelative(dx = 5.9f, dy = 10.0f)
                // H 14z
                horizontalLineTo(x = 14.0f)
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
        }.build().also { _jsError = it }
    }

@Suppress("ObjectPropertyName")
private var _jsError: ImageVector? = null
