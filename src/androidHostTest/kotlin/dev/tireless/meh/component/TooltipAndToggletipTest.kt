// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class TooltipAndToggletipTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun tooltipShowsWhenExpanded() {
    var expanded by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        Tooltip(
          text = "Close panel",
          expanded = expanded,
          trigger = {
            Button(text = "Trigger", onClick = { expanded = !expanded })
          },
        )
      }
    }

    composeTestRule.onNodeWithText("Close panel").assertDoesNotExist()
    composeTestRule.onNodeWithText("Trigger").performClick()
    composeTestRule.onNodeWithText("Close panel").assertIsDisplayed()
  }

  @Test
  fun definitionTooltipTogglesOnClick() {
    composeTestRule.setContent {
      MehTheme {
        DefinitionTooltip(
          term = "API",
          definition = "Application Programming Interface",
        )
      }
    }

    composeTestRule.onNodeWithText("Application Programming Interface").assertDoesNotExist()
    composeTestRule.onNodeWithText("API").performClick()
    composeTestRule.onNodeWithText("Application Programming Interface").assertIsDisplayed()
    composeTestRule.onNodeWithText("API").performClick()
    composeTestRule.onNodeWithText("Application Programming Interface").assertDoesNotExist()
  }

  @Test
  fun toggletipOpensAndClosesWithTrigger() {
    var expanded by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        Toggletip(
          expanded = expanded,
          onExpandedChange = { expanded = it },
          label = "More info",
          modifier = Modifier.testTag("toggletip"),
          actions = {
            Button(text = "Action", onClick = {})
          },
        ) {
          Text(text = "Supplemental toggletip details")
        }
      }
    }

    composeTestRule.onNodeWithText("More info").assertIsDisplayed()
    composeTestRule.onNodeWithText("Supplemental toggletip details").assertDoesNotExist()

    expanded = true
    composeTestRule.onNodeWithText("Supplemental toggletip details").assertIsDisplayed()
    composeTestRule.onNodeWithText("Action").assertIsDisplayed()

    expanded = false
    composeTestRule.onNodeWithText("Supplemental toggletip details").assertDoesNotExist()
  }
}
