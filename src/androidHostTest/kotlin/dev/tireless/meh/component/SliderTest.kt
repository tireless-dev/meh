// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextReplacement
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class SliderTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun sliderInputUpdatesAndClampsValue() {
    var value by mutableFloatStateOf(50f)

    composeTestRule.setContent {
      MehTheme {
        Slider(
          value = value,
          onValueChange = { value = it },
          label = "Volume",
          min = 0f,
          max = 100f,
        )
      }
    }

    composeTestRule.onNodeWithText("50").performTextReplacement("75")
    assertEquals(75f, value, 0.001f)

    composeTestRule.onNodeWithText("75").performTextReplacement("150")
    assertEquals(100f, value, 0.001f)
  }

  @Test
  fun sliderDisplaysErrorOverWarning() {
    composeTestRule.setContent {
      MehTheme {
        Slider(
          value = 90f,
          onValueChange = {},
          label = "Limit",
          warning = "Warning message",
          error = "Error message",
        )
      }
    }

    composeTestRule.onNodeWithText("Error message").assertIsDisplayed()
    composeTestRule.onNodeWithText("Warning message").assertDoesNotExist()
  }
}
