// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme

enum class CodeSnippetVariant {
  Single,
  Inline,
  Multiline,
}

object CodeSnippetDefaults {
  val MaxWidth: Dp = 768.dp
  val SingleLineHeight: Dp = 40.dp
  val InlineCornerRadius: Dp = 2.dp
  val DefaultMaxCollapsedLines: Int = 15
}

/**
 * Carbon Design System v11 Code snippet supporting Single-line, Inline, and expandable Multi-line
 * variants with `$code-01` monospace typography and copy action.
 */
@Composable
fun CodeSnippet(
  code: String,
  modifier: Modifier = Modifier,
  variant: CodeSnippetVariant = CodeSnippetVariant.Single,
  onCopyClick: (() -> Unit)? = null,
  hideCopyButton: Boolean = false,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  maxCollapsedLines: Int = CodeSnippetDefaults.DefaultMaxCollapsedLines,
  showMoreText: String = "Show more",
  showLessText: String = "Show less",
  copyButtonDescription: String = "Copy to clipboard",
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  when (variant) {
    CodeSnippetVariant.Inline -> InlineCodeSnippet(
      code = code,
      onCopyClick = onCopyClick,
      modifier = modifier,
      interactionSource = interactionSource,
    )

    CodeSnippetVariant.Single -> SingleLineCodeSnippet(
      code = code,
      onCopyClick = if (hideCopyButton) null else onCopyClick,
      copyButtonDescription = copyButtonDescription,
      modifier = modifier,
    )

    CodeSnippetVariant.Multiline -> MultilineCodeSnippet(
      code = code,
      onCopyClick = if (hideCopyButton) null else onCopyClick,
      expanded = expanded,
      onExpandedChange = onExpandedChange,
      maxCollapsedLines = maxCollapsedLines,
      showMoreText = showMoreText,
      showLessText = showLessText,
      copyButtonDescription = copyButtonDescription,
      modifier = modifier,
    )
  }
}

@Composable
private fun InlineCodeSnippet(
  code: String,
  onCopyClick: (() -> Unit)?,
  modifier: Modifier = Modifier,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val shape = RoundedCornerShape(CodeSnippetDefaults.InlineCornerRadius)

  Box(
    modifier = modifier
      .clip(shape)
      .background(if (hovered && onCopyClick != null) colors.layerHover01 else colors.layer01)
      .drawBehind {
        if (focused && onCopyClick != null) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .then(
        if (onCopyClick != null) {
          Modifier.clickable(
            interactionSource = interactionSource,
            indication = null,
            role = Role.Button,
            onClick = onCopyClick,
          )
        } else {
          Modifier
        },
      )
      .padding(horizontal = spacing.spacing03, vertical = spacing.spacing01),
    contentAlignment = Alignment.Center,
  ) {
    BasicText(
      text = code,
      style = MehTheme.typography.code01.copy(color = colors.textPrimary),
      maxLines = 1,
    )
  }
}

@Composable
private fun SingleLineCodeSnippet(
  code: String,
  onCopyClick: (() -> Unit)?,
  copyButtonDescription: String,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val scrollState = rememberScrollState()

  Row(
    modifier = modifier
      .fillMaxWidth()
      .widthIn(max = CodeSnippetDefaults.MaxWidth)
      .height(CodeSnippetDefaults.SingleLineHeight)
      .background(colors.layer01),
    verticalAlignment = Alignment.CenterVertically,
  ) {
    Box(
      modifier = Modifier
        .weight(1f)
        .horizontalScroll(scrollState)
        .padding(
          start = spacing.spacing05,
          end = if (onCopyClick != null) spacing.spacing03 else spacing.spacing05,
        ),
      contentAlignment = Alignment.CenterStart,
    ) {
      BasicText(
        text = code,
        style = MehTheme.typography.code01.copy(color = colors.textPrimary),
        maxLines = 1,
      )
    }

    if (onCopyClick != null) {
      SnippetCopyButton(
        onClick = onCopyClick,
        contentDescription = copyButtonDescription,
        buttonSize = CodeSnippetDefaults.SingleLineHeight,
      )
    }
  }
}

@Composable
private fun MultilineCodeSnippet(
  code: String,
  onCopyClick: (() -> Unit)?,
  expanded: Boolean?,
  onExpandedChange: ((Boolean) -> Unit)?,
  maxCollapsedLines: Int,
  showMoreText: String,
  showLessText: String,
  copyButtonDescription: String,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val lines = remember(code) { code.lines() }
  val canExpand = lines.size > maxCollapsedLines
  var internalExpanded by remember { mutableStateOf(false) }
  val isExpanded = expanded ?: internalExpanded
  val displayCode =
    if (canExpand && !isExpanded) {
      lines.take(maxCollapsedLines).joinToString("\n")
    } else {
      code
    }

  Box(
    modifier = modifier
      .fillMaxWidth()
      .widthIn(max = CodeSnippetDefaults.MaxWidth)
      .background(colors.layer01),
  ) {
    Column(modifier = Modifier.fillMaxWidth()) {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(
            start = spacing.spacing05,
            top = spacing.spacing05,
            end = if (onCopyClick != null) spacing.spacing09 else spacing.spacing05,
            bottom = if (canExpand) spacing.spacing03 else spacing.spacing05,
          ),
      ) {
        BasicText(
          text = displayCode,
          style = MehTheme.typography.code01.copy(color = colors.textPrimary),
        )
      }

      if (canExpand) {
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .padding(end = spacing.spacing03, bottom = spacing.spacing03),
          horizontalArrangement = Arrangement.End,
        ) {
          val toggleInteractionSource = remember { MutableInteractionSource() }
          val toggleHovered by toggleInteractionSource.collectIsHoveredAsState()

          Row(
            modifier = Modifier
              .height(32.dp)
              .background(if (toggleHovered) colors.layerHover01 else Color.Transparent)
              .clickable(
                interactionSource = toggleInteractionSource,
                indication = null,
                role = Role.Button,
                onClick = {
                  val next = !isExpanded
                  internalExpanded = next
                  onExpandedChange?.invoke(next)
                },
              )
              .padding(horizontal = spacing.spacing04),
            verticalAlignment = Alignment.CenterVertically,
          ) {
            BasicText(
              text = if (isExpanded) showLessText else showMoreText,
              style = MehTheme.typography.bodyCompact01.copy(color = colors.textPrimary),
            )
            Spacer(modifier = Modifier.width(spacing.spacing03))
            Icon(
              image = Icons.ChevronDown,
              size = IconSize.Small,
              tint = colors.iconPrimary,
              modifier = Modifier.rotate(if (isExpanded) 180f else 0f),
            )
          }
        }
      }
    }

    if (onCopyClick != null) {
      SnippetCopyButton(
        onClick = onCopyClick,
        contentDescription = copyButtonDescription,
        buttonSize = 32.dp,
        modifier = Modifier
          .align(Alignment.TopEnd)
          .padding(spacing.spacing03),
      )
    }
  }
}

@Composable
private fun SnippetCopyButton(
  onClick: () -> Unit,
  contentDescription: String,
  buttonSize: Dp,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  Box(
    modifier = modifier
      .size(buttonSize)
      .background(if (hovered) colors.layerHover01 else Color.Transparent)
      .drawBehind {
        if (focused) {
          val strokeWidth = 2.dp.toPx()
          val half = strokeWidth / 2f
          drawRect(
            color = colors.focus,
            topLeft = Offset(half, half),
            size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
            style = Stroke(width = strokeWidth),
          )
        }
      }
      .semantics { this.contentDescription = contentDescription }
      .clickable(
        interactionSource = interactionSource,
        indication = null,
        role = Role.Button,
        onClick = onClick,
      ),
    contentAlignment = Alignment.Center,
  ) {
    Icon(
      image = Icons.Copy,
      size = IconSize.Small,
      tint = colors.iconPrimary,
    )
  }
}
