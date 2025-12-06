package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PDFReference: ImageVector
    get() {
        val current = _pDFReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PDFReference",
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
            // <polygon points="22.0 16.0 24.0 16.0 24.0 10.0 29.0 10.0 29.0 8.0 24.0 8.0 24.0 4.0 30.0 4.0 30.0 2.0 22.0 2.0 22.0 16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 16
                moveTo(x = 22.0f, y = 16.0f)
                // L 24 16
                lineTo(x = 24.0f, y = 16.0f)
                // L 24 10
                lineTo(x = 24.0f, y = 10.0f)
                // L 29 10
                lineTo(x = 29.0f, y = 10.0f)
                // L 29 8
                lineTo(x = 29.0f, y = 8.0f)
                // L 24 8
                lineTo(x = 24.0f, y = 8.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 30 4
                lineTo(x = 30.0f, y = 4.0f)
                // L 30 2
                lineTo(x = 30.0f, y = 2.0f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
                // L 22 16z
                lineTo(x = 22.0f, y = 16.0f)
                close()
            }
            // M16 2 h-4 v14 h4 a4 4 0 0 0 4 -4 V6 a4 4 0 0 0 -4 -4 m2 10 a2 2 0 0 1 -2 2 h-2 V4 h2 a2 2 0 0 1 2 2Z M8 2 H2 v14 h2 v-5 h4 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 7 H4 V4 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 4 4 0 0 0 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 0 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // m 2 10
                moveToRelative(dx = 2.0f, dy = 10.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _pDFReference = it }
    }

@Suppress("ObjectPropertyName")
private var _pDFReference: ImageVector? = null
