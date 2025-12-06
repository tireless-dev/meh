package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendBackward: ImageVector
    get() {
        val current = _sendBackward
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SendBackward",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M4 7 H2 V4 a2 2 0 0 1 2 -2 h3 v2 H4Z m3 15 H4 a2 2 0 0 1 -2 -2 v-3 h2 v3 h3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 7
                moveTo(x = 4.0f, y = 7.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
                close()
                // m 3 15
                moveToRelative(dx = 3.0f, dy = 15.0f)
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
            // <rect width="2" height="4" x="2.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M22 7 h-2 V4 h-3 V2 h3 a2 2 0 0 1 2 2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
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
            // <rect width="4" height="2" x="10.0" y="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M28 30 H12 a2 2 0 0 1 -2 -2 V12 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M12 12 v16 h16 V12Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 30
                moveTo(x = 28.0f, y = 30.0f)
                // H 12
                horizontalLineTo(x = 12.0f)
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
                // V 12
                verticalLineTo(y = 12.0f)
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
                // v 16
                verticalLineToRelative(dy = 16.0f)
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
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // V 12z
                verticalLineTo(y = 12.0f)
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
        }.build().also { _sendBackward = it }
    }

@Suppress("ObjectPropertyName")
private var _sendBackward: ImageVector? = null
