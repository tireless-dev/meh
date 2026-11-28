// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
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
class TextInputTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun textInputRespectsMaxCountAndShowsCounter() {
    var value by mutableStateOf("abc")

    composeTestRule.setContent {
      MehTheme {
        TextInput(
          value = value,
          onValueChange = { value = it },
          label = "Code",
          maxCount = 5,
        )
      }
    }

    composeTestRule.onNodeWithText("3/5").assertIsDisplayed()
    composeTestRule.onNodeWithText("abc").performTextReplacement("abcde")
    assertEquals("abcde", value)
    composeTestRule.onNodeWithText("5/5").assertIsDisplayed()
    composeTestRule.onNodeWithText("abcde").performTextReplacement("abcdef")
    assertEquals("abcde", value)
  }

  @Test
  fun textInputPrioritizesErrorOverWarningAndHelper() {
    composeTestRule.setContent {
      MehTheme {
        TextInput(
          value = "bad",
          onValueChange = {},
          label = "Username",
          helper = "Helper text",
          warning = "Warning text",
          error = "Error text",
        )
      }
    }

    composeTestRule.onNodeWithText("Error text").assertIsDisplayed()
    composeTestRule.onNodeWithText("Warning text").assertDoesNotExist()
    composeTestRule.onNodeWithText("Helper text").assertDoesNotExist()
  }

  @Test
  fun readOnlySuppressesErrorAndWarning() {
    composeTestRule.setContent {
      MehTheme {
        TextInput(
          value = "fixed",
          onValueChange = {},
          label = "Read only",
          helper = "Helper text",
          error = "Error text",
          readOnly = true,
        )
      }
    }

    composeTestRule.onNodeWithText("Error text").assertDoesNotExist()
    composeTestRule.onNodeWithText("Helper text").assertIsDisplayed()
  }

  @Test
  fun textAreaDisplaysCounterAndValue() {
    composeTestRule.setContent {
      MehTheme {
        TextArea(
          value = "Line 1\nLine 2",
          onValueChange = {},
          label = "Notes",
          maxCount = 100,
        )
      }
    }

    composeTestRule.onNodeWithText("Notes").assertIsDisplayed()
    composeTestRule.onNodeWithText("13/100").assertIsDisplayed()
    composeTestRule.onNodeWithText("Line 1\nLine 2").assertIsDisplayed()
  }
}
