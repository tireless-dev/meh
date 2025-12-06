package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monster: ImageVector
    get() {
        val current = _monster
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Monster",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <polygon points="23.0 22.0 21.0 22.0 21.0 20.0 19.0 20.0 19.0 22.0 17.0 22.0 17.0 20.0 15.0 20.0 15.0 22.0 13.0 22.0 13.0 20.0 11.0 20.0 11.0 22.0 9.0 22.0 9.0 24.0 11.0 24.0 11.0 26.0 13.0 26.0 13.0 24.0 15.0 24.0 15.0 26.0 17.0 26.0 17.0 24.0 19.0 24.0 19.0 26.0 21.0 26.0 21.0 24.0 23.0 24.0 23.0 22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 22
                moveTo(x = 23.0f, y = 22.0f)
                // L 21 22
                lineTo(x = 21.0f, y = 22.0f)
                // L 21 20
                lineTo(x = 21.0f, y = 20.0f)
                // L 19 20
                lineTo(x = 19.0f, y = 20.0f)
                // L 19 22
                lineTo(x = 19.0f, y = 22.0f)
                // L 17 22
                lineTo(x = 17.0f, y = 22.0f)
                // L 17 20
                lineTo(x = 17.0f, y = 20.0f)
                // L 15 20
                lineTo(x = 15.0f, y = 20.0f)
                // L 15 22
                lineTo(x = 15.0f, y = 22.0f)
                // L 13 22
                lineTo(x = 13.0f, y = 22.0f)
                // L 13 20
                lineTo(x = 13.0f, y = 20.0f)
                // L 11 20
                lineTo(x = 11.0f, y = 20.0f)
                // L 11 22
                lineTo(x = 11.0f, y = 22.0f)
                // L 9 22
                lineTo(x = 9.0f, y = 22.0f)
                // L 9 24
                lineTo(x = 9.0f, y = 24.0f)
                // L 11 24
                lineTo(x = 11.0f, y = 24.0f)
                // L 11 26
                lineTo(x = 11.0f, y = 26.0f)
                // L 13 26
                lineTo(x = 13.0f, y = 26.0f)
                // L 13 24
                lineTo(x = 13.0f, y = 24.0f)
                // L 15 24
                lineTo(x = 15.0f, y = 24.0f)
                // L 15 26
                lineTo(x = 15.0f, y = 26.0f)
                // L 17 26
                lineTo(x = 17.0f, y = 26.0f)
                // L 17 24
                lineTo(x = 17.0f, y = 24.0f)
                // L 19 24
                lineTo(x = 19.0f, y = 24.0f)
                // L 19 26
                lineTo(x = 19.0f, y = 26.0f)
                // L 21 26
                lineTo(x = 21.0f, y = 26.0f)
                // L 21 24
                lineTo(x = 21.0f, y = 24.0f)
                // L 23 24
                lineTo(x = 23.0f, y = 24.0f)
                // L 23 22z
                lineTo(x = 23.0f, y = 22.0f)
                close()
            }
            // M28 11 h-1 V4 a2 2 0 0 0 -2 -2 H7 a2 2 0 0 0 -2 2 v7 H4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h1 v4 a7 7 0 0 0 7 7 h8 a7 7 0 0 0 7 -7 v-4 h1 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 m-3 -7 v3.38 l-2.55 -1.27 a1 1 0 0 0 -.9 0 L18 7.88 l-3.55 -1.77 a1 1 0 0 0 -.9 0 L10 7.88 l-3 -1.5 V4Z m3 13 h-3 v6 a5 5 0 0 1 -5 5 h-8 a5 5 0 0 1 -5 -5 v-6 H4 v-4 h3 V8.62 l2.55 1.27 a1 1 0 0 0 .9 0 L14 8.12 l3.55 1.77 a1 1 0 0 0 .9 0 L22 8.12 l3 1.5 V13 h3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 11
                moveTo(x = 28.0f, y = 11.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
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
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 7 7 0 0 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // m -3 -7
                moveToRelative(dx = -3.0f, dy = -7.0f)
                // v 3.38
                verticalLineToRelative(dy = 3.38f)
                // l -2.55 -1.27
                lineToRelative(dx = -2.55f, dy = -1.27f)
                // a 1 1 0 0 0 -0.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.0f,
                )
                // L 18 7.88
                lineTo(x = 18.0f, y = 7.88f)
                // l -3.55 -1.77
                lineToRelative(dx = -3.55f, dy = -1.77f)
                // a 1 1 0 0 0 -0.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = 0.0f,
                )
                // L 10 7.88
                lineTo(x = 10.0f, y = 7.88f)
                // l -3 -1.5
                lineToRelative(dx = -3.0f, dy = -1.5f)
                // V 4z
                verticalLineTo(y = 4.0f)
                close()
                // m 3 13
                moveToRelative(dx = 3.0f, dy = 13.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 8.62
                verticalLineTo(y = 8.62f)
                // l 2.55 1.27
                lineToRelative(dx = 2.55f, dy = 1.27f)
                // a 1 1 0 0 0 0.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = 0.0f,
                )
                // L 14 8.12
                lineTo(x = 14.0f, y = 8.12f)
                // l 3.55 1.77
                lineToRelative(dx = 3.55f, dy = 1.77f)
                // a 1 1 0 0 0 0.9 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = 0.0f,
                )
                // L 22 8.12
                lineTo(x = 22.0f, y = 8.12f)
                // l 3 1.5
                lineToRelative(dx = 3.0f, dy = 1.5f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h 3z
                horizontalLineToRelative(dx = 3.0f)
                close()
            }
            // <rect width="5" height="2" x="9.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 14
                moveTo(x = 9.0f, y = 14.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
                close()
            }
            // <rect width="5" height="2" x="18.0" y="14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18 14
                moveTo(x = 18.0f, y = 14.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5z
                horizontalLineToRelative(dx = -5.0f)
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
        }.build().also { _monster = it }
    }

@Suppress("ObjectPropertyName")
private var _monster: ImageVector? = null
