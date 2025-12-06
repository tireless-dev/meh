package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockedAndBlocked: ImageVector
    get() {
        val current = _lockedAndBlocked
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.LockedAndBlocked",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30.45 20.1 A1 1 0 0 0 30 20 H20 a1 1 0 0 0 -.92 1.38 l5.03 10.06 a1 1 0 0 0 1.78 0 l5 -10 a1 1 0 0 0 -.44 -1.34 M8 16 h16 v2 h2 v-2 a2 2 0 0 0 -2 -2 h-2 V8 a6 6 0 0 0 -12 0 v6 H8 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h11 v-2 H8z m4 -8 a4 4 0 1 1 8 0 v6 h-8z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30.45 20.1
                moveTo(x = 30.45f, y = 20.1f)
                // A 1 1 0 0 0 30 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 20.0f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // a 1 1 0 0 0 -0.92 1.38
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.92f,
                    dy1 = 1.38f,
                )
                // l 5.03 10.06
                lineToRelative(dx = 5.03f, dy = 10.06f)
                // a 1 1 0 0 0 1.78 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                // l 5 -10
                lineToRelative(dx = 5.0f, dy = -10.0f)
                // a 1 1 0 0 0 -0.44 -1.34
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.44f,
                    dy1 = -1.34f,
                )
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 6 6 0 0 0 -12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 8z
                horizontalLineTo(x = 8.0f)
                close()
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h -8z
                horizontalLineToRelative(dx = -8.0f)
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
        }.build().also { _lockedAndBlocked = it }
    }

@Suppress("ObjectPropertyName")
private var _lockedAndBlocked: ImageVector? = null
