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
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
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

private fun ControlSize.toDropdownSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Medium
}

/**
 * Carbon Design System v11 Select component (`sm`/`md`/`lg`, default or inline, invalid/warning,
 * read-only/disabled states).
 */
@Composable
fun Select(
  selectedOption: String,
  modifier: Modifier = Modifier,
  expanded: Boolean = false,
  onExpandedChange: (Boolean) -> Unit = {},
  options: List<String> = emptyList(),
  onOptionSelect: ((String) -> Unit)? = null,
  label: String? = null,
  placeholder: String = "Choose an option",
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  inline: Boolean = false,
  size: ControlSize = ControlSize.Medium,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toDropdownSize()
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val background =
    when {
      !enabled -> if (inline) Color.Transparent else colors.field01
      readOnly || inline -> if (hovered && isInteractive) colors.backgroundHover else Color.Transparent
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
      !enabled || inline || outlineColor != null -> null
      readOnly -> colors.borderSubtle01
      else -> colors.borderStrong01
    }
  val labelColor = if (enabled) colors.textSecondary else colors.textDisabled
  val valueText = selectedOption.ifEmpty { placeholder }
  val valueColor =
    when {
      !enabled -> colors.textDisabled
      selectedOption.isEmpty() -> colors.textPlaceholder
      else -> colors.textPrimary
    }
  val iconTint = if (enabled) colors.iconPrimary else colors.iconDisabled

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null && !inline) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = labelColor),
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
            onClick = { onExpandedChange(!expanded) },
          )
          .padding(horizontal = spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        if (label != null && inline) {
          BasicText(
            text = label,
            style = typography.bodyCompact01.copy(color = labelColor),
            modifier = Modifier.padding(end = spacing.spacing03),
          )
        }

        BasicText(
          text = valueText,
          style = typography.bodyCompact01.copy(color = valueColor),
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
          tint = iconTint,
          modifier = Modifier.rotate(if (expanded) 180f else 0f),
        )
      }

      if (expanded && options.isNotEmpty()) {
        Popover(
          expanded = true,
          onDismissRequest = { onExpandedChange(false) },
          align = PopoverAlign.BottomStart,
          caret = false,
          dropShadow = true,
          tabTip = true,
          contentPadding = PaddingValues(0.dp),
        ) {
          DropdownOptionList(
            options = options,
            selectedOption = selectedOption,
            size = effectiveSize,
            onOptionSelect = { option ->
              onOptionSelect?.invoke(option)
              onExpandedChange(false)
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
 * Carbon Design System v11 Dropdown component.
 */
@Composable
fun Dropdown(
  selectedOption: String?,
  options: List<String>,
  onOptionSelect: (String) -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  label: String? = null,
  placeholder: String = "Choose an option",
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  inline: Boolean = false,
  size: ControlSize = ControlSize.Medium,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var internalExpanded by remember { mutableStateOf(false) }
  val isExpanded = expanded ?: internalExpanded

  Select(
    selectedOption = selectedOption.orEmpty(),
    modifier = modifier,
    expanded = isExpanded,
    onExpandedChange = { next ->
      internalExpanded = next
      onExpandedChange?.invoke(next)
    },
    options = options,
    onOptionSelect = onOptionSelect,
    label = label,
    placeholder = placeholder,
    helper = helper,
    error = error,
    warning = warning,
    enabled = enabled,
    readOnly = readOnly,
    inline = inline,
    size = size,
    interactionSource = interactionSource,
  )
}

/**
 * Carbon Design System v11 ComboBox: filterable text input paired with a dropdown menu of options
 * and a clear button when text is entered.
 */
@Composable
fun ComboBox(
  value: String,
  onValueChange: (String) -> Unit,
  options: List<String>,
  onOptionSelect: (String) -> Unit,
  modifier: Modifier = Modifier,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  label: String? = null,
  placeholder: String = "Filter...",
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
  val effectiveSize = size.toDropdownSize()
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isInteractive = enabled && !readOnly
  val isInvalid = error != null && isInteractive
  val isWarning = warning != null && !isInvalid && isInteractive

  val background = if (readOnly && enabled) Color.Transparent else colors.field01
  val outlineColor =
    when {
      !enabled -> null
      isFocused -> colors.focus
      isInvalid -> colors.supportError
      else -> null
    }
  val bottomBorderColor =
    when {
      !enabled || outlineColor != null -> null
      readOnly -> colors.borderSubtle01
      else -> colors.borderStrong01
    }
  val filteredOptions =
    remember(value, options) {
      if (value.isBlank()) options else options.filter { it.contains(value, ignoreCase = true) }
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
          .padding(start = spacing.spacing05, end = spacing.spacing03),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Box(
          modifier = Modifier.weight(1f),
          contentAlignment = Alignment.CenterStart,
        ) {
          if (value.isEmpty()) {
            BasicText(
              text = placeholder,
              style = typography.bodyCompact01.copy(
                color = if (enabled) colors.textPlaceholder else colors.textDisabled,
              ),
              maxLines = 1,
            )
          }
          BasicTextField(
            value = value,
            onValueChange = { next ->
              onValueChange(next)
              if (!isExpanded) setExpanded(true)
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = typography.bodyCompact01.copy(
              color = if (enabled) colors.textPrimary else colors.textDisabled,
            ),
            cursorBrush = SolidColor(colors.textPrimary),
            interactionSource = interactionSource,
            singleLine = true,
          )
        }

        if (isInvalid) {
          Icon(
            image = Icons.WarningFilled,
            size = IconSize.Small,
            tint = colors.supportError,
            modifier = Modifier.padding(end = spacing.spacing02),
          )
        } else if (isWarning) {
          Icon(
            image = Icons.WarningAltFilled,
            size = IconSize.Small,
            tint = colors.supportWarning,
            modifier = Modifier.padding(end = spacing.spacing02),
          )
        }

        if (value.isNotEmpty() && isInteractive) {
          Box(
            modifier = Modifier
              .size(28.dp)
              .semantics { contentDescription = "Clear selected item" }
              .clickable(role = Role.Button) { onValueChange("") },
            contentAlignment = Alignment.Center,
          ) {
            Icon(
              image = Icons.Close,
              size = IconSize.Small,
              tint = colors.iconPrimary,
            )
          }
        }

        Box(
          modifier = Modifier
            .size(28.dp)
            .semantics { contentDescription = "Toggle menu" }
            .clickable(enabled = isInteractive, role = Role.Button) { setExpanded(!isExpanded) },
          contentAlignment = Alignment.Center,
        ) {
          Icon(
            image = Icons.ChevronDown,
            size = IconSize.Small,
            tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
            modifier = Modifier.rotate(if (isExpanded) 180f else 0f),
          )
        }
      }

      if (isExpanded && filteredOptions.isNotEmpty()) {
        Popover(
          expanded = true,
          onDismissRequest = { setExpanded(false) },
          align = PopoverAlign.BottomStart,
          caret = false,
          dropShadow = true,
          tabTip = true,
          contentPadding = PaddingValues(0.dp),
        ) {
          DropdownOptionList(
            options = filteredOptions,
            selectedOption = value,
            size = effectiveSize,
            onOptionSelect = { option ->
              onOptionSelect(option)
              setExpanded(false)
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
 * Styled Carbon v11 dropdown menu options surface.
 */
@Composable
fun DropdownOptionList(
  options: List<String>,
  selectedOption: String?,
  onOptionSelect: (String) -> Unit,
  modifier: Modifier = Modifier,
  size: ControlSize = ControlSize.Medium,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val effectiveSize = size.toDropdownSize()

  Column(
    modifier = modifier
      .fillMaxWidth()
      .background(colors.layer01),
  ) {
    options.forEachIndexed { index, option ->
      val isSelected = option == selectedOption
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
            role = Role.Button,
            onClick = { onOptionSelect(option) },
          )
          .padding(horizontal = spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        BasicText(
          text = option,
          style = typography.bodyCompact01.copy(color = colors.textPrimary),
          maxLines = 1,
          overflow = TextOverflow.Ellipsis,
          modifier = Modifier.weight(1f),
        )
        if (isSelected) {
          Spacer(modifier = Modifier.width(spacing.spacing03))
          Icon(
            image = Icons.Checkmark,
            size = IconSize.Small,
            tint = colors.iconPrimary,
          )
        }
      }
    }
  }
}
