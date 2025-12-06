package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MilitaryCamp: ImageVector
    get() {
        val current = _militaryCamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.MilitaryCamp",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M27 28 V17.52 a2 2 0 0 0 -.85 -1.64 L17 9.48 V8 h6 V2 h-8 v7.48 l-9.15 6.4 A2 2 0 0 0 5 17.52 V28 H2 v2 h28 v-2Z M17 4 h4 v2 h-4Z M7 17.52 l9 -6.3 9 6.3 V28 h-8 v-8 h-2 v8 H7Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27 28
                moveTo(x = 27.0f, y = 28.0f)
                // V 17.52
                verticalLineTo(y = 17.52f)
                // a 2 2 0 0 0 -0.85 -1.64
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.85f,
                    dy1 = -1.64f,
                )
                // L 17 9.48
                lineTo(x = 17.0f, y = 9.48f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 7.48
                verticalLineToRelative(dy = 7.48f)
                // l -9.15 6.4
                lineToRelative(dx = -9.15f, dy = 6.4f)
                // A 2 2 0 0 0 5 17.52
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 17.52f,
                )
                // V 28
                verticalLineTo(y = 28.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 28
                horizontalLineToRelative(dx = 28.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // M 17 4
                moveTo(x = 17.0f, y = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 7 17.52
                moveTo(x = 7.0f, y = 17.52f)
                // l 9 -6.3
                lineToRelative(dx = 9.0f, dy = -6.3f)
                // l 9 6.3
                lineToRelative(dx = 9.0f, dy = 6.3f)
                // V 28
                verticalLineTo(y = 28.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
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
        }.build().also { _militaryCamp = it }
    }

@Suppress("ObjectPropertyName")
private var _militaryCamp: ImageVector? = null
