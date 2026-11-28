// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class ContentSwitcherAndCodeSnippetTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun contentSwitcherSelectsClickedOption() {
    var selected by mutableIntStateOf(0)

    composeTestRule.setContent {
      MehTheme {
        ContentSwitcher(
          selectedIndex = selected,
          options = listOf("First", "Second", "Third"),
          onOptionSelect = { selected = it },
        )
      }
    }

    composeTestRule.onNodeWithText("Third").performClick()
    assertEquals(2, selected)
  }

  @Test
  fun multilineCodeSnippetExpandsAndCollapsesAndCopies() {
    var copyCount = 0
    val code = (1..8).joinToString("\n") { "line $it" }

    composeTestRule.setContent {
      MehTheme {
        CodeSnippet(
          code = code,
          variant = CodeSnippetVariant.Multiline,
          maxCollapsedLines = 3,
          onCopyClick = { copyCount++ },
        )
      }
    }

    composeTestRule.onNodeWithText("Show more").assertIsDisplayed()
    composeTestRule.onNodeWithText("Show more").performClick()
    composeTestRule.onNodeWithText("Show less").assertIsDisplayed()

    composeTestRule.onNodeWithContentDescription("Copy to clipboard").performClick()
    assertEquals(1, copyCount)
  }
}
