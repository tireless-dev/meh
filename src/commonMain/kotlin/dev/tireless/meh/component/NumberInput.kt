// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@Composable
fun NumberInput(
  value: Double,
  onValueChange: (Double) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  min: Double = Double.NEGATIVE_INFINITY,
  max: Double = Double.POSITIVE_INFINITY,
  step: Double = 1.0,
  size: ControlSize = ControlSize.Large,
) {
  TextInput(
    value = if (value % 1.0 == 0.0) value.toInt().toString() else value.toString(),
    onValueChange = { newValue ->
      newValue.toDoubleOrNull()?.let { onValueChange(it.coerceIn(min, max)) }
    },
    modifier = modifier,
    label = label,
    helper = helper,
    error = error,
    enabled = enabled,
    readOnly = readOnly,
    size = size,
    trailingIcon = {
      Row(
        modifier = Modifier.fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Column(
          modifier = Modifier
            .width(40.dp)
            .fillMaxHeight(),
        ) {
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxWidth()
              .clickable(enabled = enabled && !readOnly && value + step <= max) {
                onValueChange((value + step).coerceAtMost(max))
              },
            contentAlignment = Alignment.Center,
          ) {
            Icon(
              image = Icons.CaretUp,
              size = IconSize.XSmall,
              tint = if (enabled && value + step <= max) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
            )
          }
          Box(
            modifier = Modifier
              .weight(1f)
              .fillMaxWidth()
              .clickable(enabled = enabled && !readOnly && value - step >= min) {
                onValueChange((value - step).coerceAtLeast(min))
              },
            contentAlignment = Alignment.Center,
          ) {
            Icon(
              image = Icons.CaretDown,
              size = IconSize.XSmall,
              tint = if (enabled && value - step >= min) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
            )
          }
        }
      }
    },
  )
}
