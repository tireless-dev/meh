// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.DatePickerPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w760dp-h480dp-xxhdpi")
class DatePickerSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun datePickerLight() {
    composeTestRule.setContent {
      DatePickerPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w760dp-h480dp-night-xxhdpi")
  fun datePickerDark() {
    composeTestRule.setContent {
      DatePickerPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
