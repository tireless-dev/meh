// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.DismissibleTagPreview
import dev.tireless.meh.preview.component.OperationalTagPreview
import dev.tireless.meh.preview.component.SelectableTagPreview
import dev.tireless.meh.preview.component.TagReadOnlyPreview
import dev.tireless.meh.preview.component.TagSizesPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w700dp-h600dp-xxhdpi")
class TagSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun tagReadOnlyLight() {
    composeTestRule.setContent {
      TagReadOnlyPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w700dp-h600dp-night-xxhdpi")
  fun tagReadOnlyDark() {
    composeTestRule.setContent {
      TagReadOnlyPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1200dp-h600dp-xxhdpi")
  fun dismissibleTagLight() {
    composeTestRule.setContent {
      DismissibleTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1200dp-h600dp-night-xxhdpi")
  fun dismissibleTagDark() {
    composeTestRule.setContent {
      DismissibleTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1000dp-h400dp-xxhdpi")
  fun selectableTagLight() {
    composeTestRule.setContent {
      SelectableTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1000dp-h400dp-night-xxhdpi")
  fun selectableTagDark() {
    composeTestRule.setContent {
      SelectableTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1100dp-h600dp-xxhdpi")
  fun operationalTagLight() {
    composeTestRule.setContent {
      OperationalTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1100dp-h600dp-night-xxhdpi")
  fun operationalTagDark() {
    composeTestRule.setContent {
      OperationalTagPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1000dp-h400dp-xxhdpi")
  fun tagSizes() {
    composeTestRule.setContent {
      TagSizesPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
