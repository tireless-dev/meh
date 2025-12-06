package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InstanceCx: ImageVector
    get() {
        val current = _instanceCx
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.InstanceCx",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="9.0" cy="27.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 27
                moveTo(x = 9.0f, y = 27.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <polygon points="22.0 5.0 20.0 5.0 18.0 8.897 16.0 5.0 14.0 5.0 16.905 10.0 14.0 15.0 16.0 15.0 18.0 11.201 20.0 15.0 22.0 15.0 19.098 10.0 22.0 5.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
                // L 20 5
                lineTo(x = 20.0f, y = 5.0f)
                // L 18 8.897
                lineTo(x = 18.0f, y = 8.897f)
                // L 16 5
                lineTo(x = 16.0f, y = 5.0f)
                // L 14 5
                lineTo(x = 14.0f, y = 5.0f)
                // L 16.905 10
                lineTo(x = 16.905f, y = 10.0f)
                // L 14 15
                lineTo(x = 14.0f, y = 15.0f)
                // L 16 15
                lineTo(x = 16.0f, y = 15.0f)
                // L 18 11.201
                lineTo(x = 18.0f, y = 11.201f)
                // L 20 15
                lineTo(x = 20.0f, y = 15.0f)
                // L 22 15
                lineTo(x = 22.0f, y = 15.0f)
                // L 19.098 10
                lineTo(x = 19.098f, y = 10.0f)
                // L 22 5z
                lineTo(x = 22.0f, y = 5.0f)
                close()
            }
            // M12 15 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h6 v2 H6 v9 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            // <rect width="4" height="2" x="2.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 18
                moveTo(x = 2.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="8.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 18
                moveTo(x = 8.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="14.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 18
                moveTo(x = 14.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="20.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 18
                moveTo(x = 20.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <rect width="4" height="2" x="26.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 18
                moveTo(x = 26.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M26 31 H6 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M6 25 v4 h20 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 31
                moveTo(x = 26.0f, y = 31.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // M 6 25
                moveTo(x = 6.0f, y = 25.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
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
        }.build().also { _instanceCx = it }
    }

@Suppress("ObjectPropertyName")
private var _instanceCx: ImageVector? = null
