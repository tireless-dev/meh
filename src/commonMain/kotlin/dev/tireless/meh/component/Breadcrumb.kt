// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.BreadcrumbSize
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

@DslMarker
annotation class BreadcrumbDsl

internal sealed interface BreadcrumbEntry {
  data class LinkItem(
    val text: String,
    val onClick: (() -> Unit)?,
    val isCurrentPage: Boolean,
    val interactionSource: MutableInteractionSource?,
  ) : BreadcrumbEntry

  data class OverflowItem(
    val items: List<String>,
    val onItemClick: (Int) -> Unit,
    val interactionSource: MutableInteractionSource?,
  ) : BreadcrumbEntry
}

@BreadcrumbDsl
class BreadcrumbScope internal constructor() {
  internal val entries = mutableListOf<BreadcrumbEntry>()

  fun item(
    text: String,
    onClick: (() -> Unit)? = null,
    isCurrentPage: Boolean = false,
    interactionSource: MutableInteractionSource? = null,
  ) {
    entries += BreadcrumbEntry.LinkItem(
      text = text,
      onClick = onClick,
      isCurrentPage = isCurrentPage,
      interactionSource = interactionSource,
    )
  }

  fun overflow(
    items: List<String>,
    onItemClick: (Int) -> Unit,
    interactionSource: MutableInteractionSource? = null,
  ) {
    entries += BreadcrumbEntry.OverflowItem(
      items = items,
      onItemClick = onItemClick,
      interactionSource = interactionSource,
    )
  }
}

@Composable
fun Breadcrumb(
  items: List<String>,
  onItemClick: (Int) -> Unit,
  modifier: Modifier = Modifier,
  size: BreadcrumbSize = BreadcrumbSize.Medium,
  noTrailingSlash: Boolean = true,
) {
  Breadcrumb(
    modifier = modifier,
    size = size,
    noTrailingSlash = noTrailingSlash,
  ) {
    items.forEachIndexed { index, title ->
      val isLast = index == items.lastIndex
      item(
        text = title,
        onClick = if (isLast && noTrailingSlash) null else ({ onItemClick(index) }),
        isCurrentPage = isLast && noTrailingSlash,
      )
    }
  }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Breadcrumb(
  modifier: Modifier = Modifier,
  size: BreadcrumbSize = BreadcrumbSize.Medium,
  noTrailingSlash: Boolean = false,
  content: BreadcrumbScope.() -> Unit,
) {
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val colors = MehTheme.colors

  val scope = BreadcrumbScope().apply(content)
  val itemGap = if (size == BreadcrumbSize.Small) spacing.spacing02 else spacing.spacing03
  val textStyle = if (size == BreadcrumbSize.Small) typography.label01 else typography.bodyCompact01

  FlowRow(
    modifier =
    modifier.semantics {
      contentDescription = "Breadcrumb"
    },
    horizontalArrangement = Arrangement.spacedBy(itemGap),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing02),
  ) {
    scope.entries.forEachIndexed { index, entry ->
      val isLast = index == scope.entries.lastIndex
      val showSlash = !isLast || !noTrailingSlash

      Row(verticalAlignment = Alignment.CenterVertically) {
        when (entry) {
          is BreadcrumbEntry.LinkItem -> {
            BreadcrumbLinkItem(
              text = entry.text,
              size = size,
              isCurrentPage = entry.isCurrentPage,
              onClick = entry.onClick,
              interactionSource = entry.interactionSource ?: remember { MutableInteractionSource() },
            )
          }

          is BreadcrumbEntry.OverflowItem -> {
            BreadcrumbOverflowItem(
              items = entry.items,
              size = size,
              onItemClick = entry.onItemClick,
              interactionSource = entry.interactionSource ?: remember { MutableInteractionSource() },
            )
          }
        }

        if (showSlash) {
          Spacer(modifier = Modifier.width(itemGap))
          BasicText(
            text = "/",
            style = textStyle.copy(color = colors.textPrimary),
          )
        }
      }
    }
  }
}

@Composable
private fun BreadcrumbLinkItem(
  text: String,
  size: BreadcrumbSize,
  isCurrentPage: Boolean,
  onClick: (() -> Unit)?,
  interactionSource: MutableInteractionSource,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val interactive = !isCurrentPage && onClick != null
  val textStyle = if (size == BreadcrumbSize.Small) typography.label01 else typography.bodyCompact01
  val textColor =
    when {
      isCurrentPage || onClick == null -> colors.textPrimary
      pressed -> colors.textPrimary
      hovered -> colors.linkPrimaryHover
      else -> colors.linkPrimary
    }
  val underline = interactive && (hovered || focused || pressed)
  val showOutline = interactive && (focused || pressed)
  val focusColor = colors.focus

  val outlineModifier =
    if (showOutline) {
      Modifier.drawBehind {
        val strokeWidth = 1.dp.toPx()
        val halfStroke = strokeWidth / 2f
        drawRect(
          color = focusColor,
          topLeft = Offset(halfStroke, halfStroke),
          size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
          style = Stroke(width = strokeWidth),
        )
      }
    } else {
      Modifier
    }

  val minWidthModifier =
    if (size == BreadcrumbSize.Small) {
      Modifier.defaultMinSize(minWidth = spacing.spacing04)
    } else {
      Modifier
    }

  Box(
    modifier =
    minWidthModifier
      .then(outlineModifier)
      .then(
        if (interactive) {
          Modifier.clickable(
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick,
          )
        } else {
          Modifier
        },
      ),
    contentAlignment = Alignment.Center,
  ) {
    BasicText(
      text = text,
      maxLines = 1,
      style =
      textStyle.copy(
        color = textColor,
        textDecoration = if (underline) TextDecoration.Underline else TextDecoration.None,
      ),
    )
  }
}

@Composable
private fun BreadcrumbOverflowItem(
  items: List<String>,
  size: BreadcrumbSize,
  onItemClick: (Int) -> Unit,
  interactionSource: MutableInteractionSource,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  var expanded by remember { mutableStateOf(false) }
  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val iconColor =
    when {
      pressed -> colors.iconPrimary
      hovered -> colors.linkPrimaryHover
      else -> colors.linkPrimary
    }
  val underlineColor =
    when {
      pressed -> colors.textPrimary
      hovered -> colors.linkPrimaryHover
      focused -> colors.focus
      else -> null
    }
  val showOutline = focused || pressed
  val focusColor = colors.focus

  Box {
    Box(
      modifier =
      Modifier
        .size(width = spacing.spacing05, height = size.dp)
        .drawBehind {
          if (showOutline) {
            val strokeWidth = 1.dp.toPx()
            val halfStroke = strokeWidth / 2f
            drawRect(
              color = focusColor,
              topLeft = Offset(halfStroke, halfStroke),
              size = Size(this.size.width - strokeWidth, this.size.height - strokeWidth),
              style = Stroke(width = strokeWidth),
            )
          }
          if (underlineColor != null) {
            val lineWidth = 12.dp.toPx()
            val lineHeight = 1.dp.toPx()
            val startX = (this.size.width - lineWidth) / 2f
            val topY = this.size.height - 2.dp.toPx() - lineHeight
            drawRect(
              color = underlineColor,
              topLeft = Offset(startX, topY),
              size = Size(lineWidth, lineHeight),
            )
          }
        }
        .clickable(
          interactionSource = interactionSource,
          indication = null,
          onClick = { expanded = !expanded },
        )
        .semantics {
          contentDescription = "Options"
        },
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = Icons.OverflowMenuHorizontal,
        size = IconSize.Small,
        tint = iconColor,
        modifier = Modifier.offset(y = if (size == BreadcrumbSize.Small) 3.dp else 4.dp),
      )
    }

    if (expanded) {
      Popup(
        alignment = Alignment.TopStart,
        onDismissRequest = { expanded = false },
        properties = PopupProperties(focusable = true),
      ) {
        Column(
          modifier =
          Modifier
            .padding(top = size.dp + spacing.spacing02)
            .shadow(elevation = 4.dp)
            .background(colors.layer01)
            .width(160.dp),
        ) {
          items.forEachIndexed { index, label ->
            val rowInteraction = remember { MutableInteractionSource() }
            val rowHovered by rowInteraction.collectIsHoveredAsState()
            Box(
              modifier =
              Modifier
                .height(ControlSize.Medium.dp)
                .background(if (rowHovered) colors.layerHover01 else colors.layer01)
                .clickable(
                  interactionSource = rowInteraction,
                  indication = null,
                  onClick = {
                    expanded = false
                    onItemClick(index)
                  },
                )
                .padding(horizontal = spacing.spacing05),
              contentAlignment = Alignment.CenterStart,
            ) {
              BasicText(
                text = label,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = typography.bodyCompact01.copy(color = colors.textPrimary),
              )
            }
          }
        }
      }
    }
  }
}
