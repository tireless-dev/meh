// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
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
class PaginationAndFileUploaderTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun paginationNavChangesPage() {
    var page by mutableIntStateOf(1)

    composeTestRule.setContent {
      MehTheme {
        PaginationNav(
          page = page,
          totalPages = 5,
          onPageChange = { page = it },
        )
      }
    }

    composeTestRule.onNodeWithText("3").performClick()
    assertEquals(3, page)
    composeTestRule.onNodeWithContentDescription("Next page").performClick()
    assertEquals(4, page)
  }

  @Test
  fun fileUploaderItemTriggersDeleteCallback() {
    var deleted = false

    composeTestRule.setContent {
      MehTheme {
        FileUploaderItem(
          fileName = "notes.txt",
          status = LoadingStatus.Finished,
          onDeleteClick = { deleted = true },
        )
      }
    }

    composeTestRule.onNodeWithContentDescription("Remove notes.txt").performClick()
    assertTrue(deleted)
  }
}
