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
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class TileTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun selectableTileTogglesSelectionOnClick() {
    var selected by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        SelectableTile(
          selected = selected,
          onSelectedChange = { selected = it },
        ) {
          Text(text = "Selectable option")
        }
      }
    }

    composeTestRule.onNodeWithText("Selectable option").performClick()
    assertTrue(selected)
  }

  @Test
  fun expandableTileRevealsBelowTheFoldContentOnClick() {
    composeTestRule.setContent {
      MehTheme {
        ExpandableTile(
          aboveTheFoldContent = { Text(text = "Summary") },
          belowTheFoldContent = { Text(text = "Details") },
        )
      }
    }

    composeTestRule.onNodeWithText("Details").assertDoesNotExist()
    composeTestRule.onNodeWithText("Summary").performClick()
    composeTestRule.onNodeWithText("Details").assertIsDisplayed()
  }
}
