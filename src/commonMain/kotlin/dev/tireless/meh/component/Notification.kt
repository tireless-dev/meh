// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.gray90

enum class NotificationType {
  Error,
  Success,
  Warning,
  Info,
}

@Composable
fun InlineNotification(
  title: String,
  subtitle: String,
  type: NotificationType,
  modifier: Modifier = Modifier,
  onClose: (() -> Unit)? = null,
) {
  val (icon, color) = getNotificationAssets(type)

  Row(
    modifier = modifier
      .fillMaxWidth()
      .background(MehTheme.colors.layer01)
      .background(color.copy(alpha = 0.1f)), // Carbon uses a subtle background
    verticalAlignment = Alignment.Top,
  ) {
    // Left border indicator
    Box(
      modifier = Modifier
        .width(4.dp)
        .size(64.dp) // height should ideally match row but simplistic for now
        .background(color),
    )

    Row(
      modifier = Modifier
        .weight(1f)
        .padding(MehTheme.spacing.spacing05),
      verticalAlignment = Alignment.Top,
    ) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = color,
        modifier = Modifier.padding(top = 2.dp),
      )

      Spacer(Modifier.size(MehTheme.spacing.spacing05))

      Column(modifier = Modifier.weight(1f)) {
        Text(
          text = title,
          style = MehTheme.typography.headingCompact01,
        )
        Text(
          text = subtitle,
          style = MehTheme.typography.bodyCompact01,
          color = MehTheme.colors.textSecondary,
        )
      }

      if (onClose != null) {
        MonoIconButton(
          icon = MehTheme.icons.Close,
          onClick = onClose,
          size = ControlSize.Small,
        )
      }
    }
  }
}

@Composable
fun ToastNotification(
  title: String,
  subtitle: String,
  caption: String,
  type: NotificationType,
  modifier: Modifier = Modifier,
  onClose: (() -> Unit)? = null,
) {
  val (icon, color) = getNotificationAssets(type)

  Row(
    modifier = modifier
      .width(288.dp)
      .background(gray90) // Carbon toast is dark
      .padding(MehTheme.spacing.spacing05),
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = icon,
      size = IconSize.Small,
      tint = color,
      modifier = Modifier.padding(top = 2.dp),
    )

    Spacer(Modifier.size(MehTheme.spacing.spacing05))

    Column(modifier = Modifier.weight(1f)) {
      Text(
        text = title,
        style = MehTheme.typography.headingCompact01,
        color = Color.White,
      )
      Text(
        text = subtitle,
        style = MehTheme.typography.bodyCompact01,
        color = Color.White,
      )
      Text(
        text = caption,
        style = MehTheme.typography.label01,
        color = Color.White.copy(alpha = 0.7f),
        modifier = Modifier.padding(top = MehTheme.spacing.spacing03),
      )
    }

    if (onClose != null) {
      MonoIconButton(
        icon = MehTheme.icons.Close,
        onClick = onClose,
        size = ControlSize.Small,
        color = Color.White,
      )
    }
  }
}

@Composable
private fun getNotificationAssets(type: NotificationType): Pair<ImageVector, Color> = when (type) {
  NotificationType.Error -> MehTheme.icons.ErrorFilled to MehTheme.colors.supportError
  NotificationType.Success -> MehTheme.icons.CheckmarkFilled to MehTheme.colors.supportSuccess
  NotificationType.Warning -> MehTheme.icons.WarningFilled to MehTheme.colors.supportWarning
  NotificationType.Info -> MehTheme.icons.InformationFilled to MehTheme.colors.supportInfo
}
