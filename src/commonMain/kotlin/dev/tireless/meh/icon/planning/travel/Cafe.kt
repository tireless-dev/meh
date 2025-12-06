package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cafe: ImageVector
    get() {
        val current = _cafe
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Cafe",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2 28
                moveTo(x = 2.0f, y = 28.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -28z
                horizontalLineToRelative(dx = -28.0f)
                close()
            }
            // M24.5 11 H8 a2 2 0 0 0 -2 2 v8 a5 5 0 0 0 5 5 h8 a5 5 0 0 0 5 -5 v-1 h.5 a4.5 4.5 0 0 0 0 -9 M22 21 a3 3 0 0 1 -3 3 h-8 a3 3 0 0 1 -3 -3 v-8 h14Z m2.5 -3 H24 v-5 h.5 a2.5 2.5 0 0 1 0 5 M19 9 h-2 V8.85 a2 2 0 0 0 -1.1 -1.78 L13.2 5.72 A4 4 0 0 1 11 2.15 V1 h2 v1.15 a2 2 0 0 0 1.1 1.78 l2.69 1.35 A4 4 0 0 1 19 8.85Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24.5 11
                moveTo(x = 24.5f, y = 11.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 5 5 0 0 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 5 5 0 0 0 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // a 4.5 4.5 0 0 0 0 -9
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -9.0f,
                )
                // M 22 21
                moveTo(x = 22.0f, y = 21.0f)
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 3 3 0 0 1 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h 14z
                horizontalLineToRelative(dx = 14.0f)
                close()
                // m 2.5 -3
                moveToRelative(dx = 2.5f, dy = -3.0f)
                // H 24
                horizontalLineTo(x = 24.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // a 2.5 2.5 0 0 1 0 5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 5.0f,
                )
                // M 19 9
                moveTo(x = 19.0f, y = 9.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 8.85
                verticalLineTo(y = 8.85f)
                // a 2 2 0 0 0 -1.1 -1.78
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.1f,
                    dy1 = -1.78f,
                )
                // L 13.2 5.72
                lineTo(x = 13.2f, y = 5.72f)
                // A 4 4 0 0 1 11 2.15
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 11.0f,
                    y1 = 2.15f,
                )
                // V 1
                verticalLineTo(y = 1.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 1.15
                verticalLineToRelative(dy = 1.15f)
                // a 2 2 0 0 0 1.1 1.78
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.1f,
                    dy1 = 1.78f,
                )
                // l 2.69 1.35
                lineToRelative(dx = 2.69f, dy = 1.35f)
                // A 4 4 0 0 1 19 8.85z
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 8.85f,
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
        }.build().also { _cafe = it }
    }

@Suppress("ObjectPropertyName")
private var _cafe: ImageVector? = null
