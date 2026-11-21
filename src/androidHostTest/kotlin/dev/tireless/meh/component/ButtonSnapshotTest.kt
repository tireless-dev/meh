// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.component.ButtonKindsPreview
import dev.tireless.meh.preview.component.ButtonOverflowPreview
import dev.tireless.meh.preview.component.ButtonSizesPreview
import dev.tireless.meh.preview.component.IconButtonKindsPreview
import dev.tireless.meh.preview.component.IconButtonSizesPreview
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
  @Config(qualifiers = "w1600dp-h1000dp-xxhdpi")
  fun buttonKindsLight() {
    composeTestRule.setContent {
      ButtonKindsPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1600dp-h1000dp-night-xxhdpi")
  fun buttonKindsDark() {
    composeTestRule.setContent {
      ButtonKindsPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w1000dp-h600dp-xxhdpi")
  fun buttonSizes() {
    composeTestRule.setContent {
      ButtonSizesPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w900dp-h1000dp-xxhdpi")
  fun buttonOverflow() {
    composeTestRule.setContent {
      ButtonOverflowPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun iconButtonKindsLight() {
    composeTestRule.setContent {
      IconButtonKindsPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  @Config(qualifiers = "w400dp-h800dp-night-xxhdpi")
  fun iconButtonKindsDark() {
    composeTestRule.setContent {
      IconButtonKindsPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun iconButtonSizes() {
    composeTestRule.setContent {
      IconButtonSizesPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
