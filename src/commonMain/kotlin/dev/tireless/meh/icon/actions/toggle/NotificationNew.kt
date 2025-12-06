package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationNew: ImageVector
    get() {
        val current = _notificationNew
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.NotificationNew",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 16.59 V14 h-2 v3 a1 1 0 0 0 .3 .7 l2.7 2.71 V22 H5 v-1.59 l2.7 -2.7 A1 1 0 0 0 8 17 v-4 a7.99 7.99 0 0 1 12 -6.92 V3.85 a10 10 0 0 0 -3 -.8 V1 h-2 v2.05 A10 10 0 0 0 6 13 v3.59 l-2.7 2.7 A1 1 0 0 0 3 20 v3 a1 1 0 0 0 1 1 h7 v1 a5 5 0 0 0 10 0 v-1 h7 a1 1 0 0 0 1 -1 v-3 a1 1 0 0 0 -.3 -.7Z M19 25 a3 3 0 0 1 -6 0 v-1 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 16.59
                moveTo(x = 26.0f, y = 16.59f)
                // V 14
                verticalLineTo(y = 14.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // l 2.7 2.71
                lineToRelative(dx = 2.7f, dy = 2.71f)
                // V 22
                verticalLineTo(y = 22.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v -1.59
                verticalLineToRelative(dy = -1.59f)
                // l 2.7 -2.7
                lineToRelative(dx = 2.7f, dy = -2.7f)
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
                // a 7.99 7.99 0 0 1 12 -6.92
                arcToRelative(
                    a = 7.99f,
                    b = 7.99f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = -6.92f,
                )
                // V 3.85
                verticalLineTo(y = 3.85f)
                // a 10 10 0 0 0 -3 -0.8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -0.8f,
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
                // l -2.7 2.7
                lineToRelative(dx = -2.7f, dy = 2.7f)
                // A 1 1 0 0 0 3 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 20.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
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
            }
            // <circle cx="26.0" cy="8.0" radius="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 8
                moveTo(x = 26.0f, y = 8.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
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
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
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
        }.build().also { _notificationNew = it }
    }

@Suppress("ObjectPropertyName")
private var _notificationNew: ImageVector? = null
