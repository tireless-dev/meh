package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PNG: ImageVector
    get() {
        val current = _pNG
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PNG",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 23 h-6 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 h-6 v10 h4 v-4 h-2 v-2 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 23
                moveTo(x = 30.0f, y = 23.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // <polygon points="18.0 19.0 14.32 9.0 12.0 9.0 12.0 23.0 14.0 23.0 14.0 13.0 17.68 23.0 20.0 23.0 20.0 9.0 18.0 9.0 18.0 19.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 19
                moveTo(x = 18.0f, y = 19.0f)
                // L 14.32 9
                lineTo(x = 14.32f, y = 9.0f)
                // L 12 9
                lineTo(x = 12.0f, y = 9.0f)
                // L 12 23
                lineTo(x = 12.0f, y = 23.0f)
                // L 14 23
                lineTo(x = 14.0f, y = 23.0f)
                // L 14 13
                lineTo(x = 14.0f, y = 13.0f)
                // L 17.68 23
                lineTo(x = 17.68f, y = 23.0f)
                // L 20 23
                lineTo(x = 20.0f, y = 23.0f)
                // L 20 9
                lineTo(x = 20.0f, y = 9.0f)
                // L 18 9
                lineTo(x = 18.0f, y = 9.0f)
                // L 18 19z
                lineTo(x = 18.0f, y = 19.0f)
                close()
            }
            // M4 23 H2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 H4Z m0 -7 h4 v-5 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 23
                moveTo(x = 4.0f, y = 23.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _pNG = it }
    }

@Suppress("ObjectPropertyName")
private var _pNG: ImageVector? = null
