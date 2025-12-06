package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GIF: ImageVector
    get() {
        val current = _gIF
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.GIF",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M2 12 v8 a3 3 0 0 0 3 3 h5 v-8 H6 v2 h2 v4 H5 a1 1 0 0 1 -1 -1 v-8 a1 1 0 0 1 1 -1 h5 V9 H5 a3 3 0 0 0 -3 3
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
            }
            // <polygon points="30.0 11.0 30.0 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 17.0 29.0 17.0 29.0 15.0 24.0 15.0 24.0 11.0 30.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 11
                moveTo(x = 30.0f, y = 11.0f)
                // L 30 9
                lineTo(x = 30.0f, y = 9.0f)
                // L 22 9
                lineTo(x = 22.0f, y = 9.0f)
                // L 22 23
                lineTo(x = 22.0f, y = 23.0f)
                // L 24 23
                lineTo(x = 24.0f, y = 23.0f)
                // L 24 17
                lineTo(x = 24.0f, y = 17.0f)
                // L 29 17
                lineTo(x = 29.0f, y = 17.0f)
                // L 29 15
                lineTo(x = 29.0f, y = 15.0f)
                // L 24 15
                lineTo(x = 24.0f, y = 15.0f)
                // L 24 11
                lineTo(x = 24.0f, y = 11.0f)
                // L 30 11z
                lineTo(x = 30.0f, y = 11.0f)
                close()
            }
            // <polygon points="12.0 9.0 12.0 11.0 15.0 11.0 15.0 21.0 12.0 21.0 12.0 23.0 20.0 23.0 20.0 21.0 17.0 21.0 17.0 11.0 20.0 11.0 20.0 9.0 12.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // L 12 11
                lineTo(x = 12.0f, y = 11.0f)
                // L 15 11
                lineTo(x = 15.0f, y = 11.0f)
                // L 15 21
                lineTo(x = 15.0f, y = 21.0f)
                // L 12 21
                lineTo(x = 12.0f, y = 21.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 20 21
                lineTo(x = 20.0f, y = 21.0f)
                // L 17 21
                lineTo(x = 17.0f, y = 21.0f)
                // L 17 11
                lineTo(x = 17.0f, y = 11.0f)
                // L 20 11
                lineTo(x = 20.0f, y = 11.0f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // L 12 9z
                lineTo(x = 12.0f, y = 9.0f)
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
        }.build().also { _gIF = it }
    }

@Suppress("ObjectPropertyName")
private var _gIF: ImageVector? = null
