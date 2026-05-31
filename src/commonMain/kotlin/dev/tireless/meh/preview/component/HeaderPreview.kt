// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Header
import dev.tireless.meh.component.MonoIconButton
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Header", showBackground = true)
@Composable
internal fun HeaderPreview() {
  PreviewTheme {
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
