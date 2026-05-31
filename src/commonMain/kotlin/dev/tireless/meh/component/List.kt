// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

@Composable
fun UnorderedList(
  items: List<String>,
  modifier: Modifier = Modifier,
) {
  Column(
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    items.forEach { item ->
      Row(verticalAlignment = Alignment.Top) {
        Box(
          modifier = Modifier
            .padding(top = 8.dp, end = MehTheme.spacing.spacing04)
            .size(4.dp)
            .clip(CircleShape)
            .background(MehTheme.colors.textPrimary),
        )
        Text(text = item, style = MehTheme.typography.body01)
      }
    }
  }
}

@Composable
fun OrderedList(
  items: List<String>,
  modifier: Modifier = Modifier,
) {
  Column(
    modifier = modifier,
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    items.forEachIndexed { index, item ->
      Row(verticalAlignment = Alignment.Top) {
        Text(
          text = "${index + 1}.",
          style = MehTheme.typography.body01,
          modifier = Modifier.padding(end = MehTheme.spacing.spacing04),
        )
        Text(text = item, style = MehTheme.typography.body01)
      }
    }
  }
}

@Composable
fun ContainedList(
  title: String,
  items: List<String>,
  modifier: Modifier = Modifier,
) {
  Column(
    modifier = modifier
      .fillMaxWidth()
      .background(MehTheme.colors.layer01),
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .padding(MehTheme.spacing.spacing05),
    ) {
      Text(text = title, style = MehTheme.typography.headingCompact01)
    }

    items.forEach { item ->
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(1.dp)
          .background(MehTheme.colors.borderSubtle01),
      )
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(MehTheme.spacing.spacing05),
      ) {
        Text(text = item, style = MehTheme.typography.bodyCompact01)
      }
    }
  }
}
