// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
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
class ListAndStructuredListTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun containedListInvokesItemClick() {
    var clickedIndex = -1

    composeTestRule.setContent {
      MehTheme {
        ContainedList(
          title = "Items",
          items = listOf("Alpha", "Beta"),
          onItemClick = { clickedIndex = it },
        )
      }
    }

    composeTestRule.onNodeWithText("Beta").performClick()
    assertEquals(1, clickedIndex)
  }

  @Test
  fun structuredListSelectsClickedRow() {
    var selected by mutableIntStateOf(0)

    composeTestRule.setContent {
      MehTheme {
        StructuredList(
          headers = listOf("Name", "Value"),
          rows = listOf(listOf("Row A", "1"), listOf("Row B", "2")),
          selectedIndex = selected,
          onRowSelect = { selected = it },
        )
      }
    }

    composeTestRule.onNodeWithText("Row B").performClick()
    assertEquals(1, selected)
  }
}
