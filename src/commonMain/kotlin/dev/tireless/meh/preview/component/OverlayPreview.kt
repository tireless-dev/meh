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
import dev.tireless.meh.component.MenuItem
import dev.tireless.meh.component.NotificationType
import dev.tireless.meh.component.Popover
import dev.tireless.meh.component.Text
import dev.tireless.meh.component.ToastNotification
import dev.tireless.meh.theme.MehTheme

@Composable
fun OverlayPreview() {
  MehTheme {
    Column(
      modifier = Modifier.padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
      Text("Inline Notifications", style = MehTheme.typography.headingCompact01)
      InlineNotification(
        title = "Notification title",
        subtitle = "Subtitle text goes here.",
        type = NotificationType.Info,
        onClose = {}
      )
      InlineNotification(
        title = "Error title",
        subtitle = "Error description.",
        type = NotificationType.Error
      )

      Text("Toast Notification", style = MehTheme.typography.headingCompact01)
      ToastNotification(
        title = "Notification title",
        subtitle = "Subtitle text goes here.",
        caption = "00:00:00 AM",
        type = NotificationType.Success,
        onClose = {}
      )

      Text("Menu Items", style = MehTheme.typography.headingCompact01)
      Column {
        MenuItem(text = "Menu item 1", onClick = {})
        MenuItem(text = "Menu item 2", onClick = {})
        MenuItem(text = "Menu item 3 (disabled)", onClick = {}, enabled = false)
      }
    }
  }
}
