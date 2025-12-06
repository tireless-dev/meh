package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StringInteger: ImageVector
    get() {
        val current = _stringInteger
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.StringInteger",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 12 h-4 v2 h4 v2 h-3 v2 h3 v2 h-4 v2 h4 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-7 10 h-6 v-4 a2 2 0 0 1 2 -2 h2 v-2 h-4 v-2 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v2 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 12
                moveTo(x = 26.0f, y = 12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // m -7 10
                moveToRelative(dx = -7.0f, dy = 10.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
            }
            // <polygon points="8.0 20.0 8.0 12.0 6.0 12.0 6.0 13.0 4.0 13.0 4.0 15.0 6.0 15.0 6.0 20.0 4.0 20.0 4.0 22.0 10.0 22.0 10.0 20.0 8.0 20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 20
                moveTo(x = 8.0f, y = 20.0f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 6 12
                lineTo(x = 6.0f, y = 12.0f)
                // L 6 13
                lineTo(x = 6.0f, y = 13.0f)
                // L 4 13
                lineTo(x = 4.0f, y = 13.0f)
                // L 4 15
                lineTo(x = 4.0f, y = 15.0f)
                // L 6 15
                lineTo(x = 6.0f, y = 15.0f)
                // L 6 20
                lineTo(x = 6.0f, y = 20.0f)
                // L 4 20
                lineTo(x = 4.0f, y = 20.0f)
                // L 4 22
                lineTo(x = 4.0f, y = 22.0f)
                // L 10 22
                lineTo(x = 10.0f, y = 22.0f)
                // L 10 20
                lineTo(x = 10.0f, y = 20.0f)
                // L 8 20z
                lineTo(x = 8.0f, y = 20.0f)
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
        }.build().also { _stringInteger = it }
    }

@Suppress("ObjectPropertyName")
private var _stringInteger: ImageVector? = null
