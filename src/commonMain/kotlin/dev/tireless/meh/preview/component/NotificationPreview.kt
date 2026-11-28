// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.ActionableNotification
import dev.tireless.meh.component.CalloutNotification
import dev.tireless.meh.component.InlineNotification
import dev.tireless.meh.component.NotificationType
import dev.tireless.meh.component.ToastNotification
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun NotificationPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Inline Notifications (Low-contrast vs High-contrast)", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          InlineNotification(
            title = "Info notification",
            subtitle = "Low-contrast informational update.",
            type = NotificationType.Info,
            onClose = {},
          )
          InlineNotification(
            title = "Success notification",
            subtitle = "Your changes have been saved.",
            type = NotificationType.Success,
            onClose = {},
          )
          InlineNotification(
            title = "Warning notification",
            subtitle = "Storage quota is almost full.",
            type = NotificationType.Warning,
            onClose = {},
          )
          InlineNotification(
            title = "Error notification",
            subtitle = "Unable to connect to the server.",
            type = NotificationType.Error,
            onClose = {},
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          InlineNotification(
            title = "High-contrast info",
            subtitle = "Inverse surface for urgent visibility.",
            type = NotificationType.Info,
            lowContrast = false,
            onClose = {},
          )
          InlineNotification(
            title = "High-contrast error",
            subtitle = "Critical system failure detected.",
            type = NotificationType.Error,
            lowContrast = false,
            onClose = {},
          )
          ActionableNotification(
            title = "Actionable inline",
            subtitle = "Session expires soon.",
            actionButtonLabel = "Extend",
            onActionButtonClick = {},
            type = NotificationType.Warning,
            onClose = {},
          )
          CalloutNotification(
            title = "Callout banner",
            subtitle = "Non-dismissible contextual guidance loaded with page content.",
            type = NotificationType.Info,
          )
        }
      }

      BasicText(text = "Toast & Actionable Toast Notifications", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
      ) {
        ToastNotification(
          title = "Deployment complete",
          subtitle = "Release v2.4.0 is live in production.",
          caption = "00:00:00 AM",
          type = NotificationType.Success,
          lowContrast = false,
          onClose = {},
        )
        ToastNotification(
          title = "Low-contrast toast",
          subtitle = "Background sync completed with warnings.",
          caption = "00:00:00 AM",
          type = NotificationType.Warning,
          lowContrast = true,
          onClose = {},
        )
      }
    }
  }
}
