package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WifiBridge: ImageVector
    get() {
        val current = _wifiBridge
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WifiBridge",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m6.95 20.95 -1.41 -1.41 a5 5 0 0 0 0 -7.08 l1.4 -1.41 a7 7 0 0 1 0 9.9
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6.95 20.95
                moveTo(x = 6.95f, y = 20.95f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // a 5 5 0 0 0 0 -7.08
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -7.08f,
                )
                // l 1.4 -1.41
                lineToRelative(dx = 1.4f, dy = -1.41f)
                // a 7 7 0 0 1 0 9.9
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 9.9f,
                )
            }
            // m10.49 24.49 -1.42 -1.42 a10 10 0 0 0 0 -14.14 L10.5 7.5 a12 12 0 0 1 0 16.98 m14.56 -3.54 a7 7 0 0 1 0 -9.9 l1.41 1.41 a5 5 0 0 0 0 7.08Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.49 24.49
                moveTo(x = 10.49f, y = 24.49f)
                // l -1.42 -1.42
                lineToRelative(dx = -1.42f, dy = -1.42f)
                // a 10 10 0 0 0 0 -14.14
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -14.14f,
                )
                // L 10.5 7.5
                lineTo(x = 10.5f, y = 7.5f)
                // a 12 12 0 0 1 0 16.98
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 16.98f,
                )
                // m 14.56 -3.54
                moveToRelative(dx = 14.56f, dy = -3.54f)
                // a 7 7 0 0 1 0 -9.9
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -9.9f,
                )
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // a 5 5 0 0 0 0 7.08z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 7.08f,
                )
                close()
            }
            // M21.51 24.49 a12 12 0 0 1 0 -16.98 l1.42 1.42 a10 10 0 0 0 0 14.14Z M3 15 H2 V4 H0 v24 h2 V17 h1 a1 1 0 0 0 0 -2 M30 4 v11 h-1 a1 1 0 0 0 0 2 h1 v11 h2 V4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.51 24.49
                moveTo(x = 21.51f, y = 24.49f)
                // a 12 12 0 0 1 0 -16.98
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -16.98f,
                )
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // a 10 10 0 0 0 0 14.14z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 14.14f,
                )
                close()
                // M 3 15
                moveTo(x = 3.0f, y = 15.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 0
                horizontalLineTo(x = 0.0f)
                // v 24
                verticalLineToRelative(dy = 24.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 17
                verticalLineTo(y = 17.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 1 1 0 0 0 0 -2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -2.0f,
                )
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // a 1 1 0 0 0 0 2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4z
                verticalLineTo(y = 4.0f)
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
        }.build().also { _wifiBridge = it }
    }

@Suppress("ObjectPropertyName")
private var _wifiBridge: ImageVector? = null
