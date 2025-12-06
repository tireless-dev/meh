package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectionTwoWay: ImageVector
    get() {
        val current = _connectionTwoWay
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ConnectionTwoWay",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="4" x="8.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="8.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="14.0" y="8.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="14.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="8.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 20
                moveTo(x = 8.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="14.0" y="20.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <polygon points="30.0 22.0 21.83 22.0 24.41 24.59 23.0 26.0 18.0 21.0 23.0 16.0 24.41 17.41 21.83 20.0 30.0 20.0 30.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 22
                moveTo(x = 30.0f, y = 22.0f)
                // L 21.83 22
                lineTo(x = 21.83f, y = 22.0f)
                // L 24.41 24.59
                lineTo(x = 24.41f, y = 24.59f)
                // L 23 26
                lineTo(x = 23.0f, y = 26.0f)
                // L 18 21
                lineTo(x = 18.0f, y = 21.0f)
                // L 23 16
                lineTo(x = 23.0f, y = 16.0f)
                // L 24.41 17.41
                lineTo(x = 24.41f, y = 17.41f)
                // L 21.83 20
                lineTo(x = 21.83f, y = 20.0f)
                // L 30 20
                lineTo(x = 30.0f, y = 20.0f)
                // L 30 22z
                lineTo(x = 30.0f, y = 22.0f)
                close()
            }
            // <polygon points="19.0 12.0 27.17 12.0 24.59 14.59 26.0 16.0 31.0 11.0 26.0 6.0 24.59 7.41 27.17 10.0 19.0 10.0 19.0 12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // L 27.17 12
                lineTo(x = 27.17f, y = 12.0f)
                // L 24.59 14.59
                lineTo(x = 24.59f, y = 14.59f)
                // L 26 16
                lineTo(x = 26.0f, y = 16.0f)
                // L 31 11
                lineTo(x = 31.0f, y = 11.0f)
                // L 26 6
                lineTo(x = 26.0f, y = 6.0f)
                // L 24.59 7.41
                lineTo(x = 24.59f, y = 7.41f)
                // L 27.17 10
                lineTo(x = 27.17f, y = 10.0f)
                // L 19 10
                lineTo(x = 19.0f, y = 10.0f)
                // L 19 12z
                lineTo(x = 19.0f, y = 12.0f)
                close()
            }
            // M28 26 v2 H4 V4 h16 v2 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v26 h28 v-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 26
                moveTo(x = 28.0f, y = 26.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
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
        }.build().also { _connectionTwoWay = it }
    }

@Suppress("ObjectPropertyName")
private var _connectionTwoWay: ImageVector? = null
