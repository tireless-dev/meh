// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev

package dev.tireless.meh.snapshot

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.icon.preview.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w800dp-h4000dp-xxhdpi")
class EnterpriseIconSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  private fun captureIconPreview(content: @androidx.compose.runtime.Composable () -> Unit) {
    composeTestRule.setContent {
      content()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test fun ai() = captureIconPreview { IconPackEnterpriseAiPreview() }
  @Test fun appCatalogue() = captureIconPreview { IconPackEnterpriseAppCataloguePreview() }
  @Test fun commerce() = captureIconPreview { IconPackEnterpriseCommercePreview() }
  @Test fun health() = captureIconPreview { IconPackEnterpriseHealthPreview() }
  @Test fun research() = captureIconPreview { IconPackEnterpriseResearchPreview() }
}
