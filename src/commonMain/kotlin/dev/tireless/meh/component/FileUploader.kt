// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme

@Composable
fun FileUploader(
  label: String,
  description: String,
  buttonText: String,
  onUploadClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    FormLabel(text = label, enabled = enabled)
    Text(
      text = description,
      style = MehTheme.typography.label01,
      color = MehTheme.colors.textSecondary,
      enabled = enabled,
    )

    Button(
      text = buttonText,
      onClick = onUploadClick,
      type = ButtonType.Primary,
      enabled = enabled,
      size = ControlSize.Large,
    )
  }
}

@Composable
fun FileUploaderItem(
  fileName: String,
  status: LoadingStatus = LoadingStatus.Finished,
  onDeleteClick: (() -> Unit)? = null,
  modifier: Modifier = Modifier,
) {
  Row(
    modifier = modifier
      .fillMaxWidth()
      .height(48.dp)
      .background(MehTheme.colors.layer01)
      .padding(horizontal = MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Text(
      text = fileName,
      style = MehTheme.typography.bodyCompact01,
      modifier = Modifier.weight(1f),
    )

    when (status) {
      LoadingStatus.Active -> {
        Loading(size = 16.dp)
      }

      LoadingStatus.Finished -> {
        Icon(
          image = MehTheme.icons.CheckmarkFilled,
          size = IconSize.Small,
          tint = MehTheme.colors.supportSuccess,
        )
      }

      LoadingStatus.Error -> {
        Icon(
          image = MehTheme.icons.WarningFilled,
          size = IconSize.Small,
          tint = MehTheme.colors.supportError,
        )
      }
    }

    if (onDeleteClick != null && status != LoadingStatus.Active) {
      Spacer(Modifier.size(MehTheme.spacing.spacing04))
      MonoIconButton(
        icon = MehTheme.icons.Close,
        onClick = onDeleteClick,
        size = ControlSize.Small,
      )
    }
  }
}
