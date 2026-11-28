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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

private fun ControlSize.toNumberInputSize(): ControlSize = when (this) {
  ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> ControlSize.Medium
}

private fun formatNumberValue(value: Double): String = if (value % 1.0 == 0.0 && value >= Long.MIN_VALUE && value <= Long.MAX_VALUE) {
  value.toLong().toString()
} else {
  value.toString()
}

/**
 * Carbon Design System v11 Number input with horizontal subtract/add stepper buttons,
 * validation states (invalid, warning), read-only and disabled modes, and `sm`/`md`/`lg` sizes.
 */
@Composable
fun NumberInput(
  value: Double,
  onValueChange: (Double) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  hideSteppers: Boolean = false,
  min: Double = Double.NEGATIVE_INFINITY,
  max: Double = Double.POSITIVE_INFINITY,
  step: Double = 1.0,
  size: ControlSize = ControlSize.Medium,
  keyboardActions: KeyboardActions = KeyboardActions.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isInvalid = error != null && enabled && !readOnly
  val isWarning = warning != null && !isInvalid && enabled && !readOnly
  val effectiveSize = size.toNumberInputSize()

  val backgroundColor =
    when {
      !enabled -> colors.field01
      readOnly -> Color.Transparent
      else -> colors.field01
    }
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
  val labelColor = if (enabled) colors.textSecondary else colors.textDisabled
  val textColor = if (enabled) colors.textPrimary else colors.textDisabled
  val helperColor = if (enabled) colors.textHelper else colors.textDisabled

  val canDecrement = enabled && !readOnly && value - step >= min
  val canIncrement = enabled && !readOnly && value + step <= max

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = labelColor),
        modifier = Modifier.padding(bottom = spacing.spacing03),
      )
    }

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(effectiveSize.dp)
        .background(backgroundColor)
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
          outlineColor?.let { focusOrError ->
            val strokeWidth = 2.dp.toPx()
            val half = strokeWidth / 2f
            drawRect(
              color = focusOrError,
              topLeft = Offset(half, half),
              size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
              style = Stroke(width = strokeWidth),
            )
          }
        },
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Box(
        modifier = Modifier
          .weight(1f)
          .padding(start = spacing.spacing05, end = spacing.spacing03),
        contentAlignment = Alignment.CenterStart,
      ) {
        BasicTextField(
          value = formatNumberValue(value),
          onValueChange = { raw ->
            raw.toDoubleOrNull()?.let { parsed ->
              onValueChange(parsed.coerceIn(min, max))
            }
          },
          modifier = Modifier.fillMaxWidth(),
          enabled = enabled,
          readOnly = readOnly,
          textStyle = typography.bodyCompact01.copy(color = textColor),
          cursorBrush = SolidColor(colors.textPrimary),
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
          keyboardActions = keyboardActions,
          interactionSource = interactionSource,
          singleLine = true,
        )
      }

      if (isInvalid) {
        Icon(
          image = Icons.WarningFilled,
          size = IconSize.Small,
          tint = colors.supportError,
          modifier = Modifier.padding(end = if (hideSteppers) spacing.spacing05 else spacing.spacing03),
        )
      } else if (isWarning) {
        Icon(
          image = Icons.WarningAltFilled,
          size = IconSize.Small,
          tint = colors.supportWarning,
          modifier = Modifier.padding(end = if (hideSteppers) spacing.spacing05 else spacing.spacing03),
        )
      }

      if (!hideSteppers) {
        StepperButton(
          icon = Icons.Subtract,
          contentDescription = "Decrement",
          enabled = canDecrement,
          size = effectiveSize,
          onClick = { onValueChange((value - step).coerceAtLeast(min)) },
        )
        Spacer(
          modifier = Modifier
            .width(1.dp)
            .height(16.dp)
            .background(if (enabled && !readOnly) colors.borderSubtle01 else colors.borderDisabled),
        )
        StepperButton(
          icon = Icons.Add,
          contentDescription = "Increment",
          enabled = canIncrement,
          size = effectiveSize,
          onClick = { onValueChange((value + step).coerceAtMost(max)) },
        )
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
        messageColor = helperColor
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

@Composable
private fun StepperButton(
  icon: ImageVector,
  contentDescription: String,
  enabled: Boolean,
  size: ControlSize,
  onClick: () -> Unit,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()

  Box(
    modifier = Modifier
      .width(size.dp)
      .fillMaxHeight()
      .background(if (hovered && enabled) colors.fieldHover01 else Color.Transparent)
      .semantics { this.contentDescription = contentDescription }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        enabled = enabled,
        role = Role.Button,
        onClick = onClick,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = icon,
      size = IconSize.Small,
      tint = if (enabled) colors.iconPrimary else colors.iconDisabled,
    )
  }
}
