// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.MehTheme

@Composable
fun Popover(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  if (expanded) {
    Popup(
      onDismissRequest = onDismissRequest,
      properties = PopupProperties(focusable = true)
    ) {
      Box(
        modifier = modifier
          .shadow(elevation = 6.dp, shape = RoundedCornerShape(2.dp))
          .clip(RoundedCornerShape(2.dp))
          .background(MehTheme.colors.background)
          .padding(MehTheme.spacing.spacing05)
      ) {
        content()
      }
    }
  }
}
