// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.TagSize
import dev.tireless.meh.theme.dp

@Composable
fun AiLabel(
  modifier: Modifier = Modifier,
  size: TagSize = TagSize.Default,
) {
  // Carbon AI Label uses a specific gradient
  val aiGradient = Brush.linearGradient(
    colors = listOf(Color(0xFFEE5396), Color(0xFF1192E8), Color(0xFFA6C8FF))
  )

  Row(
    modifier = modifier
      .height(size.dp)
      .clip(RoundedCornerShape(size.dp / 2))
      .background(aiGradient)
      .padding(horizontal = 8.dp),
    verticalAlignment = Alignment.CenterVertically
  ) {
    Icon(
      image = MehTheme.icons.AiLabel,
      size = IconSize.XSmall,
      tint = Color.White
    )
    Spacer(Modifier.size(4.dp))
    Text(
      text = "AI",
      style = MehTheme.typography.label01,
      color = Color.White
    )
  }
}
