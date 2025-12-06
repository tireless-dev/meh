package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val CalendarAddAlt: ImageVector
    get() {
        val current = _calendarAddAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CalendarAddAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            
        }.build().also { _calendarAddAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarAddAlt: ImageVector? = null
