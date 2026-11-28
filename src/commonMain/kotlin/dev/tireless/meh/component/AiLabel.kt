// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.blue40
import dev.tireless.meh.theme.blue50
import dev.tireless.meh.theme.blue60

enum class AiLabelKind {
  Default,
  Inline,
}

enum class AiLabelSize(
  val dp: Dp,
  val fontSize: TextUnit,
  val inlineDp: Dp,
  val inlineFontSize: TextUnit,
) {
  Mini(dp = 16.dp, fontSize = 9.sp, inlineDp = 16.dp, inlineFontSize = 12.sp),
  XXSmall(dp = 20.dp, fontSize = 12.sp, inlineDp = 16.dp, inlineFontSize = 12.sp),
  XSmall(dp = 24.dp, fontSize = 12.sp, inlineDp = 16.dp, inlineFontSize = 12.sp),
  Small(dp = 32.dp, fontSize = 16.sp, inlineDp = 16.dp, inlineFontSize = 12.sp),
  Medium(dp = 40.dp, fontSize = 16.sp, inlineDp = 18.dp, inlineFontSize = 14.sp),
  Large(dp = 48.dp, fontSize = 16.sp, inlineDp = 22.dp, inlineFontSize = 16.sp),
  XLarge(dp = 64.dp, fontSize = 20.sp, inlineDp = 22.dp, inlineFontSize = 16.sp),
}

object AiLabelDefaults {
  val CalloutWidth: Dp = 288.dp
  val CalloutActionsHeight: Dp = 48.dp
  val CalloutShadowElevation: Dp = 6.dp
}

/**
 * Carbon Design System v11 AI label trigger button (Default square or Inline variant, plus
 * optional Revert-to-AI state).
 */
@Composable
fun AiLabelTrigger(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  kind: AiLabelKind = AiLabelKind.Default,
  size: AiLabelSize = AiLabelSize.XSmall,
  aiText: String = "AI",
  textLabel: String? = null,
  revertActive: Boolean = false,
  onRevertClick: (() -> Unit)? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val colors = MehTheme.colors
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  if (revertActive) {
    val buttonSize = if (kind == AiLabelKind.Inline) size.inlineDp.coerceAtLeast(24.dp) else size.dp
    Box(
      modifier = modifier
        .size(buttonSize)
        .background(if (hovered) colors.backgroundHover else Color.Transparent)
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
        .semantics { contentDescription = "Revert to AI input" }
        .clickable(
          interactionSource = interactionSource,
          indication = null,
          role = Role.Button,
          onClick = { onRevertClick?.invoke() ?: onClick() },
        ),
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = Icons.Undo,
        size = if (size == AiLabelSize.Mini) IconSize.XSmall else IconSize.Small,
        tint = colors.iconPrimary,
      )
    }
    return
  }

  when (kind) {
    AiLabelKind.Default -> {
      val containerBg = if (hovered) colors.backgroundInverse else Color.Transparent
      val textColor = if (hovered) colors.textInverse else colors.textPrimary
      val auraBrush =
        remember(hovered) {
          if (hovered) {
            null
          } else {
            Brush.verticalGradient(
              colors = listOf(
                blue50.copy(alpha = 0.08f),
                blue50.copy(alpha = 0.22f),
              ),
            )
          }
        }

      Box(
        modifier = modifier
          .size(size.dp)
          .background(containerBg)
          .then(if (auraBrush != null) Modifier.background(auraBrush) else Modifier)
          .border(width = 1.dp, color = colors.borderInverse)
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
          .semantics { contentDescription = "$aiText - Show information" }
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            role = Role.Button,
            onClick = onClick,
          ),
        contentAlignment = Alignment.Center,
      ) {
        BasicText(
          text = aiText,
          style = TextStyle(
            fontFamily = MehTheme.fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = size.fontSize,
            lineHeight = size.fontSize,
            color = textColor,
          ),
          maxLines = 1,
        )
      }
    }

    AiLabelKind.Inline -> {
      val spacing = MehTheme.spacing
      Row(
        modifier = modifier
          .defaultMinSize(minHeight = size.inlineDp)
          .background(if (hovered) colors.backgroundHover else Color.Transparent)
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
          .semantics { contentDescription = "$aiText - Show information" }
          .clickable(
            interactionSource = interactionSource,
            indication = null,
            role = Role.Button,
            onClick = onClick,
          )
          .padding(horizontal = spacing.spacing02),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        BasicText(
          text = aiText,
          style = TextStyle(
            fontFamily = MehTheme.fontFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = size.inlineFontSize,
            lineHeight = size.inlineFontSize,
            color = colors.textPrimary,
          ),
          maxLines = 1,
        )
        if (textLabel != null) {
          Spacer(modifier = Modifier.width(spacing.spacing02))
          Box(
            modifier = Modifier
              .size(3.dp)
              .clip(CircleShape)
              .background(colors.iconPrimary),
          )
          Spacer(modifier = Modifier.width(spacing.spacing02))
          BasicText(
            text = textLabel,
            style = TextStyle(
              fontFamily = MehTheme.fontFamily,
              fontWeight = FontWeight.Normal,
              fontSize = size.inlineFontSize,
              lineHeight = size.inlineFontSize,
              color = colors.textPrimary,
            ),
            maxLines = 1,
          )
        }
      }
    }
  }
}

/**
 * Styled Carbon Design System v11 AI Explainability callout surface with AI aura gradient,
 * vertical blue gradient border, and optional footer [actions] bar.
 */
@Composable
fun AiLabelCallout(
  modifier: Modifier = Modifier,
  width: Dp = AiLabelDefaults.CalloutWidth,
  actions: (@Composable RowScope.() -> Unit)? = null,
  content: @Composable ColumnScope.() -> Unit,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  val auraGradient =
    remember(colors.background) {
      Brush.verticalGradient(
        colors = listOf(
          blue50.copy(alpha = 0.14f),
          Color.Transparent,
        ),
      )
    }
  val borderGradient =
    remember {
      Brush.verticalGradient(
        colors = listOf(
          blue40.copy(alpha = 0.64f),
          blue60,
        ),
      )
    }

  Column(
    modifier = modifier
      .widthIn(max = width)
      .width(width)
      .shadow(
        elevation = AiLabelDefaults.CalloutShadowElevation,
        shape = RectangleShape,
        ambientColor = blue60.copy(alpha = 0.25f),
        spotColor = blue60.copy(alpha = 0.25f),
      )
      .background(colors.background)
      .background(auraGradient)
      .border(width = 1.dp, brush = borderGradient, shape = RectangleShape),
  ) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(spacing.spacing05),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
      content = content,
    )

    if (actions != null) {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .height(AiLabelDefaults.CalloutActionsHeight)
          .background(colors.layer01)
          .padding(horizontal = spacing.spacing03),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
        content = actions,
      )
    }
  }
}

/**
 * Carbon Design System v11 AI label with interactive explainability popover callout.
 */
@Composable
fun AiLabel(
  modifier: Modifier = Modifier,
  kind: AiLabelKind = AiLabelKind.Default,
  size: AiLabelSize = AiLabelSize.XSmall,
  aiText: String = "AI",
  textLabel: String? = null,
  revertActive: Boolean = false,
  onRevertClick: (() -> Unit)? = null,
  expanded: Boolean? = null,
  onExpandedChange: ((Boolean) -> Unit)? = null,
  align: PopoverAlign = PopoverAlign.BottomStart,
  autoAlign: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  actions: (@Composable RowScope.() -> Unit)? = null,
  calloutContent: (@Composable ColumnScope.() -> Unit)? = null,
) {
  var internalExpanded by remember { mutableStateOf(false) }
  val isExpanded = if (revertActive) false else (expanded ?: internalExpanded)
  val setExpanded: (Boolean) -> Unit = { next ->
    internalExpanded = next
    onExpandedChange?.invoke(next)
  }

  Popover(
    expanded = isExpanded && calloutContent != null,
    onDismissRequest = { setExpanded(false) },
    modifier = modifier,
    align = align,
    autoAlign = autoAlign,
    caret = false,
    dropShadow = false,
    highContrast = false,
    border = false,
    tabTip = true,
    contentPadding = PaddingValues(0.dp),
    maxWidth = AiLabelDefaults.CalloutWidth,
    properties = PopupProperties(focusable = true),
    trigger = {
      AiLabelTrigger(
        onClick = { if (calloutContent != null) setExpanded(!isExpanded) },
        kind = kind,
        size = size,
        aiText = aiText,
        textLabel = textLabel,
        revertActive = revertActive,
        onRevertClick = onRevertClick,
        interactionSource = interactionSource,
      )
    },
  ) {
    if (calloutContent != null) {
      AiLabelCallout(
        actions = actions,
        content = calloutContent,
      )
    }
  }
}
