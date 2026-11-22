// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.CheckboxGroupPreview
import dev.tireless.meh.preview.component.CheckboxStatesPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w700dp-h600dp-xxhdpi")
class CheckboxSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  @Config(qualifiers = "w780dp-h600dp-xxhdpi")
  fun checkboxStatesLight() {
    composeTestRule.setContent {
      CheckboxStatesPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w780dp-h600dp-night-xxhdpi")
  fun checkboxStatesDark() {
    composeTestRule.setContent {
      CheckboxStatesPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun checkboxGroupLight() {
    composeTestRule.setContent {
      CheckboxGroupPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w700dp-h600dp-night-xxhdpi")
  fun checkboxGroupDark() {
    composeTestRule.setContent {
      CheckboxGroupPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
