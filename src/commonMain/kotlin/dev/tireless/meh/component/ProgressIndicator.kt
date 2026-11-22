// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
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
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

@DslMarker
annotation class ProgressIndicatorDsl

internal data class ProgressStepEntry(
  val label: String,
  val secondaryLabel: String?,
  val complete: Boolean?,
  val invalid: Boolean,
  val enabled: Boolean,
  val description: String?,
  val interactionSource: MutableInteractionSource?,
)

@ProgressIndicatorDsl
class ProgressIndicatorScope internal constructor() {
  internal val steps = mutableListOf<ProgressStepEntry>()

  fun step(
    label: String,
    secondaryLabel: String? = null,
    complete: Boolean? = null,
    invalid: Boolean = false,
    enabled: Boolean = true,
    description: String? = null,
    interactionSource: MutableInteractionSource? = null,
  ) {
    steps += ProgressStepEntry(
      label = label,
      secondaryLabel = secondaryLabel,
      complete = complete,
      invalid = invalid,
      enabled = enabled,
      description = description,
      interactionSource = interactionSource,
    )
  }
}

@Immutable
private data class ResolvedProgressStepColors(
  val line: Color,
  val icon: Color,
  val label: Color,
  val underline: Color?,
  val focusOutline: Color?,
)

@Composable
fun ProgressIndicator(
  currentIndex: Int,
  steps: List<String>,
  modifier: Modifier = Modifier,
  onStepClick: ((Int) -> Unit)? = null,
  vertical: Boolean = false,
  spaceEqually: Boolean = false,
) {
  ProgressIndicator(
    currentIndex = currentIndex,
    modifier = modifier,
    onStepClick = onStepClick,
    vertical = vertical,
    spaceEqually = spaceEqually,
  ) {
    steps.forEach { label ->
      step(label = label)
    }
  }
}

@Composable
fun ProgressIndicator(
  currentIndex: Int,
  modifier: Modifier = Modifier,
  onStepClick: ((Int) -> Unit)? = null,
  vertical: Boolean = false,
  spaceEqually: Boolean = false,
  content: ProgressIndicatorScope.() -> Unit,
) {
  val scope = ProgressIndicatorScope().apply(content)

  if (vertical) {
    Column(modifier = modifier) {
      scope.steps.forEachIndexed { index, entry ->
        val isComplete =
          when {
            index < currentIndex -> true
            index == currentIndex -> entry.complete ?: false
            else -> entry.complete ?: false
          }
        val isCurrent = index == currentIndex && !isComplete

        ProgressStepItem(
          entry = entry,
          complete = isComplete,
          current = isCurrent,
          vertical = true,
          spaceEqually = false,
          onClick = onStepClick?.let { callback -> { callback(index) } },
          interactionSource = entry.interactionSource ?: remember { MutableInteractionSource() },
        )
      }
    }
  } else {
    Row(
      modifier = if (spaceEqually) modifier.fillMaxWidth() else modifier,
      verticalAlignment = Alignment.Top,
    ) {
      scope.steps.forEachIndexed { index, entry ->
        val isComplete =
          when {
            index < currentIndex -> true
            index == currentIndex -> entry.complete ?: false
            else -> entry.complete ?: false
          }
        val isCurrent = index == currentIndex && !isComplete

        ProgressStepItem(
          entry = entry,
          complete = isComplete,
          current = isCurrent,
          vertical = false,
          spaceEqually = spaceEqually,
          onClick = onStepClick?.let { callback -> { callback(index) } },
          interactionSource = entry.interactionSource ?: remember { MutableInteractionSource() },
          modifier = if (spaceEqually) Modifier.weight(1f) else Modifier,
        )
      }
    }
  }
}

@Composable
private fun ProgressStepItem(
  entry: ProgressStepEntry,
  complete: Boolean,
  current: Boolean,
  vertical: Boolean,
  spaceEqually: Boolean,
  onClick: (() -> Unit)?,
  interactionSource: MutableInteractionSource,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val clickable = onClick != null && entry.enabled && !current

  val resolvedColors =
    resolveProgressStepColors(
      colors = colors,
      complete = complete,
      current = current,
      invalid = entry.invalid,
      enabled = entry.enabled,
      clickable = clickable,
      hovered = hovered,
      focused = focused,
      pressed = pressed,
    )

  val icon =
    when {
      entry.invalid -> Icons.Warning
      current -> Icons.Incomplete
      complete -> Icons.CheckmarkOutline
      else -> Icons.CircleDash
    }

  val statusDescription =
    entry.description ?: when {
      entry.invalid -> "Invalid"
      current -> "Current"
      complete -> "Complete"
      else -> "Incomplete"
    }

  val stepLineModifier =
    Modifier.drawBehind {
      if (vertical) {
        drawRect(
          color = resolvedColors.line,
          topLeft = Offset.Zero,
          size = Size(width = 1.dp.toPx(), height = size.height),
        )
      } else {
        drawRect(
          color = resolvedColors.line,
          topLeft = Offset.Zero,
          size = Size(width = size.width, height = 2.dp.toPx()),
        )
      }
    }

  val interactionModifier =
    if (clickable) {
      Modifier.clickable(
        enabled = true,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = null,
        onClick = onClick,
      )
    } else {
      Modifier
    }

  val semanticsModifier =
    Modifier.semantics(mergeDescendants = true) {
      contentDescription =
        buildList {
          add(entry.label)
          if (!entry.secondaryLabel.isNullOrEmpty()) add(entry.secondaryLabel)
          add(statusDescription)
        }.joinToString(", ")
      if (!entry.enabled) {
        disabled()
      }
      if (entry.invalid) {
        error(statusDescription)
      }
    }

  val sizeModifier =
    when {
      vertical -> Modifier.defaultMinSize(minHeight = 58.dp)
      spaceEqually -> Modifier.defaultMinSize(minWidth = 128.dp)
      else -> Modifier.width(128.dp)
    }

  Row(
    modifier =
    modifier
      .then(sizeModifier)
      .then(stepLineModifier)
      .then(interactionModifier)
      .then(semanticsModifier)
      .padding(
        start = if (vertical) spacing.spacing03 else spacing.spacing00,
        top = if (vertical) spacing.spacing00 else spacing.spacing03,
        end = if (!vertical && spaceEqually) spacing.spacing04 else spacing.spacing00,
        bottom = if (vertical) spacing.spacing04 else spacing.spacing00,
      ),
    verticalAlignment = Alignment.Top,
  ) {
    Icon(
      image = icon,
      size = IconSize.Small,
      tint = resolvedColors.icon,
      modifier = Modifier.padding(top = if (vertical) 1.dp else 2.dp),
    )

    Spacer(modifier = Modifier.width(spacing.spacing03))

    Column {
      val labelModifier =
        Modifier
          .then(
            when {
              vertical -> Modifier.widthIn(max = 160.dp)
              spaceEqually -> Modifier
              else -> Modifier.widthIn(max = 88.dp)
            },
          )
          .drawBehind {
            val underline = resolvedColors.underline
            if (underline != null) {
              val stroke = 1.dp.toPx()
              drawRect(
                color = underline,
                topLeft = Offset(0f, size.height - stroke),
                size = Size(size.width, stroke),
              )
            }
            val focusOutline = resolvedColors.focusOutline
            if (focusOutline != null) {
              val stroke = 1.dp.toPx()
              val halfStroke = stroke / 2f
              drawRect(
                color = focusOutline,
                topLeft = Offset(halfStroke, halfStroke),
                size = Size(size.width - stroke, size.height - stroke),
                style = Stroke(width = stroke),
              )
            }
          }

      Box(modifier = labelModifier) {
        BasicText(
          text = entry.label,
          maxLines = if (vertical) Int.MAX_VALUE else 1,
          overflow = if (vertical) TextOverflow.Clip else TextOverflow.Ellipsis,
          style = typography.bodyCompact01.copy(color = resolvedColors.label),
        )
      }

      if (entry.secondaryLabel != null) {
        BasicText(
          text = entry.secondaryLabel,
          maxLines = if (vertical) Int.MAX_VALUE else 1,
          overflow = if (vertical) TextOverflow.Clip else TextOverflow.Ellipsis,
          style = typography.label01.copy(color = colors.textSecondary),
          modifier = Modifier.padding(top = spacing.spacing01),
        )
      }
    }
  }
}

private fun resolveProgressStepColors(
  colors: Colors,
  complete: Boolean,
  current: Boolean,
  invalid: Boolean,
  enabled: Boolean,
  clickable: Boolean,
  hovered: Boolean,
  focused: Boolean,
  pressed: Boolean,
): ResolvedProgressStepColors {
  val line = if (complete || current) colors.interactive else colors.borderSubtle01
  val icon =
    when {
      !enabled -> colors.iconDisabled
      invalid -> colors.supportError
      complete || current -> colors.interactive
      else -> colors.iconPrimary
    }
  val label =
    when {
      !enabled -> colors.textDisabled
      clickable && pressed -> colors.textPrimary
      clickable && focused -> colors.focus
      clickable && hovered -> colors.linkPrimaryHover
      else -> colors.textPrimary
    }
  val underline =
    when {
      !clickable -> null
      pressed -> colors.textPrimary
      hovered -> colors.linkPrimaryHover
      else -> null
    }
  val focusOutline = if (clickable && focused) colors.focus else null

  return ResolvedProgressStepColors(
    line = line,
    icon = icon,
    label = label,
    underline = underline,
    focusOutline = focusOutline,
  )
}
