// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
@file:Suppress("unused")

package dev.tireless.meh

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.component.FormHelper as ComponentFormHelper
import dev.tireless.meh.component.FormLabel as ComponentFormLabel
import dev.tireless.meh.component.GroupLayout as ComponentGroupLayout
import dev.tireless.meh.component.Icon as ComponentIcon
import dev.tireless.meh.component.Radio as ComponentRadio
import dev.tireless.meh.component.RadioOption as ComponentRadioOption
import dev.tireless.meh.component.Text as ComponentText

typealias GroupLayout = ComponentGroupLayout

@Deprecated(
  "Moved to dev.tireless.meh.component.Text",
  replaceWith =
    ReplaceWith(
      "Text(text, modifier, enabled, size, style, color, alignment, textAlign)",
      "dev.tireless.meh.component.Text",
    ),
)
@Composable
fun Text(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Unspecified,
  style: TextStyle = MehTheme.typography.body01,
  color: Color = Color.Unspecified,
  alignment: Alignment = Alignment.Center,
  textAlign: TextAlign = TextAlign.Start,
) = ComponentText(
  text = text,
  modifier = modifier,
  enabled = enabled,
  size = size,
  style = style,
  color = color,
  alignment = alignment,
  textAlign = textAlign,
)

@Deprecated(
  "Moved to dev.tireless.meh.component.FormLabel",
  replaceWith =
    ReplaceWith(
      "FormLabel(text, modifier, enabled)",
      "dev.tireless.meh.component.FormLabel",
    ),
)
@Composable
fun FormLabel(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) = ComponentFormLabel(
  text = text,
  modifier = modifier,
  enabled = enabled,
)

@Deprecated(
  "Moved to dev.tireless.meh.component.FormHelper",
  replaceWith =
    ReplaceWith(
      "FormHelper(text, modifier, enabled)",
      "dev.tireless.meh.component.FormHelper",
    ),
)
@Composable
fun FormHelper(
  text: String,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) = ComponentFormHelper(
  text = text,
  modifier = modifier,
  enabled = enabled,
)

@Deprecated(
  "Moved to dev.tireless.meh.component.Icon",
  replaceWith =
    ReplaceWith(
      "Icon(image, contentDescription, modifier, size, tint)",
      "dev.tireless.meh.component.Icon",
    ),
)
@Composable
fun Icon(
  image: ImageVector,
  contentDescription: String?,
  modifier: Modifier = Modifier,
  size: IconSize = IconSize.Medium,
  tint: Color = Color.Unspecified,
) = ComponentIcon(
  image = image,
  contentDescription = contentDescription,
  modifier = modifier,
  size = size,
  tint = tint,
)

@Deprecated(
  "Moved to dev.tireless.meh.component.Radio",
  replaceWith =
    ReplaceWith(
      "Radio(value, onValueChange, values, modifier, enabled, label, helper, layout)",
      "dev.tireless.meh.component.Radio",
    ),
)
@Composable
fun Radio(
  value: Int,
  onValueChange: (Int) -> Unit,
  values: List<String>,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  label: String? = null,
  helper: String? = null,
  layout: GroupLayout = GroupLayout.Horizontal,
) = ComponentRadio(
  value = value,
  onValueChange = onValueChange,
  values = values,
  modifier = modifier,
  enabled = enabled,
  label = label,
  helper = helper,
  layout = layout,
)

@Deprecated(
  "Moved to dev.tireless.meh.component.RadioOption",
  replaceWith =
    ReplaceWith(
      "RadioOption(selected, label, onClick, modifier, enabled)",
      "dev.tireless.meh.component.RadioOption",
    ),
)
@Composable
fun RadioOption(
  selected: Boolean,
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
) = ComponentRadioOption(
  selected = selected,
  label = label,
  onClick = onClick,
  modifier = modifier,
  enabled = enabled,
)
