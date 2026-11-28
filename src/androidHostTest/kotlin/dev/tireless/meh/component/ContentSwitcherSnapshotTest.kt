// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.ContentSwitcherPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w760dp-h520dp-xxhdpi")
class ContentSwitcherSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun contentSwitcherLight() {
    composeTestRule.setContent {
      ContentSwitcherPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w760dp-h520dp-night-xxhdpi")
  fun contentSwitcherDark() {
    composeTestRule.setContent {
      ContentSwitcherPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
