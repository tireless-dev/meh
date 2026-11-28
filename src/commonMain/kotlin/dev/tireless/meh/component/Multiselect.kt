// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toMultiselectSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Medium
}

/**
 * Carbon Design System v11 Multiselect dropdown with inverse selection count pill, clear-all
 * button, and checkbox option list.
 */
@Composable
fun Multiselect(
  selectedOptions: List<String>,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  options: List<String> = emptyList(),
  onSelectionChange: ((List<String>) -> Unit)? = null,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  label: String? = null,
  placeholder: String = "Choose options",
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  size: ControlSize = ControlSize.Medium,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var internalExpanded by remember { mutableStateOf(false) }
  val isExpanded = expanded ?: internalExpanded
  val setExpanded: (Boolean) -> Unit = { next ->
    internalExpanded = next
    onExpandedChange?.invoke(next)
  }

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toMultiselectSize()
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val background =
    when {
      !enabled -> colors.field01
      readOnly -> Color.Transparent
      hovered -> colors.fieldHover01
      else -> colors.field01
    }
  val outlineColor =
    when {
      !enabled -> null
      focused -> colors.focus
      isInvalid -> colors.supportError
      else -> null
    }
  val bottomBorderColor =
    when {
      !enabled || outlineColor != null -> null
      readOnly -> colors.borderSubtle01
      else -> colors.borderStrong01
    }

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(
          color = if (enabled) colors.textSecondary else colors.textDisabled,
        ),
        modifier = Modifier.padding(bottom = spacing.spacing03),
      )
    }

    Box(modifier = Modifier.fillMaxWidth()) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(effectiveSize.dp)
          .background(background)
          .drawBehind {
            bottomBorderColor?.let { borderColor ->
              val strokeWidth = 1.dp.toPx()
              val y = this.size.height - strokeWidth / 2f
              drawLine(
                color = borderColor,
                start = Offset(0f, y),
                end = Offset(this.size.width, y),
                strokeWidth = strokeWidth,
              )
            }
            outlineColor?.let { outline ->
              val strokeWidth = 2.dp.toPx()
              val half = strokeWidth / 2f
              drawRect(
                color = outline,
                topLeft = Offset(half, half),
                size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
                style = Stroke(width = strokeWidth),
              )
            }
          }
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            enabled = isInteractive,
            role = Role.DropdownList,
            onClick = {
              onClick()
              if (options.isNotEmpty()) setExpanded(!isExpanded)
            },
          )
          .padding(horizontal = spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        if (selectedOptions.isNotEmpty()) {
          Row(
            modifier = Modifier
              .height(24.dp)
              .clip(RoundedCornerShape(12.dp))
              .background(if (enabled) colors.backgroundInverse else colors.buttonDisabled)
              .padding(start = spacing.spacing03, end = spacing.spacing02),
            verticalAlignment = Alignment.CenterVertically,
          ) {
            BasicText(
              text = selectedOptions.size.toString(),
              style = typography.label01.copy(
                color = if (enabled) colors.textInverse else colors.textOnColorDisabled,
              ),
            )
            if (isInteractive && onSelectionChange != null) {
              Spacer(modifier = Modifier.width(spacing.spacing01))
              Box(
                modifier = Modifier
                  .size(18.dp)
                  .semantics { contentDescription = "Clear all selected items" }
                  .clickable(role = Role.Button) { onSelectionChange(emptyList()) },
                contentAlignment = Alignment.Center,
              ) {
                Icon(
                  image = Icons.Close,
                  size = IconSize.Small,
                  tint = colors.iconInverse,
                )
              }
            }
          }
          Spacer(modifier = Modifier.width(spacing.spacing03))
        }

        val summary =
          if (selectedOptions.isEmpty()) placeholder else selectedOptions.joinToString(", ")
        BasicText(
          text = summary,
          style = typography.bodyCompact01.copy(
            color = when {
              !enabled -> colors.textDisabled
              selectedOptions.isEmpty() -> colors.textPlaceholder
              else -> colors.textPrimary
            },
          ),
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
          modifier = Modifier.weight(1f),
        )

        if (isInvalid) {
          Spacer(modifier = Modifier.width(spacing.spacing03))
          Icon(
            image = Icons.WarningFilled,
            size = IconSize.Small,
            tint = colors.supportError,
          )
        } else if (isWarning) {
          Spacer(modifier = Modifier.width(spacing.spacing03))
          Icon(
            image = Icons.WarningAltFilled,
            size = IconSize.Small,
            tint = colors.supportWarning,
          )
        }

        Spacer(modifier = Modifier.width(spacing.spacing03))
        Icon(
          image = Icons.ChevronDown,
          size = IconSize.Small,
          tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
          modifier = Modifier.rotate(if (isExpanded) 180f else 0f),
        )
      }

      if (isExpanded && options.isNotEmpty() && onSelectionChange != null) {
        Popover(
          expanded = true,
          onDismissRequest = { setExpanded(false) },
          align = PopoverAlign.BottomStart,
          caret = false,
          dropShadow = true,
          tabTip = true,
          contentPadding = PaddingValues(0.dp),
        ) {
          MultiselectOptionList(
            options = options,
            selectedOptions = selectedOptions,
            size = effectiveSize,
            onToggle = { option ->
              val next =
                if (option in selectedOptions) {
                  selectedOptions - option
                } else {
                  selectedOptions + option
                }
              onSelectionChange(next)
            },
          )
        }
      }
    }

    val message: String?
    val messageColor: Color
    when {
      isInvalid -> {
        message = error
        messageColor = colors.textError
      }

      isWarning -> {
        message = warning
        messageColor = colors.textPrimary
      }

      helper != null -> {
        message = helper
        messageColor = if (enabled) colors.textHelper else colors.textDisabled
      }

      else -> {
        message = null
        messageColor = Color.Unspecified
      }
    }

    if (message != null) {
      BasicText(
        text = message,
        style = typography.label01.copy(color = messageColor),
        modifier = Modifier.padding(top = spacing.spacing02),
      )
    }
  }
}

/**
 * Styled Carbon v11 Multiselect checkbox option list surface.
 */
@Composable
fun MultiselectOptionList(
  options: List<String>,
  selectedOptions: List<String>,
  onToggle: (String) -> Unit,
  modifier: Modifier = Modifier,
  size: ControlSize = ControlSize.Medium,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val effectiveSize = size.toMultiselectSize()

  Column(
    modifier = modifier
      .fillMaxWidth()
      .background(colors.layer01),
  ) {
    options.forEachIndexed { index, option ->
      val isSelected = option in selectedOptions
      val interactionSource = remember(option) { MutableInteractionSource() }
      val hovered by interactionSource.collectIsHoveredAsState()

      if (index > 0) {
        Box(
          modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = spacing.spacing05)
            .height(1.dp)
            .background(colors.borderSubtle01),
        )
      }

      Row(
        modifier = Modifier
          .fillMaxWidth()
          .defaultMinSize(minHeight = effectiveSize.dp)
          .background(
            when {
              isSelected -> colors.layerSelected01
              hovered -> colors.layerHover01
              else -> Color.Transparent
            },
          )
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            role = Role.Checkbox,
            onClick = { onToggle(option) },
          )
          .padding(horizontal = spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Checkbox(
          checked = isSelected,
          onCheckedChange = { onToggle(option) },
          label = option,
        )
      }
    }
  }
}
