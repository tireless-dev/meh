// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.TreeNode
import dev.tireless.meh.component.TreeView
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "TreeView", showBackground = true)
@Composable
internal fun TreeViewPreview() {
  val treeNodes = listOf(
    TreeNode(
      "1",
      "Node 1",
      listOf(
        TreeNode("1.1", "Child 1.1"),
        TreeNode("1.2", "Child 1.2"),
      ),
    ),
    TreeNode("2", "Node 2"),
  )

  PreviewTheme {
    TreeView(
      nodes = treeNodes,
    )
  }
}
