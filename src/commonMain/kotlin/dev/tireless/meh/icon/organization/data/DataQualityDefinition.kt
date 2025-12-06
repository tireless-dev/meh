package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

val DataQualityDefinition: ImageVector
    get() {
        val current = _dataQualityDefinition
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DataQualityDefinition",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            
        }.build().also { _dataQualityDefinition = it }
    }

@Suppress("ObjectPropertyName")
private var _dataQualityDefinition: ImageVector? = null
