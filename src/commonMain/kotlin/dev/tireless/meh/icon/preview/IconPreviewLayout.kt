// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.tireless.meh.Icon
import dev.tireless.meh.Text
import dev.tireless.meh.icon.iconCatalog
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.preview.PreviewTheme

internal data class IconPreviewEntry(
  val name: String,
  val image: ImageVector,
)

internal const val ICONS_PER_ROW = 16
internal const val PREVIEW_ROWS = 32
internal const val PREVIEW_WIDTH_DP = 800
internal const val PREVIEW_HEIGHT_DP = 4000
internal const val MAX_PREVIEW_ICONS = ICONS_PER_ROW * PREVIEW_ROWS

private const val ICON_COLUMN_WIDTH_DP = 48

internal fun iconEntriesFor(
  categoryName: String,
  subcategoryName: String,
): List<IconPreviewEntry> {
  val subcategory =
    iconCatalog.firstOrNull { it.name == categoryName }
      ?.subcategories?.firstOrNull { it.name == subcategoryName }
      ?: return emptyList()

  val iconMap = Icons.entries

  return subcategory.iconNames.mapNotNull { name ->
    iconMap[name]?.let { icon -> IconPreviewEntry(name = name, image = icon) }
  }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun IconSubcategoryPreview(
  categoryName: String,
  subcategoryName: String,
) {
  val entries = iconEntriesFor(categoryName, subcategoryName)
  if (entries.isEmpty()) return

  val limitedEntries = entries.take(MAX_PREVIEW_ICONS)
  val title = "$categoryName / $subcategoryName"

  PreviewTheme {
    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .verticalScroll(rememberScrollState())
          .padding(MehTheme.spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Text(
        text = title,
        alignment = Alignment.Center,
        textAlign = TextAlign.Center,
        style = MehTheme.typography.heading04,
      )

      FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
        verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
        maxItemsInEachRow = ICONS_PER_ROW,
      ) {
        limitedEntries.forEach { entry ->
          Column(
            modifier = Modifier.width(ICON_COLUMN_WIDTH_DP.dp),
            verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing02),
            horizontalAlignment = Alignment.CenterHorizontally,
          ) {
            Icon(
              image = entry.image,
              size = IconSize.Medium,
              contentDescription = entry.name,
            )
            Text(
              text = entry.name,
              alignment = Alignment.Center,
              textAlign = TextAlign.Center,
              style = MehTheme.typography.label01,
            )
          }
        }
      }
    }
  }
}
