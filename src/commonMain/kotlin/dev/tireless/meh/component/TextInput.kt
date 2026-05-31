// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@Composable
fun TextInput(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String? = null,
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  size: ControlSize = ControlSize.Large,
  visualTransformation: VisualTransformation = VisualTransformation.None,
  keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
  trailingIcon: @Composable (() -> Unit)? = null,
) {
  val interactionSource = remember { MutableInteractionSource() }
  val isFocused by interactionSource.collectIsFocusedAsState()
  val isInvalid = error != null

  Column(modifier = modifier.fillMaxWidth()) {
    label?.let {
      FormLabel(text = it, enabled = enabled, modifier = Modifier.padding(bottom = MehTheme.spacing.spacing03))
    }

    val backgroundColor = if (enabled) MehTheme.colors.field02 else MehTheme.colors.field02.copy(alpha = 0.5f)
    val borderColor = when {
      isFocused -> MehTheme.colors.focus
      isInvalid -> MehTheme.colors.supportError
      else -> Color.Transparent
    }

    val bottomBorderColor = when {
      isFocused -> MehTheme.colors.focus
      isInvalid -> MehTheme.colors.supportError
      else -> MehTheme.colors.borderStrong01
    }

    Box(
      modifier = Modifier
        .fillMaxWidth()
        .height(size.dp)
        .background(backgroundColor)
        .border(width = if (isFocused || isInvalid) 2.dp else 0.dp, color = borderColor)
        .let {
          if (!isFocused && !isInvalid) {
            it.border(width = 1.dp, color = bottomBorderColor) // This is a simplification; Carbon uses a bottom border mostly.
          } else {
            it
          }
        },
    ) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = MehTheme.spacing.spacing05),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Box(modifier = Modifier.weight(1f)) {
          if (value.isEmpty() && placeholder != null) {
            Text(
              text = placeholder,
              style = MehTheme.typography.body01,
              color = MehTheme.colors.textPlaceholder,
            )
          }
          BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = MehTheme.typography.body01.copy(
              color = if (enabled) MehTheme.colors.textPrimary else MehTheme.colors.textDisabled,
            ),
            cursorBrush = SolidColor(MehTheme.colors.textPrimary),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            interactionSource = interactionSource,
            singleLine = true,
          )
        }

        if (isInvalid) {
          Icon(
            image = Icons.WarningFilled,
            size = IconSize.Small,
            tint = MehTheme.colors.supportError,
            modifier = Modifier.padding(start = MehTheme.spacing.spacing03),
          )
        }

        trailingIcon?.let {
          Box(modifier = Modifier.padding(start = MehTheme.spacing.spacing03)) {
            it()
          }
        }
      }
    }

    if (error != null) {
      Text(
        text = error,
        style = MehTheme.typography.label01,
        color = MehTheme.colors.textError,
        modifier = Modifier.padding(top = MehTheme.spacing.spacing02),
      )
    } else if (helper != null) {
      FormHelper(text = helper, enabled = enabled, modifier = Modifier.padding(top = MehTheme.spacing.spacing02))
    }
  }
}
