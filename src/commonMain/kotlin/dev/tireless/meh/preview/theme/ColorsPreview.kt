// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

private data class ColorSwatch(
  val label: String,
  val color: Color,
)

@Composable
private fun ColorRow(
  swatch: ColorSwatch,
  modifier: Modifier = Modifier,
) {
  val textColor =
    if (swatch.color.luminance() > 0.5f) Color.Black else Color.White

  Row(
    modifier =
    modifier
      .fillMaxWidth()
      .height(48.dp)
      .background(swatch.color, RoundedCornerShape(6.dp))
      .padding(horizontal = 12.dp, vertical = 8.dp),
    horizontalArrangement = Arrangement.SpaceBetween,
  ) {
    Text(text = swatch.label, color = textColor)
    Text(text = swatch.color.toRgbHex(), color = textColor)
  }
}

private fun Color.toRgbHex(): String {
  val r = (red * 255).toInt().coerceIn(0, 255)
  val g = (green * 255).toInt().coerceIn(0, 255)
  val b = (blue * 255).toInt().coerceIn(0, 255)
  return "#" + listOf(r, g, b).joinToString("") { it.toString(16).padStart(2, '0').uppercase() }
}

@Preview(name = "Colors", showBackground = true)
@Composable
internal fun ColorsPreview() {
  PreviewTheme {
    val c = MehTheme.colors
    val spacing = MehTheme.spacing
    val swatches =
      listOf(
        ColorSwatch("Background", c.background),
        ColorSwatch("Layer 01", c.layer01),
        ColorSwatch("Layer 02", c.layer02),
        ColorSwatch("Field 02", c.field02),
        ColorSwatch("Text Primary", c.textPrimary),
        ColorSwatch("Text Secondary", c.textSecondary),
        ColorSwatch("Text Helper", c.textHelper),
        ColorSwatch("Text Disabled", c.textDisabled),
        ColorSwatch("Icon Primary", c.iconPrimary),
        ColorSwatch("Icon Disabled", c.iconDisabled),
        ColorSwatch("Link Primary", c.linkPrimary),
        ColorSwatch("Support Error", c.supportError),
        ColorSwatch("Support Success", c.supportSuccess),
        ColorSwatch("Support Warning", c.supportWarning),
        ColorSwatch("Support Info", c.supportInfo),
        ColorSwatch("Focus", c.focus),
        ColorSwatch("Highlight", c.highlight),
        ColorSwatch("Button Primary", c.buttonPrimary),
        ColorSwatch("Button Secondary", c.buttonSecondary),
        ColorSwatch("Button Danger", c.buttonDangerPrimary),
      )

    Column(
      modifier =
      Modifier
        .fillMaxWidth()
        .padding(horizontal = spacing.spacing06, vertical = spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
    ) {
      swatches.forEach { ColorRow(it) }
    }
  }
}
