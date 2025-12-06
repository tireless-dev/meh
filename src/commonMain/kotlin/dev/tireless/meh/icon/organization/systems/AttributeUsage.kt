package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AttributeUsage: ImageVector
    get() {
        val current = _attributeUsage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AttributeUsage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21 2 H11 c-4.96 0 -9 4.04 -9 9 v10 c0 4.96 4.04 9 9 9 h10 c4.96 0 9 -4.04 9 -9 V11 c0 -4.96 -4.04 -9 -9 -9 m7 19 a7 7 0 0 1 -7 7 H11 a7 7 0 0 1 -7 -7 V11 a7 7 0 0 1 7 -7 h10 a7 7 0 0 1 7 7z m-12.52 1 -.97 -3.06 h-4.26 L9.3 22 H7 l4.02 -12 h2.82 l4 12z m-3.06 -9.94 h-.09 L10.8 17 h3.16z m6.67 7.65 v-4.96 h-1.33 V13 h.69 c.65 0 .86 -.31 .86 -.93 v-1.5 h1.98 V13 h1.84 v1.75 h-1.84 v5.5 h1.7 V22 h-1.58 c-1.52 0 -2.32 -.83 -2.32 -2.29
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 2
                moveTo(x = 21.0f, y = 2.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -4.96 0 -9 4.04 -9 9
                curveToRelative(
                    dx1 = -4.96f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = 4.04f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 4.96 4.04 9 9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.96f,
                    dx2 = 4.04f,
                    dy2 = 9.0f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 4.96 0 9 -4.04 9 -9
                curveToRelative(
                    dx1 = 4.96f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = -4.04f,
                    dx3 = 9.0f,
                    dy3 = -9.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -4.96 -4.04 -9 -9 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.96f,
                    dx2 = -4.04f,
                    dy2 = -9.0f,
                    dx3 = -9.0f,
                    dy3 = -9.0f,
                )
                // m 7 19
                moveToRelative(dx = 7.0f, dy = 19.0f)
                // a 7 7 0 0 1 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 7 7 0 0 1 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // a 7 7 0 0 1 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 7 7 0 0 1 7 7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                close()
                // m -12.52 1
                moveToRelative(dx = -12.52f, dy = 1.0f)
                // l -0.97 -3.06
                lineToRelative(dx = -0.97f, dy = -3.06f)
                // h -4.26
                horizontalLineToRelative(dx = -4.26f)
                // L 9.3 22
                lineTo(x = 9.3f, y = 22.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // l 4.02 -12
                lineToRelative(dx = 4.02f, dy = -12.0f)
                // h 2.82
                horizontalLineToRelative(dx = 2.82f)
                // l 4 12z
                lineToRelative(dx = 4.0f, dy = 12.0f)
                close()
                // m -3.06 -9.94
                moveToRelative(dx = -3.06f, dy = -9.94f)
                // h -0.09
                horizontalLineToRelative(dx = -0.09f)
                // L 10.8 17
                lineTo(x = 10.8f, y = 17.0f)
                // h 3.16z
                horizontalLineToRelative(dx = 3.16f)
                close()
                // m 6.67 7.65
                moveToRelative(dx = 6.67f, dy = 7.65f)
                // v -4.96
                verticalLineToRelative(dy = -4.96f)
                // h -1.33
                horizontalLineToRelative(dx = -1.33f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h 0.69
                horizontalLineToRelative(dx = 0.69f)
                // c 0.65 0 0.86 -0.31 0.86 -0.93
                curveToRelative(
                    dx1 = 0.65f,
                    dy1 = 0.0f,
                    dx2 = 0.86f,
                    dy2 = -0.31f,
                    dx3 = 0.86f,
                    dy3 = -0.93f,
                )
                // v -1.5
                verticalLineToRelative(dy = -1.5f)
                // h 1.98
                horizontalLineToRelative(dx = 1.98f)
                // V 13
                verticalLineTo(y = 13.0f)
                // h 1.84
                horizontalLineToRelative(dx = 1.84f)
                // v 1.75
                verticalLineToRelative(dy = 1.75f)
                // h -1.84
                horizontalLineToRelative(dx = -1.84f)
                // v 5.5
                verticalLineToRelative(dy = 5.5f)
                // h 1.7
                horizontalLineToRelative(dx = 1.7f)
                // V 22
                verticalLineTo(y = 22.0f)
                // h -1.58
                horizontalLineToRelative(dx = -1.58f)
                // c -1.52 0 -2.32 -0.83 -2.32 -2.29
                curveToRelative(
                    dx1 = -1.52f,
                    dy1 = 0.0f,
                    dx2 = -2.32f,
                    dy2 = -0.83f,
                    dx3 = -2.32f,
                    dy3 = -2.29f,
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
        }.build().also { _attributeUsage = it }
    }

@Suppress("ObjectPropertyName")
private var _attributeUsage: ImageVector? = null
