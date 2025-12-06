package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AggregatorRecalculation: ImageVector
    get() {
        val current = _aggregatorRecalculation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AggregatorRecalculation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M3.4 22 H14 v2 H1 v-2.4 L9.6 13 1 4.4 V2 h17 v2 H3.4 l9 9z M29 24 h-9.2 l2.6 -2.6 L21 20 l-5 5 5 5 1.4 -1.4 -2.6 -2.6 H29z M16 14 v2 h9.2 l-2.6 2.6 L24 20 l5 -5 -5 -5 -1.4 1.4 2.6 2.6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3.4 22
                moveTo(x = 3.4f, y = 22.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 1
                horizontalLineTo(x = 1.0f)
                // v -2.4
                verticalLineToRelative(dy = -2.4f)
                // L 9.6 13
                lineTo(x = 9.6f, y = 13.0f)
                // L 1 4.4
                lineTo(x = 1.0f, y = 4.4f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 3.4
                horizontalLineTo(x = 3.4f)
                // l 9 9z
                lineToRelative(dx = 9.0f, dy = 9.0f)
                close()
                // M 29 24
                moveTo(x = 29.0f, y = 24.0f)
                // h -9.2
                horizontalLineToRelative(dx = -9.2f)
                // l 2.6 -2.6
                lineToRelative(dx = 2.6f, dy = -2.6f)
                // L 21 20
                lineTo(x = 21.0f, y = 20.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 1.4 -1.4
                lineToRelative(dx = 1.4f, dy = -1.4f)
                // l -2.6 -2.6
                lineToRelative(dx = -2.6f, dy = -2.6f)
                // H 29z
                horizontalLineTo(x = 29.0f)
                close()
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 9.2
                horizontalLineToRelative(dx = 9.2f)
                // l -2.6 2.6
                lineToRelative(dx = -2.6f, dy = 2.6f)
                // L 24 20
                lineTo(x = 24.0f, y = 20.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // l -1.4 1.4
                lineToRelative(dx = -1.4f, dy = 1.4f)
                // l 2.6 2.6z
                lineToRelative(dx = 2.6f, dy = 2.6f)
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
        }.build().also { _aggregatorRecalculation = it }
    }

@Suppress("ObjectPropertyName")
private var _aggregatorRecalculation: ImageVector? = null
