// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.CodeSnippet
import dev.tireless.meh.component.CodeSnippetVariant
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun CodeSnippetPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)
    val labelStyle = typography.label01.copy(color = colors.textSecondary)
    val bodyStyle = typography.body01.copy(color = colors.textPrimary)

    val multilineSample =
      """
      @Composable
      fun Greeting(name: String) {
        MehTheme {
          Text(
            text = "Hello, ${'$'}name!",
            style = MehTheme.typography.heading02,
          )
        }
      }
      """.trimIndent()

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Inline Code Snippet", style = sectionStyle)

      Row(
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing02),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        BasicText(text = "Run", style = bodyStyle)
        CodeSnippet(
          code = "./gradlew testAndroidHostTest",
          variant = CodeSnippetVariant.Inline,
          onCopyClick = {},
        )
        BasicText(text = "to verify all snapshots.", style = bodyStyle)
      }

      BasicText(text = "Single-line Code Snippet", style = sectionStyle)

      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
        BasicText(text = "With copy button", style = labelStyle)
        CodeSnippet(
          code = "implementation(\"dev.tireless:meh:0.1.0\")",
          variant = CodeSnippetVariant.Single,
          onCopyClick = {},
        )
        BasicText(text = "Without copy button", style = labelStyle)
        CodeSnippet(
          code = "node -v",
          variant = CodeSnippetVariant.Single,
          hideCopyButton = true,
        )
      }

      BasicText(text = "Multi-line Code Snippet", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          BasicText(text = "Collapsed (Show more)", style = labelStyle)
          CodeSnippet(
            code = multilineSample,
            variant = CodeSnippetVariant.Multiline,
            onCopyClick = {},
            maxCollapsedLines = 5,
            expanded = false,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
        ) {
          BasicText(text = "Expanded (Show less)", style = labelStyle)
          CodeSnippet(
            code = multilineSample,
            variant = CodeSnippetVariant.Multiline,
            onCopyClick = {},
            maxCollapsedLines = 5,
            expanded = true,
          )
        }
      }
    }
  }
}
