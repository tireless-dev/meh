// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev

package dev.tireless.meh.snapshot

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.preview.theme.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class ThemeSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun colors() {
    composeTestRule.setContent {
      ColorsPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun sizes() {
    composeTestRule.setContent {
      SizePreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun spacing() {
    composeTestRule.setContent {
      SpacingPreview()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun typographyLatin() {
    composeTestRule.setContent {
      TypographyPreviewLatin()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun typographySc() {
    composeTestRule.setContent {
      TypographyPreviewSc()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun typographyTc() {
    composeTestRule.setContent {
      TypographyPreviewTc()
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
