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
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.toggleableState
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Spacing
import dev.tireless.meh.theme.black
import dev.tireless.meh.theme.dp

@LayoutScopeMarker
@Immutable
class CheckboxGroupScope internal constructor(
  internal val enabled: Boolean,
  internal val readOnly: Boolean,
  internal val invalid: Boolean,
  internal val warn: Boolean,
) {
  @Composable
  fun Checkbox(
    checked: Boolean,
    label: String,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    indeterminate: Boolean = false,
    hideLabel: Boolean = false,
    readOnly: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  ) {
    dev.tireless.meh.component.Checkbox(
      checked = checked,
      label = label,
      onCheckedChange = onCheckedChange,
      modifier = modifier,
      enabled = enabled && this.enabled,
      indeterminate = indeterminate,
      hideLabel = hideLabel,
      readOnly = readOnly || this.readOnly,
      invalid = this.invalid,
      warn = this.warn,
      interactionSource = interactionSource,
    )
  }
}

@Immutable
private data class ResolvedCheckboxColors(
  val container: Color,
  val border: Color,
  val glyph: Color,
  val label: Color,
)

@Composable
fun Checkbox(
  checked: Boolean,
  label: String,
  onCheckedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  enabled: Boolean = true,
  indeterminate: Boolean = false,
  hideLabel: Boolean = false,
  readOnly: Boolean = false,
  invalid: Boolean = false,
  invalidText: String? = null,
  warn: Boolean = false,
  warnText: String? = null,
  helper: String? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val effectiveInvalid = invalid && enabled && !readOnly
  val effectiveWarn = warn && !effectiveInvalid && enabled && !readOnly

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val focused by interactionSource.collectIsFocusedAsState()
  val isSelected = checked || indeterminate
  val toggleableState =
    when {
      indeterminate -> ToggleableState.Indeterminate
      checked -> ToggleableState.On
      else -> ToggleableState.Off
    }

  val resolvedColors = resolveCheckboxColors(
    colors = colors,
    selected = isSelected,
    enabled = enabled,
    readOnly = readOnly,
    invalid = effectiveInvalid,
  )

  val interactionModifier =
    if (enabled && readOnly) {
      Modifier
        .focusable(enabled = true, interactionSource = interactionSource)
        .semantics(mergeDescendants = true) {
          role = Role.Checkbox
          this.toggleableState = toggleableState
          if (hideLabel) {
            contentDescription = label
          }
        }
    } else {
      Modifier
        .triStateToggleable(
          state = toggleableState,
          enabled = enabled,
          role = Role.Checkbox,
          interactionSource = interactionSource,
          indication = null,
          onClick = { onCheckedChange(!checked) },
        )
        .then(
          if (hideLabel || effectiveInvalid) {
            Modifier.semantics {
              if (hideLabel) {
                contentDescription = label
              }
              if (effectiveInvalid) {
                error(invalidText ?: "Invalid")
              }
            }
          } else {
            Modifier
          },
        )
    }

  Column(modifier = modifier) {
    Row(
      verticalAlignment = Alignment.Top,
      modifier = interactionModifier,
    ) {
      CheckboxBox(
        checked = checked,
        indeterminate = indeterminate,
        focused = focused && enabled,
        colors = resolvedColors,
        focusColor = colors.focus,
      )

      if (!hideLabel) {
        Spacer(Modifier.size(spacing.spacing03))
        BasicText(
          text = label,
          style = MehTheme.typography.bodyCompact01.copy(color = resolvedColors.label),
          modifier = Modifier.padding(top = spacing.spacing00),
        )
      }
    }

    CheckboxMessage(
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
fun CheckboxGroup(
  modifier: Modifier = Modifier,
  label: String? = null,
  helper: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  invalid: Boolean = false,
  invalidText: String? = null,
  warn: Boolean = false,
  warnText: String? = null,
  layout: GroupLayout = GroupLayout.Vertical,
  content: @Composable CheckboxGroupScope.() -> Unit,
) {
  val spacing = MehTheme.spacing
  val effectiveInvalid = invalid && enabled && !readOnly
  val effectiveWarn = warn && !effectiveInvalid && enabled && !readOnly

  val scope = remember(enabled, readOnly, effectiveInvalid, effectiveWarn) {
    CheckboxGroupScope(
      enabled = enabled,
      readOnly = readOnly,
      invalid = effectiveInvalid,
      warn = effectiveWarn,
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
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing05),
        verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
      ) {
        contentWithState()
      }
    } else {
      Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing02)) {
        contentWithState()
      }
    }

    CheckboxMessage(
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
private fun CheckboxBox(
  checked: Boolean,
  indeterminate: Boolean,
  focused: Boolean,
  colors: ResolvedCheckboxColors,
  focusColor: Color,
) {
  Canvas(
    modifier =
    Modifier
      .padding(vertical = MehTheme.spacing.spacing01)
      .size(IconSize.Small.dp),
  ) {
    drawCheckbox(
      checked = checked,
      indeterminate = indeterminate,
      focused = focused,
      colors = colors,
      focusColor = focusColor,
    )
  }
}

private fun DrawScope.drawCheckbox(
  checked: Boolean,
  indeterminate: Boolean,
  focused: Boolean,
  colors: ResolvedCheckboxColors,
  focusColor: Color,
) {
  val cornerPx = Spacing.spacing01.toPx()

  if (focused) {
    val strokePx = 2.dp.toPx()
    val gapPx = 1.dp.toPx()
    val outset = gapPx + strokePx / 2f
    val focusRadius = cornerPx + outset
    drawRoundRect(
      color = focusColor,
      topLeft = Offset(-outset, -outset),
      size = Size(size.width + outset * 2f, size.height + outset * 2f),
      cornerRadius = CornerRadius(focusRadius, focusRadius),
      style = Stroke(width = strokePx),
    )
  }

  if (colors.container != Color.Transparent) {
    drawRoundRect(
      color = colors.container,
      cornerRadius = CornerRadius(cornerPx, cornerPx),
    )
  }

  if (colors.border != Color.Transparent) {
    val borderPx = 1.dp.toPx()
    val halfBorder = borderPx / 2f
    val innerRadius = (cornerPx - halfBorder).coerceAtLeast(0f)
    drawRoundRect(
      color = colors.border,
      topLeft = Offset(halfBorder, halfBorder),
      size = Size(size.width - borderPx, size.height - borderPx),
      cornerRadius = CornerRadius(innerRadius, innerRadius),
      style = Stroke(width = borderPx),
    )
  }

  if (indeterminate) {
    val barWidth = Spacing.spacing03.toPx()
    val barHeight = Spacing.spacing01.toPx()
    drawRect(
      color = colors.glyph,
      topLeft = Offset((size.width - barWidth) / 2f, (size.height - barHeight) / 2f),
      size = Size(barWidth, barHeight),
    )
  } else if (checked) {
    val path =
      Path().apply {
        moveTo(3.5.dp.toPx(), 8.1.dp.toPx())
        lineTo(6.6.dp.toPx(), 11.1.dp.toPx())
        lineTo(12.4.dp.toPx(), 5.3.dp.toPx())
      }
    drawPath(
      path = path,
      color = colors.glyph,
      style = Stroke(
        width = 1.5.dp.toPx(),
        cap = StrokeCap.Butt,
        join = StrokeJoin.Miter,
      ),
    )
  }
}

@Composable
private fun CheckboxMessage(
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
        WarningAltIcon(tint = colors.supportWarning)
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
private fun WarningAltIcon(tint: Color) {
  Box(
    modifier =
    Modifier
      .size(IconSize.Small.dp)
      .drawBehind {
        // Fill the inner exclamation cutout of WarningAltFilled with black per Carbon spec.
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

private fun resolveCheckboxColors(
  colors: Colors,
  selected: Boolean,
  enabled: Boolean,
  readOnly: Boolean,
  invalid: Boolean,
): ResolvedCheckboxColors = when {
  !enabled ->
    ResolvedCheckboxColors(
      container = if (selected) colors.iconDisabled else Color.Transparent,
      border = if (selected) Color.Transparent else colors.iconDisabled,
      glyph = if (selected) colors.iconInverse else Color.Transparent,
      label = colors.textDisabled,
    )

  readOnly ->
    ResolvedCheckboxColors(
      container = Color.Transparent,
      border = colors.iconDisabled,
      glyph = if (selected) colors.iconPrimary else Color.Transparent,
      label = colors.textPrimary,
    )

  invalid ->
    ResolvedCheckboxColors(
      container = if (selected) colors.iconPrimary else Color.Transparent,
      border = colors.supportError,
      glyph = if (selected) colors.iconInverse else Color.Transparent,
      label = colors.textPrimary,
    )

  else ->
    ResolvedCheckboxColors(
      container = if (selected) colors.iconPrimary else Color.Transparent,
      border = if (selected) Color.Transparent else colors.iconPrimary,
      glyph = if (selected) colors.iconInverse else Color.Transparent,
      label = colors.textPrimary,
    )
}
