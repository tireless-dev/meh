// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

@Composable
fun StructuredList(
  headers: List<String>,
  rows: List<List<String>>,
  modifier: Modifier = Modifier,
) {
  Column(modifier = modifier.fillMaxWidth()) {
    // Header
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = MehTheme.spacing.spacing03),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      headers.forEach { header ->
        Box(
          modifier = Modifier
            .weight(1f)
            .padding(horizontal = MehTheme.spacing.spacing05),
          contentAlignment = Alignment.CenterStart,
        ) {
          Text(text = header, style = MehTheme.typography.label02, color = MehTheme.colors.textPrimary)
        }
      }
    }

    // Rows
    rows.forEach { row ->
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(1.dp)
          .background(MehTheme.colors.borderSubtle01),
      )
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        row.forEach { cell ->
          Box(
            modifier = Modifier
              .weight(1f)
              .padding(horizontal = MehTheme.spacing.spacing05),
            contentAlignment = Alignment.CenterStart,
          ) {
            Text(text = cell, style = MehTheme.typography.body01)
          }
        }
      }
    }
  }
}
