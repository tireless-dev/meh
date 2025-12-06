package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationOff: ImageVector
    get() {
        val current = _notificationOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NotificationOff",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 16.59 V13 a10 10 0 0 0 -1.08 -4.5 L30 3.4 28.59 2 2 28.59 3.41 30 l6 -6 H11 v1 a5 5 0 0 0 10 0 v-1 h7 a1 1 0 0 0 1 -1 v-3 a1 1 0 0 0 -.3 -.7Z M19 25 a3 3 0 0 1 -6 0 v-1 h6Z m8 -3 H11.41 l12 -12 A8 8 0 0 1 24 13 v4 a1 1 0 0 0 .3 .7 l2.7 2.71Z M7.7 17.7 A1 1 0 0 0 8 17 v-4 a8 8 0 0 1 8 -8 8 8 0 0 1 4.99 1.77 l1.42 -1.43 A10 10 0 0 0 17 3.05 V1 h-2 v2.05 A10 10 0 0 0 6 13 v3.59 l-3 3 L4.41 21Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 16.59
                moveTo(x = 26.0f, y = 16.59f)
                // V 13
                verticalLineTo(y = 13.0f)
                // a 10 10 0 0 0 -1.08 -4.5
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.08f,
                    dy1 = -4.5f,
                )
                // L 30 3.4
                lineTo(x = 30.0f, y = 3.4f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // L 2 28.59
                lineTo(x = 2.0f, y = 28.59f)
                // L 3.41 30
                lineTo(x = 3.41f, y = 30.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 5 5 0 0 0 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 0 -0.3 -0.7z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.7f,
                )
                close()
                // M 19 25
                moveTo(x = 19.0f, y = 25.0f)
                // a 3 3 0 0 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m 8 -3
                moveToRelative(dx = 8.0f, dy = -3.0f)
                // H 11.41
                horizontalLineTo(x = 11.41f)
                // l 12 -12
                lineToRelative(dx = 12.0f, dy = -12.0f)
                // A 8 8 0 0 1 24 13
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 24.0f,
                    y1 = 13.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 0 0.3 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.3f,
                    dy1 = 0.7f,
                )
                // l 2.7 2.71z
                lineToRelative(dx = 2.7f, dy = 2.71f)
                close()
                // M 7.7 17.7
                moveTo(x = 7.7f, y = 17.7f)
                // A 1 1 0 0 0 8 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 17.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 8 8 0 0 1 8 -8
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = -8.0f,
                )
                // a 8 8 0 0 1 4.99 1.77
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.99f,
                    dy1 = 1.77f,
                )
                // l 1.42 -1.43
                lineToRelative(dx = 1.42f, dy = -1.43f)
                // A 10 10 0 0 0 17 3.05
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 3.05f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.05
                verticalLineToRelative(dy = 2.05f)
                // A 10 10 0 0 0 6 13
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 13.0f,
                )
                // v 3.59
                verticalLineToRelative(dy = 3.59f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // L 4.41 21z
                lineTo(x = 4.41f, y = 21.0f)
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
        }.build().also { _notificationOff = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationOff: ImageVector? = null
