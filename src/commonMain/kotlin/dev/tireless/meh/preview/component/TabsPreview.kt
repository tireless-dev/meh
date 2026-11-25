// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.TabVariant
import dev.tireless.meh.component.Tabs
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.TabSize

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun TabsPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val bodyStyle = typography.body01.copy(color = colors.textPrimary)

    val lineHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val lineFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val closeHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val containedHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val containedFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val verticalHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val verticalFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      Tabs(
        selectedIndex = 0,
        onTabSelect = {},
        variant = TabVariant.Line,
      ) {
        tab(label = "Dashboard") {
          BasicText(
            text = "Line tab panel content for the active Dashboard section.",
            style = bodyStyle,
          )
        }
        tab(label = "Hover", interactionSource = lineHoverSource)
        tab(label = "Focus", interactionSource = lineFocusSource)
        tab(label = "Analytics", icon = Icons.Analytics)
        tab(label = "Disabled", enabled = false)
      }

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing07),
      ) {
        Tabs(
          selectedIndex = 0,
          onTabSelect = {},
          variant = TabVariant.Line,
          dismissible = true,
          onTabClose = {},
          modifier = Modifier.weight(1f),
        ) {
          tab(label = "Overview", icon = Icons.Dashboard, closeInteractionSource = closeHoverSource)
          tab(label = "Activity", icon = Icons.Activity)
          tab(label = "Locked", icon = Icons.Settings, enabled = false)
        }

        Tabs(
          selectedIndex = 1,
          onTabSelect = {},
          variant = TabVariant.Line,
          size = TabSize.Large,
          modifier = Modifier.weight(0.55f),
        ) {
          tab(icon = Icons.Dashboard, contentDescription = "Dashboard")
          tab(icon = Icons.Analytics, contentDescription = "Analytics")
          tab(icon = Icons.Activity, contentDescription = "Activity")
          tab(icon = Icons.Settings, contentDescription = "Settings", enabled = false)
        }
      }

      Tabs(
        selectedIndex = 0,
        onTabSelect = {},
        variant = TabVariant.Contained,
        fullWidth = true,
      ) {
        tab(label = "Dashboard", secondaryLabel = "(21/25)", icon = Icons.Dashboard) {
          BasicText(
            text = "Contained tab panel content blends with the selected tab surface on layer01.",
            style = bodyStyle,
          )
        }
        tab(
          label = "Hover",
          secondaryLabel = "(12/23)",
          interactionSource = containedHoverSource,
        )
        tab(
          label = "Focus",
          secondaryLabel = "(0/7)",
          interactionSource = containedFocusSource,
        )
        tab(label = "Disabled", secondaryLabel = "(3/10)", enabled = false)
      }

      Tabs(
        selectedIndex = 1,
        onTabSelect = {},
        variant = TabVariant.Contained,
        dismissible = true,
        onTabClose = {},
      ) {
        tab(label = "Cluster overview")
        tab(label = "Workloads", icon = Icons.Activity)
        tab(label = "Storage volumes")
        tab(label = "Network policies")
        tab(label = "Observability")
        tab(label = "Access control")
      }

      Tabs(
        selectedIndex = 0,
        onTabSelect = {},
        variant = TabVariant.Vertical,
      ) {
        tab(label = "Dashboard", secondaryLabel = "Active overview") {
          BasicText(
            text = "Vertical tabs place the 3px interactive indicator on the left edge and seamlessly connect the selected tab into the panel.",
            style = bodyStyle,
          )
        }
        tab(
          label = "Monitoring",
          secondaryLabel = "Hover state",
          interactionSource = verticalHoverSource,
        )
        tab(
          label = "Settings",
          secondaryLabel = "Focus state",
          interactionSource = verticalFocusSource,
        )
        tab(
          label = "Audit logs",
          secondaryLabel = "Disabled",
          enabled = false,
        )
      }
    }
  }
}
