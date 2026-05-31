// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ColorPair
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.TagSize
import dev.tireless.meh.theme.dp

enum class TagType {
  Gray,
  Red,
  Magenta,
  Purple,
  Blue,
  Cyan,
  Teal,
  Green,
  HighContrast,
}

@Composable
fun Tag(
  text: String,
  modifier: Modifier = Modifier,
  type: TagType = TagType.Gray,
  size: TagSize = TagSize.Default,
  onClose: (() -> Unit)? = null,
) {
  val colors = getTagColors(type)

  Row(
    modifier =
    modifier
      .height(size.dp)
      .clip(RoundedCornerShape(12.dp))
      .background(colors.background)
      .padding(horizontal = 8.dp),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = text,
      style = MehTheme.typography.label01,
      color = colors.text,
    )

    if (onClose != null) {
      Spacer(Modifier.size(4.dp))
      Icon(
        image = Icons.Close,
        size = IconSize.XSmall,
        tint = colors.text,
        modifier = Modifier.clickable { onClose() },
      )
    }
  }
}

@Composable
private fun getTagColors(type: TagType): ColorPair = when (type) {
  TagType.Gray -> MehTheme.colors.tagGray
  TagType.Red -> MehTheme.colors.tagRed
  TagType.Magenta -> MehTheme.colors.tagMagenta
  TagType.Purple -> MehTheme.colors.tagPurple
  TagType.Blue -> MehTheme.colors.tagBlue
  TagType.Cyan -> MehTheme.colors.tagCyan
  TagType.Teal -> MehTheme.colors.tagTeal
  TagType.Green -> MehTheme.colors.tagGreen
  TagType.HighContrast -> ColorPair(MehTheme.colors.textPrimary, MehTheme.colors.background)
}
