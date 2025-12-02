// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Meh(
  modifier: Modifier = Modifier,
  text: String = "Meh",
) {
  Box(
    modifier = modifier.fillMaxSize(),
    contentAlignment = Alignment.Center,
  ) {
    BasicText(text = text)
  }
}

@Preview
@Composable
private fun MehPreview() {
  Meh()
}
