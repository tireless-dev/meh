package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val WorkflowAutomation: ImageVector
    get() {
        val current = _workflowAutomation
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.WorkflowAutomation",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            
        }.build().also { _workflowAutomation = it }
    }

@Suppress("ObjectPropertyName")
private var _workflowAutomation: ImageVector? = null
