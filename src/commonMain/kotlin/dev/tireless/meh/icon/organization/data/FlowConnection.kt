package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlowConnection: ImageVector
    get() {
        val current = _flowConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FlowConnection",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 18 h-6 a2 2 0 0 0 -2 2 v2 h-5.59 L10 17.59 V12 h2 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h2 v5.59 l-4.7 4.7 a1 1 0 0 0 0 1.42 l5 5 a1 1 0 0 0 1.4 0 L14.42 24 H20 v2 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 M6 4 h6 v6 H6Z m3 22.59 L5.41 23 9 19.41 12.59 23Z M22 26 v-6 h6 v6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 18
                moveTo(x = 28.0f, y = 18.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5.59
                horizontalLineToRelative(dx = -5.59f)
                // L 10 17.59
                lineTo(x = 10.0f, y = 17.59f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5.59
                verticalLineToRelative(dy = 5.59f)
                // l -4.7 4.7
                lineToRelative(dx = -4.7f, dy = 4.7f)
                // a 1 1 0 0 0 0 1.42
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // L 14.42 24
                lineTo(x = 14.42f, y = 24.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
                // m 3 22.59
                moveToRelative(dx = 3.0f, dy = 22.59f)
                // L 5.41 23
                lineTo(x = 5.41f, y = 23.0f)
                // L 9 19.41
                lineTo(x = 9.0f, y = 19.41f)
                // L 12.59 23z
                lineTo(x = 12.59f, y = 23.0f)
                close()
                // M 22 26
                moveTo(x = 22.0f, y = 26.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6z
                verticalLineToRelative(dy = 6.0f)
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
        }.build().also { _flowConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _flowConnection: ImageVector? = null
