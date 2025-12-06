package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snowflake: ImageVector
    get() {
        val current = _snowflake
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.Snowflake",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M21.41 12 H28 v-2 h-4.59 L28 5.41 26.59 4 22 8.59 V4 h-2 v6.59 L18.59 12 H17 V8 h-2 v4 h-1.59 L12 10.59 V4 h-2 v4.59 L5.41 4 4 5.41 8.59 10 H4 v2 h6.59 L12 13.41 V15 H8 v2 h4 v1.59 L10.59 20 H4 v2 h4.59 L4 26.59 5.41 28 10 23.41 V28 h2 v-6.59 L13.41 20 H15 v4 h2 v-4 h1.59 L20 21.41 V28 h2 v-4.59 L26.59 28 28 26.59 23.41 22 H28 v-2 h-6.59 L20 18.59 V17 h4 v-2 h-4 v-1.59Z M18 18 h-4 v-4 h4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21.41 12
                moveTo(x = 21.41f, y = 12.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4.59
                horizontalLineToRelative(dx = -4.59f)
                // L 28 5.41
                lineTo(x = 28.0f, y = 5.41f)
                // L 26.59 4
                lineTo(x = 26.59f, y = 4.0f)
                // L 22 8.59
                lineTo(x = 22.0f, y = 8.59f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 6.59
                verticalLineToRelative(dy = 6.59f)
                // L 18.59 12
                lineTo(x = 18.59f, y = 12.0f)
                // H 17
                horizontalLineTo(x = 17.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -1.59
                horizontalLineToRelative(dx = -1.59f)
                // L 12 10.59
                lineTo(x = 12.0f, y = 10.59f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 4.59
                verticalLineToRelative(dy = 4.59f)
                // L 5.41 4
                lineTo(x = 5.41f, y = 4.0f)
                // L 4 5.41
                lineTo(x = 4.0f, y = 5.41f)
                // L 8.59 10
                lineTo(x = 8.59f, y = 10.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6.59
                horizontalLineToRelative(dx = 6.59f)
                // L 12 13.41
                lineTo(x = 12.0f, y = 13.41f)
                // V 15
                verticalLineTo(y = 15.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 1.59
                verticalLineToRelative(dy = 1.59f)
                // L 10.59 20
                lineTo(x = 10.59f, y = 20.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4.59
                horizontalLineToRelative(dx = 4.59f)
                // L 4 26.59
                lineTo(x = 4.0f, y = 26.59f)
                // L 5.41 28
                lineTo(x = 5.41f, y = 28.0f)
                // L 10 23.41
                lineTo(x = 10.0f, y = 23.41f)
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -6.59
                verticalLineToRelative(dy = -6.59f)
                // L 13.41 20
                lineTo(x = 13.41f, y = 20.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 1.59
                horizontalLineToRelative(dx = 1.59f)
                // L 20 21.41
                lineTo(x = 20.0f, y = 21.41f)
                // V 28
                verticalLineTo(y = 28.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4.59
                verticalLineToRelative(dy = -4.59f)
                // L 26.59 28
                lineTo(x = 26.59f, y = 28.0f)
                // L 28 26.59
                lineTo(x = 28.0f, y = 26.59f)
                // L 23.41 22
                lineTo(x = 23.41f, y = 22.0f)
                // H 28
                horizontalLineTo(x = 28.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -6.59
                horizontalLineToRelative(dx = -6.59f)
                // L 20 18.59
                lineTo(x = 20.0f, y = 18.59f)
                // V 17
                verticalLineTo(y = 17.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -1.59z
                verticalLineToRelative(dy = -1.59f)
                close()
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 4z
                horizontalLineToRelative(dx = 4.0f)
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
        }.build().also { _snowflake = it }
    }

@Suppress("ObjectPropertyName")
private var _snowflake: ImageVector? = null
