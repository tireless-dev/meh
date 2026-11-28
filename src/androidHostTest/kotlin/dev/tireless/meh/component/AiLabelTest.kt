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
class AiLabelTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun aiLabelOpensAndClosesExplainabilityCallout() {
    composeTestRule.setContent {
      MehTheme {
        AiLabel(
          calloutContent = {
            Text(text = "AI Explained")
          },
        )
      }
    }

    composeTestRule.onNodeWithText("AI Explained").assertDoesNotExist()
    composeTestRule.onNodeWithContentDescription("AI - Show information").performClick()
    composeTestRule.onNodeWithText("AI Explained").assertIsDisplayed()
  }

  @Test
  fun aiLabelRevertInvokesCallback() {
    var reverted = false

    composeTestRule.setContent {
      MehTheme {
        AiLabel(
          revertActive = true,
          onRevertClick = { reverted = true },
        )
      }
    }

    composeTestRule.onNodeWithContentDescription("Revert to AI input").performClick()
    assertTrue(reverted)
  }
}
