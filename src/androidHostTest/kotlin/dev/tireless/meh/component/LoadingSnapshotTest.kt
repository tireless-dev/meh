// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.LoadingPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w640dp-h500dp-xxhdpi")
class LoadingSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun loadingLight() {
    composeTestRule.setContent {
      LoadingPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w640dp-h500dp-night-xxhdpi")
  fun loadingDark() {
    composeTestRule.setContent {
      LoadingPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
