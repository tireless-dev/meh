// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.black
import dev.tireless.meh.theme.dp

enum class RadioLabelPosition {
  Left,
  Right,
}

@LayoutScopeMarker
@Immutable
class RadioButtonGroupScope internal constructor(
  internal val enabled: Boolean,
  internal val readOnly: Boolean,
  internal val invalid: Boolean,
  internal val labelPosition: RadioLabelPosition,
) {
  @Composable
  fun RadioButton(
    selected: Boolean,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    hideLabel: Boolean = false,
    readOnly: Boolean = false,
    labelPosition: RadioLabelPosition = this.labelPosition,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  ) {
    dev.tireless.meh.component.RadioButton(
      selected = selected,
      label = label,
      onClick = onClick,
      modifier = modifier,
      enabled = enabled && this.enabled,
      hideLabel = hideLabel,
      readOnly = readOnly || this.readOnly,
      invalid = this.invalid,
      labelPosition = labelPosition,
      interactionSource = interactionSource,
    )
  }
}

@Immutable
private data class ResolvedRadioButtonColors(
  val border: Color,
  val dot: Color,
  val label: Color,
)

@Composable
fun RadioButton(
  selected: Boolean,
  label: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  hideLabel: Boolean = false,
  readOnly: Boolean = false,
  invalid: Boolean = false,
  labelPosition: RadioLabelPosition = RadioLabelPosition.Right,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val effectiveInvalid = invalid && enabled && !readOnly

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val focused by interactionSource.collectIsFocusedAsState()

  val resolvedColors = resolveRadioButtonColors(
    colors = colors,
    selected = selected,
    enabled = enabled,
    readOnly = readOnly,
    invalid = effectiveInvalid,
  )

  val interactionModifier =
    if (enabled && readOnly) {
      Modifier
        .focusable(enabled = true, interactionSource = interactionSource)
        .semantics(mergeDescendants = true) {
          role = Role.RadioButton
          this.selected = selected
          if (hideLabel) {
            contentDescription = label
          }
        }
    } else {
      Modifier
        .selectable(
          selected = selected,
          enabled = enabled,
          role = Role.RadioButton,
          interactionSource = interactionSource,
          indication = null,
          onClick = onClick,
        )
        .then(
          if (hideLabel || effectiveInvalid) {
            Modifier.semantics {
              if (hideLabel) {
                contentDescription = label
              }
              if (effectiveInvalid) {
                error("Invalid")
              }
            }
          } else {
            Modifier
          },
        )
    }

  Row(
    verticalAlignment = Alignment.Top,
    modifier = modifier.then(interactionModifier),
  ) {
    if (!hideLabel && labelPosition == RadioLabelPosition.Left) {
      BasicText(
        text = label,
        style = MehTheme.typography.bodyCompact01.copy(color = resolvedColors.label),
        modifier = Modifier.padding(top = spacing.spacing00),
      )
      Spacer(Modifier.size(spacing.spacing03))
    }

    RadioButtonCircle(
      selected = selected,
      focused = focused && enabled,
      colors = resolvedColors,
      focusColor = colors.focus,
    )

    if (!hideLabel && labelPosition == RadioLabelPosition.Right) {
      Spacer(Modifier.size(spacing.spacing03))
      BasicText(
        text = label,
        style = MehTheme.typography.bodyCompact01.copy(color = resolvedColors.label),
        modifier = Modifier.padding(top = spacing.spacing00),
      )
    }
  }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RadioButtonGroup(
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  invalid: Boolean = false,
  invalidText: String? = null,
  warn: Boolean = false,
  warnText: String? = null,
  layout: GroupLayout = GroupLayout.Horizontal,
  labelPosition: RadioLabelPosition = RadioLabelPosition.Right,
  content: @Composable RadioButtonGroupScope.() -> Unit,
) {
  val spacing = MehTheme.spacing
  val effectiveInvalid = invalid && enabled && !readOnly
  val effectiveWarn = warn && !effectiveInvalid && enabled && !readOnly

  val scope = remember(enabled, readOnly, effectiveInvalid, labelPosition) {
    RadioButtonGroupScope(
      enabled = enabled,
      readOnly = readOnly,
      invalid = effectiveInvalid,
      labelPosition = labelPosition,
    )
  }

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      FormLabel(text = label, enabled = enabled)
      Spacer(Modifier.height(spacing.spacing03))
    }

    val contentWithState = remember(scope, content) {
      movableContentOf { scope.content() }
    }

    if (layout == GroupLayout.Horizontal) {
      FlowRow(
        modifier = Modifier.selectableGroup(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
      ) {
        contentWithState()
      }
    } else {
      Column(
        modifier = Modifier.selectableGroup(),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        horizontalAlignment = if (labelPosition == RadioLabelPosition.Left) Alignment.End else Alignment.Start,
      ) {
        contentWithState()
      }
    }

    RadioButtonGroupMessage(
      enabled = enabled,
      invalid = effectiveInvalid,
      invalidText = invalidText,
      warn = effectiveWarn,
      warnText = warnText,
      helper = helper,
    )
  }
}

@Composable
private fun RadioButtonCircle(
  selected: Boolean,
  focused: Boolean,
  colors: ResolvedRadioButtonColors,
  focusColor: Color,
) {
  Canvas(
    modifier =
    Modifier
      .padding(vertical = MehTheme.spacing.spacing00)
      .size(18.dp),
  ) {
    drawRadioButton(
      selected = selected,
      focused = focused,
      colors = colors,
      focusColor = focusColor,
    )
  }
}

private fun DrawScope.drawRadioButton(
  selected: Boolean,
  focused: Boolean,
  colors: ResolvedRadioButtonColors,
  focusColor: Color,
) {
  val outerRadius = size.minDimension / 2f

  if (focused) {
    val focusStrokePx = 2.dp.toPx()
    val focusGapPx = 1.5.dp.toPx()
    drawCircle(
      color = focusColor,
      radius = outerRadius + focusGapPx + focusStrokePx / 2f,
      style = Stroke(width = focusStrokePx),
    )
  }

  val borderPx = 1.dp.toPx()
  drawCircle(
    color = colors.border,
    radius = outerRadius - borderPx / 2f,
    style = Stroke(width = borderPx),
  )

  if (selected) {
    drawCircle(
      color = colors.dot,
      radius = 4.dp.toPx(),
    )
  }
}

@Composable
private fun RadioButtonGroupMessage(
  enabled: Boolean,
  invalid: Boolean,
  invalidText: String?,
  warn: Boolean,
  warnText: String?,
  helper: String?,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  when {
    invalid && invalidText != null -> {
      Row(
        modifier = Modifier.padding(top = spacing.spacing02),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
        verticalAlignment = Alignment.Top,
      ) {
        Icon(
          image = Icons.WarningFilled,
          size = IconSize.Small,
          tint = colors.supportError,
        )
        BasicText(
          text = invalidText,
          style = MehTheme.typography.label01.copy(color = colors.textError),
        )
      }
    }

    warn && warnText != null -> {
      Row(
        modifier = Modifier.padding(top = spacing.spacing02),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing03),
        verticalAlignment = Alignment.Top,
      ) {
        RadioWarningAltIcon(tint = colors.supportWarning)
        BasicText(
          text = warnText,
          style = MehTheme.typography.label01.copy(color = colors.textPrimary),
        )
      }
    }

    !invalid && !warn && helper != null -> {
      BasicText(
        text = helper,
        style = MehTheme.typography.label01.copy(
          color = if (enabled) colors.textHelper else colors.textDisabled,
        ),
        modifier = Modifier.padding(top = spacing.spacing02),
      )
    }
  }
}

@Composable
private fun RadioWarningAltIcon(tint: Color) {
  Box(
    modifier =
    Modifier
      .size(IconSize.Small.dp)
      .drawBehind {
        drawRect(
          color = black,
          topLeft = Offset(size.width * (14.5f / 32f), size.height * (11.5f / 32f)),
          size = Size(size.width * (3f / 32f), size.height * (15f / 32f)),
        )
      },
  ) {
    Icon(
      image = Icons.WarningAltFilled,
      size = IconSize.Small,
      tint = tint,
    )
  }
}

private fun resolveRadioButtonColors(
  colors: Colors,
  selected: Boolean,
  enabled: Boolean,
  readOnly: Boolean,
  invalid: Boolean,
): ResolvedRadioButtonColors = when {
  !enabled ->
    ResolvedRadioButtonColors(
      border = colors.iconDisabled,
      dot = if (selected) colors.iconDisabled else Color.Transparent,
      label = colors.textDisabled,
    )

  readOnly ->
    ResolvedRadioButtonColors(
      border = colors.iconDisabled,
      dot = if (selected) colors.iconPrimary else Color.Transparent,
      label = colors.textPrimary,
    )

  invalid ->
    ResolvedRadioButtonColors(
      border = colors.supportError,
      dot = if (selected) colors.iconPrimary else Color.Transparent,
      label = colors.textPrimary,
    )

  else ->
    ResolvedRadioButtonColors(
      border = colors.iconPrimary,
      dot = if (selected) colors.iconPrimary else Color.Transparent,
      label = colors.textPrimary,
    )
}
