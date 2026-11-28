// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Header
import dev.tireless.meh.component.HeaderGlobalAction
import dev.tireless.meh.component.HeaderNavItem
import dev.tireless.meh.component.HeaderPanel
import dev.tireless.meh.component.SideNav
import dev.tireless.meh.component.SideNavDivider
import dev.tireless.meh.component.SideNavItem
import dev.tireless.meh.component.SideNavMenu
import dev.tireless.meh.component.SideNavMenuItem
import dev.tireless.meh.component.SwitcherDivider
import dev.tireless.meh.component.SwitcherItem
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun HeaderPreview() {
  PreviewTheme {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .background(MehTheme.colors.background)
        .padding(24.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
      Text(
        text = "UI Shell — Header, Left Panel & Right Panel",
        style = MehTheme.typography.heading02,
        color = MehTheme.colors.textPrimary,
      )

      Column(
        modifier = Modifier
          .fillMaxWidth()
          .border(1.dp, MehTheme.colors.borderSubtle01),
      ) {
        Header(
          prefix = "Carbon",
          title = "Platform",
          isMenuExpanded = true,
          onMenuClick = {},
          navigation = {
            HeaderNavItem(label = "Dashboard", selected = true, onClick = {})
            HeaderNavItem(label = "Catalog", onClick = {})
            HeaderNavItem(label = "Docs", onClick = {})
          },
          actions = {
            HeaderGlobalAction(
              icon = MehTheme.icons.Search,
              contentDescription = "Search",
              onClick = {},
            )
            HeaderGlobalAction(
              icon = MehTheme.icons.Notification,
              contentDescription = "Notifications",
              onClick = {},
            )
            HeaderGlobalAction(
              icon = MehTheme.icons.Switcher,
              contentDescription = "App switcher",
              active = true,
              onClick = {},
            )
          },
        )

        Row(
          modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
        ) {
          SideNav(
            expanded = true,
            expandedWidth = 220.dp,
            modifier = Modifier.fillMaxHeight(),
          ) {
            SideNavItem(
              label = "Overview",
              icon = MehTheme.icons.Dashboard,
              selected = true,
              onClick = {},
            )
            SideNavMenu(
              title = "Analytics",
              icon = MehTheme.icons.Analytics,
              expanded = true,
              onExpandedChange = {},
            ) {
              SideNavMenuItem(label = "Traffic", onClick = {})
              SideNavMenuItem(label = "Retention", onClick = {})
            }
            SideNavDivider()
            SideNavItem(
              label = "Settings",
              icon = MehTheme.icons.Settings,
              onClick = {},
            )
          }

          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
              .background(MehTheme.colors.layer01)
              .padding(16.dp),
          ) {
            Text(
              text = "Main workspace content",
              style = MehTheme.typography.bodyCompact01,
              color = MehTheme.colors.textSecondary,
            )
          }

          HeaderPanel(
            expanded = true,
            width = 210.dp,
            modifier = Modifier.fillMaxHeight(),
          ) {
            SwitcherItem(label = "Carbon Platform", selected = true, onClick = {})
            SwitcherDivider()
            SwitcherItem(label = "Cloud Console", onClick = {})
            SwitcherItem(label = "Observability", onClick = {})
            SwitcherItem(label = "IAM & Access", onClick = {})
          }
        }
      }

      Text(
        text = "Left Panel Rail (Collapsed)",
        style = MehTheme.typography.heading02,
        color = MehTheme.colors.textPrimary,
      )

      Column(
        modifier = Modifier
          .fillMaxWidth()
          .border(1.dp, MehTheme.colors.borderSubtle01),
      ) {
        Header(
          prefix = "Carbon",
          title = "Rail Shell",
          isMenuExpanded = false,
          onMenuClick = {},
          actions = {
            HeaderGlobalAction(
              icon = MehTheme.icons.UserAvatar,
              contentDescription = "Profile",
              onClick = {},
            )
          },
        )
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .height(160.dp),
        ) {
          SideNav(
            expanded = false,
            isRail = true,
            modifier = Modifier.fillMaxHeight(),
          ) {
            SideNavItem(
              label = "Overview",
              icon = MehTheme.icons.Dashboard,
              selected = true,
              isRailCollapsed = true,
              onClick = {},
            )
            SideNavItem(
              label = "Analytics",
              icon = MehTheme.icons.Analytics,
              isRailCollapsed = true,
              onClick = {},
            )
            SideNavItem(
              label = "Settings",
              icon = MehTheme.icons.Settings,
              isRailCollapsed = true,
              onClick = {},
            )
          }
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxHeight()
              .background(MehTheme.colors.layer01)
              .padding(16.dp),
          ) {
            Text(
              text = "Collapsed 48dp rail workspace",
              style = MehTheme.typography.bodyCompact01,
              color = MehTheme.colors.textSecondary,
            )
          }
        }
      }
    }
  }
}
