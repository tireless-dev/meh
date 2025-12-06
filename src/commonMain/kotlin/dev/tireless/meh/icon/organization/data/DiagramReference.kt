package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiagramReference: ImageVector
    get() {
        val current = _diagramReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DiagramReference",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 8.586 22
                lineTo(x = 8.586f, y = 22.0f)
                // L 2 28.586
                lineTo(x = 2.0f, y = 28.586f)
                // L 3.414 30
                lineTo(x = 3.414f, y = 30.0f)
                // L 10 23.414
                lineTo(x = 10.0f, y = 23.414f)
                // L 10 28
                lineTo(x = 10.0f, y = 28.0f)
                // L 12 28
                lineTo(x = 12.0f, y = 28.0f)
                // L 12 20
                lineTo(x = 12.0f, y = 20.0f)
                // L 4 20z
                lineTo(x = 4.0f, y = 20.0f)
                close()
            }
            // M15 28 v-2 a9 9 0 0 0 8.94 -8 H16 a2 2 0 0 1 -2 -2 V8.06 A9 9 0 0 0 6 17 H4 A11 11 0 0 1 15 6 a1 1 0 0 1 1 1 v9 h9 a1 1 0 0 1 1 1 11 11 0 0 1 -11 11
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 28
                moveTo(x = 15.0f, y = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 9 9 0 0 0 8.94 -8
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.94f,
                    dy1 = -8.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
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
                // V 8.06
                verticalLineTo(y = 8.06f)
                // A 9 9 0 0 0 6 17
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 17.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // A 11 11 0 0 1 15 6
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 6.0f,
                )
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
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
                // a 11 11 0 0 1 -11 11
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -11.0f,
                    dy1 = 11.0f,
                )
            }
            // M29 14 h-9 a2 2 0 0 1 -2 -2 V3 a1 1 0 0 1 1.02 -1 A11 11 0 0 1 30 12.98 1 1 0 0 1 29 14 m-9 -2 h7.94 A9 9 0 0 0 20 4.06Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 14
                moveTo(x = 29.0f, y = 14.0f)
                // h -9
                horizontalLineToRelative(dx = -9.0f)
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
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1.02 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.02f,
                    dy1 = -1.0f,
                )
                // A 11 11 0 0 1 30 12.98
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 30.0f,
                    y1 = 12.98f,
                )
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
                // m -9 -2
                moveToRelative(dx = -9.0f, dy = -2.0f)
                // h 7.94
                horizontalLineToRelative(dx = 7.94f)
                // A 9 9 0 0 0 20 4.06z
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 4.06f,
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
        }.build().also { _diagramReference = it }
    }

@Suppress("ObjectPropertyName")
private var _diagramReference: ImageVector? = null
