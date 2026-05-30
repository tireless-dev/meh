// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Typography.bodyCompact01
import dev.tireless.meh.theme.dp

enum class ButtonType {
  Primary,
  Secondary,
  DangerPrimary,
  Ghost,
}

@Composable
fun Button(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  type: ButtonType = ButtonType.Primary,
  size: ControlSize = ControlSize.Large,
) {
  val backgroundColor =
    when (type) {
      ButtonType.Primary -> MehTheme.colors.buttonPrimary
      ButtonType.Secondary -> MehTheme.colors.buttonSecondary
      ButtonType.DangerPrimary -> MehTheme.colors.buttonDangerPrimary
      ButtonType.Ghost -> Color.Transparent
    }

  val textColor =
    when (type) {
      ButtonType.Primary -> MehTheme.colors.textOnColor
      ButtonType.Secondary -> MehTheme.colors.textOnColor
      ButtonType.DangerPrimary -> MehTheme.colors.textOnColor
      ButtonType.Ghost -> MehTheme.colors.buttonPrimary
    }

  Box(
    modifier =
    modifier
      .background(backgroundColor)
      .clickable(enabled = enabled, onClick = onClick)
      .height(size.dp)
      .padding(
        top = MehTheme.spacing.spacing05,
        start = MehTheme.spacing.spacing05,
        end = MehTheme.spacing.spacing10,
      ),
    contentAlignment = Alignment.TopStart,
  ) {
    BasicText(
      text = text,
      style = bodyCompact01.copy(color = textColor),
    )
  }
}
