// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.PreviewTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class SelectSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun selectDefault() {
    composeTestRule.setContent {
      PreviewTheme {
        Select(
          selectedOption = "Option 1",
          label = "Country",
          helper = "Select your country",
        )
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun selectExpanded() {
    composeTestRule.setContent {
      PreviewTheme {
        Select(
          selectedOption = "Option 1",
          expanded = true,
          label = "Country",
        )
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun selectError() {
    composeTestRule.setContent {
      PreviewTheme {
        Select(
          selectedOption = "Invalid Option",
          label = "Country",
          error = "Please select a valid option",
        )
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
