// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.FormPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w760dp-h580dp-xxhdpi")
class FormSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun formLight() {
    composeTestRule.setContent {
      FormPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w760dp-h580dp-night-xxhdpi")
  fun formDark() {
    composeTestRule.setContent {
      FormPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
