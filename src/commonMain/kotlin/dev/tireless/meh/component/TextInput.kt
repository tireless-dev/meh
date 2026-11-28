// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

object TextInputDefaults {
  val DefaultSize: ControlSize = ControlSize.Medium
  val TextAreaMinHeight: Dp = 112.dp
}

private fun ControlSize.toTextInputSize(): ControlSize = when (this) {
  ControlSize.XSmall, ControlSize.Small, ControlSize.Medium, ControlSize.Large -> this
  else -> TextInputDefaults.DefaultSize
}

@Immutable
private data class ResolvedFieldColors(
  val background: Color,
  val text: Color,
  val placeholder: Color,
  val label: Color,
  val helper: Color,
  val bottomBorder: Color?,
  val outlineBorder: Color?,
)

private fun resolveFieldColors(
  colors: Colors,
  enabled: Boolean,
  readOnly: Boolean,
  focused: Boolean,
  isInvalid: Boolean,
): ResolvedFieldColors {
  if (!enabled) {
    return ResolvedFieldColors(
      background = colors.field01,
      text = colors.textDisabled,
      placeholder = colors.textDisabled,
      label = colors.textDisabled,
      helper = colors.textDisabled,
      bottomBorder = null,
      outlineBorder = null,
    )
  }

  val background = if (readOnly) Color.Transparent else colors.field01
  val outlineBorder =
    when {
      focused -> colors.focus
      isInvalid -> colors.supportError
      else -> null
    }
  val bottomBorder =
    when {
      outlineBorder != null -> null
      readOnly -> colors.borderSubtle01
      else -> colors.borderStrong01
    }

  return ResolvedFieldColors(
    background = background,
    text = colors.textPrimary,
    placeholder = colors.textPlaceholder,
    label = colors.textSecondary,
    helper = colors.textHelper,
    bottomBorder = bottomBorder,
    outlineBorder = outlineBorder,
  )
}

private fun DrawScope.drawFieldBorders(fieldColors: ResolvedFieldColors) {
  fieldColors.bottomBorder?.let { borderColor ->
    val strokeWidth = 1.dp.toPx()
    val y = size.height - strokeWidth / 2f
    drawLine(
      color = borderColor,
      start = Offset(0f, y),
      end = Offset(size.width, y),
      strokeWidth = strokeWidth,
    )
  }
  fieldColors.outlineBorder?.let { outlineColor ->
    val strokeWidth = 2.dp.toPx()
    val half = strokeWidth / 2f
    drawRect(
      color = outlineColor,
      topLeft = Offset(half, half),
      size = Size(size.width - strokeWidth, size.height - strokeWidth),
      style = Stroke(width = strokeWidth),
    )
  }
}

@Composable
private fun FieldHeader(
  label: String?,
  counterText: String?,
  labelColor: Color,
) {
  if (label == null && counterText == null) return

  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  Row(
    modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = spacing.spacing03),
    horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(color = labelColor),
        modifier = Modifier.weight(1f),
      )
    } else {
      Spacer(modifier = Modifier.weight(1f))
    }
    if (counterText != null) {
      Spacer(modifier = Modifier.width(spacing.spacing03))
      BasicText(
        text = counterText,
        style = typography.label01.copy(color = labelColor),
      )
    }
  }
}

@Composable
private fun FieldMessage(
  error: String?,
  warning: String?,
  helper: String?,
  enabled: Boolean,
  readOnly: Boolean,
  helperColor: Color,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isInvalid = error != null && enabled && !readOnly
  val isWarning = warning != null && !isInvalid && enabled && !readOnly

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

    else -> return
  }

  BasicText(
    text = message,
    style = typography.label01.copy(color = messageColor),
    modifier = Modifier.padding(top = spacing.spacing02),
  )
}

/**
 * Carbon Design System v11 single-line Text input.
 */
@Composable
fun TextInput(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  size: ControlSize = TextInputDefaults.DefaultSize,
  maxCount: Int? = null,
  visualTransformation: VisualTransformation = VisualTransformation.None,
  keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
  keyboardActions: KeyboardActions = KeyboardActions.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  trailingIcon: @Composable (() -> Unit)? = null,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isInvalid = error != null && enabled && !readOnly
  val isWarning = warning != null && !isInvalid && enabled && !readOnly
  val effectiveSize = size.toTextInputSize()

  val fieldColors =
    resolveFieldColors(
      colors = colors,
      enabled = enabled,
      readOnly = readOnly,
      focused = isFocused,
      isInvalid = isInvalid,
    )

  Column(modifier = modifier.fillMaxWidth()) {
    FieldHeader(
      label = label,
      counterText = maxCount?.let { "${value.length}/$it" },
      labelColor = fieldColors.label,
    )

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .height(effectiveSize.dp)
        .background(fieldColors.background)
        .drawBehind { drawFieldBorders(fieldColors) }
        .padding(horizontal = spacing.spacing05),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Box(
        modifier = Modifier.weight(1f),
        contentAlignment = Alignment.CenterStart,
      ) {
        if (value.isEmpty() && placeholder != null) {
          BasicText(
            text = placeholder,
            style = typography.bodyCompact01.copy(color = fieldColors.placeholder),
            maxLines = 1,
          )
        }
        BasicTextField(
          value = value,
          onValueChange = { next ->
            if (maxCount == null || next.length <= maxCount) {
              onValueChange(next)
            }
          },
          modifier = Modifier.fillMaxWidth(),
          enabled = enabled,
          readOnly = readOnly,
          textStyle = typography.bodyCompact01.copy(color = fieldColors.text),
          cursorBrush = SolidColor(colors.textPrimary),
          visualTransformation = visualTransformation,
          keyboardOptions = keyboardOptions,
          keyboardActions = keyboardActions,
          interactionSource = interactionSource,
          singleLine = true,
        )
      }

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

      trailingIcon?.let {
        Spacer(modifier = Modifier.width(spacing.spacing03))
        it()
      }
    }

    FieldMessage(
      error = error,
      warning = warning,
      helper = helper,
      enabled = enabled,
      readOnly = readOnly,
      helperColor = fieldColors.helper,
    )
  }
}

/**
 * Carbon Design System v11 Password input with built-in show/hide visibility toggle.
 *
 * When [readOnly] or disabled, visibility toggling is disabled per Carbon v11 guidelines.
 */
@Composable
fun PasswordInput(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  size: ControlSize = TextInputDefaults.DefaultSize,
  passwordVisible: Boolean? = null,
  onPasswordVisibleChange: ((Boolean) -> Unit)? = null,
  keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
  keyboardActions: KeyboardActions = KeyboardActions.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var internalVisible by remember { mutableStateOf(false) }
  val isVisible = passwordVisible ?: internalVisible
  val canToggle = enabled && !readOnly
  val colors = MehTheme.colors

  TextInput(
    value = value,
    onValueChange = onValueChange,
    modifier = modifier,
    label = label,
    placeholder = placeholder,
    helper = helper,
    error = error,
    warning = warning,
    enabled = enabled,
    readOnly = readOnly,
    size = size,
    visualTransformation =
    if (isVisible) VisualTransformation.None else PasswordVisualTransformation(),
    keyboardOptions = keyboardOptions,
    keyboardActions = keyboardActions,
    interactionSource = interactionSource,
    trailingIcon = {
      Box(
        modifier = Modifier
          .size(24.dp)
          .clickable(
            enabled = canToggle,
            role = Role.Button,
            onClick = {
              val next = !isVisible
              internalVisible = next
              onPasswordVisibleChange?.invoke(next)
            },
          ),
        contentAlignment = Alignment.Center,
      ) {
        Icon(
          image = if (isVisible) Icons.ViewOff else Icons.View,
          size = IconSize.Small,
          tint = if (canToggle) colors.iconPrimary else colors.iconDisabled,
        )
      }
    },
  )
}

/**
 * Carbon Design System v11 multi-line Text area with optional character counter.
 */
@Composable
fun TextArea(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String? = null,
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  maxCount: Int? = null,
  minLines: Int = 4,
  maxLines: Int = Int.MAX_VALUE,
  minHeight: Dp = TextInputDefaults.TextAreaMinHeight,
  keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
  keyboardActions: KeyboardActions = KeyboardActions.Default,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isInvalid = error != null && enabled && !readOnly
  val isWarning = warning != null && !isInvalid && enabled && !readOnly

  val fieldColors =
    resolveFieldColors(
      colors = colors,
      enabled = enabled,
      readOnly = readOnly,
      focused = isFocused,
      isInvalid = isInvalid,
    )

  Column(modifier = modifier.fillMaxWidth()) {
    FieldHeader(
      label = label,
      counterText = maxCount?.let { "${value.length}/$it" },
      labelColor = fieldColors.label,
    )

    Box(
      modifier = Modifier
        .fillMaxWidth()
        .defaultMinSize(minHeight = minHeight)
        .background(fieldColors.background)
        .drawBehind { drawFieldBorders(fieldColors) }
        .padding(
          horizontal = spacing.spacing05,
          vertical = spacing.spacing04,
        ),
    ) {
      val textEndPadding = if (isInvalid || isWarning) spacing.spacing06 else 0.dp
      if (value.isEmpty() && placeholder != null) {
        BasicText(
          text = placeholder,
          style = typography.body01.copy(color = fieldColors.placeholder),
          modifier = Modifier.padding(end = textEndPadding),
        )
      }
      BasicTextField(
        value = value,
        onValueChange = { next ->
          if (maxCount == null || next.length <= maxCount) {
            onValueChange(next)
          }
        },
        modifier = Modifier
          .fillMaxWidth()
          .padding(end = textEndPadding),
        enabled = enabled,
        readOnly = readOnly,
        textStyle = typography.body01.copy(color = fieldColors.text),
        cursorBrush = SolidColor(colors.textPrimary),
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        interactionSource = interactionSource,
        minLines = minLines,
        maxLines = maxLines,
      )

      if (isInvalid || isWarning) {
        Icon(
          image = if (isInvalid) Icons.WarningFilled else Icons.WarningAltFilled,
          size = IconSize.Small,
          tint = if (isInvalid) colors.supportError else colors.supportWarning,
          modifier = Modifier.align(Alignment.TopEnd),
        )
      }
    }

    FieldMessage(
      error = error,
      warning = warning,
      helper = helper,
      enabled = enabled,
      readOnly = readOnly,
      helperColor = fieldColors.helper,
    )
  }
}
