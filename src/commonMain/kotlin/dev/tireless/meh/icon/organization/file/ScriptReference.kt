package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScriptReference: ImageVector
    get() {
        val current = _scriptReference
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ScriptReference",
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
            // <polygon points="27.17 26.0 24.59 28.58 26.0 30.0 30.0 26.0 26.0 22.0 24.58 23.41 27.17 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.17 26
                moveTo(x = 27.17f, y = 26.0f)
                // L 24.59 28.58
                lineTo(x = 24.59f, y = 28.58f)
                // L 26 30
                lineTo(x = 26.0f, y = 30.0f)
                // L 30 26
                lineTo(x = 30.0f, y = 26.0f)
                // L 26 22
                lineTo(x = 26.0f, y = 22.0f)
                // L 24.58 23.41
                lineTo(x = 24.58f, y = 23.41f)
                // L 27.17 26z
                lineTo(x = 27.17f, y = 26.0f)
                close()
            }
            // <polygon points="18.83 26.0 21.41 23.42 20.0 22.0 16.0 26.0 20.0 30.0 21.42 28.59 18.83 26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18.83 26
                moveTo(x = 18.83f, y = 26.0f)
                // L 21.41 23.42
                lineTo(x = 21.41f, y = 23.42f)
                // L 20 22
                lineTo(x = 20.0f, y = 22.0f)
                // L 16 26
                lineTo(x = 16.0f, y = 26.0f)
                // L 20 30
                lineTo(x = 20.0f, y = 30.0f)
                // L 21.42 28.59
                lineTo(x = 21.42f, y = 28.59f)
                // L 18.83 26z
                lineTo(x = 18.83f, y = 26.0f)
                close()
            }
            // m25.7 9.3 -7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v12 h2 V4 h8 v6 a2 2 0 0 0 2 2 h6 v6 h2 v-8 a1 1 0 0 0 -.3 -.7 M18 10 V4.4 l5.6 5.6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25.7 9.3
                moveTo(x = 25.7f, y = 9.3f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
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
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // V 4.4
                verticalLineTo(y = 4.4f)
                // l 5.6 5.6z
                lineToRelative(dx = 5.6f, dy = 5.6f)
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
        }.build().also { _scriptReference = it }
    }

@Suppress("ObjectPropertyName")
private var _scriptReference: ImageVector? = null
