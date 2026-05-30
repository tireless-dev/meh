// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ModalSize
import dev.tireless.meh.theme.dp

@Composable
fun Modal(
  title: String,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  size: ModalSize = ModalSize.Fit,
  primaryButtonText: String? = null,
  onPrimaryButtonClick: (() -> Unit)? = null,
  secondaryButtonText: String? = null,
  onSecondaryButtonClick: (() -> Unit)? = null,
  content: @Composable () -> Unit,
) {
  Dialog(
    onDismissRequest = onDismissRequest,
    properties = DialogProperties(usePlatformDefaultWidth = false)
  ) {
    Box(
      modifier = Modifier
        .fillMaxSize()
        .background(MehTheme.colors.overlay),
      contentAlignment = Alignment.Center
    ) {
      Column(
        modifier = modifier
          .widthIn(max = size.dp)
          .background(MehTheme.colors.background)
      ) {
        // Header
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .padding(MehTheme.spacing.spacing05),
          verticalAlignment = Alignment.Top
        ) {
          Text(
            text = title,
            style = MehTheme.typography.heading02,
            modifier = Modifier.weight(1f)
          )
          MonoIconButton(
            icon = MehTheme.icons.Close,
            onClick = onDismissRequest
          )
        }

        // Body
        Box(
          modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = MehTheme.spacing.spacing05)
            .padding(bottom = MehTheme.spacing.spacing07)
        ) {
          content()
        }

        // Footer
        if (primaryButtonText != null || secondaryButtonText != null) {
          Row(
            modifier = Modifier.fillMaxWidth()
          ) {
            if (secondaryButtonText != null) {
              Button(
                text = secondaryButtonText,
                onClick = onSecondaryButtonClick ?: {},
                type = ButtonType.Secondary,
                modifier = Modifier.weight(1f)
              )
            }
            if (primaryButtonText != null) {
              Button(
                text = primaryButtonText,
                onClick = onPrimaryButtonClick ?: {},
                type = ButtonType.Primary,
                modifier = Modifier.weight(1f)
              )
            }
          }
        }
      }
    }
  }
}
