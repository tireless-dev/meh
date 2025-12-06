package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Policy: ImageVector
    get() {
        val current = _policy
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Policy",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 18 a6 6 0 1 0 -10 4.46 V30 l4 -1.9 4 1.9 v-7.54 A6 6 0 0 0 30 18 m-4 8.84 -2 -.95 -2 .95 v-3.19 a6 6 0 0 0 4 0Z M24 22 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 18
                moveTo(x = 30.0f, y = 18.0f)
                // a 6 6 0 1 0 -10 4.46
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = 4.46f,
                )
                // V 30
                verticalLineTo(y = 30.0f)
                // l 4 -1.9
                lineToRelative(dx = 4.0f, dy = -1.9f)
                // l 4 1.9
                lineToRelative(dx = 4.0f, dy = 1.9f)
                // v -7.54
                verticalLineToRelative(dy = -7.54f)
                // A 6 6 0 0 0 30 18
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 18.0f,
                )
                // m -4 8.84
                moveToRelative(dx = -4.0f, dy = 8.84f)
                // l -2 -0.95
                lineToRelative(dx = -2.0f, dy = -0.95f)
                // l -2 0.95
                lineToRelative(dx = -2.0f, dy = 0.95f)
                // v -3.19
                verticalLineToRelative(dy = -3.19f)
                // a 6 6 0 0 0 4 0z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                close()
                // M 24 22
                moveTo(x = 24.0f, y = 22.0f)
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
            // <rect width="7" height="2" x="9.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -7z
                horizontalLineToRelative(dx = -7.0f)
                close()
            }
            // <rect width="10" height="2" x="9.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
            }
            // M6 30 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v4 h-2 V4 H6 v24 h10 v2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 30
                moveTo(x = 6.0f, y = 30.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
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
        }.build().also { _policy = it }
    }

@Suppress("ObjectPropertyName")
private var _policy: ImageVector? = null
