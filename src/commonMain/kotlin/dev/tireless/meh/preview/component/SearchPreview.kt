// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ExpandableSearch
import dev.tireless.meh.component.Search
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun SearchPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)

    val focusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)
    val expandableHoverSource = rememberPreviewInteractionSource(PreviewInteractionState.Hover)
    val expandableFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Search States & Sizes", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Default", style = labelStyle)
            Search(
              value = "",
              onValueChange = {},
              onClear = {},
              placeholder = "Find your items",
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Filled (with clear button)", style = labelStyle)
            Search(
              value = "Carbon design",
              onValueChange = {},
              onClear = {},
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Focus state", style = labelStyle)
            Search(
              value = "Active query",
              onValueChange = {},
              onClear = {},
              interactionSource = focusSource,
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Disabled state", style = labelStyle)
            Search(
              value = "",
              onValueChange = {},
              onClear = {},
              placeholder = "Disabled search",
              enabled = false,
            )
          }
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Small (32px)", style = labelStyle)
            Search(
              value = "Small search",
              onValueChange = {},
              onClear = {},
              size = ControlSize.Small,
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Medium (40px — default)", style = labelStyle)
            Search(
              value = "Medium search",
              onValueChange = {},
              onClear = {},
              size = ControlSize.Medium,
            )
          }
          Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
            BasicText(text = "Large (48px)", style = labelStyle)
            Search(
              value = "Large search",
              onValueChange = {},
              onClear = {},
              size = ControlSize.Large,
            )
          }
        }
      }

      BasicText(text = "Expandable Search", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        ExpandableSearch(
          value = "",
          onValueChange = {},
          onClear = {},
          expanded = false,
          onExpandedChange = {},
        )
        ExpandableSearch(
          value = "",
          onValueChange = {},
          onClear = {},
          expanded = false,
          onExpandedChange = {},
          interactionSource = expandableHoverSource,
        )
        ExpandableSearch(
          value = "",
          onValueChange = {},
          onClear = {},
          expanded = false,
          onExpandedChange = {},
          interactionSource = expandableFocusSource,
        )
        ExpandableSearch(
          value = "Expanded search",
          onValueChange = {},
          onClear = {},
          expanded = true,
          onExpandedChange = {},
          modifier = Modifier.weight(1f),
        )
      }
    }
  }
}
