package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cicsplex: ImageVector
    get() {
        val current = _cicsplex
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cicsplex",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M8 18.6 V17 H6 v1.6 a7.4 7.4 0 0 0 7.4 7.4 H15 v-2 h-1.6 A5.4 5.4 0 0 1 8 18.6 M28 18 h-8 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-8 a2 2 0 0 0 -2 -2 m-8 10 v-8 h8 v8Z m4 -14.6 V15 h2 v-1.6 A7.4 7.4 0 0 0 18.6 6 H17 v2 h1.6 a5.4 5.4 0 0 1 5.4 5.4 M12 2 H4 a2 2 0 0 0 -2 2 v8 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M4 12 V4 h8 v8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 18.6
                moveTo(x = 8.0f, y = 18.6f)
                // V 17
                verticalLineTo(y = 17.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 1.6
                verticalLineToRelative(dy = 1.6f)
                // a 7.4 7.4 0 0 0 7.4 7.4
                arcToRelative(
                    a = 7.4f,
                    b = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.4f,
                    dy1 = 7.4f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -1.6
                horizontalLineToRelative(dx = -1.6f)
                // A 5.4 5.4 0 0 1 8 18.6
                arcTo(
                    horizontalEllipseRadius = 5.4f,
                    verticalEllipseRadius = 5.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 18.6f,
                )
                // M 28 18
                moveTo(x = 28.0f, y = 18.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // m -8 10
                moveToRelative(dx = -8.0f, dy = 10.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 8z
                verticalLineToRelative(dy = 8.0f)
                close()
                // m 4 -14.6
                moveToRelative(dx = 4.0f, dy = -14.6f)
                // V 15
                verticalLineTo(y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -1.6
                verticalLineToRelative(dy = -1.6f)
                // A 7.4 7.4 0 0 0 18.6 6
                arcTo(
                    horizontalEllipseRadius = 7.4f,
                    verticalEllipseRadius = 7.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.6f,
                    y1 = 6.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 1.6
                horizontalLineToRelative(dx = 1.6f)
                // a 5.4 5.4 0 0 1 5.4 5.4
                arcToRelative(
                    a = 5.4f,
                    b = 5.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.4f,
                    dy1 = 5.4f,
                )
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 8z
                verticalLineToRelative(dy = 8.0f)
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
        }.build().also { _cicsplex = it }
    }

@Suppress("ObjectPropertyName")
private var _cicsplex: ImageVector? = null
