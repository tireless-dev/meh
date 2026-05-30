// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.InlineLoading
import dev.tireless.meh.component.Loading
import dev.tireless.meh.component.LoadingStatus
import dev.tireless.meh.theme.MehTheme

@Composable
fun LoadingPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
      Loading()
      Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        InlineLoading(status = LoadingStatus.Active, description = "Loading data...")
        InlineLoading(status = LoadingStatus.Finished, description = "Data loaded successfully")
        InlineLoading(status = LoadingStatus.Error, description = "Failed to load data")
      }
    }
  }
}
