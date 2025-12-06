package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindyDust: ImageVector
    get() {
        val current = _windyDust
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WindyDust",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 28 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 h-1 v-2 h1 a5 5 0 0 1 0 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 28
                moveTo(x = 23.0f, y = 28.0f)
                // a 5 5 0 0 1 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 3 3 0 1 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 5 5 0 0 1 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
            }
            // <rect width="4" height="2" x="16.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="10.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="4.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 18
                moveTo(x = 4.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M21 15 h-1 v-2 h1 a3 3 0 1 0 -3 -3 h-2 a5 5 0 1 1 5 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 15
                moveTo(x = 21.0f, y = 15.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 3 3 0 1 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 5 5 0 1 1 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
            }
            // <rect width="4" height="2" x="14.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 13
                moveTo(x = 14.0f, y = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="8.0" y="13.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 13
                moveTo(x = 8.0f, y = 13.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
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
        }.build().also { _windyDust = it }
    }

@Suppress("ObjectPropertyName")
private var _windyDust: ImageVector? = null
