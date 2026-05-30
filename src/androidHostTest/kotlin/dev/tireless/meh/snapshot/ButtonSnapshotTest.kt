// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev

package dev.tireless.meh.snapshot

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.component.Button
import dev.tireless.meh.component.ButtonType
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class ButtonSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun buttonPrimary() {
    composeTestRule.setContent {
      PreviewTheme {
        Button(text = "Primary", onClick = {})
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun buttonSecondary() {
    composeTestRule.setContent {
      PreviewTheme {
        Button(text = "Secondary", type = ButtonType.Secondary, onClick = {})
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun buttonSmall() {
    composeTestRule.setContent {
      PreviewTheme {
        Button(text = "Small", onClick = {}, size = ControlSize.Small)
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
