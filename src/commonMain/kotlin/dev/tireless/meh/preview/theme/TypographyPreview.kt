// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.previewFontFamilySc
import dev.tireless.meh.preview.previewFontFamilyTc
import dev.tireless.meh.theme.MehTheme

private data class TypographySample(
  val label: String,
  val sample: String,
  val style: TextStyle,
)

@Composable
private fun TypographySampleRow(
  sample: TypographySample,
  modifier: Modifier = Modifier,
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing01),
  ) {
    Text(
      text = sample.label,
      style = MehTheme.typography.label01,
      color = MehTheme.colors.textSecondary,
      alignment = Alignment.CenterStart,
    )
    Text(
      text = sample.sample,
      style = sample.style,
      alignment = Alignment.CenterStart,
    )
  }
}

@Composable
private fun TypographyPreviewContent(
  title: String? = null,
  sampleText: String = "The quick brown fox jumps over the lazy dog.",
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val samples =
    listOf(
      TypographySample(
        "Heading 04",
        "Heading 04 – 28/36 · $sampleText",
        typography.heading04,
      ),
      TypographySample(
        "Heading 03",
        "Heading 03 – 20/28 · $sampleText",
        typography.heading03,
      ),
      TypographySample(
        "Heading 02",
        "Heading 02 – 16/24 · $sampleText",
        typography.heading02,
      ),
      TypographySample(
        "Heading 01",
        "Heading 01 – 14/20 · $sampleText",
        typography.heading01,
      ),
      TypographySample(
        "Heading Compact 02",
        "Heading Compact 02 – 16/22 · $sampleText",
        typography.headingCompact02,
      ),
      TypographySample(
        "Heading Compact 01",
        "Heading Compact 01 – 14/18 · $sampleText",
        typography.headingCompact01,
      ),
      TypographySample("Label 02", "Label 02 – 14/18 · $sampleText", typography.label02),
      TypographySample("Label 01", "Label 01 – 12/16 · $sampleText", typography.label01),
      TypographySample("Body 01", "Body 01 – 14/20 · $sampleText", typography.body01),
      TypographySample(
        "Body Compact 01",
        "Body Compact 01 – 14/18 · $sampleText",
        typography.bodyCompact01,
      ),
    )

  Column(
    modifier =
    Modifier
      .fillMaxWidth()
      .padding(horizontal = spacing.spacing06, vertical = spacing.spacing05),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
  ) {
    if (title != null) {
      Text(
        text = title,
        style = typography.headingCompact02,
        alignment = Alignment.CenterStart,
      )
    }
    samples.forEach { sample ->
      TypographySampleRow(sample)
    }
  }
}

@Preview(name = "Typography – Latin", showBackground = true)
@Composable
internal fun TypographyPreviewLatin() {
  PreviewTheme {
    TypographyPreviewContent(
      title = "IBM Plex Sans (Latin)",
      sampleText = "The quick brown fox jumps over the lazy dog.",
    )
  }
}

@Preview(name = "Typography – Chinese SC", showBackground = true)
@Composable
internal fun TypographyPreviewSc() {
  PreviewTheme(fontFamily = previewFontFamilySc()) {
    TypographyPreviewContent(
      title = "IBM Plex Sans SC",
      sampleText = "快速的棕色狐狸跳过懒狗",
    )
  }
}

@Preview(name = "Typography – Chinese TC", showBackground = true)
@Composable
internal fun TypographyPreviewTc() {
  PreviewTheme(fontFamily = previewFontFamilyTc()) {
    TypographyPreviewContent(
      title = "IBM Plex Sans TC",
      sampleText = "快速的棕色狐狸跳過懶狗",
    )
  }
}
