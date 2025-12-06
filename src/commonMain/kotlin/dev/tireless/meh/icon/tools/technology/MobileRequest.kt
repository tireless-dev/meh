package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileRequest: ImageVector
    get() {
        val current = _mobileRequest
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileRequest",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 28 a6 6 0 0 0 -5 -5.91 V21 h1 v-2 h-4 v2 h1 v1.09 A6 6 0 0 0 18 28 h-1 v2 h14 v-2z m-10 0 a4 4 0 0 1 8 0z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 28
                moveTo(x = 30.0f, y = 28.0f)
                // a 6 6 0 0 0 -5 -5.91
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.91f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 1.09
                verticalLineToRelative(dy = 1.09f)
                // A 6 6 0 0 0 18 28
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 28.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 4 4 0 0 1 8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14 28 H9 V8 h14 v8 h2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h5z M9 4 h14 v2 H9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 28
                moveTo(x = 14.0f, y = 28.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 5z
                horizontalLineToRelative(dx = 5.0f)
                close()
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
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
        }.build().also { _mobileRequest = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileRequest: ImageVector? = null
