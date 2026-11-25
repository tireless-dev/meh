// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.TabSize
import dev.tireless.meh.theme.dp
import kotlinx.coroutines.launch

enum class TabVariant {
  Line,
  Contained,
  Vertical,
}

@DslMarker
annotation class TabsDsl

internal data class TabEntry(
  val label: String?,
  val secondaryLabel: String?,
  val icon: ImageVector?,
  val enabled: Boolean,
  val dismissible: Boolean?,
  val onClose: (() -> Unit)?,
  val contentDescription: String?,
  val interactionSource: MutableInteractionSource?,
  val closeInteractionSource: MutableInteractionSource?,
  val content: (@Composable () -> Unit)?,
)

@TabsDsl
class TabsScope internal constructor() {
  internal val tabs = mutableListOf<TabEntry>()

  fun tab(
    label: String? = null,
    secondaryLabel: String? = null,
    icon: ImageVector? = null,
    enabled: Boolean = true,
    dismissible: Boolean? = null,
    onClose: (() -> Unit)? = null,
    contentDescription: String? = null,
    interactionSource: MutableInteractionSource? = null,
    closeInteractionSource: MutableInteractionSource? = null,
    content: (@Composable () -> Unit)? = null,
  ) {
    tabs += TabEntry(
      label = label,
      secondaryLabel = secondaryLabel,
      icon = icon,
      enabled = enabled,
      dismissible = dismissible,
      onClose = onClose,
      contentDescription = contentDescription,
      interactionSource = interactionSource,
      closeInteractionSource = closeInteractionSource,
      content = content,
    )
  }
}

@Immutable
private data class ResolvedTabColors(
  val background: Color,
  val label: Color,
  val secondaryLabel: Color,
  val icon: Color,
  val indicator: Color?,
  val divider: Color?,
  val endBorder: Color?,
  val bottomBorder: Color?,
  val focusOutline: Color?,
  val closeIcon: Color,
  val closeHoverBackground: Color,
)

@Composable
fun Tabs(
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  tabs: List<String>,
  modifier: Modifier = Modifier,
  variant: TabVariant = TabVariant.Line,
  size: TabSize? = null,
  fullWidth: Boolean = false,
) {
  Tabs(
    selectedIndex = selectedIndex,
    onTabSelect = onTabSelect,
    modifier = modifier,
    variant = variant,
    size = size,
    fullWidth = fullWidth,
  ) {
    tabs.forEach { title ->
      tab(label = title)
    }
  }
}

@Composable
fun Tabs(
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  modifier: Modifier = Modifier,
  variant: TabVariant = TabVariant.Line,
  size: TabSize? = null,
  fullWidth: Boolean = false,
  dismissible: Boolean = false,
  onTabClose: ((Int) -> Unit)? = null,
  content: TabsScope.() -> Unit,
) {
  val scope = TabsScope().apply(content)
  val entries = scope.tabs
  val hasSecondaryLabel = entries.any { !it.secondaryLabel.isNullOrEmpty() }
  val hasPanels = entries.any { it.content != null }

  val effectiveSize =
    size ?: when (variant) {
      TabVariant.Line -> TabSize.Medium
      TabVariant.Contained -> if (hasSecondaryLabel) TabSize.XLarge else TabSize.Large
      TabVariant.Vertical -> TabSize.XLarge
    }

  val selectedPanel = entries.getOrNull(selectedIndex)?.content

  if (variant == TabVariant.Vertical) {
    VerticalTabs(
      entries = entries,
      selectedIndex = selectedIndex,
      onTabSelect = onTabSelect,
      size = effectiveSize,
      dismissible = dismissible,
      onTabClose = onTabClose,
      hasPanels = hasPanels,
      selectedPanel = selectedPanel,
      modifier = modifier,
    )
  } else {
    HorizontalTabs(
      entries = entries,
      selectedIndex = selectedIndex,
      onTabSelect = onTabSelect,
      variant = variant,
      size = effectiveSize,
      fullWidth = fullWidth,
      dismissible = dismissible,
      onTabClose = onTabClose,
      hasPanels = hasPanels,
      selectedPanel = selectedPanel,
      modifier = modifier,
    )
  }
}

@Composable
private fun VerticalTabs(
  entries: List<TabEntry>,
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  size: TabSize,
  dismissible: Boolean,
  onTabClose: ((Int) -> Unit)?,
  hasPanels: Boolean,
  selectedPanel: (@Composable () -> Unit)?,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  val tabListModifier =
    Modifier
      .background(colors.layer01)
      .drawBehind {
        drawVerticalTabEdge(color = colors.borderSubtle01)
      }
      .selectableGroup()

  if (hasPanels) {
    Row(
      modifier = modifier
        .fillMaxWidth()
        .height(IntrinsicSize.Min),
    ) {
      Column(
        modifier = tabListModifier
          .width(192.dp)
          .fillMaxHeight(),
      ) {
        entries.forEachIndexed { index, entry ->
          TabItem(
            entry = entry,
            selected = index == selectedIndex,
            previousSelected = index > 0 && index - 1 == selectedIndex,
            index = index,
            variant = TabVariant.Vertical,
            size = size,
            boundedWidth = true,
            dismissible = entry.dismissible ?: dismissible,
            onClick = { onTabSelect(index) },
            onClose = entry.onClose ?: onTabClose?.let { callback -> { callback(index) } },
            interactionSource = entry.interactionSource ?: remember(index) { MutableInteractionSource() },
            closeInteractionSource = entry.closeInteractionSource ?: remember(index) { MutableInteractionSource() },
            modifier = Modifier.fillMaxWidth(),
          )
        }
      }
      Box(
        modifier = Modifier
          .weight(1f)
          .fillMaxHeight()
          .background(colors.layer01)
          .padding(spacing.spacing05),
      ) {
        selectedPanel?.invoke()
      }
    }
  } else {
    Column(modifier = modifier.then(tabListModifier)) {
      entries.forEachIndexed { index, entry ->
        TabItem(
          entry = entry,
          selected = index == selectedIndex,
          previousSelected = index > 0 && index - 1 == selectedIndex,
          index = index,
          variant = TabVariant.Vertical,
          size = size,
          boundedWidth = true,
          dismissible = entry.dismissible ?: dismissible,
          onClick = { onTabSelect(index) },
          onClose = entry.onClose ?: onTabClose?.let { callback -> { callback(index) } },
          interactionSource = entry.interactionSource ?: remember(index) { MutableInteractionSource() },
          closeInteractionSource = entry.closeInteractionSource ?: remember(index) { MutableInteractionSource() },
          modifier = Modifier.fillMaxWidth(),
        )
      }
    }
  }
}

@Composable
private fun HorizontalTabs(
  entries: List<TabEntry>,
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  variant: TabVariant,
  size: TabSize,
  fullWidth: Boolean,
  dismissible: Boolean,
  onTabClose: ((Int) -> Unit)?,
  hasPanels: Boolean,
  selectedPanel: (@Composable () -> Unit)?,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing

  if (hasPanels) {
    Column(modifier = modifier.fillMaxWidth()) {
      HorizontalTabBar(
        entries = entries,
        selectedIndex = selectedIndex,
        onTabSelect = onTabSelect,
        variant = variant,
        size = size,
        fullWidth = fullWidth,
        dismissible = dismissible,
        onTabClose = onTabClose,
      )
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .background(if (variant == TabVariant.Contained) colors.layer01 else Color.Transparent)
          .padding(spacing.spacing05),
      ) {
        selectedPanel?.invoke()
      }
    }
  } else {
    HorizontalTabBar(
      entries = entries,
      selectedIndex = selectedIndex,
      onTabSelect = onTabSelect,
      variant = variant,
      size = size,
      fullWidth = fullWidth,
      dismissible = dismissible,
      onTabClose = onTabClose,
      modifier = modifier,
    )
  }
}

@Composable
private fun HorizontalTabBar(
  entries: List<TabEntry>,
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  variant: TabVariant,
  size: TabSize,
  fullWidth: Boolean,
  dismissible: Boolean,
  onTabClose: ((Int) -> Unit)?,
  modifier: Modifier = Modifier,
) {
  if (fullWidth && variant == TabVariant.Contained) {
    Row(
      modifier = modifier
        .fillMaxWidth()
        .selectableGroup(),
    ) {
      entries.forEachIndexed { index, entry ->
        TabItem(
          entry = entry,
          selected = index == selectedIndex,
          previousSelected = index > 0 && index - 1 == selectedIndex,
          index = index,
          variant = variant,
          size = size,
          boundedWidth = true,
          dismissible = entry.dismissible ?: dismissible,
          onClick = { onTabSelect(index) },
          onClose = entry.onClose ?: onTabClose?.let { callback -> { callback(index) } },
          interactionSource = entry.interactionSource ?: remember(index) { MutableInteractionSource() },
          closeInteractionSource = entry.closeInteractionSource ?: remember(index) { MutableInteractionSource() },
          modifier = Modifier.weight(1f),
        )
      }
    }
  } else {
    ScrollableHorizontalTabBar(
      entries = entries,
      selectedIndex = selectedIndex,
      onTabSelect = onTabSelect,
      variant = variant,
      size = size,
      dismissible = dismissible,
      onTabClose = onTabClose,
      modifier = modifier,
    )
  }
}

@Composable
private fun ScrollableHorizontalTabBar(
  entries: List<TabEntry>,
  selectedIndex: Int,
  onTabSelect: (Int) -> Unit,
  variant: TabVariant,
  size: TabSize,
  dismissible: Boolean,
  onTabClose: ((Int) -> Unit)?,
  modifier: Modifier = Modifier,
) {
  val scrollState = rememberScrollState()
  val coroutineScope = rememberCoroutineScope()
  val scrollStepPx = with(LocalDensity.current) { 160.dp.roundToPx() }

  Box(modifier = modifier.fillMaxWidth()) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(scrollState)
        .selectableGroup(),
      horizontalArrangement = if (variant == TabVariant.Line) Arrangement.spacedBy(1.dp) else Arrangement.Start,
    ) {
      entries.forEachIndexed { index, entry ->
        TabItem(
          entry = entry,
          selected = index == selectedIndex,
          previousSelected = index > 0 && index - 1 == selectedIndex,
          index = index,
          variant = variant,
          size = size,
          boundedWidth = false,
          dismissible = entry.dismissible ?: dismissible,
          onClick = { onTabSelect(index) },
          onClose = entry.onClose ?: onTabClose?.let { callback -> { callback(index) } },
          interactionSource = entry.interactionSource ?: remember(index) { MutableInteractionSource() },
          closeInteractionSource = entry.closeInteractionSource ?: remember(index) { MutableInteractionSource() },
        )
      }
    }

    if (scrollState.canScrollBackward) {
      OverflowNavButton(
        direction = OverflowDirection.Previous,
        variant = variant,
        size = size,
        onClick = {
          coroutineScope.launch {
            scrollState.animateScrollTo((scrollState.value - scrollStepPx).coerceAtLeast(0))
          }
        },
        modifier = Modifier.align(Alignment.CenterStart),
      )
    }

    if (scrollState.canScrollForward) {
      OverflowNavButton(
        direction = OverflowDirection.Next,
        variant = variant,
        size = size,
        onClick = {
          coroutineScope.launch {
            scrollState.animateScrollTo((scrollState.value + scrollStepPx).coerceAtMost(scrollState.maxValue))
          }
        },
        modifier = Modifier.align(Alignment.CenterEnd),
      )
    }
  }
}

private enum class OverflowDirection {
  Previous,
  Next,
}

@Composable
private fun OverflowNavButton(
  direction: OverflowDirection,
  variant: TabVariant,
  size: TabSize,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val interactionSource = remember { MutableInteractionSource() }
  val hovered by interactionSource.collectIsHoveredAsState()
  val pressed by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()

  val isContained = variant == TabVariant.Contained
  val buttonWidth = if (isContained) spacing.spacing09 else spacing.spacing08
  val background =
    if (isContained) {
      when {
        pressed -> colors.layerAccentActive01
        hovered -> colors.layerAccentHover01
        else -> colors.layerAccent01
      }
    } else {
      when {
        pressed -> colors.backgroundActive
        hovered -> colors.backgroundHover
        else -> colors.background
      }
    }
  val iconTint =
    if (isContained && !hovered && !pressed) colors.iconSecondary else colors.iconPrimary

  val buttonContent: @Composable () -> Unit = {
    Box(
      modifier = Modifier
        .width(buttonWidth)
        .height(size.dp)
        .background(background)
        .drawWithContent {
          drawContent()
          if (isContained) {
            val stroke = 1.dp.toPx()
            val x = if (direction == OverflowDirection.Previous) this.size.width - stroke else 0f
            drawRect(
              color = colors.borderStrong01,
              topLeft = Offset(x, 0f),
              size = Size(stroke, this.size.height),
            )
          }
          if (focused) {
            drawTabFocusOutline(color = colors.focus)
          }
        }
        .clickable(
          role = Role.Button,
          interactionSource = interactionSource,
          indication = null,
          onClick = onClick,
        ),
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = if (direction == OverflowDirection.Previous) Icons.ChevronLeft else Icons.ChevronRight,
        size = IconSize.Small,
        tint = iconTint,
      )
    }
  }

  val fadeColor = if (isContained) colors.layerAccent01 else colors.background
  val gradientBrush =
    if (direction == OverflowDirection.Previous) {
      Brush.horizontalGradient(listOf(fadeColor, Color.Transparent))
    } else {
      Brush.horizontalGradient(listOf(Color.Transparent, fadeColor))
    }

  Row(modifier = modifier) {
    if (direction == OverflowDirection.Next) {
      Box(
        modifier = Modifier
          .width(spacing.spacing03)
          .height(size.dp)
          .background(gradientBrush),
      )
    }
    buttonContent()
    if (direction == OverflowDirection.Previous) {
      Box(
        modifier = Modifier
          .width(spacing.spacing03)
          .height(size.dp)
          .background(gradientBrush),
      )
    }
  }
}

@Composable
private fun TabItem(
  entry: TabEntry,
  selected: Boolean,
  previousSelected: Boolean,
  index: Int,
  variant: TabVariant,
  size: TabSize,
  boundedWidth: Boolean,
  dismissible: Boolean,
  onClick: () -> Unit,
  onClose: (() -> Unit)?,
  interactionSource: MutableInteractionSource,
  closeInteractionSource: MutableInteractionSource,
  modifier: Modifier = Modifier,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography

  val hovered by interactionSource.collectIsHoveredAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val pressed by interactionSource.collectIsPressedAsState()

  val closeHovered by closeInteractionSource.collectIsHoveredAsState()
  val closeFocused by closeInteractionSource.collectIsFocusedAsState()

  val effectiveHovered = hovered && entry.enabled
  val effectiveFocused = focused && entry.enabled
  val effectivePressed = pressed && entry.enabled
  val iconOnly = if (entry.label == null) entry.icon else null
  val isIconOnly = iconOnly != null
  val showClose = dismissible && !isIconOnly && variant != TabVariant.Vertical

  val resolvedColors =
    resolveTabColors(
      colors = colors,
      variant = variant,
      selected = selected,
      previousSelected = previousSelected,
      index = index,
      enabled = entry.enabled,
      hovered = effectiveHovered,
      focused = effectiveFocused,
      pressed = effectivePressed,
      closeHovered = closeHovered && entry.enabled,
    )

  val labelStyle =
    (if (selected) typography.headingCompact01 else typography.bodyCompact01).copy(
      color = resolvedColors.label,
    )
  val secondaryStyle = typography.label01.copy(color = resolvedColors.secondaryLabel)

  val sizeModifier =
    if (isIconOnly) {
      Modifier.size(size.dp)
    } else {
      Modifier.height(size.dp)
    }

  val semanticsModifier =
    Modifier.semantics {
      if (!entry.contentDescription.isNullOrEmpty()) {
        contentDescription = entry.contentDescription
      }
      if (!entry.enabled) {
        disabled()
      }
    }

  val iconOnlySize =
    if (size == TabSize.Large || size == TabSize.XLarge) IconSize.Expressive else IconSize.Small

  Row(
    modifier =
    modifier
      .then(sizeModifier)
      .background(resolvedColors.background)
      .drawWithContent {
        drawContent()
        drawTabDecorations(
          variant = variant,
          colors = resolvedColors,
        )
      }
      .selectable(
        selected = selected,
        enabled = entry.enabled,
        role = Role.Tab,
        interactionSource = interactionSource,
        indication = null,
        onClick = onClick,
      )
      .then(semanticsModifier)
      .then(
        if (isIconOnly) {
          Modifier
        } else {
          Modifier.padding(
            start = spacing.spacing05,
            end = if (showClose) spacing.spacing04 else spacing.spacing05,
          )
        },
      ),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = if (isIconOnly) Arrangement.Center else Arrangement.Start,
  ) {
    if (iconOnly != null) {
      Icon(
        image = iconOnly,
        size = iconOnlySize,
        tint = resolvedColors.icon,
      )
    } else {
      Column(
        modifier = if (boundedWidth) Modifier.weight(1f) else Modifier,
        verticalArrangement = Arrangement.Center,
      ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
          if (showClose && entry.icon != null) {
            Icon(
              image = entry.icon,
              size = IconSize.Small,
              tint = resolvedColors.icon,
            )
            Spacer(modifier = Modifier.width(spacing.spacing03))
          }

          if (entry.label != null) {
            BasicText(
              text = entry.label,
              maxLines = 1,
              overflow = TextOverflow.Ellipsis,
              style = labelStyle,
            )
          }

          if (!showClose && entry.icon != null) {
            Spacer(
              modifier = Modifier.width(
                if (variant == TabVariant.Contained) spacing.spacing05 else spacing.spacing03,
              ),
            )
            Icon(
              image = entry.icon,
              size = IconSize.Small,
              tint = resolvedColors.icon,
            )
          }
        }

        if (!entry.secondaryLabel.isNullOrEmpty() && variant != TabVariant.Line) {
          BasicText(
            text = entry.secondaryLabel,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = secondaryStyle,
            modifier = Modifier.padding(top = spacing.spacing01),
          )
        }
      }

      if (showClose) {
        Spacer(modifier = Modifier.width(spacing.spacing02))
        Box(
          modifier = Modifier
            .size(spacing.spacing06)
            .background(if (closeHovered && entry.enabled) resolvedColors.closeHoverBackground else Color.Transparent)
            .drawWithContent {
              drawContent()
              if (closeFocused && entry.enabled) {
                drawTabFocusOutline(color = colors.focus)
              }
            }
            .clickable(
              enabled = entry.enabled && onClose != null,
              role = Role.Button,
              interactionSource = closeInteractionSource,
              indication = null,
              onClick = { onClose?.invoke() },
            )
            .semantics {
              contentDescription = "Close ${entry.label.orEmpty()}".trim()
              if (!entry.enabled) {
                disabled()
              }
            },
          contentAlignment = Alignment.Center,
        ) {
          Icon(
            image = Icons.Close,
            size = IconSize.Small,
            tint = resolvedColors.closeIcon,
          )
        }
      }
    }
  }
}

private fun DrawScope.drawTabDecorations(
  variant: TabVariant,
  colors: ResolvedTabColors,
) {
  when (variant) {
    TabVariant.Line -> {
      val indicator = colors.indicator
      if (indicator != null) {
        val barHeight = 2.dp.toPx()
        drawRect(
          color = indicator,
          topLeft = Offset(0f, size.height - barHeight),
          size = Size(size.width, barHeight),
        )
      }
    }

    TabVariant.Contained -> {
      val divider = colors.divider
      if (divider != null) {
        val stroke = 1.dp.toPx()
        drawRect(
          color = divider,
          topLeft = Offset.Zero,
          size = Size(stroke, size.height),
        )
      }
      val indicator = colors.indicator
      if (indicator != null) {
        val barHeight = 2.dp.toPx()
        drawRect(
          color = indicator,
          topLeft = Offset.Zero,
          size = Size(size.width, barHeight),
        )
      }
    }

    TabVariant.Vertical -> {
      val indicator = colors.indicator
      if (indicator != null) {
        val barWidth = 3.dp.toPx()
        drawRect(
          color = indicator,
          topLeft = Offset.Zero,
          size = Size(barWidth, size.height),
        )
      }
      val bottomBorder = colors.bottomBorder
      if (bottomBorder != null) {
        val stroke = 1.dp.toPx()
        drawRect(
          color = bottomBorder,
          topLeft = Offset(0f, size.height - stroke),
          size = Size(size.width, stroke),
        )
      }
      val endBorder = colors.endBorder
      if (endBorder != null) {
        drawVerticalTabEdge(color = endBorder)
      }
    }
  }

  val focusOutline = colors.focusOutline
  if (focusOutline != null) {
    drawTabFocusOutline(color = focusOutline)
  }
}

private fun DrawScope.drawVerticalTabEdge(color: Color) {
  val stroke = 1.dp.toPx()
  drawRect(
    color = color,
    topLeft = Offset(size.width - stroke, 0f),
    size = Size(stroke, size.height),
  )
}

private fun DrawScope.drawTabFocusOutline(color: Color) {
  val strokeWidth = 2.dp.toPx()
  val halfStroke = strokeWidth / 2f
  drawRect(
    color = color,
    topLeft = Offset(halfStroke, halfStroke),
    size = Size(size.width - strokeWidth, size.height - strokeWidth),
    style = Stroke(width = strokeWidth),
  )
}

private fun resolveTabColors(
  colors: Colors,
  variant: TabVariant,
  selected: Boolean,
  previousSelected: Boolean,
  index: Int,
  enabled: Boolean,
  hovered: Boolean,
  focused: Boolean,
  pressed: Boolean,
  closeHovered: Boolean,
): ResolvedTabColors = when (variant) {
  TabVariant.Line -> {
    val indicator =
      when {
        !enabled -> colors.borderDisabled
        selected -> colors.borderInteractive
        hovered -> colors.borderStrong01
        else -> colors.borderSubtle01
      }
    val label =
      when {
        !enabled -> colors.textDisabled
        selected || hovered -> colors.textPrimary
        else -> colors.textSecondary
      }
    val icon =
      when {
        !enabled -> colors.iconDisabled
        selected || hovered -> colors.iconPrimary
        else -> colors.iconSecondary
      }
    val closeIcon =
      when {
        !enabled -> colors.iconDisabled
        selected || hovered || closeHovered -> colors.iconPrimary
        else -> colors.iconSecondary
      }
    ResolvedTabColors(
      background = Color.Transparent,
      label = label,
      secondaryLabel = label,
      icon = icon,
      indicator = indicator,
      divider = null,
      endBorder = null,
      bottomBorder = null,
      focusOutline = if (enabled && focused) colors.focus else null,
      closeIcon = closeIcon,
      closeHoverBackground = colors.backgroundHover,
    )
  }

  TabVariant.Contained -> {
    val background =
      when {
        !enabled -> colors.buttonDisabled
        selected -> colors.layer01
        pressed -> colors.layerAccentActive01
        hovered -> colors.layerAccentHover01
        else -> colors.layerAccent01
      }
    val label =
      when {
        !enabled -> colors.textOnColorDisabled
        selected || hovered -> colors.textPrimary
        else -> colors.textSecondary
      }
    val icon =
      when {
        !enabled -> colors.iconOnColorDisabled
        selected || hovered -> colors.iconPrimary
        else -> colors.iconSecondary
      }
    val closeIcon =
      when {
        !enabled -> colors.iconOnColorDisabled
        selected || hovered || closeHovered -> colors.iconPrimary
        else -> colors.iconSecondary
      }
    val divider = if (index > 0 && !selected && !previousSelected) colors.borderStrong01 else null
    ResolvedTabColors(
      background = background,
      label = label,
      secondaryLabel = label,
      icon = icon,
      indicator = if (selected && enabled) colors.borderInteractive else null,
      divider = divider,
      endBorder = null,
      bottomBorder = null,
      focusOutline = if (enabled && focused) colors.focus else null,
      closeIcon = closeIcon,
      closeHoverBackground = if (selected) colors.layerHover01 else colors.layerAccentHover01,
    )
  }

  TabVariant.Vertical -> {
    val background =
      when {
        !enabled -> colors.layer01
        selected -> colors.layer01
        pressed -> colors.layerActive01
        hovered -> colors.layerHover01
        else -> colors.layer01
      }
    val label =
      when {
        !enabled -> colors.textDisabled
        selected || hovered -> colors.textPrimary
        else -> colors.textSecondary
      }
    val icon =
      when {
        !enabled -> colors.iconDisabled
        selected || hovered -> colors.iconPrimary
        else -> colors.iconSecondary
      }
    val indicator =
      when {
        !enabled -> colors.borderSubtle01
        selected -> colors.borderInteractive
        hovered -> colors.borderStrong01
        else -> colors.borderSubtle01
      }
    ResolvedTabColors(
      background = background,
      label = label,
      secondaryLabel = label,
      icon = icon,
      indicator = indicator,
      divider = null,
      endBorder = if (selected && enabled) null else colors.borderSubtle01,
      bottomBorder = colors.borderSubtle01,
      focusOutline = if (enabled && focused) colors.focus else null,
      closeIcon = icon,
      closeHoverBackground = colors.layerHover01,
    )
  }
}
