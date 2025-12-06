package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsUpDoubleFilled: ImageVector
    get() {
        val current = _thumbsUpDoubleFilled
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ThumbsUpDoubleFilled",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M31 13.23 v5.1 a6.7 6.7 0 0 1 -4 6.11 v-8.21 A4.4 4.4 0 0 0 22.76 12 H17 V8.57 C16.9 6.56 15.88 5.16 14.9 5 l.22 -1.65 C15.25 2.53 15.47 1 17 1 h1 c1.77 0 3 1.47 3 3.57 V9 h5.76 C29.1 9 31 10.9 31 13.23 M20.76 14 H15 V9.57 C15 7.47 13.76 6 12 6 h-1 C9.47 6 9.24 7.53 9.12 8.35 l-.68 4.8 L7 15.87 V30 h11.33 c3.68 0 6.67 -3 6.67 -6.67 v-5.1 c0 -2.34 -1.9 -4.23 -4.24 -4.23 M5 30 V17 H2 v13z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 31 13.23
                moveTo(x = 31.0f, y = 13.23f)
                // v 5.1
                verticalLineToRelative(dy = 5.1f)
                // a 6.7 6.7 0 0 1 -4 6.11
                arcToRelative(
                    a = 6.7f,
                    b = 6.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 6.11f,
                )
                // v -8.21
                verticalLineToRelative(dy = -8.21f)
                // A 4.4 4.4 0 0 0 22.76 12
                arcTo(
                    horizontalEllipseRadius = 4.4f,
                    verticalEllipseRadius = 4.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.76f,
                    y1 = 12.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // V 8.57
                verticalLineTo(y = 8.57f)
                // C 16.9 6.56 15.88 5.16 14.9 5
                curveTo(
                    x1 = 16.9f,
                    y1 = 6.56f,
                    x2 = 15.88f,
                    y2 = 5.16f,
                    x3 = 14.9f,
                    y3 = 5.0f,
                )
                // l 0.22 -1.65
                lineToRelative(dx = 0.22f, dy = -1.65f)
                // C 15.25 2.53 15.47 1 17 1
                curveTo(
                    x1 = 15.25f,
                    y1 = 2.53f,
                    x2 = 15.47f,
                    y2 = 1.0f,
                    x3 = 17.0f,
                    y3 = 1.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // c 1.77 0 3 1.47 3 3.57
                curveToRelative(
                    dx1 = 1.77f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = 1.47f,
                    dx3 = 3.0f,
                    dy3 = 3.57f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // h 5.76
                horizontalLineToRelative(dx = 5.76f)
                // C 29.1 9 31 10.9 31 13.23
                curveTo(
                    x1 = 29.1f,
                    y1 = 9.0f,
                    x2 = 31.0f,
                    y2 = 10.9f,
                    x3 = 31.0f,
                    y3 = 13.23f,
                )
                // M 20.76 14
                moveTo(x = 20.76f, y = 14.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // V 9.57
                verticalLineTo(y = 9.57f)
                // C 15 7.47 13.76 6 12 6
                curveTo(
                    x1 = 15.0f,
                    y1 = 7.47f,
                    x2 = 13.76f,
                    y2 = 6.0f,
                    x3 = 12.0f,
                    y3 = 6.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // C 9.47 6 9.24 7.53 9.12 8.35
                curveTo(
                    x1 = 9.47f,
                    y1 = 6.0f,
                    x2 = 9.24f,
                    y2 = 7.53f,
                    x3 = 9.12f,
                    y3 = 8.35f,
                )
                // l -0.68 4.8
                lineToRelative(dx = -0.68f, dy = 4.8f)
                // L 7 15.87
                lineTo(x = 7.0f, y = 15.87f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 11.33
                horizontalLineToRelative(dx = 11.33f)
                // c 3.68 0 6.67 -3 6.67 -6.67
                curveToRelative(
                    dx1 = 3.68f,
                    dy1 = 0.0f,
                    dx2 = 6.67f,
                    dy2 = -3.0f,
                    dx3 = 6.67f,
                    dy3 = -6.67f,
                )
                // v -5.1
                verticalLineToRelative(dy = -5.1f)
                // c 0 -2.34 -1.9 -4.23 -4.24 -4.23
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.34f,
                    dx2 = -1.9f,
                    dy2 = -4.23f,
                    dx3 = -4.24f,
                    dy3 = -4.23f,
                )
                // M 5 30
                moveTo(x = 5.0f, y = 30.0f)
                // V 17
                verticalLineTo(y = 17.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 13z
                verticalLineToRelative(dy = 13.0f)
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
        }.build().also { _thumbsUpDoubleFilled = it }
    }

@Suppress("ObjectPropertyName")
private var _thumbsUpDoubleFilled: ImageVector? = null
