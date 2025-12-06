// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@Composable
fun Text(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Unspecified,
  style: TextStyle = MehTheme.typography.body01,
  color: Color = Color.Unspecified,
  alignment: Alignment = Alignment.Center,
  textAlign: TextAlign = TextAlign.Start,
) {
  val mergedStyle =
    style.copy(
      color =
        if (enabled) {
          if (color == Color.Unspecified) {
            MehTheme.colors.textPrimary
          } else {
            color
          }
        } else {
          MehTheme.colors.textDisabled
        },
      textAlign = textAlign,
    )

  Box(
    modifier =
      if (size == ControlSize.Unspecified) {
        modifier
      } else {
        modifier.height(size.dp)
      },
    contentAlignment = alignment,
  ) {
    BasicText(
      text = text,
      style = mergedStyle,
    )
  }
}

@Composable
fun FormLabel(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  Text(
    text = text,
    modifier = modifier,
    enabled = enabled,
    style = MehTheme.typography.label01,
    color = MehTheme.colors.textSecondary,
    alignment = Alignment.CenterStart,
  )
}

@Composable
fun FormHelper(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  Text(
    text = text,
    modifier = modifier,
    enabled = enabled,
    style = MehTheme.typography.label01,
    color = MehTheme.colors.textHelper,
    alignment = Alignment.CenterStart,
  )
}
