// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class UiShellTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun headerNavAndMenuToggleWork() {
    var menuExpanded by mutableStateOf(false)
    var selectedNav by mutableStateOf("Dashboard")

    composeTestRule.setContent {
      MehTheme {
        Header(
          prefix = "Carbon",
          title = "Platform",
          isMenuExpanded = menuExpanded,
          onMenuClick = { menuExpanded = !menuExpanded },
          navigation = {
            HeaderNavItem(
              label = "Dashboard",
              selected = selectedNav == "Dashboard",
              onClick = { selectedNav = "Dashboard" },
            )
            HeaderNavItem(
              label = "Catalog",
              selected = selectedNav == "Catalog",
              onClick = { selectedNav = "Catalog" },
            )
          },
        )
      }
    }

    composeTestRule.onNodeWithContentDescription("Open menu").performClick()
    assertEquals(true, menuExpanded)
    composeTestRule.onNodeWithContentDescription("Close menu").assertIsDisplayed()

    composeTestRule.onNodeWithText("Catalog").performClick()
    assertEquals("Catalog", selectedNav)
  }

  @Test
  fun sideNavMenuExpandsAndSelectsChild() {
    var expanded by mutableStateOf(false)
    var selectedItem by mutableStateOf("Overview")

    composeTestRule.setContent {
      MehTheme {
        SideNav(expanded = true) {
          SideNavItem(
            label = "Overview",
            selected = selectedItem == "Overview",
            onClick = { selectedItem = "Overview" },
          )
          SideNavMenu(
            title = "Analytics",
            expanded = expanded,
            onExpandedChange = { expanded = it },
          ) {
            SideNavMenuItem(
              label = "Traffic",
              selected = selectedItem == "Traffic",
              onClick = { selectedItem = "Traffic" },
            )
          }
        }
      }
    }

    composeTestRule.onNodeWithText("Traffic").assertDoesNotExist()
    composeTestRule.onNodeWithText("Analytics").performClick()
    composeTestRule.onNodeWithText("Traffic").assertIsDisplayed().performClick()
    assertEquals("Traffic", selectedItem)
  }

  @Test
  fun headerPanelTogglesAndSelectsSwitcherItem() {
    var panelOpen by mutableStateOf(false)
    var selectedApp by mutableStateOf("Carbon Platform")

    composeTestRule.setContent {
      MehTheme {
        Header(
          title = "Platform",
          actions = {
            HeaderGlobalAction(
              icon = MehTheme.icons.Switcher,
              contentDescription = "App switcher",
              active = panelOpen,
              onClick = { panelOpen = !panelOpen },
            )
          },
        )
        HeaderPanel(expanded = panelOpen) {
          SwitcherItem(
            label = "Carbon Platform",
            selected = selectedApp == "Carbon Platform",
            onClick = { selectedApp = "Carbon Platform" },
          )
          SwitcherDivider()
          SwitcherItem(
            label = "Cloud Console",
            selected = selectedApp == "Cloud Console",
            onClick = { selectedApp = "Cloud Console" },
          )
        }
      }
    }

    composeTestRule.onNodeWithText("Cloud Console").assertDoesNotExist()
    composeTestRule.onNodeWithContentDescription("App switcher").performClick()
    composeTestRule.onNodeWithText("Cloud Console").assertIsDisplayed().performClick()
    assertEquals("Cloud Console", selectedApp)
  }
}
