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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.LoadingSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toFileUploaderSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Large
}

/**
 * Carbon Design System v11 File Uploader button trigger with title and helper description.
 */
@Composable
fun FileUploader(
  label: String,
  description: String,
  buttonText: String,
  onUploadClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Large,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  Column(
    modifier = modifier.fillMaxWidth(),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
  ) {
    BasicText(
      text = label,
      style = typography.headingCompact01.copy(
        color = if (enabled) colors.textPrimary else colors.textDisabled,
      ),
    )
    BasicText(
      text = description,
      style = typography.label01.copy(
        color = if (enabled) colors.textSecondary else colors.textDisabled,
      ),
    )
    Spacer(modifier = Modifier.height(spacing.spacing02))
    Button(
      text = buttonText,
      kind = ButtonKind.Primary,
      enabled = enabled,
      size = size.toFileUploaderSize(),
      onClick = onUploadClick,
    )
  }
}

/**
 * Carbon Design System v11 drag-and-drop file uploader drop container with dashed border.
 */
@Composable
fun FileUploaderDropContainer(
  labelText: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val borderColor =
    when {
      !enabled -> colors.borderDisabled
      focused -> colors.focus
      else -> colors.borderStrong01
    }

  Box(
    modifier = modifier
      .fillMaxWidth()
      .defaultMinSize(minHeight = 96.dp)
      .background(if (hovered && enabled) colors.layerHover01 else Color.Transparent)
      .drawBehind {
        val strokeWidth = if (focused && enabled) 2.dp.toPx() else 1.dp.toPx()
        val half = strokeWidth / 2f
        val dash = 4.dp.toPx()
        drawRect(
          color = borderColor,
          topLeft = Offset(half, half),
          size = Size(size.width - strokeWidth, size.height - strokeWidth),
          style = Stroke(
            width = strokeWidth,
            pathEffect =
            if (focused && enabled) null else PathEffect.dashPathEffect(floatArrayOf(dash, dash)),
          ),
        )
      }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      )
      .padding(spacing.spacing05),
    contentAlignment = Alignment.TopStart,
  ) {
    BasicText(
      text = labelText,
      style = typography.bodyCompact01.copy(
        color = if (enabled) colors.linkPrimary else colors.textDisabled,
      ),
    )
  }
}

/**
 * Carbon Design System v11 File Uploader Item representing an uploading, completed, editable, or
 * invalid uploaded file.
 */
@Composable
fun FileUploaderItem(
  fileName: String,
  modifier: Modifier = Modifier,
  status: LoadingStatus = LoadingStatus.Finished,
  size: ControlSize = ControlSize.Large,
  errorSubject: String? = null,
  errorBody: String? = null,
  onDeleteClick: (() -> Unit)? = null,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toFileUploaderSize()
  val isError = status == LoadingStatus.Error

  Column(
    modifier = modifier
      .fillMaxWidth()
      .background(colors.layer01)
      .drawBehind {
        if (isError) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.supportError,
            topLeft = Offset(half, half),
            size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      },
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(effectiveSize.dp)
        .padding(horizontal = spacing.spacing05),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      BasicText(
        text = fileName,
        style = typography.bodyCompact01.copy(color = colors.textPrimary),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.weight(1f),
      )

      Spacer(modifier = Modifier.width(spacing.spacing03))

      when (status) {
        LoadingStatus.Inactive -> Unit

        LoadingStatus.Active -> {
          Loading(size = LoadingSize.Small)
        }

        LoadingStatus.Finished -> {
          Icon(
            image = Icons.CheckmarkFilled,
            size = IconSize.Small,
            tint = colors.supportSuccess,
          )
        }

        LoadingStatus.Error -> {
          Icon(
            image = Icons.WarningFilled,
            size = IconSize.Small,
            tint = colors.supportError,
          )
        }
      }

      if (onDeleteClick != null && status != LoadingStatus.Active) {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        Box(
          modifier = Modifier
            .size(28.dp)
            .semantics { contentDescription = "Remove $fileName" }
            .clickable(role = Role.Button, onClick = onDeleteClick),
          contentAlignment = Alignment.Center,
        ) {
          Icon(
            image = Icons.Close,
            size = IconSize.Small,
            tint = colors.iconPrimary,
          )
        }
      }
    }

    if (isError && (errorSubject != null || errorBody != null)) {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05)
          .height(1.dp)
          .background(colors.borderSubtle01),
      )
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = spacing.spacing05, vertical = spacing.spacing03),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing01),
      ) {
        if (errorSubject != null) {
          BasicText(
            text = errorSubject,
            style = typography.headingCompact01.copy(color = colors.textError),
          )
        }
        if (errorBody != null) {
          BasicText(
            text = errorBody,
            style = typography.label01.copy(color = colors.textPrimary),
          )
        }
      }
    }
  }
}
