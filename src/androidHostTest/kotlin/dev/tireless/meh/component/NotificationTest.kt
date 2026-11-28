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
class NotificationTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun actionableNotificationTriggersActionAndClose() {
    var actionClicked = false
    var closed = false

    composeTestRule.setContent {
      MehTheme {
        ActionableNotification(
          title = "Session expiring",
          subtitle = "Extend your session to keep working.",
          actionButtonLabel = "Extend",
          onActionButtonClick = { actionClicked = true },
          type = NotificationType.Warning,
          onClose = { closed = true },
        )
      }
    }

    composeTestRule.onNodeWithText("Extend").performClick()
    assertTrue(actionClicked)

    composeTestRule.onNodeWithContentDescription("Close notification").performClick()
    assertTrue(closed)
  }

  @Test
  fun calloutNotificationHasNoCloseButton() {
    composeTestRule.setContent {
      MehTheme {
        CalloutNotification(
          title = "Heads up",
          subtitle = "Static contextual information.",
        )
      }
    }

    composeTestRule.onNodeWithText("Heads up").assertIsDisplayed()
    composeTestRule.onNodeWithContentDescription("Close notification").assertDoesNotExist()
  }
}
