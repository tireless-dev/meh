// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertEquals
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
  fun select_whenClicked_triggersOnClick() {
    var clicked = false

    composeTestRule.setContent {
      Select(
        selectedOption = "Option 1",
        onClick = { clicked = true },
      )
    }

    composeTestRule.onNodeWithText("Option 1").performClick()

    assertTrue(clicked)
  }

  @Test
  fun select_whenDisabled_doesNotTriggerOnClick() {
    var clickCount = 0

    composeTestRule.setContent {
      Select(
        selectedOption = "Option 3",
        onClick = { clickCount++ },
        enabled = false,
      )
    }

    composeTestRule.onNodeWithText("Option 3").assertIsNotEnabled()
    composeTestRule.onNodeWithText("Option 3").performClick()

    assertEquals(0, clickCount)
  }

  @Test
  fun select_displaysLabelErrorAndHelperText() {
    composeTestRule.setContent {
      Select(
        selectedOption = "Option 2",
        onClick = {},
        label = "Country",
        error = "Country is required",
      )
    }

    composeTestRule.onNodeWithText("Country").assertIsDisplayed()
    composeTestRule.onNodeWithText("Option 2").assertIsDisplayed()
    composeTestRule.onNodeWithText("Country is required").assertIsDisplayed()
  }
}
