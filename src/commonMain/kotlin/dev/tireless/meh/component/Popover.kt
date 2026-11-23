// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import dev.tireless.meh.theme.Colors
import dev.tireless.meh.theme.MehTheme
import kotlin.math.roundToInt

/**
 * Placement of a [Popover] relative to its trigger element, aligned with the Carbon Design System
 * v11 Popover specification.
 */
enum class PopoverAlign {
  Top,
  TopStart,
  TopEnd,
  Bottom,
  BottomStart,
  BottomEnd,
  Left,
  LeftTop,
  LeftBottom,
  Right,
  RightTop,
  RightBottom,
}

object PopoverDefaults {
  val MaxWidth: Dp = 352.dp
  val CornerRadius: Dp = 2.dp
  val CaretWidth: Dp = 12.dp
  val CaretHeight: Dp = 6.dp
  val CaretEdgeInset: Dp = 16.dp
  val Offset: Dp = 4.dp
  val ShadowElevation: Dp = 6.dp
}

private enum class CaretEdge {
  Top,
  Bottom,
  Left,
  Right,
}

private enum class CaretCrossAlign {
  Center,
  Start,
  End,
}

@Immutable
private data class ResolvedPopoverColors(
  val background: Color,
  val border: Color,
  val shadow: Color,
)

private fun resolvePopoverColors(
  colors: Colors,
  highContrast: Boolean,
): ResolvedPopoverColors = if (highContrast) {
  ResolvedPopoverColors(
    background = colors.backgroundInverse,
    border = colors.borderInverse,
    shadow = colors.shadow,
  )
} else {
  ResolvedPopoverColors(
    background = colors.layer01,
    border = colors.borderSubtle01,
    shadow = colors.shadow,
  )
}

private fun PopoverAlign.caretEdge(): CaretEdge = when (this) {
  PopoverAlign.Top, PopoverAlign.TopStart, PopoverAlign.TopEnd -> CaretEdge.Bottom
  PopoverAlign.Bottom, PopoverAlign.BottomStart, PopoverAlign.BottomEnd -> CaretEdge.Top
  PopoverAlign.Left, PopoverAlign.LeftTop, PopoverAlign.LeftBottom -> CaretEdge.Right
  PopoverAlign.Right, PopoverAlign.RightTop, PopoverAlign.RightBottom -> CaretEdge.Left
}

private fun PopoverAlign.caretCrossAlign(): CaretCrossAlign = when (this) {
  PopoverAlign.Top, PopoverAlign.Bottom, PopoverAlign.Left, PopoverAlign.Right ->
    CaretCrossAlign.Center

  PopoverAlign.TopStart, PopoverAlign.BottomStart, PopoverAlign.LeftTop, PopoverAlign.RightTop ->
    CaretCrossAlign.Start

  PopoverAlign.TopEnd, PopoverAlign.BottomEnd, PopoverAlign.LeftBottom, PopoverAlign.RightBottom ->
    CaretCrossAlign.End
}

internal fun PopoverAlign.flipped(): PopoverAlign = when (this) {
  PopoverAlign.Top -> PopoverAlign.Bottom
  PopoverAlign.TopStart -> PopoverAlign.BottomStart
  PopoverAlign.TopEnd -> PopoverAlign.BottomEnd
  PopoverAlign.Bottom -> PopoverAlign.Top
  PopoverAlign.BottomStart -> PopoverAlign.TopStart
  PopoverAlign.BottomEnd -> PopoverAlign.TopEnd
  PopoverAlign.Left -> PopoverAlign.Right
  PopoverAlign.LeftTop -> PopoverAlign.RightTop
  PopoverAlign.LeftBottom -> PopoverAlign.RightBottom
  PopoverAlign.Right -> PopoverAlign.Left
  PopoverAlign.RightTop -> PopoverAlign.LeftTop
  PopoverAlign.RightBottom -> PopoverAlign.LeftBottom
}

private class PopoverShape(
  private val align: PopoverAlign,
  private val showCaret: Boolean,
  private val cornerRadius: Dp,
  private val caretWidth: Dp,
  private val caretHeight: Dp,
  private val caretEdgeInset: Dp,
) : Shape {
  override fun createOutline(
    size: Size,
    layoutDirection: LayoutDirection,
    density: Density,
  ): Outline = with(density) {
    val radius = cornerRadius.toPx().coerceAtMost(minOf(size.width, size.height) / 2f)
    val cHeight = if (showCaret) caretHeight.toPx() else 0f
    val halfBase = if (showCaret) caretWidth.toPx() / 2f else 0f
    val edgeInset = caretEdgeInset.toPx()
    val edge = if (showCaret) align.caretEdge() else null

    val bodyLeft = if (edge == CaretEdge.Left) cHeight else 0f
    val bodyTop = if (edge == CaretEdge.Top) cHeight else 0f
    val bodyRight = if (edge == CaretEdge.Right) size.width - cHeight else size.width
    val bodyBottom = if (edge == CaretEdge.Bottom) size.height - cHeight else size.height

    val bodyWidth = (bodyRight - bodyLeft).coerceAtLeast(0f)
    val bodyHeight = (bodyBottom - bodyTop).coerceAtLeast(0f)
    val r = radius.coerceAtMost(minOf(bodyWidth, bodyHeight) / 2f)

    val horizontalCenter =
      if (edge == CaretEdge.Top || edge == CaretEdge.Bottom) {
        val minX = bodyLeft + r + halfBase
        val maxX = bodyRight - r - halfBase
        if (minX > maxX) {
          bodyLeft + bodyWidth / 2f
        } else {
          val raw =
            when (align.caretCrossAlign()) {
              CaretCrossAlign.Center -> bodyLeft + bodyWidth / 2f

              CaretCrossAlign.Start ->
                if (layoutDirection == LayoutDirection.Ltr) {
                  bodyLeft + edgeInset
                } else {
                  bodyRight - edgeInset
                }

              CaretCrossAlign.End ->
                if (layoutDirection == LayoutDirection.Ltr) {
                  bodyRight - edgeInset
                } else {
                  bodyLeft + edgeInset
                }
            }
          raw.coerceIn(minX, maxX)
        }
      } else {
        0f
      }

    val verticalCenter =
      if (edge == CaretEdge.Left || edge == CaretEdge.Right) {
        val minY = bodyTop + r + halfBase
        val maxY = bodyBottom - r - halfBase
        if (minY > maxY) {
          bodyTop + bodyHeight / 2f
        } else {
          val raw =
            when (align.caretCrossAlign()) {
              CaretCrossAlign.Center -> bodyTop + bodyHeight / 2f
              CaretCrossAlign.Start -> bodyTop + edgeInset
              CaretCrossAlign.End -> bodyBottom - edgeInset
            }
          raw.coerceIn(minY, maxY)
        }
      } else {
        0f
      }

    val path =
      Path().apply {
        moveTo(bodyLeft + r, bodyTop)

        // Top edge
        if (edge == CaretEdge.Top && bodyWidth >= 2f * (r + halfBase)) {
          lineTo(horizontalCenter - halfBase, bodyTop)
          lineTo(horizontalCenter, 0f)
          lineTo(horizontalCenter + halfBase, bodyTop)
        }
        lineTo(bodyRight - r, bodyTop)
        if (r > 0f) {
          quadraticTo(bodyRight, bodyTop, bodyRight, bodyTop + r)
        }

        // Right edge
        if (edge == CaretEdge.Right && bodyHeight >= 2f * (r + halfBase)) {
          lineTo(bodyRight, verticalCenter - halfBase)
          lineTo(size.width, verticalCenter)
          lineTo(bodyRight, verticalCenter + halfBase)
        }
        lineTo(bodyRight, bodyBottom - r)
        if (r > 0f) {
          quadraticTo(bodyRight, bodyBottom, bodyRight - r, bodyBottom)
        }

        // Bottom edge
        if (edge == CaretEdge.Bottom && bodyWidth >= 2f * (r + halfBase)) {
          lineTo(horizontalCenter + halfBase, bodyBottom)
          lineTo(horizontalCenter, size.height)
          lineTo(horizontalCenter - halfBase, bodyBottom)
        }
        lineTo(bodyLeft + r, bodyBottom)
        if (r > 0f) {
          quadraticTo(bodyLeft, bodyBottom, bodyLeft, bodyBottom - r)
        }

        // Left edge
        if (edge == CaretEdge.Left && bodyHeight >= 2f * (r + halfBase)) {
          lineTo(bodyLeft, verticalCenter + halfBase)
          lineTo(0f, verticalCenter)
          lineTo(bodyLeft, verticalCenter - halfBase)
        }
        lineTo(bodyLeft, bodyTop + r)
        if (r > 0f) {
          quadraticTo(bodyLeft, bodyTop, bodyLeft + r, bodyTop)
        }

        close()
      }

    Outline.Generic(path)
  }
}

internal class PopoverPositionProvider(
  private val align: PopoverAlign,
  private val offsetPx: Int,
  private val autoAlign: Boolean,
  private val onResolvedAlign: (PopoverAlign) -> Unit = {},
) : PopupPositionProvider {
  override fun calculatePosition(
    anchorBounds: IntRect,
    windowSize: IntSize,
    layoutDirection: LayoutDirection,
    popupContentSize: IntSize,
  ): IntOffset {
    var effectiveAlign = align
    var position = rawPosition(effectiveAlign, anchorBounds, layoutDirection, popupContentSize)

    if (autoAlign) {
      val overflowsPrimary =
        when (effectiveAlign.caretEdge()) {
          CaretEdge.Bottom -> position.y < 0
          CaretEdge.Top -> position.y + popupContentSize.height > windowSize.height
          CaretEdge.Right -> position.x < 0
          CaretEdge.Left -> position.x + popupContentSize.width > windowSize.width
        }

      if (overflowsPrimary) {
        val flippedAlign = effectiveAlign.flipped()
        val flippedPosition =
          rawPosition(flippedAlign, anchorBounds, layoutDirection, popupContentSize)
        val flippedOverflows =
          when (flippedAlign.caretEdge()) {
            CaretEdge.Bottom -> flippedPosition.y < 0
            CaretEdge.Top -> flippedPosition.y + popupContentSize.height > windowSize.height
            CaretEdge.Right -> flippedPosition.x < 0
            CaretEdge.Left -> flippedPosition.x + popupContentSize.width > windowSize.width
          }
        if (!flippedOverflows) {
          effectiveAlign = flippedAlign
          position = flippedPosition
        }
      }

      val maxX = (windowSize.width - popupContentSize.width).coerceAtLeast(0)
      val maxY = (windowSize.height - popupContentSize.height).coerceAtLeast(0)
      position = IntOffset(
        x = position.x.coerceIn(0, maxX),
        y = position.y.coerceIn(0, maxY),
      )
    }

    onResolvedAlign(effectiveAlign)
    return position
  }

  private fun rawPosition(
    targetAlign: PopoverAlign,
    anchorBounds: IntRect,
    layoutDirection: LayoutDirection,
    popupSize: IntSize,
  ): IntOffset {
    val isLtr = layoutDirection == LayoutDirection.Ltr

    val x =
      when (targetAlign) {
        PopoverAlign.Top, PopoverAlign.Bottom ->
          anchorBounds.left + (anchorBounds.width - popupSize.width) / 2

        PopoverAlign.TopStart, PopoverAlign.BottomStart ->
          if (isLtr) anchorBounds.left else anchorBounds.right - popupSize.width

        PopoverAlign.TopEnd, PopoverAlign.BottomEnd ->
          if (isLtr) anchorBounds.right - popupSize.width else anchorBounds.left

        PopoverAlign.Left, PopoverAlign.LeftTop, PopoverAlign.LeftBottom ->
          anchorBounds.left - popupSize.width - offsetPx

        PopoverAlign.Right, PopoverAlign.RightTop, PopoverAlign.RightBottom ->
          anchorBounds.right + offsetPx
      }

    val y =
      when (targetAlign) {
        PopoverAlign.Top, PopoverAlign.TopStart, PopoverAlign.TopEnd ->
          anchorBounds.top - popupSize.height - offsetPx

        PopoverAlign.Bottom, PopoverAlign.BottomStart, PopoverAlign.BottomEnd ->
          anchorBounds.bottom + offsetPx

        PopoverAlign.Left, PopoverAlign.Right ->
          anchorBounds.top + (anchorBounds.height - popupSize.height) / 2

        PopoverAlign.LeftTop, PopoverAlign.RightTop ->
          anchorBounds.top

        PopoverAlign.LeftBottom, PopoverAlign.RightBottom ->
          anchorBounds.bottom - popupSize.height
      }

    return IntOffset(x, y)
  }
}

/**
 * The styled Carbon v11 Popover container surface, including optional directional caret tip,
 * drop shadow, high-contrast inverse colors, border, and tab-tip sharp corners.
 */
@Composable
fun PopoverSurface(
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Bottom,
  caret: Boolean = true,
  dropShadow: Boolean = true,
  highContrast: Boolean = false,
  border: Boolean = false,
  tabTip: Boolean = false,
  contentPadding: PaddingValues = PaddingValues(MehTheme.spacing.spacing05),
  maxWidth: Dp = PopoverDefaults.MaxWidth,
  content: @Composable () -> Unit,
) {
  val colors = resolvePopoverColors(MehTheme.colors, highContrast)
  val showCaret = caret && !tabTip
  val cornerRadius = if (tabTip) 0.dp else PopoverDefaults.CornerRadius
  val caretHeight = PopoverDefaults.CaretHeight
  val shape =
    remember(align, showCaret, cornerRadius) {
      PopoverShape(
        align = align,
        showCaret = showCaret,
        cornerRadius = cornerRadius,
        caretWidth = PopoverDefaults.CaretWidth,
        caretHeight = caretHeight,
        caretEdgeInset = PopoverDefaults.CaretEdgeInset,
      )
    }

  val caretEdge = if (showCaret) align.caretEdge() else null
  val caretPadding =
    when (caretEdge) {
      CaretEdge.Top -> PaddingValues(top = caretHeight)
      CaretEdge.Bottom -> PaddingValues(bottom = caretHeight)
      CaretEdge.Left -> PaddingValues.Absolute(left = caretHeight)
      CaretEdge.Right -> PaddingValues.Absolute(right = caretHeight)
      null -> PaddingValues(0.dp)
    }

  Box(
    modifier = modifier
      .then(if (maxWidth.isSpecified) Modifier.widthIn(max = maxWidth) else Modifier)
      .then(
        if (dropShadow) {
          Modifier.shadow(
            elevation = PopoverDefaults.ShadowElevation,
            shape = shape,
            clip = false,
            ambientColor = colors.shadow,
            spotColor = colors.shadow,
          )
        } else {
          Modifier
        },
      )
      .background(color = colors.background, shape = shape)
      .then(
        if (border) {
          Modifier.border(width = 1.dp, color = colors.border, shape = shape)
        } else {
          Modifier
        },
      )
      .padding(caretPadding)
      .padding(contentPadding),
  ) {
    content()
  }
}

/**
 * Carbon Design System v11 Popover anchored to a [trigger] composable.
 *
 * Renders [trigger] in place and displays [content] in a floating [Popup] positioned according to
 * [align] (and optionally flipped/clamped when [autoAlign] is enabled).
 */
@Composable
fun Popover(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  trigger: @Composable () -> Unit,
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Bottom,
  autoAlign: Boolean = false,
  caret: Boolean = true,
  dropShadow: Boolean = true,
  highContrast: Boolean = false,
  border: Boolean = false,
  tabTip: Boolean = false,
  contentPadding: PaddingValues = PaddingValues(MehTheme.spacing.spacing05),
  maxWidth: Dp = PopoverDefaults.MaxWidth,
  properties: PopupProperties = PopupProperties(focusable = true),
  content: @Composable () -> Unit,
) {
  val colors = resolvePopoverColors(MehTheme.colors, highContrast)
  val density = LocalDensity.current
  val offsetPx =
    remember(tabTip, density) {
      if (tabTip) 0 else with(density) { PopoverDefaults.Offset.toPx().roundToInt() }
    }
  var resolvedAlign by remember(align) { mutableStateOf(align) }

  val positionProvider =
    remember(align, offsetPx, autoAlign) {
      PopoverPositionProvider(
        align = align,
        offsetPx = offsetPx,
        autoAlign = autoAlign,
        onResolvedAlign = { resolvedAlign = it },
      )
    }

  Box(modifier = modifier) {
    Box(
      modifier =
      if (tabTip && expanded) {
        Modifier
          .background(colors.background)
          .then(
            if (border) {
              Modifier.border(width = 1.dp, color = colors.border)
            } else {
              Modifier
            },
          )
      } else {
        Modifier
      },
    ) {
      trigger()
    }

    if (expanded) {
      Popup(
        popupPositionProvider = positionProvider,
        onDismissRequest = onDismissRequest,
        properties = properties,
      ) {
        PopoverSurface(
          align = resolvedAlign,
          caret = caret,
          dropShadow = dropShadow,
          highContrast = highContrast,
          border = border,
          tabTip = tabTip,
          contentPadding = contentPadding,
          maxWidth = maxWidth,
          content = content,
        )
      }
    }
  }
}

/**
 * Floating [Popover] without an inline trigger wrapper, anchored to the parent container bounds.
 */
@Composable
fun Popover(
  expanded: Boolean,
  onDismissRequest: () -> Unit,
  modifier: Modifier = Modifier,
  align: PopoverAlign = PopoverAlign.Bottom,
  autoAlign: Boolean = false,
  caret: Boolean = false,
  dropShadow: Boolean = true,
  highContrast: Boolean = false,
  border: Boolean = false,
  tabTip: Boolean = false,
  contentPadding: PaddingValues = PaddingValues(MehTheme.spacing.spacing05),
  maxWidth: Dp = PopoverDefaults.MaxWidth,
  properties: PopupProperties = PopupProperties(focusable = true),
  content: @Composable () -> Unit,
) {
  if (!expanded) return

  val density = LocalDensity.current
  val offsetPx =
    remember(tabTip, density) {
      if (tabTip) 0 else with(density) { PopoverDefaults.Offset.toPx().roundToInt() }
    }
  var resolvedAlign by remember(align) { mutableStateOf(align) }

  val positionProvider =
    remember(align, offsetPx, autoAlign) {
      PopoverPositionProvider(
        align = align,
        offsetPx = offsetPx,
        autoAlign = autoAlign,
        onResolvedAlign = { resolvedAlign = it },
      )
    }

  Popup(
    popupPositionProvider = positionProvider,
    onDismissRequest = onDismissRequest,
    properties = properties,
  ) {
    PopoverSurface(
      modifier = modifier,
      align = resolvedAlign,
      caret = caret,
      dropShadow = dropShadow,
      highContrast = highContrast,
      border = border,
      tabTip = tabTip,
      contentPadding = contentPadding,
      maxWidth = maxWidth,
      content = content,
    )
  }
}
