package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GeneratePdf: ImageVector
    get() {
        val current = _generatePdf
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.GeneratePdf",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M24 24 v4 H8 v-4 H6 v4 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 24
                moveTo(x = 24.0f, y = 24.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
            }
            // <polygon points="21.0 21.0 19.586 19.586 17.0 22.172 17.0 14.0 15.0 14.0 15.0 22.172 12.414 19.586 11.0 21.0 16.0 26.0 21.0 21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // L 19.586 19.586
                lineTo(x = 19.586f, y = 19.586f)
                // L 17 22.172
                lineTo(x = 17.0f, y = 22.172f)
                // L 17 14
                lineTo(x = 17.0f, y = 14.0f)
                // L 15 14
                lineTo(x = 15.0f, y = 14.0f)
                // L 15 22.172
                lineTo(x = 15.0f, y = 22.172f)
                // L 12.414 19.586
                lineTo(x = 12.414f, y = 19.586f)
                // L 11 21
                lineTo(x = 11.0f, y = 21.0f)
                // L 16 26
                lineTo(x = 16.0f, y = 26.0f)
                // L 21 21z
                lineTo(x = 21.0f, y = 21.0f)
                close()
            }
            // <polygon points="28.0 4.0 28.0 2.0 22.0 2.0 22.0 12.0 24.0 12.0 24.0 8.0 27.0 8.0 27.0 6.0 24.0 6.0 24.0 4.0 28.0 4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 4
                moveTo(x = 28.0f, y = 4.0f)
                // L 28 2
                lineTo(x = 28.0f, y = 2.0f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
                // L 22 12
                lineTo(x = 22.0f, y = 12.0f)
                // L 24 12
                lineTo(x = 24.0f, y = 12.0f)
                // L 24 8
                lineTo(x = 24.0f, y = 8.0f)
                // L 27 8
                lineTo(x = 27.0f, y = 8.0f)
                // L 27 6
                lineTo(x = 27.0f, y = 6.0f)
                // L 24 6
                lineTo(x = 24.0f, y = 6.0f)
                // L 24 4
                lineTo(x = 24.0f, y = 4.0f)
                // L 28 4z
                lineTo(x = 28.0f, y = 4.0f)
                close()
            }
            // M17 12 h-4 V2 h4 a3 3 0 0 1 3 3 v4 a3 3 0 0 1 -3 3 m-2 -2 h2 a1 1 0 0 0 1 -1 V5 a1 1 0 0 0 -1 -1 h-2Z M9 2 H4 v10 h2 V9 h3 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M6 7 V4 h3 v3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 3 3 0 0 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // m -2 -2
                moveToRelative(dx = -2.0f, dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // M 6 7
                moveTo(x = 6.0f, y = 7.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
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
        }.build().also { _generatePdf = it }
    }

@Suppress("ObjectPropertyName")
private var _generatePdf: ImageVector? = null
