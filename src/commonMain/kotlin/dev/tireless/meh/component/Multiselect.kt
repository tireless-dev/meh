// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.ControlSize

@Composable
fun Multiselect(
  selectedOptions: List<String>,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
) {
  Select(
    selectedOption = if (selectedOptions.isEmpty()) "" else "${selectedOptions.size} selected",
    modifier = modifier,
    label = label,
    helper = helper,
    error = error,
    enabled = enabled,
    size = size,
    onClick = onClick,
  )
}
