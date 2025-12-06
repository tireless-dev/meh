package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicAdd: ImageVector
    get() {
        val current = _musicAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MusicAdd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 6.0 26.0 6.0 26.0 2.0 24.0 2.0 24.0 6.0 20.0 6.0 20.0 8.0 24.0 8.0 24.0 12.0 26.0 12.0 26.0 8.0 30.0 8.0 30.0 6.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 6
                moveTo(x = 30.0f, y = 6.0f)
                // L 26 6
                lineTo(x = 26.0f, y = 6.0f)
                // L 26 2
                lineTo(x = 26.0f, y = 2.0f)
                // L 24 2
                lineTo(x = 24.0f, y = 2.0f)
                // L 24 6
                lineTo(x = 24.0f, y = 6.0f)
                // L 20 6
                lineTo(x = 20.0f, y = 6.0f)
                // L 20 8
                lineTo(x = 20.0f, y = 8.0f)
                // L 24 8
                lineTo(x = 24.0f, y = 8.0f)
                // L 24 12
                lineTo(x = 24.0f, y = 12.0f)
                // L 26 12
                lineTo(x = 26.0f, y = 12.0f)
                // L 26 8
                lineTo(x = 26.0f, y = 8.0f)
                // L 30 8
                lineTo(x = 30.0f, y = 8.0f)
                // L 30 6z
                lineTo(x = 30.0f, y = 6.0f)
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
        }.build().also { _musicAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _musicAdd: ImageVector? = null
