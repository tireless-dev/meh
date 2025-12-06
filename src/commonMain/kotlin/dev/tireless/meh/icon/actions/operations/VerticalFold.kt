package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VerticalFold: ImageVector
    get() {
        val current = _verticalFold
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VerticalFold",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m11 24 1.41 1.41 L15 22.83 V30 h2 v-7.17 l2.59 2.58 L21 24 l-5 -5z M21 8 l-1.41 -1.41 L17 9.17 V2 h-2 v7.17 L12.41 6.6 11 8 l5 5z M2 17 h4 v-2 H2z m10 -2 H8 v2 h4z m2 2 h4 v-2 h-4z m6 0 h4 v-2 h-4z m6 -2 v2 h4 v-2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 24
                moveTo(x = 11.0f, y = 24.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 15 22.83
                lineTo(x = 15.0f, y = 22.83f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -7.17
                verticalLineToRelative(dy = -7.17f)
                // l 2.59 2.58
                lineToRelative(dx = 2.59f, dy = 2.58f)
                // L 21 24
                lineTo(x = 21.0f, y = 24.0f)
                // l -5 -5z
                lineToRelative(dx = -5.0f, dy = -5.0f)
                close()
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // L 17 9.17
                lineTo(x = 17.0f, y = 9.17f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 7.17
                verticalLineToRelative(dy = 7.17f)
                // L 12.41 6.6
                lineTo(x = 12.41f, y = 6.6f)
                // L 11 8
                lineTo(x = 11.0f, y = 8.0f)
                // l 5 5z
                lineToRelative(dx = 5.0f, dy = 5.0f)
                close()
                // M 2 17
                moveTo(x = 2.0f, y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 2z
                horizontalLineTo(x = 2.0f)
                close()
                // m 10 -2
                moveToRelative(dx = 10.0f, dy = -2.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
                close()
                // m 2 2
                moveToRelative(dx = 2.0f, dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 6 -2
                moveToRelative(dx = 6.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
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
        }.build().also { _verticalFold = it }
    }

@Suppress("ObjectPropertyName")
private var _verticalFold: ImageVector? = null
