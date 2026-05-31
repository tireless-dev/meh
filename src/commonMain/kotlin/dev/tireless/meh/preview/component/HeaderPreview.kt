// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import dev.tireless.meh.component.Header
import dev.tireless.meh.component.MonoIconButton
import dev.tireless.meh.theme.MehTheme

@Composable
fun HeaderPreview() {
  MehTheme {
    Header(
      title = "Application Name",
      onMenuClick = {},
      actions = {
        MonoIconButton(icon = MehTheme.icons.Search, onClick = {})
        MonoIconButton(icon = MehTheme.icons.User, onClick = {})
      }
    )
  }
}
