package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataView: ImageVector
    get() {
        val current = _dataView
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataView",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="22.0" cy="24.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 24
                moveTo(x = 22.0f, y = 24.0f)
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
            // M29.78 23.48 A8.6 8.6 0 0 0 22 18 a8.6 8.6 0 0 0 -7.78 5.48 L14 24 l.22 .52 A8.6 8.6 0 0 0 22 30 a8.6 8.6 0 0 0 7.78 -5.48 L30 24Z M22 28 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.78 23.48
                moveTo(x = 29.78f, y = 23.48f)
                // A 8.6 8.6 0 0 0 22 18
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 18.0f,
                )
                // a 8.6 8.6 0 0 0 -7.78 5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.78f,
                    dy1 = 5.48f,
                )
                // L 14 24
                lineTo(x = 14.0f, y = 24.0f)
                // l 0.22 0.52
                lineToRelative(dx = 0.22f, dy = 0.52f)
                // A 8.6 8.6 0 0 0 22 30
                arcTo(
                    horizontalEllipseRadius = 8.6f,
                    verticalEllipseRadius = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 30.0f,
                )
                // a 8.6 8.6 0 0 0 7.78 -5.48
                arcToRelative(
                    a = 8.6f,
                    b = 8.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.78f,
                    dy1 = -5.48f,
                )
                // L 30 24z
                lineTo(x = 30.0f, y = 24.0f)
                close()
                // M 22 28
                moveTo(x = 22.0f, y = 28.0f)
                // a 4 4 0 1 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
            }
            // <circle cx="8.0" cy="8.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="8.0" cy="16.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="8.0" cy="24.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 24
                moveTo(x = 8.0f, y = 24.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M5 21 h7 v-2 H5 v-6 h16 v3 h2 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h7 v-2 H5Z M5 5 h16 v6 H5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v 22
                verticalLineToRelative(dy = 22.0f)
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
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
                // M 5 5
                moveTo(x = 5.0f, y = 5.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
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
        }.build().also { _dataView = it }
    }

@Suppress("ObjectPropertyName")
private var _dataView: ImageVector? = null
