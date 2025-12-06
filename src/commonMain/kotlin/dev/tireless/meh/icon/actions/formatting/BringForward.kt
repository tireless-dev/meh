package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BringForward: ImageVector
    get() {
        val current = _bringForward
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BringForward",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M12 15 h-2 v-3 a2 2 0 0 1 2 -2 h3 v2 h-3Z m3 15 h-3 a2 2 0 0 1 -2 -2 v-3 h2 v3 h3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 3 15
                moveToRelative(dx = 3.0f, dy = 15.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
            }
            // <rect width="4" height="2" x="18.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 28
                moveTo(x = 18.0f, y = 28.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M28 30 h-3 v-2 h3 v-3 h2 v3 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
            }
            // <rect width="2" height="4" x="10.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 18
                moveTo(x = 10.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="28.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 18
                moveTo(x = 28.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M30 15 h-2 v-3 h-3 v-2 h3 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 15
                moveTo(x = 30.0f, y = 15.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 2 2 0 0 1 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
            }
            // <rect width="4" height="2" x="18.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M8 22 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v4 h-2 V4 H4 v16 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _bringForward = it }
    }

@Suppress("ObjectPropertyName")
private var _bringForward: ImageVector? = null
