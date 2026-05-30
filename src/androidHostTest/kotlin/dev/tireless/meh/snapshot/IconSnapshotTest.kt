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
class IconSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  private fun captureIconPreview(content: @androidx.compose.runtime.Composable () -> Unit) {
    composeTestRule.setContent {
      content()
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test fun actionsControls() = captureIconPreview { IconPackActionsControlsPreview() }
  @Test fun actionsFormatting() = captureIconPreview { IconPackActionsFormattingPreview() }
  @Test fun actionsNavigation() = captureIconPreview { IconPackActionsNavigationPreview() }
  @Test fun actionsOperations() = captureIconPreview { IconPackActionsOperationsPreview() }
  @Test fun actionsToggle() = captureIconPreview { IconPackActionsTogglePreview() }
  @Test fun brandDesignAndDevelopment() = captureIconPreview { IconPackBrandDesignAndDevelopmentPreview() }
  @Test fun brandIbm() = captureIconPreview { IconPackBrandIbmPreview() }
  @Test fun brandSocial() = captureIconPreview { IconPackBrandSocialPreview() }
  @Test fun enterpriseAi() = captureIconPreview { IconPackEnterpriseAiPreview() }
  @Test fun enterpriseAppCatalogue() = captureIconPreview { IconPackEnterpriseAppCataloguePreview() }
  @Test fun enterpriseCommerce() = captureIconPreview { IconPackEnterpriseCommercePreview() }
  @Test fun enterpriseHealth() = captureIconPreview { IconPackEnterpriseHealthPreview() }
  @Test fun enterpriseResearch() = captureIconPreview { IconPackEnterpriseResearchPreview() }
  @Test fun organizationAlphanumeric() = captureIconPreview { IconPackOrganizationAlphanumericPreview() }
  @Test fun organizationData() = captureIconPreview { IconPackOrganizationDataPreview() }
  @Test fun organizationFile() = captureIconPreview { IconPackOrganizationFilePreview() }
  @Test fun organizationStatus() = captureIconPreview { IconPackOrganizationStatusPreview() }
  @Test fun organizationSystems() = captureIconPreview { IconPackOrganizationSystemsPreview() }
  @Test fun personSenses() = captureIconPreview { IconPackPersonSensesPreview() }
  @Test fun personUser() = captureIconPreview { IconPackPersonUserPreview() }
  @Test fun planningTime() = captureIconPreview { IconPackPlanningTimePreview() }
  @Test fun planningTravel() = captureIconPreview { IconPackPlanningTravelPreview() }
  @Test fun planningWeather() = captureIconPreview { IconPackPlanningWeatherPreview() }
  @Test fun toolsInstruments() = captureIconPreview { IconPackToolsInstrumentsPreview() }
  @Test fun toolsTechnology() = captureIconPreview { IconPackToolsTechnologyPreview() }
}
