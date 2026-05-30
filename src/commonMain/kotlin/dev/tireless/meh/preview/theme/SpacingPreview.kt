// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Spacing
import androidx.compose.ui.tooling.preview.Preview

private data class SpacingSample(
  val label: String,
  val value: Dp,
)

@Composable
private fun SpacingRow(
  sample: SpacingSample,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.spacedBy(12.dp),
  ) {
    Box(
      modifier =
        Modifier
          .width(80.dp)
          .height(sample.value)
          .background(MehTheme.colors.highlight, RoundedCornerShape(4.dp)),
    )
    Text(
      text = "${sample.label} – ${sample.value.value.toInt()}dp",
      alignment = Alignment.CenterStart,
    )
  }
}

@Preview(name = "Spacing", showBackground = true)
@Composable
internal fun SpacingPreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    val samples =
      listOf(
        SpacingSample("spacing00", Spacing.spacing00),
        SpacingSample("spacing01", Spacing.spacing01),
        SpacingSample("spacing02", Spacing.spacing02),
        SpacingSample("spacing03", Spacing.spacing03),
        SpacingSample("spacing04", Spacing.spacing04),
        SpacingSample("spacing05", Spacing.spacing05),
        SpacingSample("spacing06", Spacing.spacing06),
        SpacingSample("spacing07", Spacing.spacing07),
        SpacingSample("spacing08", Spacing.spacing08),
        SpacingSample("spacing09", Spacing.spacing09),
        SpacingSample("spacing10", Spacing.spacing10),
        SpacingSample("spacing11", Spacing.spacing11),
        SpacingSample("spacing12", Spacing.spacing12),
        SpacingSample("spacing13", Spacing.spacing13),
      )

    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing06, vertical = spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
    ) {
      samples.forEach { SpacingRow(it) }
    }
  }
}
