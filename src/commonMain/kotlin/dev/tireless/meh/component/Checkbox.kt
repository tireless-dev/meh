// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Composable
fun Checkbox(
  checked: Boolean,
  label: String,
  onCheckedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  indeterminate: Boolean = false,
  hideLabel: Boolean = false,
) {
  val interactionSource = remember { MutableInteractionSource() }

  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier =
    modifier
      .clickable(
        enabled = enabled,
        interactionSource = interactionSource,
        indication = null,
        onClick = { onCheckedChange(!checked) },
      )
      .padding(
        vertical = MehTheme.spacing.spacing03,
      ),
  ) {
    val icon =
      when {
        indeterminate -> Icons.CheckboxIndeterminateFilled
        checked -> Icons.CheckboxCheckedFilled
        else -> Icons.Checkbox
      }

    val iconTint =
      when {
        !enabled -> MehTheme.colors.iconDisabled
        indeterminate || checked -> MehTheme.colors.interactive
        else -> MehTheme.colors.iconPrimary
      }

    Icon(
      image = icon,
      size = IconSize.Small,
      contentDescription = null,
      tint = iconTint,
    )

    if (!hideLabel) {
      Spacer(Modifier.size(MehTheme.spacing.spacing03))
      Text(
        text = label,
        style = MehTheme.typography.bodyCompact01,
        enabled = enabled,
      )
    }
  }
}

@Composable
fun CheckboxGroup(
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  enabled: Boolean = true,
  layout: GroupLayout = GroupLayout.Vertical,
  content: @Composable () -> Unit,
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    label?.let {
      FormLabel(text = it, enabled = enabled)
    }

    val contentWithState = remember(content) { movableContentOf(content) }

    if (layout == GroupLayout.Horizontal) {
      Row(horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing04)) {
        contentWithState()
      }
    } else {
      Column {
        contentWithState()
      }
    }

    helper?.let {
      FormHelper(text = it, enabled = enabled)
    }
  }
}
