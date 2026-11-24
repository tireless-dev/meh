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
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class MenuAndMenuButtonTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun menuButtonOpensMenuAndInvokesItem() {
    var expanded by mutableStateOf(false)
    var selectedAction = ""

    composeTestRule.setContent {
      MehTheme {
        MenuButton(
          text = "Actions",
          expanded = expanded,
          onExpandedChange = { expanded = it },
        ) {
          MenuItem(
            text = "Duplicate",
            onClick = {
              selectedAction = "Duplicate"
              expanded = false
            },
          )
          MenuItem(
            text = "Delete",
            kind = MenuItemKind.Danger,
            onClick = {
              selectedAction = "Delete"
              expanded = false
            },
          )
        }
      }
    }

    composeTestRule.onNodeWithText("Duplicate").assertDoesNotExist()
    composeTestRule.onNodeWithText("Actions").performClick()
    composeTestRule.onNodeWithText("Duplicate").assertIsDisplayed()
    composeTestRule.onNodeWithText("Delete").assertIsDisplayed()
    composeTestRule.onNodeWithText("Duplicate").performClick()
    assertEquals("Duplicate", selectedAction)
    composeTestRule.onNodeWithText("Duplicate").assertDoesNotExist()
  }

  @Test
  fun comboButtonInvokesPrimaryActionIndependentlyOfMenu() {
    var primaryClicks = 0
    var expanded by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        ComboButton(
          text = "Save",
          onClick = { primaryClicks++ },
          expanded = expanded,
          onExpandedChange = { expanded = it },
        ) {
          MenuItem(text = "Save as draft", onClick = {})
        }
      }
    }

    composeTestRule.onNodeWithText("Save").performClick()
    assertEquals(1, primaryClicks)
    composeTestRule.onNodeWithText("Save as draft").assertDoesNotExist()

    expanded = true
    composeTestRule.onNodeWithText("Save as draft").assertIsDisplayed()
  }

  @Test
  fun selectableMenuItemTogglesSelection() {
    var selected by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        MenuSurface {
          MenuSelectableItem(
            text = "Show grid",
            selected = selected,
            onSelectedChange = { selected = it },
          )
        }
      }
    }

    composeTestRule.onNodeWithText("Show grid").performClick()
    assertTrue(selected)
  }
}
