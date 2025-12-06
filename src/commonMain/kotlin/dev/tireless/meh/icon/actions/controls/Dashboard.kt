package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dashboard: ImageVector
    get() {
        val current = _dashboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Dashboard",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="5" x="24.0" y="21.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 21
                moveTo(x = 24.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="10" x="20.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 16
                moveTo(x = 20.0f, y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M11 26 a5 5 0 0 1 -5 -5 h2 a3 3 0 1 0 3 -3 v-2 a5 5 0 0 1 0 10
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 26
                moveTo(x = 11.0f, y = 26.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
            // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 9 H14 V4 h14Z M12 4 v7 H4 V4Z M4 28 V13 h24 v15Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // m 0 9
                moveToRelative(dx = 0.0f, dy = 9.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // M 4 28
                moveTo(x = 4.0f, y = 28.0f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 15z
                verticalLineToRelative(dy = 15.0f)
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
        }.build().also { _dashboard = it }
    }

@Suppress("ObjectPropertyName")
private var _dashboard: ImageVector? = null
