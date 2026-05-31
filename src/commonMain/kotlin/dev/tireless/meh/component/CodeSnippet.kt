// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.MehTheme

enum class CodeSnippetVariant {
  Single,
  Inline,
  Multiline,
}

@Composable
fun CodeSnippet(
  code: String,
  modifier: Modifier = Modifier,
  variant: CodeSnippetVariant = CodeSnippetVariant.Single,
  onCopyClick: (() -> Unit)? = null,
) {
  val backgroundColor = if (variant == CodeSnippetVariant.Inline) {
    MehTheme.colors.layer01
  } else {
    MehTheme.colors.layer01
  }

  val horizontalPadding = if (variant == CodeSnippetVariant.Inline) 4.dp else MehTheme.spacing.spacing05
  val verticalPadding = if (variant == CodeSnippetVariant.Inline) 2.dp else MehTheme.spacing.spacing05

  Row(
    modifier = modifier
      .let { if (variant != CodeSnippetVariant.Inline) it.fillMaxWidth() else it }
      .background(backgroundColor)
      .padding(horizontal = horizontalPadding, vertical = verticalPadding),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = code,
      style = MehTheme.typography.body01, // Ideally a Monospace font if available
      modifier = Modifier.weight(1f, fill = variant != CodeSnippetVariant.Inline),
    )

    if (variant != CodeSnippetVariant.Inline && onCopyClick != null) {
      MonoIconButton(
        icon = MehTheme.icons.Copy,
        onClick = onCopyClick,
      )
    }
  }
}
