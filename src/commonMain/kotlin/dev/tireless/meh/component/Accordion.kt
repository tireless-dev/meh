// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@Composable
fun Accordion(
  modifier: Modifier = Modifier,
  content: @Composable () -> Unit,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    content()
  }
}

@Composable
fun AccordionItem(
  title: String,
  modifier: Modifier = Modifier,
  initiallyExpanded: Boolean = false,
  content: @Composable () -> Unit,
) {
  var expanded by remember { mutableStateOf(initiallyExpanded) }
  val rotation by animateFloatAsState(if (expanded) 0f else -90f, label = "ChevronRotation")

  Column(
    modifier = modifier
      .fillMaxWidth()
      .background(MehTheme.colors.background)
  ) {
    // Divider
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)
        .background(MehTheme.colors.borderSubtle01)
    )

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(48.dp)
        .clickable { expanded = !expanded }
        .padding(horizontal = MehTheme.spacing.spacing05),
      verticalAlignment = Alignment.CenterVertically
    ) {
      Icon(
        image = Icons.ChevronDown,
        size = IconSize.Small,
        tint = MehTheme.colors.iconPrimary,
        modifier = Modifier.rotate(rotation)
      )
      Text(
        text = title,
        style = MehTheme.typography.headingCompact01,
        modifier = Modifier.padding(start = MehTheme.spacing.spacing05)
      )
    }

    AnimatedVisibility(visible = expanded) {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(
            start = 40.dp, // 16 (icon) + 16 (spacing) + some extra
            end = MehTheme.spacing.spacing05,
            bottom = MehTheme.spacing.spacing07,
            top = MehTheme.spacing.spacing03
          )
      ) {
        content()
      }
    }
  }
}
