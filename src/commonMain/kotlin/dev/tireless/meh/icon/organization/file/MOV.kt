package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MOV: ImageVector
    get() {
        val current = _mOV
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MOV",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="28.0 9.0 26.0 22.0 24.0 9.0 22.0 9.0 24.52 23.0 27.48 23.0 30.0 9.0 28.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 9
                moveTo(x = 28.0f, y = 9.0f)
                // L 26 22
                lineTo(x = 26.0f, y = 22.0f)
                // L 24 9
                lineTo(x = 24.0f, y = 9.0f)
                // L 22 9
                lineTo(x = 22.0f, y = 9.0f)
                // L 24.52 23
                lineTo(x = 24.52f, y = 23.0f)
                // L 27.48 23
                lineTo(x = 27.48f, y = 23.0f)
                // L 30 9
                lineTo(x = 30.0f, y = 9.0f)
                // L 28 9z
                lineTo(x = 28.0f, y = 9.0f)
                close()
            }
            // M18 23 h-4 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v10 a2 2 0 0 1 -2 2 m-4 -12 v10 h4 V11Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 23
                moveTo(x = 18.0f, y = 23.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // V 11
                verticalLineTo(y = 11.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // m -4 -12
                moveToRelative(dx = -4.0f, dy = -12.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 11z
                verticalLineTo(y = 11.0f)
                close()
            }
            // <polygon points="8.0 9.0 6.49 14.0 6.0 15.98 5.54 14.0 4.0 9.0 2.0 9.0 2.0 23.0 4.0 23.0 4.0 15.0 3.84 13.0 4.42 15.0 6.0 19.63 7.58 15.0 8.16 13.0 8.0 15.0 8.0 23.0 10.0 23.0 10.0 9.0 8.0 9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 9
                moveTo(x = 8.0f, y = 9.0f)
                // L 6.49 14
                lineTo(x = 6.49f, y = 14.0f)
                // L 6 15.98
                lineTo(x = 6.0f, y = 15.98f)
                // L 5.54 14
                lineTo(x = 5.54f, y = 14.0f)
                // L 4 9
                lineTo(x = 4.0f, y = 9.0f)
                // L 2 9
                lineTo(x = 2.0f, y = 9.0f)
                // L 2 23
                lineTo(x = 2.0f, y = 23.0f)
                // L 4 23
                lineTo(x = 4.0f, y = 23.0f)
                // L 4 15
                lineTo(x = 4.0f, y = 15.0f)
                // L 3.84 13
                lineTo(x = 3.84f, y = 13.0f)
                // L 4.42 15
                lineTo(x = 4.42f, y = 15.0f)
                // L 6 19.63
                lineTo(x = 6.0f, y = 19.63f)
                // L 7.58 15
                lineTo(x = 7.58f, y = 15.0f)
                // L 8.16 13
                lineTo(x = 8.16f, y = 13.0f)
                // L 8 15
                lineTo(x = 8.0f, y = 15.0f)
                // L 8 23
                lineTo(x = 8.0f, y = 23.0f)
                // L 10 23
                lineTo(x = 10.0f, y = 23.0f)
                // L 10 9
                lineTo(x = 10.0f, y = 9.0f)
                // L 8 9z
                lineTo(x = 8.0f, y = 9.0f)
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
        }.build().also { _mOV = it }
    }

@Suppress("ObjectPropertyName")
private var _mOV: ImageVector? = null
