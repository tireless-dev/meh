package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cube: ImageVector
    get() {
        val current = _cube
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cube",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m28.5 8.14 -12 -7 a1 1 0 0 0 -1 0 l-12 7 A1 1 0 0 0 3 9 v14 a1 1 0 0 0 .5 .86 l12 7 a1 1 0 0 0 1 0 l12 -7 A1 1 0 0 0 29 23 V9 a1 1 0 0 0 -.5 -.86 M16 3.16 26.02 9 16 14.84 5.98 9Z M5 10.74 l10 5.83 v11.69 L5 22.43Z m12 17.52 V16.57 l10 -5.83 v11.69Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28.5 8.14
                moveTo(x = 28.5f, y = 8.14f)
                // l -12 -7
                lineToRelative(dx = -12.0f, dy = -7.0f)
                // a 1 1 0 0 0 -1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                // l -12 7
                lineToRelative(dx = -12.0f, dy = 7.0f)
                // A 1 1 0 0 0 3 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 9.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 1 1 0 0 0 0.5 0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.86f,
                )
                // l 12 7
                lineToRelative(dx = 12.0f, dy = 7.0f)
                // a 1 1 0 0 0 1 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // l 12 -7
                lineToRelative(dx = 12.0f, dy = -7.0f)
                // A 1 1 0 0 0 29 23
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 29.0f,
                    y1 = 23.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 0 -0.5 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -0.86f,
                )
                // M 16 3.16
                moveTo(x = 16.0f, y = 3.16f)
                // L 26.02 9
                lineTo(x = 26.02f, y = 9.0f)
                // L 16 14.84
                lineTo(x = 16.0f, y = 14.84f)
                // L 5.98 9z
                lineTo(x = 5.98f, y = 9.0f)
                close()
                // M 5 10.74
                moveTo(x = 5.0f, y = 10.74f)
                // l 10 5.83
                lineToRelative(dx = 10.0f, dy = 5.83f)
                // v 11.69
                verticalLineToRelative(dy = 11.69f)
                // L 5 22.43z
                lineTo(x = 5.0f, y = 22.43f)
                close()
                // m 12 17.52
                moveToRelative(dx = 12.0f, dy = 17.52f)
                // V 16.57
                verticalLineTo(y = 16.57f)
                // l 10 -5.83
                lineToRelative(dx = 10.0f, dy = -5.83f)
                // v 11.69z
                verticalLineToRelative(dy = 11.69f)
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
        }.build().also { _cube = it }
    }

@Suppress("ObjectPropertyName")
private var _cube: ImageVector? = null
