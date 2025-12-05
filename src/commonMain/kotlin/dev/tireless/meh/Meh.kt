// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.tireless.meh.generated.resources.Res
import dev.tireless.meh.generated.resources.meh_default
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun Meh(
  modifier: Modifier = Modifier,
  text: String? = null,
) {
  val resolvedText = text ?: stringResource(Res.string.meh_default)
  MehTheme {
    Column(
      modifier = modifier.fillMaxSize(),
    ) {
      Text(text = resolvedText)
    }
  }
}

@Preview(showBackground = true)
@Composable
private fun MehPreview() {
  PreviewTheme {
    Meh()
  }
}
