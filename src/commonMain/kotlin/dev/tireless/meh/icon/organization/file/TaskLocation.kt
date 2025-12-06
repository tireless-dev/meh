package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TaskLocation: ImageVector
    get() {
        val current = _taskLocation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TaskLocation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="24.0" cy="21.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 21
                moveTo(x = 24.0f, y = 21.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m24 31 -4.78 -6.4 A6 6 0 0 1 18 21 a6 6 0 0 1 12 0 6 6 0 0 1 -1.22 3.6Z m0 -14 a4 4 0 0 0 -4 4 4 4 0 0 0 .82 2.4 L24 27.66 l3.18 -4.26 A4 4 0 0 0 28 21 a4 4 0 0 0 -4 -4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 31
                moveTo(x = 24.0f, y = 31.0f)
                // l -4.78 -6.4
                lineToRelative(dx = -4.78f, dy = -6.4f)
                // A 6 6 0 0 1 18 21
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 21.0f,
                )
                // a 6 6 0 0 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 0 1 -1.22 3.6z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.22f,
                    dy1 = 3.6f,
                )
                close()
                // m 0 -14
                moveToRelative(dx = 0.0f, dy = -14.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // a 4 4 0 0 0 0.82 2.4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.82f,
                    dy1 = 2.4f,
                )
                // L 24 27.66
                lineTo(x = 24.0f, y = 27.66f)
                // l 3.18 -4.26
                lineToRelative(dx = 3.18f, dy = -4.26f)
                // A 4 4 0 0 0 28 21
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 28.0f,
                    y1 = 21.0f,
                )
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
            }
            // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h9 v-2 H7 V7 h3 v3 h12 V7 h3 v5 h2 V7 a2 2 0 0 0 -2 -2 m-5 3 h-8 V4 h8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 5
                moveTo(x = 25.0f, y = 5.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 21
                verticalLineToRelative(dy = 21.0f)
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
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // V 7
                verticalLineTo(y = 7.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // m -5 3
                moveToRelative(dx = -5.0f, dy = 3.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8z
                horizontalLineToRelative(dx = 8.0f)
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
        }.build().also { _taskLocation = it }
    }

@Suppress("ObjectPropertyName")
private var _taskLocation: ImageVector? = null
