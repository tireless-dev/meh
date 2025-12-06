package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SwimlaneDVertical: ImageVector
    get() {
        val current = _swimlaneDVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SwimlaneDVertical",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 26 h2 v4 h-4 v-2 h2z m-8 4 h4 v-2 h-4z M7 26 H5 v4 h4 v-2 H7z m0 -6 H5 v4 h2z m0 -6 H5 v4 h2z M5 8 v4 h2 v-2 h2 V8z m0 -2 h2 V4 h2 V2 H5z m12 -2 h4 V2 h-4z m-6 0 h4 V2 h-4z m12 -2 v2 h2 v2 h2 V2z m2 22 h2 v-4 h-2z m0 -6 h2 v-4 h-2z m-8 -8 h4 V8 h-4z m-6 0 h4 V8 h-4z m12 -2 v2 h2 v2 h2 V8z M11 30 h4 v-2 h-4z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 26
                moveTo(x = 25.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m -8 4
                moveToRelative(dx = -8.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // M 7 26
                moveTo(x = 7.0f, y = 26.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 5z
                horizontalLineTo(x = 5.0f)
                close()
                // m 12 -2
                moveToRelative(dx = 12.0f, dy = -2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 12 -2
                moveToRelative(dx = 12.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // m 2 22
                moveToRelative(dx = 2.0f, dy = 22.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
                // m -8 -8
                moveToRelative(dx = -8.0f, dy = -8.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
                // m 12 -2
                moveToRelative(dx = 12.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 8z
                verticalLineTo(y = 8.0f)
                close()
                // M 11 30
                moveTo(x = 11.0f, y = 30.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
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
        }.build().also { _swimlaneDVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _swimlaneDVertical: ImageVector? = null
