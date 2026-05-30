// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.snapshot

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.ButtonPreviewSizes
import dev.tireless.meh.preview.component.ButtonPreviewTypes
import dev.tireless.meh.preview.component.IconButtonPreviewMono
import dev.tireless.meh.preview.component.IconButtonPreviewStates
import dev.tireless.meh.preview.component.RadioPreviewHorizontal
import dev.tireless.meh.preview.component.RadioPreviewVertical
import dev.tireless.meh.preview.component.TextPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class ComponentSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun text() {
    composeTestRule.setContent {
      TextPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun buttonTypes() {
    composeTestRule.setContent {
      ButtonPreviewTypes()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun buttonSizes() {
    composeTestRule.setContent {
      ButtonPreviewSizes()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun iconButtonMono() {
    composeTestRule.setContent {
      IconButtonPreviewMono()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun iconButtonStates() {
    composeTestRule.setContent {
      IconButtonPreviewStates()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun radioHorizontal() {
    composeTestRule.setContent {
      RadioPreviewHorizontal()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun radioVertical() {
    composeTestRule.setContent {
      RadioPreviewVertical()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
