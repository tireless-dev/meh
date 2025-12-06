// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Typography.bodyCompact01

@Composable
fun Radio(
  value: Int,
  onValueChange: (Int) -> Unit,
  values: List<String>,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  label: String? = null,
  helper: String? = null,
  layout: GroupLayout = GroupLayout.Horizontal,
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    label?.let {
      FormLabel(text = it, enabled = enabled)
    }

    if (layout == GroupLayout.Horizontal) {
      Row(horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing04)) {
        values.map {
          RadioOption(
            selected = value == values.indexOf(it),
            label = it,
            onClick = { onValueChange(values.indexOf(it)) },
          )
        }
      }
    } else {
      Column(verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03)) {
        values.map {
          RadioOption(
            selected = value == values.indexOf(it),
            label = it,
            onClick = { onValueChange(values.indexOf(it)) },
          )
        }
      }
    }

    helper?.let {
      FormHelper(text = it)
    }
  }
}

@Composable
fun RadioOption(
  selected: Boolean,
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = modifier.clickable(onClick = onClick),
  ) {
    Icon(
      image = if (selected) Icons.RadioButtonChecked else Icons.RadioButton,
      size = IconSize.Expressive,
      contentDescription = null,
      tint = if (enabled) Color.Unspecified else MehTheme.colors.iconDisabled,
    )
    Spacer(Modifier.size(MehTheme.spacing.spacing03))
    Text(
      text = label,
      style = bodyCompact01,
      color = if (enabled) MehTheme.colors.textPrimary else MehTheme.colors.textDisabled,
    )
  }
}
