package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentDownload: ImageVector
    get() {
        val current = _documentDownload
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DocumentDownload",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 25.0 28.586 23.586 26.0 26.172 26.0 18.0 24.0 18.0 24.0 26.172 21.414 23.586 20.0 25.0 25.0 30.0 30.0 25.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 25
                moveTo(x = 30.0f, y = 25.0f)
                // L 28.586 23.586
                lineTo(x = 28.586f, y = 23.586f)
                // L 26 26.172
                lineTo(x = 26.0f, y = 26.172f)
                // L 26 18
                lineTo(x = 26.0f, y = 18.0f)
                // L 24 18
                lineTo(x = 24.0f, y = 18.0f)
                // L 24 26.172
                lineTo(x = 24.0f, y = 26.172f)
                // L 21.414 23.586
                lineTo(x = 21.414f, y = 23.586f)
                // L 20 25
                lineTo(x = 20.0f, y = 25.0f)
                // L 25 30
                lineTo(x = 25.0f, y = 30.0f)
                // L 30 25z
                lineTo(x = 30.0f, y = 25.0f)
                close()
            }
            // M18 28 H8 V4 h8 v6 a2 2 0 0 0 2 2 h6 v3 h2 v-5 a1 1 0 0 0 -.3 -.7 l-7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h10Z m0 -23.6 5.6 5.6 H18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 1 1 0 0 0 -0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.7f,
                )
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // A 1 1 0 0 0 18 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 2.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
                // m 0 -23.6
                moveToRelative(dx = 0.0f, dy = -23.6f)
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
                // H 18z
                horizontalLineTo(x = 18.0f)
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
        }.build().also { _documentDownload = it }
    }

@Suppress("ObjectPropertyName")
private var _documentDownload: ImageVector? = null
