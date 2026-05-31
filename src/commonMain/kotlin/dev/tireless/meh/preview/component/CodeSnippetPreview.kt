// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.CodeSnippet
import dev.tireless.meh.component.CodeSnippetVariant
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "CodeSnippet", showBackground = true)
@Composable
internal fun CodeSnippetPreview() {
  PreviewTheme {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
      CodeSnippet(
        code = "npm install @carbon/react",
        variant = CodeSnippetVariant.Single,
        onCopyClick = {},
      )

      CodeSnippet(
        code = "inline code",
        variant = CodeSnippetVariant.Inline,
      )
    }
  }
}
