// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

enum class TabVariant {
  Line,
  Contained,
}

@Composable
fun Tabs(
  selectedIndex: Int,
  onTabSelected: (Int) -> Unit,
  tabs: List<String>,
  modifier: Modifier = Modifier,
  variant: TabVariant = TabVariant.Line,
) {
  Row(
    modifier = modifier.fillMaxWidth(),
  ) {
    tabs.forEachIndexed { index, title ->
      TabItem(
        title = title,
        selected = index == selectedIndex,
        onClick = { onTabSelected(index) },
        variant = variant,
        modifier = Modifier.weight(1f)
      )
    }
  }
}

@Composable
private fun TabItem(
  title: String,
  selected: Boolean,
  onClick: () -> Unit,
  variant: TabVariant,
  modifier: Modifier = Modifier,
) {
  val interactionSource = remember { MutableInteractionSource() }

  val backgroundColor = when (variant) {
    TabVariant.Line -> Color.Transparent
    TabVariant.Contained -> if (selected) MehTheme.colors.background else MehTheme.colors.layer01
  }

  val textColor = if (selected) MehTheme.colors.textPrimary else MehTheme.colors.textSecondary

  Box(
    modifier = modifier
      .height(40.dp)
      .background(backgroundColor)
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        onClick = onClick
      ),
    contentAlignment = Alignment.Center
  ) {
    Column(
      modifier = Modifier.fillMaxWidth(),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Box(
        modifier = Modifier
          .weight(1f)
          .padding(horizontal = MehTheme.spacing.spacing05),
        contentAlignment = Alignment.Center
      ) {
        Text(
          text = title,
          style = MehTheme.typography.bodyCompact01,
          color = textColor
        )
      }

      if (variant == TabVariant.Line) {
        Box(
          modifier = Modifier
            .fillMaxWidth()
            .height(2.dp)
            .background(if (selected) MehTheme.colors.interactive else MehTheme.colors.borderSubtle01)
        )
      } else if (variant == TabVariant.Contained && !selected) {
        Box(
          modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(MehTheme.colors.borderSubtle01)
        )
      }
    }
  }
}
