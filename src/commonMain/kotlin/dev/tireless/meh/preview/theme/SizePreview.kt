// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.preview.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ModalSize
import dev.tireless.meh.theme.ToggleSize
import dev.tireless.meh.theme.dp
import androidx.compose.ui.tooling.preview.Preview

private data class SizeSample(
  val label: String,
  val value: Dp,
)

@Composable
private fun SizeRow(
  title: String,
  samples: List<SizeSample>,
) {
  Column(
    modifier = Modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing02),
  ) {
    Text(text = title, style = MehTheme.typography.label02, alignment = Alignment.CenterStart)
    samples.forEach { sample ->
      Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
      ) {
        Box(
          modifier =
            Modifier
              .size(width = 72.dp, height = sample.value.coerceAtLeast(6.dp))
              .background(MehTheme.colors.highlight, RoundedCornerShape(4.dp)),
        )
        Text(
          text = "${sample.label} – ${sample.value.value.toInt()}dp",
          alignment = Alignment.CenterStart,
        )
      }
    }
  }
}

@Preview(name = "Size tokens", showBackground = true)
@Composable
internal fun SizePreview() {
  PreviewTheme {
    val spacing = MehTheme.spacing
    Column(
      modifier =
        Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing06, vertical = spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
    ) {
      SizeRow(
        title = "Controls (height)",
        samples =
          listOf(
            SizeSample("Unspecified", ControlSize.Unspecified.dp),
            SizeSample("XSmall", ControlSize.XSmall.dp),
            SizeSample("Small", ControlSize.Small.dp),
            SizeSample("Medium", ControlSize.Medium.dp),
            SizeSample("Large", ControlSize.Large.dp),
            SizeSample("XLarge", ControlSize.XLarge.dp),
            SizeSample("XXLarge", ControlSize.XXLarge.dp),
          ),
      )
      SizeRow(
        title = "Toggles",
        samples =
          listOf(
            SizeSample("Default", ToggleSize.Default.dp),
            SizeSample("Small", ToggleSize.Small.dp),
          ),
      )
      SizeRow(
        title = "Icons",
        samples =
          listOf(
            SizeSample("Unspecified", IconSize.Unspecified.dp),
            SizeSample("XSmall", IconSize.XSmall.dp),
            SizeSample("Small", IconSize.Small.dp),
            SizeSample("Medium", IconSize.Medium.dp),
            SizeSample("Large", IconSize.Large.dp),
            SizeSample("Expressive", IconSize.Expressive.dp),
          ),
      )
      SizeRow(
        title = "Modal widths",
        samples =
          listOf(
            SizeSample("Wide", ModalSize.Wide.dp),
            SizeSample("Fit", ModalSize.Fit.dp),
          ),
      )
    }
  }
}
