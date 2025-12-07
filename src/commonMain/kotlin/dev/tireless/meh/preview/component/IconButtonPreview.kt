// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.component.FocusableIconButton
import dev.tireless.meh.component.HorizontalPaddingScale
import dev.tireless.meh.component.MonoIconButton
import dev.tireless.meh.component.ToggleIconButton
import dev.tireless.meh.icon.Add
import dev.tireless.meh.icon.AddAlt
import dev.tireless.meh.icon.Close
import dev.tireless.meh.icon.CloseFilled
import dev.tireless.meh.icon.CloseOutline
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(name = "IconButton – Mono", showBackground = true)
@Composable
internal fun IconButtonPreviewMono() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Row(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing04),
      horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      MonoIconButton(onClick = {}, icon = Add, size = ControlSize.Small)
      MonoIconButton(
        onClick = {},
        icon = Close,
        size = ControlSize.Medium,
        gap = HorizontalPaddingScale.Dense,
      )
      MonoIconButton(
        onClick = {},
        icon = CloseOutline,
        iconSize = IconSize.Large,
        size = ControlSize.Large,
        gap = HorizontalPaddingScale.Compact,
      )
      MonoIconButton(onClick = {}, icon = CloseFilled, enabled = false, size = ControlSize.Small)
    }
  }
}

@Preview(name = "IconButton – States", showBackground = true)
@Composable
internal fun IconButtonPreviewStates() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing04),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      Row(horizontalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
        FocusableIconButton(onClick = {}, icon = Add, active = true)
        FocusableIconButton(onClick = {}, icon = Add, active = false)
      }
      Row(horizontalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
        ToggleIconButton(
          onClick = {},
          state = true,
          on = true to Close,
          off = false to AddAlt,
          size = ControlSize.Medium,
          iconSize = IconSize.Medium,
        )
        ToggleIconButton(
          onClick = {},
          state = false,
          on = true to Close,
          off = false to AddAlt,
          size = ControlSize.Medium,
          iconSize = IconSize.Medium,
        )
      }
    }
  }
}
