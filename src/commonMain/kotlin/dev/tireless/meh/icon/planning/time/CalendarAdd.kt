package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val CalendarAdd: ImageVector
    get() {
        val current = _calendarAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CalendarAdd",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            
        }.build().also { _calendarAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarAdd: ImageVector? = null
