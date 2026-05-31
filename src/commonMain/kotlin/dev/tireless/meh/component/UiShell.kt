// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.gray100

@Composable
fun Header(
  title: String,
  modifier: Modifier = Modifier,
  onMenuClick: (() -> Unit)? = null,
  actions: @Composable RowScope.() -> Unit = {},
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(48.dp)
      .background(gray100)
      .padding(horizontal = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically
  ) {
    if (onMenuClick != null) {
      MonoIconButton(
        icon = MehTheme.icons.Menu,
        onClick = onMenuClick,
        color = Color.White
      )
      Spacer(Modifier.size(MehTheme.spacing.spacing05))
    }

    Text(
      text = title,
      style = MehTheme.typography.headingCompact01,
      color = Color.White
    )

    Spacer(Modifier.weight(1f))

    Row(verticalAlignment = Alignment.CenterVertically) {
      actions()
    }
  }
}
