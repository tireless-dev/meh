// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.TreeNode
import dev.tireless.meh.component.TreeView
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TreeViewPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val nodes = listOf(
      TreeNode(
        id = "1",
        label = "Artificial intelligence",
        icon = Icons.Folder,
        initiallyExpanded = true,
        children = listOf(
          TreeNode(id = "1-1", label = "Machine learning", icon = Icons.Document),
          TreeNode(
            id = "1-2",
            label = "Natural language",
            icon = Icons.Folder,
            initiallyExpanded = true,
            children = listOf(
              TreeNode(id = "1-2-1", label = "Text classification", icon = Icons.Document),
              TreeNode(id = "1-2-2", label = "Entity extraction", icon = Icons.Document, enabled = false),
            ),
          ),
        ),
      ),
      TreeNode(
        id = "2",
        label = "Cloud computing",
        icon = Icons.Folder,
        children = listOf(TreeNode(id = "2-1", label = "Kubernetes")),
      ),
      TreeNode(id = "3", label = "Data & Analytics", icon = Icons.Document),
    )

    Row(
      modifier = Modifier.fillMaxWidth(),
      horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Column(
        modifier = Modifier.weight(1f),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
      ) {
        BasicText(text = "Small (32px — default)", style = sectionStyle)
        TreeView(
          nodes = nodes,
          label = "Tree view",
          selectedId = "1-2-1",
          onSelect = {},
          size = ControlSize.Small,
        )
      }

      Column(
        modifier = Modifier.weight(1f),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
      ) {
        BasicText(text = "Extra small (24px)", style = sectionStyle)
        TreeView(
          nodes = nodes,
          label = "Compact tree",
          selectedId = "1-1",
          onSelect = {},
          size = ControlSize.XSmall,
        )
      }
    }
  }
}
