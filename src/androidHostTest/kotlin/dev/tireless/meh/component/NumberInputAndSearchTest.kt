// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class NumberInputAndSearchTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun numberInputSteppersIncrementAndDecrementWithinBounds() {
    var value by mutableDoubleStateOf(1.0)

    composeTestRule.setContent {
      MehTheme {
        NumberInput(
          value = value,
          onValueChange = { value = it },
          label = "Quantity",
          min = 0.0,
          max = 2.0,
          step = 1.0,
        )
      }
    }

    composeTestRule.onNodeWithContentDescription("Increment").performClick()
    assertEquals(2.0, value, 0.001)
    // Clamped at max
    composeTestRule.onNodeWithContentDescription("Increment").performClick()
    assertEquals(2.0, value, 0.001)

    composeTestRule.onNodeWithContentDescription("Decrement").performClick()
    assertEquals(1.0, value, 0.001)
  }

  @Test
  fun searchClearsValueWhenClearButtonClicked() {
    var query by mutableStateOf("carbon")

    composeTestRule.setContent {
      MehTheme {
        Search(
          value = query,
          onValueChange = { query = it },
          onClear = { query = "" },
        )
      }
    }

    composeTestRule.onNodeWithContentDescription("Clear search input").performClick()
    assertEquals("", query)
  }

  @Test
  fun expandableSearchExpandsOnClick() {
    var expanded by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        ExpandableSearch(
          value = "",
          onValueChange = {},
          onClear = {},
          expanded = expanded,
          onExpandedChange = { expanded = it },
          placeholder = "Filter items",
        )
      }
    }

    composeTestRule.onNodeWithText("Filter items").assertDoesNotExist()
    composeTestRule.onNodeWithContentDescription("Expand search").performClick()
    assertTrue(expanded)
    composeTestRule.onNodeWithText("Filter items").assertIsDisplayed()
  }
}
