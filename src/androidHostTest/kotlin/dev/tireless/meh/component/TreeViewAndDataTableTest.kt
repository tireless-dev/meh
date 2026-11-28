// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class TreeViewAndDataTableTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun treeViewExpandsAndSelectsNode() {
    var selectedId: String? by mutableStateOf(null)
    val nodes = listOf(
      TreeNode(
        id = "root",
        label = "Root",
        children = listOf(TreeNode(id = "child", label = "Child node")),
      ),
    )

    composeTestRule.setContent {
      MehTheme {
        TreeView(
          nodes = nodes,
          selectedId = selectedId,
          onSelect = { selectedId = it.id },
        )
      }
    }

    composeTestRule.onNodeWithText("Child node").assertDoesNotExist()
    composeTestRule.onNodeWithText("Root").performClick()
    composeTestRule.onNodeWithText("Child node").assertIsDisplayed()
    composeTestRule.onNodeWithText("Child node").performClick()
    assertEquals("child", selectedId)
  }

  @Test
  fun dataTableSelectsRowsAndClearsBatchSelection() {
    var selected by mutableStateOf(emptySet<Int>())

    composeTestRule.setContent {
      MehTheme {
        DataTable(
          headers = listOf("Name", "Port"),
          rows = listOf(listOf("Server A", "80"), listOf("Server B", "443")),
          selectedRows = selected,
          onRowSelectionChange = { selected = it },
        )
      }
    }

    composeTestRule.onNodeWithText("Server A").performClick()
    assertEquals(setOf(0), selected)
    composeTestRule.onNodeWithText("1 item selected").assertIsDisplayed()

    composeTestRule.onNodeWithText("Cancel").performClick()
    assertEquals(emptySet<Int>(), selected)
  }
}
