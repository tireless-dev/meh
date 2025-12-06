package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VoiceActivate: ImageVector
    get() {
        val current = _voiceActivate
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VoiceActivate",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M26 30 h-2 v-3 h-4 a5 5 0 0 1 -5 -5 v-1.28 l-2.32 -.77 a1 1 0 0 1 -.54 -1.46 L15 13.72 V11 a9 9 0 0 1 9 -9 h5 v2 h-5 a7 7 0 0 0 -7 7 v3 a1 1 0 0 1 -.14 .51 l-2.36 3.94 1.82 .6 A1 1 0 0 1 17 20 v2 a3 3 0 0 0 3 3 h5 a1 1 0 0 1 1 1Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 30
                moveTo(x = 26.0f, y = 30.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v -1.28
                verticalLineToRelative(dy = -1.28f)
                // l -2.32 -0.77
                lineToRelative(dx = -2.32f, dy = -0.77f)
                // a 1 1 0 0 1 -0.54 -1.46
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.54f,
                    dy1 = -1.46f,
                )
                // L 15 13.72
                lineTo(x = 15.0f, y = 13.72f)
                // V 11
                verticalLineTo(y = 11.0f)
                // a 9 9 0 0 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 1 -0.14 0.51
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.14f,
                    dy1 = 0.51f,
                )
                // l -2.36 3.94
                lineToRelative(dx = -2.36f, dy = 3.94f)
                // l 1.82 0.6
                lineToRelative(dx = 1.82f, dy = 0.6f)
                // A 1 1 0 0 1 17 20
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 20.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 3 3 0 0 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 1 1 0 0 1 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
            }
            // <rect width="4" height="2" x="19.0" y="12.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // M9.33 25.22 a7 7 0 0 1 0 -10.44 l1.34 1.5 a5 5 0 0 0 0 7.45Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9.33 25.22
                moveTo(x = 9.33f, y = 25.22f)
                // a 7 7 0 0 1 0 -10.44
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -10.44f,
                )
                // l 1.34 1.5
                lineToRelative(dx = 1.34f, dy = 1.5f)
                // a 5 5 0 0 0 0 7.45z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 7.45f,
                )
                close()
            }
            // M6.4 28.8 a11 11 0 0 1 0 -17.6 l1.2 1.6 a9 9 0 0 0 0 14.4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6.4 28.8
                moveTo(x = 6.4f, y = 28.8f)
                // a 11 11 0 0 1 0 -17.6
                arcToRelative(
                    a = 11.0f,
                    b = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -17.6f,
                )
                // l 1.2 1.6
                lineToRelative(dx = 1.2f, dy = 1.6f)
                // a 9 9 0 0 0 0 14.4z
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 14.4f,
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
        }.build().also { _voiceActivate = it }
    }

@Suppress("ObjectPropertyName")
private var _voiceActivate: ImageVector? = null
