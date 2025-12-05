// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.tireless.meh.Icon
import dev.tireless.meh.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

private data class IconPreviewEntry(
  val name: String,
  val image: ImageVector,
)

private val iconPreviewEntries = listOf(
  IconPreviewEntry("Home", Icons.Home),
  IconPreviewEntry("RadioButton", Icons.RadioButton),
  IconPreviewEntry("RadioButtonChecked", Icons.RadioButtonChecked),
  IconPreviewEntry("Task", Icons.Task),
  IconPreviewEntry("UserSettings", Icons.UserSettings),
)

private const val ICONS_PER_ROW = 8

@OptIn(ExperimentalLayoutApi::class)
@Preview(name = "Icon Pack", showBackground = true)
@Composable
private fun IconPackPreview() {
  PreviewTheme {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(MehTheme.spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing04),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
        verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing05),
        maxItemsInEachRow = ICONS_PER_ROW,
      ) {
        iconPreviewEntries.forEach { entry ->
          Column(
            modifier = Modifier.width(72.dp),
            verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing02),
            horizontalAlignment = Alignment.CenterHorizontally,
          ) {
            Icon(
              image = entry.image,
              size = IconSize.Large,
              contentDescription = entry.name,
            )
            Text(
              text = entry.name,
              alignment = Alignment.Center,
              textAlign = TextAlign.Center,
            )
          }
        }
      }
    }
  }
}
