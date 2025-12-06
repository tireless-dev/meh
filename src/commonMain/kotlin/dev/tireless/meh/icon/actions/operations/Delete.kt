package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Delete: ImageVector
    get() {
        val current = _delete
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Delete",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M29 26 H12 a1 1 0 0 1 -.7 -.3 l-9 -9 a1 1 0 0 1 0 -1.4 l9 -9 A1 1 0 0 1 12 6 h17 a1 1 0 0 1 1 1 v18 a1 1 0 0 1 -1 1 m-16.59 -2 H28 V8 H12.41 l-8 8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 26
                moveTo(x = 29.0f, y = 26.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 1 1 0 0 1 -0.7 -0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -0.3f,
                )
                // l -9 -9
                lineToRelative(dx = -9.0f, dy = -9.0f)
                // a 1 1 0 0 1 0 -1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                )
                // l 9 -9
                lineToRelative(dx = 9.0f, dy = -9.0f)
                // A 1 1 0 0 1 12 6
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 6.0f,
                )
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // m -16.59 -2
                moveToRelative(dx = -16.59f, dy = -2.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // H 12.41
                horizontalLineTo(x = 12.41f)
                // l -8 8z
                lineToRelative(dx = -8.0f, dy = 8.0f)
                close()
            }
            // <polygon points="20.4141 16.0 25.0 11.4141 23.5859 10.0 19.0 14.5859 14.4143 10.0 13.0 11.4141 17.5859 16.0 13.0 20.5859 14.4143 22.0 19.0 17.4141 23.5859 22.0 25.0 20.5859 20.4141 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20.4141 16
                moveTo(x = 20.4141f, y = 16.0f)
                // L 25 11.4141
                lineTo(x = 25.0f, y = 11.4141f)
                // L 23.5859 10
                lineTo(x = 23.5859f, y = 10.0f)
                // L 19 14.5859
                lineTo(x = 19.0f, y = 14.5859f)
                // L 14.4143 10
                lineTo(x = 14.4143f, y = 10.0f)
                // L 13 11.4141
                lineTo(x = 13.0f, y = 11.4141f)
                // L 17.5859 16
                lineTo(x = 17.5859f, y = 16.0f)
                // L 13 20.5859
                lineTo(x = 13.0f, y = 20.5859f)
                // L 14.4143 22
                lineTo(x = 14.4143f, y = 22.0f)
                // L 19 17.4141
                lineTo(x = 19.0f, y = 17.4141f)
                // L 23.5859 22
                lineTo(x = 23.5859f, y = 22.0f)
                // L 25 20.5859
                lineTo(x = 25.0f, y = 20.5859f)
                // L 20.4141 16z
                lineTo(x = 20.4141f, y = 16.0f)
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
        }.build().also { _delete = it }
    }

@Suppress("ObjectPropertyName")
private var _delete: ImageVector? = null
