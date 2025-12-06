package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chip: ImageVector
    get() {
        val current = _chip
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Chip",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M11 11 v10 h10 V11Z m8 8 h-6 v-6 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 11
                moveTo(x = 11.0f, y = 11.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // V 11z
                verticalLineTo(y = 11.0f)
                close()
                // m 8 8
                moveToRelative(dx = 8.0f, dy = 8.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            // M30 13 v-2 h-4 V8 a2 2 0 0 0 -2 -2 h-3 V2 h-2 v4 h-6 V2 h-2 v4 H8 a2 2 0 0 0 -2 2 v3 H2 v2 h4 v6 H2 v2 h4 v3 a2 2 0 0 0 2 2 h3 v4 h2 v-4 h6 v4 h2 v-4 h3 a2 2 0 0 0 2 -2 v-3 h4 v-2 h-4 v-6Z m-6 11 H8 V8 h16Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 13
                moveTo(x = 30.0f, y = 13.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -6z
                verticalLineToRelative(dy = -6.0f)
                close()
                // m -6 11
                moveToRelative(dx = -6.0f, dy = 11.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 16z
                horizontalLineToRelative(dx = 16.0f)
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
        }.build().also { _chip = it }
    }

@Suppress("ObjectPropertyName")
private var _chip: ImageVector? = null
