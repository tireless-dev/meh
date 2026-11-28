// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.ModalSize
import dev.tireless.meh.theme.dp

/**
 * Styled Carbon Design System v11 Modal surface supporting Passive, Transactional (1–3 footer
 * buttons), and Danger modal variants across `xs`/`sm`/`md`/`lg` sizes.
 */
@Composable
fun ModalSurface(
  title: String,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  size: ModalSize = ModalSize.Medium,
  danger: Boolean = false,
  passive: Boolean = false,
  primaryButtonText: String? = null,
  onPrimaryButtonClick: (() -> Unit)? = null,
  primaryButtonEnabled: Boolean = true,
  secondaryButtonText: String? = null,
  onSecondaryButtonClick: (() -> Unit)? = null,
  tertiaryButtonText: String? = null,
  onTertiaryButtonClick: (() -> Unit)? = null,
  content: @Composable () -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val hasFooter = !passive &&
    (primaryButtonText != null || secondaryButtonText != null || tertiaryButtonText != null)

  Column(
    modifier = modifier
      .widthIn(max = size.dp)
      .fillMaxWidth()
      .background(colors.layer01)
      .border(width = 1.dp, color = colors.borderSubtle01),
  ) {
    // Header
    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.Top,
    ) {
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(
            start = spacing.spacing05,
            top = spacing.spacing05,
            end = spacing.spacing05,
            bottom = spacing.spacing03,
          ),
      ) {
        if (label != null) {
          BasicText(
            text = label,
            style = typography.label01.copy(color = colors.textSecondary),
            modifier = Modifier.padding(bottom = spacing.spacing02),
          )
        }
        BasicText(
          text = title,
          style = typography.heading03.copy(color = colors.textPrimary),
        )
      }

      ModalCloseButton(onClick = onDismissRequest)
    }

    // Body
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .padding(
          start = spacing.spacing05,
          end = spacing.spacing05,
          top = spacing.spacing03,
          bottom = if (hasFooter) spacing.spacing07 else spacing.spacing09,
        ),
    ) {
      content()
    }

    // Footer (1–3 sticky flush buttons, 64dp height)
    if (hasFooter) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(ControlSize.XLarge.dp),
      ) {
        val buttonCount = listOfNotNull(secondaryButtonText, tertiaryButtonText, primaryButtonText).size
        if (buttonCount == 1 && size != ModalSize.XSmall && size != ModalSize.Fit) {
          Spacer(modifier = Modifier.weight(1f))
        }

        if (secondaryButtonText != null) {
          ModalFooterButton(
            text = secondaryButtonText,
            onClick = onSecondaryButtonClick ?: onDismissRequest,
            kind = ButtonKind.Secondary,
            modifier = Modifier.weight(1f),
          )
        }

        if (tertiaryButtonText != null) {
          if (secondaryButtonText != null) {
            Spacer(
              modifier = Modifier
                .width(1.dp)
                .height(ControlSize.XLarge.dp)
                .background(colors.buttonSeparator),
            )
          }
          ModalFooterButton(
            text = tertiaryButtonText,
            onClick = onTertiaryButtonClick ?: {},
            kind = ButtonKind.Secondary,
            modifier = Modifier.weight(1f),
          )
        }

        if (primaryButtonText != null) {
          ModalFooterButton(
            text = primaryButtonText,
            onClick = onPrimaryButtonClick ?: {},
            enabled = primaryButtonEnabled,
            kind = if (danger) ButtonKind.Danger.Primary else ButtonKind.Primary,
            modifier = Modifier.weight(1f),
          )
        }
      }
    }
  }
}

/**
 * Carbon Design System v11 Modal dialog rendered over a dimmed `$overlay` backdrop.
 */
@Composable
fun Modal(
  title: String,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  size: ModalSize = ModalSize.Medium,
  danger: Boolean = false,
  passive: Boolean = false,
  primaryButtonText: String? = null,
  onPrimaryButtonClick: (() -> Unit)? = null,
  primaryButtonEnabled: Boolean = true,
  secondaryButtonText: String? = null,
  onSecondaryButtonClick: (() -> Unit)? = null,
  tertiaryButtonText: String? = null,
  onTertiaryButtonClick: (() -> Unit)? = null,
  properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false),
  content: @Composable () -> Unit,
) {
  Dialog(
    onDismissRequest = onDismissRequest,
    properties = properties,
  ) {
    Box(
      modifier = modifier
        .fillMaxSize()
        .background(MehTheme.colors.overlay)
        .padding(MehTheme.spacing.spacing05),
      contentAlignment = Alignment.Center,
    ) {
      ModalSurface(
        title = title,
        onDismissRequest = onDismissRequest,
        label = label,
        size = size,
        danger = danger,
        passive = passive,
        primaryButtonText = primaryButtonText,
        onPrimaryButtonClick = onPrimaryButtonClick,
        primaryButtonEnabled = primaryButtonEnabled,
        secondaryButtonText = secondaryButtonText,
        onSecondaryButtonClick = onSecondaryButtonClick,
        tertiaryButtonText = tertiaryButtonText,
        onTertiaryButtonClick = onTertiaryButtonClick,
        content = content,
      )
    }
  }
}

@Composable
private fun ModalCloseButton(onClick: () -> Unit) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  Box(
    modifier = Modifier
      .size(48.dp)
      .background(if (hovered) colors.layerHover01 else Color.Transparent)
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
      .semantics { contentDescription = "Close modal" }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        role = Role.Button,
        onClick = onClick,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = Icons.Close,
      size = IconSize.Small,
      tint = colors.iconPrimary,
    )
  }
}

@Composable
private fun ModalFooterButton(
  text: String,
  onClick: () -> Unit,
  kind: ButtonKind,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val backgroundColor =
    when {
      !enabled -> colors.buttonDisabled

      kind == ButtonKind.Danger.Primary ->
        when {
          pressed -> colors.buttonDangerActive
          hovered -> colors.buttonDangerHover
          else -> colors.buttonDangerPrimary
        }

      kind == ButtonKind.Secondary ->
        when {
          pressed -> colors.buttonSecondaryActive
          hovered -> colors.buttonSecondaryHover
          else -> colors.buttonSecondary
        }

      else ->
        when {
          pressed -> colors.buttonPrimaryActive
          hovered -> colors.buttonPrimaryHover
          else -> colors.buttonPrimary
        }
    }
  val textColor = if (enabled) colors.textOnColor else colors.textOnColorDisabled

  Box(
    modifier = modifier
      .height(ControlSize.XLarge.dp)
      .background(backgroundColor)
      .drawBehind {
        if (focused && enabled) {
          val outerStroke = 2.dp.toPx()
          val outerHalf = outerStroke / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(outerHalf, outerHalf),
            size = Size(size.width - outerStroke, size.height - outerStroke),
            style = Stroke(width = outerStroke),
          )
          val insetStroke = 1.dp.toPx()
          val insetOffset = outerStroke + insetStroke / 2f
          drawRect(
            color = colors.focusInset,
            topLeft = Offset(insetOffset, insetOffset),
            size = Size(size.width - insetOffset * 2f, size.height - insetOffset * 2f),
            style = Stroke(width = insetStroke),
          )
        }
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .padding(horizontal = spacing.spacing05, vertical = 15.dp),
    contentAlignment = Alignment.TopStart,
  ) {
    BasicText(
      text = text,
      style = MehTheme.typography.bodyCompact01.copy(color = textColor),
      maxLines = 1,
    )
  }
}
