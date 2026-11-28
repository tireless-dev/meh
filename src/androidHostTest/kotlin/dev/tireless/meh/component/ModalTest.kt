// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
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
class ModalTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun modalTriggersPrimarySecondaryAndCloseCallbacks() {
    var primaryClicked = false
    var secondaryClicked = false
    var dismissed = false

    composeTestRule.setContent {
      MehTheme {
        ModalSurface(
          label = "Category",
          title = "Confirm action",
          onDismissRequest = { dismissed = true },
          primaryButtonText = "Confirm",
          onPrimaryButtonClick = { primaryClicked = true },
          secondaryButtonText = "Cancel",
          onSecondaryButtonClick = { secondaryClicked = true },
        ) {
          Text(text = "Modal body text")
        }
      }
    }

    composeTestRule.onNodeWithText("Category").assertIsDisplayed()
    composeTestRule.onNodeWithText("Confirm").performClick()
    assertTrue(primaryClicked)

    composeTestRule.onNodeWithText("Cancel").performClick()
    assertTrue(secondaryClicked)

    composeTestRule.onNodeWithContentDescription("Close modal").performClick()
    assertTrue(dismissed)
  }

  @Test
  fun passiveModalHidesFooterButtons() {
    composeTestRule.setContent {
      MehTheme {
        ModalSurface(
          title = "Notice",
          onDismissRequest = {},
          passive = true,
          primaryButtonText = "Should not show",
        ) {
          Text(text = "Passive body")
        }
      }
    }

    composeTestRule.onNodeWithText("Passive body").assertIsDisplayed()
    composeTestRule.onNodeWithText("Should not show").assertDoesNotExist()
  }
}
