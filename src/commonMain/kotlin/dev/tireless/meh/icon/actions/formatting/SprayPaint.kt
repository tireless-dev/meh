package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SprayPaint: ImageVector
    get() {
        val current = _sprayPaint
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SprayPaint",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M22.5 23 a4.5 4.5 0 1 1 4.5 -4.5 4.5 4.5 0 0 1 -4.5 4.5 m0 -7 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22.5 23
                moveTo(x = 22.5f, y = 23.0f)
                // a 4.5 4.5 0 1 1 4.5 -4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.5f,
                    dy1 = -4.5f,
                )
                // a 4.5 4.5 0 0 1 -4.5 4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.5f,
                    dy1 = 4.5f,
                )
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // a 2.5 2.5 0 1 0 2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = 2.5f,
                )
                // a 2.5 2.5 0 0 0 -2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
            }
            // M28 8 h-2 V3 h-7 v5 h-2 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h11 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 m-7 -3 h3 v3 h-3Z m-4 23 V10 h11 v18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 8
                moveTo(x = 28.0f, y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
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
                // h 11
                horizontalLineToRelative(dx = 11.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
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
                // m -7 -3
                moveToRelative(dx = -7.0f, dy = -3.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m -4 23
                moveToRelative(dx = -4.0f, dy = 23.0f)
                // V 10
                verticalLineTo(y = 10.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // v 18z
                verticalLineToRelative(dy = 18.0f)
                close()
            }
            // <rect width="3" height="3" x="2.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="3" x="7.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 9
                moveTo(x = 7.0f, y = 9.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="3" x="2.0" y="9.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="3" x="12.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="3" x="7.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 4
                moveTo(x = 7.0f, y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
            }
            // <rect width="3" height="3" x="2.0" y="4.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
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
        }.build().also { _sprayPaint = it }
    }

@Suppress("ObjectPropertyName")
private var _sprayPaint: ImageVector? = null
