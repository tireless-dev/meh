package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JSONReference: ImageVector
    get() {
        val current = _jSONReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.JSONReference",
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
            // <polygon points="29.0 12.0 27.0 6.0 25.0 6.0 25.0 16.0 27.0 16.0 27.0 10.0 29.0 16.0 31.0 16.0 31.0 6.0 29.0 6.0 29.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29 12
                moveTo(x = 29.0f, y = 12.0f)
                // L 27 6
                lineTo(x = 27.0f, y = 6.0f)
                // L 25 6
                lineTo(x = 25.0f, y = 6.0f)
                // L 25 16
                lineTo(x = 25.0f, y = 16.0f)
                // L 27 16
                lineTo(x = 27.0f, y = 16.0f)
                // L 27 10
                lineTo(x = 27.0f, y = 10.0f)
                // L 29 16
                lineTo(x = 29.0f, y = 16.0f)
                // L 31 16
                lineTo(x = 31.0f, y = 16.0f)
                // L 31 6
                lineTo(x = 31.0f, y = 6.0f)
                // L 29 6
                lineTo(x = 29.0f, y = 6.0f)
                // L 29 12z
                lineTo(x = 29.0f, y = 12.0f)
                close()
            }
            // M21.33 6 h-2.66 A1.67 1.67 0 0 0 17 7.67 v6.66 A1.67 1.67 0 0 0 18.67 16 h2.66 A1.67 1.67 0 0 0 23 14.33 V7.67 A1.67 1.67 0 0 0 21.33 6 M21 14 h-2 V8 h2Z M9 7.67 V10 a2 2 0 0 0 2 2 h2 v2 H9 v2 h4.33 A1.67 1.67 0 0 0 15 14.33 V12 a2 2 0 0 0 -2 -2 h-2 V8 h4 V6 h-4.33 A1.67 1.67 0 0 0 9 7.67 M5 14 H3 v-2 H1 v2.33 A1.67 1.67 0 0 0 2.67 16 h2.66 A1.67 1.67 0 0 0 7 14.33 V6 H5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.33 6
                moveTo(x = 21.33f, y = 6.0f)
                // h -2.66
                horizontalLineToRelative(dx = -2.66f)
                // A 1.67 1.67 0 0 0 17 7.67
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 7.67f,
                )
                // v 6.66
                verticalLineToRelative(dy = 6.66f)
                // A 1.67 1.67 0 0 0 18.67 16
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.67f,
                    y1 = 16.0f,
                )
                // h 2.66
                horizontalLineToRelative(dx = 2.66f)
                // A 1.67 1.67 0 0 0 23 14.33
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 23.0f,
                    y1 = 14.33f,
                )
                // V 7.67
                verticalLineTo(y = 7.67f)
                // A 1.67 1.67 0 0 0 21.33 6
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.33f,
                    y1 = 6.0f,
                )
                // M 21 14
                moveTo(x = 21.0f, y = 14.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 9 7.67
                moveTo(x = 9.0f, y = 7.67f)
                // V 10
                verticalLineTo(y = 10.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.33
                horizontalLineToRelative(dx = 4.33f)
                // A 1.67 1.67 0 0 0 15 14.33
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 14.33f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -4.33
                horizontalLineToRelative(dx = -4.33f)
                // A 1.67 1.67 0 0 0 9 7.67
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 7.67f,
                )
                // M 5 14
                moveTo(x = 5.0f, y = 14.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 1
                horizontalLineTo(x = 1.0f)
                // v 2.33
                verticalLineToRelative(dy = 2.33f)
                // A 1.67 1.67 0 0 0 2.67 16
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.67f,
                    y1 = 16.0f,
                )
                // h 2.66
                horizontalLineToRelative(dx = 2.66f)
                // A 1.67 1.67 0 0 0 7 14.33
                arcTo(
                    horizontalEllipseRadius = 1.67f,
                    verticalEllipseRadius = 1.67f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 14.33f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
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
        }.build().also { _jSONReference = it }
    }

@Suppress("ObjectPropertyName")
private var _jSONReference: ImageVector? = null
