package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TouchInteraction: ImageVector
    get() {
        val current = _touchInteraction
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TouchInteraction",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 21 v-1 a1 1 0 0 1 2 0 v10 h2 V20 a3 3 0 0 0 -3 -3 3 3 0 0 0 -1.47 .4 2.95 2.95 0 0 0 -4 -1 A3 3 0 0 0 19 15 a3 3 0 0 0 -1 .18 V10 a3 3 0 0 0 -6 0 v11.1 l-2.23 -1.52 a3 3 0 0 0 -3.89 4.55 L12.32 30 l1.35 -1.48 -6.38 -5.82 A1 1 0 0 1 7 22 a1 1 0 0 1 1.6 -.8 l5.4 3.7 V10 a1 1 0 0 1 2 0 v11 h2 v-3 a1 1 0 0 1 2 0 v3 h2 v-2 a1 1 0 0 1 2 0 v2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 21
                moveTo(x = 26.0f, y = 21.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 20
                verticalLineTo(y = 20.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 0 -1.47 0.4
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.47f,
                    dy1 = 0.4f,
                )
                // a 2.95 2.95 0 0 0 -4 -1
                arcToRelative(
                    a = 2.95f,
                    b = 2.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = -1.0f,
                )
                // A 3 3 0 0 0 19 15
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 15.0f,
                )
                // a 3 3 0 0 0 -1 0.18
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 0.18f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 3 3 0 0 0 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // v 11.1
                verticalLineToRelative(dy = 11.1f)
                // l -2.23 -1.52
                lineToRelative(dx = -2.23f, dy = -1.52f)
                // a 3 3 0 0 0 -3.89 4.55
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.89f,
                    dy1 = 4.55f,
                )
                // L 12.32 30
                lineTo(x = 12.32f, y = 30.0f)
                // l 1.35 -1.48
                lineToRelative(dx = 1.35f, dy = -1.48f)
                // l -6.38 -5.82
                lineToRelative(dx = -6.38f, dy = -5.82f)
                // A 1 1 0 0 1 7 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 22.0f,
                )
                // a 1 1 0 0 1 1.6 -0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.6f,
                    dy1 = -0.8f,
                )
                // l 5.4 3.7
                lineToRelative(dx = 5.4f, dy = 3.7f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // M28 12 h-6 v-2 h6 V4 H4 v6 h4 v2 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 12
                moveTo(x = 28.0f, y = 12.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
        }.build().also { _touchInteraction = it }
    }

@Suppress("ObjectPropertyName")
private var _touchInteraction: ImageVector? = null
