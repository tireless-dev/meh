package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudAlerting: ImageVector
    get() {
        val current = _cloudAlerting
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CloudAlerting",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 17 v5 H4 V6 h11 V4 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8 v4 H8 v2 h16 v-2 h-4 v-4 h8 a2 2 0 0 0 2 -2 v-5Z M18 28 h-4 v-4 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 17
                moveTo(x = 28.0f, y = 17.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // v -5z
                verticalLineToRelative(dy = -5.0f)
                close()
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // M29 14 H17 a1 1 0 0 1 -.86 -1.51 l6 -10 a1 1 0 0 1 1.72 0 l6 10 A1 1 0 0 1 29 14 m-10.23 -2 h8.46 L23 4.94Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 14
                moveTo(x = 29.0f, y = 14.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // a 1 1 0 0 1 -0.86 -1.51
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.86f,
                    dy1 = -1.51f,
                )
                // l 6 -10
                lineToRelative(dx = 6.0f, dy = -10.0f)
                // a 1 1 0 0 1 1.72 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.72f,
                    dy1 = 0.0f,
                )
                // l 6 10
                lineToRelative(dx = 6.0f, dy = 10.0f)
                // A 1 1 0 0 1 29 14
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 29.0f,
                    y1 = 14.0f,
                )
                // m -10.23 -2
                moveToRelative(dx = -10.23f, dy = -2.0f)
                // h 8.46
                horizontalLineToRelative(dx = 8.46f)
                // L 23 4.94z
                lineTo(x = 23.0f, y = 4.94f)
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
        }.build().also { _cloudAlerting = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudAlerting: ImageVector? = null
