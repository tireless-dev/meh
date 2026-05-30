// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@Composable
fun Select(
  selectedOption: String,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
  onClick: () -> Unit,
) {
  val isInvalid = error != null

  Column(modifier = modifier.fillMaxWidth()) {
    label?.let {
      FormLabel(text = it, enabled = enabled, modifier = Modifier.padding(bottom = MehTheme.spacing.spacing03))
    }

    val backgroundColor = if (enabled) MehTheme.colors.field02 else MehTheme.colors.field02.copy(alpha = 0.5f)
    val borderColor = if (isInvalid) MehTheme.colors.supportError else Color.Transparent
    val bottomBorderColor = if (isInvalid) MehTheme.colors.supportError else MehTheme.colors.borderStrong01

    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(size.dp)
        .background(backgroundColor)
        .clickable(enabled = enabled, onClick = onClick)
        .border(width = if (isInvalid) 2.dp else 0.dp, color = borderColor)
        .let {
          if (!isInvalid) {
            it.border(width = 1.dp, color = bottomBorderColor)
          } else it
        }
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = MehTheme.spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically
      ) {
        Text(
          text = selectedOption,
          style = MehTheme.typography.body01,
          color = if (enabled) MehTheme.colors.textPrimary else MehTheme.colors.textDisabled,
          modifier = Modifier.weight(1f)
        )

        if (isInvalid) {
          Icon(
            image = Icons.WarningFilled,
            size = IconSize.Small,
            tint = MehTheme.colors.supportError,
            modifier = Modifier.padding(start = MehTheme.spacing.spacing03)
          )
        }

        Icon(
          image = Icons.ChevronDown,
          size = IconSize.Small,
          tint = if (enabled) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
          modifier = Modifier.padding(start = MehTheme.spacing.spacing03)
        )
      }
    }

    if (error != null) {
      Text(
        text = error,
        style = MehTheme.typography.label01,
        color = MehTheme.colors.textError,
        modifier = Modifier.padding(top = MehTheme.spacing.spacing02)
      )
    } else if (helper != null) {
      FormHelper(text = helper, enabled = enabled, modifier = Modifier.padding(top = MehTheme.spacing.spacing02))
    }
  }
}
