// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

data class TreeNode(
  val id: String,
  val label: String,
  val children: List<TreeNode> = emptyList(),
)

@Composable
fun TreeView(
  nodes: List<TreeNode>,
  modifier: Modifier = Modifier,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    nodes.forEach { node ->
      TreeViewNode(node = node, level = 0)
    }
  }
}

@Composable
private fun TreeViewNode(
  node: TreeNode,
  level: Int,
) {
  var expanded by remember { mutableStateOf(false) }
  val hasChildren = node.children.isNotEmpty()
  val rotation by animateFloatAsState(if (expanded) 0f else -90f, label = "ChevronRotation")

  Column(modifier = Modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(32.dp)
        .clickable { if (hasChildren) expanded = !expanded }
        .padding(start = (level * 16).dp + MehTheme.spacing.spacing05, end = MehTheme.spacing.spacing05),
      verticalAlignment = Alignment.CenterVertically
    ) {
      if (hasChildren) {
        Icon(
          image = Icons.CaretDown,
          size = IconSize.XSmall,
          tint = MehTheme.colors.iconPrimary,
          modifier = Modifier.rotate(rotation)
        )
      } else {
        Spacer(Modifier.size(16.dp))
      }

      Text(
        text = node.label,
        style = MehTheme.typography.bodyCompact01,
        modifier = Modifier.padding(start = MehTheme.spacing.spacing03)
      )
    }

    if (hasChildren) {
      AnimatedVisibility(visible = expanded) {
        Column(modifier = Modifier.fillMaxWidth()) {
          node.children.forEach { child ->
            TreeViewNode(node = child, level = level + 1)
          }
        }
      }
    }
  }
}
