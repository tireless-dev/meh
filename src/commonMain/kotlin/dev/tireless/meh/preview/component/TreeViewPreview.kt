// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.TreeNode
import dev.tireless.meh.component.TreeView
import dev.tireless.meh.theme.MehTheme

@Composable
fun TreeViewPreview() {
  val treeNodes = listOf(
    TreeNode("1", "Node 1", listOf(
      TreeNode("1.1", "Child 1.1"),
      TreeNode("1.2", "Child 1.2")
    )),
    TreeNode("2", "Node 2")
  )

  MehTheme {
    TreeView(
      nodes = treeNodes,
      modifier = Modifier.padding(16.dp)
    )
  }
}
