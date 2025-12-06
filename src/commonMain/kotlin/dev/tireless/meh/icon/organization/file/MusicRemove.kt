package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicRemove: ImageVector
    get() {
        val current = _musicRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MusicRemove",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="26.41 7.0 30.0 3.41 28.59 2.0 25.0 5.59 21.41 2.0 20.0 3.41 23.59 7.0 20.0 10.59 21.41 12.0 25.0 8.41 28.59 12.0 30.0 10.59 26.41 7.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26.41 7
                moveTo(x = 26.41f, y = 7.0f)
                // L 30 3.41
                lineTo(x = 30.0f, y = 3.41f)
                // L 28.59 2
                lineTo(x = 28.59f, y = 2.0f)
                // L 25 5.59
                lineTo(x = 25.0f, y = 5.59f)
                // L 21.41 2
                lineTo(x = 21.41f, y = 2.0f)
                // L 20 3.41
                lineTo(x = 20.0f, y = 3.41f)
                // L 23.59 7
                lineTo(x = 23.59f, y = 7.0f)
                // L 20 10.59
                lineTo(x = 20.0f, y = 10.59f)
                // L 21.41 12
                lineTo(x = 21.41f, y = 12.0f)
                // L 25 8.41
                lineTo(x = 25.0f, y = 8.41f)
                // L 28.59 12
                lineTo(x = 28.59f, y = 12.0f)
                // L 30 10.59
                lineTo(x = 30.0f, y = 10.59f)
                // L 26.41 7z
                lineTo(x = 26.41f, y = 7.0f)
                close()
            }
            // M24 15 v7.56 A4 4 0 0 0 22 22 a4 4 0 1 0 4 4 V15Z m-2 13 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 M17 6 h-7 a2 2 0 0 0 -2 2 v14.56 A4 4 0 0 0 6 22 a4 4 0 1 0 4 4 V8 h7Z M6 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 15
                moveTo(x = 24.0f, y = 15.0f)
                // v 7.56
                verticalLineToRelative(dy = 7.56f)
                // A 4 4 0 0 0 22 22
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 22.0f,
                )
                // a 4 4 0 1 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // V 15z
                verticalLineTo(y = 15.0f)
                close()
                // m -2 13
                moveToRelative(dx = -2.0f, dy = 13.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // M 17 6
                moveTo(x = 17.0f, y = 6.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
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
                // v 14.56
                verticalLineToRelative(dy = 14.56f)
                // A 4 4 0 0 0 6 22
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 22.0f,
                )
                // a 4 4 0 1 0 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // M 6 28
                moveTo(x = 6.0f, y = 28.0f)
                // a 2 2 0 1 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
        }.build().also { _musicRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _musicRemove: ImageVector? = null
