// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

enum class NotificationType {
  Error,
  Success,
  Warning,
  Info,
}

object NotificationDefaults {
  val ToastWidth: Dp = 288.dp
  val MinHeight: Dp = 48.dp
  val AccentBorderWidth: Dp = 3.dp
  val CloseButtonSize: Dp = 48.dp
}

private val LightErrorTint = Color(0xFFFFF1F1)
private val LightSuccessTint = Color(0xFFDEFBE6)
private val LightWarningTint = Color(0xFFFCF4D6)
private val LightInfoTint = Color(0xFFEDF5FF)

@Immutable
private data class ResolvedNotificationColors(
  val background: Color,
  val accent: Color,
  val outlineBorder: Color?,
  val title: Color,
  val subtitle: Color,
  val closeIcon: Color,
  val closeHover: Color,
  val actionText: Color,
  val actionHover: Color,
  val focus: Color,
)

private fun resolveNotificationColors(
  colors: Colors,
  type: NotificationType,
  lowContrast: Boolean,
): ResolvedNotificationColors {
  if (!lowContrast) {
    val accent =
      when (type) {
        NotificationType.Error -> colors.supportErrorInverse
        NotificationType.Success -> colors.supportSuccessInverse
        NotificationType.Warning -> colors.supportWarningInverse
        NotificationType.Info -> colors.supportInfoInverse
      }
    return ResolvedNotificationColors(
      background = colors.backgroundInverse,
      accent = accent,
      outlineBorder = null,
      title = colors.textInverse,
      subtitle = colors.textInverse,
      closeIcon = colors.iconInverse,
      closeHover = colors.backgroundInverseHover,
      actionText = colors.linkInverse,
      actionHover = colors.backgroundInverseHover,
      focus = colors.focusInverse,
    )
  }

  val isLightTheme = colors.background.luminance() > 0.5f
  val accent =
    when (type) {
      NotificationType.Error -> colors.supportError
      NotificationType.Success -> colors.supportSuccess
      NotificationType.Warning -> colors.supportWarning
      NotificationType.Info -> colors.supportInfo
    }
  val background =
    if (isLightTheme) {
      when (type) {
        NotificationType.Error -> LightErrorTint
        NotificationType.Success -> LightSuccessTint
        NotificationType.Warning -> LightWarningTint
        NotificationType.Info -> LightInfoTint
      }
    } else {
      colors.layer01
    }

  return ResolvedNotificationColors(
    background = background,
    accent = accent,
    outlineBorder = accent.copy(alpha = 0.4f),
    title = colors.textPrimary,
    subtitle = colors.textPrimary,
    closeIcon = colors.iconPrimary,
    closeHover = colors.backgroundHover,
    actionText = colors.linkPrimary,
    actionHover = colors.backgroundHover,
    focus = colors.focus,
  )
}

private fun notificationIcon(type: NotificationType): ImageVector = when (type) {
  NotificationType.Error -> Icons.ErrorFilled
  NotificationType.Success -> Icons.CheckmarkFilled
  NotificationType.Warning -> Icons.WarningFilled
  NotificationType.Info -> Icons.InformationFilled
}

private fun DrawScope.drawNotificationChrome(colors: ResolvedNotificationColors) {
  colors.outlineBorder?.let { borderColor ->
    val strokeWidth = 1.dp.toPx()
    val half = strokeWidth / 2f
    drawRect(
      color = borderColor,
      topLeft = Offset(half, half),
      size = Size(size.width - strokeWidth, size.height - strokeWidth),
      style = Stroke(width = strokeWidth),
    )
  }
  val accentWidth = NotificationDefaults.AccentBorderWidth.toPx()
  drawRect(
    color = colors.accent,
    topLeft = Offset.Zero,
    size = Size(accentWidth, size.height),
  )
}

@Composable
private fun NotificationCloseButton(
  onClose: () -> Unit,
  colors: ResolvedNotificationColors,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  Box(
    modifier = Modifier
      .size(NotificationDefaults.CloseButtonSize)
      .background(if (hovered) colors.closeHover else Color.Transparent)
      .drawBehind {
        if (focused) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(size.width - strokeWidth, size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .semantics { contentDescription = "Close notification" }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        role = Role.Button,
        onClick = onClose,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = Icons.Close,
      size = IconSize.Small,
      tint = colors.closeIcon,
    )
  }
}

@Composable
private fun NotificationActionButton(
  label: String,
  onClick: () -> Unit,
  colors: ResolvedNotificationColors,
  modifier: Modifier = Modifier,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  Box(
    modifier = modifier
      .height(32.dp)
      .background(if (hovered) colors.actionHover else Color.Transparent)
      .drawBehind {
        if (focused) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(size.width - strokeWidth, size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        role = Role.Button,
        onClick = onClick,
      )
      .padding(horizontal = MehTheme.spacing.spacing05),
    contentAlignment = Alignment.Center,
  ) {
    BasicText(
      text = label,
      style = MehTheme.typography.bodyCompact01.copy(color = colors.actionText),
      maxLines = 1,
    )
  }
}

/**
 * Carbon Design System v11 Inline Notification.
 */
@Composable
fun InlineNotification(
  title: String,
  subtitle: String,
  type: NotificationType,
  modifier: Modifier = Modifier,
  lowContrast: Boolean = true,
  onClose: (() -> Unit)? = null,
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val resolvedColors = resolveNotificationColors(MehTheme.colors, type, lowContrast)

  Row(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minHeight = NotificationDefaults.MinHeight)
      .background(resolvedColors.background)
      .drawBehind { drawNotificationChrome(resolvedColors) },
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = notificationIcon(type),
      size = IconSize.Small,
      tint = resolvedColors.accent,
      modifier = Modifier.padding(start = spacing.spacing05, top = 16.dp),
    )

    Column(
      modifier = Modifier
        .weight(1f)
        .padding(
          start = spacing.spacing05,
          end = if (onClose != null) spacing.spacing03 else spacing.spacing05,
          top = 14.dp,
          bottom = 14.dp,
        ),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing01),
    ) {
      BasicText(
        text = title,
        style = typography.headingCompact01.copy(color = resolvedColors.title),
      )
      if (subtitle.isNotEmpty()) {
        BasicText(
          text = subtitle,
          style = typography.bodyCompact01.copy(color = resolvedColors.subtitle),
        )
      }
    }

    if (onClose != null) {
      NotificationCloseButton(onClose = onClose, colors = resolvedColors)
    }
  }
}

/**
 * Carbon Design System v11 Toast Notification (fixed `288.dp` width by default, optional timestamp
 * [caption], low-contrast or high-contrast).
 */
@Composable
fun ToastNotification(
  title: String,
  subtitle: String,
  caption: String,
  type: NotificationType,
  modifier: Modifier = Modifier,
  lowContrast: Boolean = false,
  onClose: (() -> Unit)? = null,
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val resolvedColors = resolveNotificationColors(MehTheme.colors, type, lowContrast)

  Row(
    modifier = modifier
      .width(NotificationDefaults.ToastWidth)
      .defaultMinSize(minHeight = NotificationDefaults.MinHeight)
      .background(resolvedColors.background)
      .drawBehind { drawNotificationChrome(resolvedColors) },
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = notificationIcon(type),
      size = IconSize.Small,
      tint = resolvedColors.accent,
      modifier = Modifier.padding(start = spacing.spacing05, top = 16.dp),
    )

    Column(
      modifier = Modifier
        .weight(1f)
        .padding(
          start = spacing.spacing05,
          end = if (onClose != null) spacing.spacing03 else spacing.spacing05,
          top = 14.dp,
          bottom = spacing.spacing05,
        ),
    ) {
      BasicText(
        text = title,
        style = typography.headingCompact01.copy(color = resolvedColors.title),
      )
      if (subtitle.isNotEmpty()) {
        Spacer(modifier = Modifier.height(spacing.spacing01))
        BasicText(
          text = subtitle,
          style = typography.bodyCompact01.copy(color = resolvedColors.subtitle),
        )
      }
      if (caption.isNotEmpty()) {
        Spacer(modifier = Modifier.height(spacing.spacing05))
        BasicText(
          text = caption,
          style = typography.label01.copy(color = resolvedColors.subtitle),
        )
      }
    }

    if (onClose != null) {
      NotificationCloseButton(onClose = onClose, colors = resolvedColors)
    }
  }
}

/**
 * Carbon Design System v11 Actionable Notification with an inline or stacked action button.
 */
@Composable
fun ActionableNotification(
  title: String,
  subtitle: String,
  actionButtonLabel: String,
  onActionButtonClick: () -> Unit,
  type: NotificationType,
  modifier: Modifier = Modifier,
  inline: Boolean = true,
  lowContrast: Boolean = true,
  onClose: (() -> Unit)? = null,
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val resolvedColors = resolveNotificationColors(MehTheme.colors, type, lowContrast)

  Row(
    modifier = modifier
      .then(if (inline) Modifier.fillMaxWidth() else Modifier.width(NotificationDefaults.ToastWidth))
      .defaultMinSize(minHeight = NotificationDefaults.MinHeight)
      .background(resolvedColors.background)
      .drawBehind { drawNotificationChrome(resolvedColors) },
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = notificationIcon(type),
      size = IconSize.Small,
      tint = resolvedColors.accent,
      modifier = Modifier.padding(start = spacing.spacing05, top = 16.dp),
    )

    Column(
      modifier = Modifier
        .weight(1f)
        .padding(
          start = spacing.spacing05,
          end = spacing.spacing03,
          top = 14.dp,
          bottom = 14.dp,
        ),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing01),
    ) {
      BasicText(
        text = title,
        style = typography.headingCompact01.copy(color = resolvedColors.title),
      )
      if (subtitle.isNotEmpty()) {
        BasicText(
          text = subtitle,
          style = typography.bodyCompact01.copy(color = resolvedColors.subtitle),
        )
      }
      if (!inline) {
        Spacer(modifier = Modifier.height(spacing.spacing03))
        NotificationActionButton(
          label = actionButtonLabel,
          onClick = onActionButtonClick,
          colors = resolvedColors,
        )
      }
    }

    if (inline) {
      NotificationActionButton(
        label = actionButtonLabel,
        onClick = onActionButtonClick,
        colors = resolvedColors,
        modifier = Modifier.padding(top = spacing.spacing03, end = if (onClose == null) spacing.spacing03 else 0.dp),
      )
    }

    if (onClose != null) {
      NotificationCloseButton(onClose = onClose, colors = resolvedColors)
    }
  }
}

/**
 * Carbon Design System v11 Callout Notification: persistent, non-dismissible contextual banner
 * rendered natively within page content.
 */
@Composable
fun CalloutNotification(
  title: String,
  subtitle: String,
  modifier: Modifier = Modifier,
  type: NotificationType = NotificationType.Info,
  lowContrast: Boolean = true,
  action: (@Composable () -> Unit)? = null,
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val resolvedColors = resolveNotificationColors(MehTheme.colors, type, lowContrast)

  Row(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minHeight = NotificationDefaults.MinHeight)
      .background(resolvedColors.background)
      .drawBehind { drawNotificationChrome(resolvedColors) },
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = notificationIcon(type),
      size = IconSize.Small,
      tint = resolvedColors.accent,
      modifier = Modifier.padding(start = spacing.spacing05, top = 16.dp),
    )

    Column(
      modifier = Modifier
        .weight(1f)
        .padding(
          start = spacing.spacing05,
          end = spacing.spacing05,
          top = 14.dp,
          bottom = 14.dp,
        ),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing01),
    ) {
      BasicText(
        text = title,
        style = typography.headingCompact01.copy(color = resolvedColors.title),
      )
      if (subtitle.isNotEmpty()) {
        BasicText(
          text = subtitle,
          style = typography.bodyCompact01.copy(color = resolvedColors.subtitle),
        )
      }
      if (action != null) {
        Spacer(modifier = Modifier.height(spacing.spacing03))
        action()
      }
    }
  }
}
