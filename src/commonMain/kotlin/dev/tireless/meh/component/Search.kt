// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Composable
fun Search(
  value: String,
  onValueChange: (String) -> Unit,
  onClear: () -> Unit,
  modifier: Modifier = Modifier,
  placeholder: String = "Search",
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
) {
  TextInput(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    placeholder = placeholder,
    enabled = enabled,
    size = size,
    trailingIcon = {
      Row(
        modifier = Modifier.fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically
      ) {
        if (value.isNotEmpty()) {
          Box(
            modifier = Modifier
              .fillMaxHeight()
              .clickable(enabled = enabled, onClick = onClear),
            contentAlignment = Alignment.Center
          ) {
            Icon(
              image = Icons.Close,
              size = IconSize.Small,
              tint = if (enabled) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
              modifier = Modifier.padding(horizontal = MehTheme.spacing.spacing03)
            )
          }
        }
        Icon(
          image = Icons.Search,
          size = IconSize.Small,
          tint = if (enabled) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
          modifier = Modifier.padding(end = MehTheme.spacing.spacing03)
        )
      }
    }
  )
}
