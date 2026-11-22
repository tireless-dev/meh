// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ColorPair
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.Spacing
import dev.tireless.meh.theme.TagSize
import dev.tireless.meh.theme.dp

sealed interface OperationalTagType : TagType

sealed interface TagType {
  data object Gray : OperationalTagType
  data object CoolGray : OperationalTagType
  data object WarmGray : OperationalTagType
  data object Red : OperationalTagType
  data object Magenta : OperationalTagType
  data object Purple : OperationalTagType
  data object Blue : OperationalTagType
  data object Cyan : OperationalTagType
  data object Teal : OperationalTagType
  data object Green : OperationalTagType
  data object HighContrast : TagType
  data object Outline : TagType
}

private val TagCornerRadius = 16.dp
private val TagShape = RoundedCornerShape(TagCornerRadius)
private val TagMinWidth = Spacing.spacing07
private val TagMaxWidth = 208.dp

@Composable
fun Tag(
  text: String,
  modifier: Modifier = Modifier,
  type: TagType = TagType.Gray,
  size: TagSize = TagSize.Medium,
  enabled: Boolean = true,
  icon: ImageVector? = null,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val tagColors = resolveReadOnlyTagColors(
    type = type,
    colors = colors,
    enabled = enabled,
  )
  val showIcon = icon != null && size != TagSize.Small

  Row(
    modifier =
    modifier
      .widthIn(min = TagMinWidth, max = TagMaxWidth)
      .height(size.dp)
      .clip(TagShape)
      .background(tagColors.container)
      .then(
        if (tagColors.border != Color.Transparent) {
          Modifier.border(width = 1.dp, color = tagColors.border, shape = TagShape)
        } else {
          Modifier
        },
      )
      .then(
        if (!enabled) {
          Modifier.semantics { disabled() }
        } else {
          Modifier
        },
      )
      .padding(
        start = resolveTagStartPadding(size = size, hasIcon = showIcon, spacing = spacing),
        end = resolveTagEndPadding(size = size, spacing = spacing),
      ),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (showIcon) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = tagColors.icon,
        modifier = Modifier.padding(end = spacing.spacing02),
      )
    }
    BasicText(
      text = text,
      style = MehTheme.typography.label01.copy(color = tagColors.label),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      modifier = Modifier.weight(1f, fill = false),
    )
  }
}

@Composable
fun DismissibleTag(
  text: String,
  onClose: () -> Unit,
  modifier: Modifier = Modifier,
  type: TagType = TagType.Gray,
  size: TagSize = TagSize.Medium,
  enabled: Boolean = true,
  icon: ImageVector? = null,
  dismissLabel: String = "Dismiss",
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val active by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val hovered by interactionSource.collectIsHoveredAsState()

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val tagColors = resolveReadOnlyTagColors(
    type = type,
    colors = colors,
    enabled = enabled,
  )
  val closeButtonHoverBackground = resolveCloseButtonHoverColor(type = type, colors = colors)
  val closeButtonBackground = if (enabled && (hovered || active)) {
    closeButtonHoverBackground
  } else {
    Color.Transparent
  }
  val closeFocusColor = if (type == TagType.HighContrast) colors.focusInverse else colors.focus
  val showIcon = icon != null && size != TagSize.Small
  val labelEndGap = if (size == TagSize.Small) 5.dp else 2.dp
  val outlineInset = type == TagType.Outline

  Row(
    modifier =
    modifier
      .widthIn(min = TagMinWidth, max = TagMaxWidth)
      .height(size.dp)
      .clip(TagShape)
      .background(tagColors.container)
      .then(
        if (tagColors.border != Color.Transparent) {
          Modifier.border(width = 1.dp, color = tagColors.border, shape = TagShape)
        } else {
          Modifier
        },
      )
      .padding(
        start = resolveTagStartPadding(size = size, hasIcon = showIcon, spacing = spacing),
      ),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (showIcon) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = tagColors.icon,
        modifier = Modifier.padding(end = spacing.spacing02),
      )
    }
    BasicText(
      text = text,
      style = MehTheme.typography.label01.copy(color = tagColors.label),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      modifier = Modifier
        .weight(1f, fill = false)
        .padding(end = labelEndGap),
    )
    Box(
      modifier =
      Modifier
        .then(if (outlineInset) Modifier.padding(1.dp) else Modifier)
        .size(if (outlineInset) size.dp - 2.dp else size.dp)
        .clip(CircleShape)
        .background(closeButtonBackground)
        .then(
          if (focused && enabled) {
            Modifier.border(width = 1.dp, color = closeFocusColor, shape = CircleShape)
          } else {
            Modifier
          },
        )
        .semantics {
          contentDescription = dismissLabel
        }
        .clickable(
          enabled = enabled,
          onClick = onClose,
          role = Role.Button,
          interactionSource = interactionSource,
          indication = null,
        ),
      contentAlignment = Alignment.Center,
    ) {
      Icon(
        image = Icons.Close,
        size = IconSize.Small,
        tint = tagColors.icon,
      )
    }
  }
}

@Composable
fun SelectableTag(
  text: String,
  selected: Boolean,
  onSelectedChange: (Boolean) -> Unit,
  modifier: Modifier = Modifier,
  size: TagSize = TagSize.Medium,
  enabled: Boolean = true,
  icon: ImageVector? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val active by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val hovered by interactionSource.collectIsHoveredAsState()

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val tagColors = resolveSelectableTagColors(
    colors = colors,
    selected = selected,
    enabled = enabled,
    hovered = hovered,
    active = active,
  )
  val showIcon = icon != null && size != TagSize.Small

  Row(
    modifier =
    modifier
      .widthIn(min = TagMinWidth, max = TagMaxWidth)
      .height(size.dp)
      .then(
        if (focused && enabled) {
          Modifier.tagFocusOutline(colors.focus)
        } else {
          Modifier
        },
      )
      .clip(TagShape)
      .background(tagColors.container)
      .then(
        if (tagColors.border != Color.Transparent) {
          Modifier.border(width = 1.dp, color = tagColors.border, shape = TagShape)
        } else {
          Modifier
        },
      )
      .toggleable(
        value = selected,
        enabled = enabled,
        role = Role.Checkbox,
        interactionSource = interactionSource,
        indication = null,
        onValueChange = onSelectedChange,
      )
      .padding(
        start = resolveTagStartPadding(size = size, hasIcon = showIcon, spacing = spacing),
        end = resolveTagEndPadding(size = size, spacing = spacing),
      ),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (showIcon) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = tagColors.icon,
        modifier = Modifier.padding(end = spacing.spacing02),
      )
    }
    BasicText(
      text = text,
      style = MehTheme.typography.label01.copy(color = tagColors.label),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      modifier = Modifier.weight(1f, fill = false),
    )
  }
}

@Composable
fun OperationalTag(
  text: String,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  type: OperationalTagType = TagType.Gray,
  size: TagSize = TagSize.Medium,
  enabled: Boolean = true,
  icon: ImageVector? = null,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  val active by interactionSource.collectIsPressedAsState()
  val focused by interactionSource.collectIsFocusedAsState()
  val hovered by interactionSource.collectIsHoveredAsState()

  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val tagColors = resolveOperationalTagColors(
    type = type,
    colors = colors,
    enabled = enabled,
    hovered = hovered,
    active = active,
  )
  val showIcon = icon != null && size != TagSize.Small

  Row(
    modifier =
    modifier
      .widthIn(min = TagMinWidth, max = TagMaxWidth)
      .height(size.dp)
      .then(
        if (focused && enabled) {
          Modifier.tagFocusOutline(colors.focus)
        } else {
          Modifier
        },
      )
      .clip(TagShape)
      .background(tagColors.container)
      .then(
        if (tagColors.border != Color.Transparent) {
          Modifier.border(width = 1.dp, color = tagColors.border, shape = TagShape)
        } else {
          Modifier
        },
      )
      .clickable(
        enabled = enabled,
        onClick = onClick,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = null,
      )
      .padding(
        start = resolveTagStartPadding(size = size, hasIcon = showIcon, spacing = spacing),
        end = resolveTagEndPadding(size = size, spacing = spacing),
      ),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically,
  ) {
    if (showIcon) {
      Icon(
        image = icon,
        size = IconSize.Small,
        tint = tagColors.icon,
        modifier = Modifier.padding(end = spacing.spacing02),
      )
    }
    BasicText(
      text = text,
      style = MehTheme.typography.label01.copy(color = tagColors.label),
      maxLines = 1,
      overflow = TextOverflow.Ellipsis,
      modifier = Modifier.weight(1f, fill = false),
    )
  }
}

private fun Modifier.tagFocusOutline(color: Color): Modifier = drawBehind {
  val strokePx = 2.dp.toPx()
  val gapPx = 1.dp.toPx()
  val outset = gapPx + strokePx / 2f
  val radius = minOf(TagCornerRadius.toPx(), size.height / 2f) + outset
  drawRoundRect(
    color = color,
    topLeft = Offset(-outset, -outset),
    size = Size(size.width + outset * 2f, size.height + outset * 2f),
    cornerRadius = CornerRadius(radius, radius),
    style = Stroke(width = strokePx),
  )
}

@Immutable
private data class ResolvedTagColors(
  val label: Color,
  val icon: Color,
  val container: Color,
  val border: Color = Color.Transparent,
)

private fun resolveTagStartPadding(
  size: TagSize,
  hasIcon: Boolean,
  spacing: Spacing,
): Dp = when (size) {
  TagSize.Small -> spacing.spacing03
  TagSize.Medium -> if (hasIcon) spacing.spacing02 else spacing.spacing03
  TagSize.Large -> if (hasIcon) spacing.spacing03 else spacing.spacing04
}

private fun resolveTagEndPadding(
  size: TagSize,
  spacing: Spacing,
): Dp = when (size) {
  TagSize.Small, TagSize.Medium -> spacing.spacing03
  TagSize.Large -> spacing.spacing04
}

private fun resolvePaletteToken(
  type: OperationalTagType,
  colors: Colors,
): ColorPair = when (type) {
  TagType.Gray -> colors.tagGray
  TagType.CoolGray -> colors.tagCoolGray
  TagType.WarmGray -> colors.tagWarmGray
  TagType.Red -> colors.tagRed
  TagType.Magenta -> colors.tagMagenta
  TagType.Purple -> colors.tagPurple
  TagType.Blue -> colors.tagBlue
  TagType.Cyan -> colors.tagCyan
  TagType.Teal -> colors.tagTeal
  TagType.Green -> colors.tagGreen
}

private fun resolveReadOnlyTagColors(
  type: TagType,
  colors: Colors,
  enabled: Boolean,
): ResolvedTagColors {
  if (!enabled) {
    return ResolvedTagColors(
      label = colors.textDisabled,
      icon = colors.iconDisabled,
      container = colors.layer01,
      border = if (type == TagType.Outline) colors.borderDisabled else Color.Transparent,
    )
  }

  return when (type) {
    is OperationalTagType -> {
      val token = resolvePaletteToken(type = type, colors = colors)
      ResolvedTagColors(
        label = token.text,
        icon = token.text,
        container = token.background,
      )
    }

    TagType.HighContrast -> ResolvedTagColors(
      label = colors.textInverse,
      icon = colors.iconInverse,
      container = colors.backgroundInverse,
    )

    TagType.Outline -> ResolvedTagColors(
      label = colors.textPrimary,
      icon = colors.iconPrimary,
      container = colors.background,
      border = colors.backgroundInverse,
    )
  }
}

private fun resolveCloseButtonHoverColor(
  type: TagType,
  colors: Colors,
): Color = when (type) {
  is OperationalTagType -> resolvePaletteToken(type = type, colors = colors).hover
  TagType.HighContrast -> colors.backgroundInverseHover
  TagType.Outline -> colors.layerHover01
}

private fun resolveSelectableTagColors(
  colors: Colors,
  selected: Boolean,
  enabled: Boolean,
  hovered: Boolean,
  active: Boolean,
): ResolvedTagColors {
  if (!enabled) {
    return ResolvedTagColors(
      label = colors.textDisabled,
      icon = colors.iconDisabled,
      container = colors.layer01,
      border = colors.borderDisabled,
    )
  }

  if (selected) {
    return ResolvedTagColors(
      label = colors.textInverse,
      icon = colors.iconInverse,
      container = colors.layerSelectedInverse,
      border = colors.borderInverse,
    )
  }

  return ResolvedTagColors(
    label = colors.textPrimary,
    icon = colors.iconPrimary,
    container = if (hovered || active) colors.layerHover01 else colors.layer01,
    border = colors.borderInverse,
  )
}

private fun resolveOperationalTagColors(
  type: OperationalTagType,
  colors: Colors,
  enabled: Boolean,
  hovered: Boolean,
  active: Boolean,
): ResolvedTagColors {
  if (!enabled) {
    return ResolvedTagColors(
      label = colors.textDisabled,
      icon = colors.iconDisabled,
      container = colors.layer01,
      border = colors.borderDisabled,
    )
  }

  val token = resolvePaletteToken(type = type, colors = colors)
  return ResolvedTagColors(
    label = token.text,
    icon = token.text,
    container = if (hovered || active) token.hover else token.background,
    border = token.border,
  )
}
