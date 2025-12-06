package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhraseSentiment: ImageVector
    get() {
        val current = _phraseSentiment
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.PhraseSentiment",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M18.3 10 a2.7 2.7 0 0 0 -1.9 .8 L16 11.22 l-.4 -.4 a2.66 2.66 0 0 0 -3.81 0 2.8 2.8 0 0 0 0 3.9 L16 19 l4.21 -4.3 a2.8 2.8 0 0 0 0 -3.9 2.7 2.7 0 0 0 -1.9 -.8
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 18.3 10
                moveTo(x = 18.3f, y = 10.0f)
                // a 2.7 2.7 0 0 0 -1.9 0.8
                arcToRelative(
                    a = 2.7f,
                    b = 2.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.9f,
                    dy1 = 0.8f,
                )
                // L 16 11.22
                lineTo(x = 16.0f, y = 11.22f)
                // l -0.4 -0.4
                lineToRelative(dx = -0.4f, dy = -0.4f)
                // a 2.66 2.66 0 0 0 -3.81 0
                arcToRelative(
                    a = 2.66f,
                    b = 2.66f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.81f,
                    dy1 = 0.0f,
                )
                // a 2.8 2.8 0 0 0 0 3.9
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.9f,
                )
                // L 16 19
                lineTo(x = 16.0f, y = 19.0f)
                // l 4.21 -4.3
                lineToRelative(dx = 4.21f, dy = -4.3f)
                // a 2.8 2.8 0 0 0 0 -3.9
                arcToRelative(
                    a = 2.8f,
                    b = 2.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.9f,
                )
                // a 2.7 2.7 0 0 0 -1.9 -0.8
                arcToRelative(
                    a = 2.7f,
                    b = 2.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.9f,
                    dy1 = -0.8f,
                )
            }
            // M17.74 30 16 29 l4 -7 h6 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h9 v2 H6 a4 4 0 0 1 -4 -4 V8 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v12 a4 4 0 0 1 -4 4 h-4.84Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.74 30
                moveTo(x = 17.74f, y = 30.0f)
                // L 16 29
                lineTo(x = 16.0f, y = 29.0f)
                // l 4 -7
                lineToRelative(dx = 4.0f, dy = -7.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
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
                // h 9
                horizontalLineToRelative(dx = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h -4.84z
                horizontalLineToRelative(dx = -4.84f)
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
        }.build().also { _phraseSentiment = it }
    }

@Suppress("ObjectPropertyName")
private var _phraseSentiment: ImageVector? = null
