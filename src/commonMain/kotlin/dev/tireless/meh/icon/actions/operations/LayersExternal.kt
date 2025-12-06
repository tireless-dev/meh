package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LayersExternal: ImageVector
    get() {
        val current = _layersExternal
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LayersExternal",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M16 24 a1 1 0 0 1 -.47 -.12 l-13 -7 .94 -1.76 L16 21.86 l12.53 -6.74 .94 1.76 -13 7 A1 1 0 0 1 16 24
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 24
                moveTo(x = 16.0f, y = 24.0f)
                // a 1 1 0 0 1 -0.47 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.12f,
                )
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // L 16 21.86
                lineTo(x = 16.0f, y = 21.86f)
                // l 12.53 -6.74
                lineToRelative(dx = 12.53f, dy = -6.74f)
                // l 0.94 1.76
                lineToRelative(dx = 0.94f, dy = 1.76f)
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 1 16 24
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 24.0f,
                )
            }
            // M16 30 a1 1 0 0 1 -.47 -.12 l-13 -7 .94 -1.76 L16 27.86 l12.53 -6.74 .94 1.76 -13 7 A1 1 0 0 1 16 30 M29.47 9.12 16 1.86 v2.28 L26.9 10 16 15.86 v2.28 l13.47 -7.26 a1 1 0 0 0 0 -1.76 M4.41 9.42 8 5.81 V14 h2 V5.83 l3.59 3.58 L15 8 9 2 3 8z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 30
                moveTo(x = 16.0f, y = 30.0f)
                // a 1 1 0 0 1 -0.47 -0.12
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.47f,
                    dy1 = -0.12f,
                )
                // l -13 -7
                lineToRelative(dx = -13.0f, dy = -7.0f)
                // l 0.94 -1.76
                lineToRelative(dx = 0.94f, dy = -1.76f)
                // L 16 27.86
                lineTo(x = 16.0f, y = 27.86f)
                // l 12.53 -6.74
                lineToRelative(dx = 12.53f, dy = -6.74f)
                // l 0.94 1.76
                lineToRelative(dx = 0.94f, dy = 1.76f)
                // l -13 7
                lineToRelative(dx = -13.0f, dy = 7.0f)
                // A 1 1 0 0 1 16 30
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 30.0f,
                )
                // M 29.47 9.12
                moveTo(x = 29.47f, y = 9.12f)
                // L 16 1.86
                lineTo(x = 16.0f, y = 1.86f)
                // v 2.28
                verticalLineToRelative(dy = 2.28f)
                // L 26.9 10
                lineTo(x = 26.9f, y = 10.0f)
                // L 16 15.86
                lineTo(x = 16.0f, y = 15.86f)
                // v 2.28
                verticalLineToRelative(dy = 2.28f)
                // l 13.47 -7.26
                lineToRelative(dx = 13.47f, dy = -7.26f)
                // a 1 1 0 0 0 0 -1.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.76f,
                )
                // M 4.41 9.42
                moveTo(x = 4.41f, y = 9.42f)
                // L 8 5.81
                lineTo(x = 8.0f, y = 5.81f)
                // V 14
                verticalLineTo(y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 5.83
                verticalLineTo(y = 5.83f)
                // l 3.59 3.58
                lineToRelative(dx = 3.59f, dy = 3.58f)
                // L 15 8
                lineTo(x = 15.0f, y = 8.0f)
                // L 9 2
                lineTo(x = 9.0f, y = 2.0f)
                // L 3 8z
                lineTo(x = 3.0f, y = 8.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _layersExternal = it }
    }

@Suppress("ObjectPropertyName")
private var _layersExternal: ImageVector? = null
