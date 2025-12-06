package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Touch1Down: ImageVector
    get() {
        val current = _touch1Down
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Touch1Down",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M20 24 h-2 a5 5 0 0 1 -10 0 H6 a7 7 0 0 0 14 0
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 24
                moveTo(x = 20.0f, y = 24.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 5 5 0 0 1 -10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 7 7 0 0 0 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
            }
            // M28 14 V8 a7 7 0 0 0 -7 -7 h-5 a6.2 6.2 0 0 0 -4.1 1.57 l-8.02 7.3 a3 3 0 0 0 3.88 4.55 L10 12.9 V24 a3 3 0 0 0 6 0 v-5.18 a2.94 2.94 0 0 0 3.53 -1.22 A3 3 0 0 0 21 18 a3 3 0 0 0 2.53 -1.4 A3 3 0 0 0 25 17 a3 3 0 0 0 3 -3 m-2 0 a1 1 0 0 1 -2 0 v-1 h-2 v2 a1 1 0 0 1 -2 0 v-2 h-2 v3 a1 1 0 0 1 -2 0 v-3 h-2 v11 a1 1 0 0 1 -2 0 V9.1 l-5.4 3.7 a1 1 0 0 1 -1.3 -1.5 l7.94 -7.26 A4.2 4.2 0 0 1 16 3 h5 a5 5 0 0 1 5 5Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 14
                moveTo(x = 28.0f, y = 14.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // a 6.2 6.2 0 0 0 -4.1 1.57
                arcToRelative(
                    a = 6.2f,
                    b = 6.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.1f,
                    dy1 = 1.57f,
                )
                // l -8.02 7.3
                lineToRelative(dx = -8.02f, dy = 7.3f)
                // a 3 3 0 0 0 3.88 4.55
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.88f,
                    dy1 = 4.55f,
                )
                // L 10 12.9
                lineTo(x = 10.0f, y = 12.9f)
                // V 24
                verticalLineTo(y = 24.0f)
                // a 3 3 0 0 0 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v -5.18
                verticalLineToRelative(dy = -5.18f)
                // a 2.94 2.94 0 0 0 3.53 -1.22
                arcToRelative(
                    a = 2.94f,
                    b = 2.94f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.53f,
                    dy1 = -1.22f,
                )
                // A 3 3 0 0 0 21 18
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 18.0f,
                )
                // a 3 3 0 0 0 2.53 -1.4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.53f,
                    dy1 = -1.4f,
                )
                // A 3 3 0 0 0 25 17
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 25.0f,
                    y1 = 17.0f,
                )
                // a 3 3 0 0 0 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 1 1 0 0 1 -2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 9.1
                verticalLineTo(y = 9.1f)
                // l -5.4 3.7
                lineToRelative(dx = -5.4f, dy = 3.7f)
                // a 1 1 0 0 1 -1.3 -1.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.3f,
                    dy1 = -1.5f,
                )
                // l 7.94 -7.26
                lineToRelative(dx = 7.94f, dy = -7.26f)
                // A 4.2 4.2 0 0 1 16 3
                arcTo(
                    horizontalEllipseRadius = 4.2f,
                    verticalEllipseRadius = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 3.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
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
        }.build().also { _touch1Down = it }
    }

@Suppress("ObjectPropertyName")
private var _touch1Down: ImageVector? = null
