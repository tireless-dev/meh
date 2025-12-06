package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileViewOrientation: ImageVector
    get() {
        val current = _mobileViewOrientation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MobileViewOrientation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 12 h-8 v2 h8 v14 h-8 v2 h8 a2 2 0 0 0 2 -2 V14 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // V 14
                verticalLineTo(y = 14.0f)
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
            }
            // m19 16 -1.41 1.41 L20.17 20 H16 a4 4 0 0 1 -4 -4 v-2 h-2 v2 a6 6 0 0 0 6 6 h4.17 l-2.58 2.59 L19 26 l5 -5z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 16
                moveTo(x = 19.0f, y = 16.0f)
                // l -1.41 1.41
                lineToRelative(dx = -1.41f, dy = 1.41f)
                // L 20.17 20
                lineTo(x = 20.17f, y = 20.0f)
                // H 16
                horizontalLineTo(x = 16.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 6 6 0 0 0 6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 6.0f,
                )
                // h 4.17
                horizontalLineToRelative(dx = 4.17f)
                // l -2.58 2.59
                lineToRelative(dx = -2.58f, dy = 2.59f)
                // L 19 26
                lineTo(x = 19.0f, y = 26.0f)
                // l 5 -5z
                lineToRelative(dx = 5.0f, dy = -5.0f)
                close()
            }
            // M12 28 H6 V8 h16 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h6z M6 4 h14 v2 H6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12 28
                moveTo(x = 12.0f, y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
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
        }.build().also { _mobileViewOrientation = it }
    }

@Suppress("ObjectPropertyName")
private var _mobileViewOrientation: ImageVector? = null
