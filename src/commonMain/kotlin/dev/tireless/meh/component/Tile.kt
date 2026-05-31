// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.theme.MehTheme

@Composable
fun Tile(
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .background(MehTheme.colors.layer01)
      .padding(MehTheme.spacing.spacing05),
  ) {
    content()
  }
}

@Composable
fun ClickableTile(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  content: @Composable () -> Unit,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .background(MehTheme.colors.layer01)
      .clickable(enabled = enabled, onClick = onClick)
      .padding(MehTheme.spacing.spacing05),
  ) {
    content()
  }
}
