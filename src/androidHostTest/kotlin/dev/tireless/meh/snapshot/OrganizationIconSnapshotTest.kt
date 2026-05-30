// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.snapshot

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.icon.preview.IconPackOrganizationAlphanumericPreview
import dev.tireless.meh.icon.preview.IconPackOrganizationDataPreview
import dev.tireless.meh.icon.preview.IconPackOrganizationFilePreview
import dev.tireless.meh.icon.preview.IconPackOrganizationStatusPreview
import dev.tireless.meh.icon.preview.IconPackOrganizationSystemsPreview
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w800dp-h4000dp-xxhdpi")
class OrganizationIconSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  private fun captureIconPreview(content: @androidx.compose.runtime.Composable () -> Unit) {
    composeTestRule.setContent {
      content()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test fun alphanumeric() = captureIconPreview { IconPackOrganizationAlphanumericPreview() }

  @Test fun data() = captureIconPreview { IconPackOrganizationDataPreview() }

  @Test fun file() = captureIconPreview { IconPackOrganizationFilePreview() }

  @Test fun status() = captureIconPreview { IconPackOrganizationStatusPreview() }

  @Test fun systems() = captureIconPreview { IconPackOrganizationSystemsPreview() }
}
