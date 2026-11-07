// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class SelectTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun select_whenClicked_triggersOnExpandedChange() {
    var clicked = false

    composeTestRule.setContent {
      Select(
        selectedOption = "Option 1",
        onExpandedChange = { clicked = true }
      )
    }

    composeTestRule.onNodeWithText("Option 1").performClick()

    assertTrue(clicked)
  }


  @Test
  fun select_displaysLabelErrorAndHelperText() {
    composeTestRule.setContent {
      Select(
        selectedOption = "Option 2",
        label = "Country",
        error = "Country is required",
      )
    }

    composeTestRule.onNodeWithText("Country").assertIsDisplayed()
    composeTestRule.onNodeWithText("Option 2").assertIsDisplayed()
    composeTestRule.onNodeWithText("Country is required").assertIsDisplayed()
  }
}
