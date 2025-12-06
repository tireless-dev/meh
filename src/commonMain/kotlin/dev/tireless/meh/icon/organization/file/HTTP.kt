package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HTTP: ImageVector
    get() {
        val current = _hTTP
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.HTTP",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 11 h-5 v10 h2 v-3 h3 a2 2 0 0 0 2 -2 v-3 a2 2 0 0 0 -2 -2 m-3 5 v-3 h3 v3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 11
                moveTo(x = 30.0f, y = 11.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // m -3 5
                moveToRelative(dx = -3.0f, dy = 5.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3z
                verticalLineToRelative(dy = 3.0f)
                close()
            }
            // <polygon points="10.0 13.0 12.0 13.0 12.0 21.0 14.0 21.0 14.0 13.0 16.0 13.0 16.0 11.0 10.0 11.0 10.0 13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // L 12 13
                lineTo(x = 12.0f, y = 13.0f)
                // L 12 21
                lineTo(x = 12.0f, y = 21.0f)
                // L 14 21
                lineTo(x = 14.0f, y = 21.0f)
                // L 14 13
                lineTo(x = 14.0f, y = 13.0f)
                // L 16 13
                lineTo(x = 16.0f, y = 13.0f)
                // L 16 11
                lineTo(x = 16.0f, y = 11.0f)
                // L 10 11
                lineTo(x = 10.0f, y = 11.0f)
                // L 10 13z
                lineTo(x = 10.0f, y = 13.0f)
                close()
            }
            // <polygon points="23.0 11.0 17.0 11.0 17.0 13.0 19.0 13.0 19.0 21.0 21.0 21.0 21.0 13.0 23.0 13.0 23.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 11
                moveTo(x = 23.0f, y = 11.0f)
                // L 17 11
                lineTo(x = 17.0f, y = 11.0f)
                // L 17 13
                lineTo(x = 17.0f, y = 13.0f)
                // L 19 13
                lineTo(x = 19.0f, y = 13.0f)
                // L 19 21
                lineTo(x = 19.0f, y = 21.0f)
                // L 21 21
                lineTo(x = 21.0f, y = 21.0f)
                // L 21 13
                lineTo(x = 21.0f, y = 13.0f)
                // L 23 13
                lineTo(x = 23.0f, y = 13.0f)
                // L 23 11z
                lineTo(x = 23.0f, y = 11.0f)
                close()
            }
            // <polygon points="6.0 11.0 6.0 15.0 3.0 15.0 3.0 11.0 1.0 11.0 1.0 21.0 3.0 21.0 3.0 17.0 6.0 17.0 6.0 21.0 8.0 21.0 8.0 11.0 6.0 11.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // L 6 15
                lineTo(x = 6.0f, y = 15.0f)
                // L 3 15
                lineTo(x = 3.0f, y = 15.0f)
                // L 3 11
                lineTo(x = 3.0f, y = 11.0f)
                // L 1 11
                lineTo(x = 1.0f, y = 11.0f)
                // L 1 21
                lineTo(x = 1.0f, y = 21.0f)
                // L 3 21
                lineTo(x = 3.0f, y = 21.0f)
                // L 3 17
                lineTo(x = 3.0f, y = 17.0f)
                // L 6 17
                lineTo(x = 6.0f, y = 17.0f)
                // L 6 21
                lineTo(x = 6.0f, y = 21.0f)
                // L 8 21
                lineTo(x = 8.0f, y = 21.0f)
                // L 8 11
                lineTo(x = 8.0f, y = 11.0f)
                // L 6 11z
                lineTo(x = 6.0f, y = 11.0f)
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
        }.build().also { _hTTP = it }
    }

@Suppress("ObjectPropertyName")
private var _hTTP: ImageVector? = null
