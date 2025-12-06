package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Upgrade: ImageVector
    get() {
        val current = _upgrade
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Upgrade",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 24 H11 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 m0 4 H11 v-2 h10Z m7.7 -13.7 -12 -12 a1 1 0 0 0 -1.4 0 l-12 12 A1 1 0 0 0 4 16 h5 v4 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 v-4 h5 a1 1 0 0 0 .7 -1.7 M21 14 v6 H11 v-6 H6.41 L16 4.41 25.59 14Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 24
                moveTo(x = 21.0f, y = 24.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
                // m 7.7 -13.7
                moveToRelative(dx = 7.7f, dy = -13.7f)
                // l -12 -12
                lineToRelative(dx = -12.0f, dy = -12.0f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -12 12
                lineToRelative(dx = -12.0f, dy = 12.0f)
                // A 1 1 0 0 0 4 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 16.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
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
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 1 1 0 0 0 0.7 -1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.7f,
                )
                // M 21 14
                moveTo(x = 21.0f, y = 14.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 6.41
                horizontalLineTo(x = 6.41f)
                // L 16 4.41
                lineTo(x = 16.0f, y = 4.41f)
                // L 25.59 14z
                lineTo(x = 25.59f, y = 14.0f)
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
        }.build().also { _upgrade = it }
    }

@Suppress("ObjectPropertyName")
private var _upgrade: ImageVector? = null
