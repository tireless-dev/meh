package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileCrash: ImageVector
    get() {
        val current = _mobileCrash
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileCrash",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="30.0 20.0 26.0 16.0 24.5859 17.4141 27.1714 20.0 24.1714 23.0 27.1714 26.0 24.5859 28.5859 26.0 30.0 30.0 26.0 27.0 23.0 30.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 20
                moveTo(x = 30.0f, y = 20.0f)
                // L 26 16
                lineTo(x = 26.0f, y = 16.0f)
                // L 24.5859 17.4141
                lineTo(x = 24.5859f, y = 17.4141f)
                // L 27.1714 20
                lineTo(x = 27.1714f, y = 20.0f)
                // L 24.1714 23
                lineTo(x = 24.1714f, y = 23.0f)
                // L 27.1714 26
                lineTo(x = 27.1714f, y = 26.0f)
                // L 24.5859 28.5859
                lineTo(x = 24.5859f, y = 28.5859f)
                // L 26 30
                lineTo(x = 26.0f, y = 30.0f)
                // L 30 26
                lineTo(x = 30.0f, y = 26.0f)
                // L 27 23
                lineTo(x = 27.0f, y = 23.0f)
                // L 30 20z
                lineTo(x = 30.0f, y = 20.0f)
                close()
            }
            // <polygon points="23.0 20.0 19.0 16.0 17.5859 17.4141 20.1714 20.0 17.1714 23.0 20.1714 26.0 17.5859 28.5859 19.0 30.0 23.0 26.0 20.0 23.0 23.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 20
                moveTo(x = 23.0f, y = 20.0f)
                // L 19 16
                lineTo(x = 19.0f, y = 16.0f)
                // L 17.5859 17.4141
                lineTo(x = 17.5859f, y = 17.4141f)
                // L 20.1714 20
                lineTo(x = 20.1714f, y = 20.0f)
                // L 17.1714 23
                lineTo(x = 17.1714f, y = 23.0f)
                // L 20.1714 26
                lineTo(x = 20.1714f, y = 26.0f)
                // L 17.5859 28.5859
                lineTo(x = 17.5859f, y = 28.5859f)
                // L 19 30
                lineTo(x = 19.0f, y = 30.0f)
                // L 23 26
                lineTo(x = 23.0f, y = 26.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 23 20z
                lineTo(x = 23.0f, y = 20.0f)
                close()
            }
            // M15 28 H9 V8 h14 v6 h2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h6z M9 4 h14 v2 H9z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 28
                moveTo(x = 15.0f, y = 28.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
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
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 9z
                horizontalLineTo(x = 9.0f)
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
        }.build().also { _mobileCrash = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileCrash: ImageVector? = null
