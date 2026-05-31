// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.InlineNotification
import dev.tireless.meh.component.NotificationType
import dev.tireless.meh.component.ToastNotification
import dev.tireless.meh.theme.MehTheme

@Composable
fun NotificationPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
      InlineNotification(
        title = "Notification title",
        subtitle = "Subtitle text goes here.",
        type = NotificationType.Info,
        onClose = {}
      )
      ToastNotification(
        title = "Notification title",
        subtitle = "Subtitle text goes here.",
        caption = "00:00:00 AM",
        type = NotificationType.Success,
        onClose = {}
      )
    }
  }
}
