package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextFill: ImageVector
    get() {
        val current = _textFill
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.TextFill",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="24" height="4" x="4.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 26
                moveTo(x = 4.0f, y = 26.0f)
                // h 24
                horizontalLineToRelative(dx = 24.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -24z
                horizontalLineToRelative(dx = -24.0f)
                close()
            }
            // M26 14.54 a1 1 0 0 0 -.25 -.69 l-8.58 -9.52 L17 4.2 V2 h-2 v3 L4.32 14.74 a1 1 0 0 0 -.06 1.41 l8.57 9.52 A1 1 0 0 0 13.52 26 h.05 a1 1 0 0 0 .68 -.26 L24 16.8 V21 a1 1 0 0 0 2 0 v-6.46 m-12.35 9 -7.23 -8 L15 7.67 V12 h2 V7.13 l6.59 7.33Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 14.54
                moveTo(x = 26.0f, y = 14.54f)
                // a 1 1 0 0 0 -0.25 -0.69
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.25f,
                    dy1 = -0.69f,
                )
                // l -8.58 -9.52
                lineToRelative(dx = -8.58f, dy = -9.52f)
                // L 17 4.2
                lineTo(x = 17.0f, y = 4.2f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // L 4.32 14.74
                lineTo(x = 4.32f, y = 14.74f)
                // a 1 1 0 0 0 -0.06 1.41
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.06f,
                    dy1 = 1.41f,
                )
                // l 8.57 9.52
                lineToRelative(dx = 8.57f, dy = 9.52f)
                // A 1 1 0 0 0 13.52 26
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.52f,
                    y1 = 26.0f,
                )
                // h 0.05
                horizontalLineToRelative(dx = 0.05f)
                // a 1 1 0 0 0 0.68 -0.26
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.68f,
                    dy1 = -0.26f,
                )
                // L 24 16.8
                lineTo(x = 24.0f, y = 16.8f)
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 0 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // v -6.46
                verticalLineToRelative(dy = -6.46f)
                // m -12.35 9
                moveToRelative(dx = -12.35f, dy = 9.0f)
                // l -7.23 -8
                lineToRelative(dx = -7.23f, dy = -8.0f)
                // L 15 7.67
                lineTo(x = 15.0f, y = 7.67f)
                // V 12
                verticalLineTo(y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 7.13
                verticalLineTo(y = 7.13f)
                // l 6.59 7.33z
                lineToRelative(dx = 6.59f, dy = 7.33f)
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
        }.build().also { _textFill = it }
    }

@Suppress("ObjectPropertyName")
private var _textFill: ImageVector? = null
